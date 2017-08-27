package com.example.jmush.android_session8_assignment_83_84;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] versionName={"GingerBread","honeycomb","IceCream Sandwich","Jellybean","Kitkat","Lolipop"};
    int[] versionImage={R.drawable.ginger_bread,R.drawable.honey_comb,R.drawable.icecream,R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lolipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomGrid adapter=new CustomGrid(this,versionImage,versionName);
        gridView= (GridView) findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked on " +versionName[+ position], Toast.LENGTH_SHORT).show();            }
        });

    }
}
