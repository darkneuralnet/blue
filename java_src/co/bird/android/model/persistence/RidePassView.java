package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RidePassViewIneligibleReason;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B·\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010&J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001dHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÌ\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020=2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020\u0016HÖ\u0001J\t\u0010v\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b<\u0010>R\u0011\u0010?\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0011\u0010@\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0011\u0010A\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bA\u0010>R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0011\u0010D\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bE\u0010>R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bF\u00108R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bI\u00108R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010(R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010(R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010(¨\u0006w"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "", "id", "", "linkCode", "", "userRidePassId", "price", "priceTax", "previousPrice", "currency", "bannerImageUrl", "bannerAction", "title", "zendeskArticleId", "confirmationToast", "label", "status", "Lco/bird/android/model/constant/RidePassViewStatus;", "ineligibleReason", "Lco/bird/android/model/constant/RidePassViewIneligibleReason;", "remainingDeviceTransferCount", "", "cancelArticleId", "footer", "detailBody", "detailImageUrl", "detailAction", "detailBodyList", "", "detailFooter", "subscriptionPlan", "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;", "userSubscription", "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;", "createdAt", "Lorg/joda/time/DateTime;", "expiresAt", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBannerAction", "()Ljava/lang/String;", "getBannerImageUrl", "getCancelArticleId", "getConfirmationToast", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "getDetailAction", "getDetailBody", "getDetailBodyList", "()Ljava/util/List;", "getDetailFooter", "getDetailImageUrl", "getExpiresAt", "getFooter", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIneligibleReason", "()Lco/bird/android/model/constant/RidePassViewIneligibleReason;", "isActive", "", "()Z", "isAvailable", "isIneligible", "isPurchased", "getLabel", "getLinkCode", "needsDeviceTransfer", "getNeedsDeviceTransfer", "getPreviousPrice", "getPrice", "()J", "getPriceTax", "getRemainingDeviceTransferCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lco/bird/android/model/constant/RidePassViewStatus;", "getSubscriptionPlan", "()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;", "getTitle", "getUserRidePassId", "getUserSubscription", "()Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;", "getZendeskArticleId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/RidePassView;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RidePassView {
    private final String bannerAction;
    private final String bannerImageUrl;
    private final String cancelArticleId;
    private final String confirmationToast;
    private final DateTime createdAt;
    private final String currency;
    private final String detailAction;
    private final String detailBody;
    private final List<String> detailBodyList;
    private final String detailFooter;
    private final String detailImageUrl;
    private final DateTime expiresAt;
    private final String footer;

    /* renamed from: id */
    private final Long f66687id;
    private final RidePassViewIneligibleReason ineligibleReason;
    private final String label;
    private final String linkCode;
    private final Long previousPrice;
    private final long price;
    private final Long priceTax;
    private final Integer remainingDeviceTransferCount;
    private final RidePassViewStatus status;
    private final RidePassSubscriptionPlanView subscriptionPlan;
    private final String title;
    private final String userRidePassId;
    private final RidePassUserSubscriptionView userSubscription;
    private final String zendeskArticleId;

    public RidePassView(Long l, String linkCode, String str, long j, Long l2, Long l3, String currency, String str2, String str3, String title, String zendeskArticleId, String str4, String str5, RidePassViewStatus ridePassViewStatus, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str6, String str7, String detailBody, String str8, String str9, List<String> list, String str10, RidePassSubscriptionPlanView ridePassSubscriptionPlanView, RidePassUserSubscriptionView ridePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zendeskArticleId, "zendeskArticleId");
        Intrinsics.checkNotNullParameter(detailBody, "detailBody");
        this.f66687id = l;
        this.linkCode = linkCode;
        this.userRidePassId = str;
        this.price = j;
        this.priceTax = l2;
        this.previousPrice = l3;
        this.currency = currency;
        this.bannerImageUrl = str2;
        this.bannerAction = str3;
        this.title = title;
        this.zendeskArticleId = zendeskArticleId;
        this.confirmationToast = str4;
        this.label = str5;
        this.status = ridePassViewStatus;
        this.ineligibleReason = ridePassViewIneligibleReason;
        this.remainingDeviceTransferCount = num;
        this.cancelArticleId = str6;
        this.footer = str7;
        this.detailBody = detailBody;
        this.detailImageUrl = str8;
        this.detailAction = str9;
        this.detailBodyList = list;
        this.detailFooter = str10;
        this.subscriptionPlan = ridePassSubscriptionPlanView;
        this.userSubscription = ridePassUserSubscriptionView;
        this.createdAt = dateTime;
        this.expiresAt = dateTime2;
    }

    public final Long component1() {
        return this.f66687id;
    }

    public final String component10() {
        return this.title;
    }

    public final String component11() {
        return this.zendeskArticleId;
    }

    public final String component12() {
        return this.confirmationToast;
    }

    public final String component13() {
        return this.label;
    }

    public final RidePassViewStatus component14() {
        return this.status;
    }

    public final RidePassViewIneligibleReason component15() {
        return this.ineligibleReason;
    }

    public final Integer component16() {
        return this.remainingDeviceTransferCount;
    }

    public final String component17() {
        return this.cancelArticleId;
    }

    public final String component18() {
        return this.footer;
    }

    public final String component19() {
        return this.detailBody;
    }

    public final String component2() {
        return this.linkCode;
    }

    public final String component20() {
        return this.detailImageUrl;
    }

    public final String component21() {
        return this.detailAction;
    }

    public final List<String> component22() {
        return this.detailBodyList;
    }

    public final String component23() {
        return this.detailFooter;
    }

    public final RidePassSubscriptionPlanView component24() {
        return this.subscriptionPlan;
    }

    public final RidePassUserSubscriptionView component25() {
        return this.userSubscription;
    }

    public final DateTime component26() {
        return this.createdAt;
    }

    public final DateTime component27() {
        return this.expiresAt;
    }

    public final String component3() {
        return this.userRidePassId;
    }

    public final long component4() {
        return this.price;
    }

    public final Long component5() {
        return this.priceTax;
    }

    public final Long component6() {
        return this.previousPrice;
    }

    public final String component7() {
        return this.currency;
    }

    public final String component8() {
        return this.bannerImageUrl;
    }

    public final String component9() {
        return this.bannerAction;
    }

    public final RidePassView copy(Long l, String linkCode, String str, long j, Long l2, Long l3, String currency, String str2, String str3, String title, String zendeskArticleId, String str4, String str5, RidePassViewStatus ridePassViewStatus, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str6, String str7, String detailBody, String str8, String str9, List<String> list, String str10, RidePassSubscriptionPlanView ridePassSubscriptionPlanView, RidePassUserSubscriptionView ridePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zendeskArticleId, "zendeskArticleId");
        Intrinsics.checkNotNullParameter(detailBody, "detailBody");
        return new RidePassView(l, linkCode, str, j, l2, l3, currency, str2, str3, title, zendeskArticleId, str4, str5, ridePassViewStatus, ridePassViewIneligibleReason, num, str6, str7, detailBody, str8, str9, list, str10, ridePassSubscriptionPlanView, ridePassUserSubscriptionView, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RidePassView) {
            RidePassView ridePassView = (RidePassView) obj;
            return Intrinsics.areEqual(this.f66687id, ridePassView.f66687id) && Intrinsics.areEqual(this.linkCode, ridePassView.linkCode) && Intrinsics.areEqual(this.userRidePassId, ridePassView.userRidePassId) && this.price == ridePassView.price && Intrinsics.areEqual(this.priceTax, ridePassView.priceTax) && Intrinsics.areEqual(this.previousPrice, ridePassView.previousPrice) && Intrinsics.areEqual(this.currency, ridePassView.currency) && Intrinsics.areEqual(this.bannerImageUrl, ridePassView.bannerImageUrl) && Intrinsics.areEqual(this.bannerAction, ridePassView.bannerAction) && Intrinsics.areEqual(this.title, ridePassView.title) && Intrinsics.areEqual(this.zendeskArticleId, ridePassView.zendeskArticleId) && Intrinsics.areEqual(this.confirmationToast, ridePassView.confirmationToast) && Intrinsics.areEqual(this.label, ridePassView.label) && this.status == ridePassView.status && this.ineligibleReason == ridePassView.ineligibleReason && Intrinsics.areEqual(this.remainingDeviceTransferCount, ridePassView.remainingDeviceTransferCount) && Intrinsics.areEqual(this.cancelArticleId, ridePassView.cancelArticleId) && Intrinsics.areEqual(this.footer, ridePassView.footer) && Intrinsics.areEqual(this.detailBody, ridePassView.detailBody) && Intrinsics.areEqual(this.detailImageUrl, ridePassView.detailImageUrl) && Intrinsics.areEqual(this.detailAction, ridePassView.detailAction) && Intrinsics.areEqual(this.detailBodyList, ridePassView.detailBodyList) && Intrinsics.areEqual(this.detailFooter, ridePassView.detailFooter) && Intrinsics.areEqual(this.subscriptionPlan, ridePassView.subscriptionPlan) && Intrinsics.areEqual(this.userSubscription, ridePassView.userSubscription) && Intrinsics.areEqual(this.createdAt, ridePassView.createdAt) && Intrinsics.areEqual(this.expiresAt, ridePassView.expiresAt);
        }
        return false;
    }

    public final String getBannerAction() {
        return this.bannerAction;
    }

    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final String getCancelArticleId() {
        return this.cancelArticleId;
    }

    public final String getConfirmationToast() {
        return this.confirmationToast;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDetailAction() {
        return this.detailAction;
    }

    public final String getDetailBody() {
        return this.detailBody;
    }

    public final List<String> getDetailBodyList() {
        return this.detailBodyList;
    }

    public final String getDetailFooter() {
        return this.detailFooter;
    }

    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final Long getId() {
        return this.f66687id;
    }

    public final RidePassViewIneligibleReason getIneligibleReason() {
        return this.ineligibleReason;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public final boolean getNeedsDeviceTransfer() {
        return isIneligible() && this.ineligibleReason == RidePassViewIneligibleReason.INELIGIBLE_DEVICE;
    }

    public final Long getPreviousPrice() {
        return this.previousPrice;
    }

    public final long getPrice() {
        return this.price;
    }

    public final Long getPriceTax() {
        return this.priceTax;
    }

    public final Integer getRemainingDeviceTransferCount() {
        return this.remainingDeviceTransferCount;
    }

    public final RidePassViewStatus getStatus() {
        return this.status;
    }

    public final RidePassSubscriptionPlanView getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserRidePassId() {
        return this.userRidePassId;
    }

    public final RidePassUserSubscriptionView getUserSubscription() {
        return this.userSubscription;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        Long l = this.f66687id;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.linkCode.hashCode()) * 31;
        String str = this.userRidePassId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.price)) * 31;
        Long l2 = this.priceTax;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.previousPrice;
        int hashCode4 = (((hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.currency.hashCode()) * 31;
        String str2 = this.bannerImageUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerAction;
        int hashCode6 = (((((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.title.hashCode()) * 31) + this.zendeskArticleId.hashCode()) * 31;
        String str4 = this.confirmationToast;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.label;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RidePassViewStatus ridePassViewStatus = this.status;
        int hashCode9 = (hashCode8 + (ridePassViewStatus == null ? 0 : ridePassViewStatus.hashCode())) * 31;
        RidePassViewIneligibleReason ridePassViewIneligibleReason = this.ineligibleReason;
        int hashCode10 = (hashCode9 + (ridePassViewIneligibleReason == null ? 0 : ridePassViewIneligibleReason.hashCode())) * 31;
        Integer num = this.remainingDeviceTransferCount;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.cancelArticleId;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.footer;
        int hashCode13 = (((hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.detailBody.hashCode()) * 31;
        String str8 = this.detailImageUrl;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.detailAction;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.detailBodyList;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.detailFooter;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        RidePassSubscriptionPlanView ridePassSubscriptionPlanView = this.subscriptionPlan;
        int hashCode18 = (hashCode17 + (ridePassSubscriptionPlanView == null ? 0 : ridePassSubscriptionPlanView.hashCode())) * 31;
        RidePassUserSubscriptionView ridePassUserSubscriptionView = this.userSubscription;
        int hashCode19 = (hashCode18 + (ridePassUserSubscriptionView == null ? 0 : ridePassUserSubscriptionView.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode20 = (hashCode19 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expiresAt;
        return hashCode20 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.status == RidePassViewStatus.ACTIVE;
    }

    public final boolean isAvailable() {
        return this.status == RidePassViewStatus.AVAILABLE;
    }

    public final boolean isIneligible() {
        return this.status == RidePassViewStatus.INELIGIBLE;
    }

    public final boolean isPurchased() {
        return isActive() || isIneligible();
    }

    public String toString() {
        Long l = this.f66687id;
        String str = this.linkCode;
        String str2 = this.userRidePassId;
        long j = this.price;
        Long l2 = this.priceTax;
        Long l3 = this.previousPrice;
        String str3 = this.currency;
        String str4 = this.bannerImageUrl;
        String str5 = this.bannerAction;
        String str6 = this.title;
        String str7 = this.zendeskArticleId;
        String str8 = this.confirmationToast;
        String str9 = this.label;
        RidePassViewStatus ridePassViewStatus = this.status;
        RidePassViewIneligibleReason ridePassViewIneligibleReason = this.ineligibleReason;
        Integer num = this.remainingDeviceTransferCount;
        String str10 = this.cancelArticleId;
        String str11 = this.footer;
        String str12 = this.detailBody;
        String str13 = this.detailImageUrl;
        String str14 = this.detailAction;
        List<String> list = this.detailBodyList;
        String str15 = this.detailFooter;
        RidePassSubscriptionPlanView ridePassSubscriptionPlanView = this.subscriptionPlan;
        RidePassUserSubscriptionView ridePassUserSubscriptionView = this.userSubscription;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.expiresAt;
        return "RidePassView(id=" + l + ", linkCode=" + str + ", userRidePassId=" + str2 + ", price=" + j + ", priceTax=" + l2 + ", previousPrice=" + l3 + ", currency=" + str3 + ", bannerImageUrl=" + str4 + ", bannerAction=" + str5 + ", title=" + str6 + ", zendeskArticleId=" + str7 + ", confirmationToast=" + str8 + ", label=" + str9 + ", status=" + ridePassViewStatus + ", ineligibleReason=" + ridePassViewIneligibleReason + ", remainingDeviceTransferCount=" + num + ", cancelArticleId=" + str10 + ", footer=" + str11 + ", detailBody=" + str12 + ", detailImageUrl=" + str13 + ", detailAction=" + str14 + ", detailBodyList=" + list + ", detailFooter=" + str15 + ", subscriptionPlan=" + ridePassSubscriptionPlanView + ", userSubscription=" + ridePassUserSubscriptionView + ", createdAt=" + dateTime + ", expiresAt=" + dateTime2 + ")";
    }

    public /* synthetic */ RidePassView(Long l, String str, String str2, long j, Long l2, Long l3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RidePassViewStatus ridePassViewStatus, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str10, String str11, String str12, String str13, String str14, List list, String str15, RidePassSubscriptionPlanView ridePassSubscriptionPlanView, RidePassUserSubscriptionView ridePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, str, (i & 4) != 0 ? null : str2, j, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, str6, str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : ridePassViewStatus, (i & 16384) != 0 ? null : ridePassViewIneligibleReason, (32768 & i) != 0 ? null : num, (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? null : str11, str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : list, (4194304 & i) != 0 ? null : str15, (8388608 & i) != 0 ? null : ridePassSubscriptionPlanView, (16777216 & i) != 0 ? null : ridePassUserSubscriptionView, (33554432 & i) != 0 ? null : dateTime, (i & 67108864) != 0 ? null : dateTime2);
    }
}
