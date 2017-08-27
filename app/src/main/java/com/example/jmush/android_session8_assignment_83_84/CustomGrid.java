package com.example.jmush.android_session8_assignment_83_84;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jmush on 8/28/17.
 */

public class CustomGrid extends BaseAdapter {
    Context context;
    String[] versionName;
    int[] versionImage;

    public CustomGrid(Context context, int[] versionImage,String[] versionName) {
        this.context = context;
        this.versionName = versionName;
        this.versionImage = versionImage;
    }

    @Override
    public int getCount() {
        return versionName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_view, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(versionName[position]);
            imageView.setImageResource(versionImage[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }

}
