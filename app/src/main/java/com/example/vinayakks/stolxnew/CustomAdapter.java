package com.example.vinayakks.stolxnew;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.ParseObject;

import java.util.List;

/**
 * Created by vinayak ks on 2/5/2016.
 */
public class CustomAdapter extends ArrayAdapter<ParseObject> {
    public CustomAdapter(Context context, List<ParseObject> list) {
        super(context,R.layout.row,list);
    }
    @Override
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup){
        LayoutInflater vininflate = LayoutInflater.from(getContext());
        View custom = vininflate.inflate(R.layout.row, paramViewGroup, false);
        ParseObject i = (ParseObject)getItem(paramInt);
        TextView vintext = (TextView)custom.findViewById(R.id.text);
        ImageView vinimage = (ImageView)custom.findViewById(R.id.image);
        vintext.setText(i.getString("title"));
        vinimage.setImageResource(R.drawable.a);
        return  custom;

    }
}
