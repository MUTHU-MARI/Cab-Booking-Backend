package com.example.demo.ProjectOla.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProjectOla.Entity.ForgotpassEntity;
import com.example.demo.ProjectOla.RepoInt.ForgotpassRepoInt;
@Service
public class ForgotpassService implements ForgotpassServiceInt{
     @Autowired
     private ForgotpassRepoInt fpri;
	public void saveforgotpassData(ForgotpassEntity fe) {
		    fpri.save(fe);
		
	}
	public List<ForgotpassEntity> getforgotpassData() {
		
		return fpri.findAll();
	}

}
