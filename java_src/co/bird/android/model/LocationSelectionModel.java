package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireLocation;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/LocationSelectionModel;", "Landroid/os/Parcelable;", "location", "Lco/bird/android/model/wire/WireLocation;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocationSelectionModel implements Parcelable {
    public static final Parcelable.Creator<LocationSelectionModel> CREATOR = new Creator();
    private final String address;
    private final WireLocation location;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<LocationSelectionModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationSelectionModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationSelectionModel((WireLocation) parcel.readParcelable(LocationSelectionModel.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationSelectionModel[] newArray(int i) {
            return new LocationSelectionModel[i];
        }
    }

    public LocationSelectionModel(WireLocation location, String address) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(address, "address");
        this.location = location;
        this.address = address;
    }

    public static /* synthetic */ LocationSelectionModel copy$default(LocationSelectionModel locationSelectionModel, WireLocation wireLocation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = locationSelectionModel.location;
        }
        if ((i & 2) != 0) {
            str = locationSelectionModel.address;
        }
        return locationSelectionModel.copy(wireLocation, str);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final String component2() {
        return this.address;
    }

    public final LocationSelectionModel copy(WireLocation location, String address) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(address, "address");
        return new LocationSelectionModel(location, address);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationSelectionModel) {
            LocationSelectionModel locationSelectionModel = (LocationSelectionModel) obj;
            return Intrinsics.areEqual(this.location, locationSelectionModel.location) && Intrinsics.areEqual(this.address, locationSelectionModel.address);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.address.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        String str = this.address;
        return "LocationSelectionModel(location=" + wireLocation + ", address=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.location, i);
        out.writeString(this.address);
    }
}
