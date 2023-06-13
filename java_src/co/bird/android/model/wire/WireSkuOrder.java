package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.SkuOrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J|\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\bHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "", "id", "", "containerOrder", "Lco/bird/android/model/wire/WireContainerOrder;", "containerOrderId", "packagingQuantity", "", "packageType", "quantity", "status", "Lco/bird/android/model/constant/SkuOrderStatus;", "transferOrderLineItemId", "transferOrderLineItem", "Lco/bird/android/model/wire/WireTransferOrderLineItem;", "updatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)V", "getContainerOrder", "()Lco/bird/android/model/wire/WireContainerOrder;", "getContainerOrderId", "()Ljava/lang/String;", "getId", "getPackageType", "getPackagingQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantity", "()I", "getStatus", "()Lco/bird/android/model/constant/SkuOrderStatus;", "getTransferOrderLineItem", "()Lco/bird/android/model/wire/WireTransferOrderLineItem;", "getTransferOrderLineItemId", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/wire/WireContainerOrder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/wire/WireTransferOrderLineItem;Lorg/joda/time/DateTime;)Lco/bird/android/model/wire/WireSkuOrder;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSkuOrder {
    @JsonProperty("container_order")
    @InterfaceC41208ft5("container_order")
    private final WireContainerOrder containerOrder;
    @JsonProperty("container_order_id")
    @InterfaceC41208ft5("container_order_id")
    private final String containerOrderId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66763id;
    @JsonProperty("package_type")
    @InterfaceC41208ft5("package_type")
    private final String packageType;
    @JsonProperty("packaging_quantity")
    @InterfaceC41208ft5("packaging_quantity")
    private final Integer packagingQuantity;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final SkuOrderStatus status;
    @JsonProperty("transfer_order_line_item")
    @InterfaceC41208ft5("transfer_order_line_item")
    private final WireTransferOrderLineItem transferOrderLineItem;
    @JsonProperty("transfer_order_line_item_id")
    @InterfaceC41208ft5("transfer_order_line_item_id")
    private final String transferOrderLineItemId;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public WireSkuOrder(String id, WireContainerOrder wireContainerOrder, String containerOrderId, Integer num, String str, int i, SkuOrderStatus status, String transferOrderLineItemId, WireTransferOrderLineItem wireTransferOrderLineItem, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transferOrderLineItemId, "transferOrderLineItemId");
        this.f66763id = id;
        this.containerOrder = wireContainerOrder;
        this.containerOrderId = containerOrderId;
        this.packagingQuantity = num;
        this.packageType = str;
        this.quantity = i;
        this.status = status;
        this.transferOrderLineItemId = transferOrderLineItemId;
        this.transferOrderLineItem = wireTransferOrderLineItem;
        this.updatedAt = dateTime;
    }

    public final String component1() {
        return this.f66763id;
    }

    public final DateTime component10() {
        return this.updatedAt;
    }

    public final WireContainerOrder component2() {
        return this.containerOrder;
    }

    public final String component3() {
        return this.containerOrderId;
    }

    public final Integer component4() {
        return this.packagingQuantity;
    }

    public final String component5() {
        return this.packageType;
    }

    public final int component6() {
        return this.quantity;
    }

    public final SkuOrderStatus component7() {
        return this.status;
    }

    public final String component8() {
        return this.transferOrderLineItemId;
    }

    public final WireTransferOrderLineItem component9() {
        return this.transferOrderLineItem;
    }

    public final WireSkuOrder copy(String id, WireContainerOrder wireContainerOrder, String containerOrderId, Integer num, String str, int i, SkuOrderStatus status, String transferOrderLineItemId, WireTransferOrderLineItem wireTransferOrderLineItem, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transferOrderLineItemId, "transferOrderLineItemId");
        return new WireSkuOrder(id, wireContainerOrder, containerOrderId, num, str, i, status, transferOrderLineItemId, wireTransferOrderLineItem, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSkuOrder) {
            WireSkuOrder wireSkuOrder = (WireSkuOrder) obj;
            return Intrinsics.areEqual(this.f66763id, wireSkuOrder.f66763id) && Intrinsics.areEqual(this.containerOrder, wireSkuOrder.containerOrder) && Intrinsics.areEqual(this.containerOrderId, wireSkuOrder.containerOrderId) && Intrinsics.areEqual(this.packagingQuantity, wireSkuOrder.packagingQuantity) && Intrinsics.areEqual(this.packageType, wireSkuOrder.packageType) && this.quantity == wireSkuOrder.quantity && this.status == wireSkuOrder.status && Intrinsics.areEqual(this.transferOrderLineItemId, wireSkuOrder.transferOrderLineItemId) && Intrinsics.areEqual(this.transferOrderLineItem, wireSkuOrder.transferOrderLineItem) && Intrinsics.areEqual(this.updatedAt, wireSkuOrder.updatedAt);
        }
        return false;
    }

    public final WireContainerOrder getContainerOrder() {
        return this.containerOrder;
    }

    public final String getContainerOrderId() {
        return this.containerOrderId;
    }

    public final String getId() {
        return this.f66763id;
    }

    public final String getPackageType() {
        return this.packageType;
    }

    public final Integer getPackagingQuantity() {
        return this.packagingQuantity;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final SkuOrderStatus getStatus() {
        return this.status;
    }

    public final WireTransferOrderLineItem getTransferOrderLineItem() {
        return this.transferOrderLineItem;
    }

    public final String getTransferOrderLineItemId() {
        return this.transferOrderLineItemId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.f66763id.hashCode() * 31;
        WireContainerOrder wireContainerOrder = this.containerOrder;
        int hashCode2 = (((hashCode + (wireContainerOrder == null ? 0 : wireContainerOrder.hashCode())) * 31) + this.containerOrderId.hashCode()) * 31;
        Integer num = this.packagingQuantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.packageType;
        int hashCode4 = (((((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31) + this.status.hashCode()) * 31) + this.transferOrderLineItemId.hashCode()) * 31;
        WireTransferOrderLineItem wireTransferOrderLineItem = this.transferOrderLineItem;
        int hashCode5 = (hashCode4 + (wireTransferOrderLineItem == null ? 0 : wireTransferOrderLineItem.hashCode())) * 31;
        DateTime dateTime = this.updatedAt;
        return hashCode5 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66763id;
        WireContainerOrder wireContainerOrder = this.containerOrder;
        String str2 = this.containerOrderId;
        Integer num = this.packagingQuantity;
        String str3 = this.packageType;
        int i = this.quantity;
        SkuOrderStatus skuOrderStatus = this.status;
        String str4 = this.transferOrderLineItemId;
        WireTransferOrderLineItem wireTransferOrderLineItem = this.transferOrderLineItem;
        DateTime dateTime = this.updatedAt;
        return "WireSkuOrder(id=" + str + ", containerOrder=" + wireContainerOrder + ", containerOrderId=" + str2 + ", packagingQuantity=" + num + ", packageType=" + str3 + ", quantity=" + i + ", status=" + skuOrderStatus + ", transferOrderLineItemId=" + str4 + ", transferOrderLineItem=" + wireTransferOrderLineItem + ", updatedAt=" + dateTime + ")";
    }

    public /* synthetic */ WireSkuOrder(String str, WireContainerOrder wireContainerOrder, String str2, Integer num, String str3, int i, SkuOrderStatus skuOrderStatus, String str4, WireTransferOrderLineItem wireTransferOrderLineItem, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : wireContainerOrder, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i, skuOrderStatus, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? null : wireTransferOrderLineItem, (i2 & 512) != 0 ? null : dateTime);
    }
}
