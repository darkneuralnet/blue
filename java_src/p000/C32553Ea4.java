package p000;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32553Ea4;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LEa4;", "Lf1;", "LIa4;", "LKa4;", "renderer", "", "x", "LAM3;", "e", "LAM3;", "paymentManagerV2", "LiD1;", "f", "LiD1;", "googlePayManager", "LEa;", "g", "LEa;", "analyticsManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "LRh6;", "i", "LRh6;", "userStream", "Le13;", "j", "Le13;", "navigator", "Lco/bird/android/model/PaymentAddSource;", "k", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "<init>", "(LAM3;LiD1;LEa;LTq4;LRh6;Le13;Lco/bird/android/model/PaymentAddSource;)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPurchasePaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePaymentPresenter.kt\nco/bird/android/library/purchasepayment/PurchasePaymentPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,141:1\n199#2:142\n180#2:143\n180#2:144\n237#2:145\n237#2:146\n180#2:147\n180#2:148\n*S KotlinDebug\n*F\n+ 1 PurchasePaymentPresenter.kt\nco/bird/android/library/purchasepayment/PurchasePaymentPresenter\n*L\n43#1:142\n55#1:143\n60#1:144\n90#1:145\n115#1:146\n123#1:147\n135#1:148\n*E\n"})
/* renamed from: Ea4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32553Ea4 extends AbstractC20169f1<InterfaceC33489Ia4, AbstractC33957Ka4> {

    /* renamed from: e */
    public final AM3 f7719e;

    /* renamed from: f */
    public final InterfaceC42586iD1 f7720f;

    /* renamed from: g */
    public final InterfaceC1880Ea f7721g;

    /* renamed from: h */
    public final C36207Tq4 f7722h;

    /* renamed from: i */
    public final InterfaceC35660Rh6 f7723i;

    /* renamed from: j */
    public final InterfaceC40099e13 f7724j;

    /* renamed from: k */
    public final PaymentAddSource f7725k;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$a */
    /* loaded from: classes3.dex */
    public static final class C1883a extends Lambda implements Function1<Pair<? extends String, ? extends String>, Unit> {
        public C1883a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
            invoke2((Pair<String, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, String> pair) {
            C32553Ea4.this.m42280h(new C52049yA5(pair.component2()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1884b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1884b f7727b = new C1884b();

        public C1884b() {
            super(1, C41318g46.class, DateTokenConverter.CONVERTER_KEY, "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$c */
    /* loaded from: classes3.dex */
    public static final class C1885c extends Lambda implements Function1<Boolean, Unit> {
        public C1885c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            C32553Ea4 c32553Ea4 = C32553Ea4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c32553Ea4.m42280h(new C37230Ya1(it.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "resultOk", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$d */
    /* loaded from: classes3.dex */
    public static final class C1886d extends Lambda implements Function1<Boolean, Unit> {
        public C1886d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean resultOk) {
            Intrinsics.checkNotNullExpressionValue(resultOk, "resultOk");
            if (resultOk.booleanValue()) {
                C32553Ea4.this.m42280h(C48250rm1.f107603a);
            } else {
                C32553Ea4.this.m42280h(C45146mY0.f98323a);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$e */
    /* loaded from: classes3.dex */
    public static final class C1887e extends Lambda implements Function1<Unit, Unit> {
        public C1887e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32553Ea4.this.f7724j.mo37166G1(10031, true, C32553Ea4.this.f7725k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LxD1;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(LxD1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ea4$g */
    /* loaded from: classes3.dex */
    public static final class C1889g extends Lambda implements Function1<C51479xD1, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ea4$g$a */
        /* loaded from: classes3.dex */
        public static final class C1890a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32553Ea4 f7734g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1890a(C32553Ea4 c32553Ea4) {
                super(1);
                this.f7734g = c32553Ea4;
            }

            /* renamed from: a */
            public final void m108746a(InterfaceC23465c interfaceC23465c) {
                this.f7734g.m42280h(new C53063zt2(true));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m108746a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ea4$g$b */
        /* loaded from: classes3.dex */
        public static final class C1891b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32553Ea4 f7735g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1891b(C32553Ea4 c32553Ea4) {
                super(1);
                this.f7735g = c32553Ea4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f7735g.m42280h(new C53063zt2(false));
                InterfaceC40099e13.C19924a.goToPayment$default(this.f7735g.f7724j, 10031, false, 2, null);
            }
        }

        public C1889g() {
            super(1);
        }

        /* renamed from: e */
        public static final void m108748e(C32553Ea4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(new C53063zt2(false));
            if (this$0.f7719e.mo85677e().getValue().m59037c()) {
                this$0.m42280h(C48250rm1.f107603a);
            } else {
                this$0.m42280h(C45146mY0.f98323a);
            }
        }

        /* renamed from: f */
        public static final void m108747f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(C51479xD1 c51479xD1) {
            Intrinsics.checkNotNullParameter(c51479xD1, "<name for destructuring parameter 0>");
            AbstractC23461c mo16240d = C32553Ea4.this.f7720f.mo16240d(c51479xD1.m5658a(), c51479xD1.m5657b(), true, C32553Ea4.this.f7725k);
            final C1890a c1890a = new C1890a(C32553Ea4.this);
            AbstractC23461c m33081E = mo16240d.m33081E(new InterfaceC23484g() { // from class: Fa4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32553Ea4.C1889g.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C32553Ea4 c32553Ea4 = C32553Ea4.this;
            AbstractC23461c m33029z = m33081E.m33029z(new InterfaceC23478a() { // from class: Ga4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C32553Ea4.C1889g.m108748e(C32553Ea4.this);
                }
            });
            final C1891b c1891b = new C1891b(C32553Ea4.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: Ha4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32553Ea4.C1889g.m108747f(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1892h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1892h f7736b = new C1892h();

        public C1892h() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$i */
    /* loaded from: classes3.dex */
    public static final class C1893i extends Lambda implements Function1<Unit, Unit> {
        public C1893i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32553Ea4.this.f7724j.mo37204A(10038, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea4$j */
    /* loaded from: classes3.dex */
    public static final class C1894j extends Lambda implements Function1<Pair<? extends String, ? extends String>, Unit> {
        public C1894j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
            invoke2((Pair<String, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, String> pair) {
            InterfaceC1880Ea interfaceC1880Ea = C32553Ea4.this.f7721g;
            String lowerCase = C32553Ea4.this.f7725k.name().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC1880Ea.mo55905y(new C49793uN3(null, null, null, null, "PurchasePaymentPresenter_" + lowerCase, "test_" + pair.component1(), 7, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32553Ea4(AM3 paymentManagerV2, InterfaceC42586iD1 googlePayManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream, InterfaceC40099e13 navigator, PaymentAddSource source) {
        super(EO5.f7407a);
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7719e = paymentManagerV2;
        this.f7720f = googlePayManager;
        this.f7721g = analyticsManager;
        this.f7722h = reactiveConfig;
        this.f7723i = userStream;
        this.f7724j = navigator;
        this.f7725k = source;
    }

    /* renamed from: A */
    public static final InterfaceC23496h m108775A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23496h m108774B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m108773C() {
    }

    /* renamed from: D */
    public static final void m108772D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m108771E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m108770F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m108769G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m108768f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m108767g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m108754y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m108753z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: x */
    public void consume(InterfaceC33489Ia4 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        m42280h(new C37464Za1(this.f7722h.m82623f8().getValue().getPaymentConfig().getEnablePaypal()));
        m42280h(new C38635bb1(this.f7722h.m82623f8().getValue().getPaymentConfig().getTestPaymentMethods()));
        AbstractC23442F<Boolean> mo16237g = this.f7720f.mo16237g();
        final C1885c c1885c = new C1885c();
        AbstractC23442F<Boolean> m33101w = mo16237g.m33101w(new InterfaceC23484g() { // from class: ta4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108768f(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
        Observable<Boolean> mo55994u3 = renderer.mo55994u3();
        final C1886d c1886d = new C1886d();
        Observable<Boolean> doOnNext = mo55994u3.doOnNext(new InterfaceC23484g() { // from class: wa4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108767g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Object m33094as2 = renderer.mo55998R8().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1887e c1887e = new C1887e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: xa4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108753z(Function1.this, obj);
            }
        });
        Observable<C39085cL3> mo55996T8 = renderer.mo55996T8();
        Observable<Boolean> m33123k0 = this.f7720f.mo16237g().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
        Observable m31950a = C24527f.m31950a(mo55996T8, m33123k0);
        final C1888f c1888f = new C1888f(renderer);
        AbstractC23461c flatMapCompletable = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: ya4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108775A;
                m108775A = C32553Ea4.m108775A(Function1.this, obj);
                return m108775A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<C51479xD1> mo56001P0 = renderer.mo56001P0();
        final C1889g c1889g = new C1889g();
        AbstractC23461c flatMapCompletable2 = mo56001P0.flatMapCompletable(new InterfaceC23492o() { // from class: za4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m108774B;
                m108774B = C32553Ea4.m108774B(Function1.this, obj);
                return m108774B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33041n2 = flatMapCompletable2.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Aa4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C32553Ea4.m108773C();
            }
        };
        final C1892h c1892h = C1892h.f7736b;
        ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Ba4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108772D(Function1.this, obj);
            }
        });
        Observable<Unit> mo55995a9 = renderer.mo55995a9();
        final C1893i c1893i = new C1893i();
        Observable<Unit> doOnNext2 = mo55995a9.doOnNext(new InterfaceC23484g() { // from class: Ca4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108771E(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33094as3 = doOnNext2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Observable<Pair<String, String>> mo56003G4 = renderer.mo56003G4();
        final C1894j c1894j = new C1894j();
        Observable<Pair<String, String>> doOnNext3 = mo56003G4.doOnNext(new InterfaceC23484g() { // from class: Da4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108770F(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "override fun consume(ren…      }, (Timber::d))\n  }");
        Object m33094as4 = doOnNext3.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1883a c1883a = new C1883a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ua4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108769G(Function1.this, obj);
            }
        };
        final C1884b c1884b = C1884b.f7727b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: va4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32553Ea4.m108754y(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LcL3;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ea4$f */
    /* loaded from: classes3.dex */
    public static final class C1888f extends Lambda implements Function1<Pair<? extends C39085cL3, ? extends Boolean>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC33489Ia4 f7732h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1888f(InterfaceC33489Ia4 interfaceC33489Ia4) {
            super(1);
            this.f7732h = interfaceC33489Ia4;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<C39085cL3, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C39085cL3 component1 = pair.component1();
            Boolean googlePayReady = pair.component2();
            Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
            if (googlePayReady.booleanValue()) {
                InterfaceC42586iD1 interfaceC42586iD1 = C32553Ea4.this.f7720f;
                User mo76584a = C32553Ea4.this.f7723i.mo76584a();
                Intrinsics.checkNotNull(mo76584a);
                InterfaceC33489Ia4 interfaceC33489Ia4 = this.f7732h;
                Intrinsics.checkNotNull(interfaceC33489Ia4, "null cannot be cast to non-null type android.app.Activity");
                interfaceC42586iD1.mo16236h(mo76584a, (Activity) interfaceC33489Ia4, 10030, C45097mS5.m25591o(component1.m61547b()), Long.valueOf(component1.m61546c()));
                return AbstractC23461c.m33039p();
            }
            InterfaceC40099e13.C19924a.goToPayment$default(C32553Ea4.this.f7724j, 10031, false, 2, null);
            return AbstractC23461c.m33039p();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends C39085cL3, ? extends Boolean> pair) {
            return invoke2((Pair<C39085cL3, Boolean>) pair);
        }
    }
}
