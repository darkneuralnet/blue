package co.bird.android.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/extra/VehicleDetailsExtra;", "Landroid/os/Parcelable;", "bird", "Lco/bird/android/model/wire/WireBird;", "completedAt", "Lorg/joda/time/DateTime;", "trackedAt", "(Lco/bird/android/model/wire/WireBird;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getTrackedAt", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleDetailsExtra implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VehicleDetailsExtra> CREATOR = new Creator();
    private final WireBird bird;
    private final DateTime completedAt;
    private final DateTime trackedAt;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VehicleDetailsExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleDetailsExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehicleDetailsExtra((WireBird) parcel.readParcelable(VehicleDetailsExtra.class.getClassLoader()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleDetailsExtra[] newArray(int i) {
            return new VehicleDetailsExtra[i];
        }
    }

    public VehicleDetailsExtra(WireBird bird, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.bird = bird;
        this.completedAt = dateTime;
        this.trackedAt = dateTime2;
    }

    public static /* synthetic */ VehicleDetailsExtra copy$default(VehicleDetailsExtra vehicleDetailsExtra, WireBird wireBird, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = vehicleDetailsExtra.bird;
        }
        if ((i & 2) != 0) {
            dateTime = vehicleDetailsExtra.completedAt;
        }
        if ((i & 4) != 0) {
            dateTime2 = vehicleDetailsExtra.trackedAt;
        }
        return vehicleDetailsExtra.copy(wireBird, dateTime, dateTime2);
    }

    public final WireBird component1() {
        return this.bird;
    }

    public final DateTime component2() {
        return this.completedAt;
    }

    public final DateTime component3() {
        return this.trackedAt;
    }

    public final VehicleDetailsExtra copy(WireBird bird, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new VehicleDetailsExtra(bird, dateTime, dateTime2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleDetailsExtra) {
            VehicleDetailsExtra vehicleDetailsExtra = (VehicleDetailsExtra) obj;
            return Intrinsics.areEqual(this.bird, vehicleDetailsExtra.bird) && Intrinsics.areEqual(this.completedAt, vehicleDetailsExtra.completedAt) && Intrinsics.areEqual(this.trackedAt, vehicleDetailsExtra.trackedAt);
        }
        return false;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getTrackedAt() {
        return this.trackedAt;
    }

    public int hashCode() {
        int hashCode = this.bird.hashCode() * 31;
        DateTime dateTime = this.completedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.trackedAt;
        return hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        WireBird wireBird = this.bird;
        DateTime dateTime = this.completedAt;
        DateTime dateTime2 = this.trackedAt;
        return "VehicleDetailsExtra(bird=" + wireBird + ", completedAt=" + dateTime + ", trackedAt=" + dateTime2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.bird, i);
        out.writeSerializable(this.completedAt);
        out.writeSerializable(this.trackedAt);
    }
}
