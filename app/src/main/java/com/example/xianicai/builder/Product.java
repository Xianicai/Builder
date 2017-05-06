package com.example.xianicai.builder;

/**
 * Created by Zhanglibin on 2017/5/6.
 * 产品类（表示当前有什么属性可选择）
 */

public class Product {
    private String name;
    private String sex;
    private String clothes;
    void setName(String name ){
        this.name = name;
    }
    void setSex(String sex ){
        this.sex = sex;
    }
    void setClothes(String clothes ){
        this.clothes = clothes;
    }
    String showProduct(){
        return "姓名:"+name+"\n"+"性别:"+sex+"\n"+"服装:"+clothes;
    }
}
