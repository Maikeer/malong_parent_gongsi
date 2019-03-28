package com.malong.controller;

import com.malong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService;
    /**
     * 根据parentid返回数据列表
     */
    @RequestMapping("/list")
    @ResponseBody
    public List getProductCategoryByParentId(@RequestParam(value = "id",defaultValue = "0") short parentid){
        List<EasyUITree> productCategoryListByParentId = productCategoryService.findProductCategoryListByParentId(parentid);
        return productCategoryListByParentId;
    }
    /**
     * 添加分类
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResponseJsonResult addCategory(short parentId, String name){
        ResponseJsonResult responseJsonResult = productCategoryService.addCategory(parentId, name);
        return responseJsonResult;
    }
    /**
     * 删除分类 deleteCategory
     */
    @RequestMapping("/del")
    @ResponseBody
    public ResponseJsonResult delCategory(short parentId, short id){
        ResponseJsonResult responseJsonResult = productCategoryService.deleteCategory(parentId, id);
        return responseJsonResult;
    }
}
