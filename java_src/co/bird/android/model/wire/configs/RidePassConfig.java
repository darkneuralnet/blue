package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RidePassConfig;", "", "enabled", "", "sessionsShown", "", "enabledV2", "enableTax", "(ZIZZ)V", "getEnableTax", "()Z", "getEnabled", "getEnabledV2", "getSessionsShown", "()I", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RidePassConfig {
    @JsonProperty("enable_tax")
    @InterfaceC41208ft5("enable_tax")
    private final boolean enableTax;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("enabled_v2")
    @InterfaceC41208ft5("enabled_v2")
    private final boolean enabledV2;
    @JsonProperty("sessions_shown")
    @InterfaceC41208ft5("sessions_shown")
    private final int sessionsShown;

    public RidePassConfig() {
        this(false, 0, false, false, 15, null);
    }

    public static /* synthetic */ RidePassConfig copy$default(RidePassConfig ridePassConfig, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ridePassConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            i = ridePassConfig.sessionsShown;
        }
        if ((i2 & 4) != 0) {
            z2 = ridePassConfig.enabledV2;
        }
        if ((i2 & 8) != 0) {
            z3 = ridePassConfig.enableTax;
        }
        return ridePassConfig.copy(z, i, z2, z3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.sessionsShown;
    }

    public final boolean component3() {
        return this.enabledV2;
    }

    public final boolean component4() {
        return this.enableTax;
    }

    public final RidePassConfig copy(boolean z, int i, boolean z2, boolean z3) {
        return new RidePassConfig(z, i, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RidePassConfig) {
            RidePassConfig ridePassConfig = (RidePassConfig) obj;
            return this.enabled == ridePassConfig.enabled && this.sessionsShown == ridePassConfig.sessionsShown && this.enabledV2 == ridePassConfig.enabledV2 && this.enableTax == ridePassConfig.enableTax;
        }
        return false;
    }

    public final boolean getEnableTax() {
        return this.enableTax;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getEnabledV2() {
        return this.enabledV2;
    }

    public final int getSessionsShown() {
        return this.sessionsShown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + Integer.hashCode(this.sessionsShown)) * 31;
        ?? r2 = this.enabledV2;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.enableTax;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.sessionsShown;
        boolean z2 = this.enabledV2;
        boolean z3 = this.enableTax;
        return "RidePassConfig(enabled=" + z + ", sessionsShown=" + i + ", enabledV2=" + z2 + ", enableTax=" + z3 + ")";
    }

    public RidePassConfig(boolean z, int i, boolean z2, boolean z3) {
        this.enabled = z;
        this.sessionsShown = i;
        this.enabledV2 = z2;
        this.enableTax = z3;
    }

    public /* synthetic */ RidePassConfig(boolean z, int i, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3);
    }
}
