package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/WireLeaseItemAvailabilityRequest;", "", "leaseType", "", "itemId", "associatedItemId", "present", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAssociatedItemId", "()Ljava/lang/String;", "getItemId", "getLeaseType", "getPresent", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseItemAvailabilityRequest {
    @JsonProperty("associated_item_id")
    @InterfaceC41208ft5("associated_item_id")
    private final String associatedItemId;
    @JsonProperty("item_id")
    @InterfaceC41208ft5("item_id")
    private final String itemId;
    @JsonProperty("lease_type")
    @InterfaceC41208ft5("lease_type")
    private final String leaseType;
    @JsonProperty("present")
    @InterfaceC41208ft5("present")
    private final boolean present;

    public WireLeaseItemAvailabilityRequest(String leaseType, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        this.leaseType = leaseType;
        this.itemId = str;
        this.associatedItemId = str2;
        this.present = z;
    }

    public static /* synthetic */ WireLeaseItemAvailabilityRequest copy$default(WireLeaseItemAvailabilityRequest wireLeaseItemAvailabilityRequest, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseItemAvailabilityRequest.leaseType;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseItemAvailabilityRequest.itemId;
        }
        if ((i & 4) != 0) {
            str3 = wireLeaseItemAvailabilityRequest.associatedItemId;
        }
        if ((i & 8) != 0) {
            z = wireLeaseItemAvailabilityRequest.present;
        }
        return wireLeaseItemAvailabilityRequest.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.leaseType;
    }

    public final String component2() {
        return this.itemId;
    }

    public final String component3() {
        return this.associatedItemId;
    }

    public final boolean component4() {
        return this.present;
    }

    public final WireLeaseItemAvailabilityRequest copy(String leaseType, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        return new WireLeaseItemAvailabilityRequest(leaseType, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseItemAvailabilityRequest) {
            WireLeaseItemAvailabilityRequest wireLeaseItemAvailabilityRequest = (WireLeaseItemAvailabilityRequest) obj;
            return Intrinsics.areEqual(this.leaseType, wireLeaseItemAvailabilityRequest.leaseType) && Intrinsics.areEqual(this.itemId, wireLeaseItemAvailabilityRequest.itemId) && Intrinsics.areEqual(this.associatedItemId, wireLeaseItemAvailabilityRequest.associatedItemId) && this.present == wireLeaseItemAvailabilityRequest.present;
        }
        return false;
    }

    public final String getAssociatedItemId() {
        return this.associatedItemId;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getLeaseType() {
        return this.leaseType;
    }

    public final boolean getPresent() {
        return this.present;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.leaseType.hashCode() * 31;
        String str = this.itemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.associatedItemId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.present;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.leaseType;
        String str2 = this.itemId;
        String str3 = this.associatedItemId;
        boolean z = this.present;
        return "WireLeaseItemAvailabilityRequest(leaseType=" + str + ", itemId=" + str2 + ", associatedItemId=" + str3 + ", present=" + z + ")";
    }
}
