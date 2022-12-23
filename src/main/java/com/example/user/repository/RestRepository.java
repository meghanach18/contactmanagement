package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.Rest;
@Repository
public interface RestRepository extends JpaRepository<Rest,String>{

}
