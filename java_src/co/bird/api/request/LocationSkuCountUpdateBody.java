package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, m28432d2 = {"Lco/bird/api/request/LocationSkuCountUpdateBody;", "", "locationId", "", "warehouseId", "sku", "quantity", "", "allocatedQuantity", "metadata", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAllocatedQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocationId", "()Ljava/lang/String;", "getMetadata", "getQuantity", "getSku", "getUserId", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/request/LocationSkuCountUpdateBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocationSkuCountUpdateBody {
    @JsonProperty("allocated_quantity")
    @InterfaceC41208ft5("allocated_quantity")
    private final Integer allocatedQuantity;
    @JsonProperty("location_id")
    @InterfaceC41208ft5("location_id")
    private final String locationId;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final String metadata;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final Integer quantity;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public LocationSkuCountUpdateBody(String locationId, String warehouseId, String sku, Integer num, Integer num2, String metadata, String userId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.locationId = locationId;
        this.warehouseId = warehouseId;
        this.sku = sku;
        this.quantity = num;
        this.allocatedQuantity = num2;
        this.metadata = metadata;
        this.userId = userId;
    }

    public static /* synthetic */ LocationSkuCountUpdateBody copy$default(LocationSkuCountUpdateBody locationSkuCountUpdateBody, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationSkuCountUpdateBody.locationId;
        }
        if ((i & 2) != 0) {
            str2 = locationSkuCountUpdateBody.warehouseId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = locationSkuCountUpdateBody.sku;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            num = locationSkuCountUpdateBody.quantity;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = locationSkuCountUpdateBody.allocatedQuantity;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            str4 = locationSkuCountUpdateBody.metadata;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = locationSkuCountUpdateBody.userId;
        }
        return locationSkuCountUpdateBody.copy(str, str6, str7, num3, num4, str8, str5);
    }

    public final String component1() {
        return this.locationId;
    }

    public final String component2() {
        return this.warehouseId;
    }

    public final String component3() {
        return this.sku;
    }

    public final Integer component4() {
        return this.quantity;
    }

    public final Integer component5() {
        return this.allocatedQuantity;
    }

    public final String component6() {
        return this.metadata;
    }

    public final String component7() {
        return this.userId;
    }

    public final LocationSkuCountUpdateBody copy(String locationId, String warehouseId, String sku, Integer num, Integer num2, String metadata, String userId) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new LocationSkuCountUpdateBody(locationId, warehouseId, sku, num, num2, metadata, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationSkuCountUpdateBody) {
            LocationSkuCountUpdateBody locationSkuCountUpdateBody = (LocationSkuCountUpdateBody) obj;
            return Intrinsics.areEqual(this.locationId, locationSkuCountUpdateBody.locationId) && Intrinsics.areEqual(this.warehouseId, locationSkuCountUpdateBody.warehouseId) && Intrinsics.areEqual(this.sku, locationSkuCountUpdateBody.sku) && Intrinsics.areEqual(this.quantity, locationSkuCountUpdateBody.quantity) && Intrinsics.areEqual(this.allocatedQuantity, locationSkuCountUpdateBody.allocatedQuantity) && Intrinsics.areEqual(this.metadata, locationSkuCountUpdateBody.metadata) && Intrinsics.areEqual(this.userId, locationSkuCountUpdateBody.userId);
        }
        return false;
    }

    public final Integer getAllocatedQuantity() {
        return this.allocatedQuantity;
    }

    public final String getLocationId() {
        return this.locationId;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Integer getQuantity() {
        return this.quantity;
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
        int hashCode = ((((this.locationId.hashCode() * 31) + this.warehouseId.hashCode()) * 31) + this.sku.hashCode()) * 31;
        Integer num = this.quantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.allocatedQuantity;
        return ((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.metadata.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        String str = this.locationId;
        String str2 = this.warehouseId;
        String str3 = this.sku;
        Integer num = this.quantity;
        Integer num2 = this.allocatedQuantity;
        String str4 = this.metadata;
        String str5 = this.userId;
        return "LocationSkuCountUpdateBody(locationId=" + str + ", warehouseId=" + str2 + ", sku=" + str3 + ", quantity=" + num + ", allocatedQuantity=" + num2 + ", metadata=" + str4 + ", userId=" + str5 + ")";
    }

    public /* synthetic */ LocationSkuCountUpdateBody(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? "{}" : str4, str5);
    }
}
