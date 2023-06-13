package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLeaseObjectResponse;
import co.bird.android.model.wire.WirePaymentAuthResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/WireItemLeaseStartResponse;", "", "lease", "Lco/bird/android/model/wire/WireLeaseObjectResponse;", "paymentAuth", "Lco/bird/android/model/wire/WirePaymentAuthResponse;", "(Lco/bird/android/model/wire/WireLeaseObjectResponse;Lco/bird/android/model/wire/WirePaymentAuthResponse;)V", "getLease", "()Lco/bird/android/model/wire/WireLeaseObjectResponse;", "getPaymentAuth", "()Lco/bird/android/model/wire/WirePaymentAuthResponse;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireItemLeaseStartResponse {
    @JsonProperty("lease")
    @InterfaceC41208ft5("lease")
    private final WireLeaseObjectResponse lease;
    @JsonProperty("payment_auth")
    @InterfaceC41208ft5("payment_auth")
    private final WirePaymentAuthResponse paymentAuth;

    public WireItemLeaseStartResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireItemLeaseStartResponse copy$default(WireItemLeaseStartResponse wireItemLeaseStartResponse, WireLeaseObjectResponse wireLeaseObjectResponse, WirePaymentAuthResponse wirePaymentAuthResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLeaseObjectResponse = wireItemLeaseStartResponse.lease;
        }
        if ((i & 2) != 0) {
            wirePaymentAuthResponse = wireItemLeaseStartResponse.paymentAuth;
        }
        return wireItemLeaseStartResponse.copy(wireLeaseObjectResponse, wirePaymentAuthResponse);
    }

    public final WireLeaseObjectResponse component1() {
        return this.lease;
    }

    public final WirePaymentAuthResponse component2() {
        return this.paymentAuth;
    }

    public final WireItemLeaseStartResponse copy(WireLeaseObjectResponse wireLeaseObjectResponse, WirePaymentAuthResponse wirePaymentAuthResponse) {
        return new WireItemLeaseStartResponse(wireLeaseObjectResponse, wirePaymentAuthResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireItemLeaseStartResponse) {
            WireItemLeaseStartResponse wireItemLeaseStartResponse = (WireItemLeaseStartResponse) obj;
            return Intrinsics.areEqual(this.lease, wireItemLeaseStartResponse.lease) && Intrinsics.areEqual(this.paymentAuth, wireItemLeaseStartResponse.paymentAuth);
        }
        return false;
    }

    public final WireLeaseObjectResponse getLease() {
        return this.lease;
    }

    public final WirePaymentAuthResponse getPaymentAuth() {
        return this.paymentAuth;
    }

    public int hashCode() {
        WireLeaseObjectResponse wireLeaseObjectResponse = this.lease;
        int hashCode = (wireLeaseObjectResponse == null ? 0 : wireLeaseObjectResponse.hashCode()) * 31;
        WirePaymentAuthResponse wirePaymentAuthResponse = this.paymentAuth;
        return hashCode + (wirePaymentAuthResponse != null ? wirePaymentAuthResponse.hashCode() : 0);
    }

    public String toString() {
        WireLeaseObjectResponse wireLeaseObjectResponse = this.lease;
        WirePaymentAuthResponse wirePaymentAuthResponse = this.paymentAuth;
        return "WireItemLeaseStartResponse(lease=" + wireLeaseObjectResponse + ", paymentAuth=" + wirePaymentAuthResponse + ")";
    }

    public WireItemLeaseStartResponse(WireLeaseObjectResponse wireLeaseObjectResponse, WirePaymentAuthResponse wirePaymentAuthResponse) {
        this.lease = wireLeaseObjectResponse;
        this.paymentAuth = wirePaymentAuthResponse;
    }

    public /* synthetic */ WireItemLeaseStartResponse(WireLeaseObjectResponse wireLeaseObjectResponse, WirePaymentAuthResponse wirePaymentAuthResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireLeaseObjectResponse, (i & 2) != 0 ? null : wirePaymentAuthResponse);
    }
}
