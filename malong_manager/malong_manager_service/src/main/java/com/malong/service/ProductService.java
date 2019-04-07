package com.malong.service;

import com.malong.pojo.Product;
import pojo.EasyGrid;
import pojo.ResponseJsonResult;

/**
 * Created by wistbean on 2019/1/5.
 */
public interface ProductService {
    ResponseJsonResult saveProduct(Product product);
    EasyGrid listProduct(int pages, int rows);
}
