package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorMapFiltersConfig;", "", "enableQuickFilters", "", "enableVariableFeeAreaQuickFilter", "enableBatteryFilterLogicToggle", "(ZZZ)V", "getEnableBatteryFilterLogicToggle", "()Z", "getEnableQuickFilters", "getEnableVariableFeeAreaQuickFilter", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapFiltersConfig {
    @JsonProperty("enable_battery_filter_logic_toggle")
    @InterfaceC41208ft5("enable_battery_filter_logic_toggle")
    private final boolean enableBatteryFilterLogicToggle;
    @JsonProperty("enable_quick_filters")
    @InterfaceC41208ft5("enable_quick_filters")
    private final boolean enableQuickFilters;
    @JsonProperty("enable_variable_fee_area_quick_filter")
    @InterfaceC41208ft5("enable_variable_fee_area_quick_filter")
    private final boolean enableVariableFeeAreaQuickFilter;

    public OperatorMapFiltersConfig() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ OperatorMapFiltersConfig copy$default(OperatorMapFiltersConfig operatorMapFiltersConfig, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorMapFiltersConfig.enableQuickFilters;
        }
        if ((i & 2) != 0) {
            z2 = operatorMapFiltersConfig.enableVariableFeeAreaQuickFilter;
        }
        if ((i & 4) != 0) {
            z3 = operatorMapFiltersConfig.enableBatteryFilterLogicToggle;
        }
        return operatorMapFiltersConfig.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.enableQuickFilters;
    }

    public final boolean component2() {
        return this.enableVariableFeeAreaQuickFilter;
    }

    public final boolean component3() {
        return this.enableBatteryFilterLogicToggle;
    }

    public final OperatorMapFiltersConfig copy(boolean z, boolean z2, boolean z3) {
        return new OperatorMapFiltersConfig(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapFiltersConfig) {
            OperatorMapFiltersConfig operatorMapFiltersConfig = (OperatorMapFiltersConfig) obj;
            return this.enableQuickFilters == operatorMapFiltersConfig.enableQuickFilters && this.enableVariableFeeAreaQuickFilter == operatorMapFiltersConfig.enableVariableFeeAreaQuickFilter && this.enableBatteryFilterLogicToggle == operatorMapFiltersConfig.enableBatteryFilterLogicToggle;
        }
        return false;
    }

    public final boolean getEnableBatteryFilterLogicToggle() {
        return this.enableBatteryFilterLogicToggle;
    }

    public final boolean getEnableQuickFilters() {
        return this.enableQuickFilters;
    }

    public final boolean getEnableVariableFeeAreaQuickFilter() {
        return this.enableVariableFeeAreaQuickFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableQuickFilters;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableVariableFeeAreaQuickFilter;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.enableBatteryFilterLogicToggle;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableQuickFilters;
        boolean z2 = this.enableVariableFeeAreaQuickFilter;
        boolean z3 = this.enableBatteryFilterLogicToggle;
        return "OperatorMapFiltersConfig(enableQuickFilters=" + z + ", enableVariableFeeAreaQuickFilter=" + z2 + ", enableBatteryFilterLogicToggle=" + z3 + ")";
    }

    public OperatorMapFiltersConfig(boolean z, boolean z2, boolean z3) {
        this.enableQuickFilters = z;
        this.enableVariableFeeAreaQuickFilter = z2;
        this.enableBatteryFilterLogicToggle = z3;
    }

    public /* synthetic */ OperatorMapFiltersConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
