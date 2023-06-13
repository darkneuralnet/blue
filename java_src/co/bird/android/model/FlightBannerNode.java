package co.bird.android.model;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.uber.autodispose.ScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003)*+Bt\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J$\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J;\u0010!\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eHÆ\u0003J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00072:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010\u001d\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u001cHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014RC\u0010\r\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/FlightBannerNode;", "", "banner", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", "priority", "Lco/bird/android/model/FlightBannerNode$BannerPriority;", "view", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "presenterFactory", "Lkotlin/Function2;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", "(Lco/bird/android/model/FlightBannerNode$FlightBanner;Lco/bird/android/model/FlightBannerNode$BannerPriority;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getBanner", "()Lco/bird/android/model/FlightBannerNode$FlightBanner;", "getPresenterFactory", "()Lkotlin/jvm/functions/Function2;", "getPriority", "()Lco/bird/android/model/FlightBannerNode$BannerPriority;", "getView", "()Lkotlin/jvm/functions/Function1;", "compareTo", "", LegacyRepairType.OTHER_KEY, "component1", "component2", "component3", "component4", "copy", "equals", "", "", "hashCode", "toString", "", "BannerPriority", "FlightBanner", "RiderBarType", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFlightBannerNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerNode.kt\nco/bird/android/model/FlightBannerNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes4.dex */
public final class FlightBannerNode implements Comparable<FlightBannerNode> {
    private final FlightBanner banner;
    private final Function2<View, ScopeProvider, co.bird.android.model.FlightBanner> presenterFactory;
    private final BannerPriority priority;
    private final Function1<Context, View> view;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "Lcom/uber/autodispose/ScopeProvider;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.model.FlightBannerNode$1 */
    /* loaded from: classes4.dex */
    public static final class C162521 extends Lambda implements Function2 {
        public static final C162521 INSTANCE = new C162521();

        public C162521() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Void invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/FlightBannerNode$BannerPriority;", "", "(Ljava/lang/String;I)V", "SYSTEM_BANNER", "USER_INTERACTION_IN_SELECTED_STATE_BANNER", "USER_INTERACTION_BANNER", "PERSISTENT_LOCATION_BASED_BANNER", "DISMISSABLE_BANNER", "PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER", "NON_LOCATION_PERSISTENT_BANNER", "UNKNOWN", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum BannerPriority {
        SYSTEM_BANNER,
        USER_INTERACTION_IN_SELECTED_STATE_BANNER,
        USER_INTERACTION_BANNER,
        PERSISTENT_LOCATION_BASED_BANNER,
        DISMISSABLE_BANNER,
        PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER,
        NON_LOCATION_PERSISTENT_BANNER,
        UNKNOWN
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/FlightBannerNode$FlightBanner;", "", "(Ljava/lang/String;I)V", "ANNOUNCEMENT", "BIRD_PAY_PROMO", "DESIGNATED_PARKING_AREA", "PARKING_SUCCESS", "PARKING_CLOSE_TO_NEST", "END_RIDE_IN_PARKING_NEST", "PARKING_NEST", "COUPON_DISPLAY", "BIRD_PLUS", "DEAL", "RIDE_PASS", "MERCHANT_SITE_INFO", "ONBOARDING_START", "ONBOARDING_IN_PROGRESS", "QUICK_START_BIRD_SELECTED", "QUICK_START_BIRD_UNSELECTED", "RESERVATION_IN_PROGRESS", "RESERVATION_BEFORE", "SELECTED_BIRD_RIDE_PRICE", "RIDER_BAR_BLUETOOTH_DISABLED", "RIDER_BAR_END_RIDE_LOCK_PHOTO_REQUIRED", "RIDER_BAR_LOCATION_SERVICES_DISABLED", "RIDE_START_OUTSIDE_OPERATING_AREA", "RIDE_START_IN_NO_RIDE_AREA", "TOAST", "UNKNOWN", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum FlightBanner {
        ANNOUNCEMENT,
        BIRD_PAY_PROMO,
        DESIGNATED_PARKING_AREA,
        PARKING_SUCCESS,
        PARKING_CLOSE_TO_NEST,
        END_RIDE_IN_PARKING_NEST,
        PARKING_NEST,
        COUPON_DISPLAY,
        BIRD_PLUS,
        DEAL,
        RIDE_PASS,
        MERCHANT_SITE_INFO,
        ONBOARDING_START,
        ONBOARDING_IN_PROGRESS,
        QUICK_START_BIRD_SELECTED,
        QUICK_START_BIRD_UNSELECTED,
        RESERVATION_IN_PROGRESS,
        RESERVATION_BEFORE,
        SELECTED_BIRD_RIDE_PRICE,
        RIDER_BAR_BLUETOOTH_DISABLED,
        RIDER_BAR_END_RIDE_LOCK_PHOTO_REQUIRED,
        RIDER_BAR_LOCATION_SERVICES_DISABLED,
        RIDE_START_OUTSIDE_OPERATING_AREA,
        RIDE_START_IN_NO_RIDE_AREA,
        TOAST,
        UNKNOWN
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightBannerNode(FlightBanner banner, BannerPriority priority, Function1<? super Context, ? extends View> view, Function2<? super View, ? super ScopeProvider, ? extends co.bird.android.model.FlightBanner> presenterFactory) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        this.banner = banner;
        this.priority = priority;
        this.view = view;
        this.presenterFactory = presenterFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightBannerNode copy$default(FlightBannerNode flightBannerNode, FlightBanner flightBanner, BannerPriority bannerPriority, Function1 function1, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            flightBanner = flightBannerNode.banner;
        }
        if ((i & 2) != 0) {
            bannerPriority = flightBannerNode.priority;
        }
        if ((i & 4) != 0) {
            function1 = flightBannerNode.view;
        }
        if ((i & 8) != 0) {
            function2 = flightBannerNode.presenterFactory;
        }
        return flightBannerNode.copy(flightBanner, bannerPriority, function1, function2);
    }

    public final FlightBanner component1() {
        return this.banner;
    }

    public final BannerPriority component2() {
        return this.priority;
    }

    public final Function1<Context, View> component3() {
        return this.view;
    }

    public final Function2<View, ScopeProvider, co.bird.android.model.FlightBanner> component4() {
        return this.presenterFactory;
    }

    public final FlightBannerNode copy(FlightBanner banner, BannerPriority priority, Function1<? super Context, ? extends View> view, Function2<? super View, ? super ScopeProvider, ? extends co.bird.android.model.FlightBanner> presenterFactory) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        return new FlightBannerNode(banner, priority, view, presenterFactory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightBannerNode) {
            FlightBannerNode flightBannerNode = (FlightBannerNode) obj;
            return this.banner == flightBannerNode.banner && this.priority == flightBannerNode.priority && Intrinsics.areEqual(this.view, flightBannerNode.view) && Intrinsics.areEqual(this.presenterFactory, flightBannerNode.presenterFactory);
        }
        return false;
    }

    public final FlightBanner getBanner() {
        return this.banner;
    }

    public final Function2<View, ScopeProvider, co.bird.android.model.FlightBanner> getPresenterFactory() {
        return this.presenterFactory;
    }

    public final BannerPriority getPriority() {
        return this.priority;
    }

    public final Function1<Context, View> getView() {
        return this.view;
    }

    public int hashCode() {
        return (((((this.banner.hashCode() * 31) + this.priority.hashCode()) * 31) + this.view.hashCode()) * 31) + this.presenterFactory.hashCode();
    }

    public String toString() {
        FlightBanner flightBanner = this.banner;
        BannerPriority bannerPriority = this.priority;
        Function1<Context, View> function1 = this.view;
        Function2<View, ScopeProvider, co.bird.android.model.FlightBanner> function2 = this.presenterFactory;
        return "FlightBannerNode(banner=" + flightBanner + ", priority=" + bannerPriority + ", view=" + function1 + ", presenterFactory=" + function2 + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(FlightBannerNode other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Integer valueOf = Integer.valueOf(this.priority.ordinal() - other.priority.ordinal());
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.banner.ordinal() - other.banner.ordinal();
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/FlightBannerNode$RiderBarType;", "", "iconRes", "", "titleText", "bodyText", "(Ljava/lang/String;ILjava/lang/Integer;II)V", "getBodyText", "()I", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleText", "IN_NO_RIDE_AREA", "BLUETOOTH_DISABLED", "END_RIDE_LOCK_PHOTO_REQUIRED", "LOCATION_SERVICES_DISABLED", "FLYER_PROMOTION", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum RiderBarType {
        IN_NO_RIDE_AREA(Integer.valueOf(C48193rg4.ic_rider_bar_outside_service_area), C45871nl4.rider_bar_inside_no_ride_area_title, C45871nl4.rider_bar_inside_no_ride_area_body),
        BLUETOOTH_DISABLED(Integer.valueOf(C48193rg4.ic_rider_bar_bluetooth_disabled), C45871nl4.rider_bar_bluetooth_disabled_title, C45871nl4.rider_bar_bluetooth_disabled_body),
        END_RIDE_LOCK_PHOTO_REQUIRED(Integer.valueOf(C48193rg4.ic_rider_bar_physical_lock_red), C45871nl4.rider_bar_ride_lock_photo_required_title, C45871nl4.rider_bar_ride_lock_photo_required_body),
        LOCATION_SERVICES_DISABLED(Integer.valueOf(C48193rg4.ic_rider_bar_location_services_off), C45871nl4.rider_bar_location_services_disabled_title, C45871nl4.rider_bar_location_services_disabled_body),
        FLYER_PROMOTION(Integer.valueOf(C48193rg4.ic_filled_flyer_logo), C45871nl4.rider_bar_flyer_promotion_title, C45871nl4.rider_bar_flyer_promotion_body);
        
        private final int bodyText;
        private final Integer iconRes;
        private final int titleText;

        RiderBarType(Integer num, int i, int i2) {
            this.iconRes = num;
            this.titleText = i;
            this.bodyText = i2;
        }

        public final int getBodyText() {
            return this.bodyText;
        }

        public final Integer getIconRes() {
            return this.iconRes;
        }

        public final int getTitleText() {
            return this.titleText;
        }

        /* synthetic */ RiderBarType(Integer num, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? C46464ol4.empty : i, (i3 & 4) != 0 ? C46464ol4.empty : i2);
        }
    }

    public /* synthetic */ FlightBannerNode(FlightBanner flightBanner, BannerPriority bannerPriority, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(flightBanner, bannerPriority, function1, (i & 8) != 0 ? C162521.INSTANCE : function2);
    }
}
