package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.ridedetail.widget.RideSummaryWithReceiptView;
import co.bird.android.app.feature.ridedetail.widget.RouteMapBehavior;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireBirdTrack;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideTransaction;
import co.bird.android.model.wire.WireRideTransactionItem;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u001f\u0012\u0006\u0010\\\u001a\u00020[\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u001e\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J(\u0010$\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0011H\u0016J\u001e\u0010(\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010'\u001a\u00020!H\u0016J&\u0010,\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010!2\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010+\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0019\u00105\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u0012\u00109\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010:\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010;\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\tH\u0016J\b\u0010=\u001a\u00020\tH\u0016J\u001c\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\b\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006b"}, m28432d2 = {"LvQ4;", "LxE;", "LsQ4;", "LHL2;", "", "Lco/bird/android/model/wire/WireLocation;", "locations", "Lcom/google/android/gms/maps/model/LatLngBounds$a;", "boundsBuilder", "", "Rl", "", "width", "height", "D8", "Lio/reactivex/Observable;", "I3", "", "show", "i0", "", "distance", "B7", "Lco/bird/android/model/wire/WireRide;", "ride", "useBilledMinutes", "hideTime", "vl", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "m5", "Lco/bird/android/model/wire/WireBirdTrack;", "tracks", "", "vehicleModel", "displayPartnerName", "Dl", "Lco/bird/android/model/wire/WireRideTransactionItem;", "lineItems", "receiptCurrency", "xh", "birdNumber", "thirdPartyName", "thirdPartyNumber", "Fk", "status", "N7", "Vh", "resId", "Th", "g6", "", "rating", "bg", "(Ljava/lang/Float;)V", "Lco/bird/android/model/wire/WireRideTransaction;", "transaction", "A3", "oj", "Q8", "e6", "Gd", "Lco/bird/android/model/MobilePartner;", "partner", "Re", "ed", "u6", "rj", "Cj", "Landroid/content/Context;", "getContext", "LG5;", "b", "LG5;", "binding", "c", "I", "pathColor", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheet", "LcD1;", "e", "LcD1;", "map", "Lcom/google/android/gms/maps/model/LatLngBounds;", "f", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LG5;Lcom/uber/autodispose/ScopeProvider;)V", "g", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideDetailUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailUi.kt\nco/bird/android/app/feature/ridedetail/RideDetailUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,353:1\n199#2:354\n1603#3,9:355\n1855#3:364\n1856#3:366\n1612#3:367\n1855#3,2:370\n1#4:365\n260#5:368\n260#5:369\n*S KotlinDebug\n*F\n+ 1 RideDetailUi.kt\nco/bird/android/app/feature/ridedetail/RideDetailUiImpl\n*L\n124#1:354\n170#1:355,9\n170#1:364\n170#1:366\n170#1:367\n332#1:370,2\n170#1:365\n250#1:368\n261#1:369\n*E\n"})
/* renamed from: vQ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50413vQ4 extends AbstractC30071xE implements InterfaceC48635sQ4, HL2 {

    /* renamed from: g */
    public static final C29529b f114031g = new C29529b(null);

    /* renamed from: h */
    public static final int f114032h = 8;

    /* renamed from: b */
    public final C2633G5 f114033b;

    /* renamed from: c */
    public final int f114034c;

    /* renamed from: d */
    public final BottomSheetBehavior<View> f114035d;

    /* renamed from: e */
    public C39011cD1 f114036e;

    /* renamed from: f */
    public LatLngBounds f114037f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcD1;", "kotlin.jvm.PlatformType", "_map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vQ4$a */
    /* loaded from: classes2.dex */
    public static final class C29528a extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f114039h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29528a(BaseActivity baseActivity) {
            super(1);
            this.f114039h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 _map) {
            C50413vQ4 c50413vQ4 = C50413vQ4.this;
            Intrinsics.checkNotNullExpressionValue(_map, "_map");
            c50413vQ4.f114036e = _map;
            C39011cD1 c39011cD1 = null;
            if (NA0.m94303a(this.f114039h, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                C39011cD1 c39011cD12 = C50413vQ4.this.f114036e;
                if (c39011cD12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("map");
                    c39011cD12 = null;
                }
                c39011cD12.m61670r(true);
            }
            C39011cD1 c39011cD13 = C50413vQ4.this.f114036e;
            if (c39011cD13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
            } else {
                c39011cD1 = c39011cD13;
            }
            C51721xd6 m61676l = c39011cD1.m61676l();
            m61676l.m4915c(true);
            m61676l.m4917a(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"LvQ4$b;", "", "", "BOTTOM_SHEET_MINIMUM_HEIGHT_DP", "I", "BOTTOM_SHEET_SINGLE_PRICE_HEIGHT", "BOTTOM_SHEET_STANDARD_HEIGHT_DP", "MAP_BOUND_PADDING", "MAP_BOUND_PADDING_DIVISOR", "", "MOVE_CAMERA_DELAY", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vQ4$b */
    /* loaded from: classes2.dex */
    public static final class C29529b {
        public /* synthetic */ C29529b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29529b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50413vQ4(BaseActivity activity, C2633G5 binding, ScopeProvider scopeProvider) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f114033b = binding;
        this.f114034c = C40788fB0.m41776f(activity, C32364Df4.extraGreen);
        binding.f10888f.m59432r().setIsIndicator(true);
        BottomSheetBehavior<View> m50133G = BottomSheetBehavior.m50133G(binding.f10884b);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.bottom)");
        this.f114035d = m50133G;
        NestedScrollView nestedScrollView = binding.f10884b;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "binding.bottom");
        m50133G.m50092k0(C49520tu6.m11247d(nestedScrollView, 230));
        m50133G.m50098h0(false);
        m50133G.m50104e0(true);
        ViewGroup.LayoutParams layoutParams = binding.f10886d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
        c11529e.m67758q(new RouteMapBehavior(this));
        binding.f10886d.setLayoutParams(c11529e);
        MapView mapView = binding.f10886d;
        Intrinsics.checkNotNullExpressionValue(mapView, "binding.mapView");
        Object m33135e = GoogleMap_Kt.getMap(mapView).m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29528a c29528a = new C29528a(activity);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: uQ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50413vQ4._init_$lambda$0(Function1.this, obj);
            }
        });
    }

    /* renamed from: Sl */
    public static final void m8716Sl(C50413vQ4 this$0, LatLngBounds it, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        C39011cD1 c39011cD1 = this$0.f114036e;
        if (c39011cD1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("map");
            c39011cD1 = null;
        }
        c39011cD1.m61675m(C48149rc0.m15706d(it, i, i2, Math.min(i, i2) / 6));
    }

    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: A3 */
    public void mo8730A3(WireRideTransaction wireRideTransaction) {
        this.f114033b.f10888f.setSinglePrice(wireRideTransaction);
        C49520tu6.m11233r(this.f114033b.f10888f.m59446d());
        BottomSheetBehavior<View> bottomSheetBehavior = this.f114035d;
        RideSummaryWithReceiptView rideSummaryWithReceiptView = this.f114033b.f10888f;
        Intrinsics.checkNotNullExpressionValue(rideSummaryWithReceiptView, "binding.rideSummaryView");
        C44830m00.m26552b(bottomSheetBehavior, C49520tu6.m11247d(rideSummaryWithReceiptView, 290));
        this.f114035d.m50110b0(null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: B7 */
    public void mo8729B7(double d) {
        this.f114033b.f10888f.setDistance(d);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Cj */
    public Observable<Unit> mo8728Cj() {
        return C44626lf5.clicksThrottle$default(this.f114033b.f10888f.m59438l(), 0L, 1, null);
    }

    @Override // p000.HL2
    /* renamed from: D8 */
    public synchronized void mo8727D8(final int i, final int i2) {
        final LatLngBounds latLngBounds = this.f114037f;
        if (latLngBounds != null) {
            getHandler().postDelayed(new Runnable() { // from class: tQ4
                @Override // java.lang.Runnable
                public final void run() {
                    C50413vQ4.m8716Sl(C50413vQ4.this, latLngBounds, i, i2);
                }
            }, 100L);
        }
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Dl */
    public void mo8726Dl(List<WireBirdTrack> tracks, String str, boolean z) {
        Object first;
        Object last;
        C6378PT m88494b;
        int i;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        for (WireBirdTrack wireBirdTrack : tracks) {
            WireLocation location = wireBirdTrack.getLocation();
            if (location != null) {
                arrayList.add(location);
            }
        }
        if (arrayList.size() >= 2) {
            try {
                LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
                if (arrayList.size() > 2) {
                    m8717Rl(arrayList, c17620a);
                }
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
                LatLng includeInBounds = GoogleMap_Kt.includeInBounds(GoogleMap_Kt.toLatLng((WireLocation) first), c17620a);
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
                LatLng includeInBounds2 = GoogleMap_Kt.includeInBounds(GoogleMap_Kt.toLatLng((WireLocation) last), c17620a);
                C39011cD1 c39011cD1 = this.f114036e;
                C39011cD1 c39011cD12 = null;
                if (c39011cD1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("map");
                    c39011cD1 = null;
                }
                MarkerOptions markerOptions = new MarkerOptions();
                if (z) {
                    BaseActivity activity = getActivity();
                    if (Intrinsics.areEqual(str, "bc")) {
                        i = C48193rg4.ic_cruiser_default;
                    } else {
                        i = C48193rg4.ic_scooter_default;
                    }
                    m88494b = C40788fB0.m41777e(activity, i);
                } else {
                    m88494b = C6780QT.m88494b(C33309Hg4.ic_receipt_ride_start);
                    Intrinsics.checkNotNullExpressionValue(m88494b, "{\n              BitmapDe…ride_start)\n            }");
                }
                c39011cD1.m61685c(markerOptions.m50657N0(m88494b).m50644u(0.5f, 1.0f).m50643u1(includeInBounds));
                C39011cD1 c39011cD13 = this.f114036e;
                if (c39011cD13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("map");
                    c39011cD13 = null;
                }
                c39011cD13.m61685c(new MarkerOptions().m50657N0(C6780QT.m88494b(C33309Hg4.ic_receipt_ride_end)).m50644u(0.5f, 1.0f).m50643u1(new LatLng(includeInBounds2.f71430b, includeInBounds2.f71431c)));
                LatLngBounds m50667a = c17620a.m50667a();
                Intrinsics.checkNotNullExpressionValue(m50667a, "boundsBuilder.build()");
                C39011cD1 c39011cD14 = this.f114036e;
                if (c39011cD14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("map");
                    c39011cD14 = null;
                }
                c39011cD14.m61675m(C48149rc0.m15707c(m50667a, 100));
                this.f114037f = m50667a;
                C39011cD1 c39011cD15 = this.f114036e;
                if (c39011cD15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("map");
                } else {
                    c39011cD12 = c39011cD15;
                }
                c39011cD12.m61673o(false);
            } catch (Exception e) {
                C41318g46.m40159e(e);
            }
        }
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Fk */
    public void mo8725Fk(String str, String str2, String str3) {
        if (str != null) {
            this.f114033b.f10888f.m59449a().m59455a(str);
            C49520tu6.m11233r(this.f114033b.f10888f.m59448b());
            C49520tu6.m11233r(this.f114033b.f10888f.m59449a());
        }
        if (str2 != null && str3 != null) {
            this.f114033b.f10888f.m59449a().m59454b(str2, str3);
            C49520tu6.m11233r(this.f114033b.f10888f.m59448b());
            C49520tu6.m11233r(this.f114033b.f10888f.m59449a());
        }
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Gd */
    public void mo8724Gd() {
        C49520tu6.m11233r(this.f114033b.f10888f.m59429u());
        this.f114033b.f10888f.m59427w().setImageResource(C48193rg4.ic_thumbs_down_small);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: I3 */
    public Observable<Unit> mo8723I3() {
        return C44626lf5.clicksThrottle$default(this.f114033b.f10888f.m59428v(), 0L, 1, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: N7 */
    public void mo8722N7(String str) {
        boolean z;
        this.f114033b.f10888f.m59444f().setText(str);
        CardView m59443g = this.f114033b.f10888f.m59443g();
        boolean z2 = true;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(m59443g, z, 0, 2, null);
        TextView m59444f = this.f114033b.f10888f.m59444f();
        if (str == null) {
            z2 = false;
        }
        C49520tu6.show$default(m59444f, z2, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Q8 */
    public void mo8720Q8(boolean z) {
        C49520tu6.show$default(this.f114033b.f10888f.m59436n(), z, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Re */
    public void mo8718Re(MobilePartner mobilePartner, String str) {
        String str2;
        String iconUrl;
        TextView m59434p = this.f114033b.f10888f.m59434p();
        BaseActivity activity = getActivity();
        AbstractC33662It6<ImageView, Bitmap> abstractC33662It6 = null;
        if (mobilePartner != null) {
            str2 = mobilePartner.getDisplayName();
        } else {
            str2 = null;
        }
        m59434p.setText(WireBirdKt.getDisplayName(activity, str2, str));
        C49520tu6.m11233r(this.f114033b.f10888f.m59433q());
        if (mobilePartner != null && (iconUrl = mobilePartner.getIconUrl()) != null) {
            abstractC33662It6 = ComponentCallbacks2C17096a.m53136v(getActivity()).m81662b().m16089a1(iconUrl).m16096R0(this.f114033b.f10888f.m59435o());
        }
        if (abstractC33662It6 == null) {
            this.f114033b.f10888f.m59435o().setImageResource(C48193rg4.ic_bird_logo);
        }
    }

    /* renamed from: Rl */
    public final void m8717Rl(List<WireLocation> list, LatLngBounds.C17620a c17620a) {
        PolylineOptions m50611j1 = new PolylineOptions().m50622E(this.f114034c).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
        Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
        for (WireLocation wireLocation : list) {
            LatLng latLng = new LatLng(wireLocation.getLatitude(), wireLocation.getLongitude());
            m50611j1.m50607s(latLng);
            c17620a.m50666b(latLng);
        }
        C39011cD1 c39011cD1 = this.f114036e;
        if (c39011cD1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("map");
            c39011cD1 = null;
        }
        c39011cD1.m61683e(m50611j1);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Th */
    public void mo8715Th(int i) {
        this.f114033b.f10888f.m59445e().setText(i);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: Vh */
    public void mo8714Vh(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!z) {
            if (this.f114033b.f10888f.m59438l().getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (this.f114033b.f10888f.m59449a().getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z4 = false;
                }
            }
        }
        C49520tu6.show$default(this.f114033b.f10888f.m59448b(), z4, 0, 2, null);
        C49520tu6.show$default(this.f114033b.f10888f.m59445e(), z, 0, 2, null);
        C49520tu6.show$default(this.f114033b.f10888f.m59439k(), z, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: bg */
    public void mo8713bg(Float f) {
        if (f != null) {
            this.f114033b.f10888f.m59432r().setRating(f.floatValue());
        }
        C49520tu6.m11233r(this.f114033b.f10888f.m59431s());
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: e6 */
    public void mo8712e6() {
        C49520tu6.m11233r(this.f114033b.f10888f.m59429u());
        this.f114033b.f10888f.m59427w().setImageResource(C48193rg4.ic_thumbs_up_small);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: ed */
    public Observable<Unit> mo8711ed() {
        return C44626lf5.clicksThrottle$default(this.f114033b.f10888f.m59429u(), 0L, 1, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: g6 */
    public void mo8710g6(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!z) {
            if (this.f114033b.f10888f.m59445e().getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (this.f114033b.f10888f.m59449a().getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z4 = false;
                }
            }
        }
        C49520tu6.show$default(this.f114033b.f10888f.m59448b(), z4, 0, 2, null);
        C49520tu6.show$default(this.f114033b.f10888f.m59438l(), z, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    public Context getContext() {
        return getActivity();
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: i0 */
    public void mo8709i0(boolean z) {
        C49520tu6.show$default(this.f114033b.f10888f.m59428v(), z, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: m5 */
    public void mo8708m5(WireRideDetail detail) {
        String string;
        Intrinsics.checkNotNullParameter(detail, "detail");
        DateTime completedAt = detail.getRide().getCompletedAt();
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            if (completedAt != null) {
                string = C51916xx1.f118396a.m4390v(completedAt);
            } else {
                string = getActivity().getResources().getString(C45871nl4.ride_detail_title);
            }
            supportActionBar.mo70242E(string);
        }
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: oj */
    public void mo8707oj(boolean z) {
        C49520tu6.show$default(this.f114033b.f10888f.m59437m(), z, 0, 2, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: rj */
    public Observable<Unit> mo8706rj() {
        return C44626lf5.clicksThrottle$default(this.f114033b.f10888f.m59445e(), 0L, 1, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: u6 */
    public Observable<Unit> mo8705u6() {
        return C44626lf5.clicksThrottle$default(this.f114033b.f10888f.m59439k(), 0L, 1, null);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: vl */
    public void mo8704vl(WireRide ride, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        this.f114033b.f10888f.setDuration(ride, z, z2);
    }

    @Override // p000.InterfaceC48635sQ4
    /* renamed from: xh */
    public void mo8703xh(List<WireRideTransactionItem> lineItems, String receiptCurrency) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(receiptCurrency, "receiptCurrency");
        this.f114033b.f10888f.m59430t().m59452a(lineItems, receiptCurrency);
        C49520tu6.m11233r(this.f114033b.f10888f.m59430t());
        if (C51006wQ4.m6853b(lineItems)) {
            C44830m00.m26551c(this.f114035d);
        } else if (C51006wQ4.m6854a(lineItems)) {
            C44830m00.m26552b(this.f114035d, C49520tu6.m11247d(this.f114033b.f10888f.m59430t(), 475));
        } else if (C51006wQ4.m6852c(lineItems)) {
            C44830m00.m26553a(this.f114035d);
        }
    }
}
