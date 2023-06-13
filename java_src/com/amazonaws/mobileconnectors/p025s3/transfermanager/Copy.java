package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.model.CopyResult;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.Copy */
/* loaded from: classes2.dex */
public interface Copy extends Transfer {
    CopyResult waitForCopyResult() throws AmazonClientException, AmazonServiceException, InterruptedException;
}
