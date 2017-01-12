package nyc.c4q.akashaarcher.majorkeys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.akashaarcher.majorkeys.backend.KeyApi;
import nyc.c4q.akashaarcher.majorkeys.backend.KeyResponse;
import nyc.c4q.akashaarcher.majorkeys.model.Key;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class KeyFragment extends Fragment {


    private static final String TAG = "KeyFragment";
    public static final String BASE_URL = "http://jsjrobotics.nyc/";

    private List<Key> letterList;
    private RecyclerView keyRecyclerView;
    private KeyAdapter keyAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_key, container, false);

        letterList  = new ArrayList<>();


        keyRecyclerView = (RecyclerView) view.findViewById(R.id.key_rv);
        keyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        keyAdapter = new KeyAdapter(getContext());
        keyRecyclerView.setAdapter(keyAdapter);

        getLetters();

        return view;
    }


//    private void getLetters() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        final KeyApi keyApi = retrofit.create(KeyApi.class);
//
//        Call<List<Key>> call = keyApi.getKeyList();
//
//        call.enqueue(new Callback<List<Key>>() {
//            @Override
//            public void onResponse(Call<List<Key>> call, Response<List<Key>> response) {
//                List<Key> keyResponseList = response.body();
//                keyAdapter.setData(keyResponseList);
//                Log.d(TAG, "There was a success" + response);
//            }
//
//            @Override
//            public void onFailure(Call<List<Key>> call, Throwable t) {
//                Log.d(TAG, "There was a failure" + t);
//            }
//        });
//    }



    private void getLetters() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final KeyApi keyApi = retrofit.create(KeyApi.class);

        Call<KeyResponse> call = keyApi.listKeys();

        call.enqueue(new Callback<KeyResponse>() {
            @Override
            public void onResponse(Call<KeyResponse> call, Response<KeyResponse>response) {
                KeyResponse keyResp = response.body();
                letterList = keyResp.getKeys();
              // keyAdapter.setData(letterList);
                Log.d(TAG, "There was a success" + response);
            }

            @Override
            public void onFailure(Call <KeyResponse> call, Throwable t) {
                Log.d(TAG, "There was a failure" + t);
            }
        });
    }





}
