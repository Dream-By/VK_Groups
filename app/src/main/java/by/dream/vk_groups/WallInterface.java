package by.dream.vk_groups;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WallInterface {

    @GET("/method/wall.get?")
    Call<WallInfo> getresponse (@Query("owner_id=") String OWNER_ID, @Query("offset") String OFFSET, @Query("count") String COUNT, @Query("v") String version,@Query("access_token") String access_token);

    }
