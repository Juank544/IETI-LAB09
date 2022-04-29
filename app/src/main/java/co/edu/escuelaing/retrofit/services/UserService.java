package co.edu.escuelaing.retrofit.services;

import co.edu.escuelaing.dtos.UserDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("/v1/auth/")
    Call<UserDto> user(@Path("user") String user);
}
