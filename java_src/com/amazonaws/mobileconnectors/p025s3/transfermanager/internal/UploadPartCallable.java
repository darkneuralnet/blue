package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.model.PartETag;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import java.util.concurrent.Callable;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.UploadPartCallable */
/* loaded from: classes2.dex */
public class UploadPartCallable implements Callable<PartETag> {
    private final UploadPartRequest request;

    /* renamed from: s3 */
    private final AmazonS3 f68569s3;

    public UploadPartCallable(AmazonS3 amazonS3, UploadPartRequest uploadPartRequest) {
        this.f68569s3 = amazonS3;
        this.request = uploadPartRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public PartETag call() throws Exception {
        return this.f68569s3.uploadPart(this.request).getPartETag();
    }
}
