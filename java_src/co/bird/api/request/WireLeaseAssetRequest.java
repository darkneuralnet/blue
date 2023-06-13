package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006#"}, m28432d2 = {"Lco/bird/api/request/WireLeaseAssetRequest;", "", "leaseId", "", "purpose", "fileSize", "", "mimeType", "autoScanned", "", "autoScannedCodes", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;)V", "getAutoScanned", "()Z", "getAutoScannedCodes", "()Ljava/util/List;", "getFileSize", "()J", "getLeaseId", "()Ljava/lang/String;", "getMimeType", "getPurpose", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseAssetRequest {
    @JsonProperty("auto_scanned")
    @InterfaceC41208ft5("auto_scanned")
    private final boolean autoScanned;
    @JsonProperty("auto_scanned_codes")
    @InterfaceC41208ft5("auto_scanned_codes")
    private final List<String> autoScannedCodes;
    @JsonProperty("file_size")
    @InterfaceC41208ft5("file_size")
    private final long fileSize;
    @JsonProperty("lease_id")
    @InterfaceC41208ft5("lease_id")
    private final String leaseId;
    @JsonProperty("mime_type")
    @InterfaceC41208ft5("mime_type")
    private final String mimeType;
    @JsonProperty("purpose")
    @InterfaceC41208ft5("purpose")
    private final String purpose;

    public WireLeaseAssetRequest(String leaseId, String purpose, long j, String mimeType, boolean z, List<String> list) {
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.leaseId = leaseId;
        this.purpose = purpose;
        this.fileSize = j;
        this.mimeType = mimeType;
        this.autoScanned = z;
        this.autoScannedCodes = list;
    }

    public static /* synthetic */ WireLeaseAssetRequest copy$default(WireLeaseAssetRequest wireLeaseAssetRequest, String str, String str2, long j, String str3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseAssetRequest.leaseId;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseAssetRequest.purpose;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = wireLeaseAssetRequest.fileSize;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = wireLeaseAssetRequest.mimeType;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = wireLeaseAssetRequest.autoScanned;
        }
        boolean z2 = z;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = wireLeaseAssetRequest.autoScannedCodes;
        }
        return wireLeaseAssetRequest.copy(str, str4, j2, str5, z2, list2);
    }

    public final String component1() {
        return this.leaseId;
    }

    public final String component2() {
        return this.purpose;
    }

    public final long component3() {
        return this.fileSize;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final boolean component5() {
        return this.autoScanned;
    }

    public final List<String> component6() {
        return this.autoScannedCodes;
    }

    public final WireLeaseAssetRequest copy(String leaseId, String purpose, long j, String mimeType, boolean z, List<String> list) {
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new WireLeaseAssetRequest(leaseId, purpose, j, mimeType, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseAssetRequest) {
            WireLeaseAssetRequest wireLeaseAssetRequest = (WireLeaseAssetRequest) obj;
            return Intrinsics.areEqual(this.leaseId, wireLeaseAssetRequest.leaseId) && Intrinsics.areEqual(this.purpose, wireLeaseAssetRequest.purpose) && this.fileSize == wireLeaseAssetRequest.fileSize && Intrinsics.areEqual(this.mimeType, wireLeaseAssetRequest.mimeType) && this.autoScanned == wireLeaseAssetRequest.autoScanned && Intrinsics.areEqual(this.autoScannedCodes, wireLeaseAssetRequest.autoScannedCodes);
        }
        return false;
    }

    public final boolean getAutoScanned() {
        return this.autoScanned;
    }

    public final List<String> getAutoScannedCodes() {
        return this.autoScannedCodes;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.leaseId.hashCode() * 31) + this.purpose.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + this.mimeType.hashCode()) * 31;
        boolean z = this.autoScanned;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        List<String> list = this.autoScannedCodes;
        return i2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.leaseId;
        String str2 = this.purpose;
        long j = this.fileSize;
        String str3 = this.mimeType;
        boolean z = this.autoScanned;
        List<String> list = this.autoScannedCodes;
        return "WireLeaseAssetRequest(leaseId=" + str + ", purpose=" + str2 + ", fileSize=" + j + ", mimeType=" + str3 + ", autoScanned=" + z + ", autoScannedCodes=" + list + ")";
    }

    public /* synthetic */ WireLeaseAssetRequest(String str, String str2, long j, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, z, (i & 32) != 0 ? null : list);
    }
}
