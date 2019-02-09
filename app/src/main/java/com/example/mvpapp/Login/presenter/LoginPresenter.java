package com.example.mvpapp.Login.presenter;

import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.mvpapp.Login.view.MainActivity;

public class LoginPresenter extends AppCompatActivity
{

MainActivity m;
        public void sendLoginData(){
            Log.d("empty", "Hello");
        }
        public void SuccessfullLogin(){
            m.LoginSuccess();
        }
    public void  failiureLogin(){
            m.LoginFailiure();
    }
}
