package com.best.love_parttimejob_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;



public class LoginActivity extends AppCompatActivity {

    public TextView duanxin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        duanxin = (TextView) findViewById(R.id.duanxin);
    }

//    短信验证登录
    
    public void duanxinlogin(View view){
        Intent intent = new Intent(this,ValidateLoginActivity.class);
        startActivity(intent);
    }
}
