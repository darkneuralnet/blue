package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Warehouse;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/response/WarehouseValidationResponse;", "", "valid", "", "warehouse", "Lco/bird/android/model/Warehouse;", "(ZLco/bird/android/model/Warehouse;)V", "getValid", "()Z", "getWarehouse", "()Lco/bird/android/model/Warehouse;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WarehouseValidationResponse {
    @JsonProperty("valid")
    @InterfaceC41208ft5("valid")
    private final boolean valid;
    @JsonProperty("warehouse")
    @InterfaceC41208ft5("warehouse")
    private final Warehouse warehouse;

    public WarehouseValidationResponse() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ WarehouseValidationResponse copy$default(WarehouseValidationResponse warehouseValidationResponse, boolean z, Warehouse warehouse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = warehouseValidationResponse.valid;
        }
        if ((i & 2) != 0) {
            warehouse = warehouseValidationResponse.warehouse;
        }
        return warehouseValidationResponse.copy(z, warehouse);
    }

    public final boolean component1() {
        return this.valid;
    }

    public final Warehouse component2() {
        return this.warehouse;
    }

    public final WarehouseValidationResponse copy(boolean z, Warehouse warehouse) {
        return new WarehouseValidationResponse(z, warehouse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WarehouseValidationResponse) {
            WarehouseValidationResponse warehouseValidationResponse = (WarehouseValidationResponse) obj;
            return this.valid == warehouseValidationResponse.valid && Intrinsics.areEqual(this.warehouse, warehouseValidationResponse.warehouse);
        }
        return false;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final Warehouse getWarehouse() {
        return this.warehouse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.valid;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Warehouse warehouse = this.warehouse;
        return i + (warehouse == null ? 0 : warehouse.hashCode());
    }

    public String toString() {
        boolean z = this.valid;
        Warehouse warehouse = this.warehouse;
        return "WarehouseValidationResponse(valid=" + z + ", warehouse=" + warehouse + ")";
    }

    public WarehouseValidationResponse(boolean z, Warehouse warehouse) {
        this.valid = z;
        this.warehouse = warehouse;
    }

    public /* synthetic */ WarehouseValidationResponse(boolean z, Warehouse warehouse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : warehouse);
    }
}
