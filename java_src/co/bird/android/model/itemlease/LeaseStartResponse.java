package co.bird.android.model.itemlease;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WirePaymentAuthResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseStartResponse;", "", "lease", "Lco/bird/android/model/itemlease/ItemLease;", "paymentAuth", "Lco/bird/android/model/wire/WirePaymentAuthResponse;", "(Lco/bird/android/model/itemlease/ItemLease;Lco/bird/android/model/wire/WirePaymentAuthResponse;)V", "getLease", "()Lco/bird/android/model/itemlease/ItemLease;", "getPaymentAuth", "()Lco/bird/android/model/wire/WirePaymentAuthResponse;", "requiresAuth", "", "getRequiresAuth", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseStartResponse {
    private final ItemLease lease;
    private final WirePaymentAuthResponse paymentAuth;

    public LeaseStartResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ LeaseStartResponse copy$default(LeaseStartResponse leaseStartResponse, ItemLease itemLease, WirePaymentAuthResponse wirePaymentAuthResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            itemLease = leaseStartResponse.lease;
        }
        if ((i & 2) != 0) {
            wirePaymentAuthResponse = leaseStartResponse.paymentAuth;
        }
        return leaseStartResponse.copy(itemLease, wirePaymentAuthResponse);
    }

    public final ItemLease component1() {
        return this.lease;
    }

    public final WirePaymentAuthResponse component2() {
        return this.paymentAuth;
    }

    public final LeaseStartResponse copy(ItemLease itemLease, WirePaymentAuthResponse wirePaymentAuthResponse) {
        return new LeaseStartResponse(itemLease, wirePaymentAuthResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LeaseStartResponse) {
            LeaseStartResponse leaseStartResponse = (LeaseStartResponse) obj;
            return Intrinsics.areEqual(this.lease, leaseStartResponse.lease) && Intrinsics.areEqual(this.paymentAuth, leaseStartResponse.paymentAuth);
        }
        return false;
    }

    public final ItemLease getLease() {
        return this.lease;
    }

    public final WirePaymentAuthResponse getPaymentAuth() {
        return this.paymentAuth;
    }

    public final boolean getRequiresAuth() {
        return this.lease == null && this.paymentAuth != null;
    }

    public int hashCode() {
        ItemLease itemLease = this.lease;
        int hashCode = (itemLease == null ? 0 : itemLease.hashCode()) * 31;
        WirePaymentAuthResponse wirePaymentAuthResponse = this.paymentAuth;
        return hashCode + (wirePaymentAuthResponse != null ? wirePaymentAuthResponse.hashCode() : 0);
    }

    public String toString() {
        ItemLease itemLease = this.lease;
        WirePaymentAuthResponse wirePaymentAuthResponse = this.paymentAuth;
        return "LeaseStartResponse(lease=" + itemLease + ", paymentAuth=" + wirePaymentAuthResponse + ")";
    }

    public LeaseStartResponse(ItemLease itemLease, WirePaymentAuthResponse wirePaymentAuthResponse) {
        this.lease = itemLease;
        this.paymentAuth = wirePaymentAuthResponse;
    }

    public /* synthetic */ LeaseStartResponse(ItemLease itemLease, WirePaymentAuthResponse wirePaymentAuthResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : itemLease, (i & 2) != 0 ? null : wirePaymentAuthResponse);
    }
}
