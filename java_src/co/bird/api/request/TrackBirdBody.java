package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/TrackBirdBody;", "", "serialNumber", "", "batteryLevel", "", "distance", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDistance", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getSerialNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)Lco/bird/api/request/TrackBirdBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TrackBirdBody {
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final Integer batteryLevel;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final Integer distance;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public TrackBirdBody(String serialNumber, Integer num, Integer num2, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.serialNumber = serialNumber;
        this.batteryLevel = num;
        this.distance = num2;
        this.location = wireLocation;
    }

    public static /* synthetic */ TrackBirdBody copy$default(TrackBirdBody trackBirdBody, String str, Integer num, Integer num2, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackBirdBody.serialNumber;
        }
        if ((i & 2) != 0) {
            num = trackBirdBody.batteryLevel;
        }
        if ((i & 4) != 0) {
            num2 = trackBirdBody.distance;
        }
        if ((i & 8) != 0) {
            wireLocation = trackBirdBody.location;
        }
        return trackBirdBody.copy(str, num, num2, wireLocation);
    }

    public final String component1() {
        return this.serialNumber;
    }

    public final Integer component2() {
        return this.batteryLevel;
    }

    public final Integer component3() {
        return this.distance;
    }

    public final WireLocation component4() {
        return this.location;
    }

    public final TrackBirdBody copy(String serialNumber, Integer num, Integer num2, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new TrackBirdBody(serialNumber, num, num2, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackBirdBody) {
            TrackBirdBody trackBirdBody = (TrackBirdBody) obj;
            return Intrinsics.areEqual(this.serialNumber, trackBirdBody.serialNumber) && Intrinsics.areEqual(this.batteryLevel, trackBirdBody.batteryLevel) && Intrinsics.areEqual(this.distance, trackBirdBody.distance) && Intrinsics.areEqual(this.location, trackBirdBody.location);
        }
        return false;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        int hashCode = this.serialNumber.hashCode() * 31;
        Integer num = this.batteryLevel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.distance;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        return hashCode3 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public String toString() {
        String str = this.serialNumber;
        Integer num = this.batteryLevel;
        Integer num2 = this.distance;
        WireLocation wireLocation = this.location;
        return "TrackBirdBody(serialNumber=" + str + ", batteryLevel=" + num + ", distance=" + num2 + ", location=" + wireLocation + ")";
    }
}
