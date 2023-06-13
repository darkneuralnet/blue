package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/HardCountCreateRequest;", "", "hardCountId", "", "scanIdentifier", "prevScanIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHardCountId", "()Ljava/lang/String;", "getPrevScanIdentifier", "getScanIdentifier", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HardCountCreateRequest {
    @JsonProperty("hard_count_id")
    @InterfaceC41208ft5("hard_count_id")
    private final String hardCountId;
    @JsonProperty("prev_scan_identifier")
    @InterfaceC41208ft5("prev_scan_identifier")
    private final String prevScanIdentifier;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;

    public HardCountCreateRequest(String hardCountId, String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        this.hardCountId = hardCountId;
        this.scanIdentifier = scanIdentifier;
        this.prevScanIdentifier = str;
    }

    public static /* synthetic */ HardCountCreateRequest copy$default(HardCountCreateRequest hardCountCreateRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hardCountCreateRequest.hardCountId;
        }
        if ((i & 2) != 0) {
            str2 = hardCountCreateRequest.scanIdentifier;
        }
        if ((i & 4) != 0) {
            str3 = hardCountCreateRequest.prevScanIdentifier;
        }
        return hardCountCreateRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.hardCountId;
    }

    public final String component2() {
        return this.scanIdentifier;
    }

    public final String component3() {
        return this.prevScanIdentifier;
    }

    public final HardCountCreateRequest copy(String hardCountId, String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return new HardCountCreateRequest(hardCountId, scanIdentifier, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardCountCreateRequest) {
            HardCountCreateRequest hardCountCreateRequest = (HardCountCreateRequest) obj;
            return Intrinsics.areEqual(this.hardCountId, hardCountCreateRequest.hardCountId) && Intrinsics.areEqual(this.scanIdentifier, hardCountCreateRequest.scanIdentifier) && Intrinsics.areEqual(this.prevScanIdentifier, hardCountCreateRequest.prevScanIdentifier);
        }
        return false;
    }

    public final String getHardCountId() {
        return this.hardCountId;
    }

    public final String getPrevScanIdentifier() {
        return this.prevScanIdentifier;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public int hashCode() {
        int hashCode = ((this.hardCountId.hashCode() * 31) + this.scanIdentifier.hashCode()) * 31;
        String str = this.prevScanIdentifier;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.hardCountId;
        String str2 = this.scanIdentifier;
        String str3 = this.prevScanIdentifier;
        return "HardCountCreateRequest(hardCountId=" + str + ", scanIdentifier=" + str2 + ", prevScanIdentifier=" + str3 + ")";
    }

    public /* synthetic */ HardCountCreateRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
