package com.example.demo.ProjectOla.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProjectOla.Entity.LoginEntity;
import com.example.demo.ProjectOla.Service.LoginService;

@RestController
public class ControllerLogin 
{
	@Autowired
	private LoginService ls;
	@GetMapping("/getlogindata")
	public List<LoginEntity> getLoginData()
	{
		return ls.getloginData();
	}
	@PostMapping("/savelogindata")
	public void saveDetails(@RequestBody LoginEntity le)
	{
		ls.saveloginData(le);
	}
}
