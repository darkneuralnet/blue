package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m28432d2 = {"Lco/bird/api/response/WireBinDefinition;", "Landroid/os/Parcelable;", "id", "", "sku", "size", "maxQuantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getMaxQuantity", "()I", "getSize", "getSku", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBinDefinition implements Parcelable {
    public static final Parcelable.Creator<WireBinDefinition> CREATOR = new Creator();
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68232id;
    @JsonProperty("max_quantity")
    @InterfaceC41208ft5("max_quantity")
    private final int maxQuantity;
    @JsonProperty("size")
    @InterfaceC41208ft5("size")
    private final String size;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBinDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBinDefinition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireBinDefinition(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBinDefinition[] newArray(int i) {
            return new WireBinDefinition[i];
        }
    }

    public WireBinDefinition() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ WireBinDefinition copy$default(WireBinDefinition wireBinDefinition, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireBinDefinition.f68232id;
        }
        if ((i2 & 2) != 0) {
            str2 = wireBinDefinition.sku;
        }
        if ((i2 & 4) != 0) {
            str3 = wireBinDefinition.size;
        }
        if ((i2 & 8) != 0) {
            i = wireBinDefinition.maxQuantity;
        }
        return wireBinDefinition.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.f68232id;
    }

    public final String component2() {
        return this.sku;
    }

    public final String component3() {
        return this.size;
    }

    public final int component4() {
        return this.maxQuantity;
    }

    public final WireBinDefinition copy(String id, String sku, String size, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(size, "size");
        return new WireBinDefinition(id, sku, size, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBinDefinition) {
            WireBinDefinition wireBinDefinition = (WireBinDefinition) obj;
            return Intrinsics.areEqual(this.f68232id, wireBinDefinition.f68232id) && Intrinsics.areEqual(this.sku, wireBinDefinition.sku) && Intrinsics.areEqual(this.size, wireBinDefinition.size) && this.maxQuantity == wireBinDefinition.maxQuantity;
        }
        return false;
    }

    public final String getId() {
        return this.f68232id;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return (((((this.f68232id.hashCode() * 31) + this.sku.hashCode()) * 31) + this.size.hashCode()) * 31) + Integer.hashCode(this.maxQuantity);
    }

    public String toString() {
        String str = this.f68232id;
        String str2 = this.sku;
        String str3 = this.size;
        int i = this.maxQuantity;
        return "WireBinDefinition(id=" + str + ", sku=" + str2 + ", size=" + str3 + ", maxQuantity=" + i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f68232id);
        out.writeString(this.sku);
        out.writeString(this.size);
        out.writeInt(this.maxQuantity);
    }

    public WireBinDefinition(String id, String sku, String size, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f68232id = id;
        this.sku = sku;
        this.size = size;
        this.maxQuantity = i;
    }

    public /* synthetic */ WireBinDefinition(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
