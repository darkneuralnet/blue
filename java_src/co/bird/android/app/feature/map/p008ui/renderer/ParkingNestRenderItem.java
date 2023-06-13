package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ParkingNest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;", "", "parkingNest", "Lco/bird/android/model/ParkingNest;", "isRadiusVisible", "", "(Lco/bird/android/model/ParkingNest;Z)V", "()Z", "getParkingNest", "()Lco/bird/android/model/ParkingNest;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.ParkingNestRenderItem */
/* loaded from: classes2.dex */
public final class ParkingNestRenderItem {
    private final boolean isRadiusVisible;
    private final ParkingNest parkingNest;

    public ParkingNestRenderItem(ParkingNest parkingNest, boolean z) {
        Intrinsics.checkNotNullParameter(parkingNest, "parkingNest");
        this.parkingNest = parkingNest;
        this.isRadiusVisible = z;
    }

    public static /* synthetic */ ParkingNestRenderItem copy$default(ParkingNestRenderItem parkingNestRenderItem, ParkingNest parkingNest, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            parkingNest = parkingNestRenderItem.parkingNest;
        }
        if ((i & 2) != 0) {
            z = parkingNestRenderItem.isRadiusVisible;
        }
        return parkingNestRenderItem.copy(parkingNest, z);
    }

    public final ParkingNest component1() {
        return this.parkingNest;
    }

    public final boolean component2() {
        return this.isRadiusVisible;
    }

    public final ParkingNestRenderItem copy(ParkingNest parkingNest, boolean z) {
        Intrinsics.checkNotNullParameter(parkingNest, "parkingNest");
        return new ParkingNestRenderItem(parkingNest, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingNestRenderItem) {
            ParkingNestRenderItem parkingNestRenderItem = (ParkingNestRenderItem) obj;
            return Intrinsics.areEqual(this.parkingNest, parkingNestRenderItem.parkingNest) && this.isRadiusVisible == parkingNestRenderItem.isRadiusVisible;
        }
        return false;
    }

    public final ParkingNest getParkingNest() {
        return this.parkingNest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.parkingNest.hashCode() * 31;
        boolean z = this.isRadiusVisible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isRadiusVisible() {
        return this.isRadiusVisible;
    }

    public String toString() {
        ParkingNest parkingNest = this.parkingNest;
        boolean z = this.isRadiusVisible;
        return "ParkingNestRenderItem(parkingNest=" + parkingNest + ", isRadiusVisible=" + z + ")";
    }
}
