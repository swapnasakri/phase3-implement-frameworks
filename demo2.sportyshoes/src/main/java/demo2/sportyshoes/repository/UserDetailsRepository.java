package demo2.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo2.sportyshoes.entity.UserDetails;



@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	

	public List<UserDetails> findByusername(String username);
}