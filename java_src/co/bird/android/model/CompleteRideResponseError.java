package co.bird.android.model;

import co.bird.android.model.wire.WireRide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/CompleteRideResponseError;", "", "throwable", "", "ride", "Lco/bird/android/model/wire/WireRide;", "(Ljava/lang/Throwable;Lco/bird/android/model/wire/WireRide;)V", "getRide", "()Lco/bird/android/model/wire/WireRide;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CompleteRideResponseError {
    private final WireRide ride;
    private final Throwable throwable;

    public CompleteRideResponseError(Throwable throwable, WireRide wireRide) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
        this.ride = wireRide;
    }

    public static /* synthetic */ CompleteRideResponseError copy$default(CompleteRideResponseError completeRideResponseError, Throwable th, WireRide wireRide, int i, Object obj) {
        if ((i & 1) != 0) {
            th = completeRideResponseError.throwable;
        }
        if ((i & 2) != 0) {
            wireRide = completeRideResponseError.ride;
        }
        return completeRideResponseError.copy(th, wireRide);
    }

    public final Throwable component1() {
        return this.throwable;
    }

    public final WireRide component2() {
        return this.ride;
    }

    public final CompleteRideResponseError copy(Throwable throwable, WireRide wireRide) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new CompleteRideResponseError(throwable, wireRide);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompleteRideResponseError) {
            CompleteRideResponseError completeRideResponseError = (CompleteRideResponseError) obj;
            return Intrinsics.areEqual(this.throwable, completeRideResponseError.throwable) && Intrinsics.areEqual(this.ride, completeRideResponseError.ride);
        }
        return false;
    }

    public final WireRide getRide() {
        return this.ride;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = this.throwable.hashCode() * 31;
        WireRide wireRide = this.ride;
        return hashCode + (wireRide == null ? 0 : wireRide.hashCode());
    }

    public String toString() {
        Throwable th = this.throwable;
        WireRide wireRide = this.ride;
        return "CompleteRideResponseError(throwable=" + th + ", ride=" + wireRide + ")";
    }

    public /* synthetic */ CompleteRideResponseError(Throwable th, WireRide wireRide, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : wireRide);
    }
}
