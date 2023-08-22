package com.example.repository;

import java.util.List;
import java.util.Optional;

import com.example.model.User;
import com.example.model.UserPass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer>
{

	Optional<User> findByEmailAndPassword(String email, String password);
	List<User> findByRole(String role);
	Optional<User> findByUserIdAndRole(Long userId,String role);
	
	@Modifying
	@Query(value="UPDATE user SET filename=:filename WHERE user_id=:userId", nativeQuery=true)
	int documentName(@Param("userId") int userId, 	@Param("filename") String str);
	
	@Modifying
	@Query(value="Select * from user where (type_verified=false and (role='USER' or role='User'))", nativeQuery=true)
    List<User> getAllPending();
	
}