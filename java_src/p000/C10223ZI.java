package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C10223ZI;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\"\u0010#\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006&"}, m28432d2 = {"LZI;", "", "", "f", "i", "LMD;", C17296a.f69688o, "LMD;", "c", "()LMD;", "baseRxBleManager", "LjI;", "b", "LjI;", DateTokenConverter.CONVERTER_KEY, "()LjI;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LaJ;", "LaJ;", "e", "()LaJ;", "ui", "", "", "LTk5;", "Ljava/util/Map;", "devices", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "scanSubject", "<init>", "(LMD;LjI;Lcom/uber/autodispose/ScopeProvider;LaJ;)V", "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdAirScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirScanPresenter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,50:1\n180#2:51\n*S KotlinDebug\n*F\n+ 1 BirdAirScanPresenter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanPresenter\n*L\n34#1:51\n*E\n"})
/* renamed from: ZI */
/* loaded from: classes3.dex */
public final class C10223ZI {

    /* renamed from: a */
    public final InterfaceC5225MD f48181a;

    /* renamed from: b */
    public final C24767jI f48182b;

    /* renamed from: c */
    public final ScopeProvider f48183c;

    /* renamed from: d */
    public final C10626aJ f48184d;

    /* renamed from: e */
    public final Map<String, C36154Tk5> f48185e;

    /* renamed from: f */
    public final C24552a<Unit> f48186f;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZI$a */
    /* loaded from: classes3.dex */
    public static final class C10224a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Optional<C36154Tk5>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZI$a$a */
        /* loaded from: classes3.dex */
        public static final class C10225a extends Lambda implements Function1<C36154Tk5, Optional<C36154Tk5>> {

            /* renamed from: g */
            public static final C10225a f48188g = new C10225a();

            public C10225a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C36154Tk5> invoke(C36154Tk5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59032c(it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZI$a$b */
        /* loaded from: classes3.dex */
        public static final class C10226b extends Lambda implements Function1<Throwable, Optional<C36154Tk5>> {

            /* renamed from: g */
            public static final C10226b f48189g = new C10226b();

            public C10226b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C36154Tk5> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59034a();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZI$a$c */
        /* loaded from: classes3.dex */
        public static final class C10227c extends Lambda implements Function1<Optional<C36154Tk5>, Boolean> {

            /* renamed from: g */
            public static final C10227c f48190g = new C10227c();

            public C10227c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<C36154Tk5> it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m59037c()) {
                    C36154Tk5 m59038b = it.m59038b();
                    Intrinsics.checkNotNullExpressionValue(m59038b, "it.get()");
                    if (C36388Uk5.m80950A(m59038b)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }

        public C10224a() {
            super(1);
        }

        /* renamed from: d */
        public static final Optional m73345d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Optional m73344e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final boolean m73343f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<C36154Tk5>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(C10223ZI.this.m73355c(), 2, false, null, 6, null);
            final C10225a c10225a = C10225a.f48188g;
            Observable map = scanBleDevices$default.map(new InterfaceC23492o() { // from class: WI
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m73345d;
                    m73345d = C10223ZI.C10224a.m73345d(Function1.this, obj);
                    return m73345d;
                }
            });
            final C10226b c10226b = C10226b.f48189g;
            Observable onErrorReturn = map.onErrorReturn(new InterfaceC23492o() { // from class: XI
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m73344e;
                    m73344e = C10223ZI.C10224a.m73344e(Function1.this, obj);
                    return m73344e;
                }
            });
            final C10227c c10227c = C10227c.f48190g;
            return onErrorReturn.filter(new InterfaceC23494q() { // from class: YI
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m73343f;
                    m73343f = C10223ZI.C10224a.m73343f(Function1.this, obj);
                    return m73343f;
                }
            }).takeUntil(Observable.timer(10L, TimeUnit.SECONDS));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", "scanResultOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZI$b */
    /* loaded from: classes3.dex */
    public static final class C10228b extends Lambda implements Function1<Optional<C36154Tk5>, Unit> {
        public C10228b() {
            super(1);
        }

        /* renamed from: a */
        public final void m73339a(Optional<C36154Tk5> optional) {
            List<? extends C36154Tk5> list;
            if (optional.m59037c()) {
                C36154Tk5 m59038b = optional.m59038b();
                Intrinsics.checkNotNullExpressionValue(m59038b, "scanResultOptional.get()");
                C36154Tk5 c36154Tk5 = m59038b;
                Map map = C10223ZI.this.f48185e;
                String mo17280e = c36154Tk5.m83016a().mo17280e();
                Intrinsics.checkNotNullExpressionValue(mo17280e, "scanResult.bleDevice.macAddress");
                map.put(mo17280e, c36154Tk5);
                C10626aJ m73353e = C10223ZI.this.m73353e();
                C24767jI m73354d = C10223ZI.this.m73354d();
                list = CollectionsKt___CollectionsKt.toList(C10223ZI.this.f48185e.values());
                m73353e.m71668a(m73354d.m30893a(list));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C36154Tk5> optional) {
            m73339a(optional);
            return Unit.INSTANCE;
        }
    }

    public C10223ZI(InterfaceC5225MD baseRxBleManager, C24767jI converter, ScopeProvider scopeProvider, C10626aJ ui) {
        Intrinsics.checkNotNullParameter(baseRxBleManager, "baseRxBleManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f48181a = baseRxBleManager;
        this.f48182b = converter;
        this.f48183c = scopeProvider;
        this.f48184d = ui;
        this.f48185e = new LinkedHashMap();
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f48186f = m31922e;
    }

    /* renamed from: g */
    public static final InterfaceC23434B m73351g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m73350h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final InterfaceC5225MD m73355c() {
        return this.f48181a;
    }

    /* renamed from: d */
    public final C24767jI m73354d() {
        return this.f48182b;
    }

    /* renamed from: e */
    public final C10626aJ m73353e() {
        return this.f48184d;
    }

    /* renamed from: f */
    public final void m73352f() {
        C24552a<Unit> c24552a = this.f48186f;
        final C10224a c10224a = new C10224a();
        Observable<R> switchMap = c24552a.switchMap(new InterfaceC23492o() { // from class: UI
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73351g;
                m73351g = C10223ZI.m73351g(Function1.this, obj);
                return m73351g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "fun onResume() {\n    sca…\n    scanForBirdAir()\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(this.f48183c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10228b c10228b = new C10228b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: VI
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C10223ZI.m73350h(Function1.this, obj);
            }
        });
        m73349i();
    }

    /* renamed from: i */
    public final void m73349i() {
        this.f48186f.onNext(Unit.INSTANCE);
    }
}
