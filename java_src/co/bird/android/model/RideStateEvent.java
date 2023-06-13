package co.bird.android.model;

import co.bird.android.model.RideState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/RideStateEvent;", "", "rideState", "Lco/bird/android/model/RideState;", "event", "Lco/bird/android/model/RideState$Status;", "(Lco/bird/android/model/RideState;Lco/bird/android/model/RideState$Status;)V", "getEvent", "()Lco/bird/android/model/RideState$Status;", "getRideState", "()Lco/bird/android/model/RideState;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStateEvent {
    private final RideState.Status event;
    private final RideState rideState;

    public RideStateEvent(RideState rideState, RideState.Status event) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(event, "event");
        this.rideState = rideState;
        this.event = event;
    }

    public static /* synthetic */ RideStateEvent copy$default(RideStateEvent rideStateEvent, RideState rideState, RideState.Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            rideState = rideStateEvent.rideState;
        }
        if ((i & 2) != 0) {
            status = rideStateEvent.event;
        }
        return rideStateEvent.copy(rideState, status);
    }

    public final RideState component1() {
        return this.rideState;
    }

    public final RideState.Status component2() {
        return this.event;
    }

    public final RideStateEvent copy(RideState rideState, RideState.Status event) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(event, "event");
        return new RideStateEvent(rideState, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideStateEvent) {
            RideStateEvent rideStateEvent = (RideStateEvent) obj;
            return Intrinsics.areEqual(this.rideState, rideStateEvent.rideState) && this.event == rideStateEvent.event;
        }
        return false;
    }

    public final RideState.Status getEvent() {
        return this.event;
    }

    public final RideState getRideState() {
        return this.rideState;
    }

    public int hashCode() {
        return (this.rideState.hashCode() * 31) + this.event.hashCode();
    }

    public String toString() {
        RideState rideState = this.rideState;
        RideState.Status status = this.event;
        return "RideStateEvent(rideState=" + rideState + ", event=" + status + ")";
    }
}
