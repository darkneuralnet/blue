package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J¶\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0014HÖ\u0001J\t\u0010C\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BirdPayConfig;", "", "enableBirdPay", "", "showBirdPayOnMap", "enablePaymentPassthrough", "enableTapToPay", "nearbyQueryRadius", "", "bannerHelpArticleId", "", "autopayRequiredForOvercharge", "nearbyQueryUsesMapCenter", "showMerchantInfoOnPinTap", "enableTipping", "merchantPinSize", "tutorialConfig", "Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;", "bannerProminenceThreshold", "antifraudReceiptColor", "", "detailsScreenHeader", "(ZZZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/lang/Double;Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "getAntifraudReceiptColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAutopayRequiredForOvercharge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBannerHelpArticleId", "()Ljava/lang/String;", "getBannerProminenceThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDetailsScreenHeader", "getEnableBirdPay", "()Z", "getEnablePaymentPassthrough", "getEnableTapToPay", "getEnableTipping", "getMerchantPinSize", "getNearbyQueryRadius", "getNearbyQueryUsesMapCenter", "getShowBirdPayOnMap", "getShowMerchantInfoOnPinTap", "getTutorialConfig", "()Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/lang/Double;Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/wire/configs/BirdPayConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPayConfig {
    @JsonProperty("antifraud_receipt_color")
    @InterfaceC41208ft5("antifraud_receipt_color")
    private final Integer antifraudReceiptColor;
    @JsonProperty("autopay_required_for_overcharge")
    @InterfaceC41208ft5("autopay_required_for_overcharge")
    private final Boolean autopayRequiredForOvercharge;
    @JsonProperty("banner_help_article_id")
    @InterfaceC41208ft5("banner_help_article_id")
    private final String bannerHelpArticleId;
    @JsonProperty("banner_prominence_threshold")
    @InterfaceC41208ft5("banner_prominence_threshold")
    private final Double bannerProminenceThreshold;
    @JsonProperty("merchant_details_header")
    @InterfaceC41208ft5("merchant_details_header")
    private final String detailsScreenHeader;
    @JsonProperty("enable_bird_pay")
    @InterfaceC41208ft5("enable_bird_pay")
    private final boolean enableBirdPay;
    @JsonProperty("enable_payment_passthrough")
    @InterfaceC41208ft5("enable_payment_passthrough")
    private final boolean enablePaymentPassthrough;
    @JsonProperty("enable_tap_to_pay")
    @InterfaceC41208ft5("enable_tap_to_pay")
    private final boolean enableTapToPay;
    @JsonProperty("enable_merchant_site_tips")
    @InterfaceC41208ft5("enable_merchant_site_tips")
    private final boolean enableTipping;
    @JsonProperty("merchant_pin_size")
    @InterfaceC41208ft5("merchant_pin_size")
    private final Double merchantPinSize;
    @JsonProperty("nearby_query_radius")
    @InterfaceC41208ft5("nearby_query_radius")
    private final Double nearbyQueryRadius;
    @JsonProperty("nearby_query_uses_map_center")
    @InterfaceC41208ft5("nearby_query_uses_map_center")
    private final Boolean nearbyQueryUsesMapCenter;
    @JsonProperty("show_bird_pay_on_map")
    @InterfaceC41208ft5("show_bird_pay_on_map")
    private final boolean showBirdPayOnMap;
    @JsonProperty("show_merchant_info_on_pin_tap")
    @InterfaceC41208ft5("show_merchant_info_on_pin_tap")
    private final boolean showMerchantInfoOnPinTap;
    @JsonProperty("onboarding_config")
    @InterfaceC41208ft5("onboarding_config")
    private final BirdPayTutorialConfig tutorialConfig;

    public BirdPayConfig() {
        this(false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, 32767, null);
    }

    public final boolean component1() {
        return this.enableBirdPay;
    }

    public final boolean component10() {
        return this.enableTipping;
    }

    public final Double component11() {
        return this.merchantPinSize;
    }

    public final BirdPayTutorialConfig component12() {
        return this.tutorialConfig;
    }

    public final Double component13() {
        return this.bannerProminenceThreshold;
    }

    public final Integer component14() {
        return this.antifraudReceiptColor;
    }

    public final String component15() {
        return this.detailsScreenHeader;
    }

    public final boolean component2() {
        return this.showBirdPayOnMap;
    }

    public final boolean component3() {
        return this.enablePaymentPassthrough;
    }

    public final boolean component4() {
        return this.enableTapToPay;
    }

    public final Double component5() {
        return this.nearbyQueryRadius;
    }

    public final String component6() {
        return this.bannerHelpArticleId;
    }

    public final Boolean component7() {
        return this.autopayRequiredForOvercharge;
    }

    public final Boolean component8() {
        return this.nearbyQueryUsesMapCenter;
    }

    public final boolean component9() {
        return this.showMerchantInfoOnPinTap;
    }

    public final BirdPayConfig copy(boolean z, boolean z2, boolean z3, boolean z4, Double d, String str, Boolean bool, Boolean bool2, boolean z5, boolean z6, Double d2, BirdPayTutorialConfig birdPayTutorialConfig, Double d3, Integer num, String str2) {
        return new BirdPayConfig(z, z2, z3, z4, d, str, bool, bool2, z5, z6, d2, birdPayTutorialConfig, d3, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPayConfig) {
            BirdPayConfig birdPayConfig = (BirdPayConfig) obj;
            return this.enableBirdPay == birdPayConfig.enableBirdPay && this.showBirdPayOnMap == birdPayConfig.showBirdPayOnMap && this.enablePaymentPassthrough == birdPayConfig.enablePaymentPassthrough && this.enableTapToPay == birdPayConfig.enableTapToPay && Intrinsics.areEqual((Object) this.nearbyQueryRadius, (Object) birdPayConfig.nearbyQueryRadius) && Intrinsics.areEqual(this.bannerHelpArticleId, birdPayConfig.bannerHelpArticleId) && Intrinsics.areEqual(this.autopayRequiredForOvercharge, birdPayConfig.autopayRequiredForOvercharge) && Intrinsics.areEqual(this.nearbyQueryUsesMapCenter, birdPayConfig.nearbyQueryUsesMapCenter) && this.showMerchantInfoOnPinTap == birdPayConfig.showMerchantInfoOnPinTap && this.enableTipping == birdPayConfig.enableTipping && Intrinsics.areEqual((Object) this.merchantPinSize, (Object) birdPayConfig.merchantPinSize) && Intrinsics.areEqual(this.tutorialConfig, birdPayConfig.tutorialConfig) && Intrinsics.areEqual((Object) this.bannerProminenceThreshold, (Object) birdPayConfig.bannerProminenceThreshold) && Intrinsics.areEqual(this.antifraudReceiptColor, birdPayConfig.antifraudReceiptColor) && Intrinsics.areEqual(this.detailsScreenHeader, birdPayConfig.detailsScreenHeader);
        }
        return false;
    }

    public final Integer getAntifraudReceiptColor() {
        return this.antifraudReceiptColor;
    }

    public final Boolean getAutopayRequiredForOvercharge() {
        return this.autopayRequiredForOvercharge;
    }

    public final String getBannerHelpArticleId() {
        return this.bannerHelpArticleId;
    }

    public final Double getBannerProminenceThreshold() {
        return this.bannerProminenceThreshold;
    }

    public final String getDetailsScreenHeader() {
        return this.detailsScreenHeader;
    }

    public final boolean getEnableBirdPay() {
        return this.enableBirdPay;
    }

    public final boolean getEnablePaymentPassthrough() {
        return this.enablePaymentPassthrough;
    }

    public final boolean getEnableTapToPay() {
        return this.enableTapToPay;
    }

    public final boolean getEnableTipping() {
        return this.enableTipping;
    }

    public final Double getMerchantPinSize() {
        return this.merchantPinSize;
    }

    public final Double getNearbyQueryRadius() {
        return this.nearbyQueryRadius;
    }

    public final Boolean getNearbyQueryUsesMapCenter() {
        return this.nearbyQueryUsesMapCenter;
    }

    public final boolean getShowBirdPayOnMap() {
        return this.showBirdPayOnMap;
    }

    public final boolean getShowMerchantInfoOnPinTap() {
        return this.showMerchantInfoOnPinTap;
    }

    public final BirdPayTutorialConfig getTutorialConfig() {
        return this.tutorialConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableBirdPay;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.showBirdPayOnMap;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enablePaymentPassthrough;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableTapToPay;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        Double d = this.nearbyQueryRadius;
        int hashCode = (i7 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.bannerHelpArticleId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.autopayRequiredForOvercharge;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.nearbyQueryUsesMapCenter;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ?? r24 = this.showMerchantInfoOnPinTap;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode4 + i8) * 31;
        boolean z2 = this.enableTipping;
        int i10 = (i9 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Double d2 = this.merchantPinSize;
        int hashCode5 = (i10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        BirdPayTutorialConfig birdPayTutorialConfig = this.tutorialConfig;
        int hashCode6 = (hashCode5 + (birdPayTutorialConfig == null ? 0 : birdPayTutorialConfig.hashCode())) * 31;
        Double d3 = this.bannerProminenceThreshold;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.antifraudReceiptColor;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.detailsScreenHeader;
        return hashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enableBirdPay;
        boolean z2 = this.showBirdPayOnMap;
        boolean z3 = this.enablePaymentPassthrough;
        boolean z4 = this.enableTapToPay;
        Double d = this.nearbyQueryRadius;
        String str = this.bannerHelpArticleId;
        Boolean bool = this.autopayRequiredForOvercharge;
        Boolean bool2 = this.nearbyQueryUsesMapCenter;
        boolean z5 = this.showMerchantInfoOnPinTap;
        boolean z6 = this.enableTipping;
        Double d2 = this.merchantPinSize;
        BirdPayTutorialConfig birdPayTutorialConfig = this.tutorialConfig;
        Double d3 = this.bannerProminenceThreshold;
        Integer num = this.antifraudReceiptColor;
        String str2 = this.detailsScreenHeader;
        return "BirdPayConfig(enableBirdPay=" + z + ", showBirdPayOnMap=" + z2 + ", enablePaymentPassthrough=" + z3 + ", enableTapToPay=" + z4 + ", nearbyQueryRadius=" + d + ", bannerHelpArticleId=" + str + ", autopayRequiredForOvercharge=" + bool + ", nearbyQueryUsesMapCenter=" + bool2 + ", showMerchantInfoOnPinTap=" + z5 + ", enableTipping=" + z6 + ", merchantPinSize=" + d2 + ", tutorialConfig=" + birdPayTutorialConfig + ", bannerProminenceThreshold=" + d3 + ", antifraudReceiptColor=" + num + ", detailsScreenHeader=" + str2 + ")";
    }

    public BirdPayConfig(boolean z, boolean z2, boolean z3, boolean z4, Double d, String str, Boolean bool, Boolean bool2, boolean z5, boolean z6, Double d2, BirdPayTutorialConfig birdPayTutorialConfig, Double d3, Integer num, String str2) {
        this.enableBirdPay = z;
        this.showBirdPayOnMap = z2;
        this.enablePaymentPassthrough = z3;
        this.enableTapToPay = z4;
        this.nearbyQueryRadius = d;
        this.bannerHelpArticleId = str;
        this.autopayRequiredForOvercharge = bool;
        this.nearbyQueryUsesMapCenter = bool2;
        this.showMerchantInfoOnPinTap = z5;
        this.enableTipping = z6;
        this.merchantPinSize = d2;
        this.tutorialConfig = birdPayTutorialConfig;
        this.bannerProminenceThreshold = d3;
        this.antifraudReceiptColor = num;
        this.detailsScreenHeader = str2;
    }

    public /* synthetic */ BirdPayConfig(boolean z, boolean z2, boolean z3, boolean z4, Double d, String str, Boolean bool, Boolean bool2, boolean z5, boolean z6, Double d2, BirdPayTutorialConfig birdPayTutorialConfig, Double d3, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? false : z5, (i & 512) == 0 ? z6 : false, (i & 1024) != 0 ? null : d2, (i & 2048) != 0 ? null : birdPayTutorialConfig, (i & 4096) != 0 ? null : d3, (i & 8192) != 0 ? null : num, (i & 16384) == 0 ? str2 : null);
    }
}
