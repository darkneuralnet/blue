package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u008c\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00064"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "", "id", "", "codename", "priceAmount", "", "priceAmountTax", "currency", "zendeskArticleId", "legalMessage", "display", "Lco/bird/android/model/persistence/BirdPlusDisplayView;", "trial", "Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;", "perks", "", "Lco/bird/android/model/persistence/BirdPlusPerkView;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusDisplayView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;Ljava/util/List;)V", "getCodename", "()Ljava/lang/String;", "getCurrency", "getDisplay", "()Lco/bird/android/model/persistence/BirdPlusDisplayView;", "getId", "getLegalMessage", "getPerks", "()Ljava/util/List;", "getPriceAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriceAmountTax", "getTrial", "()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;", "getZendeskArticleId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusDisplayView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;Ljava/util/List;)Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusSubscriptionPlanView {
    @JsonProperty("codename")
    @InterfaceC41208ft5("codename")
    private final String codename;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final BirdPlusDisplayView display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66672id;
    @JsonProperty("legal_message")
    @InterfaceC41208ft5("legal_message")
    private final String legalMessage;
    @JsonProperty("perks")
    @InterfaceC41208ft5("perks")
    private final List<BirdPlusPerkView> perks;
    @JsonProperty("price_amount")
    @InterfaceC41208ft5("price_amount")
    private final Integer priceAmount;
    @JsonProperty("price_amount_tax")
    @InterfaceC41208ft5("price_amount_tax")
    private final Integer priceAmountTax;
    @JsonProperty("trial")
    @InterfaceC41208ft5("trial")
    private final BirdPlusSubcriptionPlanTrialView trial;
    @JsonProperty("zendesk_article_id")
    @InterfaceC41208ft5("zendesk_article_id")
    private final String zendeskArticleId;

    public BirdPlusSubscriptionPlanView() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66672id;
    }

    public final List<BirdPlusPerkView> component10() {
        return this.perks;
    }

    public final String component2() {
        return this.codename;
    }

    public final Integer component3() {
        return this.priceAmount;
    }

    public final Integer component4() {
        return this.priceAmountTax;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.zendeskArticleId;
    }

    public final String component7() {
        return this.legalMessage;
    }

    public final BirdPlusDisplayView component8() {
        return this.display;
    }

    public final BirdPlusSubcriptionPlanTrialView component9() {
        return this.trial;
    }

    public final BirdPlusSubscriptionPlanView copy(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, BirdPlusDisplayView birdPlusDisplayView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView, List<BirdPlusPerkView> list) {
        return new BirdPlusSubscriptionPlanView(str, str2, num, num2, str3, str4, str5, birdPlusDisplayView, birdPlusSubcriptionPlanTrialView, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusSubscriptionPlanView) {
            BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView = (BirdPlusSubscriptionPlanView) obj;
            return Intrinsics.areEqual(this.f66672id, birdPlusSubscriptionPlanView.f66672id) && Intrinsics.areEqual(this.codename, birdPlusSubscriptionPlanView.codename) && Intrinsics.areEqual(this.priceAmount, birdPlusSubscriptionPlanView.priceAmount) && Intrinsics.areEqual(this.priceAmountTax, birdPlusSubscriptionPlanView.priceAmountTax) && Intrinsics.areEqual(this.currency, birdPlusSubscriptionPlanView.currency) && Intrinsics.areEqual(this.zendeskArticleId, birdPlusSubscriptionPlanView.zendeskArticleId) && Intrinsics.areEqual(this.legalMessage, birdPlusSubscriptionPlanView.legalMessage) && Intrinsics.areEqual(this.display, birdPlusSubscriptionPlanView.display) && Intrinsics.areEqual(this.trial, birdPlusSubscriptionPlanView.trial) && Intrinsics.areEqual(this.perks, birdPlusSubscriptionPlanView.perks);
        }
        return false;
    }

    public final String getCodename() {
        return this.codename;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BirdPlusDisplayView getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66672id;
    }

    public final String getLegalMessage() {
        return this.legalMessage;
    }

    public final List<BirdPlusPerkView> getPerks() {
        return this.perks;
    }

    public final Integer getPriceAmount() {
        return this.priceAmount;
    }

    public final Integer getPriceAmountTax() {
        return this.priceAmountTax;
    }

    public final BirdPlusSubcriptionPlanTrialView getTrial() {
        return this.trial;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        String str = this.f66672id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.codename;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.priceAmount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceAmountTax;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zendeskArticleId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.legalMessage;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BirdPlusDisplayView birdPlusDisplayView = this.display;
        int hashCode8 = (hashCode7 + (birdPlusDisplayView == null ? 0 : birdPlusDisplayView.hashCode())) * 31;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView = this.trial;
        int hashCode9 = (hashCode8 + (birdPlusSubcriptionPlanTrialView == null ? 0 : birdPlusSubcriptionPlanTrialView.hashCode())) * 31;
        List<BirdPlusPerkView> list = this.perks;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66672id;
        String str2 = this.codename;
        Integer num = this.priceAmount;
        Integer num2 = this.priceAmountTax;
        String str3 = this.currency;
        String str4 = this.zendeskArticleId;
        String str5 = this.legalMessage;
        BirdPlusDisplayView birdPlusDisplayView = this.display;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView = this.trial;
        List<BirdPlusPerkView> list = this.perks;
        return "BirdPlusSubscriptionPlanView(id=" + str + ", codename=" + str2 + ", priceAmount=" + num + ", priceAmountTax=" + num2 + ", currency=" + str3 + ", zendeskArticleId=" + str4 + ", legalMessage=" + str5 + ", display=" + birdPlusDisplayView + ", trial=" + birdPlusSubcriptionPlanTrialView + ", perks=" + list + ")";
    }

    public BirdPlusSubscriptionPlanView(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, BirdPlusDisplayView birdPlusDisplayView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView, List<BirdPlusPerkView> list) {
        this.f66672id = str;
        this.codename = str2;
        this.priceAmount = num;
        this.priceAmountTax = num2;
        this.currency = str3;
        this.zendeskArticleId = str4;
        this.legalMessage = str5;
        this.display = birdPlusDisplayView;
        this.trial = birdPlusSubcriptionPlanTrialView;
        this.perks = list;
    }

    public /* synthetic */ BirdPlusSubscriptionPlanView(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, BirdPlusDisplayView birdPlusDisplayView, BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : birdPlusDisplayView, (i & 256) != 0 ? null : birdPlusSubcriptionPlanTrialView, (i & 512) == 0 ? list : null);
    }
}
