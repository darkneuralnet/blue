package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.persistence.nestedstructures.TransferOrderLineItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jd\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m28432d2 = {"Lco/bird/android/model/persistence/SkuOrder;", "", "id", "", "packagingQuantity", "", "packageType", "quantity", "status", "Lco/bird/android/model/constant/SkuOrderStatus;", "transferOrderLineItemId", "transferOrderLineItem", "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;", "updatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;Lorg/joda/time/DateTime;)V", "getId", "()Ljava/lang/String;", "getPackageType", "getPackagingQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantity", "()I", "getStatus", "()Lco/bird/android/model/constant/SkuOrderStatus;", "getTransferOrderLineItem", "()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;", "getTransferOrderLineItemId", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILco/bird/android/model/constant/SkuOrderStatus;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/SkuOrder;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SkuOrder {

    /* renamed from: id */
    private final String f66688id;
    private final String packageType;
    private final Integer packagingQuantity;
    private final int quantity;
    private final SkuOrderStatus status;
    private final TransferOrderLineItem transferOrderLineItem;
    private final String transferOrderLineItemId;
    private final DateTime updatedAt;

    public SkuOrder(String id, Integer num, String str, int i, SkuOrderStatus status, String transferOrderLineItemId, TransferOrderLineItem transferOrderLineItem, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transferOrderLineItemId, "transferOrderLineItemId");
        Intrinsics.checkNotNullParameter(transferOrderLineItem, "transferOrderLineItem");
        this.f66688id = id;
        this.packagingQuantity = num;
        this.packageType = str;
        this.quantity = i;
        this.status = status;
        this.transferOrderLineItemId = transferOrderLineItemId;
        this.transferOrderLineItem = transferOrderLineItem;
        this.updatedAt = dateTime;
    }

    public final String component1() {
        return this.f66688id;
    }

    public final Integer component2() {
        return this.packagingQuantity;
    }

    public final String component3() {
        return this.packageType;
    }

    public final int component4() {
        return this.quantity;
    }

    public final SkuOrderStatus component5() {
        return this.status;
    }

    public final String component6() {
        return this.transferOrderLineItemId;
    }

    public final TransferOrderLineItem component7() {
        return this.transferOrderLineItem;
    }

    public final DateTime component8() {
        return this.updatedAt;
    }

    public final SkuOrder copy(String id, Integer num, String str, int i, SkuOrderStatus status, String transferOrderLineItemId, TransferOrderLineItem transferOrderLineItem, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transferOrderLineItemId, "transferOrderLineItemId");
        Intrinsics.checkNotNullParameter(transferOrderLineItem, "transferOrderLineItem");
        return new SkuOrder(id, num, str, i, status, transferOrderLineItemId, transferOrderLineItem, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuOrder) {
            SkuOrder skuOrder = (SkuOrder) obj;
            return Intrinsics.areEqual(this.f66688id, skuOrder.f66688id) && Intrinsics.areEqual(this.packagingQuantity, skuOrder.packagingQuantity) && Intrinsics.areEqual(this.packageType, skuOrder.packageType) && this.quantity == skuOrder.quantity && this.status == skuOrder.status && Intrinsics.areEqual(this.transferOrderLineItemId, skuOrder.transferOrderLineItemId) && Intrinsics.areEqual(this.transferOrderLineItem, skuOrder.transferOrderLineItem) && Intrinsics.areEqual(this.updatedAt, skuOrder.updatedAt);
        }
        return false;
    }

    public final String getId() {
        return this.f66688id;
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

    public final TransferOrderLineItem getTransferOrderLineItem() {
        return this.transferOrderLineItem;
    }

    public final String getTransferOrderLineItemId() {
        return this.transferOrderLineItemId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.f66688id.hashCode() * 31;
        Integer num = this.packagingQuantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.packageType;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31) + this.status.hashCode()) * 31) + this.transferOrderLineItemId.hashCode()) * 31) + this.transferOrderLineItem.hashCode()) * 31;
        DateTime dateTime = this.updatedAt;
        return hashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66688id;
        Integer num = this.packagingQuantity;
        String str2 = this.packageType;
        int i = this.quantity;
        SkuOrderStatus skuOrderStatus = this.status;
        String str3 = this.transferOrderLineItemId;
        TransferOrderLineItem transferOrderLineItem = this.transferOrderLineItem;
        DateTime dateTime = this.updatedAt;
        return "SkuOrder(id=" + str + ", packagingQuantity=" + num + ", packageType=" + str2 + ", quantity=" + i + ", status=" + skuOrderStatus + ", transferOrderLineItemId=" + str3 + ", transferOrderLineItem=" + transferOrderLineItem + ", updatedAt=" + dateTime + ")";
    }

    public /* synthetic */ SkuOrder(String str, Integer num, String str2, int i, SkuOrderStatus skuOrderStatus, String str3, TransferOrderLineItem transferOrderLineItem, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str2, i, skuOrderStatus, str3, transferOrderLineItem, (i2 & 128) != 0 ? null : dateTime);
    }
}
