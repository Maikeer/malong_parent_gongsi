package com.malong.pojo;

/**
 * 商品
 * 
 * @author wcyong
 * 
 * @date 2019-03-27
 */
public class Product {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 分类id
     */
    private Short categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品主图
     */
    private String image;

    /**
     * 市场价格
     */
    private Long maketPrice;

    /**
     * 原价
     */
    private Long price;

    /**
     * 1: 上架 0: 下架
     */
    private Byte status;

    /**
     * 商品描述
     */
    private String decription;

    /**
     * 商品编码
     */
    private String productNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getMaketPrice() {
        return maketPrice;
    }

    public void setMaketPrice(Long maketPrice) {
        this.maketPrice = maketPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription == null ? null : decription.trim();
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }
}