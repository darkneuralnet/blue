package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorCommandCenterConfig;", "", "enabled", "", "enablePastRepairs", "(ZZ)V", "getEnablePastRepairs", "()Z", "getEnabled", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorCommandCenterConfig {
    @JsonProperty("enable_past_repairs")
    @InterfaceC41208ft5("enable_past_repairs")
    private final boolean enablePastRepairs;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;

    public OperatorCommandCenterConfig() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ OperatorCommandCenterConfig copy$default(OperatorCommandCenterConfig operatorCommandCenterConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorCommandCenterConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = operatorCommandCenterConfig.enablePastRepairs;
        }
        return operatorCommandCenterConfig.copy(z, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.enablePastRepairs;
    }

    public final OperatorCommandCenterConfig copy(boolean z, boolean z2) {
        return new OperatorCommandCenterConfig(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorCommandCenterConfig) {
            OperatorCommandCenterConfig operatorCommandCenterConfig = (OperatorCommandCenterConfig) obj;
            return this.enabled == operatorCommandCenterConfig.enabled && this.enablePastRepairs == operatorCommandCenterConfig.enablePastRepairs;
        }
        return false;
    }

    public final boolean getEnablePastRepairs() {
        return this.enablePastRepairs;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enablePastRepairs;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enablePastRepairs;
        return "OperatorCommandCenterConfig(enabled=" + z + ", enablePastRepairs=" + z2 + ")";
    }

    public OperatorCommandCenterConfig(boolean z, boolean z2) {
        this.enabled = z;
        this.enablePastRepairs = z2;
    }

    public /* synthetic */ OperatorCommandCenterConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}