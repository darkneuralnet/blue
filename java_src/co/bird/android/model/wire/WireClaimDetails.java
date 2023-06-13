package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClaimStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireClaimDetails;", "", "status", "Lco/bird/android/model/constant/ClaimStatus;", "spaces", "", "claimId", "", "(Lco/bird/android/model/constant/ClaimStatus;ILjava/lang/String;)V", "getClaimId", "()Ljava/lang/String;", "getSpaces", "()I", "getStatus", "()Lco/bird/android/model/constant/ClaimStatus;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireClaimDetails {
    @JsonProperty("claim_id")
    @InterfaceC41208ft5("claim_id")
    private final String claimId;
    @JsonProperty("spaces")
    @InterfaceC41208ft5("spaces")
    private final int spaces;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ClaimStatus status;

    public WireClaimDetails() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ WireClaimDetails copy$default(WireClaimDetails wireClaimDetails, ClaimStatus claimStatus, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            claimStatus = wireClaimDetails.status;
        }
        if ((i2 & 2) != 0) {
            i = wireClaimDetails.spaces;
        }
        if ((i2 & 4) != 0) {
            str = wireClaimDetails.claimId;
        }
        return wireClaimDetails.copy(claimStatus, i, str);
    }

    public final ClaimStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.spaces;
    }

    public final String component3() {
        return this.claimId;
    }

    public final WireClaimDetails copy(ClaimStatus status, int i, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new WireClaimDetails(status, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireClaimDetails) {
            WireClaimDetails wireClaimDetails = (WireClaimDetails) obj;
            return this.status == wireClaimDetails.status && this.spaces == wireClaimDetails.spaces && Intrinsics.areEqual(this.claimId, wireClaimDetails.claimId);
        }
        return false;
    }

    public final String getClaimId() {
        return this.claimId;
    }

    public final int getSpaces() {
        return this.spaces;
    }

    public final ClaimStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.status.hashCode() * 31) + Integer.hashCode(this.spaces)) * 31;
        String str = this.claimId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ClaimStatus claimStatus = this.status;
        int i = this.spaces;
        String str = this.claimId;
        return "WireClaimDetails(status=" + claimStatus + ", spaces=" + i + ", claimId=" + str + ")";
    }

    public WireClaimDetails(ClaimStatus status, int i, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.spaces = i;
        this.claimId = str;
    }

    public /* synthetic */ WireClaimDetails(ClaimStatus claimStatus, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClaimStatus.UNKNOWN : claimStatus, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
