package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/DeliveryLocation;", "Landroid/os/Parcelable;", "id", "", "location", "Lco/bird/android/model/wire/WireLocation;", "notes", PaymentMethod.BillingDetails.PARAM_ADDRESS, "photoUrl", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNotes", "getPhotoUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryLocation implements Parcelable {
    public static final Parcelable.Creator<DeliveryLocation> CREATOR = new Creator();
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66586id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliveryLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryLocation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryLocation(parcel.readString(), (WireLocation) parcel.readParcelable(DeliveryLocation.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryLocation[] newArray(int i) {
            return new DeliveryLocation[i];
        }
    }

    public DeliveryLocation() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DeliveryLocation copy$default(DeliveryLocation deliveryLocation, String str, WireLocation wireLocation, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryLocation.f66586id;
        }
        if ((i & 2) != 0) {
            wireLocation = deliveryLocation.location;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i & 4) != 0) {
            str2 = deliveryLocation.notes;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = deliveryLocation.address;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = deliveryLocation.photoUrl;
        }
        return deliveryLocation.copy(str, wireLocation2, str5, str6, str4);
    }

    public final String component1() {
        return this.f66586id;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final String component3() {
        return this.notes;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.photoUrl;
    }

    public final DeliveryLocation copy(String id, WireLocation location, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        return new DeliveryLocation(id, location, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryLocation) {
            DeliveryLocation deliveryLocation = (DeliveryLocation) obj;
            return Intrinsics.areEqual(this.f66586id, deliveryLocation.f66586id) && Intrinsics.areEqual(this.location, deliveryLocation.location) && Intrinsics.areEqual(this.notes, deliveryLocation.notes) && Intrinsics.areEqual(this.address, deliveryLocation.address) && Intrinsics.areEqual(this.photoUrl, deliveryLocation.photoUrl);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getId() {
        return this.f66586id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        int hashCode = ((this.f66586id.hashCode() * 31) + this.location.hashCode()) * 31;
        String str = this.notes;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66586id;
        WireLocation wireLocation = this.location;
        String str2 = this.notes;
        String str3 = this.address;
        String str4 = this.photoUrl;
        return "DeliveryLocation(id=" + str + ", location=" + wireLocation + ", notes=" + str2 + ", address=" + str3 + ", photoUrl=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66586id);
        out.writeParcelable(this.location, i);
        out.writeString(this.notes);
        out.writeString(this.address);
        out.writeString(this.photoUrl);
    }

    public DeliveryLocation(String id, WireLocation location, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f66586id = id;
        this.location = location;
        this.notes = str;
        this.address = str2;
        this.photoUrl = str3;
    }

    public /* synthetic */ DeliveryLocation(String str, WireLocation wireLocation, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
