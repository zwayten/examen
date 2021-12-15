package tn.esprit.esponline.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.UserRepository;
import tn.esprit.esponline.entities.User;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepo.findAll();
		return users;
	}

	@Override
	public User addUser(User u) {
		return userRepo.save(u);
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);

	}

	@Override
	public User updateUser(User u) {
		return userRepo.save(u);
	}

	@Override
	public User retrieveUser(Long id) {
		return userRepo.findById(id).get();
	}

}
