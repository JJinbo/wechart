package com.ideal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.serial
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private Integer serial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_name
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.price
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_date
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private Date orderDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_content
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    private String orderContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.serial
     *
     * @return the value of orders.serial
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public Integer getSerial() {
        return serial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.serial
     *
     * @param serial the value for orders.serial
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_name
     *
     * @return the value of orders.user_name
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_name
     *
     * @param userName the value for orders.user_name
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.price
     *
     * @return the value of orders.price
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.price
     *
     * @param price the value for orders.price
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_date
     *
     * @return the value of orders.order_date
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_date
     *
     * @param orderDate the value for orders.order_date
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_content
     *
     * @return the value of orders.order_content
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_content
     *
     * @param orderContent the value for orders.order_content
     *
     * @mbg.generated Wed Jan 23 13:22:19 CST 2019
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }
}