package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "", "operational", "Lco/bird/android/model/wire/configs/ZoneColorConfig;", "operationalInverse", "noRide", "noParking", "slow", "parking", "(Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;)V", "getNoParking", "()Lco/bird/android/model/wire/configs/ZoneColorConfig;", "getNoRide", "getOperational", "getOperationalInverse", "getParking", "getSlow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneColorOverrideConfig {
    @JsonProperty("no_parking")
    @InterfaceC41208ft5("no_parking")
    private final ZoneColorConfig noParking;
    @JsonProperty("no_ride")
    @InterfaceC41208ft5("no_ride")
    private final ZoneColorConfig noRide;
    @JsonProperty("operational")
    @InterfaceC41208ft5("operational")
    private final ZoneColorConfig operational;
    @JsonProperty("operational_inverse")
    @InterfaceC41208ft5("operational_inverse")
    private final ZoneColorConfig operationalInverse;
    @JsonProperty("parking")
    @InterfaceC41208ft5("parking")
    private final ZoneColorConfig parking;
    @JsonProperty("slow")
    @InterfaceC41208ft5("slow")
    private final ZoneColorConfig slow;

    public ZoneColorOverrideConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ZoneColorOverrideConfig copy$default(ZoneColorOverrideConfig zoneColorOverrideConfig, ZoneColorConfig zoneColorConfig, ZoneColorConfig zoneColorConfig2, ZoneColorConfig zoneColorConfig3, ZoneColorConfig zoneColorConfig4, ZoneColorConfig zoneColorConfig5, ZoneColorConfig zoneColorConfig6, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneColorConfig = zoneColorOverrideConfig.operational;
        }
        if ((i & 2) != 0) {
            zoneColorConfig2 = zoneColorOverrideConfig.operationalInverse;
        }
        ZoneColorConfig zoneColorConfig7 = zoneColorConfig2;
        if ((i & 4) != 0) {
            zoneColorConfig3 = zoneColorOverrideConfig.noRide;
        }
        ZoneColorConfig zoneColorConfig8 = zoneColorConfig3;
        if ((i & 8) != 0) {
            zoneColorConfig4 = zoneColorOverrideConfig.noParking;
        }
        ZoneColorConfig zoneColorConfig9 = zoneColorConfig4;
        if ((i & 16) != 0) {
            zoneColorConfig5 = zoneColorOverrideConfig.slow;
        }
        ZoneColorConfig zoneColorConfig10 = zoneColorConfig5;
        if ((i & 32) != 0) {
            zoneColorConfig6 = zoneColorOverrideConfig.parking;
        }
        return zoneColorOverrideConfig.copy(zoneColorConfig, zoneColorConfig7, zoneColorConfig8, zoneColorConfig9, zoneColorConfig10, zoneColorConfig6);
    }

    public final ZoneColorConfig component1() {
        return this.operational;
    }

    public final ZoneColorConfig component2() {
        return this.operationalInverse;
    }

    public final ZoneColorConfig component3() {
        return this.noRide;
    }

    public final ZoneColorConfig component4() {
        return this.noParking;
    }

    public final ZoneColorConfig component5() {
        return this.slow;
    }

    public final ZoneColorConfig component6() {
        return this.parking;
    }

    public final ZoneColorOverrideConfig copy(ZoneColorConfig zoneColorConfig, ZoneColorConfig zoneColorConfig2, ZoneColorConfig zoneColorConfig3, ZoneColorConfig zoneColorConfig4, ZoneColorConfig zoneColorConfig5, ZoneColorConfig zoneColorConfig6) {
        return new ZoneColorOverrideConfig(zoneColorConfig, zoneColorConfig2, zoneColorConfig3, zoneColorConfig4, zoneColorConfig5, zoneColorConfig6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneColorOverrideConfig) {
            ZoneColorOverrideConfig zoneColorOverrideConfig = (ZoneColorOverrideConfig) obj;
            return Intrinsics.areEqual(this.operational, zoneColorOverrideConfig.operational) && Intrinsics.areEqual(this.operationalInverse, zoneColorOverrideConfig.operationalInverse) && Intrinsics.areEqual(this.noRide, zoneColorOverrideConfig.noRide) && Intrinsics.areEqual(this.noParking, zoneColorOverrideConfig.noParking) && Intrinsics.areEqual(this.slow, zoneColorOverrideConfig.slow) && Intrinsics.areEqual(this.parking, zoneColorOverrideConfig.parking);
        }
        return false;
    }

    public final ZoneColorConfig getNoParking() {
        return this.noParking;
    }

    public final ZoneColorConfig getNoRide() {
        return this.noRide;
    }

    public final ZoneColorConfig getOperational() {
        return this.operational;
    }

    public final ZoneColorConfig getOperationalInverse() {
        return this.operationalInverse;
    }

    public final ZoneColorConfig getParking() {
        return this.parking;
    }

    public final ZoneColorConfig getSlow() {
        return this.slow;
    }

    public int hashCode() {
        ZoneColorConfig zoneColorConfig = this.operational;
        int hashCode = (zoneColorConfig == null ? 0 : zoneColorConfig.hashCode()) * 31;
        ZoneColorConfig zoneColorConfig2 = this.operationalInverse;
        int hashCode2 = (hashCode + (zoneColorConfig2 == null ? 0 : zoneColorConfig2.hashCode())) * 31;
        ZoneColorConfig zoneColorConfig3 = this.noRide;
        int hashCode3 = (hashCode2 + (zoneColorConfig3 == null ? 0 : zoneColorConfig3.hashCode())) * 31;
        ZoneColorConfig zoneColorConfig4 = this.noParking;
        int hashCode4 = (hashCode3 + (zoneColorConfig4 == null ? 0 : zoneColorConfig4.hashCode())) * 31;
        ZoneColorConfig zoneColorConfig5 = this.slow;
        int hashCode5 = (hashCode4 + (zoneColorConfig5 == null ? 0 : zoneColorConfig5.hashCode())) * 31;
        ZoneColorConfig zoneColorConfig6 = this.parking;
        return hashCode5 + (zoneColorConfig6 != null ? zoneColorConfig6.hashCode() : 0);
    }

    public String toString() {
        ZoneColorConfig zoneColorConfig = this.operational;
        ZoneColorConfig zoneColorConfig2 = this.operationalInverse;
        ZoneColorConfig zoneColorConfig3 = this.noRide;
        ZoneColorConfig zoneColorConfig4 = this.noParking;
        ZoneColorConfig zoneColorConfig5 = this.slow;
        ZoneColorConfig zoneColorConfig6 = this.parking;
        return "ZoneColorOverrideConfig(operational=" + zoneColorConfig + ", operationalInverse=" + zoneColorConfig2 + ", noRide=" + zoneColorConfig3 + ", noParking=" + zoneColorConfig4 + ", slow=" + zoneColorConfig5 + ", parking=" + zoneColorConfig6 + ")";
    }

    public ZoneColorOverrideConfig(ZoneColorConfig zoneColorConfig, ZoneColorConfig zoneColorConfig2, ZoneColorConfig zoneColorConfig3, ZoneColorConfig zoneColorConfig4, ZoneColorConfig zoneColorConfig5, ZoneColorConfig zoneColorConfig6) {
        this.operational = zoneColorConfig;
        this.operationalInverse = zoneColorConfig2;
        this.noRide = zoneColorConfig3;
        this.noParking = zoneColorConfig4;
        this.slow = zoneColorConfig5;
        this.parking = zoneColorConfig6;
    }

    public /* synthetic */ ZoneColorOverrideConfig(ZoneColorConfig zoneColorConfig, ZoneColorConfig zoneColorConfig2, ZoneColorConfig zoneColorConfig3, ZoneColorConfig zoneColorConfig4, ZoneColorConfig zoneColorConfig5, ZoneColorConfig zoneColorConfig6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig, (i & 2) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig2, (i & 4) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig3, (i & 8) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig4, (i & 16) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig5, (i & 32) != 0 ? new ZoneColorConfig(null, null, null, 7, null) : zoneColorConfig6);
    }
}
