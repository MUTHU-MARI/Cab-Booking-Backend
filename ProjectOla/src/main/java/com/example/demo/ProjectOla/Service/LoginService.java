package com.example.demo.ProjectOla.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProjectOla.Entity.LoginEntity;
import com.example.demo.ProjectOla.RepoInt.LoginRepoInt;
@Service
public class LoginService implements LoginServiceInt{
    @Autowired
    private LoginRepoInt lri;
    
	public List<LoginEntity> getloginData() {
		return lri.findAll();
	}

	public void saveloginData(LoginEntity le) {
		lri.save(le);
		
	}
    
}
