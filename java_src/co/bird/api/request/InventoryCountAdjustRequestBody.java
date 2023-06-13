package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/InventoryCountAdjustRequestBody;", "", "warehouseId", "", "sku", "adjustmentAmount", "", "userId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAdjustmentAmount", "()I", "getSku", "()Ljava/lang/String;", "getUserId", "getWarehouseId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryCountAdjustRequestBody {
    @JsonProperty("adjustment_amount")
    @InterfaceC41208ft5("adjustment_amount")
    private final int adjustmentAmount;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public InventoryCountAdjustRequestBody(String warehouseId, String sku, int i, String userId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.warehouseId = warehouseId;
        this.sku = sku;
        this.adjustmentAmount = i;
        this.userId = userId;
    }

    public static /* synthetic */ InventoryCountAdjustRequestBody copy$default(InventoryCountAdjustRequestBody inventoryCountAdjustRequestBody, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = inventoryCountAdjustRequestBody.warehouseId;
        }
        if ((i2 & 2) != 0) {
            str2 = inventoryCountAdjustRequestBody.sku;
        }
        if ((i2 & 4) != 0) {
            i = inventoryCountAdjustRequestBody.adjustmentAmount;
        }
        if ((i2 & 8) != 0) {
            str3 = inventoryCountAdjustRequestBody.userId;
        }
        return inventoryCountAdjustRequestBody.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.warehouseId;
    }

    public final String component2() {
        return this.sku;
    }

    public final int component3() {
        return this.adjustmentAmount;
    }

    public final String component4() {
        return this.userId;
    }

    public final InventoryCountAdjustRequestBody copy(String warehouseId, String sku, int i, String userId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new InventoryCountAdjustRequestBody(warehouseId, sku, i, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InventoryCountAdjustRequestBody) {
            InventoryCountAdjustRequestBody inventoryCountAdjustRequestBody = (InventoryCountAdjustRequestBody) obj;
            return Intrinsics.areEqual(this.warehouseId, inventoryCountAdjustRequestBody.warehouseId) && Intrinsics.areEqual(this.sku, inventoryCountAdjustRequestBody.sku) && this.adjustmentAmount == inventoryCountAdjustRequestBody.adjustmentAmount && Intrinsics.areEqual(this.userId, inventoryCountAdjustRequestBody.userId);
        }
        return false;
    }

    public final int getAdjustmentAmount() {
        return this.adjustmentAmount;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        return (((((this.warehouseId.hashCode() * 31) + this.sku.hashCode()) * 31) + Integer.hashCode(this.adjustmentAmount)) * 31) + this.userId.hashCode();
    }

    public String toString() {
        String str = this.warehouseId;
        String str2 = this.sku;
        int i = this.adjustmentAmount;
        String str3 = this.userId;
        return "InventoryCountAdjustRequestBody(warehouseId=" + str + ", sku=" + str2 + ", adjustmentAmount=" + i + ", userId=" + str3 + ")";
    }
}
