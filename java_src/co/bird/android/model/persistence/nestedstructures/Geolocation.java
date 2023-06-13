package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "", "latitude", "", "longitude", "heading", TransferTable.COLUMN_SPEED, "altitude", "accuracy", "mocked", "", "time", "Lorg/joda/time/DateTime;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)V", "getAccuracy", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAltitude", "getHeading", "getLatitude", "()D", "getLongitude", "getMocked", "()Z", "getSource", "()Ljava/lang/String;", "getSpeed", "getTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Geolocation {
    @JsonProperty("accuracy")
    @InterfaceC41208ft5("accuracy")
    private final Double accuracy;
    @JsonProperty("altitude")
    @InterfaceC41208ft5("altitude")
    private final Double altitude;
    @JsonProperty("heading")
    @InterfaceC41208ft5("heading")
    private final Double heading;
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")
    private final double longitude;
    @JsonProperty("mocked")
    @InterfaceC41208ft5("mocked")
    private final boolean mocked;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final String source;
    @JsonProperty(TransferTable.COLUMN_SPEED)
    @InterfaceC41208ft5(TransferTable.COLUMN_SPEED)
    private final Double speed;
    @JsonProperty("time")
    @InterfaceC41208ft5("time")
    private final DateTime time;

    public Geolocation() {
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
        return this.time;
    }

    public final String component9() {
        return this.source;
    }

    public final Geolocation copy(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime time, String str) {
        Intrinsics.checkNotNullParameter(time, "time");
        return new Geolocation(d, d2, d3, d4, d5, d6, z, time, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Geolocation) {
            Geolocation geolocation = (Geolocation) obj;
            return Double.compare(this.latitude, geolocation.latitude) == 0 && Double.compare(this.longitude, geolocation.longitude) == 0 && Intrinsics.areEqual((Object) this.heading, (Object) geolocation.heading) && Intrinsics.areEqual((Object) this.speed, (Object) geolocation.speed) && Intrinsics.areEqual((Object) this.altitude, (Object) geolocation.altitude) && Intrinsics.areEqual((Object) this.accuracy, (Object) geolocation.accuracy) && this.mocked == geolocation.mocked && Intrinsics.areEqual(this.time, geolocation.time) && Intrinsics.areEqual(this.source, geolocation.source);
        }
        return false;
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

    public final DateTime getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31;
        Double d = this.heading;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.speed;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.altitude;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.accuracy;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        boolean z = this.mocked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode6 = (((hashCode5 + i) * 31) + this.time.hashCode()) * 31;
        String str = this.source;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        Double d3 = this.heading;
        Double d4 = this.speed;
        Double d5 = this.altitude;
        Double d6 = this.accuracy;
        boolean z = this.mocked;
        DateTime dateTime = this.time;
        String str = this.source;
        return "Geolocation(latitude=" + d + ", longitude=" + d2 + ", heading=" + d3 + ", speed=" + d4 + ", altitude=" + d5 + ", accuracy=" + d6 + ", mocked=" + z + ", time=" + dateTime + ", source=" + str + ")";
    }

    public Geolocation(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime time, String str) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.latitude = d;
        this.longitude = d2;
        this.heading = d3;
        this.speed = d4;
        this.altitude = d5;
        this.accuracy = d6;
        this.mocked = z;
        this.time = time;
        this.source = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Geolocation(double d, double d2, Double d3, Double d4, Double d5, Double d6, boolean z, DateTime dateTime, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r2, r1, r7, r8, r9, r10, r11, (i & 256) == 0 ? str : null);
        DateTime dateTime2;
        double d7 = (i & 1) != 0 ? 0.0d : d;
        double d8 = (i & 2) == 0 ? d2 : 0.0d;
        Double d9 = (i & 4) != 0 ? null : d3;
        Double d10 = (i & 8) != 0 ? null : d4;
        Double d11 = (i & 16) != 0 ? null : d5;
        Double d12 = (i & 32) != 0 ? null : d6;
        boolean z2 = (i & 64) != 0 ? false : z;
        if ((i & 128) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        } else {
            dateTime2 = dateTime;
        }
    }
}
