package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireBrand;", "Landroid/os/Parcelable;", "id", "", "name", "vehicleModels", "", "Lco/bird/android/model/wire/WireVehicleModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getVehicleModels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBrand implements Parcelable {
    public static final Parcelable.Creator<WireBrand> CREATOR = new Creator();
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66721id;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("vehicle_models")
    @InterfaceC41208ft5("vehicle_models")
    private final List<WireVehicleModel> vehicleModels;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBrand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBrand createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(WireVehicleModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WireBrand(readString, readString2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBrand[] newArray(int i) {
            return new WireBrand[i];
        }
    }

    public WireBrand() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireBrand copy$default(WireBrand wireBrand, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBrand.f66721id;
        }
        if ((i & 2) != 0) {
            str2 = wireBrand.name;
        }
        if ((i & 4) != 0) {
            list = wireBrand.vehicleModels;
        }
        return wireBrand.copy(str, str2, list);
    }

    public final String component1() {
        return this.f66721id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<WireVehicleModel> component3() {
        return this.vehicleModels;
    }

    public final WireBrand copy(String str, String str2, List<WireVehicleModel> list) {
        return new WireBrand(str, str2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBrand) {
            WireBrand wireBrand = (WireBrand) obj;
            return Intrinsics.areEqual(this.f66721id, wireBrand.f66721id) && Intrinsics.areEqual(this.name, wireBrand.name) && Intrinsics.areEqual(this.vehicleModels, wireBrand.vehicleModels);
        }
        return false;
    }

    public final String getId() {
        return this.f66721id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<WireVehicleModel> getVehicleModels() {
        return this.vehicleModels;
    }

    public int hashCode() {
        String str = this.f66721id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<WireVehicleModel> list = this.vehicleModels;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66721id;
        String str2 = this.name;
        List<WireVehicleModel> list = this.vehicleModels;
        return "WireBrand(id=" + str + ", name=" + str2 + ", vehicleModels=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66721id);
        out.writeString(this.name);
        List<WireVehicleModel> list = this.vehicleModels;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (WireVehicleModel wireVehicleModel : list) {
            wireVehicleModel.writeToParcel(out, i);
        }
    }

    public WireBrand(String str, String str2, List<WireVehicleModel> list) {
        this.f66721id = str;
        this.name = str2;
        this.vehicleModels = list;
    }

    public /* synthetic */ WireBrand(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
