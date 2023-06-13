package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.QualityControlFlow;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;", "", "enabled", "", "flow", "Lco/bird/android/model/constant/QualityControlFlow;", "programmaticQCEnabled", "(ZLco/bird/android/model/constant/QualityControlFlow;Z)V", "getEnabled", "()Z", "getFlow", "()Lco/bird/android/model/constant/QualityControlFlow;", "getProgrammaticQCEnabled", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ServiceCenterQualityControlConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("flow")
    @InterfaceC41208ft5("flow")
    private final QualityControlFlow flow;
    @JsonProperty("programmatic_qc_enabled")
    @InterfaceC41208ft5("programmatic_qc_enabled")
    private final boolean programmaticQCEnabled;

    public ServiceCenterQualityControlConfig() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ ServiceCenterQualityControlConfig copy$default(ServiceCenterQualityControlConfig serviceCenterQualityControlConfig, boolean z, QualityControlFlow qualityControlFlow, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = serviceCenterQualityControlConfig.enabled;
        }
        if ((i & 2) != 0) {
            qualityControlFlow = serviceCenterQualityControlConfig.flow;
        }
        if ((i & 4) != 0) {
            z2 = serviceCenterQualityControlConfig.programmaticQCEnabled;
        }
        return serviceCenterQualityControlConfig.copy(z, qualityControlFlow, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final QualityControlFlow component2() {
        return this.flow;
    }

    public final boolean component3() {
        return this.programmaticQCEnabled;
    }

    public final ServiceCenterQualityControlConfig copy(boolean z, QualityControlFlow flow, boolean z2) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new ServiceCenterQualityControlConfig(z, flow, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceCenterQualityControlConfig) {
            ServiceCenterQualityControlConfig serviceCenterQualityControlConfig = (ServiceCenterQualityControlConfig) obj;
            return this.enabled == serviceCenterQualityControlConfig.enabled && this.flow == serviceCenterQualityControlConfig.flow && this.programmaticQCEnabled == serviceCenterQualityControlConfig.programmaticQCEnabled;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final QualityControlFlow getFlow() {
        return this.flow;
    }

    public final boolean getProgrammaticQCEnabled() {
        return this.programmaticQCEnabled;
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
        int hashCode = ((r0 * 31) + this.flow.hashCode()) * 31;
        boolean z2 = this.programmaticQCEnabled;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        QualityControlFlow qualityControlFlow = this.flow;
        boolean z2 = this.programmaticQCEnabled;
        return "ServiceCenterQualityControlConfig(enabled=" + z + ", flow=" + qualityControlFlow + ", programmaticQCEnabled=" + z2 + ")";
    }

    public ServiceCenterQualityControlConfig(boolean z, QualityControlFlow flow, boolean z2) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.enabled = z;
        this.flow = flow;
        this.programmaticQCEnabled = z2;
    }

    public /* synthetic */ ServiceCenterQualityControlConfig(boolean z, QualityControlFlow qualityControlFlow, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? QualityControlFlow.LIST : qualityControlFlow, (i & 4) != 0 ? false : z2);
    }
}
