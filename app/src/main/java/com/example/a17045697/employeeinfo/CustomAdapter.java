package com.example.a17045697.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<InfoItem> infoList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<InfoItem> objects) {
        super(context, resource, objects);
        parent_context=context;
        layout_id=resource;
        infoList=objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName= rowView.findViewById(R.id.textViewName);
        TextView tvSalary=rowView.findViewById(R.id.textViewSalary);
        InfoItem currentItem = infoList.get(position);
        String name=currentItem.getName();
        String title=currentItem.getTitle();
        float Salary=currentItem.getSalary();
        tvName.setText(name + "/n" + title);
        tvSalary.setText(Salary+"");
        return rowView;
    }
}