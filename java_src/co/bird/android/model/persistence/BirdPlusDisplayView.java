package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÎ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0013HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b'\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusDisplayView;", "", "heroImage", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "heroAnimation", "heroPillLabel", "", "heroMessage", "bannerIcon", "bannerTitle", "bannerMessage", "planPreviewTitle", "planPreviewMessage", "planName", "purchasedHeroTopImage", "purchasedMessage", "purchasedHeroBottomImage", "purchasedHeroAnimation", "purchasedHeroTopColor", "", "purchasedHeroBottomColor", "(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBannerIcon", "()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "getBannerMessage", "()Ljava/lang/String;", "getBannerTitle", "getHeroAnimation", "getHeroImage", "getHeroMessage", "getHeroPillLabel", "getPlanName", "getPlanPreviewMessage", "getPlanPreviewTitle", "getPurchasedHeroAnimation", "getPurchasedHeroBottomColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPurchasedHeroBottomImage", "getPurchasedHeroTopColor", "getPurchasedHeroTopImage", "getPurchasedMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/BirdPlusDisplayView;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusDisplayView {
    @JsonProperty("banner_icon")
    @InterfaceC41208ft5("banner_icon")
    private final LegacyAsset bannerIcon;
    @JsonProperty("banner_message")
    @InterfaceC41208ft5("banner_message")
    private final String bannerMessage;
    @JsonProperty("banner_title")
    @InterfaceC41208ft5("banner_title")
    private final String bannerTitle;
    @JsonProperty("hero_animation")
    private final LegacyAsset heroAnimation;
    @JsonProperty("hero_image")
    private final LegacyAsset heroImage;
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
    private final LegacyAsset purchasedHeroAnimation;
    @JsonProperty("purchased_hero_bottom_color")
    @InterfaceC41208ft5("purchased_hero_bottom_color")
    private final Integer purchasedHeroBottomColor;
    @JsonProperty("purchased_hero_bottom_image")
    @InterfaceC41208ft5("purchased_hero_bottom_image")
    private final LegacyAsset purchasedHeroBottomImage;
    @JsonProperty("purchased_hero_top_color")
    @InterfaceC41208ft5("purchased_hero_top_color")
    private final Integer purchasedHeroTopColor;
    @JsonProperty("purchased_hero_top_image")
    @InterfaceC41208ft5("purchased_hero_top_image")
    private final LegacyAsset purchasedHeroTopImage;
    @JsonProperty("purchased_message")
    @InterfaceC41208ft5("purchased_message")
    private final String purchasedMessage;

    public BirdPlusDisplayView() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final LegacyAsset component1() {
        return this.heroImage;
    }

    public final String component10() {
        return this.planName;
    }

    public final LegacyAsset component11() {
        return this.purchasedHeroTopImage;
    }

    public final String component12() {
        return this.purchasedMessage;
    }

    public final LegacyAsset component13() {
        return this.purchasedHeroBottomImage;
    }

    public final LegacyAsset component14() {
        return this.purchasedHeroAnimation;
    }

    public final Integer component15() {
        return this.purchasedHeroTopColor;
    }

    public final Integer component16() {
        return this.purchasedHeroBottomColor;
    }

    public final LegacyAsset component2() {
        return this.heroAnimation;
    }

    public final String component3() {
        return this.heroPillLabel;
    }

    public final String component4() {
        return this.heroMessage;
    }

    public final LegacyAsset component5() {
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

    public final BirdPlusDisplayView copy(LegacyAsset legacyAsset, LegacyAsset legacyAsset2, String str, String str2, LegacyAsset legacyAsset3, String str3, String str4, String str5, String str6, String str7, LegacyAsset legacyAsset4, String str8, LegacyAsset legacyAsset5, LegacyAsset legacyAsset6, Integer num, Integer num2) {
        return new BirdPlusDisplayView(legacyAsset, legacyAsset2, str, str2, legacyAsset3, str3, str4, str5, str6, str7, legacyAsset4, str8, legacyAsset5, legacyAsset6, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusDisplayView) {
            BirdPlusDisplayView birdPlusDisplayView = (BirdPlusDisplayView) obj;
            return Intrinsics.areEqual(this.heroImage, birdPlusDisplayView.heroImage) && Intrinsics.areEqual(this.heroAnimation, birdPlusDisplayView.heroAnimation) && Intrinsics.areEqual(this.heroPillLabel, birdPlusDisplayView.heroPillLabel) && Intrinsics.areEqual(this.heroMessage, birdPlusDisplayView.heroMessage) && Intrinsics.areEqual(this.bannerIcon, birdPlusDisplayView.bannerIcon) && Intrinsics.areEqual(this.bannerTitle, birdPlusDisplayView.bannerTitle) && Intrinsics.areEqual(this.bannerMessage, birdPlusDisplayView.bannerMessage) && Intrinsics.areEqual(this.planPreviewTitle, birdPlusDisplayView.planPreviewTitle) && Intrinsics.areEqual(this.planPreviewMessage, birdPlusDisplayView.planPreviewMessage) && Intrinsics.areEqual(this.planName, birdPlusDisplayView.planName) && Intrinsics.areEqual(this.purchasedHeroTopImage, birdPlusDisplayView.purchasedHeroTopImage) && Intrinsics.areEqual(this.purchasedMessage, birdPlusDisplayView.purchasedMessage) && Intrinsics.areEqual(this.purchasedHeroBottomImage, birdPlusDisplayView.purchasedHeroBottomImage) && Intrinsics.areEqual(this.purchasedHeroAnimation, birdPlusDisplayView.purchasedHeroAnimation) && Intrinsics.areEqual(this.purchasedHeroTopColor, birdPlusDisplayView.purchasedHeroTopColor) && Intrinsics.areEqual(this.purchasedHeroBottomColor, birdPlusDisplayView.purchasedHeroBottomColor);
        }
        return false;
    }

    public final LegacyAsset getBannerIcon() {
        return this.bannerIcon;
    }

    public final String getBannerMessage() {
        return this.bannerMessage;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final LegacyAsset getHeroAnimation() {
        return this.heroAnimation;
    }

    public final LegacyAsset getHeroImage() {
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

    public final LegacyAsset getPurchasedHeroAnimation() {
        return this.purchasedHeroAnimation;
    }

    public final Integer getPurchasedHeroBottomColor() {
        return this.purchasedHeroBottomColor;
    }

    public final LegacyAsset getPurchasedHeroBottomImage() {
        return this.purchasedHeroBottomImage;
    }

    public final Integer getPurchasedHeroTopColor() {
        return this.purchasedHeroTopColor;
    }

    public final LegacyAsset getPurchasedHeroTopImage() {
        return this.purchasedHeroTopImage;
    }

    public final String getPurchasedMessage() {
        return this.purchasedMessage;
    }

    public int hashCode() {
        LegacyAsset legacyAsset = this.heroImage;
        int hashCode = (legacyAsset == null ? 0 : legacyAsset.hashCode()) * 31;
        LegacyAsset legacyAsset2 = this.heroAnimation;
        int hashCode2 = (hashCode + (legacyAsset2 == null ? 0 : legacyAsset2.hashCode())) * 31;
        String str = this.heroPillLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.heroMessage;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LegacyAsset legacyAsset3 = this.bannerIcon;
        int hashCode5 = (hashCode4 + (legacyAsset3 == null ? 0 : legacyAsset3.hashCode())) * 31;
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
        LegacyAsset legacyAsset4 = this.purchasedHeroTopImage;
        int hashCode11 = (hashCode10 + (legacyAsset4 == null ? 0 : legacyAsset4.hashCode())) * 31;
        String str8 = this.purchasedMessage;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LegacyAsset legacyAsset5 = this.purchasedHeroBottomImage;
        int hashCode13 = (hashCode12 + (legacyAsset5 == null ? 0 : legacyAsset5.hashCode())) * 31;
        LegacyAsset legacyAsset6 = this.purchasedHeroAnimation;
        int hashCode14 = (hashCode13 + (legacyAsset6 == null ? 0 : legacyAsset6.hashCode())) * 31;
        Integer num = this.purchasedHeroTopColor;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.purchasedHeroBottomColor;
        return hashCode15 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        LegacyAsset legacyAsset = this.heroImage;
        LegacyAsset legacyAsset2 = this.heroAnimation;
        String str = this.heroPillLabel;
        String str2 = this.heroMessage;
        LegacyAsset legacyAsset3 = this.bannerIcon;
        String str3 = this.bannerTitle;
        String str4 = this.bannerMessage;
        String str5 = this.planPreviewTitle;
        String str6 = this.planPreviewMessage;
        String str7 = this.planName;
        LegacyAsset legacyAsset4 = this.purchasedHeroTopImage;
        String str8 = this.purchasedMessage;
        LegacyAsset legacyAsset5 = this.purchasedHeroBottomImage;
        LegacyAsset legacyAsset6 = this.purchasedHeroAnimation;
        Integer num = this.purchasedHeroTopColor;
        Integer num2 = this.purchasedHeroBottomColor;
        return "BirdPlusDisplayView(heroImage=" + legacyAsset + ", heroAnimation=" + legacyAsset2 + ", heroPillLabel=" + str + ", heroMessage=" + str2 + ", bannerIcon=" + legacyAsset3 + ", bannerTitle=" + str3 + ", bannerMessage=" + str4 + ", planPreviewTitle=" + str5 + ", planPreviewMessage=" + str6 + ", planName=" + str7 + ", purchasedHeroTopImage=" + legacyAsset4 + ", purchasedMessage=" + str8 + ", purchasedHeroBottomImage=" + legacyAsset5 + ", purchasedHeroAnimation=" + legacyAsset6 + ", purchasedHeroTopColor=" + num + ", purchasedHeroBottomColor=" + num2 + ")";
    }

    public BirdPlusDisplayView(LegacyAsset legacyAsset, LegacyAsset legacyAsset2, String str, String str2, LegacyAsset legacyAsset3, String str3, String str4, String str5, String str6, String str7, LegacyAsset legacyAsset4, String str8, LegacyAsset legacyAsset5, LegacyAsset legacyAsset6, Integer num, Integer num2) {
        this.heroImage = legacyAsset;
        this.heroAnimation = legacyAsset2;
        this.heroPillLabel = str;
        this.heroMessage = str2;
        this.bannerIcon = legacyAsset3;
        this.bannerTitle = str3;
        this.bannerMessage = str4;
        this.planPreviewTitle = str5;
        this.planPreviewMessage = str6;
        this.planName = str7;
        this.purchasedHeroTopImage = legacyAsset4;
        this.purchasedMessage = str8;
        this.purchasedHeroBottomImage = legacyAsset5;
        this.purchasedHeroAnimation = legacyAsset6;
        this.purchasedHeroTopColor = num;
        this.purchasedHeroBottomColor = num2;
    }

    public /* synthetic */ BirdPlusDisplayView(LegacyAsset legacyAsset, LegacyAsset legacyAsset2, String str, String str2, LegacyAsset legacyAsset3, String str3, String str4, String str5, String str6, String str7, LegacyAsset legacyAsset4, String str8, LegacyAsset legacyAsset5, LegacyAsset legacyAsset6, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : legacyAsset, (i & 2) != 0 ? null : legacyAsset2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : legacyAsset3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : legacyAsset4, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : legacyAsset5, (i & 8192) != 0 ? null : legacyAsset6, (i & 16384) != 0 ? null : num, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num2);
    }
}
