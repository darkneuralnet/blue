package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/WireItemLeaseStartRequest;", "", "habitatId", "", "leaseType", "leasedItemId", "associatedItemId", "paymentAuth", "Lco/bird/api/request/WirePaymentAuthRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V", "getAssociatedItemId", "()Ljava/lang/String;", "getHabitatId", "getLeaseType", "getLeasedItemId", "getPaymentAuth", "()Lco/bird/api/request/WirePaymentAuthRequest;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireItemLeaseStartRequest {
    @JsonProperty("associated_item_id")
    @InterfaceC41208ft5("associated_item_id")
    private final String associatedItemId;
    @JsonProperty("habitat_id")
    @InterfaceC41208ft5("habitat_id")
    private final String habitatId;
    @JsonProperty("lease_type")
    @InterfaceC41208ft5("lease_type")
    private final String leaseType;
    @JsonProperty("leased_item_id")
    @InterfaceC41208ft5("leased_item_id")
    private final String leasedItemId;
    @JsonProperty("payment_auth")
    @InterfaceC41208ft5("payment_auth")
    private final WirePaymentAuthRequest paymentAuth;

    public WireItemLeaseStartRequest(String habitatId, String leaseType, String leasedItemId, String str, WirePaymentAuthRequest wirePaymentAuthRequest) {
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(leasedItemId, "leasedItemId");
        this.habitatId = habitatId;
        this.leaseType = leaseType;
        this.leasedItemId = leasedItemId;
        this.associatedItemId = str;
        this.paymentAuth = wirePaymentAuthRequest;
    }

    public static /* synthetic */ WireItemLeaseStartRequest copy$default(WireItemLeaseStartRequest wireItemLeaseStartRequest, String str, String str2, String str3, String str4, WirePaymentAuthRequest wirePaymentAuthRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireItemLeaseStartRequest.habitatId;
        }
        if ((i & 2) != 0) {
            str2 = wireItemLeaseStartRequest.leaseType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireItemLeaseStartRequest.leasedItemId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = wireItemLeaseStartRequest.associatedItemId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            wirePaymentAuthRequest = wireItemLeaseStartRequest.paymentAuth;
        }
        return wireItemLeaseStartRequest.copy(str, str5, str6, str7, wirePaymentAuthRequest);
    }

    public final String component1() {
        return this.habitatId;
    }

    public final String component2() {
        return this.leaseType;
    }

    public final String component3() {
        return this.leasedItemId;
    }

    public final String component4() {
        return this.associatedItemId;
    }

    public final WirePaymentAuthRequest component5() {
        return this.paymentAuth;
    }

    public final WireItemLeaseStartRequest copy(String habitatId, String leaseType, String leasedItemId, String str, WirePaymentAuthRequest wirePaymentAuthRequest) {
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(leasedItemId, "leasedItemId");
        return new WireItemLeaseStartRequest(habitatId, leaseType, leasedItemId, str, wirePaymentAuthRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireItemLeaseStartRequest) {
            WireItemLeaseStartRequest wireItemLeaseStartRequest = (WireItemLeaseStartRequest) obj;
            return Intrinsics.areEqual(this.habitatId, wireItemLeaseStartRequest.habitatId) && Intrinsics.areEqual(this.leaseType, wireItemLeaseStartRequest.leaseType) && Intrinsics.areEqual(this.leasedItemId, wireItemLeaseStartRequest.leasedItemId) && Intrinsics.areEqual(this.associatedItemId, wireItemLeaseStartRequest.associatedItemId) && Intrinsics.areEqual(this.paymentAuth, wireItemLeaseStartRequest.paymentAuth);
        }
        return false;
    }

    public final String getAssociatedItemId() {
        return this.associatedItemId;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }

    public final String getLeaseType() {
        return this.leaseType;
    }

    public final String getLeasedItemId() {
        return this.leasedItemId;
    }

    public final WirePaymentAuthRequest getPaymentAuth() {
        return this.paymentAuth;
    }

    public int hashCode() {
        int hashCode = ((((this.habitatId.hashCode() * 31) + this.leaseType.hashCode()) * 31) + this.leasedItemId.hashCode()) * 31;
        String str = this.associatedItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WirePaymentAuthRequest wirePaymentAuthRequest = this.paymentAuth;
        return hashCode2 + (wirePaymentAuthRequest != null ? wirePaymentAuthRequest.hashCode() : 0);
    }

    public String toString() {
        String str = this.habitatId;
        String str2 = this.leaseType;
        String str3 = this.leasedItemId;
        String str4 = this.associatedItemId;
        WirePaymentAuthRequest wirePaymentAuthRequest = this.paymentAuth;
        return "WireItemLeaseStartRequest(habitatId=" + str + ", leaseType=" + str2 + ", leasedItemId=" + str3 + ", associatedItemId=" + str4 + ", paymentAuth=" + wirePaymentAuthRequest + ")";
    }

    public /* synthetic */ WireItemLeaseStartRequest(String str, String str2, String str3, String str4, WirePaymentAuthRequest wirePaymentAuthRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : wirePaymentAuthRequest);
    }
}
