package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdLocationTrack;", "Landroid/os/Parcelable;", "location", "Lco/bird/android/model/wire/WireLocation;", "createdAt", "Lorg/joda/time/DateTime;", "(Lco/bird/android/model/wire/WireLocation;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdLocationTrack implements Parcelable {
    public static final Parcelable.Creator<WireBirdLocationTrack> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBirdLocationTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdLocationTrack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireBirdLocationTrack(WireLocation.CREATOR.createFromParcel(parcel), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdLocationTrack[] newArray(int i) {
            return new WireBirdLocationTrack[i];
        }
    }

    public WireBirdLocationTrack(WireLocation location, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.location = location;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ WireBirdLocationTrack copy$default(WireBirdLocationTrack wireBirdLocationTrack, WireLocation wireLocation, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = wireBirdLocationTrack.location;
        }
        if ((i & 2) != 0) {
            dateTime = wireBirdLocationTrack.createdAt;
        }
        return wireBirdLocationTrack.copy(wireLocation, dateTime);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final DateTime component2() {
        return this.createdAt;
    }

    public final WireBirdLocationTrack copy(WireLocation location, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireBirdLocationTrack(location, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdLocationTrack) {
            WireBirdLocationTrack wireBirdLocationTrack = (WireBirdLocationTrack) obj;
            return Intrinsics.areEqual(this.location, wireBirdLocationTrack.location) && Intrinsics.areEqual(this.createdAt, wireBirdLocationTrack.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        DateTime dateTime = this.createdAt;
        return "WireBirdLocationTrack(location=" + wireLocation + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.location.writeToParcel(out, i);
        out.writeSerializable(this.createdAt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireBirdLocationTrack(WireLocation wireLocation, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireLocation, dateTime);
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
