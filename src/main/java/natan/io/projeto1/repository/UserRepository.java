package natan.io.projeto1.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import natan.io.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {

	@Query("{ 'email' : ?0 }")
	User findByEmailQualquerCoisa(String email);
	
	User findByNameIgnoreCaseLike(String name);
	
	
}
