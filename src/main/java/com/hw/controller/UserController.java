package com.hw.controller;

import java.util.*;

import com.hw.Dao.SysUserRepository;
import com.hw.Dao.UserRepository;
import com.hw.domain.*;
import com.hw.utils.MD5Util;
import com.hw.utils.ResultMsg;
import com.hw.utils.ResultStatusCode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;


@RestController
@RequestMapping("/api/user")
@ApiIgnore
public class UserController {
Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepositoy;
	@RequestMapping(value="getuser", method=RequestMethod.GET)
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
	public Object getUser(String name)
	{
		Optional<User> userEntity = userRepositoy.findByUsername(name);
		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);
		return resultMsg;
	}

	/***
     * 获取所有用户列表
     * @return
     */
    @RequestMapping(value="getalluser", method=RequestMethod.GET)
    public Object getUserList()
    {
        List<User> userEntities = (List<User>) userRepositoy.findAll();
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntities);
        return resultMsg;
    }
	@Modifying
	@RequestMapping(value="adduser", method=RequestMethod.POST)
    @ApiOperation(value="创建用户", notes="根据UserInfo对象创建用户", httpMethod = "POST")
	public @ResponseBody ResultMsg addUser(@RequestBody UserInfo userInfo)
	{
		ResultMsg resultMsg = null;
		User fuser = userRepositoy.findFirstByUsername(userInfo.getUsername());
		if (fuser != null)
		{
			resultMsg = new ResultMsg(4, "用户名已存在!",null);
		}else{
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(userInfo.getPassword());
			List<UserRole> Roles = new ArrayList<UserRole>();
			UserRole userRole = new UserRole();
			userRole.setRole(Role.BANKPAY);
			Roles.add(userRole);
			User user =new User();
			user.setUsername(userInfo.getUsername());
			user.setPassword(hashedPassword);
			user.setCreatedate(new Date());
			user.setRoles(Roles);
			try{
				userRepositoy.save(user);
				resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(),null);

			}
			catch (Exception e){
				resultMsg = new ResultMsg(4, e.getMessage(),null);
			}
		}
		return resultMsg;
	}

	@Modifying
	@RequestMapping(value="updateuser", method=RequestMethod.PUT)
	@ApiOperation(value="更新用户", notes="根据UserInfo对象创建用户", httpMethod = "PUT")
	public @ResponseBody ResultMsg updateUser(@RequestBody UserInfo userInfo)
	{
		ResultMsg resultMsg =null;
		User user = userRepositoy.findFirstByUsername(userInfo.getUsername());
		if (user != null)
		{
			//String md5Password = MD5Util.encode(userInfo.getPassword());
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(userInfo.getPassword());
			user.setPassword(hashedPassword);
			user.setCreatedate(new Date());
			userRepositoy.save(user);
			resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);

		}else{
			resultMsg = new ResultMsg(4, "用户名不存在", null);

		}
		return resultMsg;
	}

	@Modifying
	@RequestMapping(value="deleteuserbyname", method=RequestMethod.DELETE)
	@ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
	public  @ResponseBody ResultMsg deleteUserByName(String name)
	{
		ResultMsg resultMsg =null;
		User user = userRepositoy.findByUsername(name).get();
		if(user!=null) {
			userRepositoy.delete(user.getId());
			resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);

		}else{
			resultMsg = new ResultMsg(4, "用户名不存在", null);

		}
		return resultMsg;
	}
}

