package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/AssetCreateRequestBody;", "", "fileSize", "", "mediaType", "", "(JLjava/lang/String;)V", "getFileSize", "()J", "getMediaType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AssetCreateRequestBody {
    @JsonProperty("file_size")
    @InterfaceC41208ft5("file_size")
    private final long fileSize;
    @JsonProperty("media_type")
    @InterfaceC41208ft5("media_type")
    private final String mediaType;

    public AssetCreateRequestBody(long j, String mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.fileSize = j;
        this.mediaType = mediaType;
    }

    public static /* synthetic */ AssetCreateRequestBody copy$default(AssetCreateRequestBody assetCreateRequestBody, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = assetCreateRequestBody.fileSize;
        }
        if ((i & 2) != 0) {
            str = assetCreateRequestBody.mediaType;
        }
        return assetCreateRequestBody.copy(j, str);
    }

    public final long component1() {
        return this.fileSize;
    }

    public final String component2() {
        return this.mediaType;
    }

    public final AssetCreateRequestBody copy(long j, String mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new AssetCreateRequestBody(j, mediaType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetCreateRequestBody) {
            AssetCreateRequestBody assetCreateRequestBody = (AssetCreateRequestBody) obj;
            return this.fileSize == assetCreateRequestBody.fileSize && Intrinsics.areEqual(this.mediaType, assetCreateRequestBody.mediaType);
        }
        return false;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return (Long.hashCode(this.fileSize) * 31) + this.mediaType.hashCode();
    }

    public String toString() {
        long j = this.fileSize;
        String str = this.mediaType;
        return "AssetCreateRequestBody(fileSize=" + j + ", mediaType=" + str + ")";
    }
}
