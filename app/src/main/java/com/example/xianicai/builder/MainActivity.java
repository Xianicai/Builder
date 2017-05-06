package com.example.xianicai.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildProduct();
    }

    private void buildProduct() {
        Builder builder = new ConcreteBuilder();
        builder.setName("夏尼采");
        builder.setSex("男");
        builder.setClothes("迷彩军装");
        builder.build();
        System.out.println( builder.build().showProduct());
    }
}
