package com.example.demo.ProjectOla.RepoInt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ProjectOla.Entity.ForgotpassEntity;

@Repository
public interface ForgotpassRepoInt extends JpaRepository<ForgotpassEntity,Integer>{

}
