package com.amazonaws.services.p026s3.model.transform;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.p026s3.model.HeadBucketResult;
/* renamed from: com.amazonaws.services.s3.model.transform.HeadBucketResultHandler */
/* loaded from: classes3.dex */
public class HeadBucketResultHandler extends AbstractS3ResponseHandler<HeadBucketResult> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<HeadBucketResult> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<HeadBucketResult> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        HeadBucketResult headBucketResult = new HeadBucketResult();
        headBucketResult.setBucketRegion(httpResponse.getHeaders().get(Headers.S3_BUCKET_REGION));
        amazonWebServiceResponse.setResult(headBucketResult);
        return amazonWebServiceResponse;
    }
}