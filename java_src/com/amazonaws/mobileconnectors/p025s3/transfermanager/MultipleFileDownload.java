package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import java.io.IOException;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.MultipleFileDownload */
/* loaded from: classes2.dex */
public interface MultipleFileDownload extends Transfer {
    void abort() throws IOException;

    String getBucketName();

    String getKeyPrefix();
}
