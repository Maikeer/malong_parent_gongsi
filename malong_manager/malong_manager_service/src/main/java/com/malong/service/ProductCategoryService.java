package com.malong.service;

import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(short parentid);
    ResponseJsonResult addCategory(short parentId,String name);
}
