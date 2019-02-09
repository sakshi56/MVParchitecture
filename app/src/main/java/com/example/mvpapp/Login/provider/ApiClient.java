package com.example.mvpapp.Login.provider;

import android.app.job.JobInfo;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.mvpapp.Login.api.Apiinterface;
import com.example.mvpapp.Login.model.UserData;
import com.example.mvpapp.Login.presenter.LoginPresenter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.security.cert.CertificateException;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiClient extends AppCompatActivity {
    public static final String BASE_URL = "http://68.183.92.4:9000/login/";
    public static Retrofit retrofit = null;
LoginPresenter loginpresenter;
    //    Gson gson = new GsonBuilder()
//            .setLenient()
//            .create();
    public ApiClient() {
    }

    public static Retrofit getLogin() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Apiinterface api = retrofit.create(Apiinterface.class);
        Call<List<UserData>> call = api.getLogin();
        call.enqueue(new Callback<List<UserData>>() {
            @Override
            public void onResponse(Call<List<UserData>> call, Response<List<UserData>> response) {
                    loginpresenter.SuccessfullLogin();
            }

            @Override
            public void onFailure(Call<List<UserData>> call, Throwable t) {
                     loginpresenter.failiureLogin();
            }
        });
    }
}