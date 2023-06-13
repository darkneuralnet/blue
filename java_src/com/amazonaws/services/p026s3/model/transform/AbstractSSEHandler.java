package com.amazonaws.services.p026s3.model.transform;

import com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult;
/* renamed from: com.amazonaws.services.s3.model.transform.AbstractSSEHandler */
/* loaded from: classes3.dex */
abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public String getSSEAlgorithm() {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult == null) {
            return null;
        }
        return sseResult.getSSEAlgorithm();
    }

    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public String getSSECustomerAlgorithm() {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult == null) {
            return null;
        }
        return sseResult.getSSECustomerAlgorithm();
    }

    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public String getSSECustomerKeyMd5() {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult == null) {
            return null;
        }
        return sseResult.getSSECustomerKeyMd5();
    }

    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public final void setSSEAlgorithm(String str) {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult != null) {
            sseResult.setSSEAlgorithm(str);
        }
    }

    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerAlgorithm(String str) {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult != null) {
            sseResult.setSSECustomerAlgorithm(str);
        }
    }

    @Override // com.amazonaws.services.p026s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerKeyMd5(String str) {
        ServerSideEncryptionResult sseResult = sseResult();
        if (sseResult != null) {
            sseResult.setSSECustomerKeyMd5(str);
        }
    }

    public abstract ServerSideEncryptionResult sseResult();
}
