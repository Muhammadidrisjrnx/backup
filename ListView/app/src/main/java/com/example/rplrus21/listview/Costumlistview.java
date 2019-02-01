package com.example.rplrus21.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.media.session.PlaybackStateCompat;
import android.widget.ArrayAdapter;

/**
 * Created by RPLRUS21 on 14-Nov-17.
 */

public class Costumlistview extends ArrayAdapter{

    private final String[] values;
    private final Context context;

    public Costumlistview(Context context, String[] values) {
        super(context, R.layout.activity_main, values);
        this.context = context;
        this.values = values;


    }

}
