package com.axionteq.onlineradio.api;


import com.axionteq.onlineradio.radio.Radio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("files/radio.php")
    Call<List<Radio>> getRadioType();
}
