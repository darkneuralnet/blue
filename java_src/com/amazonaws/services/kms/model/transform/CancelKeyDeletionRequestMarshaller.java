package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.CancelKeyDeletionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
/* loaded from: classes3.dex */
public class CancelKeyDeletionRequestMarshaller implements Marshaller<Request<CancelKeyDeletionRequest>, CancelKeyDeletionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CancelKeyDeletionRequest> marshall(CancelKeyDeletionRequest cancelKeyDeletionRequest) {
        if (cancelKeyDeletionRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(cancelKeyDeletionRequest, "AWSKMS");
            defaultRequest.addHeader("X-Amz-Target", "TrentService.CancelKeyDeletion");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (cancelKeyDeletionRequest.getKeyId() != null) {
                    String keyId = cancelKeyDeletionRequest.getKeyId();
                    jsonWriter.name("KeyId");
                    jsonWriter.value(keyId);
                }
                jsonWriter.endObject();
                jsonWriter.close();
                String stringWriter2 = stringWriter.toString();
                byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
                defaultRequest.setContent(new StringInputStream(stringWriter2));
                defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
                if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                    defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
                }
                return defaultRequest;
            } catch (Throwable th) {
                throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
            }
        }
        throw new AmazonClientException("Invalid argument passed to marshall(CancelKeyDeletionRequest)");
    }
}