package co.edu.escuelaing.retrofit.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("/v1/auth/")
    Call<String> user(@Path("user") String user);
}
