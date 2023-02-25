package com.example.demo.ProjectOla.Service;

import java.util.List;

import com.example.demo.ProjectOla.Entity.BookingEntity;

public interface BookingServiceInt {
        public void updatebookingData(BookingEntity be);
        public List<BookingEntity> getbookingData();
        public void savebookingData(BookingEntity be);
        public void deletebookingData(int id);
}
