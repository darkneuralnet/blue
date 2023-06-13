package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenter;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImpl;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import p000.S74;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010&\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00050\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006)"}, m28432d2 = {"LhR2;", "LUQ2;", "", "merchantSiteId", "merchantId", "Lco/bird/android/model/wire/WireLocation;", "merchantSiteLocation", "", C17296a.f69688o, "onResume", "LaS2;", "LaS2;", "merchantManager", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "b", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;", "locationPresenterFactory", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LvR2;", DateTokenConverter.CONVERTER_KEY, "LvR2;", "ui", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "e", "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;", "locationSelectionPresenter", "LAG;", "", "kotlin.jvm.PlatformType", "f", "LAG;", "loadingAvailability", "g", "addressRelay", "h", "locationRelay", "<init>", "(LaS2;Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImplFactory;Lcom/uber/autodispose/ScopeProvider;LvR2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantLocationEditPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantLocationEditPresenter.kt\nco/bird/android/app/feature/merchant/MerchantLocationEditPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,118:1\n180#2:119\n180#2:120\n180#2:121\n180#2:122\n180#2:123\n180#2:124\n*S KotlinDebug\n*F\n+ 1 MerchantLocationEditPresenter.kt\nco/bird/android/app/feature/merchant/MerchantLocationEditPresenterImpl\n*L\n63#1:119\n86#1:120\n92#1:121\n98#1:122\n105#1:123\n114#1:124\n*E\n"})
/* renamed from: hR2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42120hR2 implements UQ2 {

    /* renamed from: a */
    public final InterfaceC37961aS2 f85193a;

    /* renamed from: b */
    public final LocationSelectionPresenterImplFactory f85194b;

    /* renamed from: c */
    public final ScopeProvider f85195c;

    /* renamed from: d */
    public final C50420vR2 f85196d;

    /* renamed from: e */
    public LocationSelectionPresenter f85197e;

    /* renamed from: f */
    public final C0058AG<Boolean> f85198f;

    /* renamed from: g */
    public final C0058AG<String> f85199g;

    /* renamed from: h */
    public final C0058AG<WireLocation> f85200h;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$a */
    /* loaded from: classes2.dex */
    public static final class C22644a extends Lambda implements Function1<Unit, Unit> {
        public C22644a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42120hR2.this.f85196d.enableDoneButton(false);
            S74.C7343a.showProgress$default(C42120hR2.this.f85196d, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hR2$b */
    /* loaded from: classes2.dex */
    public static final class C22645b extends Lambda implements Function1<Unit, InterfaceC23434B<? extends WireLocation>> {
        public C22645b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireLocation> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C42120hR2.this.f85200h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireLocation;", "location", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hR2$c */
    /* loaded from: classes2.dex */
    public static final class C22646c extends Lambda implements Function1<WireLocation, InterfaceC23447K<? extends HM4<Object>>> {

        /* renamed from: h */
        public final /* synthetic */ String f85204h;

        /* renamed from: i */
        public final /* synthetic */ String f85205i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22646c(String str, String str2) {
            super(1);
            this.f85204h = str;
            this.f85205i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Object>> invoke(WireLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C42120hR2.this.f85193a.mo12343d(this.f85204h, this.f85205i, location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: hR2$d */
    /* loaded from: classes2.dex */
    public static final class C22647d extends Lambda implements Function1<HM4<Object>, Unit> {
        public C22647d() {
            super(1);
        }

        /* renamed from: a */
        public final void m36401a(HM4<Object> hm4) {
            Unit unit;
            String string;
            if (hm4.m103939f()) {
                C42120hR2.this.f85196d.success(C45871nl4.merchant_location_edit_success);
            } else {
                ResponseBody m103940e = hm4.m103940e();
                if (m103940e != null && (string = m103940e.string()) != null) {
                    C42120hR2.this.f85196d.error(string);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C42120hR2.this.f85196d.error(C45871nl4.error_generic_body);
                }
            }
            C42120hR2.this.f85196d.enableDoneButton(true);
            S74.C7343a.showProgress$default(C42120hR2.this.f85196d, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Object> hm4) {
            m36401a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$e */
    /* loaded from: classes2.dex */
    public static final class C22648e extends Lambda implements Function1<Throwable, Unit> {
        public C22648e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            C42120hR2.this.f85196d.enableDoneButton(true);
            S74.C7343a.showProgress$default(C42120hR2.this.f85196d, false, 0, 2, null);
            C50420vR2 c50420vR2 = C42120hR2.this.f85196d;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            c50420vR2.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$f */
    /* loaded from: classes2.dex */
    public static final class C22649f extends Lambda implements Function1<Location, Unit> {

        /* renamed from: g */
        public static final C22649f f85208g = new C22649f();

        public C22649f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$g */
    /* loaded from: classes2.dex */
    public static final class C22650g extends Lambda implements Function1<Throwable, Unit> {
        public C22650g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C42120hR2.this.f85196d.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$h */
    /* loaded from: classes2.dex */
    public static final class C22651h extends Lambda implements Function1<WireLocation, Unit> {
        public C22651h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
            invoke2(wireLocation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireLocation wireLocation) {
            C42120hR2.this.f85200h.accept(wireLocation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$i */
    /* loaded from: classes2.dex */
    public static final class C22652i extends Lambda implements Function1<String, Unit> {
        public C22652i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C42120hR2.this.f85199g.accept(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$j */
    /* loaded from: classes2.dex */
    public static final class C22653j extends Lambda implements Function1<WireLocation, Unit> {
        public C22653j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
            invoke2(wireLocation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireLocation wireLocation) {
            C42120hR2.this.f85200h.accept(wireLocation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$k */
    /* loaded from: classes2.dex */
    public static final class C22654k extends Lambda implements Function1<Throwable, Unit> {
        public C22654k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C50420vR2 c50420vR2 = C42120hR2.this.f85196d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c50420vR2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hR2$l */
    /* loaded from: classes2.dex */
    public static final class C22655l extends Lambda implements Function1<Boolean, Unit> {
        public C22655l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            C50420vR2 c50420vR2 = C42120hR2.this.f85196d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            S74.C7343a.showProgress$default(c50420vR2, it.booleanValue(), 0, 2, null);
        }
    }

    public C42120hR2(InterfaceC37961aS2 merchantManager, LocationSelectionPresenterImplFactory locationPresenterFactory, ScopeProvider scopeProvider, C50420vR2 ui) {
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(locationPresenterFactory, "locationPresenterFactory");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f85193a = merchantManager;
        this.f85194b = locationPresenterFactory;
        this.f85195c = scopeProvider;
        this.f85196d = ui;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f85198f = m115950h;
        C0058AG<String> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<String>()");
        this.f85199g = m115951g;
        C0058AG<WireLocation> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<WireLocation>()");
        this.f85200h = m115951g2;
    }

    /* renamed from: n */
    public static final void m36414n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23434B m36413o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m36412p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m36411q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m36410r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m36409s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m36408t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m36407u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m36406v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m36405w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m36404x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m36403y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.UQ2
    /* renamed from: a */
    public void mo36427a(String merchantSiteId, String merchantId, WireLocation merchantSiteLocation) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantSiteLocation, "merchantSiteLocation");
        LocationSelectionModel locationSelectionModel = new LocationSelectionModel(merchantSiteLocation, "");
        this.f85200h.accept(merchantSiteLocation);
        LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory = this.f85194b;
        C50420vR2 c50420vR2 = this.f85196d;
        ScopeProvider scopeProvider = this.f85195c;
        AbstractC23461c m33071O = AbstractC23461c.m33071O();
        Intrinsics.checkNotNullExpressionValue(m33071O, "never()");
        LocationSelectionPresenterImpl create = locationSelectionPresenterImplFactory.create(c50420vR2, scopeProvider, 27.4332d, locationSelectionModel, m33071O);
        create.onCreate(null);
        create.setAddressHint(C45871nl4.merchant_location_edit_hint);
        this.f85197e = create;
        this.f85196d.init();
        Observable<Unit> observeOn = this.f85196d.doneClicks().observeOn(C23454a.m33087a());
        final C22644a c22644a = new C22644a();
        Observable<Unit> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: VQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36414n(Function1.this, obj);
            }
        });
        final C22645b c22645b = new C22645b();
        Observable<R> switchMap = doOnNext.switchMap(new InterfaceC23492o() { // from class: YQ2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m36413o;
                m36413o = C42120hR2.m36413o(Function1.this, obj);
                return m36413o;
            }
        });
        final C22646c c22646c = new C22646c(merchantSiteId, merchantId);
        Observable observeOn2 = switchMap.flatMapSingle(new InterfaceC23492o() { // from class: ZQ2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m36412p;
                m36412p = C42120hR2.m36412p(Function1.this, obj);
                return m36412p;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate(me…error(error)\n      })\n  }");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f85195c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22647d c22647d = new C22647d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: aR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36411q(Function1.this, obj);
            }
        };
        final C22648e c22648e = new C22648e();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36410r(Function1.this, obj);
            }
        });
    }

    @Override // p000.UQ2
    public void onResume() {
        Observable<String> observeCompleteRevGeoCodeAddress;
        LocationSelectionPresenter locationSelectionPresenter = this.f85197e;
        if (locationSelectionPresenter != null) {
            locationSelectionPresenter.onResume();
        }
        Observable<Location> observeOn = this.f85196d.centerLocation().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.centerLocation()\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f85195c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22649f c22649f = C22649f.f85208g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: cR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36406v(Function1.this, obj);
            }
        };
        final C22650g c22650g = new C22650g();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36405w(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f85196d.observeLocation(true).m33094as(AutoDispose.m45239a(this.f85195c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22651h c22651h = new C22651h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: eR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36404x(Function1.this, obj);
            }
        });
        LocationSelectionPresenter locationSelectionPresenter2 = this.f85197e;
        if (locationSelectionPresenter2 != null && (observeCompleteRevGeoCodeAddress = locationSelectionPresenter2.observeCompleteRevGeoCodeAddress()) != null) {
            Object m33094as3 = observeCompleteRevGeoCodeAddress.m33094as(AutoDispose.m45239a(this.f85195c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as3;
            if (observableSubscribeProxy != null) {
                final C22652i c22652i = new C22652i();
                observableSubscribeProxy.subscribe(new InterfaceC23484g() { // from class: fR2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42120hR2.m36403y(Function1.this, obj);
                    }
                });
            }
        }
        Observable<WireLocation> observeOn2 = this.f85196d.observeLocation(true).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.observeLocation(inclu…dSchedulers.mainThread())");
        Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(this.f85195c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22653j c22653j = new C22653j();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: gR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36409s(Function1.this, obj);
            }
        };
        final C22654k c22654k = new C22654k();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: WQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36408t(Function1.this, obj);
            }
        });
        Observable<Boolean> observeOn3 = this.f85198f.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "loadingAvailability\n    …dSchedulers.mainThread())");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(this.f85195c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22655l c22655l = new C22655l();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: XQ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42120hR2.m36407u(Function1.this, obj);
            }
        });
    }
}
