package th.in.gamer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import th.in.gamer.beans.User;
import th.in.gamer.user.response.UserStatusResponse;
import th.in.gamer.user.services.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/user/{id}" , method = RequestMethod.GET)
	public User findById(@PathVariable("id") int id){
		return userService.findById(id);
	}
	
	@RequestMapping(value="/user/delete/{id}", method = RequestMethod.DELETE)
	public UserStatusResponse deleteById(@PathVariable("id") int id){
		boolean isDelete = userService.deleteById(id);
		UserStatusResponse response = new UserStatusResponse();
		response.setStatus(isDelete);
		response.setActionType("delete");
		return response;
	}
	
	@RequestMapping(value = "/user/add/", method = RequestMethod.POST)
	public UserStatusResponse addUser(@RequestBody User user){
		boolean isSave = userService.saveUser(user);
		UserStatusResponse response = new UserStatusResponse();
		response.setStatus(isSave);
		response.setActionType("created");
		return response;
	}
	
	@RequestMapping(value = "/user/update/", method = RequestMethod.PUT)
	public UserStatusResponse updateUser(@RequestBody User user){
		boolean isSave = userService.saveUser(user);
		UserStatusResponse response = new UserStatusResponse();
		response.setStatus(isSave);
		response.setActionType("updated");
		return response;
	}
	
}
