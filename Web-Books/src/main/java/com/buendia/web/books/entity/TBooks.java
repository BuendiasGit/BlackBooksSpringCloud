package com.buendia.web.books.entity;

import java.io.Serializable;
import java.util.Date;

public class TBooks implements Serializable {
    private Integer bid;

    private String bName;

    private String bType;

    private String bAuthor;

    private String bComment;

    private Long bPrice;

    private String bImg;

    private String createPerson;

    private String updatePerson;

    private Date createDate;

    private Date updateDate;

    public TBooks(Integer bid, String bName, String bType, String bAuthor, String bComment,Long bPrice, String bImg, String createPerson, String updatePerson, Date createDate, Date updateDate) {
        this.bid = bid;
        this.bName = bName;
        this.bType = bType;
        this.bAuthor = bAuthor;
        this.bComment=bComment;
        this.bPrice = bPrice;
        this.bImg = bImg;
        this.createPerson = createPerson;
        this.updatePerson = updatePerson;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "TBooks{" +
                "bid=" + bid +
                ", bName='" + bName + '\'' +
                ", bType='" + bType + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bComment='" + bComment + '\'' +
                ", bPrice=" + bPrice +
                ", bImg='" + bImg + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", updatePerson='" + updatePerson + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }

    public String getbComment() {
        return bComment;
    }

    public void setbComment(String bComment) {
        this.bComment = bComment;
    }

    public TBooks() {
        super();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType == null ? null : bType.trim();
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public Long getbPrice() {
        return bPrice;
    }

    public void setbPrice(Long bPrice) {
        this.bPrice = bPrice;
    }

    public String getbImg() {
        return bImg;
    }

    public void setbImg(String bImg) {
        this.bImg = bImg == null ? null : bImg.trim();
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}