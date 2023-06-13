package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/RideSummary;", "", "ride", "Lco/bird/android/model/wire/WireRide;", "transaction", "Lco/bird/android/model/wire/WireRideTransaction;", "(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRideTransaction;)V", "getRide", "()Lco/bird/android/model/wire/WireRide;", "getTransaction", "()Lco/bird/android/model/wire/WireRideTransaction;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideSummary {
    @JsonProperty("ride")
    @InterfaceC41208ft5("ride")
    private final WireRide ride;
    @JsonProperty("transaction")
    @InterfaceC41208ft5("transaction")
    private final WireRideTransaction transaction;

    public RideSummary(WireRide ride, WireRideTransaction wireRideTransaction) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        this.ride = ride;
        this.transaction = wireRideTransaction;
    }

    public static /* synthetic */ RideSummary copy$default(RideSummary rideSummary, WireRide wireRide, WireRideTransaction wireRideTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRide = rideSummary.ride;
        }
        if ((i & 2) != 0) {
            wireRideTransaction = rideSummary.transaction;
        }
        return rideSummary.copy(wireRide, wireRideTransaction);
    }

    public final WireRide component1() {
        return this.ride;
    }

    public final WireRideTransaction component2() {
        return this.transaction;
    }

    public final RideSummary copy(WireRide ride, WireRideTransaction wireRideTransaction) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        return new RideSummary(ride, wireRideTransaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideSummary) {
            RideSummary rideSummary = (RideSummary) obj;
            return Intrinsics.areEqual(this.ride, rideSummary.ride) && Intrinsics.areEqual(this.transaction, rideSummary.transaction);
        }
        return false;
    }

    public final WireRide getRide() {
        return this.ride;
    }

    public final WireRideTransaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int hashCode = this.ride.hashCode() * 31;
        WireRideTransaction wireRideTransaction = this.transaction;
        return hashCode + (wireRideTransaction == null ? 0 : wireRideTransaction.hashCode());
    }

    public String toString() {
        WireRide wireRide = this.ride;
        WireRideTransaction wireRideTransaction = this.transaction;
        return "RideSummary(ride=" + wireRide + ", transaction=" + wireRideTransaction + ")";
    }

    public /* synthetic */ RideSummary(WireRide wireRide, WireRideTransaction wireRideTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireRide, (i & 2) != 0 ? null : wireRideTransaction);
    }
}
