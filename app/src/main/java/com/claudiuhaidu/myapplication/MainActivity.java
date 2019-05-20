package com.claudiuhaidu.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.master.glideimageview.GlideImageView;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //String url = "https://instock.p4b.ro/api/v1/products/5baadcf5b91b0/attachments/15";
        String url = "https://g8usa.g8.net/lo/g8_cfdb/g8_cfdb_device_img_decode.php?g8_cfdb_unique_id=10005";
        //final ImageView imageView = findViewById(R.id.imageView);

        //String url = "https://cdn.pixabay.com/photo/2017/11/06/18/39/apple-2924531_960_720.jpg";
        GlideImageView glideImageView = (GlideImageView) findViewById(R.id.imageView);
        glideImageView.loadImageUrl(url);

        /*Picasso.with(this).load(url).into(imageView);*/





        /*//Picasso.with(this).load(url).into(imageView);

        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //Handle the error
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final Bitmap bitmap = BitmapFactory.decodeStream(response.body().byteStream());
                    // Remember to set the bitmap in the main thread.
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else {
                    //Handle the error
                }
            }
        });
*/
    }
}
