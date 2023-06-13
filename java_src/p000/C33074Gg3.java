package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.User;
import co.bird.android.model.wire.configs.LocalConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\b\b\u0001\u0010/\u001a\u00020-\u0012\b\b\u0001\u00102\u001a\u000200¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0016J\u001c\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107¨\u0006="}, m28432d2 = {"LGg3;", "Llv1;", "", "onResume", "j", "()V", "i", "h", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "Lco/bird/android/model/User;", "user", "", "zoneName", "g", "Lco/bird/android/model/RentalPlan;", "rentalPlan", "q", "Lgl;", "b", "Lgl;", "appPreference", "LEa;", "c", "LEa;", "analyticsManager", "LCx4;", DateTokenConverter.CONVERTER_KEY, "LCx4;", "rentalManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "Le13;", "f", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LKg3;", "LKg3;", "ui", "", "I", "deliveryEstimate", "", "Ljava/lang/Long;", "displayedBaseCost", "k", "perMinuteCost", "<init>", "(Lgl;LEa;LCx4;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LKg3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnDemandViabilityTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandViabilityTest.kt\nco/bird/android/app/feature/longterm/OnDemandViabilityTestPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n180#2:249\n180#2:250\n180#2:251\n180#2:252\n180#2:253\n1#3:254\n*S KotlinDebug\n*F\n+ 1 OnDemandViabilityTest.kt\nco/bird/android/app/feature/longterm/OnDemandViabilityTestPresenter\n*L\n133#1:249\n138#1:250\n143#1:251\n148#1:252\n153#1:253\n*E\n"})
/* renamed from: Gg3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33074Gg3 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final C22454gl f12238b;

    /* renamed from: c */
    public final InterfaceC1880Ea f12239c;

    /* renamed from: d */
    public final InterfaceC32292Cx4 f12240d;

    /* renamed from: e */
    public final C36207Tq4 f12241e;

    /* renamed from: f */
    public final InterfaceC40099e13 f12242f;

    /* renamed from: g */
    public final ScopeProvider f12243g;

    /* renamed from: h */
    public final InterfaceC34010Kg3 f12244h;

    /* renamed from: i */
    public int f12245i;

    /* renamed from: j */
    public Long f12246j;

    /* renamed from: k */
    public Long f12247k;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/RentalPlan;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gg3$a */
    /* loaded from: classes2.dex */
    public static final class C2907a extends Lambda implements Function1<Optional<RentalPlan>, RentalPlan> {

        /* renamed from: g */
        public static final C2907a f12248g = new C2907a();

        public C2907a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RentalPlan invoke(Optional<RentalPlan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2908b extends FunctionReferenceImpl implements Function1<RentalPlan, Unit> {
        public C2908b(Object obj) {
            super(1, obj, C33074Gg3.class, "render", "render(Lco/bird/android/model/RentalPlan;)V", 0);
        }

        /* renamed from: a */
        public final void m104893a(RentalPlan p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33074Gg3) this.receiver).m104895q(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RentalPlan rentalPlan) {
            m104893a(rentalPlan);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg3$c */
    /* loaded from: classes2.dex */
    public static final class C2909c extends Lambda implements Function1<Unit, Unit> {
        public C2909c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C33074Gg3.this.m104902j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg3$d */
    /* loaded from: classes2.dex */
    public static final class C2910d extends Lambda implements Function1<Unit, Unit> {
        public C2910d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C33074Gg3.this.m104903i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg3$e */
    /* loaded from: classes2.dex */
    public static final class C2911e extends Lambda implements Function1<Unit, Unit> {
        public C2911e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C33074Gg3.this.m104904h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gg3$f */
    /* loaded from: classes2.dex */
    public static final class C2912f extends Lambda implements Function1<Unit, Unit> {
        public C2912f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40157g("Cancel clicked", new Object[0]);
            C33074Gg3.this.f12242f.close();
        }
    }

    public C33074Gg3(C22454gl appPreference, InterfaceC1880Ea analyticsManager, InterfaceC32292Cx4 rentalManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC34010Kg3 ui) {
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f12238b = appPreference;
        this.f12239c = analyticsManager;
        this.f12240d = rentalManager;
        this.f12241e = reactiveConfig;
        this.f12242f = navigator;
        this.f12243g = scopeProvider;
        this.f12244h = ui;
        this.f12245i = -1;
    }

    /* renamed from: k */
    public static final RentalPlan m104901k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RentalPlan) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m104900l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m104899m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m104898n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m104897o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m104896p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        Observable<Object> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    /* renamed from: g */
    public final String m104905g(User user, String str) {
        String email;
        String id;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.scheme("https");
        builder.host("birdrides.typeform.com");
        builder.addPathSegments("to/SqivZZ");
        if (user != null && (id = user.getId()) != null) {
            builder.addQueryParameter("userId", id);
        }
        if (user != null && (email = user.getEmail()) != null) {
            builder.addQueryParameter("email", email);
        }
        if (str != null) {
            builder.addQueryParameter("zone", str);
        }
        return builder.build().toString();
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(false)");
        return just;
    }

    /* renamed from: h */
    public final void m104904h() {
        String str;
        C41318g46.m40157g("Show feedback clicked", new Object[0]);
        this.f12239c.mo55905y(new C52341yg3(null, null, null, this.f12245i, this.f12246j, this.f12247k, 7, null));
        this.f12242f.close();
        InterfaceC40099e13 interfaceC40099e13 = this.f12242f;
        User m37750B0 = this.f12238b.m37750B0();
        LocalConfig localConfig = this.f12241e.m82623f8().m73665a().getLocalConfig();
        if (localConfig != null) {
            str = localConfig.getName();
        } else {
            str = null;
        }
        interfaceC40099e13.mo36983m2(m104905g(m37750B0, str));
    }

    /* renamed from: i */
    public final void m104903i() {
        C41318g46.m40157g("Negative button click", new Object[0]);
        this.f12239c.mo55905y(new C51155wg3(null, null, null, this.f12245i, this.f12246j, this.f12247k, 7, null));
        this.f12242f.close();
    }

    /* renamed from: j */
    public final void m104902j() {
        C41318g46.m40157g("Positive button click", new Object[0]);
        this.f12239c.mo55905y(new C51748xg3(null, null, null, this.f12245i, this.f12246j, this.f12247k, 7, null));
        this.f12244h.mo96479D0();
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        InterfaceC44782lv1.C25814a.m26676g(this);
        Observable<Optional<RentalPlan>> mo87536c = this.f12240d.mo87536c();
        final C2907a c2907a = C2907a.f12248g;
        Observable observeOn = mo87536c.map(new InterfaceC23492o() { // from class: Ag3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RentalPlan m104901k;
                m104901k = C33074Gg3.m104901k(Function1.this, obj);
                return m104901k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rentalManager.onDemandPl…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f12243g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2908b c2908b = new C2908b(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Bg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33074Gg3.m104900l(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f12244h.mo96480C0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.positiveClicks\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f12243g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2909c c2909c = new C2909c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Cg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33074Gg3.m104899m(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f12244h.mo96478E0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.negativeClicks\n      …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f12243g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2910d c2910d = new C2910d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Dg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33074Gg3.m104898n(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f12244h.mo96477F0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.feedbackClicks\n      …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f12243g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2911e c2911e = new C2911e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Eg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33074Gg3.m104897o(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f12244h.mo96475z0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.cancelClicks\n      .o…dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f12243g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2912f c2912f = new C2912f();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Fg3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33074Gg3.m104896p(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    /* renamed from: q */
    public final void m104895q(RentalPlan rentalPlan) {
        boolean z;
        Integer shortestOnDemandEstimate = rentalPlan.getShortestOnDemandEstimate();
        Intrinsics.checkNotNull(shortestOnDemandEstimate);
        this.f12245i = shortestOnDemandEstimate.intValue();
        this.f12246j = Long.valueOf(rentalPlan.getBaseCost());
        this.f12247k = Long.valueOf(rentalPlan.getBirdCareCost());
        this.f12244h.mo96476G0(this.f12245i);
        if (rentalPlan.getBaseCost() > 0 && rentalPlan.getBirdCareCost() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12244h.mo96481B0(z);
        if (z) {
            this.f12244h.mo96482A0((int) rentalPlan.getBaseCost(), (int) rentalPlan.getBirdCareCost(), C45097mS5.m25591o(rentalPlan.getCurrency()));
        }
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.CLOSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.CLOSE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
