package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019¨\u0006,"}, m28432d2 = {"Lco/bird/api/request/IBeaconScan;", "", "proximityUUID", "", "beaconHash", "", "scannedAt", "Lorg/joda/time/DateTime;", "txPower", "", "rssi", "estimatedDistance", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V", "getBeaconHash", "()I", "getEstimatedDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getProximityUUID", "()Ljava/lang/String;", "getRssi", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScannedAt", "()Lorg/joda/time/DateTime;", "getTxPower", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)Lco/bird/api/request/IBeaconScan;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IBeaconScan {
    @JsonProperty("beacon_hash")
    @InterfaceC41208ft5("beacon_hash")
    private final int beaconHash;
    @JsonProperty("estimated_distance")
    @InterfaceC41208ft5("estimated_distance")
    private final Integer estimatedDistance;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("proximity_uuid")
    @InterfaceC41208ft5("proximity_uuid")
    private final String proximityUUID;
    @JsonProperty("rssi")
    @InterfaceC41208ft5("rssi")
    private final Long rssi;
    @JsonProperty("scanned_at")
    @InterfaceC41208ft5("scanned_at")
    private final DateTime scannedAt;
    @JsonProperty("tx_power")
    @InterfaceC41208ft5("tx_power")
    private final Long txPower;

    public IBeaconScan(String proximityUUID, int i, DateTime scannedAt, Long l, Long l2, Integer num, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(proximityUUID, "proximityUUID");
        Intrinsics.checkNotNullParameter(scannedAt, "scannedAt");
        this.proximityUUID = proximityUUID;
        this.beaconHash = i;
        this.scannedAt = scannedAt;
        this.txPower = l;
        this.rssi = l2;
        this.estimatedDistance = num;
        this.location = wireLocation;
    }

    public static /* synthetic */ IBeaconScan copy$default(IBeaconScan iBeaconScan, String str, int i, DateTime dateTime, Long l, Long l2, Integer num, WireLocation wireLocation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iBeaconScan.proximityUUID;
        }
        if ((i2 & 2) != 0) {
            i = iBeaconScan.beaconHash;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            dateTime = iBeaconScan.scannedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i2 & 8) != 0) {
            l = iBeaconScan.txPower;
        }
        Long l3 = l;
        if ((i2 & 16) != 0) {
            l2 = iBeaconScan.rssi;
        }
        Long l4 = l2;
        if ((i2 & 32) != 0) {
            num = iBeaconScan.estimatedDistance;
        }
        Integer num2 = num;
        if ((i2 & 64) != 0) {
            wireLocation = iBeaconScan.location;
        }
        return iBeaconScan.copy(str, i3, dateTime2, l3, l4, num2, wireLocation);
    }

    public final String component1() {
        return this.proximityUUID;
    }

    public final int component2() {
        return this.beaconHash;
    }

    public final DateTime component3() {
        return this.scannedAt;
    }

    public final Long component4() {
        return this.txPower;
    }

    public final Long component5() {
        return this.rssi;
    }

    public final Integer component6() {
        return this.estimatedDistance;
    }

    public final WireLocation component7() {
        return this.location;
    }

    public final IBeaconScan copy(String proximityUUID, int i, DateTime scannedAt, Long l, Long l2, Integer num, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(proximityUUID, "proximityUUID");
        Intrinsics.checkNotNullParameter(scannedAt, "scannedAt");
        return new IBeaconScan(proximityUUID, i, scannedAt, l, l2, num, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IBeaconScan) {
            IBeaconScan iBeaconScan = (IBeaconScan) obj;
            return Intrinsics.areEqual(this.proximityUUID, iBeaconScan.proximityUUID) && this.beaconHash == iBeaconScan.beaconHash && Intrinsics.areEqual(this.scannedAt, iBeaconScan.scannedAt) && Intrinsics.areEqual(this.txPower, iBeaconScan.txPower) && Intrinsics.areEqual(this.rssi, iBeaconScan.rssi) && Intrinsics.areEqual(this.estimatedDistance, iBeaconScan.estimatedDistance) && Intrinsics.areEqual(this.location, iBeaconScan.location);
        }
        return false;
    }

    public final int getBeaconHash() {
        return this.beaconHash;
    }

    public final Integer getEstimatedDistance() {
        return this.estimatedDistance;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getProximityUUID() {
        return this.proximityUUID;
    }

    public final Long getRssi() {
        return this.rssi;
    }

    public final DateTime getScannedAt() {
        return this.scannedAt;
    }

    public final Long getTxPower() {
        return this.txPower;
    }

    public int hashCode() {
        int hashCode = ((((this.proximityUUID.hashCode() * 31) + Integer.hashCode(this.beaconHash)) * 31) + this.scannedAt.hashCode()) * 31;
        Long l = this.txPower;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.rssi;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.estimatedDistance;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        return hashCode4 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public String toString() {
        String str = this.proximityUUID;
        int i = this.beaconHash;
        DateTime dateTime = this.scannedAt;
        Long l = this.txPower;
        Long l2 = this.rssi;
        Integer num = this.estimatedDistance;
        WireLocation wireLocation = this.location;
        return "IBeaconScan(proximityUUID=" + str + ", beaconHash=" + i + ", scannedAt=" + dateTime + ", txPower=" + l + ", rssi=" + l2 + ", estimatedDistance=" + num + ", location=" + wireLocation + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IBeaconScan(String str, int i, DateTime dateTime, Long l, Long l2, Integer num, WireLocation wireLocation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, r5, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : wireLocation);
        DateTime dateTime2;
        if ((i2 & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
    }
}
