package com.example.demo.ProjectOla.RepoInt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ProjectOla.Entity.BookingEntity;

@Repository
public interface BookingRepoInt extends JpaRepository<BookingEntity,Integer>{

}
