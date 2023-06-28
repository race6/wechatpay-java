// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import com.google.gson.annotations.SerializedName;

/** JumpTarget */
public enum JumpTarget {
  @SerializedName("PAYMENT_CODE")
  PAYMENT_CODE,

  @SerializedName("MINI_PROGRAM")
  MINI_PROGRAM,

  @SerializedName("DEFAULT_PAGE")
  DEFAULT_PAGE
}
