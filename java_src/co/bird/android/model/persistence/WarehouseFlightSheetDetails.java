package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.WarehouseDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicleDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "", "warehouseId", "", "summary", "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", "status", "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;", "warehouseDetails", "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;", "vehicleDetails", "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)V", "getStatus", "()Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;", "getSummary", "()Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", "getVehicleDetails", "()Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;", "getWarehouseDetails", "()Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;", "getWarehouseId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WarehouseFlightSheetDetails {
    private final WarehouseStatus status;
    private final WarehouseSummary summary;
    private final WarehouseVehicleDetails vehicleDetails;
    private final WarehouseDetails warehouseDetails;
    private final String warehouseId;

    public WarehouseFlightSheetDetails(String warehouseId, WarehouseSummary warehouseSummary, WarehouseStatus warehouseStatus, WarehouseDetails warehouseDetails, WarehouseVehicleDetails warehouseVehicleDetails) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        this.warehouseId = warehouseId;
        this.summary = warehouseSummary;
        this.status = warehouseStatus;
        this.warehouseDetails = warehouseDetails;
        this.vehicleDetails = warehouseVehicleDetails;
    }

    public static /* synthetic */ WarehouseFlightSheetDetails copy$default(WarehouseFlightSheetDetails warehouseFlightSheetDetails, String str, WarehouseSummary warehouseSummary, WarehouseStatus warehouseStatus, WarehouseDetails warehouseDetails, WarehouseVehicleDetails warehouseVehicleDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = warehouseFlightSheetDetails.warehouseId;
        }
        if ((i & 2) != 0) {
            warehouseSummary = warehouseFlightSheetDetails.summary;
        }
        WarehouseSummary warehouseSummary2 = warehouseSummary;
        if ((i & 4) != 0) {
            warehouseStatus = warehouseFlightSheetDetails.status;
        }
        WarehouseStatus warehouseStatus2 = warehouseStatus;
        if ((i & 8) != 0) {
            warehouseDetails = warehouseFlightSheetDetails.warehouseDetails;
        }
        WarehouseDetails warehouseDetails2 = warehouseDetails;
        if ((i & 16) != 0) {
            warehouseVehicleDetails = warehouseFlightSheetDetails.vehicleDetails;
        }
        return warehouseFlightSheetDetails.copy(str, warehouseSummary2, warehouseStatus2, warehouseDetails2, warehouseVehicleDetails);
    }

    public final String component1() {
        return this.warehouseId;
    }

    public final WarehouseSummary component2() {
        return this.summary;
    }

    public final WarehouseStatus component3() {
        return this.status;
    }

    public final WarehouseDetails component4() {
        return this.warehouseDetails;
    }

    public final WarehouseVehicleDetails component5() {
        return this.vehicleDetails;
    }

    public final WarehouseFlightSheetDetails copy(String warehouseId, WarehouseSummary warehouseSummary, WarehouseStatus warehouseStatus, WarehouseDetails warehouseDetails, WarehouseVehicleDetails warehouseVehicleDetails) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        return new WarehouseFlightSheetDetails(warehouseId, warehouseSummary, warehouseStatus, warehouseDetails, warehouseVehicleDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WarehouseFlightSheetDetails) {
            WarehouseFlightSheetDetails warehouseFlightSheetDetails = (WarehouseFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.warehouseId, warehouseFlightSheetDetails.warehouseId) && Intrinsics.areEqual(this.summary, warehouseFlightSheetDetails.summary) && Intrinsics.areEqual(this.status, warehouseFlightSheetDetails.status) && Intrinsics.areEqual(this.warehouseDetails, warehouseFlightSheetDetails.warehouseDetails) && Intrinsics.areEqual(this.vehicleDetails, warehouseFlightSheetDetails.vehicleDetails);
        }
        return false;
    }

    public final WarehouseStatus getStatus() {
        return this.status;
    }

    public final WarehouseSummary getSummary() {
        return this.summary;
    }

    public final WarehouseVehicleDetails getVehicleDetails() {
        return this.vehicleDetails;
    }

    public final WarehouseDetails getWarehouseDetails() {
        return this.warehouseDetails;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = this.warehouseId.hashCode() * 31;
        WarehouseSummary warehouseSummary = this.summary;
        int hashCode2 = (hashCode + (warehouseSummary == null ? 0 : warehouseSummary.hashCode())) * 31;
        WarehouseStatus warehouseStatus = this.status;
        int hashCode3 = (hashCode2 + (warehouseStatus == null ? 0 : warehouseStatus.hashCode())) * 31;
        WarehouseDetails warehouseDetails = this.warehouseDetails;
        int hashCode4 = (hashCode3 + (warehouseDetails == null ? 0 : warehouseDetails.hashCode())) * 31;
        WarehouseVehicleDetails warehouseVehicleDetails = this.vehicleDetails;
        return hashCode4 + (warehouseVehicleDetails != null ? warehouseVehicleDetails.hashCode() : 0);
    }

    public String toString() {
        String str = this.warehouseId;
        WarehouseSummary warehouseSummary = this.summary;
        WarehouseStatus warehouseStatus = this.status;
        WarehouseDetails warehouseDetails = this.warehouseDetails;
        WarehouseVehicleDetails warehouseVehicleDetails = this.vehicleDetails;
        return "WarehouseFlightSheetDetails(warehouseId=" + str + ", summary=" + warehouseSummary + ", status=" + warehouseStatus + ", warehouseDetails=" + warehouseDetails + ", vehicleDetails=" + warehouseVehicleDetails + ")";
    }
}
