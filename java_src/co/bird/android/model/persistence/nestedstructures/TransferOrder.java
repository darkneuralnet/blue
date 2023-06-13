package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.constant.TransferOrderReason;
import co.bird.android.model.constant.TransferOrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010)\u001a\u00020\u0012HÆ\u0003J\t\u0010*\u001a\u00020\u0012HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u0085\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006:"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TransferOrder;", "", "id", "", "demandSource", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "status", "Lco/bird/android/model/constant/TransferOrderStatus;", "reason", "Lco/bird/android/model/constant/TransferOrderReason;", "originWarehouseId", "destinationWarehouseId", "actualDeliveryDate", "Lorg/joda/time/DateTime;", "targetDeliveryDate", "createdAt", "updatedAt", "originWarehouse", "Lco/bird/android/model/persistence/nestedstructures/Warehouse;", "destinationWarehouse", "(Ljava/lang/String;Lco/bird/android/model/constant/TransferOrderDemandSource;Lco/bird/android/model/constant/TransferOrderStatus;Lco/bird/android/model/constant/TransferOrderReason;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Warehouse;Lco/bird/android/model/persistence/nestedstructures/Warehouse;)V", "getActualDeliveryDate", "()Lorg/joda/time/DateTime;", "getCreatedAt", "getDemandSource", "()Lco/bird/android/model/constant/TransferOrderDemandSource;", "getDestinationWarehouse", "()Lco/bird/android/model/persistence/nestedstructures/Warehouse;", "getDestinationWarehouseId", "()Ljava/lang/String;", "getId", "getOriginWarehouse", "getOriginWarehouseId", "getReason", "()Lco/bird/android/model/constant/TransferOrderReason;", "getStatus", "()Lco/bird/android/model/constant/TransferOrderStatus;", "getTargetDeliveryDate", "getUpdatedAt", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransferOrder {
    @JsonProperty("actual_delivery_date")
    @InterfaceC41208ft5("actual_delivery_date")
    private final DateTime actualDeliveryDate;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("demand_source")
    @InterfaceC41208ft5("demand_source")
    private final TransferOrderDemandSource demandSource;
    @JsonProperty("destination_warehouse")
    @InterfaceC41208ft5("destination_warehouse")
    private final Warehouse destinationWarehouse;
    @JsonProperty("destination_warehouse_id")
    @InterfaceC41208ft5("destination_warehouse_id")
    private final String destinationWarehouseId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66704id;
    @JsonProperty("origin_warehouse")
    @InterfaceC41208ft5("origin_warehouse")
    private final Warehouse originWarehouse;
    @JsonProperty("origin_warehouse_id")
    @InterfaceC41208ft5("origin_warehouse_id")
    private final String originWarehouseId;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final TransferOrderReason reason;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final TransferOrderStatus status;
    @JsonProperty("target_delivery_date")
    @InterfaceC41208ft5("target_delivery_date")
    private final DateTime targetDeliveryDate;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public TransferOrder(String id, TransferOrderDemandSource demandSource, TransferOrderStatus status, TransferOrderReason reason, String originWarehouseId, String destinationWarehouseId, DateTime dateTime, DateTime targetDeliveryDate, DateTime createdAt, DateTime dateTime2, Warehouse originWarehouse, Warehouse destinationWarehouse) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(originWarehouseId, "originWarehouseId");
        Intrinsics.checkNotNullParameter(destinationWarehouseId, "destinationWarehouseId");
        Intrinsics.checkNotNullParameter(targetDeliveryDate, "targetDeliveryDate");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(originWarehouse, "originWarehouse");
        Intrinsics.checkNotNullParameter(destinationWarehouse, "destinationWarehouse");
        this.f66704id = id;
        this.demandSource = demandSource;
        this.status = status;
        this.reason = reason;
        this.originWarehouseId = originWarehouseId;
        this.destinationWarehouseId = destinationWarehouseId;
        this.actualDeliveryDate = dateTime;
        this.targetDeliveryDate = targetDeliveryDate;
        this.createdAt = createdAt;
        this.updatedAt = dateTime2;
        this.originWarehouse = originWarehouse;
        this.destinationWarehouse = destinationWarehouse;
    }

    public final String component1() {
        return this.f66704id;
    }

    public final DateTime component10() {
        return this.updatedAt;
    }

    public final Warehouse component11() {
        return this.originWarehouse;
    }

    public final Warehouse component12() {
        return this.destinationWarehouse;
    }

    public final TransferOrderDemandSource component2() {
        return this.demandSource;
    }

    public final TransferOrderStatus component3() {
        return this.status;
    }

    public final TransferOrderReason component4() {
        return this.reason;
    }

    public final String component5() {
        return this.originWarehouseId;
    }

    public final String component6() {
        return this.destinationWarehouseId;
    }

    public final DateTime component7() {
        return this.actualDeliveryDate;
    }

    public final DateTime component8() {
        return this.targetDeliveryDate;
    }

    public final DateTime component9() {
        return this.createdAt;
    }

    public final TransferOrder copy(String id, TransferOrderDemandSource demandSource, TransferOrderStatus status, TransferOrderReason reason, String originWarehouseId, String destinationWarehouseId, DateTime dateTime, DateTime targetDeliveryDate, DateTime createdAt, DateTime dateTime2, Warehouse originWarehouse, Warehouse destinationWarehouse) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(originWarehouseId, "originWarehouseId");
        Intrinsics.checkNotNullParameter(destinationWarehouseId, "destinationWarehouseId");
        Intrinsics.checkNotNullParameter(targetDeliveryDate, "targetDeliveryDate");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(originWarehouse, "originWarehouse");
        Intrinsics.checkNotNullParameter(destinationWarehouse, "destinationWarehouse");
        return new TransferOrder(id, demandSource, status, reason, originWarehouseId, destinationWarehouseId, dateTime, targetDeliveryDate, createdAt, dateTime2, originWarehouse, destinationWarehouse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferOrder) {
            TransferOrder transferOrder = (TransferOrder) obj;
            return Intrinsics.areEqual(this.f66704id, transferOrder.f66704id) && this.demandSource == transferOrder.demandSource && this.status == transferOrder.status && this.reason == transferOrder.reason && Intrinsics.areEqual(this.originWarehouseId, transferOrder.originWarehouseId) && Intrinsics.areEqual(this.destinationWarehouseId, transferOrder.destinationWarehouseId) && Intrinsics.areEqual(this.actualDeliveryDate, transferOrder.actualDeliveryDate) && Intrinsics.areEqual(this.targetDeliveryDate, transferOrder.targetDeliveryDate) && Intrinsics.areEqual(this.createdAt, transferOrder.createdAt) && Intrinsics.areEqual(this.updatedAt, transferOrder.updatedAt) && Intrinsics.areEqual(this.originWarehouse, transferOrder.originWarehouse) && Intrinsics.areEqual(this.destinationWarehouse, transferOrder.destinationWarehouse);
        }
        return false;
    }

    public final DateTime getActualDeliveryDate() {
        return this.actualDeliveryDate;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final TransferOrderDemandSource getDemandSource() {
        return this.demandSource;
    }

    public final Warehouse getDestinationWarehouse() {
        return this.destinationWarehouse;
    }

    public final String getDestinationWarehouseId() {
        return this.destinationWarehouseId;
    }

    public final String getId() {
        return this.f66704id;
    }

    public final Warehouse getOriginWarehouse() {
        return this.originWarehouse;
    }

    public final String getOriginWarehouseId() {
        return this.originWarehouseId;
    }

    public final TransferOrderReason getReason() {
        return this.reason;
    }

    public final TransferOrderStatus getStatus() {
        return this.status;
    }

    public final DateTime getTargetDeliveryDate() {
        return this.targetDeliveryDate;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f66704id.hashCode() * 31) + this.demandSource.hashCode()) * 31) + this.status.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.originWarehouseId.hashCode()) * 31) + this.destinationWarehouseId.hashCode()) * 31;
        DateTime dateTime = this.actualDeliveryDate;
        int hashCode2 = (((((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.targetDeliveryDate.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime2 = this.updatedAt;
        return ((((hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31) + this.originWarehouse.hashCode()) * 31) + this.destinationWarehouse.hashCode();
    }

    public String toString() {
        String str = this.f66704id;
        TransferOrderDemandSource transferOrderDemandSource = this.demandSource;
        TransferOrderStatus transferOrderStatus = this.status;
        TransferOrderReason transferOrderReason = this.reason;
        String str2 = this.originWarehouseId;
        String str3 = this.destinationWarehouseId;
        DateTime dateTime = this.actualDeliveryDate;
        DateTime dateTime2 = this.targetDeliveryDate;
        DateTime dateTime3 = this.createdAt;
        DateTime dateTime4 = this.updatedAt;
        Warehouse warehouse = this.originWarehouse;
        Warehouse warehouse2 = this.destinationWarehouse;
        return "TransferOrder(id=" + str + ", demandSource=" + transferOrderDemandSource + ", status=" + transferOrderStatus + ", reason=" + transferOrderReason + ", originWarehouseId=" + str2 + ", destinationWarehouseId=" + str3 + ", actualDeliveryDate=" + dateTime + ", targetDeliveryDate=" + dateTime2 + ", createdAt=" + dateTime3 + ", updatedAt=" + dateTime4 + ", originWarehouse=" + warehouse + ", destinationWarehouse=" + warehouse2 + ")";
    }

    public /* synthetic */ TransferOrder(String str, TransferOrderDemandSource transferOrderDemandSource, TransferOrderStatus transferOrderStatus, TransferOrderReason transferOrderReason, String str2, String str3, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, Warehouse warehouse, Warehouse warehouse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, transferOrderDemandSource, transferOrderStatus, transferOrderReason, str2, str3, (i & 64) != 0 ? null : dateTime, dateTime2, dateTime3, (i & 512) != 0 ? null : dateTime4, warehouse, warehouse2);
    }
}
