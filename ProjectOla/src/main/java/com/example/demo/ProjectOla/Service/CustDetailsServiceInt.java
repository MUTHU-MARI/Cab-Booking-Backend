package com.example.demo.ProjectOla.Service;

import java.util.List;

import com.example.demo.ProjectOla.Entity.CustDetailsEntity;

public interface CustDetailsServiceInt {
          public void deletecustData(int id);
          public List<CustDetailsEntity> getcustData();
          public void savecustData(CustDetailsEntity cde);
}
