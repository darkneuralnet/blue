package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BaseRentalConfig;", "", "dropOffConfig", "Lco/bird/android/model/wire/configs/RentalConfig;", "pickUpConfig", "onDemandConfig", "(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)V", "atLeastOneEnabled", "", "getAtLeastOneEnabled", "()Z", "config", "getConfig", "()Lco/bird/android/model/wire/configs/RentalConfig;", "getDropOffConfig", "getOnDemandConfig", "getPickUpConfig", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BaseRentalConfig {
    @JsonProperty("drop_off")
    @InterfaceC41208ft5("drop_off")
    private final RentalConfig dropOffConfig;
    @JsonProperty("on_demand")
    @InterfaceC41208ft5("on_demand")
    private final RentalConfig onDemandConfig;
    @JsonProperty("pick_up")
    @InterfaceC41208ft5("pick_up")
    private final RentalConfig pickUpConfig;

    public BaseRentalConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BaseRentalConfig copy$default(BaseRentalConfig baseRentalConfig, RentalConfig rentalConfig, RentalConfig rentalConfig2, RentalConfig rentalConfig3, int i, Object obj) {
        if ((i & 1) != 0) {
            rentalConfig = baseRentalConfig.dropOffConfig;
        }
        if ((i & 2) != 0) {
            rentalConfig2 = baseRentalConfig.pickUpConfig;
        }
        if ((i & 4) != 0) {
            rentalConfig3 = baseRentalConfig.onDemandConfig;
        }
        return baseRentalConfig.copy(rentalConfig, rentalConfig2, rentalConfig3);
    }

    public final RentalConfig component1() {
        return this.dropOffConfig;
    }

    public final RentalConfig component2() {
        return this.pickUpConfig;
    }

    public final RentalConfig component3() {
        return this.onDemandConfig;
    }

    public final BaseRentalConfig copy(RentalConfig dropOffConfig, RentalConfig pickUpConfig, RentalConfig onDemandConfig) {
        Intrinsics.checkNotNullParameter(dropOffConfig, "dropOffConfig");
        Intrinsics.checkNotNullParameter(pickUpConfig, "pickUpConfig");
        Intrinsics.checkNotNullParameter(onDemandConfig, "onDemandConfig");
        return new BaseRentalConfig(dropOffConfig, pickUpConfig, onDemandConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseRentalConfig) {
            BaseRentalConfig baseRentalConfig = (BaseRentalConfig) obj;
            return Intrinsics.areEqual(this.dropOffConfig, baseRentalConfig.dropOffConfig) && Intrinsics.areEqual(this.pickUpConfig, baseRentalConfig.pickUpConfig) && Intrinsics.areEqual(this.onDemandConfig, baseRentalConfig.onDemandConfig);
        }
        return false;
    }

    public final boolean getAtLeastOneEnabled() {
        return (this.dropOffConfig.getEnabled() || this.pickUpConfig.getEnabled()) && !this.onDemandConfig.getEnabled();
    }

    public final RentalConfig getConfig() {
        if (this.pickUpConfig.getEnabled()) {
            return this.pickUpConfig;
        }
        return this.dropOffConfig;
    }

    public final RentalConfig getDropOffConfig() {
        return this.dropOffConfig;
    }

    public final RentalConfig getOnDemandConfig() {
        return this.onDemandConfig;
    }

    public final RentalConfig getPickUpConfig() {
        return this.pickUpConfig;
    }

    public int hashCode() {
        return (((this.dropOffConfig.hashCode() * 31) + this.pickUpConfig.hashCode()) * 31) + this.onDemandConfig.hashCode();
    }

    public String toString() {
        RentalConfig rentalConfig = this.dropOffConfig;
        RentalConfig rentalConfig2 = this.pickUpConfig;
        RentalConfig rentalConfig3 = this.onDemandConfig;
        return "BaseRentalConfig(dropOffConfig=" + rentalConfig + ", pickUpConfig=" + rentalConfig2 + ", onDemandConfig=" + rentalConfig3 + ")";
    }

    public BaseRentalConfig(RentalConfig dropOffConfig, RentalConfig pickUpConfig, RentalConfig onDemandConfig) {
        Intrinsics.checkNotNullParameter(dropOffConfig, "dropOffConfig");
        Intrinsics.checkNotNullParameter(pickUpConfig, "pickUpConfig");
        Intrinsics.checkNotNullParameter(onDemandConfig, "onDemandConfig");
        this.dropOffConfig = dropOffConfig;
        this.pickUpConfig = pickUpConfig;
        this.onDemandConfig = onDemandConfig;
    }

    public /* synthetic */ BaseRentalConfig(RentalConfig rentalConfig, RentalConfig rentalConfig2, RentalConfig rentalConfig3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new RentalConfig(false, false, null, null, null, null, 63, null) : rentalConfig, (i & 2) != 0 ? new RentalConfig(false, false, null, null, null, null, 63, null) : rentalConfig2, (i & 4) != 0 ? new RentalConfig(false, false, null, null, null, null, 63, null) : rentalConfig3);
    }
}
