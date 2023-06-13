package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WireAlert;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u0004B;\b\u0007\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lx9;", "LxC;", "Lq9;", "", C17296a.f69688o, "Lio/reactivex/Observable;", "Lco/bird/android/model/RideState$Status;", "I", "LYR4;", "c", "LYR4;", "rideManager", "Lm9;", DateTokenConverter.CONVERTER_KEY, "Lm9;", "alertClient", "LTq4;", "e", "LTq4;", "reactiveConfig", "LB9;", "f", "LB9;", "alertUi", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LYR4;Lm9;LTq4;LB9;)V", "g", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlertPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertPresenter.kt\nco/bird/android/app/feature/alert/AlertPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,88:1\n180#2:89\n*S KotlinDebug\n*F\n+ 1 AlertPresenter.kt\nco/bird/android/app/feature/alert/AlertPresenterImpl\n*L\n62#1:89\n*E\n"})
/* renamed from: x9 */
/* loaded from: classes2.dex */
public final class C30045x9 extends C30060xC implements InterfaceC27513q9 {

    /* renamed from: g */
    public static final C30046a f117122g = new C30046a(null);

    /* renamed from: h */
    public static final int f117123h = 8;

    /* renamed from: c */
    public final YR4 f117124c;

    /* renamed from: d */
    public final InterfaceC25921m9 f117125d;

    /* renamed from: e */
    public final C36207Tq4 f117126e;

    /* renamed from: f */
    public final InterfaceC0533B9 f117127f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lx9$a;", "", "", "ALERT_REFRESH_INTERVAL", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x9$a */
    /* loaded from: classes2.dex */
    public static final class C30046a {
        public /* synthetic */ C30046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30046a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RideState$Status;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x9$b */
    /* loaded from: classes2.dex */
    public static final class C30047b extends Lambda implements Function1<Pair<? extends RideState.Status, ? extends Boolean>, Unit> {
        public C30047b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RideState.Status, ? extends Boolean> pair) {
            invoke2((Pair<? extends RideState.Status, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends RideState.Status, Boolean> pair) {
            RideState.Status component1 = pair.component1();
            if (pair.component2().booleanValue() && component1 == RideState.Status.ENDED) {
                return;
            }
            C30045x9.this.f117127f.mo112740rh();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LHM4;", "", "Lco/bird/android/model/wire/WireAlert;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x9$d */
    /* loaded from: classes2.dex */
    public static final class C30049d extends Lambda implements Function1<Long, InterfaceC24574u<? extends HM4<List<? extends WireAlert>>>> {
        public C30049d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<List<WireAlert>>> invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C30045x9.this.f117125d.m26252a().m32056T(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x9$e */
    /* loaded from: classes2.dex */
    public static final class C30050e extends Lambda implements Function1<Throwable, Unit> {
        public C30050e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C30045x9.this.f117127f.mo112740rh();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/wire/WireAlert;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x9$f */
    /* loaded from: classes2.dex */
    public static final class C30051f extends Lambda implements Function1<HM4<List<? extends WireAlert>>, Unit> {
        public C30051f() {
            super(1);
        }

        /* renamed from: a */
        public final void m5790a(HM4<List<WireAlert>> hm4) {
            Object first;
            List<WireAlert> m103944a = hm4.m103944a();
            if (hm4.m103939f()) {
                boolean z = false;
                if (m103944a != null && (!m103944a.isEmpty())) {
                    z = true;
                }
                if (z) {
                    InterfaceC0533B9 interfaceC0533B9 = C30045x9.this.f117127f;
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m103944a);
                    interfaceC0533B9.mo112741ha((WireAlert) first);
                    return;
                }
            }
            C30045x9.this.f117127f.mo112740rh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends WireAlert>> hm4) {
            m5790a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "Lco/bird/android/model/RideState$Status;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/RideState$Status;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x9$g */
    /* loaded from: classes2.dex */
    public static final class C30052g extends Lambda implements Function1<Optional<RideState>, RideState.Status> {

        /* renamed from: g */
        public static final C30052g f117133g = new C30052g();

        public C30052g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideState.Status invoke(Optional<RideState> it) {
            RideState.Status status;
            Intrinsics.checkNotNullParameter(it, "it");
            RideState m59035e = it.m59035e();
            if (m59035e == null || (status = m59035e.getStatus()) == null) {
                return RideState.Status.ENDED;
            }
            return status;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30045x9(LifecycleScopeProvider<EnumC7097RE> scopeProvider, YR4 rideManager, InterfaceC25921m9 alertClient, C36207Tq4 reactiveConfig, InterfaceC0533B9 alertUi) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(alertClient, "alertClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(alertUi, "alertUi");
        this.f117124c = rideManager;
        this.f117125d = alertClient;
        this.f117126e = reactiveConfig;
        this.f117127f = alertUi;
    }

    /* renamed from: D */
    public static final void m5802D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23434B m5801E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC24574u m5800F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m5799G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m5798H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final RideState.Status m5796J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideState.Status) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public final Observable<RideState.Status> m5797I() {
        Observable<Optional<RideState>> observeOn = this.f117124c.mo75057R().observeOn(C23454a.m33087a());
        final C30052g c30052g = C30052g.f117133g;
        Observable<RideState.Status> distinctUntilChanged = observeOn.map(new InterfaceC23492o() { // from class: w9
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideState.Status m5796J;
                m5796J = C30045x9.m5796J(Function1.this, obj);
                return m5796J;
            }
        }).startWith((Observable<R>) RideState.Status.ENDED).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideManager.primaryRideS…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // p000.InterfaceC27513q9
    /* renamed from: a */
    public void mo5795a() {
        Observable m31956a = C24523e.f91168a.m31956a(m5797I(), this.f117126e.m82813N3());
        final C30047b c30047b = new C30047b();
        Observable doOnNext = m31956a.doOnNext(new InterfaceC23484g() { // from class: r9
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30045x9.m5802D(Function1.this, obj);
            }
        });
        final C30048c c30048c = C30048c.f117129g;
        Observable switchMap = doOnNext.switchMap(new InterfaceC23492o() { // from class: s9
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m5801E;
                m5801E = C30045x9.m5801E(Function1.this, obj);
                return m5801E;
            }
        });
        final C30049d c30049d = new C30049d();
        Observable observeOn = switchMap.switchMapMaybe(new InterfaceC23492o() { // from class: t9
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m5800F;
                m5800F = C30045x9.m5800F(Function1.this, obj);
                return m5800F;
            }
        }).observeOn(C23454a.m33087a());
        final C30050e c30050e = new C30050e();
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: u9
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30045x9.m5799G(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun onCreate() …t()\n        }\n      }\n  }");
        Object m33094as = C37279Yf5.m74557f0(doOnError, 30).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30051f c30051f = new C30051f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: v9
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30045x9.m5798H(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/RideState$Status;", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x9$c */
    /* loaded from: classes2.dex */
    public static final class C30048c extends Lambda implements Function1<Pair<? extends RideState.Status, ? extends Boolean>, InterfaceC23434B<? extends Long>> {

        /* renamed from: g */
        public static final C30048c f117129g = new C30048c();

        public C30048c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Long> invoke2(Pair<? extends RideState.Status, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RideState.Status component1 = pair.component1();
            if (pair.component2().booleanValue() && component1 == RideState.Status.ENDED) {
                return Observable.interval(0L, 30L, TimeUnit.SECONDS);
            }
            return Observable.empty();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Long> invoke(Pair<? extends RideState.Status, ? extends Boolean> pair) {
            return invoke2((Pair<? extends RideState.Status, Boolean>) pair);
        }
    }
}
