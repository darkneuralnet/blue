package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C40808fD2;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00050\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"LfD2;", "LZC2;", "", C17296a.f69688o, "c", "Lco/bird/android/model/wire/WireBird;", "bird", "i", "h", "Lom3;", "Lom3;", "operatorManager", "LEa;", "b", "LEa;", "analyticsManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LjD2;", DateTokenConverter.CONVERTER_KEY, "LjD2;", "ui", "Le13;", "e", "Le13;", "navigator", "LAG;", "kotlin.jvm.PlatformType", "f", "LAG;", "birdRelay", "", "g", "Z", "getBirdFound", "()Z", "setBirdFound", "(Z)V", "birdFound", "<init>", "(Lom3;LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LjD2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookupBirdPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupBirdPresenter.kt\nco/bird/android/app/feature/lookupbird/LookupBirdPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,87:1\n180#2:88\n180#2:89\n*S KotlinDebug\n*F\n+ 1 LookupBirdPresenter.kt\nco/bird/android/app/feature/lookupbird/LookupBirdPresenterImpl\n*L\n55#1:88\n65#1:89\n*E\n"})
/* renamed from: fD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40808fD2 implements ZC2 {

    /* renamed from: a */
    public final InterfaceC46473om3 f79688a;

    /* renamed from: b */
    public final InterfaceC1880Ea f79689b;

    /* renamed from: c */
    public final LifecycleScopeProvider<EnumC7097RE> f79690c;

    /* renamed from: d */
    public final InterfaceC43180jD2 f79691d;

    /* renamed from: e */
    public final InterfaceC40099e13 f79692e;

    /* renamed from: f */
    public final C0058AG<WireBird> f79693f;

    /* renamed from: g */
    public boolean f79694g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fD2$a */
    /* loaded from: classes2.dex */
    public static final class C20319a extends Lambda implements Function1<String, InterfaceC23447K<? extends Optional<WireBird>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fD2$a$a */
        /* loaded from: classes2.dex */
        public static final class C20320a extends Lambda implements Function1<WireBird, Optional<WireBird>> {

            /* renamed from: g */
            public static final C20320a f79696g = new C20320a();

            public C20320a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WireBird> invoke(WireBird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59032c(it);
            }
        }

        public C20319a() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m41717c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final Optional m41716d(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            return Optional.f63040c.m59034a();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Optional<WireBird>> invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            AbstractC23442F<WireBird> mo8104g = C40808fD2.this.f79688a.mo8104g(code);
            final C20320a c20320a = C20320a.f79696g;
            return mo8104g.m33157I(new InterfaceC23492o() { // from class: dD2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m41717c;
                    m41717c = C40808fD2.C20319a.m41717c(Function1.this, obj);
                    return m41717c;
                }
            }).m33149Q(new InterfaceC23492o() { // from class: eD2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m41716d;
                    m41716d = C40808fD2.C20319a.m41716d((Throwable) obj);
                    return m41716d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLookupBirdPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupBirdPresenter.kt\nco/bird/android/app/feature/lookupbird/LookupBirdPresenterImpl$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    /* renamed from: fD2$b */
    /* loaded from: classes2.dex */
    public static final class C20321b extends Lambda implements Function1<Optional<WireBird>, Unit> {
        public C20321b() {
            super(1);
        }

        /* renamed from: a */
        public final void m41714a(Optional<WireBird> optional) {
            Unit unit;
            WireBird m59035e = optional.m59035e();
            if (m59035e != null) {
                C40808fD2.this.m41721i(m59035e);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C40808fD2.this.m41722h();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireBird> optional) {
            m41714a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fD2$c */
    /* loaded from: classes2.dex */
    public static final class C20322c extends Lambda implements Function1<Pair<? extends Unit, ? extends WireBird>, Unit> {
        public C20322c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WireBird> pair) {
            invoke2((Pair<Unit, WireBird>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WireBird> pair) {
            WireBird bird = pair.component2();
            C40808fD2.this.f79689b.mo55905y(new C32966Fu3(null, null, null, bird.getCode(), 7, null));
            C40808fD2.this.f79691d.hideKeyboard();
            InterfaceC46473om3 interfaceC46473om3 = C40808fD2.this.f79688a;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            interfaceC46473om3.mo8143L0(bird);
            C40808fD2.this.f79692e.close();
        }
    }

    public C40808fD2(InterfaceC46473om3 operatorManager, InterfaceC1880Ea analyticsManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC43180jD2 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f79688a = operatorManager;
        this.f79689b = analyticsManager;
        this.f79690c = scopeProvider;
        this.f79691d = ui;
        this.f79692e = navigator;
        C0058AG<WireBird> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<WireBird>()");
        this.f79693f = m115951g;
    }

    /* renamed from: f */
    public static final InterfaceC23447K m41724f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m41723g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m41720j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.ZC2
    /* renamed from: a */
    public void mo41729a() {
        Observable<String> mo29191O1 = this.f79691d.mo29191O1();
        final C20319a c20319a = new C20319a();
        Observable observeOn = mo29191O1.switchMapSingle(new InterfaceC23492o() { // from class: bD2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41724f;
                m41724f = C40808fD2.m41724f(Function1.this, obj);
                return m41724f;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate() …: onFailure()\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f79690c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20321b c20321b = new C20321b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: cD2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40808fD2.m41723g(Function1.this, obj);
            }
        });
    }

    @Override // p000.ZC2
    /* renamed from: c */
    public void mo41727c() {
        Observable observeOn = C24527f.m31950a(this.f79691d.mo29188w0(), this.f79693f).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.nextClicks()\n      .w…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f79690c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20322c c20322c = new C20322c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aD2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40808fD2.m41720j(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final void m41722h() {
        this.f79691d.mo29190P1(false);
        this.f79691d.mo29192L1(false);
        this.f79694g = false;
    }

    /* renamed from: i */
    public final void m41721i(WireBird wireBird) {
        this.f79693f.accept(wireBird);
        this.f79694g = true;
        this.f79691d.mo29190P1(true);
        this.f79691d.mo29192L1(true);
    }
}
