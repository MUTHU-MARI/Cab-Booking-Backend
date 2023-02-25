package com.example.demo.ProjectOla.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProjectOla.Entity.ForgotpassEntity;
import com.example.demo.ProjectOla.Service.ForgotpassService;

@RestController

public class ControllerForgotpass
{
    @Autowired
    private ForgotpassService fps;
    @GetMapping("/getforgotpassData")
	public List<ForgotpassEntity> getforgotpassData()
	{
		return fps.getforgotpassData();
	}
    @PostMapping("/saveforgotpass")
    public void saveDetails(@RequestBody ForgotpassEntity fe)
    {
    	fps.saveforgotpassData(fe);
    }
}
