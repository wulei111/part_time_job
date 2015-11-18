package com.best.love_parttimejob_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

/**
 * 创建时间：2015-11-18
 * 创建人：李广兴
 * 创建内容：LoginActivity
 * */

public class LoginActivity extends AppCompatActivity {

    public TextView duanxin;
    public Button denglu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        duanxin = (TextView) findViewById(R.id.duanxin);
        denglu = (Button) findViewById(R.id.login );
    }

//    短信验证登录
    
    public void duanxinlogin(View view){
        Intent intent = new Intent(this,ValidateLoginActivity.class);
        startActivity(intent);
    }

//    注册
    public void registere(View view){
        Intent intent = new Intent(this,RegisteredActivity.class);
        startActivity(intent);
    }
}
