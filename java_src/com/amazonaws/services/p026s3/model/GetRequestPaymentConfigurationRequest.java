package com.amazonaws.services.p026s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.GetRequestPaymentConfigurationRequest */
/* loaded from: classes3.dex */
public class GetRequestPaymentConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;

    public GetRequestPaymentConfigurationRequest(String str) {
        this.bucketName = str;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }
}
