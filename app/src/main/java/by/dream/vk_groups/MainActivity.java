package by.dream.vk_groups;


import android.view.View;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private TextView textView;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void getresponseforDebug() {
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        WallInterface wallInterface = retrofit.create(WallInterface.class);
        Call<String> callWall = wallInterface.getresponseforDebug("-116125443", "0", "5", "5.52", "6cab6378aa79947d7d7aa17de6d7196956b74a4217d2508bfa977a3ee14cf4f4d8056de9d76c0ad56aff7");
        try {
            Response<String> responseforDebug = callWall.execute();
            System.out.println("got debug response body"+responseforDebug.body().toString());
        } catch (IOException e) {
            System.out.println("caught IOexception " + e);
        }

    }

    private void getresponse() throws IOException {
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        WallInterface wallInterface = retrofit.create(WallInterface.class);
        Call<WallInfo> callwall = wallInterface.getresponse("-116125443", "0", "5", "5.52", "6cab6378aa79947d7d7aa17de6d7196956b74a4217d2508bfa977a3ee14cf4f4d8056de9d76c0ad56aff7");
        callwall.enqueue(new Callback<WallInfo>() {
            @Override
            public void onResponse(Call call, Response wallresponse) {

                WallInfo wallInfo = (WallInfo) wallresponse.body();
                final by.dream.vk_groups.Response response = wallInfo.getResponse();
                final List<Item> items = response.getItems();
                final StringBuilder sb = new StringBuilder();
                sb.append(items.get(1).getText());
                textView = findViewById(R.id.textView);
                textView.setText(sb);
                System.out.println("Text: "+sb.toString());


            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });



    }

    /*private void response(){

        VKRequest request = VKApi.wall().get(VKParameters.from(VKApiConst.OWNER_ID,-116125443, VKApiConst.EXTENDED,1,VKApiConst.COUNT,5,VKApiConst.FIELDS,"text"));
                request.executeWithListener(new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                VKList<VKApiPost> posts = (VKList<VKApiPost>) response.parsedModel;
                for (int i=0; i<5; i++) {
                    VKApiPost post = posts.get(i);
                    String textpost = post.text;
                    System.out.println(textpost);
                }

                //super.onComplete(response);
            }
        });
    }*/

    public void OnClick(View view) throws IOException {
        getresponse();
        //getresponseforDebug();
    }
}
