package tn.esprit.esponline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.esponline.Service.IUserService;
import tn.esprit.esponline.entities.User;

@Api(tags = "User Management")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@ApiOperation(value = "Fetch All users")
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
	List<User> listUsers = userService.retrieveAllUsers();
	return listUsers;
	}
	
	@ApiOperation(value = "Fetch a user by id")
	@GetMapping("/retrieve-user/{id}")
	@ResponseBody
	public User retrieveUser(@PathVariable("id") Long userId) {
	return userService.retrieveUser(userId);
	}
	
	
	@ApiOperation(value = "Adding user")
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User c)
	{
	User user = userService.addUser(c);
	return user;
	}
	
	@ApiOperation(value = "Deleting one user by id")
	@DeleteMapping("/remove-user/{id}")
	@ResponseBody
	public void removeUser(@PathVariable("id") Long userId) {
	userService.deleteUser(userId);
	}
	
	@ApiOperation(value = "updating user")
	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
	return userService.updateUser(user);
	}

}
