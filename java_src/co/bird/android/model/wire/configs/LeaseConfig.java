package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/configs/LeaseConfig;", "", "leaseTypes", "Lco/bird/android/model/wire/configs/LeaseTypesConfig;", "(Lco/bird/android/model/wire/configs/LeaseTypesConfig;)V", "getLeaseTypes", "()Lco/bird/android/model/wire/configs/LeaseTypesConfig;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseConfig {
    @JsonProperty("lease_types")
    @InterfaceC41208ft5("lease_types")
    private final LeaseTypesConfig leaseTypes;

    public LeaseConfig() {
        this(null, 1, null);
    }

    public static /* synthetic */ LeaseConfig copy$default(LeaseConfig leaseConfig, LeaseTypesConfig leaseTypesConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            leaseTypesConfig = leaseConfig.leaseTypes;
        }
        return leaseConfig.copy(leaseTypesConfig);
    }

    public final LeaseTypesConfig component1() {
        return this.leaseTypes;
    }

    public final LeaseConfig copy(LeaseTypesConfig leaseTypes) {
        Intrinsics.checkNotNullParameter(leaseTypes, "leaseTypes");
        return new LeaseConfig(leaseTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaseConfig) && Intrinsics.areEqual(this.leaseTypes, ((LeaseConfig) obj).leaseTypes);
    }

    public final LeaseTypesConfig getLeaseTypes() {
        return this.leaseTypes;
    }

    public int hashCode() {
        return this.leaseTypes.hashCode();
    }

    public String toString() {
        LeaseTypesConfig leaseTypesConfig = this.leaseTypes;
        return "LeaseConfig(leaseTypes=" + leaseTypesConfig + ")";
    }

    public LeaseConfig(LeaseTypesConfig leaseTypes) {
        Intrinsics.checkNotNullParameter(leaseTypes, "leaseTypes");
        this.leaseTypes = leaseTypes;
    }

    public /* synthetic */ LeaseConfig(LeaseTypesConfig leaseTypesConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LeaseTypesConfig(null, 1, null) : leaseTypesConfig);
    }
}
