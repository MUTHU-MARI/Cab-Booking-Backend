package com.example.demo.ProjectOla.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProjectOla.Entity.CustDetailsEntity;
import com.example.demo.ProjectOla.Service.CustDetailsService;

@RestController

public class ControllerCustDetails {
    @Autowired
    private CustDetailsService cds;
    @DeleteMapping("/deletecustdata")
    public void deletecustDetails(@RequestParam int id)
    {
    	cds.deletecustData(id);
    }
    @GetMapping("/getcustdata")
	public List<CustDetailsEntity> getcustData()
	{
		return cds.getcustData();
	}
    @PostMapping("/savecustdata")
    public void saveDetails(@RequestBody CustDetailsEntity cde)
    {
    	cds.savecustData(cde);
    }
}
