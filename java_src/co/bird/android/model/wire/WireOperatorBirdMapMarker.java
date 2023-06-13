package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0000J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorBirdMapMarker;", "Landroid/os/Parcelable;", "id", "", "batteryLevel", "", "location", "Lco/bird/android/model/wire/WireLocation;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "fleetMarker", "Lco/bird/android/model/wire/WireFleetMarker;", "(Ljava/lang/String;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireFleetMarker;)V", "getBatteryLevel", "()I", "getCode", "()Ljava/lang/String;", "getFleetMarker", "()Lco/bird/android/model/wire/WireFleetMarker;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "isSame", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorBirdMapMarker implements Parcelable {
    public static final Parcelable.Creator<WireOperatorBirdMapMarker> CREATOR = new Creator();
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("fleet_marker")
    @InterfaceC41208ft5("fleet_marker")
    private final WireFleetMarker fleetMarker;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66744id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireOperatorBirdMapMarker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireOperatorBirdMapMarker createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireOperatorBirdMapMarker(parcel.readString(), parcel.readInt(), WireLocation.CREATOR.createFromParcel(parcel), parcel.readString(), WireFleetMarker.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireOperatorBirdMapMarker[] newArray(int i) {
            return new WireOperatorBirdMapMarker[i];
        }
    }

    public WireOperatorBirdMapMarker() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ WireOperatorBirdMapMarker copy$default(WireOperatorBirdMapMarker wireOperatorBirdMapMarker, String str, int i, WireLocation wireLocation, String str2, WireFleetMarker wireFleetMarker, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireOperatorBirdMapMarker.f66744id;
        }
        if ((i2 & 2) != 0) {
            i = wireOperatorBirdMapMarker.batteryLevel;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            wireLocation = wireOperatorBirdMapMarker.location;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i2 & 8) != 0) {
            str2 = wireOperatorBirdMapMarker.code;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            wireFleetMarker = wireOperatorBirdMapMarker.fleetMarker;
        }
        return wireOperatorBirdMapMarker.copy(str, i3, wireLocation2, str3, wireFleetMarker);
    }

    public final String component1() {
        return this.f66744id;
    }

    public final int component2() {
        return this.batteryLevel;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final String component4() {
        return this.code;
    }

    public final WireFleetMarker component5() {
        return this.fleetMarker;
    }

    public final WireOperatorBirdMapMarker copy(String id, int i, WireLocation location, String code, WireFleetMarker fleetMarker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fleetMarker, "fleetMarker");
        return new WireOperatorBirdMapMarker(id, i, location, code, fleetMarker);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorBirdMapMarker) {
            WireOperatorBirdMapMarker wireOperatorBirdMapMarker = (WireOperatorBirdMapMarker) obj;
            return Intrinsics.areEqual(this.f66744id, wireOperatorBirdMapMarker.f66744id) && this.batteryLevel == wireOperatorBirdMapMarker.batteryLevel && Intrinsics.areEqual(this.location, wireOperatorBirdMapMarker.location) && Intrinsics.areEqual(this.code, wireOperatorBirdMapMarker.code) && Intrinsics.areEqual(this.fleetMarker, wireOperatorBirdMapMarker.fleetMarker);
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCode() {
        return this.code;
    }

    public final WireFleetMarker getFleetMarker() {
        return this.fleetMarker;
    }

    public final String getId() {
        return this.f66744id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (((((((this.f66744id.hashCode() * 31) + Integer.hashCode(this.batteryLevel)) * 31) + this.location.hashCode()) * 31) + this.code.hashCode()) * 31) + this.fleetMarker.hashCode();
    }

    public final boolean isSame(WireOperatorBirdMapMarker other) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z4 = true;
        if (this.f66744id.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (other.f66744id.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return Intrinsics.areEqual(this.f66744id, other.f66744id);
            }
        }
        if (this.code.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (other.code.length() <= 0) {
                z4 = false;
            }
            if (z4) {
                return Intrinsics.areEqual(this.code, other.code);
            }
        }
        return false;
    }

    public String toString() {
        String str = this.f66744id;
        int i = this.batteryLevel;
        WireLocation wireLocation = this.location;
        String str2 = this.code;
        WireFleetMarker wireFleetMarker = this.fleetMarker;
        return "WireOperatorBirdMapMarker(id=" + str + ", batteryLevel=" + i + ", location=" + wireLocation + ", code=" + str2 + ", fleetMarker=" + wireFleetMarker + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66744id);
        out.writeInt(this.batteryLevel);
        this.location.writeToParcel(out, i);
        out.writeString(this.code);
        this.fleetMarker.writeToParcel(out, i);
    }

    public WireOperatorBirdMapMarker(String id, int i, WireLocation location, String code, WireFleetMarker fleetMarker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fleetMarker, "fleetMarker");
        this.f66744id = id;
        this.batteryLevel = i;
        this.location = location;
        this.code = code;
        this.fleetMarker = fleetMarker;
    }

    public /* synthetic */ WireOperatorBirdMapMarker(String str, int i, WireLocation wireLocation, String str2, WireFleetMarker wireFleetMarker, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? new WireFleetMarker(null, null, null, null, 0, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null) : wireFleetMarker);
    }
}
