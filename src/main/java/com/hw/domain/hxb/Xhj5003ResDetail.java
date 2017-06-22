package com.hw.domain.hxb;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by pandehua on 2017/6/22.
 */
public class Xhj5003ResDetail {
    @ApiModelProperty(value = "付款人名",required = true)
    private String PayName;
    @ApiModelProperty(value = "付款账号",required = true)
    private String PayAcct;
    @ApiModelProperty(value = "付款开户行",required = true)
    private String PayBank;
    @ApiModelProperty(value = "记账日期",required = true)
    private String TransDate;
    @ApiModelProperty(value = "流水号",required = true)
    private String FlowNo;
    @ApiModelProperty(value = "借贷标记1:出账，2：入账",required = true)
    private String Shkzg;
    @ApiModelProperty(value = "金额",required = true)
    private Double Amount;
    @ApiModelProperty(value = "用途")
    private Double Purpose;
    @ApiModelProperty(value = "收款人账号",required = true)
    private String BeneAcct;
    @ApiModelProperty(value = "收款人户名",required = true)
    private String BeneName;
    @ApiModelProperty(value = "收款人开户行",required = true)
    private String BeneBank;
    @ApiModelProperty(value = "电子回单专用章")
    private String Stamp;

    public String getPayName() {
        return PayName;
    }

    public void setPayName(String payName) {
        PayName = payName;
    }

    public String getPayAcct() {
        return PayAcct;
    }

    public void setPayAcct(String payAcct) {
        PayAcct = payAcct;
    }

    public String getPayBank() {
        return PayBank;
    }

    public void setPayBank(String payBank) {
        PayBank = payBank;
    }

    public String getTransDate() {
        return TransDate;
    }

    public void setTransDate(String transDate) {
        TransDate = transDate;
    }

    public String getFlowNo() {
        return FlowNo;
    }

    public void setFlowNo(String flowNo) {
        FlowNo = flowNo;
    }

    public String getShkzg() {
        return Shkzg;
    }

    public void setShkzg(String shkzg) {
        Shkzg = shkzg;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Double getPurpose() {
        return Purpose;
    }

    public void setPurpose(Double purpose) {
        Purpose = purpose;
    }

    public String getBeneAcct() {
        return BeneAcct;
    }

    public void setBeneAcct(String beneAcct) {
        BeneAcct = beneAcct;
    }

    public String getBeneName() {
        return BeneName;
    }

    public void setBeneName(String beneName) {
        BeneName = beneName;
    }

    public String getBeneBank() {
        return BeneBank;
    }

    public void setBeneBank(String beneBank) {
        BeneBank = beneBank;
    }

    public String getStamp() {
        return Stamp;
    }

    public void setStamp(String stamp) {
        Stamp = stamp;
    }


}
