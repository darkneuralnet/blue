package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OnboardingConfig;", "", "enableRiderOneFlow", "", "enableRiderRideButtonEntry", "enableRiderBannerEntry", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnableRiderBannerEntry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableRiderOneFlow", "getEnableRiderRideButtonEntry", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lco/bird/android/model/wire/configs/OnboardingConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingConfig {
    @JsonProperty("enable_rider_banner_entry")
    @InterfaceC41208ft5("enable_rider_banner_entry")
    private final Boolean enableRiderBannerEntry;
    @JsonProperty("enable_rider_one_flow")
    @InterfaceC41208ft5("enable_rider_one_flow")
    private final Boolean enableRiderOneFlow;
    @JsonProperty("enable_rider_ride_button_entry")
    @InterfaceC41208ft5("enable_rider_ride_button_entry")
    private final Boolean enableRiderRideButtonEntry;

    public OnboardingConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OnboardingConfig copy$default(OnboardingConfig onboardingConfig, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onboardingConfig.enableRiderOneFlow;
        }
        if ((i & 2) != 0) {
            bool2 = onboardingConfig.enableRiderRideButtonEntry;
        }
        if ((i & 4) != 0) {
            bool3 = onboardingConfig.enableRiderBannerEntry;
        }
        return onboardingConfig.copy(bool, bool2, bool3);
    }

    public final Boolean component1() {
        return this.enableRiderOneFlow;
    }

    public final Boolean component2() {
        return this.enableRiderRideButtonEntry;
    }

    public final Boolean component3() {
        return this.enableRiderBannerEntry;
    }

    public final OnboardingConfig copy(Boolean bool, Boolean bool2, Boolean bool3) {
        return new OnboardingConfig(bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingConfig) {
            OnboardingConfig onboardingConfig = (OnboardingConfig) obj;
            return Intrinsics.areEqual(this.enableRiderOneFlow, onboardingConfig.enableRiderOneFlow) && Intrinsics.areEqual(this.enableRiderRideButtonEntry, onboardingConfig.enableRiderRideButtonEntry) && Intrinsics.areEqual(this.enableRiderBannerEntry, onboardingConfig.enableRiderBannerEntry);
        }
        return false;
    }

    public final Boolean getEnableRiderBannerEntry() {
        return this.enableRiderBannerEntry;
    }

    public final Boolean getEnableRiderOneFlow() {
        return this.enableRiderOneFlow;
    }

    public final Boolean getEnableRiderRideButtonEntry() {
        return this.enableRiderRideButtonEntry;
    }

    public int hashCode() {
        Boolean bool = this.enableRiderOneFlow;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableRiderRideButtonEntry;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableRiderBannerEntry;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enableRiderOneFlow;
        Boolean bool2 = this.enableRiderRideButtonEntry;
        Boolean bool3 = this.enableRiderBannerEntry;
        return "OnboardingConfig(enableRiderOneFlow=" + bool + ", enableRiderRideButtonEntry=" + bool2 + ", enableRiderBannerEntry=" + bool3 + ")";
    }

    public OnboardingConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this.enableRiderOneFlow = bool;
        this.enableRiderRideButtonEntry = bool2;
        this.enableRiderBannerEntry = bool3;
    }

    public /* synthetic */ OnboardingConfig(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
