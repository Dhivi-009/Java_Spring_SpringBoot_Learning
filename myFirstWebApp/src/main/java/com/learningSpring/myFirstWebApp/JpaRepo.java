package com.learningSpring.myFirstWebApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepo extends JpaRepository<Users, Long>{

	
}
