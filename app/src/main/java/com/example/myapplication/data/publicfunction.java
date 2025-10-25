package com.example.myapplication.data;

import android.app.Activity;
import android.content.Context;
import android.view.View;

public class publicfunction {

    public static void MassClickListen(Context context, int... ViewIdAry){
        for(int aviewid:ViewIdAry){
            ((View)((Activity)context).findViewById(aviewid)).setOnClickListener((View.OnClickListener)context);
        }}

}
