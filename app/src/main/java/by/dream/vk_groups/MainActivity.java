package by.dream.vk_groups;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.*;
import com.vk.sdk.api.model.VKApiGetMessagesResponse;
import com.vk.sdk.api.model.VKApiMessage;
import com.vk.sdk.api.model.VKApiPost;
import com.vk.sdk.api.model.VKList;
import com.vk.sdk.util.VKUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button showmessage;
    private ListView listView;
    private String[] scope = new String[] {VKScope.WALL};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void getresponse() throws IOException {
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        WallInterface wallInterface = retrofit.create(WallInterface.class);

        try {
            Call callwall = wallInterface.getresponse("-116125443", "0", "5", "5.52", "6cab6378aa79947d7d7aa17de6d7196956b74a4217d2508bfa977a3ee14cf4f4d8056de9d76c0ad56aff7");
            Response<by.dream.vk_groups.Response> responseResponse = callwall.execute();
            System.out.println("got response: " + responseResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }


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
    }
}
