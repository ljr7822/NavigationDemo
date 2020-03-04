package com.example.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 改变标题栏，使其和对应的页面一致
        NavController controller = Navigation.findNavController(this,R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this,controller);
    }

    // 标题栏的箭头返回按钮可以返回
    @Override
    public boolean onSupportNavigateUp() {

        NavController controller = Navigation.findNavController(this,R.id.fragment);

        return controller.navigateUp();
        //return super.onSupportNavigateUp();
    }
}
