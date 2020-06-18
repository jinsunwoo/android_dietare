package com.jsunwoo.dietare.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jsunwoo.dietare.R;

public class LauncherActivity extends AppCompatActivity {
    // 책장 (하드디스크, ssd). 책상이 메모리(ram). 책을 보고 레포트 작성 책을 찾으러 가는 등 하나 하나 다 쓰레드.
    // 레포트 쓰는 큰 쓰레드 안에 (책 가져오는 쓰레드 => 책 읽는 쓰레드 => etc).
    // 쓰레드 작업 리스트를 handling(이거 했다 저거했다 하는 거) 하는게 handler.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        // handler 는 thread 를 handling. thread 는 cpu 가 처리하는 최소 단위. (작업단위).
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveIntent = new Intent();
                moveIntent.setClass(LauncherActivity.this, LoginActivity.class);
//                Intent moveIntent = new Intent(LauncherActivity.this, LoginActivity.class);
                startActivity(moveIntent);
//                startActivity(new Intent(LauncherActivity.this, LoginActivity.class));
            }
        }, 2000);
    }
}
