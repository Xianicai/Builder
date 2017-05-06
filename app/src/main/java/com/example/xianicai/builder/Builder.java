package com.example.xianicai.builder;

/**
 * Created by Zhanglibin on 2017/5/6.
 * Builder的接口
 */

public interface Builder {
    void setName(String name);
    void setSex(String sex);
    void setClothes(String clothes);
    Product build();
}
