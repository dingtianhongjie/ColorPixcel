package com.example.soltmember.colorpixcel;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int height = 60;
        int width = 360;
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int color;

        for(int i = 0; i < 360; i++){
            color = Color.HSVToColor(new float[]{i, 1, 1});
            for(int j = 0; j < height; j++){
                bitmap.setPixel(i, j, color);
            }
        }
        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(bitmap);
        setContentView(imageView);

        int pixs[] = new int[width * height];
        bitmap.getPixels(pixs, 0, width, 0 , 0, width, height);

//        for (int x = 0; x < width; x++){
//            for(int y = 0; y < height; y++){
//                int pix = pixs[x + y * width];
//                int r = Color.red(pix);
//                Log.d("RED", String.valueOf(r));
//            }
//        }

        int pix = pixs[width * 2];
        int r = Color.red(pix);
        int g = Color.green(pix);
        int b = Color.blue(pix);
        Log.d("RED", String.valueOf(r));
        Log.d("GREEN", String.valueOf(g));
        Log.d("BLUE", String.valueOf(b));

    }
}
