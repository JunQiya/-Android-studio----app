package com.example.movieshare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;


import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.movieshare.databinding.ActivityMainBinding;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_layout_zhuye);
//
//        CardView cardView = findViewById(R.id.zxsy_cardview);
//
//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 在这里执行跳转逻辑，启动一个新的 Activity
//                Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "欢迎登录灯塔系统", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });





        //您已退出灯塔系统，期待下次相见


//        Button exitButton = findViewById(R.id.xitoshezi_btn);
//        exitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 显示退出消息
//                Toast.makeText(MainActivity.this, "您已退出灯塔系统，期待下次相见", Toast.LENGTH_SHORT).show();
//                // 这里可以添加其他退出逻辑，例如清除用户登录状态等
//            }
//        });



        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_zuixingshanying, R.id.nav_jijianshangying,
                R.id.nav_omeipaihang, R.id.nav_wodeshouchang, R.id.nav_xitoshezi)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    //点击跳转到电影详细页面
    // 添加点击事件处理方法
    public void onImageViewClick(View view) {
        // 在这里执行点击事件的逻辑
        // 例如，启动一个新的 Activity
        Intent intent = new Intent(this, YourNewActivity.class);
        startActivity(intent);
    }
    public void onImageViewClick2(View view) {
        Intent intent = new Intent(this, YourNewActivity2.class);
        startActivity(intent);
    }
    public void onImageViewClick3(View view) {
        Intent intent = new Intent(this, YourNewActivity3.class);
        startActivity(intent);
    }
    public void onImageViewClick_kobai(View view) {
        Intent intent = new Intent(this, YourNewActivity_kobai.class);
        startActivity(intent);
    }

    //点击后启动系统自带浏览器访问此网站
    public void openWebPage(View view) {
        Uri uri = Uri.parse("https://www.lxxno.cn"); // 替换为想要跳转的网页链接
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openWebPage2(View view) {
        Uri uri = Uri.parse("https://beian.miit.gov.cn/#/Integrated/index"); // 替换为想要跳转的网页链接
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}
