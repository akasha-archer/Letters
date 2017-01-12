package nyc.c4q.akashaarcher.majorkeys.backend;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by akashaarcher on 1/11/17.
 */

public interface KeyApi {

    @GET("cgi-bin/1_11_2017_exam.pl")
    Call<KeyResponse> listKeys();

}
