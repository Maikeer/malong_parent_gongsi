package com.malong.service.impl;

import com.malong.mapper.ProductCategoryMapper;
import com.malong.pojo.ProductCategory;
import com.malong.pojo.ProductCategoryExample;
import com.malong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUITree;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<EasyUITree> findProductCategoryListByParentId(short parentid) {
        ProductCategoryExample productCategoryExample=new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(productCategoryExample);
        ArrayList<EasyUITree> easyUITrees = new ArrayList<>(productCategories.size());
        for (ProductCategory productCategory:productCategories) {
                EasyUITree easyUITree=new EasyUITree(productCategory.getId(),productCategory.getName(),(productCategory.getParentId()==0
            ?"closed":"open"));
            easyUITrees.add(easyUITree);
        }

        return easyUITrees;
    }
}
