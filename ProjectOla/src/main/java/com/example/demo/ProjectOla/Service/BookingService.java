package com.example.demo.ProjectOla.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProjectOla.Entity.BookingEntity;
import com.example.demo.ProjectOla.RepoInt.BookingRepoInt;
@Service
public class BookingService implements BookingServiceInt{

	@Autowired
	private BookingRepoInt bri;
	
	public void updatebookingData(BookingEntity be) {
		 bri.save(be);
	}

	public void deletebookingData(int id) {
		bri.deleteById(id);
	}
	public List<BookingEntity> getbookingData() {
		return bri.findAll();
	}

	public void savebookingData(BookingEntity be) {
		bri.save(be);
		
	}
}
