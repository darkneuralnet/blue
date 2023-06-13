package co.bird.android.model;

import co.bird.android.model.wire.WireServiceCenterStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/NearbyBirdViewModel;", "", "vehicle", "Lco/bird/android/model/Vehicle;", "serviceCenterStatus", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "codeLabelText", "", "isIBeacon", "", "shouldShowIBeaconLabel", "(Lco/bird/android/model/Vehicle;Lco/bird/android/model/wire/WireServiceCenterStatus;IZZ)V", "getCodeLabelText", "()I", "()Z", "getServiceCenterStatus", "()Lco/bird/android/model/wire/WireServiceCenterStatus;", "getShouldShowIBeaconLabel", "getVehicle", "()Lco/bird/android/model/Vehicle;", "compareTo", LegacyRepairType.OTHER_KEY, "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NearbyBirdViewModel implements Comparable<NearbyBirdViewModel> {
    private final int codeLabelText;
    private final boolean isIBeacon;
    private final WireServiceCenterStatus serviceCenterStatus;
    private final boolean shouldShowIBeaconLabel;
    private final Vehicle vehicle;

    public NearbyBirdViewModel(Vehicle vehicle, WireServiceCenterStatus wireServiceCenterStatus, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        this.vehicle = vehicle;
        this.serviceCenterStatus = wireServiceCenterStatus;
        this.codeLabelText = i;
        this.isIBeacon = z;
        this.shouldShowIBeaconLabel = z2;
    }

    public static /* synthetic */ NearbyBirdViewModel copy$default(NearbyBirdViewModel nearbyBirdViewModel, Vehicle vehicle, WireServiceCenterStatus wireServiceCenterStatus, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vehicle = nearbyBirdViewModel.vehicle;
        }
        if ((i2 & 2) != 0) {
            wireServiceCenterStatus = nearbyBirdViewModel.serviceCenterStatus;
        }
        WireServiceCenterStatus wireServiceCenterStatus2 = wireServiceCenterStatus;
        if ((i2 & 4) != 0) {
            i = nearbyBirdViewModel.codeLabelText;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = nearbyBirdViewModel.isIBeacon;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = nearbyBirdViewModel.shouldShowIBeaconLabel;
        }
        return nearbyBirdViewModel.copy(vehicle, wireServiceCenterStatus2, i3, z3, z2);
    }

    public final Vehicle component1() {
        return this.vehicle;
    }

    public final WireServiceCenterStatus component2() {
        return this.serviceCenterStatus;
    }

    public final int component3() {
        return this.codeLabelText;
    }

    public final boolean component4() {
        return this.isIBeacon;
    }

    public final boolean component5() {
        return this.shouldShowIBeaconLabel;
    }

    public final NearbyBirdViewModel copy(Vehicle vehicle, WireServiceCenterStatus wireServiceCenterStatus, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return new NearbyBirdViewModel(vehicle, wireServiceCenterStatus, i, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyBirdViewModel) {
            NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) obj;
            return Intrinsics.areEqual(this.vehicle, nearbyBirdViewModel.vehicle) && Intrinsics.areEqual(this.serviceCenterStatus, nearbyBirdViewModel.serviceCenterStatus) && this.codeLabelText == nearbyBirdViewModel.codeLabelText && this.isIBeacon == nearbyBirdViewModel.isIBeacon && this.shouldShowIBeaconLabel == nearbyBirdViewModel.shouldShowIBeaconLabel;
        }
        return false;
    }

    public final int getCodeLabelText() {
        return this.codeLabelText;
    }

    public final WireServiceCenterStatus getServiceCenterStatus() {
        return this.serviceCenterStatus;
    }

    public final boolean getShouldShowIBeaconLabel() {
        return this.shouldShowIBeaconLabel;
    }

    public final Vehicle getVehicle() {
        return this.vehicle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.vehicle.hashCode() * 31;
        WireServiceCenterStatus wireServiceCenterStatus = this.serviceCenterStatus;
        int hashCode2 = (((hashCode + (wireServiceCenterStatus == null ? 0 : wireServiceCenterStatus.hashCode())) * 31) + Integer.hashCode(this.codeLabelText)) * 31;
        boolean z = this.isIBeacon;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.shouldShowIBeaconLabel;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isIBeacon() {
        return this.isIBeacon;
    }

    public String toString() {
        Vehicle vehicle = this.vehicle;
        WireServiceCenterStatus wireServiceCenterStatus = this.serviceCenterStatus;
        int i = this.codeLabelText;
        boolean z = this.isIBeacon;
        boolean z2 = this.shouldShowIBeaconLabel;
        return "NearbyBirdViewModel(vehicle=" + vehicle + ", serviceCenterStatus=" + wireServiceCenterStatus + ", codeLabelText=" + i + ", isIBeacon=" + z + ", shouldShowIBeaconLabel=" + z2 + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(NearbyBirdViewModel other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Integer rssi = other.vehicle.getRssi();
        int intValue = rssi != null ? rssi.intValue() : 0;
        Integer rssi2 = this.vehicle.getRssi();
        return intValue - (rssi2 != null ? rssi2.intValue() : 0);
    }

    public /* synthetic */ NearbyBirdViewModel(Vehicle vehicle, WireServiceCenterStatus wireServiceCenterStatus, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vehicle, wireServiceCenterStatus, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }
}
