package com.amazonaws.services.p026s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.model.SetObjectTaggingResult;
/* renamed from: com.amazonaws.services.s3.internal.SetObjectTaggingResponseHeaderHandler */
/* loaded from: classes3.dex */
public class SetObjectTaggingResponseHeaderHandler implements HeaderHandler<SetObjectTaggingResult> {
    @Override // com.amazonaws.services.p026s3.internal.HeaderHandler
    public void handle(SetObjectTaggingResult setObjectTaggingResult, HttpResponse httpResponse) {
        setObjectTaggingResult.setVersionId(httpResponse.getHeaders().get(Headers.S3_VERSION_ID));
    }
}
