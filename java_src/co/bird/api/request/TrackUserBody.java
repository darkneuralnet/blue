package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/api/request/TrackUserBody;", "", "latitude", "", "longitude", "heading", TransferTable.COLUMN_SPEED, "altitude", "accuracy", "(DDDDDD)V", "getAccuracy", "()D", "getAltitude", "getHeading", "getLatitude", "getLongitude", "getSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TrackUserBody {
    @JsonProperty("accuracy")
    @InterfaceC41208ft5("accuracy")
    private final double accuracy;
    @JsonProperty("altitude")
    @InterfaceC41208ft5("altitude")
    private final double altitude;
    @JsonProperty("heading")
    @InterfaceC41208ft5("heading")
    private final double heading;
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")
    private final double longitude;
    @JsonProperty(TransferTable.COLUMN_SPEED)
    @InterfaceC41208ft5(TransferTable.COLUMN_SPEED)
    private final double speed;

    public TrackUserBody(double d, double d2, double d3, double d4, double d5, double d6) {
        this.latitude = d;
        this.longitude = d2;
        this.heading = d3;
        this.speed = d4;
        this.altitude = d5;
        this.accuracy = d6;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final double component3() {
        return this.heading;
    }

    public final double component4() {
        return this.speed;
    }

    public final double component5() {
        return this.altitude;
    }

    public final double component6() {
        return this.accuracy;
    }

    public final TrackUserBody copy(double d, double d2, double d3, double d4, double d5, double d6) {
        return new TrackUserBody(d, d2, d3, d4, d5, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackUserBody) {
            TrackUserBody trackUserBody = (TrackUserBody) obj;
            return Double.compare(this.latitude, trackUserBody.latitude) == 0 && Double.compare(this.longitude, trackUserBody.longitude) == 0 && Double.compare(this.heading, trackUserBody.heading) == 0 && Double.compare(this.speed, trackUserBody.speed) == 0 && Double.compare(this.altitude, trackUserBody.altitude) == 0 && Double.compare(this.accuracy, trackUserBody.accuracy) == 0;
        }
        return false;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getHeading() {
        return this.heading;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.heading)) * 31) + Double.hashCode(this.speed)) * 31) + Double.hashCode(this.altitude)) * 31) + Double.hashCode(this.accuracy);
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        double d3 = this.heading;
        double d4 = this.speed;
        double d5 = this.altitude;
        double d6 = this.accuracy;
        return "TrackUserBody(latitude=" + d + ", longitude=" + d2 + ", heading=" + d3 + ", speed=" + d4 + ", altitude=" + d5 + ", accuracy=" + d6 + ")";
    }

    public /* synthetic */ TrackUserBody(double d, double d2, double d3, double d4, double d5, double d6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, (i & 16) != 0 ? 0.0d : d5, (i & 32) != 0 ? 0.0d : d6);
    }
}
