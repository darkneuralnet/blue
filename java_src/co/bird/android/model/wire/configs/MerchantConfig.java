package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/wire/configs/MerchantConfig;", "", "enabled", "", "minZoomPercentageToShowPins", "", "minZoomPercentageToShowName", "enableMerchantAgreements", "merchantAgreementBannerConfig", "Lco/bird/android/model/wire/configs/MerchantAgreementBannerConfig;", "reportsUrl", "", "(ZFFLjava/lang/Boolean;Lco/bird/android/model/wire/configs/MerchantAgreementBannerConfig;Ljava/lang/String;)V", "getEnableMerchantAgreements", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnabled", "()Z", "getMerchantAgreementBannerConfig", "()Lco/bird/android/model/wire/configs/MerchantAgreementBannerConfig;", "getMinZoomPercentageToShowName", "()F", "getMinZoomPercentageToShowPins", "getReportsUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZFFLjava/lang/Boolean;Lco/bird/android/model/wire/configs/MerchantAgreementBannerConfig;Ljava/lang/String;)Lco/bird/android/model/wire/configs/MerchantConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MerchantConfig {
    @JsonProperty("enable_merchant_agreements")
    @InterfaceC41208ft5("enable_merchant_agreements")
    private final Boolean enableMerchantAgreements;
    @JsonProperty("enable_merchant_mode")
    @InterfaceC41208ft5("enable_merchant_mode")
    private final boolean enabled;
    @JsonProperty("merchant_banner_agreement_config")
    @InterfaceC41208ft5("merchant_banner_agreement_config")
    private final MerchantAgreementBannerConfig merchantAgreementBannerConfig;
    @JsonProperty("min_zoom_percentage_to_show_name")
    @InterfaceC41208ft5("min_zoom_percentage_to_show_name")
    private final float minZoomPercentageToShowName;
    @JsonProperty("min_zoom_percentage_to_show_pins")
    @InterfaceC41208ft5("min_zoom_percentage_to_show_pins")
    private final float minZoomPercentageToShowPins;
    @JsonProperty("merchant_reports_url")
    @InterfaceC41208ft5("merchant_reports_url")
    private final String reportsUrl;

    public MerchantConfig() {
        this(false, 0.0f, 0.0f, null, null, null, 63, null);
    }

    public static /* synthetic */ MerchantConfig copy$default(MerchantConfig merchantConfig, boolean z, float f, float f2, Boolean bool, MerchantAgreementBannerConfig merchantAgreementBannerConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = merchantConfig.enabled;
        }
        if ((i & 2) != 0) {
            f = merchantConfig.minZoomPercentageToShowPins;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = merchantConfig.minZoomPercentageToShowName;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            bool = merchantConfig.enableMerchantAgreements;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            merchantAgreementBannerConfig = merchantConfig.merchantAgreementBannerConfig;
        }
        MerchantAgreementBannerConfig merchantAgreementBannerConfig2 = merchantAgreementBannerConfig;
        if ((i & 32) != 0) {
            str = merchantConfig.reportsUrl;
        }
        return merchantConfig.copy(z, f3, f4, bool2, merchantAgreementBannerConfig2, str);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final float component2() {
        return this.minZoomPercentageToShowPins;
    }

    public final float component3() {
        return this.minZoomPercentageToShowName;
    }

    public final Boolean component4() {
        return this.enableMerchantAgreements;
    }

    public final MerchantAgreementBannerConfig component5() {
        return this.merchantAgreementBannerConfig;
    }

    public final String component6() {
        return this.reportsUrl;
    }

    public final MerchantConfig copy(boolean z, float f, float f2, Boolean bool, MerchantAgreementBannerConfig merchantAgreementBannerConfig, String str) {
        Intrinsics.checkNotNullParameter(merchantAgreementBannerConfig, "merchantAgreementBannerConfig");
        return new MerchantConfig(z, f, f2, bool, merchantAgreementBannerConfig, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MerchantConfig) {
            MerchantConfig merchantConfig = (MerchantConfig) obj;
            return this.enabled == merchantConfig.enabled && Float.compare(this.minZoomPercentageToShowPins, merchantConfig.minZoomPercentageToShowPins) == 0 && Float.compare(this.minZoomPercentageToShowName, merchantConfig.minZoomPercentageToShowName) == 0 && Intrinsics.areEqual(this.enableMerchantAgreements, merchantConfig.enableMerchantAgreements) && Intrinsics.areEqual(this.merchantAgreementBannerConfig, merchantConfig.merchantAgreementBannerConfig) && Intrinsics.areEqual(this.reportsUrl, merchantConfig.reportsUrl);
        }
        return false;
    }

    public final Boolean getEnableMerchantAgreements() {
        return this.enableMerchantAgreements;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final MerchantAgreementBannerConfig getMerchantAgreementBannerConfig() {
        return this.merchantAgreementBannerConfig;
    }

    public final float getMinZoomPercentageToShowName() {
        return this.minZoomPercentageToShowName;
    }

    public final float getMinZoomPercentageToShowPins() {
        return this.minZoomPercentageToShowPins;
    }

    public final String getReportsUrl() {
        return this.reportsUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + Float.hashCode(this.minZoomPercentageToShowPins)) * 31) + Float.hashCode(this.minZoomPercentageToShowName)) * 31;
        Boolean bool = this.enableMerchantAgreements;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.merchantAgreementBannerConfig.hashCode()) * 31;
        String str = this.reportsUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        float f = this.minZoomPercentageToShowPins;
        float f2 = this.minZoomPercentageToShowName;
        Boolean bool = this.enableMerchantAgreements;
        MerchantAgreementBannerConfig merchantAgreementBannerConfig = this.merchantAgreementBannerConfig;
        String str = this.reportsUrl;
        return "MerchantConfig(enabled=" + z + ", minZoomPercentageToShowPins=" + f + ", minZoomPercentageToShowName=" + f2 + ", enableMerchantAgreements=" + bool + ", merchantAgreementBannerConfig=" + merchantAgreementBannerConfig + ", reportsUrl=" + str + ")";
    }

    public MerchantConfig(boolean z, float f, float f2, Boolean bool, MerchantAgreementBannerConfig merchantAgreementBannerConfig, String str) {
        Intrinsics.checkNotNullParameter(merchantAgreementBannerConfig, "merchantAgreementBannerConfig");
        this.enabled = z;
        this.minZoomPercentageToShowPins = f;
        this.minZoomPercentageToShowName = f2;
        this.enableMerchantAgreements = bool;
        this.merchantAgreementBannerConfig = merchantAgreementBannerConfig;
        this.reportsUrl = str;
    }

    public /* synthetic */ MerchantConfig(boolean z, float f, float f2, Boolean bool, MerchantAgreementBannerConfig merchantAgreementBannerConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.75f : f2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? new MerchantAgreementBannerConfig(null, null, 3, null) : merchantAgreementBannerConfig, (i & 32) != 0 ? null : str);
    }
}
