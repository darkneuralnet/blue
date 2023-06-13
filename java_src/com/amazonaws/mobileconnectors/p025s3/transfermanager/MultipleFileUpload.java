package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import java.util.Collection;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.MultipleFileUpload */
/* loaded from: classes2.dex */
public interface MultipleFileUpload extends Transfer {
    String getBucketName();

    String getKeyPrefix();

    Collection<? extends Upload> getSubTransfers();
}
