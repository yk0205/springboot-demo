package com.yk.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {

    private Long id;
    private Long userId;
    private Long goodsId;
    private Long deliveryAddrId;
    private String goodsName;
    private Integer goodsCount;
    private Double goodsPrice;
    private int orderChannel;
    private int orderStatus;
    private Date createDate;
    private Date payDate;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_id
     *
     * @return the value of order_info.goods_id
     *
     * 
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_id
     *
     * @param goodsId the value for order_info.goods_id
     *
     * 
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.delivery_addr_id
     *
     * @return the value of order_info.delivery_addr_id
     *
     * 
     */
    public Long getDeliveryAddrId() {
        return deliveryAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.delivery_addr_id
     *
     * @param deliveryAddrId the value for order_info.delivery_addr_id
     *
     * 
     */
    public void setDeliveryAddrId(Long deliveryAddrId) {
        this.deliveryAddrId = deliveryAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_name
     *
     * @return the value of order_info.goods_name
     *
     * 
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_name
     *
     * @param goodsName the value for order_info.goods_name
     *
     * 
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_count
     *
     * @return the value of order_info.goods_count
     *
     * 
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_count
     *
     * @param goodsCount the value for order_info.goods_count
     *
     * 
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_price
     *
     * @return the value of order_info.goods_price
     *
     * 
     */
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_price
     *
     * @param goodsPrice the value for order_info.goods_price
     *
     * 
     */
    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_channel
     *
     * @return the value of order_info.order_channel
     *
     * 
     */
    public int getOrderChannel() {
        return orderChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_channel
     *
     * @param orderChannel the value for order_info.order_channel
     *
     * 
     */
    public void setOrderChannel(int orderChannel) {
        this.orderChannel = orderChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_status
     *
     * @return the value of order_info.order_status
     *
     * 
     */
    public int getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_status
     *
     * @param orderStatus the value for order_info.order_status
     *
     * 
     */
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.create_date
     *
     * @return the value of order_info.create_date
     *
     * 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.create_date
     *
     * @param createDate the value for order_info.create_date
     *
     * 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_date
     *
     * @return the value of order_info.pay_date
     *
     * 
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_date
     *
     * @param payDate the value for order_info.pay_date
     *
     * 
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}