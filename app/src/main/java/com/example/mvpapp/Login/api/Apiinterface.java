package com.example.mvpapp.Login.api;

import com.example.mvpapp.Login.model.UserData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface Apiinterface {





        @POST("login")
        Call<List<UserData>> getLogin();
    }
