package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetListActionKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "", "vehicleId", "", "kind", "Lco/bird/android/model/constant/FleetListActionKind;", "(Ljava/lang/String;Lco/bird/android/model/constant/FleetListActionKind;)V", "getKind", "()Lco/bird/android/model/constant/FleetListActionKind;", "getVehicleId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetListAction {
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final FleetListActionKind kind;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    public FleetListAction() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FleetListAction copy$default(FleetListAction fleetListAction, String str, FleetListActionKind fleetListActionKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetListAction.vehicleId;
        }
        if ((i & 2) != 0) {
            fleetListActionKind = fleetListAction.kind;
        }
        return fleetListAction.copy(str, fleetListActionKind);
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final FleetListActionKind component2() {
        return this.kind;
    }

    public final FleetListAction copy(String vehicleId, FleetListActionKind kind) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new FleetListAction(vehicleId, kind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetListAction) {
            FleetListAction fleetListAction = (FleetListAction) obj;
            return Intrinsics.areEqual(this.vehicleId, fleetListAction.vehicleId) && this.kind == fleetListAction.kind;
        }
        return false;
    }

    public final FleetListActionKind getKind() {
        return this.kind;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        return (this.vehicleId.hashCode() * 31) + this.kind.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        FleetListActionKind fleetListActionKind = this.kind;
        return "FleetListAction(vehicleId=" + str + ", kind=" + fleetListActionKind + ")";
    }

    public FleetListAction(String vehicleId, FleetListActionKind kind) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.vehicleId = vehicleId;
        this.kind = kind;
    }

    public /* synthetic */ FleetListAction(String str, FleetListActionKind fleetListActionKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? FleetListActionKind.UNKNOWN : fleetListActionKind);
    }
}
