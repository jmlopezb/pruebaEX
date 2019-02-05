package es.fesac.blog.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import es.fesac.blog.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(
			value="SELECT * FROM USER WHERE email = : email AND password = MD5(:password)",
			nativeQuery=true
			)
			public User getByEmailAndPassword(String email, String password);  
}
