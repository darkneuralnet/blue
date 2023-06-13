package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ClusteringConfig;", "", "vehicles", "Lco/bird/android/model/wire/configs/ClusteringParametersConfig;", "nests", "(Lco/bird/android/model/wire/configs/ClusteringParametersConfig;Lco/bird/android/model/wire/configs/ClusteringParametersConfig;)V", "getNests", "()Lco/bird/android/model/wire/configs/ClusteringParametersConfig;", "getVehicles", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ClusteringConfig {
    @JsonProperty("nests")
    @InterfaceC41208ft5("nests")
    private final ClusteringParametersConfig nests;
    @JsonProperty("vehicles")
    @InterfaceC41208ft5("vehicles")
    private final ClusteringParametersConfig vehicles;

    public ClusteringConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ClusteringConfig copy$default(ClusteringConfig clusteringConfig, ClusteringParametersConfig clusteringParametersConfig, ClusteringParametersConfig clusteringParametersConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            clusteringParametersConfig = clusteringConfig.vehicles;
        }
        if ((i & 2) != 0) {
            clusteringParametersConfig2 = clusteringConfig.nests;
        }
        return clusteringConfig.copy(clusteringParametersConfig, clusteringParametersConfig2);
    }

    public final ClusteringParametersConfig component1() {
        return this.vehicles;
    }

    public final ClusteringParametersConfig component2() {
        return this.nests;
    }

    public final ClusteringConfig copy(ClusteringParametersConfig clusteringParametersConfig, ClusteringParametersConfig clusteringParametersConfig2) {
        return new ClusteringConfig(clusteringParametersConfig, clusteringParametersConfig2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClusteringConfig) {
            ClusteringConfig clusteringConfig = (ClusteringConfig) obj;
            return Intrinsics.areEqual(this.vehicles, clusteringConfig.vehicles) && Intrinsics.areEqual(this.nests, clusteringConfig.nests);
        }
        return false;
    }

    public final ClusteringParametersConfig getNests() {
        return this.nests;
    }

    public final ClusteringParametersConfig getVehicles() {
        return this.vehicles;
    }

    public int hashCode() {
        ClusteringParametersConfig clusteringParametersConfig = this.vehicles;
        int hashCode = (clusteringParametersConfig == null ? 0 : clusteringParametersConfig.hashCode()) * 31;
        ClusteringParametersConfig clusteringParametersConfig2 = this.nests;
        return hashCode + (clusteringParametersConfig2 != null ? clusteringParametersConfig2.hashCode() : 0);
    }

    public String toString() {
        ClusteringParametersConfig clusteringParametersConfig = this.vehicles;
        ClusteringParametersConfig clusteringParametersConfig2 = this.nests;
        return "ClusteringConfig(vehicles=" + clusteringParametersConfig + ", nests=" + clusteringParametersConfig2 + ")";
    }

    public ClusteringConfig(ClusteringParametersConfig clusteringParametersConfig, ClusteringParametersConfig clusteringParametersConfig2) {
        this.vehicles = clusteringParametersConfig;
        this.nests = clusteringParametersConfig2;
    }

    public /* synthetic */ ClusteringConfig(ClusteringParametersConfig clusteringParametersConfig, ClusteringParametersConfig clusteringParametersConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ClusteringParametersConfig(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null) : clusteringParametersConfig, (i & 2) != 0 ? new ClusteringParametersConfig(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null) : clusteringParametersConfig2);
    }
}
