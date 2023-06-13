package p000;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.InterfaceC13676b;
import co.bird.android.model.Balance;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44647lh6;
import p000.S74;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bq\b\u0007\u0012\u000e\b\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0001\u0010!\u001a\u00020\u001e\u0012\b\b\u0001\u0010%\u001a\u00020\"\u0012\b\b\u0001\u0010)\u001a\u00020&\u0012\b\b\u0001\u0010,\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00062"}, m28432d2 = {"Lgr;", "LxC;", "", "", C17296a.f69688o, "", "autoPayActivated", "F", "LEg1;", "c", "LEg1;", "eventBus", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "Llh6;", "e", "Llh6;", "userManager", "Lqi1;", "f", "Lqi1;", "experimentManager", "g", "appPreference", "LTq4;", "h", "LTq4;", "reactiveConfig", "Landroid/content/res/Resources;", "i", "Landroid/content/res/Resources;", "resources", "Lco/bird/android/app/feature/autopay/b;", "j", "Lco/bird/android/app/feature/autopay/b;", "ui", "Le13;", "k", "Le13;", "navigator", "l", "Z", "startedForResult", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;Lgl;Llh6;Lqi1;Lgl;LTq4;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoPayPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayPresenter.kt\nco/bird/android/app/feature/autopay/AutoPayPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,105:1\n237#2:106\n180#2:107\n180#2:108\n*S KotlinDebug\n*F\n+ 1 AutoPayPresenter.kt\nco/bird/android/app/feature/autopay/AutoPayPresenterImpl\n*L\n58#1:106\n74#1:107\n89#1:108\n*E\n"})
/* renamed from: gr */
/* loaded from: classes2.dex */
public final class C22485gr extends C30060xC {

    /* renamed from: c */
    public final InterfaceC32604Eg1 f84348c;

    /* renamed from: d */
    public final C22454gl f84349d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f84350e;

    /* renamed from: f */
    public final InterfaceC47617qi1 f84351f;

    /* renamed from: g */
    public final C22454gl f84352g;

    /* renamed from: h */
    public final C36207Tq4 f84353h;

    /* renamed from: i */
    public final Resources f84354i;

    /* renamed from: j */
    public final InterfaceC13676b f84355j;

    /* renamed from: k */
    public final InterfaceC40099e13 f84356k;

    /* renamed from: l */
    public final boolean f84357l;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gr$a */
    /* loaded from: classes2.dex */
    public static final class C22486a extends Lambda implements Function1<Unit, Unit> {
        public C22486a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            S74.C7343a.showProgress$default(C22485gr.this.f84355j, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gr$b */
    /* loaded from: classes2.dex */
    public static final class C22487b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Balance>> {
        public C22487b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Balance> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC44647lh6.C25764a.updateAutoPay$default(C22485gr.this.f84350e, true, true, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gr$c */
    /* loaded from: classes2.dex */
    public static final class C22488c extends Lambda implements Function1<Throwable, Unit> {
        public C22488c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C22485gr.this.f84355j.error(C22485gr.this.f84354i.getString(C45871nl4.error_generic_body));
            S74.C7343a.showProgress$default(C22485gr.this.f84355j, false, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gr$d */
    /* loaded from: classes2.dex */
    public static final class C22489d extends Lambda implements Function1<Balance, Unit> {
        public C22489d() {
            super(1);
        }

        /* renamed from: a */
        public final void m37401a(Balance balance) {
            C22485gr.this.m37414F(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m37401a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gr$e */
    /* loaded from: classes2.dex */
    public static final class C22490e extends Lambda implements Function1<Unit, Unit> {
        public C22490e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            S74.C7343a.showProgress$default(C22485gr.this.f84355j, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gr$f */
    /* loaded from: classes2.dex */
    public static final class C22491f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Balance>> {
        public C22491f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Balance> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC44647lh6.C25764a.updateAutoPay$default(C22485gr.this.f84350e, false, true, null, 4, null).m33140a0(500L, TimeUnit.MILLISECONDS).m33148R(new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gr$g */
    /* loaded from: classes2.dex */
    public static final class C22492g extends Lambda implements Function1<Balance, Unit> {
        public C22492g() {
            super(1);
        }

        /* renamed from: a */
        public final void m37400a(Balance balance) {
            C22485gr.this.m37414F(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m37400a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gr$h */
    /* loaded from: classes2.dex */
    public static final class C22493h extends Lambda implements Function1<Throwable, Unit> {
        public C22493h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C22485gr.this.m37414F(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22485gr(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC32604Eg1 eventBus, C22454gl preference, InterfaceC44647lh6 userManager, InterfaceC47617qi1 experimentManager, C22454gl appPreference, C36207Tq4 reactiveConfig, Resources resources, InterfaceC13676b ui, InterfaceC40099e13 navigator, boolean z) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f84348c = eventBus;
        this.f84349d = preference;
        this.f84350e = userManager;
        this.f84351f = experimentManager;
        this.f84352g = appPreference;
        this.f84353h = reactiveConfig;
        this.f84354i = resources;
        this.f84355j = ui;
        this.f84356k = navigator;
        this.f84357l = z;
    }

    /* renamed from: G */
    public static final void m37413G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m37412H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m37411I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m37410J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m37409K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m37408L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m37407M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m37406N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public final void m37414F(boolean z) {
        this.f84349d.m37720I2(System.currentTimeMillis());
        if (this.f84357l) {
            this.f84348c.mo104915c(new C8800Vq(z));
        }
        this.f84356k.close();
    }

    /* renamed from: a */
    public void m37405a() {
        RideConfig rideConfig = this.f84353h.m82623f8().getValue().getRideConfig();
        String autoPayExpName = rideConfig.getAutoPayExpName();
        if (autoPayExpName != null) {
            AbstractC23461c m33069Q = this.f84351f.mo15556a(autoPayExpName).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "experimentManager.markSt…       .onErrorComplete()");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        Currency currency = Currency.getInstance(rideConfig.getCurrency());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(rideConfig.currency)");
        this.f84355j.mo60814Lb(rideConfig.getAutoPayRefillAmount(), currency);
        Observable<Unit> mo60810t3 = this.f84355j.mo60810t3();
        final C22486a c22486a = new C22486a();
        Observable<Unit> doOnNext = mo60810t3.doOnNext(new InterfaceC23484g() { // from class: Yq
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37413G(Function1.this, obj);
            }
        });
        final C22487b c22487b = new C22487b();
        Observable observeOn = doOnNext.switchMapSingle(new InterfaceC23492o() { // from class: Zq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m37412H;
                m37412H = C22485gr.m37412H(Function1.this, obj);
                return m37412H;
            }
        }).observeOn(C23454a.m33087a());
        final C22488c c22488c = new C22488c();
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: ar
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37411I(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate() …ted = false)\n      })\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22489d c22489d = new C22489d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: br
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37410J(Function1.this, obj);
            }
        });
        Observable<Unit> mo60811l1 = this.f84355j.mo60811l1();
        final C22490e c22490e = new C22490e();
        Observable<Unit> doOnNext2 = mo60811l1.doOnNext(new InterfaceC23484g() { // from class: cr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37409K(Function1.this, obj);
            }
        });
        final C22491f c22491f = new C22491f();
        Observable observeOn2 = doOnNext2.switchMapSingle(new InterfaceC23492o() { // from class: dr
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m37408L;
                m37408L = C22485gr.m37408L(Function1.this, obj);
                return m37408L;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate() …ted = false)\n      })\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22492g c22492g = new C22492g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: er
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37407M(Function1.this, obj);
            }
        };
        final C22493h c22493h = new C22493h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: fr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C22485gr.m37406N(Function1.this, obj);
            }
        });
    }
}
