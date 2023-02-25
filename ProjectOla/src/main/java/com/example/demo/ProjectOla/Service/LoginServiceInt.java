package com.example.demo.ProjectOla.Service;

import java.util.List;

import com.example.demo.ProjectOla.Entity.LoginEntity;

public interface LoginServiceInt {
    public List<LoginEntity> getloginData();
    public void saveloginData(LoginEntity le);
}
