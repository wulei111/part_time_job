package com.best.love_parttimejob_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
/**
 * 创建时间：2015/11/17
 * 创建人：吴磊
 * 内容：主框架 toolbar
 *
 * */

public class MainActivity extends AppCompatActivity {

        TextView toolbartitle;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //找到Toobar
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbartitle = (TextView) toolbar.findViewById(R.id.toolbartitle);
    }


}
