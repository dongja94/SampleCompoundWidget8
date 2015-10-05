package com.example.dongja94.samplecompoundwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dongja94 on 2015-10-05.
 */
public class ItemView extends FrameLayout {

    public ItemView(Context context) {
        super(context);
        init();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    ImageView iconView;
    TextView titleView, descView;
    ItemData mData;

    private void init() {
//        LayoutInflater.from(getContext()).inflate(R.layout.view_item, this);
        inflate(getContext(), R.layout.view_item, this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        titleView = (TextView)findViewById(R.id.text_title);
        descView = (TextView)findViewById(R.id.text_desc);

    }

    public void setItemData(ItemData data) {
        mData = data;
        if (data.icon != null) {
            iconView.setImageDrawable(data.icon);
        }
        titleView.setText(data.title);
        descView.setText(data.desc);
    }

}
