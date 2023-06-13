package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/configs/MultiRideConfig;", "", "enabled", "", "maxRideCount", "", "additionalRidesAllowBluetooth", "(ZIZ)V", "getAdditionalRidesAllowBluetooth", "()Z", "getEnabled", "getMaxRideCount", "()I", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MultiRideConfig {
    @JsonProperty("additional_rides_allow_bluetooth")
    @InterfaceC41208ft5("additional_rides_allow_bluetooth")
    private final boolean additionalRidesAllowBluetooth;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("max_ride_count")
    @InterfaceC41208ft5("max_ride_count")
    private final int maxRideCount;

    public MultiRideConfig() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ MultiRideConfig copy$default(MultiRideConfig multiRideConfig, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = multiRideConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            i = multiRideConfig.maxRideCount;
        }
        if ((i2 & 4) != 0) {
            z2 = multiRideConfig.additionalRidesAllowBluetooth;
        }
        return multiRideConfig.copy(z, i, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.maxRideCount;
    }

    public final boolean component3() {
        return this.additionalRidesAllowBluetooth;
    }

    public final MultiRideConfig copy(boolean z, int i, boolean z2) {
        return new MultiRideConfig(z, i, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiRideConfig) {
            MultiRideConfig multiRideConfig = (MultiRideConfig) obj;
            return this.enabled == multiRideConfig.enabled && this.maxRideCount == multiRideConfig.maxRideCount && this.additionalRidesAllowBluetooth == multiRideConfig.additionalRidesAllowBluetooth;
        }
        return false;
    }

    public final boolean getAdditionalRidesAllowBluetooth() {
        return this.additionalRidesAllowBluetooth;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxRideCount() {
        return this.maxRideCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + Integer.hashCode(this.maxRideCount)) * 31;
        boolean z2 = this.additionalRidesAllowBluetooth;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.maxRideCount;
        boolean z2 = this.additionalRidesAllowBluetooth;
        return "MultiRideConfig(enabled=" + z + ", maxRideCount=" + i + ", additionalRidesAllowBluetooth=" + z2 + ")";
    }

    public MultiRideConfig(boolean z, int i, boolean z2) {
        this.enabled = z;
        this.maxRideCount = i;
        this.additionalRidesAllowBluetooth = z2;
    }

    public /* synthetic */ MultiRideConfig(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 5 : i, (i2 & 4) != 0 ? false : z2);
    }
}
