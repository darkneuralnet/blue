package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PricingUiConfig;", "", "enabled", "", "enableScannerTapToSeePricing", "flightBarPricing", "Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;", "(ZZLco/bird/android/model/wire/configs/PricingUiFlightBarConfig;)V", "getEnableScannerTapToSeePricing", "()Z", "getEnabled", "getFlightBarPricing", "()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PricingUiConfig {
    @JsonProperty("enable_scanner_tap_to_see_pricing")
    @InterfaceC41208ft5("enable_scanner_tap_to_see_pricing")
    private final boolean enableScannerTapToSeePricing;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("flight_bar_pricing")
    @InterfaceC41208ft5("flight_bar_pricing")
    private final PricingUiFlightBarConfig flightBarPricing;

    public PricingUiConfig() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ PricingUiConfig copy$default(PricingUiConfig pricingUiConfig, boolean z, boolean z2, PricingUiFlightBarConfig pricingUiFlightBarConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pricingUiConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = pricingUiConfig.enableScannerTapToSeePricing;
        }
        if ((i & 4) != 0) {
            pricingUiFlightBarConfig = pricingUiConfig.flightBarPricing;
        }
        return pricingUiConfig.copy(z, z2, pricingUiFlightBarConfig);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.enableScannerTapToSeePricing;
    }

    public final PricingUiFlightBarConfig component3() {
        return this.flightBarPricing;
    }

    public final PricingUiConfig copy(boolean z, boolean z2, PricingUiFlightBarConfig flightBarPricing) {
        Intrinsics.checkNotNullParameter(flightBarPricing, "flightBarPricing");
        return new PricingUiConfig(z, z2, flightBarPricing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricingUiConfig) {
            PricingUiConfig pricingUiConfig = (PricingUiConfig) obj;
            return this.enabled == pricingUiConfig.enabled && this.enableScannerTapToSeePricing == pricingUiConfig.enableScannerTapToSeePricing && Intrinsics.areEqual(this.flightBarPricing, pricingUiConfig.flightBarPricing);
        }
        return false;
    }

    public final boolean getEnableScannerTapToSeePricing() {
        return this.enableScannerTapToSeePricing;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final PricingUiFlightBarConfig getFlightBarPricing() {
        return this.flightBarPricing;
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
        int i = r0 * 31;
        boolean z2 = this.enableScannerTapToSeePricing;
        return ((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.flightBarPricing.hashCode();
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableScannerTapToSeePricing;
        PricingUiFlightBarConfig pricingUiFlightBarConfig = this.flightBarPricing;
        return "PricingUiConfig(enabled=" + z + ", enableScannerTapToSeePricing=" + z2 + ", flightBarPricing=" + pricingUiFlightBarConfig + ")";
    }

    public PricingUiConfig(boolean z, boolean z2, PricingUiFlightBarConfig flightBarPricing) {
        Intrinsics.checkNotNullParameter(flightBarPricing, "flightBarPricing");
        this.enabled = z;
        this.enableScannerTapToSeePricing = z2;
        this.flightBarPricing = flightBarPricing;
    }

    public /* synthetic */ PricingUiConfig(boolean z, boolean z2, PricingUiFlightBarConfig pricingUiFlightBarConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new PricingUiFlightBarConfig(false, 0, null, 7, null) : pricingUiFlightBarConfig);
    }
}
