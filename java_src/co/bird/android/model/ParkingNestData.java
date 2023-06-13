package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/ParkingNestData;", "", "parkingNest", "Lco/bird/android/model/ParkingNest;", "distance", "", "(Lco/bird/android/model/ParkingNest;F)V", "getDistance", "()F", "getParkingNest", "()Lco/bird/android/model/ParkingNest;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ParkingNestData {
    private final float distance;
    private final ParkingNest parkingNest;

    public ParkingNestData(ParkingNest parkingNest, float f) {
        Intrinsics.checkNotNullParameter(parkingNest, "parkingNest");
        this.parkingNest = parkingNest;
        this.distance = f;
    }

    public static /* synthetic */ ParkingNestData copy$default(ParkingNestData parkingNestData, ParkingNest parkingNest, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            parkingNest = parkingNestData.parkingNest;
        }
        if ((i & 2) != 0) {
            f = parkingNestData.distance;
        }
        return parkingNestData.copy(parkingNest, f);
    }

    public final ParkingNest component1() {
        return this.parkingNest;
    }

    public final float component2() {
        return this.distance;
    }

    public final ParkingNestData copy(ParkingNest parkingNest, float f) {
        Intrinsics.checkNotNullParameter(parkingNest, "parkingNest");
        return new ParkingNestData(parkingNest, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingNestData) {
            ParkingNestData parkingNestData = (ParkingNestData) obj;
            return Intrinsics.areEqual(this.parkingNest, parkingNestData.parkingNest) && Float.compare(this.distance, parkingNestData.distance) == 0;
        }
        return false;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final ParkingNest getParkingNest() {
        return this.parkingNest;
    }

    public int hashCode() {
        return (this.parkingNest.hashCode() * 31) + Float.hashCode(this.distance);
    }

    public String toString() {
        ParkingNest parkingNest = this.parkingNest;
        float f = this.distance;
        return "ParkingNestData(parkingNest=" + parkingNest + ", distance=" + f + ")";
    }
}
