package co.bird.android.model.wire;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.FraudDetectionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jp\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020+HÖ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020+H\u0016J\t\u00102\u001a\u00020\u000eHÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00069"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "Landroid/os/Parcelable;", "latitude", "", "longitude", "heading", TransferTable.COLUMN_SPEED, "altitude", "accuracy", "mocked", "", FraudDetectionData.KEY_TIMESTAMP, "Lorg/joda/time/DateTime;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)V", "getAccuracy", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAltitude", "getHeading", "getLatitude", "()D", "getLongitude", "getMocked", "()Z", "getSource", "()Ljava/lang/String;", "getSpeed", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)Lco/bird/android/model/wire/WireLocation;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "fromLocation", "Landroid/location/Location;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWireLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireLocation.kt\nco/bird/android/model/wire/WireLocation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes4.dex */
public final class WireLocation implements Parcelable {
    public static final String DEFAULT_SOURCE = "gps";
    private final Double accuracy;
    private final Double altitude;
    private final Double heading;
    private final double latitude;
    private final double longitude;
    private final boolean mocked;
    private final String source;
    private final Double speed;
    private final DateTime timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WireLocation> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation$Companion;", "", "()V", "DEFAULT_SOURCE", "", "from", "Lco/bird/android/model/wire/WireLocation;", "latitude", "", "longitude", "heading", TransferTable.COLUMN_SPEED, "altitude", "accuracy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lco/bird/android/model/wire/WireLocation;", "fromLatLngString", "str", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WireLocation from(double d, double d2, Double d3, Double d4, Double d5, Double d6) {
            return new WireLocation(d, d2, d3, d4, d5, d6, false, null, null, 448, null);
        }

        public final WireLocation fromLatLngString(String str) throws NumberFormatException {
            List split;
            Intrinsics.checkNotNullParameter(str, "str");
            split = StringsKt__StringsKt.split((CharSequence) str, new String[]{","}, true, 2);
            return new WireLocation(Double.parseDouble((String) split.get(0)), Double.parseDouble((String) split.get(1)), null, null, null, null, false, null, null, 508, null);
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLocation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireLocation(parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLocation[] newArray(int i) {
            return new WireLocation[i];
        }
    }

    public WireLocation() {
        this(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final Double component3() {
        return this.heading;
    }

    public final Double component4() {
        return this.speed;
    }

    public final Double component5() {
        return this.altitude;
    }

    public final Double component6() {
        return this.accuracy;
    }

    public final boolean component7() {
        return this.mocked;
    }

    public final DateTime component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.source;
    }

    public final WireLocation copy(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime timestamp, String source) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(source, "source");
        return new WireLocation(d, d2, d3, d4, d5, d6, z, timestamp, source);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(WireLocation.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type co.bird.android.model.wire.WireLocation");
        WireLocation wireLocation = (WireLocation) obj;
        if (this.latitude == wireLocation.latitude) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.longitude == wireLocation.longitude) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.areEqual(this.heading, wireLocation.heading) && Intrinsics.areEqual(this.speed, wireLocation.speed) && Intrinsics.areEqual(this.altitude, wireLocation.altitude) && Intrinsics.areEqual(this.accuracy, wireLocation.accuracy) && this.mocked == wireLocation.mocked) {
            return true;
        }
        return false;
    }

    public final Location fromLocation() {
        Location location = new Location("");
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        location.setTime(this.timestamp.getMillis());
        Double d = this.speed;
        if (d != null) {
            location.setSpeed((float) d.doubleValue());
        }
        Double d2 = this.altitude;
        if (d2 != null) {
            location.setAltitude(d2.doubleValue());
        }
        Double d3 = this.accuracy;
        if (d3 != null) {
            location.setAccuracy((float) d3.doubleValue());
        }
        return location;
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Double getHeading() {
        return this.heading;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean getMocked() {
        return this.mocked;
    }

    public final String getSource() {
        return this.source;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31;
        Double d = this.heading;
        int i4 = 0;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Double d2 = this.speed;
        if (d2 != null) {
            i2 = d2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Double d3 = this.altitude;
        if (d3 != null) {
            i3 = d3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Double d4 = this.accuracy;
        if (d4 != null) {
            i4 = d4.hashCode();
        }
        return ((i7 + i4) * 31) + Boolean.hashCode(this.mocked);
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        Double d3 = this.heading;
        Double d4 = this.speed;
        Double d5 = this.altitude;
        Double d6 = this.accuracy;
        boolean z = this.mocked;
        DateTime dateTime = this.timestamp;
        String str = this.source;
        return "WireLocation(latitude=" + d + ", longitude=" + d2 + ", heading=" + d3 + ", speed=" + d4 + ", altitude=" + d5 + ", accuracy=" + d6 + ", mocked=" + z + ", timestamp=" + dateTime + ", source=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.latitude);
        out.writeDouble(this.longitude);
        Double d = this.heading;
        if (d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d.doubleValue());
        }
        Double d2 = this.speed;
        if (d2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d2.doubleValue());
        }
        Double d3 = this.altitude;
        if (d3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d3.doubleValue());
        }
        Double d4 = this.accuracy;
        if (d4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d4.doubleValue());
        }
        out.writeInt(this.mocked ? 1 : 0);
        out.writeSerializable(this.timestamp);
        out.writeString(this.source);
    }

    public WireLocation(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime timestamp, String source) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(source, "source");
        this.latitude = d;
        this.longitude = d2;
        this.heading = d3;
        this.speed = d4;
        this.altitude = d5;
        this.accuracy = d6;
        this.mocked = z;
        this.timestamp = timestamp;
        this.source = source;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireLocation(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime dateTime, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r2, r1, r7, r8, r6, r9, r10, (i & 256) != 0 ? DEFAULT_SOURCE : str);
        DateTime dateTime2;
        double d7 = (i & 1) != 0 ? 0.0d : d;
        double d8 = (i & 2) == 0 ? d2 : 0.0d;
        Double d9 = (i & 4) != 0 ? null : d3;
        Double d10 = (i & 8) != 0 ? null : d4;
        Double d11 = (i & 16) != 0 ? null : d5;
        Double d12 = (i & 32) == 0 ? d6 : null;
        boolean z2 = (i & 64) != 0 ? false : z;
        if ((i & 128) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
    }
}
