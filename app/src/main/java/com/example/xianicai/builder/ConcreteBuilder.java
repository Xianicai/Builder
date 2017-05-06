package com.example.xianicai.builder;

/**
 * Created by Zhanglibin on 2017/5/6.
 */

public class ConcreteBuilder implements Builder {
    Product mProduct = new Product();

    @Override
    public void setName(String name) {
        mProduct.setName(name);
    }

    @Override
    public void setSex(String sex) {
        mProduct.setSex(sex);
    }

    @Override
    public void setClothes(String clothes) {
        mProduct.setClothes(clothes);
    }

    @Override
    public Product build() {
        return mProduct;
    }
}
