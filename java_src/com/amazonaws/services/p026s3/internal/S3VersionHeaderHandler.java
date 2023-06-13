package com.amazonaws.services.p026s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.internal.S3VersionResult;
/* renamed from: com.amazonaws.services.s3.internal.S3VersionHeaderHandler */
/* loaded from: classes3.dex */
public class S3VersionHeaderHandler<T extends S3VersionResult> implements HeaderHandler<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.p026s3.internal.HeaderHandler
    public /* bridge */ /* synthetic */ void handle(Object obj, HttpResponse httpResponse) {
        handle((S3VersionHeaderHandler<T>) ((S3VersionResult) obj), httpResponse);
    }

    public void handle(T t, HttpResponse httpResponse) {
        t.setVersionId(httpResponse.getHeaders().get(Headers.S3_VERSION_ID));
    }
}
