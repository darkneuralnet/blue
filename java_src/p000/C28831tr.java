package p000;

import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ride.presenter.PaymentIntentException;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.PaymentIntentStatusKt;
import co.bird.android.model.PlanItemModel;
import co.bird.android.model.REQUIRES_AUTHENTICATION;
import co.bird.android.model.REQUIRES_PAYMENT_METHOD;
import co.bird.android.model.UNEXPECTED;
import co.bird.android.navigator.AutoPayV2Answer;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C28831tr;
import p000.InterfaceC40099e13;
import p000.InterfaceC44647lh6;
import p000.InterfaceC46820pM3;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u0005BO\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(¨\u0006-"}, m28432d2 = {"Ltr;", "Lmr;", "Lco/bird/android/model/PlanItemModel;", "autoPayPlan", "Lio/reactivex/c;", C17296a.f69688o, "b", "n", "i", "Llh6;", "Llh6;", "userManager", "LpM3;", "LpM3;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "LAM3;", DateTokenConverter.CONVERTER_KEY, "LAM3;", "paymentManagerV2", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "Landroidx/appcompat/app/AppCompatActivity;", "f", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Le13;", "g", "Le13;", "navigator", "Lqs;", "h", "Lqs;", "ui", "", "Ljava/lang/String;", "selectedPlanId", "<init>", "(Llh6;LpM3;LEa;LAM3;Landroid/os/Handler;Landroidx/appcompat/app/AppCompatActivity;Le13;Lqs;)V", "j", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tr */
/* loaded from: classes2.dex */
public final class C28831tr implements InterfaceC26272mr {

    /* renamed from: j */
    public static final C28832a f111120j = new C28832a(null);

    /* renamed from: k */
    public static final int f111121k = 8;

    /* renamed from: a */
    public final InterfaceC44647lh6 f111122a;

    /* renamed from: b */
    public final InterfaceC46820pM3 f111123b;

    /* renamed from: c */
    public final InterfaceC1880Ea f111124c;

    /* renamed from: d */
    public final AM3 f111125d;

    /* renamed from: e */
    public final Handler f111126e;

    /* renamed from: f */
    public final AppCompatActivity f111127f;

    /* renamed from: g */
    public final InterfaceC40099e13 f111128g;

    /* renamed from: h */
    public final InterfaceC27711qs f111129h;

    /* renamed from: i */
    public String f111130i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Ltr$a;", "", "", "PAYMENT_ERROR_EXIT_DELAY_MILLIS", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tr$a */
    /* loaded from: classes2.dex */
    public static final class C28832a {
        public /* synthetic */ C28832a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28832a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "balance", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tr$b */
    /* loaded from: classes2.dex */
    public static final class C28833b extends Lambda implements Function1<Balance, Unit> {
        public C28833b() {
            super(1);
        }

        /* renamed from: a */
        public final void m11620a(Balance balance) {
            String intentId = balance.getIntentId();
            if (intentId != null) {
                InterfaceC46820pM3 interfaceC46820pM3 = C28831tr.this.f111123b;
                String clientSecret = balance.getClientSecret();
                Intrinsics.checkNotNull(clientSecret);
                interfaceC46820pM3.mo8809h(intentId, clientSecret);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m11620a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "balance", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Balance;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tr$c */
    /* loaded from: classes2.dex */
    public static final class C28834c extends Lambda implements Function1<Balance, InterfaceC23496h> {
        public C28834c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Balance balance) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            if (balance.getIntentId() == null) {
                C28831tr.this.f111123b.mo8810g(COMPLETE.INSTANCE);
                return AbstractC23461c.m33039p();
            }
            return C28831tr.this.f111123b.mo8798s();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tr$d */
    /* loaded from: classes2.dex */
    public static final class C28835d extends Lambda implements Function1<Throwable, Unit> {
        public C28835d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C28831tr.this.f111123b.mo8810g(new UNEXPECTED(th));
            C28831tr.this.f111124c.mo55905y(new C40090e04(null, null, null, EnumC46829pN3.CARD.toString(), th.getMessage(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "kotlin.jvm.PlatformType", "it", "", "b", "(Lco/bird/android/model/PaymentIntentStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoPayV2PaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2PaymentIntentDelegateImpl.kt\nco/bird/android/app/feature/autopay/AutoPayV2PaymentIntentDelegateImpl$observePaymentStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
    /* renamed from: tr$e */
    /* loaded from: classes2.dex */
    public static final class C28836e extends Lambda implements Function1<PaymentIntentStatus, Unit> {
        public C28836e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m11616c(C28831tr this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f111127f.setResult(0, X52.m77424a(new AutoPayV2Answer(this$0.f111130i)));
            this$0.f111128g.close();
        }

        /* renamed from: b */
        public final void m11617b(PaymentIntentStatus paymentIntentStatus) {
            Unit unit;
            if (paymentIntentStatus instanceof REQUIRES_AUTHENTICATION) {
                C28831tr.this.f111123b.mo8804m(C28831tr.this.f111127f);
            } else if (paymentIntentStatus instanceof REQUIRES_PAYMENT_METHOD) {
                InterfaceC40099e13.C19924a.goToEnterCard$default(C28831tr.this.f111128g, CI4.ADD_CARD.ordinal(), false, PaymentAddSource.PRELOAD_SCREEN, 2, null);
            } else if (paymentIntentStatus instanceof COMPLETE) {
                C28831tr.this.f111127f.setResult(-1, X52.m77424a(new AutoPayV2Answer(C28831tr.this.f111130i)));
                C28831tr.this.f111128g.close();
            } else if (paymentIntentStatus instanceof UNEXPECTED) {
                Throwable throwable = ((UNEXPECTED) paymentIntentStatus).getThrowable();
                if (throwable != null) {
                    C28831tr.this.f111129h.error(throwable);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C28831tr.this.f111129h.error(C45871nl4.payment_error_title);
                }
                Handler handler = C28831tr.this.f111126e;
                final C28831tr c28831tr = C28831tr.this;
                handler.postDelayed(new Runnable() { // from class: ur
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28831tr.C28836e.m11616c(C28831tr.this);
                    }
                }, 3000L);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentIntentStatus paymentIntentStatus) {
            m11617b(paymentIntentStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tr$f */
    /* loaded from: classes2.dex */
    public static final class C28837f extends Lambda implements Function1<PaymentIntentStatus, Boolean> {

        /* renamed from: g */
        public static final C28837f f111135g = new C28837f();

        public C28837f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentIntentStatus it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(PaymentIntentStatusKt.isEnded(it));
        }
    }

    public C28831tr(InterfaceC44647lh6 userManager, InterfaceC46820pM3 manager, InterfaceC1880Ea analyticsManager, AM3 paymentManagerV2, Handler handler, AppCompatActivity activity, InterfaceC40099e13 navigator, InterfaceC27711qs ui) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f111122a = userManager;
        this.f111123b = manager;
        this.f111124c = analyticsManager;
        this.f111125d = paymentManagerV2;
        this.f111126e = handler;
        this.f111127f = activity;
        this.f111128g = navigator;
        this.f111129h = ui;
    }

    /* renamed from: j */
    public static final void m11627j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23496h m11626k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m11625l(C28831tr this$0, PlanItemModel autoPayPlan) {
        EnumC46829pN3 enumC46829pN3;
        Long l;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(autoPayPlan, "$autoPayPlan");
        InterfaceC1880Ea interfaceC1880Ea = this$0.f111124c;
        BirdPayment m59035e = this$0.f111125d.mo85677e().getValue().m59035e();
        if (m59035e == null || (enumC46829pN3 = C52164yN3.m3534a(m59035e)) == null) {
            enumC46829pN3 = EnumC46829pN3.CARD;
        }
        String enumC46829pN32 = enumC46829pN3.toString();
        Integer incentiveAmount = autoPayPlan.getIncentiveAmount();
        if (incentiveAmount != null) {
            l = Long.valueOf(incentiveAmount.intValue());
        } else {
            l = null;
        }
        String currency = autoPayPlan.getCurrency();
        interfaceC1880Ea.mo55905y(new C40683f04(null, null, null, enumC46829pN32, Boolean.TRUE, autoPayPlan.getPlanId(), Long.valueOf(autoPayPlan.getRefillAmount()), currency, l, 7, null));
    }

    /* renamed from: m */
    public static final void m11624m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m11622o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m11621p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC26272mr
    /* renamed from: a */
    public AbstractC23461c mo11636a(PlanItemModel autoPayPlan) {
        Intrinsics.checkNotNullParameter(autoPayPlan, "autoPayPlan");
        this.f111123b.mo8808i();
        AbstractC23461c m33072N = m11623n().m33072N(m11628i(autoPayPlan));
        Intrinsics.checkNotNullExpressionValue(m33072N, "observePaymentStatus().m…ymentIntent(autoPayPlan))");
        return m33072N;
    }

    @Override // p000.InterfaceC26272mr
    /* renamed from: b */
    public AbstractC23461c mo11635b(PlanItemModel autoPayPlan) {
        Intrinsics.checkNotNullParameter(autoPayPlan, "autoPayPlan");
        return m11628i(autoPayPlan);
    }

    /* renamed from: i */
    public final AbstractC23461c m11628i(final PlanItemModel planItemModel) {
        AbstractC23442F<Balance> m33100x;
        this.f111130i = planItemModel.getPlanId();
        if (this.f111123b.mo8800q() == null) {
            AbstractC23442F updateAutoPayForPaymentIntent$default = InterfaceC44647lh6.C25764a.updateAutoPayForPaymentIntent$default(this.f111122a, true, true, this.f111130i, null, null, 24, null);
            final C28833b c28833b = new C28833b();
            m33100x = updateAutoPayForPaymentIntent$default.m33101w(new InterfaceC23484g() { // from class: nr
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C28831tr.m11627j(Function1.this, obj);
                }
            });
        } else {
            String paymentMethodId = this.f111123b.getPaymentMethodId();
            if (paymentMethodId != null) {
                m33100x = this.f111122a.mo26971X(true, true, this.f111130i, this.f111123b.mo8800q(), paymentMethodId);
            } else {
                InterfaceC46820pM3 interfaceC46820pM3 = this.f111123b;
                String string = this.f111127f.getString(C45871nl4.payment_error_generic);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.payment_error_generic)");
                interfaceC46820pM3.mo8810g(new UNEXPECTED(new PaymentIntentException(string)));
                this.f111124c.mo55905y(new C40090e04(null, null, null, EnumC46829pN3.CARD.toString(), "Payment method id should not be null.", 7, null));
                m33100x = AbstractC23442F.m33100x(new IllegalStateException("Payment method id should not be null."));
            }
        }
        AbstractC23442F<Balance> m33152N = m33100x.m33152N(C24542a.m31932c());
        final C28834c c28834c = new C28834c();
        AbstractC23461c m33029z = m33152N.m33164B(new InterfaceC23492o() { // from class: or
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m11626k;
                m11626k = C28831tr.m11626k(Function1.this, obj);
                return m11626k;
            }
        }).m33029z(new InterfaceC23478a() { // from class: pr
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28831tr.m11625l(C28831tr.this, planItemModel);
            }
        });
        final C28835d c28835d = new C28835d();
        AbstractC23461c m33069Q = m33029z.m33084B(new InterfaceC23484g() { // from class: qr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28831tr.m11624m(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun handleAutoPa…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    /* renamed from: n */
    public final AbstractC23461c m11623n() {
        Observable m74576S = C37279Yf5.m74576S(InterfaceC46820pM3.C27275a.observePaymentStatus$default(this.f111123b, false, 1, null));
        final C28836e c28836e = new C28836e();
        Observable doOnNext = m74576S.doOnNext(new InterfaceC23484g() { // from class: rr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28831tr.m11622o(Function1.this, obj);
            }
        });
        final C28837f c28837f = C28837f.f111135g;
        AbstractC23461c m33159G = doOnNext.filter(new InterfaceC23494q() { // from class: sr
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m11621p;
                m11621p = C28831tr.m11621p(Function1.this, obj);
                return m11621p;
            }
        }).singleOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun observePayme…     .ignoreElement()\n  }");
        return m33159G;
    }
}
