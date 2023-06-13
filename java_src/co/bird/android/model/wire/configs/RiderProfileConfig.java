package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RiderProfileConfig;", "", "enableBeginnerModeByModel", "", "Lco/bird/android/model/constant/BirdModel;", "", "enableBeginnerModeOnboarding", "riderMapToggleMaxRides", "", "enableToggleInRide", "enableToggleOutOfRide", "(Ljava/util/Map;ZIZZ)V", "getEnableBeginnerModeByModel", "()Ljava/util/Map;", "getEnableBeginnerModeOnboarding", "()Z", "getEnableToggleInRide", "getEnableToggleOutOfRide", "getRiderMapToggleMaxRides", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderProfileConfig {
    @JsonProperty("enable_beginner_mode_by_model")
    @InterfaceC41208ft5("enable_beginner_mode_by_model")
    private final Map<BirdModel, Boolean> enableBeginnerModeByModel;
    @JsonProperty("enable_beginner_mode_onboarding")
    @InterfaceC41208ft5("enable_beginner_mode_onboarding")
    private final boolean enableBeginnerModeOnboarding;
    @JsonProperty("enable_toggle_in_ride")
    @InterfaceC41208ft5("enable_toggle_in_ride")
    private final boolean enableToggleInRide;
    @JsonProperty("enable_toggle_out_of_ride")
    @InterfaceC41208ft5("enable_toggle_out_of_ride")
    private final boolean enableToggleOutOfRide;
    @JsonProperty("rider_map_toggle_max_rides")
    @InterfaceC41208ft5("rider_map_toggle_max_rides")
    private final int riderMapToggleMaxRides;

    public RiderProfileConfig() {
        this(null, false, 0, false, false, 31, null);
    }

    public static /* synthetic */ RiderProfileConfig copy$default(RiderProfileConfig riderProfileConfig, Map map, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        Map<BirdModel, Boolean> map2 = map;
        if ((i2 & 1) != 0) {
            map2 = riderProfileConfig.enableBeginnerModeByModel;
        }
        if ((i2 & 2) != 0) {
            z = riderProfileConfig.enableBeginnerModeOnboarding;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            i = riderProfileConfig.riderMapToggleMaxRides;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = riderProfileConfig.enableToggleInRide;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = riderProfileConfig.enableToggleOutOfRide;
        }
        return riderProfileConfig.copy(map2, z4, i3, z5, z3);
    }

    public final Map<BirdModel, Boolean> component1() {
        return this.enableBeginnerModeByModel;
    }

    public final boolean component2() {
        return this.enableBeginnerModeOnboarding;
    }

    public final int component3() {
        return this.riderMapToggleMaxRides;
    }

    public final boolean component4() {
        return this.enableToggleInRide;
    }

    public final boolean component5() {
        return this.enableToggleOutOfRide;
    }

    public final RiderProfileConfig copy(Map<BirdModel, Boolean> enableBeginnerModeByModel, boolean z, int i, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(enableBeginnerModeByModel, "enableBeginnerModeByModel");
        return new RiderProfileConfig(enableBeginnerModeByModel, z, i, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiderProfileConfig) {
            RiderProfileConfig riderProfileConfig = (RiderProfileConfig) obj;
            return Intrinsics.areEqual(this.enableBeginnerModeByModel, riderProfileConfig.enableBeginnerModeByModel) && this.enableBeginnerModeOnboarding == riderProfileConfig.enableBeginnerModeOnboarding && this.riderMapToggleMaxRides == riderProfileConfig.riderMapToggleMaxRides && this.enableToggleInRide == riderProfileConfig.enableToggleInRide && this.enableToggleOutOfRide == riderProfileConfig.enableToggleOutOfRide;
        }
        return false;
    }

    public final Map<BirdModel, Boolean> getEnableBeginnerModeByModel() {
        return this.enableBeginnerModeByModel;
    }

    public final boolean getEnableBeginnerModeOnboarding() {
        return this.enableBeginnerModeOnboarding;
    }

    public final boolean getEnableToggleInRide() {
        return this.enableToggleInRide;
    }

    public final boolean getEnableToggleOutOfRide() {
        return this.enableToggleOutOfRide;
    }

    public final int getRiderMapToggleMaxRides() {
        return this.riderMapToggleMaxRides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.enableBeginnerModeByModel.hashCode() * 31;
        boolean z = this.enableBeginnerModeOnboarding;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + Integer.hashCode(this.riderMapToggleMaxRides)) * 31;
        boolean z2 = this.enableToggleInRide;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.enableToggleOutOfRide;
        return i3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        Map<BirdModel, Boolean> map = this.enableBeginnerModeByModel;
        boolean z = this.enableBeginnerModeOnboarding;
        int i = this.riderMapToggleMaxRides;
        boolean z2 = this.enableToggleInRide;
        boolean z3 = this.enableToggleOutOfRide;
        return "RiderProfileConfig(enableBeginnerModeByModel=" + map + ", enableBeginnerModeOnboarding=" + z + ", riderMapToggleMaxRides=" + i + ", enableToggleInRide=" + z2 + ", enableToggleOutOfRide=" + z3 + ")";
    }

    public RiderProfileConfig(Map<BirdModel, Boolean> enableBeginnerModeByModel, boolean z, int i, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(enableBeginnerModeByModel, "enableBeginnerModeByModel");
        this.enableBeginnerModeByModel = enableBeginnerModeByModel;
        this.enableBeginnerModeOnboarding = z;
        this.riderMapToggleMaxRides = i;
        this.enableToggleInRide = z2;
        this.enableToggleOutOfRide = z3;
    }

    public /* synthetic */ RiderProfileConfig(Map map, boolean z, int i, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 3 : i, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? z3 : false);
    }
}
