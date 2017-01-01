package com.example.linyuming.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"Toast直接显示",Toast.LENGTH_LONG).show();
    }
    public void b2(View v){
        LayoutInflater lf = getLayoutInflater();
        View vRoot = lf.inflate(R.layout.toastroot,null);
        LinearLayout ll = (LinearLayout) vRoot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastinfo,ll);
        Toast toast = new Toast(this);
        toast.setView(vRoot);
        toast.show();
    }
    public void b3(View v){
        Toast toast = Toast.makeText(this,"我是小黄人--图文显示",Toast.LENGTH_LONG);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.yellowman);
        View ToastView = toast.getView();
        ll.addView(img);
        ll.addView(ToastView);
        toast.setView(ll);
        toast.show();
    }
}
