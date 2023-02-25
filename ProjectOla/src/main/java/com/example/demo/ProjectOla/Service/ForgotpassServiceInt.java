package com.example.demo.ProjectOla.Service;

import java.util.List;

import com.example.demo.ProjectOla.Entity.ForgotpassEntity;

public interface ForgotpassServiceInt {
       public void saveforgotpassData(ForgotpassEntity fe);
       public List<ForgotpassEntity> getforgotpassData();
}
