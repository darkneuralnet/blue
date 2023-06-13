package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;", "", "enabled", "", "enableServiceCenterDetails", "enableSignalFilter", "enableVariableUpdateFrequency", "enableSignalBuckets", "(ZZZZZ)V", "getEnableServiceCenterDetails", "()Z", "getEnableSignalBuckets", "getEnableSignalFilter", "getEnableVariableUpdateFrequency", "getEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorSweepBirdsConfig {
    @JsonProperty("enable_service_center_details")
    @InterfaceC41208ft5("enable_service_center_details")
    private final boolean enableServiceCenterDetails;
    @JsonProperty("enable_signal_buckets")
    @InterfaceC41208ft5("enable_signal_buckets")
    private final boolean enableSignalBuckets;
    @JsonProperty("enable_signal_filter")
    @InterfaceC41208ft5("enable_signal_filter")
    private final boolean enableSignalFilter;
    @JsonProperty("enable_variable_update_frequency")
    @InterfaceC41208ft5("enable_variable_update_frequency")
    private final boolean enableVariableUpdateFrequency;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;

    public OperatorSweepBirdsConfig() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ OperatorSweepBirdsConfig copy$default(OperatorSweepBirdsConfig operatorSweepBirdsConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorSweepBirdsConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = operatorSweepBirdsConfig.enableServiceCenterDetails;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = operatorSweepBirdsConfig.enableSignalFilter;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = operatorSweepBirdsConfig.enableVariableUpdateFrequency;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = operatorSweepBirdsConfig.enableSignalBuckets;
        }
        return operatorSweepBirdsConfig.copy(z, z6, z7, z8, z5);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.enableServiceCenterDetails;
    }

    public final boolean component3() {
        return this.enableSignalFilter;
    }

    public final boolean component4() {
        return this.enableVariableUpdateFrequency;
    }

    public final boolean component5() {
        return this.enableSignalBuckets;
    }

    public final OperatorSweepBirdsConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new OperatorSweepBirdsConfig(z, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorSweepBirdsConfig) {
            OperatorSweepBirdsConfig operatorSweepBirdsConfig = (OperatorSweepBirdsConfig) obj;
            return this.enabled == operatorSweepBirdsConfig.enabled && this.enableServiceCenterDetails == operatorSweepBirdsConfig.enableServiceCenterDetails && this.enableSignalFilter == operatorSweepBirdsConfig.enableSignalFilter && this.enableVariableUpdateFrequency == operatorSweepBirdsConfig.enableVariableUpdateFrequency && this.enableSignalBuckets == operatorSweepBirdsConfig.enableSignalBuckets;
        }
        return false;
    }

    public final boolean getEnableServiceCenterDetails() {
        return this.enableServiceCenterDetails;
    }

    public final boolean getEnableSignalBuckets() {
        return this.enableSignalBuckets;
    }

    public final boolean getEnableSignalFilter() {
        return this.enableSignalFilter;
    }

    public final boolean getEnableVariableUpdateFrequency() {
        return this.enableVariableUpdateFrequency;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableServiceCenterDetails;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableSignalFilter;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableVariableUpdateFrequency;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.enableSignalBuckets;
        return i7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableServiceCenterDetails;
        boolean z3 = this.enableSignalFilter;
        boolean z4 = this.enableVariableUpdateFrequency;
        boolean z5 = this.enableSignalBuckets;
        return "OperatorSweepBirdsConfig(enabled=" + z + ", enableServiceCenterDetails=" + z2 + ", enableSignalFilter=" + z3 + ", enableVariableUpdateFrequency=" + z4 + ", enableSignalBuckets=" + z5 + ")";
    }

    public OperatorSweepBirdsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enabled = z;
        this.enableServiceCenterDetails = z2;
        this.enableSignalFilter = z3;
        this.enableVariableUpdateFrequency = z4;
        this.enableSignalBuckets = z5;
    }

    public /* synthetic */ OperatorSweepBirdsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
