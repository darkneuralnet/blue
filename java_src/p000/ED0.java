package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.constant.CouponDisplayTag;
import co.bird.android.model.wire.WireCouponDisplayView;
import co.bird.android.model.wire.WireCouponDisplayViewKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LED0;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCouponDisplayView;", DateTokenConverter.CONVERTER_KEY, "LV74;", C17296a.f69688o, "LV74;", "promoManager", "Le13;", "b", "Le13;", "navigator", "LTq4;", "c", "LTq4;", "reactiveConfig", "LID0;", "LID0;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LV74;Le13;LTq4;LID0;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCouponDisplayBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n52#2,2:83\n180#3:85\n180#3:86\n*S KotlinDebug\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl\n*L\n41#1:83,2\n46#1:85\n65#1:86\n*E\n"})
/* renamed from: ED0 */
/* loaded from: classes2.dex */
public final class ED0 implements FlightBanner {

    /* renamed from: a */
    public final V74 f7109a;

    /* renamed from: b */
    public final InterfaceC40099e13 f7110b;

    /* renamed from: c */
    public final C36207Tq4 f7111c;

    /* renamed from: d */
    public final ID0 f7112d;

    /* renamed from: e */
    public final ScopeProvider f7113e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCouponDisplayView;", "couponsDisplayViews", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCouponDisplayBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl$couponToDisplay$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n288#2,2:83\n*S KotlinDebug\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl$couponToDisplay$1\n*L\n75#1:83,2\n*E\n"})
    /* renamed from: ED0$a */
    /* loaded from: classes2.dex */
    public static final class C1759a extends Lambda implements Function1<List<? extends WireCouponDisplayView>, Optional<WireCouponDisplayView>> {

        /* renamed from: g */
        public static final C1759a f7114g = new C1759a();

        public C1759a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireCouponDisplayView> invoke(List<WireCouponDisplayView> couponsDisplayViews) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullParameter(couponsDisplayViews, "couponsDisplayViews");
            Optional.C14443a c14443a = Optional.f63040c;
            Iterator<T> it = couponsDisplayViews.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    WireCouponDisplayView wireCouponDisplayView = (WireCouponDisplayView) obj;
                    if (wireCouponDisplayView.getTag() == CouponDisplayTag.APPLIES_TO_NEXT_RIDE && !WireCouponDisplayViewKt.expired(wireCouponDisplayView)) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return c14443a.m59033b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ED0$b */
    /* loaded from: classes2.dex */
    public static final class C1760b<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C1760b<T1, T2, R> f7115a = new C1760b<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireCouponDisplayView;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ED0$c */
    /* loaded from: classes2.dex */
    public static final class C1761c extends Lambda implements Function1<Pair<? extends WireCouponDisplayView, ? extends String>, Unit> {
        public C1761c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireCouponDisplayView, ? extends String> pair) {
            invoke2((Pair<WireCouponDisplayView, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireCouponDisplayView, String> pair) {
            Integer num;
            int coerceAtLeast;
            WireCouponDisplayView component1 = pair.component1();
            ED0.this.f7112d.mo100950uc(pair.component2());
            ED0.this.f7112d.mo100952Ze(component1.getTitle());
            DateTime expiresAt = component1.getExpiresAt();
            if (expiresAt != null) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Seconds.secondsBetween(DateTime.now(), expiresAt).getSeconds(), 0);
                num = Integer.valueOf(coerceAtLeast);
            } else {
                num = null;
            }
            Double timerThreshold = component1.getTimerThreshold();
            if (num != null && timerThreshold != null && num.intValue() <= timerThreshold.doubleValue()) {
                ED0.this.f7112d.mo100954Gj(num.intValue());
            } else {
                ED0.this.f7112d.mo100951ii();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ED0$d */
    /* loaded from: classes2.dex */
    public static final class C1762d extends Lambda implements Function1<Unit, Unit> {
        public C1762d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            ED0.this.f7110b.mo37138L();
        }
    }

    public ED0(V74 promoManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, ID0 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f7109a = promoManager;
        this.f7110b = navigator;
        this.f7111c = reactiveConfig;
        this.f7112d = ui;
        this.f7113e = scopeProvider;
    }

    /* renamed from: e */
    public static final Optional m109297e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m109296f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m109295g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    /* renamed from: d */
    public final Observable<Optional<WireCouponDisplayView>> m109298d() {
        Z84<List<WireCouponDisplayView>> mo27798d = this.f7109a.mo27798d();
        final C1759a c1759a = C1759a.f7114g;
        Observable map = mo27798d.map(new InterfaceC23492o() { // from class: DD0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m109297e;
                m109297e = ED0.m109297e(Function1.this, obj);
                return m109297e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "promoManager.couponDispl…      }\n        )\n      }");
        return map;
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(C37279Yf5.m74576S(m109298d()), this.f7111c.m82698Y8(), C1760b.f7115a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f7113e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1761c c1761c = new C1761c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: BD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ED0.m109296f(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f7112d.mo100953Q().m33094as(AutoDispose.m45239a(this.f7113e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1762d c1762d = new C1762d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: CD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ED0.m109295g(Function1.this, obj);
            }
        });
    }
}
