package com.example.demo.ProjectOla.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProjectOla.Entity.BookingEntity;
import com.example.demo.ProjectOla.Service.BookingService;

@RestController

public class ControllerBooking {
       @Autowired
       private BookingService bs;
       @PutMapping("/updatebooking")
       public void updateDetails (@RequestBody BookingEntity be,@RequestParam int id)
       {
    	   be.setId(id);
    	   bs.updatebookingData(be);
       }
       @DeleteMapping("/deletebookingdata")
       public void deletebookingDetails(@RequestParam int id)
       {
       	bs.deletebookingData(id);
       }
       @GetMapping("/getbookingdata")
   	public List<BookingEntity> getbookingData()
   	{
   		return bs.getbookingData();
   	}
       @PostMapping("/savebookingdata")
       public void saveDetails(@RequestBody BookingEntity be)
       {
       	bs.savebookingData(be);
       }
}
