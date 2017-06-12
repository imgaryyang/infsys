package com.hw.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


//@RestController
//@RequestMapping("user")

public class UserController {
	//Logger logger = Logger.getLogger(UserController.class);
//	@Autowired
//	private UserDao userRepositoy;
//	
//	@RequestMapping(value="getuser", method=RequestMethod.GET)
//    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
//	public Object getUser(int id)
//	{
//		UserInfo userEntity = userRepositoy.findUserInfoById(id);
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);
//		return resultMsg;
//	}
//	
//	@RequestMapping("getusers")
//	@ApiOperation(value="获取用户列表", notes="")
//    @ApiImplicitParam(name = "role", value = "用户role", required = true, dataType = "String")
//	public Object getUsers(String role)
//	{
//		List<UserInfo> userEntities = userRepositoy.findUserInfoByRole(role);
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntities);
//		return resultMsg;
//	}
//	/*** 
//     * 获取所有用户列表 
//     * @return 
//     */  
//    @RequestMapping(value="getalluser", method=RequestMethod.GET)   
//    public Object getUserList()  
//    {  
//        List<UserInfo> userEntities = (List<UserInfo>) userRepositoy.findAll();  
//        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntities);    
//        return resultMsg;  
//    }
//	@Modifying
//	@RequestMapping(value="adduser", method=RequestMethod.POST)
//    @ApiOperation(value="创建用户", notes="根据UserInfo对象创建用户")
//    @ApiImplicitParam(name = "userEntity", value = "用户详细实体UserInfo", required = true, dataType = "UserInfo")
//	public Object addUser(@RequestBody UserInfo userEntity)
//	{
//		userRepositoy.save(userEntity);
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), userEntity);
//		return resultMsg;
//	}
//	
//	@Modifying
//	@RequestMapping(value="updateuser", method=RequestMethod.PUT)
//	public Object updateUser(@RequestBody UserInfo userEntity)
//	{
//		UserInfo user = userRepositoy.findUserInfoById(userEntity.getId());
//		if (user != null)
//		{
//			user.setName(userEntity.getName());
//			userRepositoy.save(user);
//		}
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);
//		return resultMsg;
//	}
//	
//	@Modifying
//	@RequestMapping(value="deleteuser", method=RequestMethod.DELETE)   
//	public Object deleteUser(int id)
//	{
//		userRepositoy.delete(id);
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);
//		return resultMsg;
//	}
//	
//	@Modifying
//	@RequestMapping(value="deleteuserbyname", method=RequestMethod.DELETE)   
//	public Object deleteUserByName(String name)
//	{
//		UserInfo user = userRepositoy.findUserInfoByName(name);
//		userRepositoy.delete(user.getId());
//		ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), null);
//		return resultMsg;
//	}
}

