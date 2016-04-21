package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//hui fu le  repository 菜单下都是操作远程版本库的 githu就是冲github上拉去下来，然后跟本地一样操作
        //pull是不是就是上传到网上
        // 反了 push上传，pull拉去==下载，你给我演示一哈
        // github youz账号  有登
        //用插件直接可以
    }
}
