package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetailsEmptyState;", "Landroid/os/Parcelable;", "title", "", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehiclePricingDetailsEmptyState implements Parcelable {
    public static final Parcelable.Creator<VehiclePricingDetailsEmptyState> CREATOR = new Creator();
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VehiclePricingDetailsEmptyState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricingDetailsEmptyState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehiclePricingDetailsEmptyState(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricingDetailsEmptyState[] newArray(int i) {
            return new VehiclePricingDetailsEmptyState[i];
        }
    }

    public VehiclePricingDetailsEmptyState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ VehiclePricingDetailsEmptyState copy$default(VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vehiclePricingDetailsEmptyState.title;
        }
        if ((i & 2) != 0) {
            str2 = vehiclePricingDetailsEmptyState.subtitle;
        }
        return vehiclePricingDetailsEmptyState.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final VehiclePricingDetailsEmptyState copy(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new VehiclePricingDetailsEmptyState(title, subtitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehiclePricingDetailsEmptyState) {
            VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState = (VehiclePricingDetailsEmptyState) obj;
            return Intrinsics.areEqual(this.title, vehiclePricingDetailsEmptyState.title) && Intrinsics.areEqual(this.subtitle, vehiclePricingDetailsEmptyState.subtitle);
        }
        return false;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return "VehiclePricingDetailsEmptyState(title=" + str + ", subtitle=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.title);
        out.writeString(this.subtitle);
    }

    public VehiclePricingDetailsEmptyState(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
    }

    public /* synthetic */ VehiclePricingDetailsEmptyState(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}