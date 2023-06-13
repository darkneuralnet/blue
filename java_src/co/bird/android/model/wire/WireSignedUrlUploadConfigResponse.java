package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;", "", "fileUrlSigned", "", "fileUrl", "assetId", "expiration", "Lorg/joda/time/DateTime;", "method", "headers", "", "shouldGzip", "", "bucket", "key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getBucket", "getExpiration", "()Lorg/joda/time/DateTime;", "getFileUrl", "getFileUrlSigned", "getHeaders", "()Ljava/util/Map;", "getKey", "getMethod", "getShouldGzip", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSignedUrlUploadConfigResponse {
    private final String assetId;
    private final String bucket;
    private final DateTime expiration;
    private final String fileUrl;
    private final String fileUrlSigned;
    private final Map<String, String> headers;
    private final String key;
    private final String method;
    private final boolean shouldGzip;

    public WireSignedUrlUploadConfigResponse(String fileUrlSigned, String fileUrl, String assetId, DateTime expiration, String method, Map<String, String> headers, boolean z, String bucket, String key) {
        Intrinsics.checkNotNullParameter(fileUrlSigned, "fileUrlSigned");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(key, "key");
        this.fileUrlSigned = fileUrlSigned;
        this.fileUrl = fileUrl;
        this.assetId = assetId;
        this.expiration = expiration;
        this.method = method;
        this.headers = headers;
        this.shouldGzip = z;
        this.bucket = bucket;
        this.key = key;
    }

    public final String component1() {
        return this.fileUrlSigned;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final String component3() {
        return this.assetId;
    }

    public final DateTime component4() {
        return this.expiration;
    }

    public final String component5() {
        return this.method;
    }

    public final Map<String, String> component6() {
        return this.headers;
    }

    public final boolean component7() {
        return this.shouldGzip;
    }

    public final String component8() {
        return this.bucket;
    }

    public final String component9() {
        return this.key;
    }

    public final WireSignedUrlUploadConfigResponse copy(String fileUrlSigned, String fileUrl, String assetId, DateTime expiration, String method, Map<String, String> headers, boolean z, String bucket, String key) {
        Intrinsics.checkNotNullParameter(fileUrlSigned, "fileUrlSigned");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WireSignedUrlUploadConfigResponse(fileUrlSigned, fileUrl, assetId, expiration, method, headers, z, bucket, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSignedUrlUploadConfigResponse) {
            WireSignedUrlUploadConfigResponse wireSignedUrlUploadConfigResponse = (WireSignedUrlUploadConfigResponse) obj;
            return Intrinsics.areEqual(this.fileUrlSigned, wireSignedUrlUploadConfigResponse.fileUrlSigned) && Intrinsics.areEqual(this.fileUrl, wireSignedUrlUploadConfigResponse.fileUrl) && Intrinsics.areEqual(this.assetId, wireSignedUrlUploadConfigResponse.assetId) && Intrinsics.areEqual(this.expiration, wireSignedUrlUploadConfigResponse.expiration) && Intrinsics.areEqual(this.method, wireSignedUrlUploadConfigResponse.method) && Intrinsics.areEqual(this.headers, wireSignedUrlUploadConfigResponse.headers) && this.shouldGzip == wireSignedUrlUploadConfigResponse.shouldGzip && Intrinsics.areEqual(this.bucket, wireSignedUrlUploadConfigResponse.bucket) && Intrinsics.areEqual(this.key, wireSignedUrlUploadConfigResponse.key);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final DateTime getExpiration() {
        return this.expiration;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getFileUrlSigned() {
        return this.fileUrlSigned;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMethod() {
        return this.method;
    }

    public final boolean getShouldGzip() {
        return this.shouldGzip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.fileUrlSigned.hashCode() * 31) + this.fileUrl.hashCode()) * 31) + this.assetId.hashCode()) * 31) + this.expiration.hashCode()) * 31) + this.method.hashCode()) * 31) + this.headers.hashCode()) * 31;
        boolean z = this.shouldGzip;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.bucket.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        String str = this.fileUrlSigned;
        String str2 = this.fileUrl;
        String str3 = this.assetId;
        DateTime dateTime = this.expiration;
        String str4 = this.method;
        Map<String, String> map = this.headers;
        boolean z = this.shouldGzip;
        String str5 = this.bucket;
        String str6 = this.key;
        return "WireSignedUrlUploadConfigResponse(fileUrlSigned=" + str + ", fileUrl=" + str2 + ", assetId=" + str3 + ", expiration=" + dateTime + ", method=" + str4 + ", headers=" + map + ", shouldGzip=" + z + ", bucket=" + str5 + ", key=" + str6 + ")";
    }
}
