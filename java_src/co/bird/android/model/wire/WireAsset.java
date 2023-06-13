package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireAsset;", "", "id", "", "fileSize", "", "mediaType", "createdBy", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCreatedBy", "()Ljava/lang/String;", "getFileSize", "()J", "getId", "getMediaType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAsset {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("created_by")
    @InterfaceC41208ft5("created_by")
    private final String createdBy;
    @JsonProperty("file_size")
    @InterfaceC41208ft5("file_size")
    private final long fileSize;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66715id;
    @JsonProperty("media_type")
    @InterfaceC41208ft5("media_type")
    private final String mediaType;

    public WireAsset() {
        this(null, 0L, null, null, null, 31, null);
    }

    public static /* synthetic */ WireAsset copy$default(WireAsset wireAsset, String str, long j, String str2, String str3, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireAsset.f66715id;
        }
        if ((i & 2) != 0) {
            j = wireAsset.fileSize;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = wireAsset.mediaType;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = wireAsset.createdBy;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            dateTime = wireAsset.createdAt;
        }
        return wireAsset.copy(str, j2, str4, str5, dateTime);
    }

    public final String component1() {
        return this.f66715id;
    }

    public final long component2() {
        return this.fileSize;
    }

    public final String component3() {
        return this.mediaType;
    }

    public final String component4() {
        return this.createdBy;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final WireAsset copy(String id, long j, String str, String createdBy, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireAsset(id, j, str, createdBy, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAsset) {
            WireAsset wireAsset = (WireAsset) obj;
            return Intrinsics.areEqual(this.f66715id, wireAsset.f66715id) && this.fileSize == wireAsset.fileSize && Intrinsics.areEqual(this.mediaType, wireAsset.mediaType) && Intrinsics.areEqual(this.createdBy, wireAsset.createdBy) && Intrinsics.areEqual(this.createdAt, wireAsset.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.f66715id;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        int hashCode = ((this.f66715id.hashCode() * 31) + Long.hashCode(this.fileSize)) * 31;
        String str = this.mediaType;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdBy.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66715id;
        long j = this.fileSize;
        String str2 = this.mediaType;
        String str3 = this.createdBy;
        DateTime dateTime = this.createdAt;
        return "WireAsset(id=" + str + ", fileSize=" + j + ", mediaType=" + str2 + ", createdBy=" + str3 + ", createdAt=" + dateTime + ")";
    }

    public WireAsset(String id, long j, String str, String createdBy, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66715id = id;
        this.fileSize = j;
        this.mediaType = str;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireAsset(String str, long j, String str2, String str3, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, r1, r3, r0, dateTime);
        String str4 = (i & 1) != 0 ? "" : str;
        long j2 = (i & 2) != 0 ? 0L : j;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) == 0 ? str3 : "";
        if ((i & 16) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
