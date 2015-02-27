package chuang.shapeanddrawable;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {


    private String[] mTitles = {"RoundImageDrawable", "CircleImageDrawable", "CustomStateDrawable", "Shape"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getListView().setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mTitles));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, RoundImageDrawableActivity.class);
                break;
            case 1:
                intent = new Intent(this, CircleImageDrawableActivity.class);
                break;
            case 2:
                intent = new Intent(this, CustomStateDrawableActivity.class);
                break;
            case 3:
                intent = new Intent(this, ShapeActivity.class);
                break;
        }

        startActivity(intent);
    }


}
