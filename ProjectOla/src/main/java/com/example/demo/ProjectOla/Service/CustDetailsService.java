package com.example.demo.ProjectOla.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProjectOla.Entity.CustDetailsEntity;
import com.example.demo.ProjectOla.RepoInt.CustDetailsRepoInt;
@Service
public class CustDetailsService implements CustDetailsServiceInt{
	@Autowired
    private CustDetailsRepoInt cdri;
	public void deletecustData(int id) {
		cdri.deleteById(id);
		
	}
	public List<CustDetailsEntity> getcustData() {
		return cdri.findAll();
	}
	public void savecustData(CustDetailsEntity cde) {
		cdri.save(cde);
		
	}

}
