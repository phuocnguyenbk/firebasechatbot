package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.Call;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAl9eDJlY:APA91bEhq1-CTixFvvA_DUrO7j_yRN_D3wB0ivVn321s97NLHRB5O4yvjNnG14iJ06rvd_60pHv94kbZdDggmASnJHjXxGzQajstyXqLa4bwCi1-qVg3QeXifV4eqRDbRtGgdnr7ow2L"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
