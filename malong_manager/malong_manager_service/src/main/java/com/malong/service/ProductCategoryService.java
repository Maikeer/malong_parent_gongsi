package com.malong.service;

import pojo.EasyUITree;

import java.util.List;

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(short parentid);
}
