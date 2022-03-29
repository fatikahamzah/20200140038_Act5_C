package com.example.act5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context mContect;
    LayoutInflater inflater;

    private ArrayList<ClassNama> arrayList;
    public  ListViewAdapter(Context context){
        mContect = context;
        inflater = LayoutInflater.from(mContect);
        this.arrayList = new ArrayList<ClassNama>();
        this.arrayList.addAll(ActivityHome.classNamaArrayList);
    }
    public  class ViewHolder{
        TextView name;
    }

    @Override
    public int getCount() {
        return ActivityHome.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return ActivityHome.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final  ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.activity_listview, null);
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(ActivityHome.classNamaArrayList.get(i).getNama());
        return view;
    }
}