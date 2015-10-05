package com.example.dongja94.samplecompoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ItemView myView, my2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (ItemView)findViewById(R.id.item_my);
        ItemData data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.a1439989229223);
        data.title = "title...";
        data.desc = "desc...";
        myView.setItemData(data);

        my2View = (ItemView)findViewById(R.id.item_my2);
        data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.a1442124075796);
        data.title = "title2...";
        data.desc = "desc2....";
        my2View.setItemData(data);

    }
}
