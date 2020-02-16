package com.rogowski.musicapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogowski.musicapi.model.ERole;
import com.rogowski.musicapi.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{
	Optional<Role> findByName(ERole name); 
}
