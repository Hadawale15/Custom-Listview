package com.example.custom_listview_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class myadapter extends BaseAdapter {

    int[] Img;
    String[] Text1;
    String[] Text2;
    Context context;
    LayoutInflater layoutInflater;

    public myadapter(int[] img, String[] text1, String[] text2, Context context) {
        Img = img;
        Text1 = text1;
        Text2 = text2;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(R.layout.custom_layout,null);

        ImageView imageView=view.findViewById(R.id.Image_view_id);
        TextView textView=view.findViewById(R.id.Name_id);
        TextView textView1=view.findViewById(R.id.language_id);


        imageView.setImageResource(Img[i]);
        textView.setText(Text1[i]);
        textView1.setText(Text2[i]);
        return view;
    }
}
