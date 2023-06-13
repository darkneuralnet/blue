package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;", "", "summary", "Lco/bird/android/model/wire/WireWarehouseSummary;", "status", "Lco/bird/android/model/wire/WireWarehouseStatus;", "warehouseDetails", "Lco/bird/android/model/wire/WireWarehouseDetails;", "vehicleDetails", "Lco/bird/android/model/wire/WireWarehouseVehicleDetails;", "(Lco/bird/android/model/wire/WireWarehouseSummary;Lco/bird/android/model/wire/WireWarehouseStatus;Lco/bird/android/model/wire/WireWarehouseDetails;Lco/bird/android/model/wire/WireWarehouseVehicleDetails;)V", "getStatus", "()Lco/bird/android/model/wire/WireWarehouseStatus;", "getSummary", "()Lco/bird/android/model/wire/WireWarehouseSummary;", "getVehicleDetails", "()Lco/bird/android/model/wire/WireWarehouseVehicleDetails;", "getWarehouseDetails", "()Lco/bird/android/model/wire/WireWarehouseDetails;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouseFlightSheetDetails {
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WireWarehouseStatus status;
    @JsonProperty("summary")
    @InterfaceC41208ft5("summary")
    private final WireWarehouseSummary summary;
    @JsonProperty("vehicle_details")
    @InterfaceC41208ft5("vehicle_details")
    private final WireWarehouseVehicleDetails vehicleDetails;
    @JsonProperty("warehouse_details")
    @InterfaceC41208ft5("warehouse_details")
    private final WireWarehouseDetails warehouseDetails;

    public WireWarehouseFlightSheetDetails() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireWarehouseFlightSheetDetails copy$default(WireWarehouseFlightSheetDetails wireWarehouseFlightSheetDetails, WireWarehouseSummary wireWarehouseSummary, WireWarehouseStatus wireWarehouseStatus, WireWarehouseDetails wireWarehouseDetails, WireWarehouseVehicleDetails wireWarehouseVehicleDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            wireWarehouseSummary = wireWarehouseFlightSheetDetails.summary;
        }
        if ((i & 2) != 0) {
            wireWarehouseStatus = wireWarehouseFlightSheetDetails.status;
        }
        if ((i & 4) != 0) {
            wireWarehouseDetails = wireWarehouseFlightSheetDetails.warehouseDetails;
        }
        if ((i & 8) != 0) {
            wireWarehouseVehicleDetails = wireWarehouseFlightSheetDetails.vehicleDetails;
        }
        return wireWarehouseFlightSheetDetails.copy(wireWarehouseSummary, wireWarehouseStatus, wireWarehouseDetails, wireWarehouseVehicleDetails);
    }

    public final WireWarehouseSummary component1() {
        return this.summary;
    }

    public final WireWarehouseStatus component2() {
        return this.status;
    }

    public final WireWarehouseDetails component3() {
        return this.warehouseDetails;
    }

    public final WireWarehouseVehicleDetails component4() {
        return this.vehicleDetails;
    }

    public final WireWarehouseFlightSheetDetails copy(WireWarehouseSummary wireWarehouseSummary, WireWarehouseStatus wireWarehouseStatus, WireWarehouseDetails wireWarehouseDetails, WireWarehouseVehicleDetails wireWarehouseVehicleDetails) {
        return new WireWarehouseFlightSheetDetails(wireWarehouseSummary, wireWarehouseStatus, wireWarehouseDetails, wireWarehouseVehicleDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouseFlightSheetDetails) {
            WireWarehouseFlightSheetDetails wireWarehouseFlightSheetDetails = (WireWarehouseFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.summary, wireWarehouseFlightSheetDetails.summary) && Intrinsics.areEqual(this.status, wireWarehouseFlightSheetDetails.status) && Intrinsics.areEqual(this.warehouseDetails, wireWarehouseFlightSheetDetails.warehouseDetails) && Intrinsics.areEqual(this.vehicleDetails, wireWarehouseFlightSheetDetails.vehicleDetails);
        }
        return false;
    }

    public final WireWarehouseStatus getStatus() {
        return this.status;
    }

    public final WireWarehouseSummary getSummary() {
        return this.summary;
    }

    public final WireWarehouseVehicleDetails getVehicleDetails() {
        return this.vehicleDetails;
    }

    public final WireWarehouseDetails getWarehouseDetails() {
        return this.warehouseDetails;
    }

    public int hashCode() {
        WireWarehouseSummary wireWarehouseSummary = this.summary;
        int hashCode = (wireWarehouseSummary == null ? 0 : wireWarehouseSummary.hashCode()) * 31;
        WireWarehouseStatus wireWarehouseStatus = this.status;
        int hashCode2 = (hashCode + (wireWarehouseStatus == null ? 0 : wireWarehouseStatus.hashCode())) * 31;
        WireWarehouseDetails wireWarehouseDetails = this.warehouseDetails;
        int hashCode3 = (hashCode2 + (wireWarehouseDetails == null ? 0 : wireWarehouseDetails.hashCode())) * 31;
        WireWarehouseVehicleDetails wireWarehouseVehicleDetails = this.vehicleDetails;
        return hashCode3 + (wireWarehouseVehicleDetails != null ? wireWarehouseVehicleDetails.hashCode() : 0);
    }

    public String toString() {
        WireWarehouseSummary wireWarehouseSummary = this.summary;
        WireWarehouseStatus wireWarehouseStatus = this.status;
        WireWarehouseDetails wireWarehouseDetails = this.warehouseDetails;
        WireWarehouseVehicleDetails wireWarehouseVehicleDetails = this.vehicleDetails;
        return "WireWarehouseFlightSheetDetails(summary=" + wireWarehouseSummary + ", status=" + wireWarehouseStatus + ", warehouseDetails=" + wireWarehouseDetails + ", vehicleDetails=" + wireWarehouseVehicleDetails + ")";
    }

    public WireWarehouseFlightSheetDetails(WireWarehouseSummary wireWarehouseSummary, WireWarehouseStatus wireWarehouseStatus, WireWarehouseDetails wireWarehouseDetails, WireWarehouseVehicleDetails wireWarehouseVehicleDetails) {
        this.summary = wireWarehouseSummary;
        this.status = wireWarehouseStatus;
        this.warehouseDetails = wireWarehouseDetails;
        this.vehicleDetails = wireWarehouseVehicleDetails;
    }

    public /* synthetic */ WireWarehouseFlightSheetDetails(WireWarehouseSummary wireWarehouseSummary, WireWarehouseStatus wireWarehouseStatus, WireWarehouseDetails wireWarehouseDetails, WireWarehouseVehicleDetails wireWarehouseVehicleDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireWarehouseSummary, (i & 2) != 0 ? null : wireWarehouseStatus, (i & 4) != 0 ? null : wireWarehouseDetails, (i & 8) != 0 ? null : wireWarehouseVehicleDetails);
    }
}
