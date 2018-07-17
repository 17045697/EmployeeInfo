package com.example.a17045697.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvinfo;
    ArrayList<Employees> alinfoitem;
    CustomAdapter cainfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvinfo=findViewById(R.id.listViewEmployee);
        alinfoitem=new ArrayList<>();
        Employees item1 = new Employees("John","Software Technical Leader",3400.0f);
        Employees item2 = new Employees("May","Programmer",2200.0f);


        alinfoitem.add(item1);
        alinfoitem.add(item2);

        cainfo= new CustomAdapter(this,R.layout.activity_main, alinfoitem);
        lvinfo.setAdapter(cainfo);
    }
}
