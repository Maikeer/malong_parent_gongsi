package com.malong.pojo;

/**
 * 商品分类表
 * 
 * @author wcyong
 * 
 * @date 2019-03-27
 */
public class ProductCategory {
    /**
     * 主键id
     */
    private Short id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序
     */
    private Short sordorder=999;

    /**
     * 0不删除 1删除
     */
    private Byte status=0;

    /**
     * 父级的id 0 代表父级
     */
    private Short parentId=0;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getSordorder() {
        return sordorder;
    }

    public void setSordorder(Short sordorder) {
        this.sordorder = sordorder;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}