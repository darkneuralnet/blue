package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006#"}, m28432d2 = {"Lco/bird/api/response/WireInventoryCount;", "Landroid/os/Parcelable;", "id", "", "sku", "warehouseId", "quantity", "", "excessInventoryQuantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getExcessInventoryQuantity", "()I", "getId", "()Ljava/lang/String;", "getQuantity", "getSku", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireInventoryCount implements Parcelable {
    public static final Parcelable.Creator<WireInventoryCount> CREATOR = new Creator();
    @JsonProperty("excess_inventory_quantity")
    @InterfaceC41208ft5("excess_inventory_quantity")
    private final int excessInventoryQuantity;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68235id;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireInventoryCount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireInventoryCount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireInventoryCount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireInventoryCount[] newArray(int i) {
            return new WireInventoryCount[i];
        }
    }

    public WireInventoryCount() {
        this(null, null, null, 0, 0, 31, null);
    }

    public static /* synthetic */ WireInventoryCount copy$default(WireInventoryCount wireInventoryCount, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wireInventoryCount.f68235id;
        }
        if ((i3 & 2) != 0) {
            str2 = wireInventoryCount.sku;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = wireInventoryCount.warehouseId;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = wireInventoryCount.quantity;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = wireInventoryCount.excessInventoryQuantity;
        }
        return wireInventoryCount.copy(str, str4, str5, i4, i2);
    }

    public final String component1() {
        return this.f68235id;
    }

    public final String component2() {
        return this.sku;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final int component4() {
        return this.quantity;
    }

    public final int component5() {
        return this.excessInventoryQuantity;
    }

    public final WireInventoryCount copy(String id, String sku, String warehouseId, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        return new WireInventoryCount(id, sku, warehouseId, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireInventoryCount) {
            WireInventoryCount wireInventoryCount = (WireInventoryCount) obj;
            return Intrinsics.areEqual(this.f68235id, wireInventoryCount.f68235id) && Intrinsics.areEqual(this.sku, wireInventoryCount.sku) && Intrinsics.areEqual(this.warehouseId, wireInventoryCount.warehouseId) && this.quantity == wireInventoryCount.quantity && this.excessInventoryQuantity == wireInventoryCount.excessInventoryQuantity;
        }
        return false;
    }

    public final int getExcessInventoryQuantity() {
        return this.excessInventoryQuantity;
    }

    public final String getId() {
        return this.f68235id;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        return (((((((this.f68235id.hashCode() * 31) + this.sku.hashCode()) * 31) + this.warehouseId.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Integer.hashCode(this.excessInventoryQuantity);
    }

    public String toString() {
        String str = this.f68235id;
        String str2 = this.sku;
        String str3 = this.warehouseId;
        int i = this.quantity;
        int i2 = this.excessInventoryQuantity;
        return "WireInventoryCount(id=" + str + ", sku=" + str2 + ", warehouseId=" + str3 + ", quantity=" + i + ", excessInventoryQuantity=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f68235id);
        out.writeString(this.sku);
        out.writeString(this.warehouseId);
        out.writeInt(this.quantity);
        out.writeInt(this.excessInventoryQuantity);
    }

    public WireInventoryCount(String id, String sku, String warehouseId, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        this.f68235id = id;
        this.sku = sku;
        this.warehouseId = warehouseId;
        this.quantity = i;
        this.excessInventoryQuantity = i2;
    }

    public /* synthetic */ WireInventoryCount(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
