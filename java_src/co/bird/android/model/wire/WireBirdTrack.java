package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\u000f¨\u0006/"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdTrack;", "Landroid/os/Parcelable;", "batteryLevel", "", "distance", "location", "Lco/bird/android/model/wire/WireLocation;", "serialNumber", "", "imei", "connected", "", "version", "(Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConnected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDistance", "getImei", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getSerialNumber", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireBirdTrack;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdTrack implements Parcelable {
    public static final Parcelable.Creator<WireBirdTrack> CREATOR = new Creator();
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final Integer batteryLevel;
    @JsonProperty("connected")
    @InterfaceC41208ft5("connected")
    private final Boolean connected;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final Integer distance;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final String imei;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;
    @JsonProperty("version")
    @InterfaceC41208ft5("version")
    private final Integer version;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBirdTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdTrack createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WireLocation createFromParcel = parcel.readInt() == 0 ? null : WireLocation.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WireBirdTrack(valueOf2, valueOf3, createFromParcel, readString, readString2, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdTrack[] newArray(int i) {
            return new WireBirdTrack[i];
        }
    }

    public WireBirdTrack() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WireBirdTrack copy$default(WireBirdTrack wireBirdTrack, Integer num, Integer num2, WireLocation wireLocation, String str, String str2, Boolean bool, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wireBirdTrack.batteryLevel;
        }
        if ((i & 2) != 0) {
            num2 = wireBirdTrack.distance;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            wireLocation = wireBirdTrack.location;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i & 8) != 0) {
            str = wireBirdTrack.serialNumber;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = wireBirdTrack.imei;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            bool = wireBirdTrack.connected;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            num3 = wireBirdTrack.version;
        }
        return wireBirdTrack.copy(num, num4, wireLocation2, str3, str4, bool2, num3);
    }

    public final Integer component1() {
        return this.batteryLevel;
    }

    public final Integer component2() {
        return this.distance;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final String component4() {
        return this.serialNumber;
    }

    public final String component5() {
        return this.imei;
    }

    public final Boolean component6() {
        return this.connected;
    }

    public final Integer component7() {
        return this.version;
    }

    public final WireBirdTrack copy(Integer num, Integer num2, WireLocation wireLocation, String str, String str2, Boolean bool, Integer num3) {
        return new WireBirdTrack(num, num2, wireLocation, str, str2, bool, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdTrack) {
            WireBirdTrack wireBirdTrack = (WireBirdTrack) obj;
            return Intrinsics.areEqual(this.batteryLevel, wireBirdTrack.batteryLevel) && Intrinsics.areEqual(this.distance, wireBirdTrack.distance) && Intrinsics.areEqual(this.location, wireBirdTrack.location) && Intrinsics.areEqual(this.serialNumber, wireBirdTrack.serialNumber) && Intrinsics.areEqual(this.imei, wireBirdTrack.imei) && Intrinsics.areEqual(this.connected, wireBirdTrack.connected) && Intrinsics.areEqual(this.version, wireBirdTrack.version);
        }
        return false;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final Boolean getConnected() {
        return this.connected;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final String getImei() {
        return this.imei;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.batteryLevel;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.distance;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        int hashCode3 = (hashCode2 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        String str = this.serialNumber;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imei;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.connected;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.version;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.batteryLevel;
        Integer num2 = this.distance;
        WireLocation wireLocation = this.location;
        String str = this.serialNumber;
        String str2 = this.imei;
        Boolean bool = this.connected;
        Integer num3 = this.version;
        return "WireBirdTrack(batteryLevel=" + num + ", distance=" + num2 + ", location=" + wireLocation + ", serialNumber=" + str + ", imei=" + str2 + ", connected=" + bool + ", version=" + num3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.batteryLevel;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.distance;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        WireLocation wireLocation = this.location;
        if (wireLocation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireLocation.writeToParcel(out, i);
        }
        out.writeString(this.serialNumber);
        out.writeString(this.imei);
        Boolean bool = this.connected;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.version;
        if (num3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num3.intValue());
    }

    public WireBirdTrack(Integer num, Integer num2, WireLocation wireLocation, String str, String str2, Boolean bool, Integer num3) {
        this.batteryLevel = num;
        this.distance = num2;
        this.location = wireLocation;
        this.serialNumber = str;
        this.imei = str2;
        this.connected = bool;
        this.version = num3;
    }

    public /* synthetic */ WireBirdTrack(Integer num, Integer num2, WireLocation wireLocation, String str, String str2, Boolean bool, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : wireLocation, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) == 0 ? num3 : null);
    }
}
