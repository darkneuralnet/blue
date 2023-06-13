package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorTripsConfig;", "", "enabled", "", "vehicleMinimumZoomLevel", "", "enableTrainingModals", "(ZDZ)V", "getEnableTrainingModals", "()Z", "getEnabled", "getVehicleMinimumZoomLevel", "()D", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorTripsConfig {
    @JsonProperty("enable_training_modals")
    @InterfaceC41208ft5("enable_training_modals")
    private final boolean enableTrainingModals;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("vehicle_minimum_zoom_level")
    @InterfaceC41208ft5("vehicle_minimum_zoom_level")
    private final double vehicleMinimumZoomLevel;

    public OperatorTripsConfig() {
        this(false, 0.0d, false, 7, null);
    }

    public static /* synthetic */ OperatorTripsConfig copy$default(OperatorTripsConfig operatorTripsConfig, boolean z, double d, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorTripsConfig.enabled;
        }
        if ((i & 2) != 0) {
            d = operatorTripsConfig.vehicleMinimumZoomLevel;
        }
        if ((i & 4) != 0) {
            z2 = operatorTripsConfig.enableTrainingModals;
        }
        return operatorTripsConfig.copy(z, d, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final double component2() {
        return this.vehicleMinimumZoomLevel;
    }

    public final boolean component3() {
        return this.enableTrainingModals;
    }

    public final OperatorTripsConfig copy(boolean z, double d, boolean z2) {
        return new OperatorTripsConfig(z, d, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorTripsConfig) {
            OperatorTripsConfig operatorTripsConfig = (OperatorTripsConfig) obj;
            return this.enabled == operatorTripsConfig.enabled && Double.compare(this.vehicleMinimumZoomLevel, operatorTripsConfig.vehicleMinimumZoomLevel) == 0 && this.enableTrainingModals == operatorTripsConfig.enableTrainingModals;
        }
        return false;
    }

    public final boolean getEnableTrainingModals() {
        return this.enableTrainingModals;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final double getVehicleMinimumZoomLevel() {
        return this.vehicleMinimumZoomLevel;
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
        int hashCode = ((r0 * 31) + Double.hashCode(this.vehicleMinimumZoomLevel)) * 31;
        boolean z2 = this.enableTrainingModals;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        double d = this.vehicleMinimumZoomLevel;
        boolean z2 = this.enableTrainingModals;
        return "OperatorTripsConfig(enabled=" + z + ", vehicleMinimumZoomLevel=" + d + ", enableTrainingModals=" + z2 + ")";
    }

    public OperatorTripsConfig(boolean z, double d, boolean z2) {
        this.enabled = z;
        this.vehicleMinimumZoomLevel = d;
        this.enableTrainingModals = z2;
    }

    public /* synthetic */ OperatorTripsConfig(boolean z, double d, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 15.0d : d, (i & 4) != 0 ? false : z2);
    }
}
