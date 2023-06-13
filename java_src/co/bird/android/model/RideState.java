package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.persistence.common.ConstantsKt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/RideState;", "", "ride", "Lco/bird/android/model/wire/WireRide;", "status", "Lco/bird/android/model/RideState$Status;", "rideConfig", "Lco/bird/android/model/wire/configs/Config;", "updateState", "Lco/bird/android/model/RideUpdateState;", "(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)V", "getRide", "()Lco/bird/android/model/wire/WireRide;", "getRideConfig", "()Lco/bird/android/model/wire/configs/Config;", "getStatus", "()Lco/bird/android/model/RideState$Status;", "getUpdateState", "()Lco/bird/android/model/RideUpdateState;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toLoggableString", "", "toString", "Status", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideState {
    private final WireRide ride;
    private final Config rideConfig;
    private final Status status;
    private final RideUpdateState updateState;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/RideState$Status;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "STARTED", "LOCKED", "UNLOCKED", "ENDED", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum Status implements Parcelable {
        STARTED,
        LOCKED,
        UNLOCKED,
        ENDED;
        
        public static final Parcelable.Creator<Status> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Status> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Status.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i) {
                return new Status[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(name());
        }
    }

    public RideState(WireRide ride, Status status, Config rideConfig, RideUpdateState updateState) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        Intrinsics.checkNotNullParameter(updateState, "updateState");
        this.ride = ride;
        this.status = status;
        this.rideConfig = rideConfig;
        this.updateState = updateState;
    }

    public static /* synthetic */ RideState copy$default(RideState rideState, WireRide wireRide, Status status, Config config, RideUpdateState rideUpdateState, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRide = rideState.ride;
        }
        if ((i & 2) != 0) {
            status = rideState.status;
        }
        if ((i & 4) != 0) {
            config = rideState.rideConfig;
        }
        if ((i & 8) != 0) {
            rideUpdateState = rideState.updateState;
        }
        return rideState.copy(wireRide, status, config, rideUpdateState);
    }

    public final WireRide component1() {
        return this.ride;
    }

    public final Status component2() {
        return this.status;
    }

    public final Config component3() {
        return this.rideConfig;
    }

    public final RideUpdateState component4() {
        return this.updateState;
    }

    public final RideState copy(WireRide ride, Status status, Config rideConfig, RideUpdateState updateState) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        Intrinsics.checkNotNullParameter(updateState, "updateState");
        return new RideState(ride, status, rideConfig, updateState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideState) {
            RideState rideState = (RideState) obj;
            return Intrinsics.areEqual(this.ride, rideState.ride) && this.status == rideState.status && Intrinsics.areEqual(this.rideConfig, rideState.rideConfig) && this.updateState == rideState.updateState;
        }
        return false;
    }

    public final WireRide getRide() {
        return this.ride;
    }

    public final Config getRideConfig() {
        return this.rideConfig;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final RideUpdateState getUpdateState() {
        return this.updateState;
    }

    public int hashCode() {
        return (((((this.ride.hashCode() * 31) + this.status.hashCode()) * 31) + this.rideConfig.hashCode()) * 31) + this.updateState.hashCode();
    }

    public final String toLoggableString() {
        String str;
        String code;
        String id = this.ride.getId();
        WireBird bird = this.ride.getBird();
        String str2 = ConstantsKt.NONE;
        if (bird == null || (str = bird.getId()) == null) {
            str = ConstantsKt.NONE;
        }
        WireBird bird2 = this.ride.getBird();
        if (bird2 != null && (code = bird2.getCode()) != null) {
            str2 = code;
        }
        Status status = this.status;
        RideUpdateState rideUpdateState = this.updateState;
        return "[rideId: " + id + ", birdId: " + str + ", birdCode: " + str2 + ", status: " + status + ", updateState: " + rideUpdateState + "]";
    }

    public String toString() {
        WireRide wireRide = this.ride;
        Status status = this.status;
        Config config = this.rideConfig;
        RideUpdateState rideUpdateState = this.updateState;
        return "RideState(ride=" + wireRide + ", status=" + status + ", rideConfig=" + config + ", updateState=" + rideUpdateState + ")";
    }

    public /* synthetic */ RideState(WireRide wireRide, Status status, Config config, RideUpdateState rideUpdateState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireRide, status, config, (i & 8) != 0 ? RideUpdateState.NONE : rideUpdateState);
    }
}
