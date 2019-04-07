package com.malong.controller;

import com.malong.pojo.Product;
import com.malong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyGrid;
import pojo.ResponseJsonResult;

/**
 * 商品管理控制层
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/product/list")
    @ResponseBody
    public EasyGrid listProduct(@RequestParam(value = "page" , defaultValue = "1")int page, @RequestParam(value =
            "rows",defaultValue = "10")int rows){

        EasyGrid easyGrid = productService.listProduct(page, rows);

        return easyGrid;
    }

    @RequestMapping("product_save")
    @ResponseBody
    public ResponseJsonResult saveProduct(Product product){
        ResponseJsonResult responseJsonResult = productService.saveProduct(product);
        return responseJsonResult;
    }
}
