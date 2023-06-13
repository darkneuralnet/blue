package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ArParkingConfig;", "", "scan", "Lco/bird/android/model/wire/configs/ArParkingScanConfig;", "debug", "", "rawData", "(Lco/bird/android/model/wire/configs/ArParkingScanConfig;ZZ)V", "getDebug", "()Z", "getRawData", "getScan", "()Lco/bird/android/model/wire/configs/ArParkingScanConfig;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ArParkingConfig {
    @JsonProperty("_debug")
    @InterfaceC41208ft5("_debug")
    private final boolean debug;
    @JsonProperty("raw_data")
    @InterfaceC41208ft5("raw_data")
    private final boolean rawData;
    @JsonProperty("scan")
    @InterfaceC41208ft5("scan")
    private final ArParkingScanConfig scan;

    public ArParkingConfig() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ ArParkingConfig copy$default(ArParkingConfig arParkingConfig, ArParkingScanConfig arParkingScanConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            arParkingScanConfig = arParkingConfig.scan;
        }
        if ((i & 2) != 0) {
            z = arParkingConfig.debug;
        }
        if ((i & 4) != 0) {
            z2 = arParkingConfig.rawData;
        }
        return arParkingConfig.copy(arParkingScanConfig, z, z2);
    }

    public final ArParkingScanConfig component1() {
        return this.scan;
    }

    public final boolean component2() {
        return this.debug;
    }

    public final boolean component3() {
        return this.rawData;
    }

    public final ArParkingConfig copy(ArParkingScanConfig scan, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scan, "scan");
        return new ArParkingConfig(scan, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ArParkingConfig) {
            ArParkingConfig arParkingConfig = (ArParkingConfig) obj;
            return Intrinsics.areEqual(this.scan, arParkingConfig.scan) && this.debug == arParkingConfig.debug && this.rawData == arParkingConfig.rawData;
        }
        return false;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final boolean getRawData() {
        return this.rawData;
    }

    public final ArParkingScanConfig getScan() {
        return this.scan;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.scan.hashCode() * 31;
        boolean z = this.debug;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.rawData;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        ArParkingScanConfig arParkingScanConfig = this.scan;
        boolean z = this.debug;
        boolean z2 = this.rawData;
        return "ArParkingConfig(scan=" + arParkingScanConfig + ", debug=" + z + ", rawData=" + z2 + ")";
    }

    public ArParkingConfig(ArParkingScanConfig scan, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scan, "scan");
        this.scan = scan;
        this.debug = z;
        this.rawData = z2;
    }

    public /* synthetic */ ArParkingConfig(ArParkingScanConfig arParkingScanConfig, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArParkingScanConfig(false, 1, null) : arParkingScanConfig, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
