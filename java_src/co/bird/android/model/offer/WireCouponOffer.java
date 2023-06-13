package co.bird.android.model.offer;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003-./BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J_\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer;", "", "id", "", "explicitAccept", "", "expiresAt", "Lorg/joda/time/DateTime;", "action", "Lco/bird/android/model/offer/WireCouponOffer$Action;", "reward", "Lco/bird/android/model/offer/WireCouponOffer$Reward;", "ui", "Lco/bird/android/model/offer/WireCouponOffer$Ui;", "campaignId", "completedAt", "(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getAction", "()Lco/bird/android/model/offer/WireCouponOffer$Action;", "getCampaignId", "()Ljava/lang/String;", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getExpiresAt", "getExplicitAccept", "()Z", "getId", "getReward", "()Lco/bird/android/model/offer/WireCouponOffer$Reward;", "getUi", "()Lco/bird/android/model/offer/WireCouponOffer$Ui;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", JsonDocumentFields.ACTION, "Reward", "Ui", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponOffer {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final Action action;
    @JsonProperty("campaign_id")
    @InterfaceC41208ft5("campaign_id")
    private final String campaignId;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("needs_explicit_accept")
    @InterfaceC41208ft5("needs_explicit_accept")
    private final boolean explicitAccept;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66665id;
    @JsonProperty("reward")
    @InterfaceC41208ft5("reward")
    private final Reward reward;
    @JsonProperty("ui")
    @JsonAlias({"presentation"})
    @InterfaceC41208ft5(alternate = {"presentation"}, value = "ui")

    /* renamed from: ui */
    private final C16257Ui f66666ui;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer$Reward;", "", "amount", "", "currency", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lco/bird/android/model/offer/WireCouponOffer$Reward;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Reward {
        @JsonProperty("amount")
        @InterfaceC41208ft5("amount")
        private final Long amount;
        @JsonProperty("currency")
        @InterfaceC41208ft5("currency")
        private final String currency;

        public Reward(Long l, String str) {
            this.amount = l;
            this.currency = str;
        }

        public static /* synthetic */ Reward copy$default(Reward reward, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = reward.amount;
            }
            if ((i & 2) != 0) {
                str = reward.currency;
            }
            return reward.copy(l, str);
        }

        public final Long component1() {
            return this.amount;
        }

        public final String component2() {
            return this.currency;
        }

        public final Reward copy(Long l, String str) {
            return new Reward(l, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reward) {
                Reward reward = (Reward) obj;
                return Intrinsics.areEqual(this.amount, reward.amount) && Intrinsics.areEqual(this.currency, reward.currency);
            }
            return false;
        }

        public final Long getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            Long l = this.amount;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.currency;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Long l = this.amount;
            String str = this.currency;
            return "Reward(amount=" + l + ", currency=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer$Ui;", "", "bannerTitle", "", "bannerBody", "rideText", "endRideText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerBody", "()Ljava/lang/String;", "getBannerTitle", "getEndRideText", "getRideText", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.model.offer.WireCouponOffer$Ui */
    /* loaded from: classes4.dex */
    public static final class C16257Ui {
        @JsonProperty("banner_body")
        @InterfaceC41208ft5("banner_body")
        private final String bannerBody;
        @JsonProperty("banner_title")
        @InterfaceC41208ft5("banner_title")
        private final String bannerTitle;
        @JsonProperty("end_ride_text")
        @InterfaceC41208ft5("end_ride_text")
        private final String endRideText;
        @JsonProperty("ride_text")
        @InterfaceC41208ft5("ride_text")
        private final String rideText;

        public C16257Ui() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ C16257Ui copy$default(C16257Ui c16257Ui, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c16257Ui.bannerTitle;
            }
            if ((i & 2) != 0) {
                str2 = c16257Ui.bannerBody;
            }
            if ((i & 4) != 0) {
                str3 = c16257Ui.rideText;
            }
            if ((i & 8) != 0) {
                str4 = c16257Ui.endRideText;
            }
            return c16257Ui.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.bannerTitle;
        }

        public final String component2() {
            return this.bannerBody;
        }

        public final String component3() {
            return this.rideText;
        }

        public final String component4() {
            return this.endRideText;
        }

        public final C16257Ui copy(String str, String str2, String str3, String str4) {
            return new C16257Ui(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16257Ui) {
                C16257Ui c16257Ui = (C16257Ui) obj;
                return Intrinsics.areEqual(this.bannerTitle, c16257Ui.bannerTitle) && Intrinsics.areEqual(this.bannerBody, c16257Ui.bannerBody) && Intrinsics.areEqual(this.rideText, c16257Ui.rideText) && Intrinsics.areEqual(this.endRideText, c16257Ui.endRideText);
            }
            return false;
        }

        public final String getBannerBody() {
            return this.bannerBody;
        }

        public final String getBannerTitle() {
            return this.bannerTitle;
        }

        public final String getEndRideText() {
            return this.endRideText;
        }

        public final String getRideText() {
            return this.rideText;
        }

        public int hashCode() {
            String str = this.bannerTitle;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bannerBody;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.rideText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.endRideText;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.bannerTitle;
            String str2 = this.bannerBody;
            String str3 = this.rideText;
            String str4 = this.endRideText;
            return "Ui(bannerTitle=" + str + ", bannerBody=" + str2 + ", rideText=" + str3 + ", endRideText=" + str4 + ")";
        }

        public C16257Ui(String str, String str2, String str3, String str4) {
            this.bannerTitle = str;
            this.bannerBody = str2;
            this.rideText = str3;
            this.endRideText = str4;
        }

        public /* synthetic */ C16257Ui(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public WireCouponOffer(String id, boolean z, DateTime dateTime, Action action, Reward reward, C16257Ui ui, String str, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f66665id = id;
        this.explicitAccept = z;
        this.expiresAt = dateTime;
        this.action = action;
        this.reward = reward;
        this.f66666ui = ui;
        this.campaignId = str;
        this.completedAt = dateTime2;
    }

    public final String component1() {
        return this.f66665id;
    }

    public final boolean component2() {
        return this.explicitAccept;
    }

    public final DateTime component3() {
        return this.expiresAt;
    }

    public final Action component4() {
        return this.action;
    }

    public final Reward component5() {
        return this.reward;
    }

    public final C16257Ui component6() {
        return this.f66666ui;
    }

    public final String component7() {
        return this.campaignId;
    }

    public final DateTime component8() {
        return this.completedAt;
    }

    public final WireCouponOffer copy(String id, boolean z, DateTime dateTime, Action action, Reward reward, C16257Ui ui, String str, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(ui, "ui");
        return new WireCouponOffer(id, z, dateTime, action, reward, ui, str, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCouponOffer) {
            WireCouponOffer wireCouponOffer = (WireCouponOffer) obj;
            return Intrinsics.areEqual(this.f66665id, wireCouponOffer.f66665id) && this.explicitAccept == wireCouponOffer.explicitAccept && Intrinsics.areEqual(this.expiresAt, wireCouponOffer.expiresAt) && Intrinsics.areEqual(this.action, wireCouponOffer.action) && Intrinsics.areEqual(this.reward, wireCouponOffer.reward) && Intrinsics.areEqual(this.f66666ui, wireCouponOffer.f66666ui) && Intrinsics.areEqual(this.campaignId, wireCouponOffer.campaignId) && Intrinsics.areEqual(this.completedAt, wireCouponOffer.completedAt);
        }
        return false;
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean getExplicitAccept() {
        return this.explicitAccept;
    }

    public final String getId() {
        return this.f66665id;
    }

    public final Reward getReward() {
        return this.reward;
    }

    public final C16257Ui getUi() {
        return this.f66666ui;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66665id.hashCode() * 31;
        boolean z = this.explicitAccept;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        DateTime dateTime = this.expiresAt;
        int hashCode2 = (((((((i2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.action.hashCode()) * 31) + this.reward.hashCode()) * 31) + this.f66666ui.hashCode()) * 31;
        String str = this.campaignId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime2 = this.completedAt;
        return hashCode3 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66665id;
        boolean z = this.explicitAccept;
        DateTime dateTime = this.expiresAt;
        Action action = this.action;
        Reward reward = this.reward;
        C16257Ui c16257Ui = this.f66666ui;
        String str2 = this.campaignId;
        DateTime dateTime2 = this.completedAt;
        return "WireCouponOffer(id=" + str + ", explicitAccept=" + z + ", expiresAt=" + dateTime + ", action=" + action + ", reward=" + reward + ", ui=" + c16257Ui + ", campaignId=" + str2 + ", completedAt=" + dateTime2 + ")";
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J_\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer$Action;", "", "birdIds", "", "", "destinationIds", "destinationType", "needsCharge", "", "startOnBountyBird", "completeBy", "Lorg/joda/time/DateTime;", "kind", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLorg/joda/time/DateTime;Ljava/lang/String;)V", "getBirdIds", "()Ljava/util/List;", "getCompleteBy", "()Lorg/joda/time/DateTime;", "getDestinationIds", "getDestinationType", "()Ljava/lang/String;", "getKind", "getNeedsCharge", "()Z", "getStartOnBountyBird", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Action {
        @JsonProperty("bird_ids")
        @InterfaceC41208ft5("bird_ids")
        private final List<String> birdIds;
        @JsonProperty("complete_by")
        @InterfaceC41208ft5("complete_by")
        private final DateTime completeBy;
        @JsonProperty("destination_ids")
        @InterfaceC41208ft5("destination_ids")
        private final List<String> destinationIds;
        @JsonProperty("destination_type")
        @InterfaceC41208ft5("destination_type")
        private final String destinationType;
        @JsonProperty("kind")
        @InterfaceC41208ft5("kind")
        private final String kind;
        @JsonProperty("needs_charge")
        @InterfaceC41208ft5("needs_charge")
        private final boolean needsCharge;
        @JsonProperty("start_on_bounty_bird")
        @InterfaceC41208ft5("start_on_bounty_bird")
        private final boolean startOnBountyBird;

        public Action(List<String> birdIds, List<String> destinationIds, String destinationType, boolean z, boolean z2, DateTime dateTime, String str) {
            Intrinsics.checkNotNullParameter(birdIds, "birdIds");
            Intrinsics.checkNotNullParameter(destinationIds, "destinationIds");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            this.birdIds = birdIds;
            this.destinationIds = destinationIds;
            this.destinationType = destinationType;
            this.needsCharge = z;
            this.startOnBountyBird = z2;
            this.completeBy = dateTime;
            this.kind = str;
        }

        public static /* synthetic */ Action copy$default(Action action, List list, List list2, String str, boolean z, boolean z2, DateTime dateTime, String str2, int i, Object obj) {
            List<String> list3 = list;
            if ((i & 1) != 0) {
                list3 = action.birdIds;
            }
            List<String> list4 = list2;
            if ((i & 2) != 0) {
                list4 = action.destinationIds;
            }
            List list5 = list4;
            if ((i & 4) != 0) {
                str = action.destinationType;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                z = action.needsCharge;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = action.startOnBountyBird;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                dateTime = action.completeBy;
            }
            DateTime dateTime2 = dateTime;
            if ((i & 64) != 0) {
                str2 = action.kind;
            }
            return action.copy(list3, list5, str3, z3, z4, dateTime2, str2);
        }

        public final List<String> component1() {
            return this.birdIds;
        }

        public final List<String> component2() {
            return this.destinationIds;
        }

        public final String component3() {
            return this.destinationType;
        }

        public final boolean component4() {
            return this.needsCharge;
        }

        public final boolean component5() {
            return this.startOnBountyBird;
        }

        public final DateTime component6() {
            return this.completeBy;
        }

        public final String component7() {
            return this.kind;
        }

        public final Action copy(List<String> birdIds, List<String> destinationIds, String destinationType, boolean z, boolean z2, DateTime dateTime, String str) {
            Intrinsics.checkNotNullParameter(birdIds, "birdIds");
            Intrinsics.checkNotNullParameter(destinationIds, "destinationIds");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            return new Action(birdIds, destinationIds, destinationType, z, z2, dateTime, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Action) {
                Action action = (Action) obj;
                return Intrinsics.areEqual(this.birdIds, action.birdIds) && Intrinsics.areEqual(this.destinationIds, action.destinationIds) && Intrinsics.areEqual(this.destinationType, action.destinationType) && this.needsCharge == action.needsCharge && this.startOnBountyBird == action.startOnBountyBird && Intrinsics.areEqual(this.completeBy, action.completeBy) && Intrinsics.areEqual(this.kind, action.kind);
            }
            return false;
        }

        public final List<String> getBirdIds() {
            return this.birdIds;
        }

        public final DateTime getCompleteBy() {
            return this.completeBy;
        }

        public final List<String> getDestinationIds() {
            return this.destinationIds;
        }

        public final String getDestinationType() {
            return this.destinationType;
        }

        public final String getKind() {
            return this.kind;
        }

        public final boolean getNeedsCharge() {
            return this.needsCharge;
        }

        public final boolean getStartOnBountyBird() {
            return this.startOnBountyBird;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.birdIds.hashCode() * 31) + this.destinationIds.hashCode()) * 31) + this.destinationType.hashCode()) * 31;
            boolean z = this.needsCharge;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.startOnBountyBird;
            int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
            DateTime dateTime = this.completeBy;
            int hashCode2 = (i3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
            String str = this.kind;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            List<String> list = this.birdIds;
            List<String> list2 = this.destinationIds;
            String str = this.destinationType;
            boolean z = this.needsCharge;
            boolean z2 = this.startOnBountyBird;
            DateTime dateTime = this.completeBy;
            String str2 = this.kind;
            return "Action(birdIds=" + list + ", destinationIds=" + list2 + ", destinationType=" + str + ", needsCharge=" + z + ", startOnBountyBird=" + z2 + ", completeBy=" + dateTime + ", kind=" + str2 + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Action(List list, List list2, String str, boolean z, boolean z2, DateTime dateTime, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r2, r3, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : dateTime, (i & 64) != 0 ? null : str2);
            List list3;
            List list4;
            List emptyList;
            List emptyList2;
            if ((i & 1) != 0) {
                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                list3 = emptyList2;
            } else {
                list3 = list;
            }
            if ((i & 2) != 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                list4 = emptyList;
            } else {
                list4 = list2;
            }
        }
    }

    public /* synthetic */ WireCouponOffer(String str, boolean z, DateTime dateTime, Action action, Reward reward, C16257Ui c16257Ui, String str2, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dateTime, action, reward, c16257Ui, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : dateTime2);
    }
}
