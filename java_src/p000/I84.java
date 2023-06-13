package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireCouponDisplayView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.I84;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LI84;", "", "", "j", "LV74;", C17296a.f69688o, "LV74;", "promoManager", "Ls84;", "b", "Ls84;", "converter", "LP84;", "c", "LP84;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "e", "LTq4;", "reactiveConfig", "<init>", "(LV74;Ls84;LP84;Lcom/uber/autodispose/ScopeProvider;LTq4;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPromotionsCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterPresenter.kt\nco/bird/android/feature/promotions/PromotionsCenterPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,80:1\n237#2:81\n180#2:82\n237#2:83\n237#2:84\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterPresenter.kt\nco/bird/android/feature/promotions/PromotionsCenterPresenter\n*L\n35#1:81\n44#1:82\n60#1:83\n75#1:84\n*E\n"})
/* renamed from: I84 */
/* loaded from: classes3.dex */
public final class I84 {

    /* renamed from: a */
    public final V74 f14568a;

    /* renamed from: b */
    public final C48471s84 f14569b;

    /* renamed from: c */
    public final P84 f14570c;

    /* renamed from: d */
    public final ScopeProvider f14571d;

    /* renamed from: e */
    public final C36207Tq4 f14572e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I84$a */
    /* loaded from: classes3.dex */
    public static final class C3332a extends Lambda implements Function1<Unit, Unit> {
        public C3332a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            I84.this.f14570c.m90705Sl(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I84$b */
    /* loaded from: classes3.dex */
    public static final class C3333b extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: I84$b$a */
        /* loaded from: classes3.dex */
        public static final class C3334a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ I84 f14575g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3334a(I84 i84) {
                super(1);
                this.f14575g = i84;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f14575g.f14570c.error(C45871nl4.error_generic_body);
            }
        }

        public C3333b() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c m33070P = I84.this.f14568a.mo27763z().m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "promoManager.refreshCoup…dSchedulers.mainThread())");
            AbstractC23461c progress$default = C28237sD.progress$default(m33070P, I84.this.f14570c, 0, 2, (Object) null);
            final C3334a c3334a = new C3334a(I84.this);
            return progress$default.m33084B(new InterfaceC23484g() { // from class: J84
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    I84.C3333b.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCouponDisplayView;", "it", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I84$c */
    /* loaded from: classes3.dex */
    public static final class C3335c extends Lambda implements Function1<List<? extends WireCouponDisplayView>, List<? extends C3023H6>> {
        public C3335c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<WireCouponDisplayView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return I84.this.f14569b.m14669a(it, I84.this.f14572e.m82623f8().m73665a().getEnableGiveFreeRides());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I84$d */
    /* loaded from: classes3.dex */
    public static final class C3336d extends Lambda implements Function1<Throwable, Unit> {
        public C3336d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            I84.this.f14570c.error(C45871nl4.error_generic_title);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I84$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3337e extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C3337e(Object obj) {
            super(1, obj, P84.class, "populateSections", "populateSections(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((P84) this.receiver).m90706Rl(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I84$f */
    /* loaded from: classes3.dex */
    public static final class C3338f extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: I84$f$a */
        /* loaded from: classes3.dex */
        public static final class C3339a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ I84 f14579g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3339a(I84 i84) {
                super(1);
                this.f14579g = i84;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                P84 p84 = this.f14579g.f14570c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                p84.error(it);
            }
        }

        public C3338f() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23496h m102888d(I84 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f14568a.mo27763z();
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            AbstractC23442F<WireCoupon> m33152N = I84.this.f14568a.mo27793g(code).m33152N(C23454a.m33087a());
            final C3339a c3339a = new C3339a(I84.this);
            AbstractC23461c m33069Q = m33152N.m33106t(new InterfaceC23484g() { // from class: K84
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    I84.C3338f.invoke$lambda$0(Function1.this, obj);
                }
            }).m33159G().m33069Q();
            final I84 i84 = I84.this;
            AbstractC23461c m33049i = m33069Q.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: L84
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m102888d;
                    m102888d = I84.C3338f.m102888d(I84.this);
                    return m102888d;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m33049i, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
            return C28237sD.progress$default(m33049i, I84.this.f14570c, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I84$g */
    /* loaded from: classes3.dex */
    public static final class C3340g extends Lambda implements Function1<Throwable, Unit> {
        public C3340g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            I84.this.f14570c.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "couponId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: I84$h */
    /* loaded from: classes3.dex */
    public static final class C3341h extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: I84$h$a */
        /* loaded from: classes3.dex */
        public static final class C3342a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ I84 f14582g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3342a(I84 i84) {
                super(1);
                this.f14582g = i84;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                P84 p84 = this.f14582g.f14570c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                p84.error(it);
            }
        }

        public C3341h() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23496h m102884d(I84 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f14568a.mo27763z();
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(String couponId) {
            Intrinsics.checkNotNullParameter(couponId, "couponId");
            AbstractC23461c m33070P = I84.this.f14568a.mo27800c(couponId).m33070P(C23454a.m33087a());
            final C3342a c3342a = new C3342a(I84.this);
            AbstractC23461c m33069Q = m33070P.m33084B(new InterfaceC23484g() { // from class: M84
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    I84.C3341h.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
            final I84 i84 = I84.this;
            AbstractC23461c m33049i = m33069Q.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: N84
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m102884d;
                    m102884d = I84.C3341h.m102884d(I84.this);
                    return m102884d;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m33049i, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
            return C28237sD.progress$default(m33049i, I84.this.f14570c, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: I84$i */
    /* loaded from: classes3.dex */
    public static final class C3343i extends Lambda implements Function1<Throwable, Unit> {
        public C3343i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            I84.this.f14570c.error(C45871nl4.error_generic_body);
        }
    }

    public I84(V74 promoManager, C48471s84 converter, P84 ui, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f14568a = promoManager;
        this.f14569b = converter;
        this.f14570c = ui;
        this.f14571d = scopeProvider;
        this.f14572e = reactiveConfig;
    }

    /* renamed from: k */
    public static final void m102903k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final InterfaceC23496h m102902l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final List m102901m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m102900n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m102899o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23496h m102898p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m102897q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23496h m102896r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m102895s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public final void m102904j() {
        Observable<Unit> m90704Tl = this.f14570c.m90704Tl();
        final C3332a c3332a = new C3332a();
        Observable<Unit> startWith = m90704Tl.doOnNext(new InterfaceC23484g() { // from class: z84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I84.m102903k(Function1.this, obj);
            }
        }).startWith((Observable<Unit>) Unit.INSTANCE);
        final C3333b c3333b = new C3333b();
        AbstractC23461c switchMapCompletable = startWith.switchMapCompletable(new InterfaceC23492o() { // from class: A84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102902l;
                m102902l = I84.m102902l(Function1.this, obj);
                return m102902l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f14571d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<List<WireCouponDisplayView>> mo27798d = this.f14568a.mo27798d();
        final C3335c c3335c = new C3335c();
        Observable observeOn = mo27798d.map(new InterfaceC23492o() { // from class: B84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m102901m;
                m102901m = I84.m102901m(Function1.this, obj);
                return m102901m;
            }
        }).observeOn(C23454a.m33087a());
        final C3336d c3336d = new C3336d();
        Observable onErrorResumeNext = observeOn.doOnError(new InterfaceC23484g() { // from class: C84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I84.m102900n(Function1.this, obj);
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
        Object m33094as = onErrorResumeNext.m33094as(AutoDispose.m45239a(this.f14571d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3337e c3337e = new C3337e(this.f14570c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: D84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I84.m102899o(Function1.this, obj);
            }
        });
        Observable<String> m90707Ql = this.f14570c.m90707Ql();
        final C3338f c3338f = new C3338f();
        AbstractC23461c m33070P = m90707Ql.flatMapCompletable(new InterfaceC23492o() { // from class: E84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102898p;
                m102898p = I84.m102898p(Function1.this, obj);
                return m102898p;
            }
        }).m33070P(C23454a.m33087a());
        final C3340g c3340g = new C3340g();
        AbstractC23461c m33066T = m33070P.m33084B(new InterfaceC23484g() { // from class: F84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I84.m102897q(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(this.f14571d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<String> m90708Pl = this.f14570c.m90708Pl();
        final C3341h c3341h = new C3341h();
        AbstractC23461c m33070P2 = m90708Pl.flatMapCompletable(new InterfaceC23492o() { // from class: G84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102896r;
                m102896r = I84.m102896r(Function1.this, obj);
                return m102896r;
            }
        }).m33070P(C23454a.m33087a());
        final C3343i c3343i = new C3343i();
        AbstractC23461c m33066T2 = m33070P2.m33084B(new InterfaceC23484g() { // from class: H84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                I84.m102895s(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "fun onCreate() {\n    ui.…r)\n      .subscribe()\n  }");
        Object m33041n3 = m33066T2.m33041n(AutoDispose.m45239a(this.f14571d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
    }
}
