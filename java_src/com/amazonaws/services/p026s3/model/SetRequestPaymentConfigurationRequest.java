package com.amazonaws.services.p026s3.model;

import com.amazonaws.AmazonWebServiceRequest;
/* renamed from: com.amazonaws.services.s3.model.SetRequestPaymentConfigurationRequest */
/* loaded from: classes3.dex */
public class SetRequestPaymentConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private RequestPaymentConfiguration configuration;

    public SetRequestPaymentConfigurationRequest(String str, RequestPaymentConfiguration requestPaymentConfiguration) {
        setBucketName(str);
        this.configuration = requestPaymentConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public RequestPaymentConfiguration getConfiguration() {
        return this.configuration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
        this.configuration = requestPaymentConfiguration;
    }
}
