package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.model.CopyPartRequest;
import com.amazonaws.services.p026s3.model.PartETag;
import java.util.concurrent.Callable;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.CopyPartCallable */
/* loaded from: classes2.dex */
public class CopyPartCallable implements Callable<PartETag> {
    private final CopyPartRequest request;

    /* renamed from: s3 */
    private final AmazonS3 f68565s3;

    public CopyPartCallable(AmazonS3 amazonS3, CopyPartRequest copyPartRequest) {
        this.f68565s3 = amazonS3;
        this.request = copyPartRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public PartETag call() throws Exception {
        return this.f68565s3.copyPart(this.request).getPartETag();
    }
}
