package com.hw.controller;

import com.hw.Dao.SysUserRepository;
import com.hw.domain.SysUser;
import com.hw.utils.MD5Util;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hw.domain.Audience;
import com.hw.jwt.AccessToken;
import com.hw.jwt.JwtHelper;
import com.hw.jwt.LoginPara;
import com.hw.utils.ResultMsg;
import com.hw.utils.ResultStatusCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;


@RestController
@ApiIgnore
@Api("WebToken相关api")
public class JsonWebToken {  
	Logger logger = Logger.getLogger(JsonWebToken.class);
	
    @Autowired  
    private SysUserRepository userRepositoy;
      
    @Autowired  
    private Audience audienceEntity;  
    /*http://localhost:8080/oauth/token
     * {"clientId":"098f6bcd4621d373cade4e832627b4f6",
	*	"userName":"pandehua",
	*	"password":"pandehua"
	*	}
	*	使用 Authorization =  token_type access_token  
     * */

    @ApiResponses({
             @ApiResponse(code=400,message="请求参数没填好"),
             @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
         })
    @RequestMapping(value ="oauth/token",method = RequestMethod.POST)
    @ApiOperation(notes="获取Token", value = "获取Token",httpMethod= "POST")
    public @ResponseBody ResultMsg getAccessToken(@ApiParam(required = true, value = "登录信息")@RequestBody LoginPara loginPara)  
    {  
    	
        ResultMsg resultMsg;  
        try  
        {  
            if(loginPara.getClientId() == null   
                    || (loginPara.getClientId().compareTo(audienceEntity.getClientId()) != 0))  
            {  
                resultMsg = new ResultMsg(ResultStatusCode.INVALID_CLIENTID.getErrcode(),   
                        ResultStatusCode.INVALID_CLIENTID.getErrmsg(), null);  
                return resultMsg;  
            }  
              
              
              
            //验证用户名密码  
            SysUser user = userRepositoy.findByUsername(loginPara.getUserName());
            if (user == null)  
            {  
                resultMsg = new ResultMsg(ResultStatusCode.INVALID_PASSWORD.getErrcode(),
                        ResultStatusCode.INVALID_PASSWORD.getErrmsg(), null);  
                return resultMsg;  
            }  
            else  
            {  
               // String md5Password = MyUtils.getMD5(loginPara.getPassword()+user.getSalt());
                String md5Password =MD5Util.encode(loginPara.getPassword());
                logger.info(md5Password);
                if (md5Password.compareTo(user.getPassword()) != 0)  
                {  
                    resultMsg = new ResultMsg(ResultStatusCode.INVALID_PASSWORD.getErrcode(),  
                            ResultStatusCode.INVALID_PASSWORD.getErrmsg(), null);  
                    return resultMsg;  
                }  
            }  
              
            //拼装accessToken  
            String accessToken = JwtHelper.createJWT(loginPara.getUserName(), String.valueOf(user.getUsername()),
                    audienceEntity.getClientId(), audienceEntity.getName(),
                    audienceEntity.getExpiresSecond() * 1000, audienceEntity.getBase64Secret());  
              
            //返回accessToken  
            AccessToken accessTokenEntity = new AccessToken();  
            accessTokenEntity.setAccess_token(accessToken);  
            accessTokenEntity.setExpires_in(audienceEntity.getExpiresSecond());  
            accessTokenEntity.setToken_type("bearer");  
            resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(),   
                    ResultStatusCode.OK.getErrmsg(), accessTokenEntity);  
            return resultMsg;  
              
        }  
        catch(Exception ex)  
        {  
            resultMsg = new ResultMsg(ResultStatusCode.SYSTEM_ERR.getErrcode(),   
                    ResultStatusCode.SYSTEM_ERR.getErrmsg(), ex.getMessage());  
            return resultMsg;  
        }  
    }  
}  
