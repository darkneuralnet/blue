package com.amazonaws.services.p026s3.internal;
/* renamed from: com.amazonaws.services.s3.internal.ServerSideEncryptionResult */
/* loaded from: classes3.dex */
public interface ServerSideEncryptionResult {
    String getSSEAlgorithm();

    String getSSECustomerAlgorithm();

    String getSSECustomerKeyMd5();

    void setSSEAlgorithm(String str);

    void setSSECustomerAlgorithm(String str);

    void setSSECustomerKeyMd5(String str);
}
