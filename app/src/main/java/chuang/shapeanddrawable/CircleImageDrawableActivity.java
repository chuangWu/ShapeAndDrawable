package chuang.shapeanddrawable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import chuang.shapeanddrawable.widget.CircleImageDrawable;


public class CircleImageDrawableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mv);
		ImageView iv1 = (ImageView) findViewById(R.id.id_one);
		iv1.setImageDrawable(new CircleImageDrawable(bitmap));
		ImageView iv2 = (ImageView) findViewById(R.id.id_two);
		iv2.setImageDrawable(new CircleImageDrawable(bitmap));
		
		iv1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();
			}
		});
		
		iv2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();
			}
		});

	}

}
