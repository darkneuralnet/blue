package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorZoneMapConfig;", "", "enable", "", "zonePinZoomThreshold", "", "(ZD)V", "getEnable", "()Z", "getZonePinZoomThreshold", "()D", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorZoneMapConfig {
    @JsonProperty("enable")
    @InterfaceC41208ft5("enable")
    private final boolean enable;
    @JsonProperty("zone_pin_zoom_threshold")
    @InterfaceC41208ft5("zone_pin_zoom_threshold")
    private final double zonePinZoomThreshold;

    public OperatorZoneMapConfig() {
        this(false, 0.0d, 3, null);
    }

    public static /* synthetic */ OperatorZoneMapConfig copy$default(OperatorZoneMapConfig operatorZoneMapConfig, boolean z, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorZoneMapConfig.enable;
        }
        if ((i & 2) != 0) {
            d = operatorZoneMapConfig.zonePinZoomThreshold;
        }
        return operatorZoneMapConfig.copy(z, d);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final double component2() {
        return this.zonePinZoomThreshold;
    }

    public final OperatorZoneMapConfig copy(boolean z, double d) {
        return new OperatorZoneMapConfig(z, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorZoneMapConfig) {
            OperatorZoneMapConfig operatorZoneMapConfig = (OperatorZoneMapConfig) obj;
            return this.enable == operatorZoneMapConfig.enable && Double.compare(this.zonePinZoomThreshold, operatorZoneMapConfig.zonePinZoomThreshold) == 0;
        }
        return false;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final double getZonePinZoomThreshold() {
        return this.zonePinZoomThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Double.hashCode(this.zonePinZoomThreshold);
    }

    public String toString() {
        boolean z = this.enable;
        double d = this.zonePinZoomThreshold;
        return "OperatorZoneMapConfig(enable=" + z + ", zonePinZoomThreshold=" + d + ")";
    }

    public OperatorZoneMapConfig(boolean z, double d) {
        this.enable = z;
        this.zonePinZoomThreshold = d;
    }

    public /* synthetic */ OperatorZoneMapConfig(boolean z, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0d : d);
    }
}
