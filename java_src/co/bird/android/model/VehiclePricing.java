package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/VehiclePricing;", "Landroid/os/Parcelable;", "id", "", "imageUrl", "name", "details", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getId", "getImageUrl", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehiclePricing implements Parcelable {
    public static final Parcelable.Creator<VehiclePricing> CREATOR = new Creator();
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66633id;
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VehiclePricing> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricing createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehiclePricing(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricing[] newArray(int i) {
            return new VehiclePricing[i];
        }
    }

    public VehiclePricing() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ VehiclePricing copy$default(VehiclePricing vehiclePricing, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vehiclePricing.f66633id;
        }
        if ((i & 2) != 0) {
            str2 = vehiclePricing.imageUrl;
        }
        if ((i & 4) != 0) {
            str3 = vehiclePricing.name;
        }
        if ((i & 8) != 0) {
            str4 = vehiclePricing.details;
        }
        return vehiclePricing.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f66633id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.details;
    }

    public final VehiclePricing copy(String id, String str, String name, String details) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(details, "details");
        return new VehiclePricing(id, str, name, details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof VehiclePricing)) {
            VehiclePricing vehiclePricing = (VehiclePricing) obj;
            if (Intrinsics.areEqual(this.f66633id, vehiclePricing.f66633id)) {
                if (!Intrinsics.areEqual(this.f66633id, vehiclePricing.f66633id) || Intrinsics.areEqual(this.details, vehiclePricing.details)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getId() {
        return this.f66633id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.f66633id.hashCode();
    }

    public String toString() {
        String str = this.f66633id;
        String str2 = this.imageUrl;
        String str3 = this.name;
        String str4 = this.details;
        return "VehiclePricing(id=" + str + ", imageUrl=" + str2 + ", name=" + str3 + ", details=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66633id);
        out.writeString(this.imageUrl);
        out.writeString(this.name);
        out.writeString(this.details);
    }

    public VehiclePricing(String id, String str, String name, String details) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f66633id = id;
        this.imageUrl = str;
        this.name = name;
        this.details = details;
    }

    public /* synthetic */ VehiclePricing(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
