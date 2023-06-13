package co.bird.android.model.offer;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponDeal;", "", "id", "", "action", "Lco/bird/android/model/offer/WireCouponDeal$Action;", "ui", "Lco/bird/android/model/offer/WireCouponDeal$Ui;", "completedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/offer/WireCouponDeal$Action;Lco/bird/android/model/offer/WireCouponDeal$Ui;Lorg/joda/time/DateTime;)V", "getAction", "()Lco/bird/android/model/offer/WireCouponDeal$Action;", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getUi", "()Lco/bird/android/model/offer/WireCouponDeal$Ui;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", JsonDocumentFields.ACTION, "Ui", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponDeal {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final Action action;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66663id;
    @JsonProperty("ui")
    @InterfaceC41208ft5("ui")

    /* renamed from: ui */
    private final C16256Ui f66664ui;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponDeal$Ui;", "", "bannerTitle", "", "bannerBody", "rideText", "endRideText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerBody", "()Ljava/lang/String;", "getBannerTitle", "getEndRideText", "getRideText", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.model.offer.WireCouponDeal$Ui */
    /* loaded from: classes4.dex */
    public static final class C16256Ui {
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

        public C16256Ui() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ C16256Ui copy$default(C16256Ui c16256Ui, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c16256Ui.bannerTitle;
            }
            if ((i & 2) != 0) {
                str2 = c16256Ui.bannerBody;
            }
            if ((i & 4) != 0) {
                str3 = c16256Ui.rideText;
            }
            if ((i & 8) != 0) {
                str4 = c16256Ui.endRideText;
            }
            return c16256Ui.copy(str, str2, str3, str4);
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

        public final C16256Ui copy(String str, String str2, String str3, String str4) {
            return new C16256Ui(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16256Ui) {
                C16256Ui c16256Ui = (C16256Ui) obj;
                return Intrinsics.areEqual(this.bannerTitle, c16256Ui.bannerTitle) && Intrinsics.areEqual(this.bannerBody, c16256Ui.bannerBody) && Intrinsics.areEqual(this.rideText, c16256Ui.rideText) && Intrinsics.areEqual(this.endRideText, c16256Ui.endRideText);
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

        public C16256Ui(String str, String str2, String str3, String str4) {
            this.bannerTitle = str;
            this.bannerBody = str2;
            this.rideText = str3;
            this.endRideText = str4;
        }

        public /* synthetic */ C16256Ui(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public WireCouponDeal(String id, Action action, C16256Ui ui, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f66663id = id;
        this.action = action;
        this.f66664ui = ui;
        this.completedAt = dateTime;
    }

    public static /* synthetic */ WireCouponDeal copy$default(WireCouponDeal wireCouponDeal, String str, Action action, C16256Ui c16256Ui, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireCouponDeal.f66663id;
        }
        if ((i & 2) != 0) {
            action = wireCouponDeal.action;
        }
        if ((i & 4) != 0) {
            c16256Ui = wireCouponDeal.f66664ui;
        }
        if ((i & 8) != 0) {
            dateTime = wireCouponDeal.completedAt;
        }
        return wireCouponDeal.copy(str, action, c16256Ui, dateTime);
    }

    public final String component1() {
        return this.f66663id;
    }

    public final Action component2() {
        return this.action;
    }

    public final C16256Ui component3() {
        return this.f66664ui;
    }

    public final DateTime component4() {
        return this.completedAt;
    }

    public final WireCouponDeal copy(String id, Action action, C16256Ui ui, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(ui, "ui");
        return new WireCouponDeal(id, action, ui, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCouponDeal) {
            WireCouponDeal wireCouponDeal = (WireCouponDeal) obj;
            return Intrinsics.areEqual(this.f66663id, wireCouponDeal.f66663id) && Intrinsics.areEqual(this.action, wireCouponDeal.action) && Intrinsics.areEqual(this.f66664ui, wireCouponDeal.f66664ui) && Intrinsics.areEqual(this.completedAt, wireCouponDeal.completedAt);
        }
        return false;
    }

    public final Action getAction() {
        return this.action;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final String getId() {
        return this.f66663id;
    }

    public final C16256Ui getUi() {
        return this.f66664ui;
    }

    public int hashCode() {
        int hashCode = ((((this.f66663id.hashCode() * 31) + this.action.hashCode()) * 31) + this.f66664ui.hashCode()) * 31;
        DateTime dateTime = this.completedAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66663id;
        Action action = this.action;
        C16256Ui c16256Ui = this.f66664ui;
        DateTime dateTime = this.completedAt;
        return "WireCouponDeal(id=" + str + ", action=" + action + ", ui=" + c16256Ui + ", completedAt=" + dateTime + ")";
    }

    public /* synthetic */ WireCouponDeal(String str, Action action, C16256Ui c16256Ui, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, action, c16256Ui, (i & 8) != 0 ? null : dateTime);
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponDeal$Action;", "", "birdIds", "", "", "destinationIds", "destinationType", "needsCharge", "", "startOnBountyBird", "completeBy", "Lorg/joda/time/DateTime;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLorg/joda/time/DateTime;)V", "getBirdIds", "()Ljava/util/List;", "getCompleteBy", "()Lorg/joda/time/DateTime;", "getDestinationIds", "getDestinationType", "()Ljava/lang/String;", "getNeedsCharge", "()Z", "getStartOnBountyBird", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        @JsonProperty("needs_charge")
        @InterfaceC41208ft5("needs_charge")
        private final boolean needsCharge;
        @JsonProperty("start_on_bounty_bird")
        @InterfaceC41208ft5("start_on_bounty_bird")
        private final boolean startOnBountyBird;

        public Action(List<String> birdIds, List<String> destinationIds, String destinationType, boolean z, boolean z2, DateTime dateTime) {
            Intrinsics.checkNotNullParameter(birdIds, "birdIds");
            Intrinsics.checkNotNullParameter(destinationIds, "destinationIds");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            this.birdIds = birdIds;
            this.destinationIds = destinationIds;
            this.destinationType = destinationType;
            this.needsCharge = z;
            this.startOnBountyBird = z2;
            this.completeBy = dateTime;
        }

        public static /* synthetic */ Action copy$default(Action action, List list, List list2, String str, boolean z, boolean z2, DateTime dateTime, int i, Object obj) {
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
            String str2 = str;
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
            return action.copy(list3, list5, str2, z3, z4, dateTime);
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

        public final Action copy(List<String> birdIds, List<String> destinationIds, String destinationType, boolean z, boolean z2, DateTime dateTime) {
            Intrinsics.checkNotNullParameter(birdIds, "birdIds");
            Intrinsics.checkNotNullParameter(destinationIds, "destinationIds");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            return new Action(birdIds, destinationIds, destinationType, z, z2, dateTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Action) {
                Action action = (Action) obj;
                return Intrinsics.areEqual(this.birdIds, action.birdIds) && Intrinsics.areEqual(this.destinationIds, action.destinationIds) && Intrinsics.areEqual(this.destinationType, action.destinationType) && this.needsCharge == action.needsCharge && this.startOnBountyBird == action.startOnBountyBird && Intrinsics.areEqual(this.completeBy, action.completeBy);
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
            return i3 + (dateTime == null ? 0 : dateTime.hashCode());
        }

        public String toString() {
            List<String> list = this.birdIds;
            List<String> list2 = this.destinationIds;
            String str = this.destinationType;
            boolean z = this.needsCharge;
            boolean z2 = this.startOnBountyBird;
            DateTime dateTime = this.completeBy;
            return "Action(birdIds=" + list + ", destinationIds=" + list2 + ", destinationType=" + str + ", needsCharge=" + z + ", startOnBountyBird=" + z2 + ", completeBy=" + dateTime + ")";
        }

        public /* synthetic */ Action(List list, List list2, String str, boolean z, boolean z2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : dateTime);
        }
    }
}
