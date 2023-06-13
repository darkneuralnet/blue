package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CashpayResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\tB1\b\u0007\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b\u001f\u0010$\"\u0004\b%\u0010&¨\u0006+"}, m28432d2 = {"LBg0;", "Lwg0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "LDg0;", C17296a.f69688o, "LDg0;", "f", "()LDg0;", "ui", "LTq4;", "b", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LAM3;", "e", "LAM3;", "paymentManager", "Lco/bird/android/model/CashpayResponse;", "Lco/bird/android/model/CashpayResponse;", "()Lco/bird/android/model/CashpayResponse;", "k", "(Lco/bird/android/model/CashpayResponse;)V", "responseData", "<init>", "(LDg0;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;LAM3;)V", "g", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCashpayPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashpayPresenter.kt\nco/bird/android/app/feature/payment/CashpayPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,80:1\n199#2:81\n161#2:82\n*S KotlinDebug\n*F\n+ 1 CashpayPresenter.kt\nco/bird/android/app/feature/payment/CashpayPresenterImpl\n*L\n50#1:81\n65#1:82\n*E\n"})
/* renamed from: Bg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31901Bg0 implements InterfaceC51152wg0 {

    /* renamed from: g */
    public static final C0678a f2642g = new C0678a(null);

    /* renamed from: h */
    public static final int f2643h = 8;

    /* renamed from: a */
    public final InterfaceC32369Dg0 f2644a;

    /* renamed from: b */
    public final C36207Tq4 f2645b;

    /* renamed from: c */
    public final ScopeProvider f2646c;

    /* renamed from: d */
    public final InterfaceC40099e13 f2647d;

    /* renamed from: e */
    public final AM3 f2648e;

    /* renamed from: f */
    public CashpayResponse f2649f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LBg0$a;", "", "", "responseBundleKey", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Bg0$a */
    /* loaded from: classes2.dex */
    public static final class C0678a {
        public /* synthetic */ C0678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0678a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/CashpayResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bg0$b */
    /* loaded from: classes2.dex */
    public static final class C0679b extends Lambda implements Function1<HM4<CashpayResponse>, Unit> {
        public C0679b() {
            super(1);
        }

        /* renamed from: a */
        public final void m113712a(HM4<CashpayResponse> hm4) {
            CashpayResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C31901Bg0.this.m113718f().mo104927Ii(m103944a);
                C31901Bg0.this.m113713k(m103944a);
                return;
            }
            C31901Bg0.this.m113718f().mo104920za();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CashpayResponse> hm4) {
            m113712a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bg0$c */
    /* loaded from: classes2.dex */
    public static final class C0680c extends Lambda implements Function1<Unit, Boolean> {
        public C0680c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C31901Bg0.this.m113719e() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bg0$d */
    /* loaded from: classes2.dex */
    public static final class C0681d extends Lambda implements Function1<Unit, Unit> {
        public C0681d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = C31901Bg0.this.f2647d;
            CashpayResponse m113719e = C31901Bg0.this.m113719e();
            Intrinsics.checkNotNull(m113719e);
            InterfaceC40099e13.C19924a.goToWebView$default(interfaceC40099e13, m113719e.getLocationsUrl(), null, null, false, 14, null);
        }
    }

    public C31901Bg0(InterfaceC32369Dg0 ui, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, AM3 paymentManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        this.f2644a = ui;
        this.f2645b = reactiveConfig;
        this.f2646c = scopeProvider;
        this.f2647d = navigator;
        this.f2648e = paymentManager;
    }

    /* renamed from: g */
    public static final boolean m113717g(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof IOException;
    }

    /* renamed from: h */
    public static final void m113716h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final boolean m113715i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j */
    public static final void m113714j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final CashpayResponse m113719e() {
        return this.f2649f;
    }

    /* renamed from: f */
    public final InterfaceC32369Dg0 m113718f() {
        return this.f2644a;
    }

    /* renamed from: k */
    public final void m113713k(CashpayResponse cashpayResponse) {
        this.f2649f = cashpayResponse;
    }

    @Override // p000.InterfaceC51152wg0
    public void onCreate(Bundle bundle) {
        CashpayResponse cashpayResponse;
        if (bundle != null) {
            cashpayResponse = (CashpayResponse) bundle.getParcelable("CASHPAY_RESPONSE_DATA");
        } else {
            cashpayResponse = null;
        }
        this.f2649f = cashpayResponse;
        if (cashpayResponse != null) {
            this.f2644a.mo104927Ii(cashpayResponse);
        } else {
            AbstractC23442F<HM4<CashpayResponse>> m33143W = this.f2648e.mo85678d().m33143W(SN4.m85595i(2L, TimeUnit.SECONDS).m85578h(new InterfaceC23494q() { // from class: xg0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m113717g;
                    m113717g = C31901Bg0.m113717g((Throwable) obj);
                    return m113717g;
                }
            }).m85585a());
            Intrinsics.checkNotNullExpressionValue(m33143W, "paymentManager.cashpaySe…       .build()\n        )");
            AbstractC23442F m33152N = C28237sD.progress$default(m33143W, this.f2644a, 0, 2, (Object) null).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "paymentManager.cashpaySe…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f2646c));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0679b c0679b = new C0679b();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: yg0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31901Bg0.m113716h(Function1.this, obj);
                }
            });
        }
        AbstractC24490k<Unit> mo104926M2 = this.f2644a.mo104926M2();
        final C0680c c0680c = new C0680c();
        AbstractC24490k<Unit> m32111s0 = mo104926M2.m32175S(new InterfaceC23494q() { // from class: zg0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113715i;
                m113715i = C31901Bg0.m113715i(Function1.this, obj);
                return m113715i;
            }
        }).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "override fun onCreate(sa…locationsUrl)\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f2646c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0681d c0681d = new C0681d();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: Ag0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31901Bg0.m113714j(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC51152wg0
    public Bundle onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("CASHPAY_RESPONSE_DATA", this.f2649f);
        return outState;
    }
}
