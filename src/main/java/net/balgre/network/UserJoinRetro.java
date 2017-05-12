package net.balgre.network;

import net.balgre.domain.CommonResponse;
import net.balgre.domain.MainResponse;
import net.balgre.domain.UserResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserJoinRetro {

    @GET("/api/main")
    Call<MainResponse> getMain();

    @POST("/api/user/join")
    Call<UserResponse> userJoin(
            @Query("id") String id,
            @Query("email") String email,
            @Query("name") String name,
            @Query("password") String password,
            @Query("gender") String gender,
            @Query("birthday") Integer birthday,
            @Query("phone") String phone,
            @Query("joinType") String joinType,
            @Query("skin") Integer skin,
            @Query("smsagree") String smsagree,
            @Query("emailagree") String emailagree,
            @Query("code") String code
    );

    @GET("/api/user/send_sms")

    Call<CommonResponse> phone_check(
            @Query("phone") String phone
    );

    @GET("/api/user/sms_cert")
    Call<CommonResponse> phone_check2(
            @Query("phone") String phone,
            @Query("cert") String cert
    );

}
