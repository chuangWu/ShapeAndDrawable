package chuang.shapeanddrawable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import chuang.shapeanddrawable.widget.RoundImageDrawable;


public class RoundImageDrawableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mv);
        ImageView iv = (ImageView) findViewById(R.id.id_one);
        iv.setImageDrawable(new RoundImageDrawable(bitmap));
        iv = (ImageView) findViewById(R.id.id_two);
        iv.setImageDrawable(new RoundImageDrawable(bitmap));
    }

}
