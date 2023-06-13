package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÎ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0013HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b'\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006A"}, m28432d2 = {"Lco/bird/api/response/WireBirdPlusDisplay;", "", "heroImage", "Lco/bird/android/model/wire/WireLegacyAsset;", "heroAnimation", "heroPillLabel", "", "heroMessage", "bannerIcon", "bannerTitle", "bannerMessage", "planPreviewTitle", "planPreviewMessage", "planName", "purchasedHeroTopImage", "purchasedMessage", "purchasedHeroBottomImage", "purchasedHeroAnimation", "purchasedHeroTopColor", "", "purchasedHeroBottomColor", "(Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBannerIcon", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getBannerMessage", "()Ljava/lang/String;", "getBannerTitle", "getHeroAnimation", "getHeroImage", "getHeroMessage", "getHeroPillLabel", "getPlanName", "getPlanPreviewMessage", "getPlanPreviewTitle", "getPurchasedHeroAnimation", "getPurchasedHeroBottomColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPurchasedHeroBottomImage", "getPurchasedHeroTopColor", "getPurchasedHeroTopImage", "getPurchasedMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/api/response/WireBirdPlusDisplay;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdPlusDisplay {
    @JsonProperty("banner_icon")
    @InterfaceC41208ft5("banner_icon")
    private final WireLegacyAsset bannerIcon;
    @JsonProperty("banner_message")
    @InterfaceC41208ft5("banner_message")
    private final String bannerMessage;
    @JsonProperty("banner_title")
    @InterfaceC41208ft5("banner_title")
    private final String bannerTitle;
    @JsonProperty("hero_animation")
    @InterfaceC41208ft5("hero_animation")
    private final WireLegacyAsset heroAnimation;
    @JsonProperty("hero_image")
    @InterfaceC41208ft5("hero_image")
    private final WireLegacyAsset heroImage;
    @JsonProperty("hero_message")
    @InterfaceC41208ft5("hero_message")
    private final String heroMessage;
    @JsonProperty("hero_pill_label")
    @InterfaceC41208ft5("hero_pill_label")
    private final String heroPillLabel;
    @JsonProperty("plan_name")
    @InterfaceC41208ft5("plan_name")
    private final String planName;
    @JsonProperty("plan_preview_message")
    @InterfaceC41208ft5("plan_preview_message")
    private final String planPreviewMessage;
    @JsonProperty("plan_preview_title")
    @InterfaceC41208ft5("plan_preview_title")
    private final String planPreviewTitle;
    @JsonProperty("purchased_hero_animation")
    @InterfaceC41208ft5("purchased_hero_animation")
    private final WireLegacyAsset purchasedHeroAnimation;
    @JsonProperty("purchased_hero_bottom_color")
    @InterfaceC41208ft5("purchased_hero_bottom_color")
    private final Integer purchasedHeroBottomColor;
    @JsonProperty("purchased_hero_bottom_image")
    @InterfaceC41208ft5("purchased_hero_bottom_image")
    private final WireLegacyAsset purchasedHeroBottomImage;
    @JsonProperty("purchased_hero_top_color")
    @InterfaceC41208ft5("purchased_hero_top_color")
    private final Integer purchasedHeroTopColor;
    @JsonProperty("purchased_hero_top_image")
    @InterfaceC41208ft5("purchased_hero_top_image")
    private final WireLegacyAsset purchasedHeroTopImage;
    @JsonProperty("purchased_message")
    @InterfaceC41208ft5("purchased_message")
    private final String purchasedMessage;

    public WireBirdPlusDisplay() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final WireLegacyAsset component1() {
        return this.heroImage;
    }

    public final String component10() {
        return this.planName;
    }

    public final WireLegacyAsset component11() {
        return this.purchasedHeroTopImage;
    }

    public final String component12() {
        return this.purchasedMessage;
    }

    public final WireLegacyAsset component13() {
        return this.purchasedHeroBottomImage;
    }

    public final WireLegacyAsset component14() {
        return this.purchasedHeroAnimation;
    }

    public final Integer component15() {
        return this.purchasedHeroTopColor;
    }

    public final Integer component16() {
        return this.purchasedHeroBottomColor;
    }

    public final WireLegacyAsset component2() {
        return this.heroAnimation;
    }

    public final String component3() {
        return this.heroPillLabel;
    }

    public final String component4() {
        return this.heroMessage;
    }

    public final WireLegacyAsset component5() {
        return this.bannerIcon;
    }

    public final String component6() {
        return this.bannerTitle;
    }

    public final String component7() {
        return this.bannerMessage;
    }

    public final String component8() {
        return this.planPreviewTitle;
    }

    public final String component9() {
        return this.planPreviewMessage;
    }

    public final WireBirdPlusDisplay copy(WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, String str, String str2, WireLegacyAsset wireLegacyAsset3, String str3, String str4, String str5, String str6, String str7, WireLegacyAsset wireLegacyAsset4, String str8, WireLegacyAsset wireLegacyAsset5, WireLegacyAsset wireLegacyAsset6, Integer num, Integer num2) {
        return new WireBirdPlusDisplay(wireLegacyAsset, wireLegacyAsset2, str, str2, wireLegacyAsset3, str3, str4, str5, str6, str7, wireLegacyAsset4, str8, wireLegacyAsset5, wireLegacyAsset6, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdPlusDisplay) {
            WireBirdPlusDisplay wireBirdPlusDisplay = (WireBirdPlusDisplay) obj;
            return Intrinsics.areEqual(this.heroImage, wireBirdPlusDisplay.heroImage) && Intrinsics.areEqual(this.heroAnimation, wireBirdPlusDisplay.heroAnimation) && Intrinsics.areEqual(this.heroPillLabel, wireBirdPlusDisplay.heroPillLabel) && Intrinsics.areEqual(this.heroMessage, wireBirdPlusDisplay.heroMessage) && Intrinsics.areEqual(this.bannerIcon, wireBirdPlusDisplay.bannerIcon) && Intrinsics.areEqual(this.bannerTitle, wireBirdPlusDisplay.bannerTitle) && Intrinsics.areEqual(this.bannerMessage, wireBirdPlusDisplay.bannerMessage) && Intrinsics.areEqual(this.planPreviewTitle, wireBirdPlusDisplay.planPreviewTitle) && Intrinsics.areEqual(this.planPreviewMessage, wireBirdPlusDisplay.planPreviewMessage) && Intrinsics.areEqual(this.planName, wireBirdPlusDisplay.planName) && Intrinsics.areEqual(this.purchasedHeroTopImage, wireBirdPlusDisplay.purchasedHeroTopImage) && Intrinsics.areEqual(this.purchasedMessage, wireBirdPlusDisplay.purchasedMessage) && Intrinsics.areEqual(this.purchasedHeroBottomImage, wireBirdPlusDisplay.purchasedHeroBottomImage) && Intrinsics.areEqual(this.purchasedHeroAnimation, wireBirdPlusDisplay.purchasedHeroAnimation) && Intrinsics.areEqual(this.purchasedHeroTopColor, wireBirdPlusDisplay.purchasedHeroTopColor) && Intrinsics.areEqual(this.purchasedHeroBottomColor, wireBirdPlusDisplay.purchasedHeroBottomColor);
        }
        return false;
    }

    public final WireLegacyAsset getBannerIcon() {
        return this.bannerIcon;
    }

    public final String getBannerMessage() {
        return this.bannerMessage;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final WireLegacyAsset getHeroAnimation() {
        return this.heroAnimation;
    }

    public final WireLegacyAsset getHeroImage() {
        return this.heroImage;
    }

    public final String getHeroMessage() {
        return this.heroMessage;
    }

    public final String getHeroPillLabel() {
        return this.heroPillLabel;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final String getPlanPreviewMessage() {
        return this.planPreviewMessage;
    }

    public final String getPlanPreviewTitle() {
        return this.planPreviewTitle;
    }

    public final WireLegacyAsset getPurchasedHeroAnimation() {
        return this.purchasedHeroAnimation;
    }

    public final Integer getPurchasedHeroBottomColor() {
        return this.purchasedHeroBottomColor;
    }

    public final WireLegacyAsset getPurchasedHeroBottomImage() {
        return this.purchasedHeroBottomImage;
    }

    public final Integer getPurchasedHeroTopColor() {
        return this.purchasedHeroTopColor;
    }

    public final WireLegacyAsset getPurchasedHeroTopImage() {
        return this.purchasedHeroTopImage;
    }

    public final String getPurchasedMessage() {
        return this.purchasedMessage;
    }

    public int hashCode() {
        WireLegacyAsset wireLegacyAsset = this.heroImage;
        int hashCode = (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode()) * 31;
        WireLegacyAsset wireLegacyAsset2 = this.heroAnimation;
        int hashCode2 = (hashCode + (wireLegacyAsset2 == null ? 0 : wireLegacyAsset2.hashCode())) * 31;
        String str = this.heroPillLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.heroMessage;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset3 = this.bannerIcon;
        int hashCode5 = (hashCode4 + (wireLegacyAsset3 == null ? 0 : wireLegacyAsset3.hashCode())) * 31;
        String str3 = this.bannerTitle;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerMessage;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.planPreviewTitle;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.planPreviewMessage;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.planName;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset4 = this.purchasedHeroTopImage;
        int hashCode11 = (hashCode10 + (wireLegacyAsset4 == null ? 0 : wireLegacyAsset4.hashCode())) * 31;
        String str8 = this.purchasedMessage;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset5 = this.purchasedHeroBottomImage;
        int hashCode13 = (hashCode12 + (wireLegacyAsset5 == null ? 0 : wireLegacyAsset5.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset6 = this.purchasedHeroAnimation;
        int hashCode14 = (hashCode13 + (wireLegacyAsset6 == null ? 0 : wireLegacyAsset6.hashCode())) * 31;
        Integer num = this.purchasedHeroTopColor;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.purchasedHeroBottomColor;
        return hashCode15 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        WireLegacyAsset wireLegacyAsset = this.heroImage;
        WireLegacyAsset wireLegacyAsset2 = this.heroAnimation;
        String str = this.heroPillLabel;
        String str2 = this.heroMessage;
        WireLegacyAsset wireLegacyAsset3 = this.bannerIcon;
        String str3 = this.bannerTitle;
        String str4 = this.bannerMessage;
        String str5 = this.planPreviewTitle;
        String str6 = this.planPreviewMessage;
        String str7 = this.planName;
        WireLegacyAsset wireLegacyAsset4 = this.purchasedHeroTopImage;
        String str8 = this.purchasedMessage;
        WireLegacyAsset wireLegacyAsset5 = this.purchasedHeroBottomImage;
        WireLegacyAsset wireLegacyAsset6 = this.purchasedHeroAnimation;
        Integer num = this.purchasedHeroTopColor;
        Integer num2 = this.purchasedHeroBottomColor;
        return "WireBirdPlusDisplay(heroImage=" + wireLegacyAsset + ", heroAnimation=" + wireLegacyAsset2 + ", heroPillLabel=" + str + ", heroMessage=" + str2 + ", bannerIcon=" + wireLegacyAsset3 + ", bannerTitle=" + str3 + ", bannerMessage=" + str4 + ", planPreviewTitle=" + str5 + ", planPreviewMessage=" + str6 + ", planName=" + str7 + ", purchasedHeroTopImage=" + wireLegacyAsset4 + ", purchasedMessage=" + str8 + ", purchasedHeroBottomImage=" + wireLegacyAsset5 + ", purchasedHeroAnimation=" + wireLegacyAsset6 + ", purchasedHeroTopColor=" + num + ", purchasedHeroBottomColor=" + num2 + ")";
    }

    public WireBirdPlusDisplay(WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, String str, String str2, WireLegacyAsset wireLegacyAsset3, String str3, String str4, String str5, String str6, String str7, WireLegacyAsset wireLegacyAsset4, String str8, WireLegacyAsset wireLegacyAsset5, WireLegacyAsset wireLegacyAsset6, Integer num, Integer num2) {
        this.heroImage = wireLegacyAsset;
        this.heroAnimation = wireLegacyAsset2;
        this.heroPillLabel = str;
        this.heroMessage = str2;
        this.bannerIcon = wireLegacyAsset3;
        this.bannerTitle = str3;
        this.bannerMessage = str4;
        this.planPreviewTitle = str5;
        this.planPreviewMessage = str6;
        this.planName = str7;
        this.purchasedHeroTopImage = wireLegacyAsset4;
        this.purchasedMessage = str8;
        this.purchasedHeroBottomImage = wireLegacyAsset5;
        this.purchasedHeroAnimation = wireLegacyAsset6;
        this.purchasedHeroTopColor = num;
        this.purchasedHeroBottomColor = num2;
    }

    public /* synthetic */ WireBirdPlusDisplay(WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, String str, String str2, WireLegacyAsset wireLegacyAsset3, String str3, String str4, String str5, String str6, String str7, WireLegacyAsset wireLegacyAsset4, String str8, WireLegacyAsset wireLegacyAsset5, WireLegacyAsset wireLegacyAsset6, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireLegacyAsset, (i & 2) != 0 ? null : wireLegacyAsset2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : wireLegacyAsset3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : wireLegacyAsset4, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : wireLegacyAsset5, (i & 8192) != 0 ? null : wireLegacyAsset6, (i & 16384) != 0 ? null : num, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num2);
    }
}
