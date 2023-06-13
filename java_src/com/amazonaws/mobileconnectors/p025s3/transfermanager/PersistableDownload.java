package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import com.amazonaws.services.p026s3.model.ResponseHeaderOverrides;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.IOException;
import java.io.StringWriter;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.PersistableDownload */
/* loaded from: classes2.dex */
public final class PersistableDownload extends PersistableTransfer {
    static final String TYPE = "download";
    private final String bucketName;
    private final String file;
    private final boolean isRequesterPays;
    private final String key;
    private final String pauseType;
    private final long[] range;
    private final ResponseHeaderOverrides responseHeaders;
    private final String versionId;

    @Deprecated
    public PersistableDownload() {
        this(null, null, null, null, null, false, null);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getFile() {
        return this.file;
    }

    public String getKey() {
        return this.key;
    }

    public String getPauseType() {
        return TYPE;
    }

    public long[] getRange() {
        long[] jArr = this.range;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public ResponseHeaderOverrides getResponseHeaders() {
        return this.responseHeaders;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    @Override // com.amazonaws.mobileconnectors.p025s3.transfermanager.PersistableTransfer
    public String serialize() {
        StringWriter stringWriter = new StringWriter();
        AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
        try {
            jsonWriter.beginObject().name("pauseType").value(TYPE).name("bucketName").value(this.bucketName).name("key").value(this.key).name("file").value(this.file).name("versionId").value(this.versionId).name("isRequesterPays").value(this.isRequesterPays);
            if (this.range != null) {
                jsonWriter.name("range").beginArray();
                for (long j : this.range) {
                    jsonWriter.value(j);
                }
                jsonWriter.endArray();
            }
            if (this.responseHeaders != null) {
                jsonWriter.name("responseHeaders").beginObject().name("contentType").value(this.responseHeaders.getContentType()).name("contentLanguage").value(this.responseHeaders.getContentLanguage()).name("expires").value(this.responseHeaders.getExpires()).name("cacheControl").value(this.responseHeaders.getCacheControl()).name("contentDisposition").value(this.responseHeaders.getContentDisposition()).name("contentEncoding").value(this.responseHeaders.getContentEncoding()).endObject();
            }
            jsonWriter.endObject().close();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public PersistableDownload(String str, String str2, String str3, long[] jArr, ResponseHeaderOverrides responseHeaderOverrides, boolean z, String str4) {
        this.pauseType = TYPE;
        this.bucketName = str;
        this.key = str2;
        this.versionId = str3;
        this.range = jArr == null ? null : (long[]) jArr.clone();
        this.responseHeaders = responseHeaderOverrides;
        this.isRequesterPays = z;
        this.file = str4;
    }
}
