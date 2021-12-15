package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
