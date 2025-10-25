package com.example.myapplication;

import static com.example.myapplication.data.publicfunction.*;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        MassClickListen(this, R.id.textflower, R.id.textgood, R.id.textMoon, R.id.textY);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (Arrays.asList(R.id.textflower, R.id.textgood).contains(viewId)) {
            TextView onetextview = findViewById(viewId);
            int color = onetextview.getCurrentTextColor() == getResources().getColor(R.color.PinHong) ? Color.BLACK : getResources().getColor(R.color.PinHong);
            onetextview.setTextColor(color);
        }
        if (viewId == R.id.textMoon) {
            //Toast.makeText(this, "月亮大大滴", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:10086"));
            startActivity(intent);
        }
        if (viewId == R.id.textY) {
            new AlertDialog.Builder(this).setTitle("月圆夜规则怪谈")
                    .setPositiveButton("确定", null)
                    .setNegativeButton("取消", null)
                    .show();
        }

    }
}