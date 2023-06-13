package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/request/RequestNestBody;", "", "businessName", "", "latitude", "", "longitude", "wouldRecharge", "", "(Ljava/lang/String;DDZ)V", "getBusinessName", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "getWouldRecharge", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RequestNestBody {
    @JsonProperty("business_name")
    @InterfaceC41208ft5("business_name")
    private final String businessName;
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")
    private final double longitude;
    @JsonProperty("would_recharge")
    @InterfaceC41208ft5("would_recharge")
    private final boolean wouldRecharge;

    public RequestNestBody(String businessName, double d, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        this.businessName = businessName;
        this.latitude = d;
        this.longitude = d2;
        this.wouldRecharge = z;
    }

    public static /* synthetic */ RequestNestBody copy$default(RequestNestBody requestNestBody, String str, double d, double d2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestNestBody.businessName;
        }
        if ((i & 2) != 0) {
            d = requestNestBody.latitude;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = requestNestBody.longitude;
        }
        double d4 = d2;
        if ((i & 8) != 0) {
            z = requestNestBody.wouldRecharge;
        }
        return requestNestBody.copy(str, d3, d4, z);
    }

    public final String component1() {
        return this.businessName;
    }

    public final double component2() {
        return this.latitude;
    }

    public final double component3() {
        return this.longitude;
    }

    public final boolean component4() {
        return this.wouldRecharge;
    }

    public final RequestNestBody copy(String businessName, double d, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        return new RequestNestBody(businessName, d, d2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestNestBody) {
            RequestNestBody requestNestBody = (RequestNestBody) obj;
            return Intrinsics.areEqual(this.businessName, requestNestBody.businessName) && Double.compare(this.latitude, requestNestBody.latitude) == 0 && Double.compare(this.longitude, requestNestBody.longitude) == 0 && this.wouldRecharge == requestNestBody.wouldRecharge;
        }
        return false;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean getWouldRecharge() {
        return this.wouldRecharge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.businessName.hashCode() * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31;
        boolean z = this.wouldRecharge;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.businessName;
        double d = this.latitude;
        double d2 = this.longitude;
        boolean z = this.wouldRecharge;
        return "RequestNestBody(businessName=" + str + ", latitude=" + d + ", longitude=" + d2 + ", wouldRecharge=" + z + ")";
    }
}
