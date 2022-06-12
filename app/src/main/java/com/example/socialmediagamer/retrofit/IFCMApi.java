package com.example.socialmediagamer.retrofit;

import com.example.socialmediagamer.models.FCMBody;
import com.example.socialmediagamer.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA90yzUbg:APA91bFLFzkYn-4swiFiY3VyVM1I93FH4G0KBIVEITV_hLesbs-goOG_VcxPNRQzVWDUqMinQk9X5Ewo1hSndwCbl55vY2GgN4Ew7igXpP6VJVa0nd1b0gaGJOSXwayEfz5ieJmKuajW"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}
