package tn.esprit.esponline.Service;

import java.util.List;

import tn.esprit.esponline.entities.User;



public interface IUserService {
	
	List<User> retrieveAllUsers();
	User addUser(User u);
	void deleteUser(Long id);
	User updateUser(User u);
	User retrieveUser(Long id);

}
