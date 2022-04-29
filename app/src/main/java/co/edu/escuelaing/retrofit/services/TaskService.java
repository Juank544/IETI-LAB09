package co.edu.escuelaing.retrofit.services;

import java.util.List;

import co.edu.escuelaing.dtos.TaskDto;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TaskService {
    @GET("/v1/task")
    Call<List<TaskDto>> tasks(@Path("task") String task);

    @GET("/v1/task/{id}")
    Call<TaskDto> task(@Path("id") String task);

    @POST("/v1/task")
    Call<List<TaskDto>> createTask(@Path("task") String task);

    @PUT("/v1/task/{id}")
    Call<TaskDto> updateTask(@Path("id") String task);

    @DELETE("/v1/task/{id}")
    Call<TaskDto> deleteTask(@Path("id") String task);
}
