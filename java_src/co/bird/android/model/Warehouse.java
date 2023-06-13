package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "Landroid/os/Parcelable;", "id", "", "name", "active", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "kind", "Lco/bird/android/model/WarehouseKind;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/WarehouseKind;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAddress", "()Ljava/lang/String;", "getId", "getKind", "()Lco/bird/android/model/WarehouseKind;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/WarehouseKind;)Lco/bird/android/model/Warehouse;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Warehouse implements Parcelable {
    public static final Parcelable.Creator<Warehouse> CREATOR = new Creator();
    @JsonProperty("active")
    @InterfaceC41208ft5("active")
    private final Boolean active;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66635id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final WarehouseKind kind;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Warehouse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warehouse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Warehouse(readString, readString2, valueOf, parcel.readString(), parcel.readInt() == 0 ? null : WarehouseKind.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warehouse[] newArray(int i) {
            return new Warehouse[i];
        }
    }

    public Warehouse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Warehouse copy$default(Warehouse warehouse, String str, String str2, Boolean bool, String str3, WarehouseKind warehouseKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = warehouse.f66635id;
        }
        if ((i & 2) != 0) {
            str2 = warehouse.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = warehouse.active;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = warehouse.address;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            warehouseKind = warehouse.kind;
        }
        return warehouse.copy(str, str4, bool2, str5, warehouseKind);
    }

    public final String component1() {
        return this.f66635id;
    }

    public final String component2() {
        return this.name;
    }

    public final Boolean component3() {
        return this.active;
    }

    public final String component4() {
        return this.address;
    }

    public final WarehouseKind component5() {
        return this.kind;
    }

    public final Warehouse copy(String str, String str2, Boolean bool, String str3, WarehouseKind warehouseKind) {
        return new Warehouse(str, str2, bool, str3, warehouseKind);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Warehouse) {
            Warehouse warehouse = (Warehouse) obj;
            return Intrinsics.areEqual(this.f66635id, warehouse.f66635id) && Intrinsics.areEqual(this.name, warehouse.name) && Intrinsics.areEqual(this.active, warehouse.active) && Intrinsics.areEqual(this.address, warehouse.address) && this.kind == warehouse.kind;
        }
        return false;
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getId() {
        return this.f66635id;
    }

    public final WarehouseKind getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.f66635id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.active;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.address;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WarehouseKind warehouseKind = this.kind;
        return hashCode4 + (warehouseKind != null ? warehouseKind.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66635id;
        String str2 = this.name;
        Boolean bool = this.active;
        String str3 = this.address;
        WarehouseKind warehouseKind = this.kind;
        return "Warehouse(id=" + str + ", name=" + str2 + ", active=" + bool + ", address=" + str3 + ", kind=" + warehouseKind + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66635id);
        out.writeString(this.name);
        Boolean bool = this.active;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.address);
        WarehouseKind warehouseKind = this.kind;
        if (warehouseKind == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(warehouseKind.name());
    }

    public Warehouse(String str, String str2, Boolean bool, String str3, WarehouseKind warehouseKind) {
        this.f66635id = str;
        this.name = str2;
        this.active = bool;
        this.address = str3;
        this.kind = warehouseKind;
    }

    public /* synthetic */ Warehouse(String str, String str2, Boolean bool, String str3, WarehouseKind warehouseKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : warehouseKind);
    }
}
