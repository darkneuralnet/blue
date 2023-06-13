package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePrivateBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LK65;", "", "", "e", "LYR4;", C17296a.f69688o, "LYR4;", "rideManager", "LY94;", "Lz65;", "b", "LY94;", "rideStartedTutorials", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "<init>", "(LYR4;LY94;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartedTutorialsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartedTutorialsPresenter.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorialsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,51:1\n180#2:52\n*S KotlinDebug\n*F\n+ 1 RideStartedTutorialsPresenter.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorialsPresenter\n*L\n43#1:52\n*E\n"})
/* renamed from: K65 */
/* loaded from: classes2.dex */
public final class K65 {

    /* renamed from: a */
    public final YR4 f19087a;

    /* renamed from: b */
    public final Y94<C52602z65> f19088b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f19089c;

    /* renamed from: d */
    public final InterfaceC40099e13 f19090d;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K65$a */
    /* loaded from: classes2.dex */
    public static final class C4341a extends Lambda implements Function1<Optional<RideState>, Boolean> {

        /* renamed from: g */
        public static final C4341a f19091g = new C4341a();

        public C4341a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<RideState> it) {
            RideState.Status status;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            RideState m59035e = it.m59035e();
            WirePrivateBird wirePrivateBird = null;
            if (m59035e != null) {
                status = m59035e.getStatus();
            } else {
                status = null;
            }
            if (status == RideState.Status.STARTED) {
                WireBird bird = m59035e.getRide().getBird();
                if (bird != null) {
                    wirePrivateBird = bird.getPrivateBird();
                }
                if (wirePrivateBird != null) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/RideState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K65$b */
    /* loaded from: classes2.dex */
    public static final class C4342b extends Lambda implements Function1<Optional<RideState>, RideState> {

        /* renamed from: g */
        public static final C4342b f19092g = new C4342b();

        public C4342b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideState invoke(Optional<RideState> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideState;", "first", "second", "", C17296a.f69688o, "(Lco/bird/android/model/RideState;Lco/bird/android/model/RideState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K65$c */
    /* loaded from: classes2.dex */
    public static final class C4343c extends Lambda implements Function2<RideState, RideState, Boolean> {

        /* renamed from: g */
        public static final C4343c f19093g = new C4343c();

        public C4343c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(RideState first, RideState second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return Boolean.valueOf(Intrinsics.areEqual(first.getRide().getId(), second.getRide().getId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K65$d */
    /* loaded from: classes2.dex */
    public static final class C4344d extends Lambda implements Function1<RideState, Unit> {
        public C4344d() {
            super(1);
        }

        /* renamed from: a */
        public final void m99218a(RideState rideState) {
            if (((C52602z65) K65.this.f19088b.get()).m1795c()) {
                K65.this.f19090d.mo37147J2();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideState rideState) {
            m99218a(rideState);
            return Unit.INSTANCE;
        }
    }

    public K65(YR4 rideManager, Y94<C52602z65> rideStartedTutorials, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rideStartedTutorials, "rideStartedTutorials");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f19087a = rideManager;
        this.f19088b = rideStartedTutorials;
        this.f19089c = scopeProvider;
        this.f19090d = navigator;
    }

    /* renamed from: f */
    public static final boolean m99225f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g */
    public static final RideState m99224g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideState) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final boolean m99223h(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: i */
    public static final void m99222i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m99226e() {
        Z84<Optional<RideState>> mo75057R = this.f19087a.mo75057R();
        final C4341a c4341a = C4341a.f19091g;
        Observable<Optional<RideState>> filter = mo75057R.filter(new InterfaceC23494q() { // from class: G65
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m99225f;
                m99225f = K65.m99225f(Function1.this, obj);
                return m99225f;
            }
        });
        final C4342b c4342b = C4342b.f19092g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: H65
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideState m99224g;
                m99224g = K65.m99224g(Function1.this, obj);
                return m99224g;
            }
        });
        final C4343c c4343c = C4343c.f19093g;
        Observable observeOn = map.distinctUntilChanged(new InterfaceC23481d() { // from class: I65
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m99223h;
                m99223h = K65.m99223h(Function2.this, obj, obj2);
                return m99223h;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideManager.primaryRideS…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f19089c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4344d c4344d = new C4344d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: J65
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K65.m99222i(Function1.this, obj);
            }
        });
    }
}
