package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/configs/LeaseTypesConfig;", "", "helmet", "Lco/bird/android/model/wire/configs/LeaseTypeConfig;", "(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)V", "getHelmet", "()Lco/bird/android/model/wire/configs/LeaseTypeConfig;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseTypesConfig {
    @JsonProperty("helmet")
    @InterfaceC41208ft5("helmet")
    private final LeaseTypeConfig helmet;

    public LeaseTypesConfig() {
        this(null, 1, null);
    }

    public static /* synthetic */ LeaseTypesConfig copy$default(LeaseTypesConfig leaseTypesConfig, LeaseTypeConfig leaseTypeConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            leaseTypeConfig = leaseTypesConfig.helmet;
        }
        return leaseTypesConfig.copy(leaseTypeConfig);
    }

    public final LeaseTypeConfig component1() {
        return this.helmet;
    }

    public final LeaseTypesConfig copy(LeaseTypeConfig helmet) {
        Intrinsics.checkNotNullParameter(helmet, "helmet");
        return new LeaseTypesConfig(helmet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaseTypesConfig) && Intrinsics.areEqual(this.helmet, ((LeaseTypesConfig) obj).helmet);
    }

    public final LeaseTypeConfig getHelmet() {
        return this.helmet;
    }

    public int hashCode() {
        return this.helmet.hashCode();
    }

    public String toString() {
        LeaseTypeConfig leaseTypeConfig = this.helmet;
        return "LeaseTypesConfig(helmet=" + leaseTypeConfig + ")";
    }

    public LeaseTypesConfig(LeaseTypeConfig helmet) {
        Intrinsics.checkNotNullParameter(helmet, "helmet");
        this.helmet = helmet;
    }

    public /* synthetic */ LeaseTypesConfig(LeaseTypeConfig leaseTypeConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        LeaseTypesConfig leaseTypesConfig;
        LeaseTypeConfig leaseTypeConfig2;
        if ((i & 1) != 0) {
            leaseTypeConfig2 = new LeaseTypeConfig(false, 0L, 0L, 0L, 0, 0L, false, false, 0L, 0, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
            leaseTypesConfig = this;
        } else {
            leaseTypesConfig = this;
            leaseTypeConfig2 = leaseTypeConfig;
        }
        new LeaseTypesConfig(leaseTypeConfig2);
    }
}
