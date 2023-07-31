// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付电商平台分账API
//
// 微信支付电商平台分账API
//
// API version: 1.0.21

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommerceprofitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.cipher.Encryption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/** CreateOrderRequest */
public class CreateOrderRequest {
  /** 微信分配的公众账号ID 说明：微信分配的公众账号ID */
  @SerializedName("appid")
  private String appid;
  /** 电商平台二级商户号 说明：分账出资的电商平台二级商户，填写微信支付分配的商户号 */
  @SerializedName("sub_mchid")
  private String subMchid;
  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  private String transactionId;
  /** 商户分账单号 说明：商户系统内部的分账单号，在商户系统内部唯一（单次分账、多次分账、完结分账应使用不同的商户分账单号），同一分账单号多次请求等同一次。只能是数字、大小写字母_-|*@ */
  @SerializedName("out_order_no")
  private String outOrderNo;
  /** 分账接收方列表 说明：分账接收方列表，可以设置出资商户作为分账接受方 */
  @Encryption
  @SerializedName("receivers")
  private List<CreateOrderReceiver> receivers = new ArrayList<CreateOrderReceiver>();
  /**
   * 是否分账完成 说明：如果为true，则分账接收商户只支持电商平台商户，且该笔订单剩余未分账的金额会解冻回电商平台二级商户；
   * 如果为false，则分账接收商户可以为电商平台商户或者电商平台二级商户，且该笔订单剩余未分账的金额不会解冻回电商平台二级商户，可以对该笔订单再次进行分账；
   */
  @SerializedName("finish")
  private Boolean finish;
  /** 分账结果回调url 说明：异步接收微信支付分账结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数 */
  @SerializedName("notify_url")
  private String notifyUrl;

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutOrderNo() {
    return outOrderNo;
  }

  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }

  public List<CreateOrderReceiver> getReceivers() {
    return receivers;
  }

  public void setReceivers(List<CreateOrderReceiver> receivers) {
    this.receivers = receivers;
  }

  public Boolean getFinish() {
    return finish;
  }

  public void setFinish(Boolean finish) {
    this.finish = finish;
  }

  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    receivers: ").append(toIndentedString(receivers)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public CreateOrderRequest cloneWithCipher(UnaryOperator<String> s) {
    CreateOrderRequest copy = new CreateOrderRequest();
    copy.appid = appid;
    copy.subMchid = subMchid;
    copy.transactionId = transactionId;
    copy.outOrderNo = outOrderNo;
    if (receivers != null && receivers.size() != 0) {
      // arr
      copy.receivers = new ArrayList<>();
      for (CreateOrderReceiver val : receivers) {
        if (val != null) {
          copy.receivers.add(val.cloneWithCipher(s));
        }
      }
    }
    copy.finish = finish;
    copy.notifyUrl = notifyUrl;
    return copy;
  }
}