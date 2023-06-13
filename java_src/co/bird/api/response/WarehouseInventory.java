package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006."}, m28432d2 = {"Lco/bird/api/response/WarehouseInventory;", "Landroid/os/Parcelable;", "name", "", "binCount", "", "binWeight", "", "binDefinition", "Lco/bird/api/response/WireBinDefinition;", "quantity", "excessInventoryQuantity", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)V", "getBinCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBinDefinition", "()Lco/bird/api/response/WireBinDefinition;", "getBinWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getExcessInventoryQuantity", "()I", "getName", "()Ljava/lang/String;", "getQuantity", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Lco/bird/api/response/WireBinDefinition;II)Lco/bird/api/response/WarehouseInventory;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WarehouseInventory implements Parcelable {
    public static final Parcelable.Creator<WarehouseInventory> CREATOR = new Creator();
    @JsonProperty("bin_count")
    @InterfaceC41208ft5("bin_count")
    private final Integer binCount;
    @JsonProperty("bin_definition")
    @InterfaceC41208ft5("bin_definition")
    private final WireBinDefinition binDefinition;
    @JsonProperty("bin_weight")
    @InterfaceC41208ft5("bin_weight")
    private final Float binWeight;
    @JsonProperty("excess_inventory_quantity")
    @InterfaceC41208ft5("excess_inventory_quantity")
    private final int excessInventoryQuantity;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WarehouseInventory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WarehouseInventory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WarehouseInventory(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? WireBinDefinition.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WarehouseInventory[] newArray(int i) {
            return new WarehouseInventory[i];
        }
    }

    public WarehouseInventory() {
        this(null, null, null, null, 0, 0, 63, null);
    }

    public static /* synthetic */ WarehouseInventory copy$default(WarehouseInventory warehouseInventory, String str, Integer num, Float f, WireBinDefinition wireBinDefinition, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = warehouseInventory.name;
        }
        if ((i3 & 2) != 0) {
            num = warehouseInventory.binCount;
        }
        Integer num2 = num;
        if ((i3 & 4) != 0) {
            f = warehouseInventory.binWeight;
        }
        Float f2 = f;
        if ((i3 & 8) != 0) {
            wireBinDefinition = warehouseInventory.binDefinition;
        }
        WireBinDefinition wireBinDefinition2 = wireBinDefinition;
        if ((i3 & 16) != 0) {
            i = warehouseInventory.quantity;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = warehouseInventory.excessInventoryQuantity;
        }
        return warehouseInventory.copy(str, num2, f2, wireBinDefinition2, i4, i2);
    }

    public final String component1() {
        return this.name;
    }

    public final Integer component2() {
        return this.binCount;
    }

    public final Float component3() {
        return this.binWeight;
    }

    public final WireBinDefinition component4() {
        return this.binDefinition;
    }

    public final int component5() {
        return this.quantity;
    }

    public final int component6() {
        return this.excessInventoryQuantity;
    }

    public final WarehouseInventory copy(String str, Integer num, Float f, WireBinDefinition wireBinDefinition, int i, int i2) {
        return new WarehouseInventory(str, num, f, wireBinDefinition, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WarehouseInventory) {
            WarehouseInventory warehouseInventory = (WarehouseInventory) obj;
            return Intrinsics.areEqual(this.name, warehouseInventory.name) && Intrinsics.areEqual(this.binCount, warehouseInventory.binCount) && Intrinsics.areEqual((Object) this.binWeight, (Object) warehouseInventory.binWeight) && Intrinsics.areEqual(this.binDefinition, warehouseInventory.binDefinition) && this.quantity == warehouseInventory.quantity && this.excessInventoryQuantity == warehouseInventory.excessInventoryQuantity;
        }
        return false;
    }

    public final Integer getBinCount() {
        return this.binCount;
    }

    public final WireBinDefinition getBinDefinition() {
        return this.binDefinition;
    }

    public final Float getBinWeight() {
        return this.binWeight;
    }

    public final int getExcessInventoryQuantity() {
        return this.excessInventoryQuantity;
    }

    public final String getName() {
        return this.name;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.binCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.binWeight;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        WireBinDefinition wireBinDefinition = this.binDefinition;
        return ((((hashCode3 + (wireBinDefinition != null ? wireBinDefinition.hashCode() : 0)) * 31) + Integer.hashCode(this.quantity)) * 31) + Integer.hashCode(this.excessInventoryQuantity);
    }

    public String toString() {
        String str = this.name;
        Integer num = this.binCount;
        Float f = this.binWeight;
        WireBinDefinition wireBinDefinition = this.binDefinition;
        int i = this.quantity;
        int i2 = this.excessInventoryQuantity;
        return "WarehouseInventory(name=" + str + ", binCount=" + num + ", binWeight=" + f + ", binDefinition=" + wireBinDefinition + ", quantity=" + i + ", excessInventoryQuantity=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        Integer num = this.binCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Float f = this.binWeight;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        WireBinDefinition wireBinDefinition = this.binDefinition;
        if (wireBinDefinition == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireBinDefinition.writeToParcel(out, i);
        }
        out.writeInt(this.quantity);
        out.writeInt(this.excessInventoryQuantity);
    }

    public WarehouseInventory(String str, Integer num, Float f, WireBinDefinition wireBinDefinition, int i, int i2) {
        this.name = str;
        this.binCount = num;
        this.binWeight = f;
        this.binDefinition = wireBinDefinition;
        this.quantity = i;
        this.excessInventoryQuantity = i2;
    }

    public /* synthetic */ WarehouseInventory(String str, Integer num, Float f, WireBinDefinition wireBinDefinition, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : f, (i3 & 8) == 0 ? wireBinDefinition : null, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
