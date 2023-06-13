package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;", "", "showRidePriceInBanners", "", "bannerRidePriceMaxNumberOfLines", "", "rideCostMode", "Lco/bird/android/model/wire/configs/RideCostMode;", "(ZILco/bird/android/model/wire/configs/RideCostMode;)V", "androidSpecificBannerRidePriceMaxNumberOfLines", "getAndroidSpecificBannerRidePriceMaxNumberOfLines", "()I", "getBannerRidePriceMaxNumberOfLines", "getRideCostMode", "()Lco/bird/android/model/wire/configs/RideCostMode;", "getShowRidePriceInBanners", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPricingUiFlightBarConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PricingUiFlightBarConfig.kt\nco/bird/android/model/wire/configs/PricingUiFlightBarConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes4.dex */
public final class PricingUiFlightBarConfig {
    private final int androidSpecificBannerRidePriceMaxNumberOfLines;
    @JsonProperty("number_of_lines")
    @InterfaceC41208ft5("number_of_lines")
    private final int bannerRidePriceMaxNumberOfLines;
    @JsonProperty("ride_cost_mode")
    @InterfaceC41208ft5("ride_cost_mode")
    private final RideCostMode rideCostMode;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean showRidePriceInBanners;

    public PricingUiFlightBarConfig() {
        this(false, 0, null, 7, null);
    }

    public static /* synthetic */ PricingUiFlightBarConfig copy$default(PricingUiFlightBarConfig pricingUiFlightBarConfig, boolean z, int i, RideCostMode rideCostMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = pricingUiFlightBarConfig.showRidePriceInBanners;
        }
        if ((i2 & 2) != 0) {
            i = pricingUiFlightBarConfig.bannerRidePriceMaxNumberOfLines;
        }
        if ((i2 & 4) != 0) {
            rideCostMode = pricingUiFlightBarConfig.rideCostMode;
        }
        return pricingUiFlightBarConfig.copy(z, i, rideCostMode);
    }

    public final boolean component1() {
        return this.showRidePriceInBanners;
    }

    public final int component2() {
        return this.bannerRidePriceMaxNumberOfLines;
    }

    public final RideCostMode component3() {
        return this.rideCostMode;
    }

    public final PricingUiFlightBarConfig copy(boolean z, int i, RideCostMode rideCostMode) {
        Intrinsics.checkNotNullParameter(rideCostMode, "rideCostMode");
        return new PricingUiFlightBarConfig(z, i, rideCostMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricingUiFlightBarConfig) {
            PricingUiFlightBarConfig pricingUiFlightBarConfig = (PricingUiFlightBarConfig) obj;
            return this.showRidePriceInBanners == pricingUiFlightBarConfig.showRidePriceInBanners && this.bannerRidePriceMaxNumberOfLines == pricingUiFlightBarConfig.bannerRidePriceMaxNumberOfLines && this.rideCostMode == pricingUiFlightBarConfig.rideCostMode;
        }
        return false;
    }

    public final int getAndroidSpecificBannerRidePriceMaxNumberOfLines() {
        return this.androidSpecificBannerRidePriceMaxNumberOfLines;
    }

    public final int getBannerRidePriceMaxNumberOfLines() {
        return this.bannerRidePriceMaxNumberOfLines;
    }

    public final RideCostMode getRideCostMode() {
        return this.rideCostMode;
    }

    public final boolean getShowRidePriceInBanners() {
        return this.showRidePriceInBanners;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.showRidePriceInBanners;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.bannerRidePriceMaxNumberOfLines)) * 31) + this.rideCostMode.hashCode();
    }

    public String toString() {
        boolean z = this.showRidePriceInBanners;
        int i = this.bannerRidePriceMaxNumberOfLines;
        RideCostMode rideCostMode = this.rideCostMode;
        return "PricingUiFlightBarConfig(showRidePriceInBanners=" + z + ", bannerRidePriceMaxNumberOfLines=" + i + ", rideCostMode=" + rideCostMode + ")";
    }

    public PricingUiFlightBarConfig(boolean z, int i, RideCostMode rideCostMode) {
        Intrinsics.checkNotNullParameter(rideCostMode, "rideCostMode");
        this.showRidePriceInBanners = z;
        this.bannerRidePriceMaxNumberOfLines = i;
        this.rideCostMode = rideCostMode;
        Integer valueOf = Integer.valueOf(i);
        valueOf = valueOf.intValue() > 0 ? valueOf : null;
        this.androidSpecificBannerRidePriceMaxNumberOfLines = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
    }

    public /* synthetic */ PricingUiFlightBarConfig(boolean z, int i, RideCostMode rideCostMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? RideCostMode.UNKNOWN : rideCostMode);
    }
}
