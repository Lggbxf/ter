package cn.edu.retrofit.retrofit2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    public static final String api_url = "http://192.168.1.118:8080/demo/";
    public static final String tag = "MainActivity";

    public interface ApiService{
        @GET("index.jsp")
        Call<User> getUser();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.btn)
    public void onViewClicked() {
        getList();
    }

    private void getList() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(api_url).addConverterFactory(GsonConverterFactory.create()).build();
        ApiService service = retrofit.create(ApiService.class);
        Call<User> call = service.getUser();
       // Log.i(tag,call.toString());
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.i(tag, response.body().getName() + " " + response.body().getAge() + " " + response.body().getHobbit() + " " + response.body().getHobbit2());
                try {
                    System.out.println(response.body().toString());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.i(tag,"Error:"+t);
            }
        });
    }


}
