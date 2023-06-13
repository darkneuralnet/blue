package com.amazonaws.services.p026s3;

import com.amazonaws.ResponseMetadata;
import java.util.Map;
/* renamed from: com.amazonaws.services.s3.S3ResponseMetadata */
/* loaded from: classes3.dex */
public class S3ResponseMetadata extends ResponseMetadata {
    public static final String CLOUD_FRONT_ID = "CLOUD_FRONT_ID";
    public static final String HOST_ID = "HOST_ID";

    public S3ResponseMetadata(Map<String, String> map) {
        super(map);
    }

    public String getCloudFrontId() {
        return this.metadata.get(CLOUD_FRONT_ID);
    }

    public String getHostId() {
        return this.metadata.get(HOST_ID);
    }

    public S3ResponseMetadata(ResponseMetadata responseMetadata) {
        super(responseMetadata);
    }
}
