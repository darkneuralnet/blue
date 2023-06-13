package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/request/UserMultipleNestsClaimRequest;", "", "request", "Lco/bird/api/request/MultipleNestsClaimRequest;", "multiClaimRequestEnabled", "", "multiClaimRequestBlocked", "remainingUnfulfilledRequestsBeforeBlock", "", "(Lco/bird/api/request/MultipleNestsClaimRequest;ZZI)V", "getMultiClaimRequestBlocked", "()Z", "getMultiClaimRequestEnabled", "getRemainingUnfulfilledRequestsBeforeBlock", "()I", "getRequest", "()Lco/bird/api/request/MultipleNestsClaimRequest;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserMultipleNestsClaimRequest {
    @JsonProperty("multi_claim_request_blocked")
    @InterfaceC41208ft5("multi_claim_request_blocked")
    private final boolean multiClaimRequestBlocked;
    @JsonProperty("multi_claim_request_enabled")
    @InterfaceC41208ft5("multi_claim_request_enabled")
    private final boolean multiClaimRequestEnabled;
    @JsonProperty("remaining_unfulfilled_requests_before_block")
    @InterfaceC41208ft5("remaining_unfulfilled_requests_before_block")
    private final int remainingUnfulfilledRequestsBeforeBlock;
    @JsonProperty("request")
    @InterfaceC41208ft5("request")
    private final MultipleNestsClaimRequest request;

    public UserMultipleNestsClaimRequest(MultipleNestsClaimRequest multipleNestsClaimRequest, boolean z, boolean z2, int i) {
        this.request = multipleNestsClaimRequest;
        this.multiClaimRequestEnabled = z;
        this.multiClaimRequestBlocked = z2;
        this.remainingUnfulfilledRequestsBeforeBlock = i;
    }

    public static /* synthetic */ UserMultipleNestsClaimRequest copy$default(UserMultipleNestsClaimRequest userMultipleNestsClaimRequest, MultipleNestsClaimRequest multipleNestsClaimRequest, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            multipleNestsClaimRequest = userMultipleNestsClaimRequest.request;
        }
        if ((i2 & 2) != 0) {
            z = userMultipleNestsClaimRequest.multiClaimRequestEnabled;
        }
        if ((i2 & 4) != 0) {
            z2 = userMultipleNestsClaimRequest.multiClaimRequestBlocked;
        }
        if ((i2 & 8) != 0) {
            i = userMultipleNestsClaimRequest.remainingUnfulfilledRequestsBeforeBlock;
        }
        return userMultipleNestsClaimRequest.copy(multipleNestsClaimRequest, z, z2, i);
    }

    public final MultipleNestsClaimRequest component1() {
        return this.request;
    }

    public final boolean component2() {
        return this.multiClaimRequestEnabled;
    }

    public final boolean component3() {
        return this.multiClaimRequestBlocked;
    }

    public final int component4() {
        return this.remainingUnfulfilledRequestsBeforeBlock;
    }

    public final UserMultipleNestsClaimRequest copy(MultipleNestsClaimRequest multipleNestsClaimRequest, boolean z, boolean z2, int i) {
        return new UserMultipleNestsClaimRequest(multipleNestsClaimRequest, z, z2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserMultipleNestsClaimRequest) {
            UserMultipleNestsClaimRequest userMultipleNestsClaimRequest = (UserMultipleNestsClaimRequest) obj;
            return Intrinsics.areEqual(this.request, userMultipleNestsClaimRequest.request) && this.multiClaimRequestEnabled == userMultipleNestsClaimRequest.multiClaimRequestEnabled && this.multiClaimRequestBlocked == userMultipleNestsClaimRequest.multiClaimRequestBlocked && this.remainingUnfulfilledRequestsBeforeBlock == userMultipleNestsClaimRequest.remainingUnfulfilledRequestsBeforeBlock;
        }
        return false;
    }

    public final boolean getMultiClaimRequestBlocked() {
        return this.multiClaimRequestBlocked;
    }

    public final boolean getMultiClaimRequestEnabled() {
        return this.multiClaimRequestEnabled;
    }

    public final int getRemainingUnfulfilledRequestsBeforeBlock() {
        return this.remainingUnfulfilledRequestsBeforeBlock;
    }

    public final MultipleNestsClaimRequest getRequest() {
        return this.request;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        MultipleNestsClaimRequest multipleNestsClaimRequest = this.request;
        int hashCode = (multipleNestsClaimRequest == null ? 0 : multipleNestsClaimRequest.hashCode()) * 31;
        boolean z = this.multiClaimRequestEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.multiClaimRequestBlocked;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.remainingUnfulfilledRequestsBeforeBlock);
    }

    public String toString() {
        MultipleNestsClaimRequest multipleNestsClaimRequest = this.request;
        boolean z = this.multiClaimRequestEnabled;
        boolean z2 = this.multiClaimRequestBlocked;
        int i = this.remainingUnfulfilledRequestsBeforeBlock;
        return "UserMultipleNestsClaimRequest(request=" + multipleNestsClaimRequest + ", multiClaimRequestEnabled=" + z + ", multiClaimRequestBlocked=" + z2 + ", remainingUnfulfilledRequestsBeforeBlock=" + i + ")";
    }
}
