package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.PaymentProvider;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.OP3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0001\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LOP3;", "", "Landroid/content/Intent;", "intent", "", "f", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "LAM3;", "c", "LAM3;", "paymentManagerV2", "LVM3;", DateTokenConverter.CONVERTER_KEY, "LVM3;", "paymentManagerV3", "LYR4;", "e", "LYR4;", "rideManager", "LSP3;", "LSP3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "h", "Le13;", "navigator", "<init>", "(LEa;LTq4;LAM3;LVM3;LYR4;LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaypalSignOutPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaypalSignOutPresenter.kt\nco/bird/android/app/feature/payment/PaypalSignOutPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,81:1\n180#2:82\n*S KotlinDebug\n*F\n+ 1 PaypalSignOutPresenter.kt\nco/bird/android/app/feature/payment/PaypalSignOutPresenterImpl\n*L\n72#1:82\n*E\n"})
/* renamed from: OP3 */
/* loaded from: classes2.dex */
public final class OP3 {

    /* renamed from: a */
    public final InterfaceC1880Ea f26477a;

    /* renamed from: b */
    public final C36207Tq4 f26478b;

    /* renamed from: c */
    public final AM3 f26479c;

    /* renamed from: d */
    public final VM3 f26480d;

    /* renamed from: e */
    public final YR4 f26481e;

    /* renamed from: f */
    public final SP3 f26482f;

    /* renamed from: g */
    public final ScopeProvider f26483g;

    /* renamed from: h */
    public final InterfaceC40099e13 f26484h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OP3$a */
    /* loaded from: classes2.dex */
    public static final class C5988a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: OP3$a$a */
        /* loaded from: classes2.dex */
        public static final class C5989a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C5989a f26486g = new C5989a();

            public C5989a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C5988a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m92334c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (OP3.this.f26481e.mo75061N()) {
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(OP3.this.f26482f, C47404qL3.f105137d, false, false, 6, null);
                final C5989a c5989a = C5989a.f26486g;
                return dialog$default.m33163C(new InterfaceC23492o() { // from class: NP3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m92334c;
                        m92334c = OP3.C5988a.m92334c(Function1.this, obj);
                        return m92334c;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OP3$b */
    /* loaded from: classes2.dex */
    public static final class C5990b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ String f26488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5990b(String str) {
            super(1);
            this.f26488h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Map<PaymentProvider, Integer> paymentProviderEndpointVersions = OP3.this.f26478b.m82623f8().m73665a().getPaymentConfig().getPaymentProviderEndpointVersions();
            Integer num = paymentProviderEndpointVersions != null ? paymentProviderEndpointVersions.get(PaymentProvider.BRAINTREE) : null;
            AbstractC23461c m33159G = (num != null && num.intValue() == 3) ? OP3.this.f26480d.mo25713u(this.f26488h).m33159G() : OP3.this.f26479c.mo85675f(PaymentProvider.BRAINTREE);
            Intrinsics.checkNotNullExpressionValue(m33159G, "when (reactiveConfig.con…ider.BRAINTREE)\n        }");
            return C28237sD.progress$default(m33159G, OP3.this.f26482f, 0, 2, (Object) null).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OP3$c */
    /* loaded from: classes2.dex */
    public static final class C5991c extends Lambda implements Function1<Throwable, Unit> {
        public C5991c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            OP3.this.f26482f.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OP3$d */
    /* loaded from: classes2.dex */
    public static final class C5992d extends Lambda implements Function1<Unit, Unit> {
        public C5992d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            OP3.this.f26477a.mo55905y(new TP3(null, null, null, 7, null));
            OP3.this.f26484h.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OP3$e */
    /* loaded from: classes2.dex */
    public static final class C5993e extends Lambda implements Function1<Throwable, Unit> {
        public C5993e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            OP3.this.f26482f.errorGeneric();
        }
    }

    public OP3(InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, AM3 paymentManagerV2, VM3 paymentManagerV3, YR4 rideManager, SP3 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f26477a = analyticsManager;
        this.f26478b = reactiveConfig;
        this.f26479c = paymentManagerV2;
        this.f26480d = paymentManagerV3;
        this.f26481e = rideManager;
        this.f26482f = ui;
        this.f26483g = scopeProvider;
        this.f26484h = navigator;
    }

    /* renamed from: g */
    public static final InterfaceC24574u m92341g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m92340h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m92339i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m92338j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m92337k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public void m92342f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f26477a.mo55905y(new UP3(null, null, null, 7, null));
        String stringExtra = intent.getStringExtra("email");
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = intent.getStringExtra("payment_id");
        Intrinsics.checkNotNull(stringExtra2);
        this.f26482f.mo79884C(stringExtra);
        Observable<Unit> mo79883v3 = this.f26482f.mo79883v3();
        final C5988a c5988a = new C5988a();
        Observable<R> flatMapMaybe = mo79883v3.flatMapMaybe(new InterfaceC23492o() { // from class: IP3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m92341g;
                m92341g = OP3.m92341g(Function1.this, obj);
                return m92341g;
            }
        });
        final C5990b c5990b = new C5990b(stringExtra2);
        Observable switchMapSingle = flatMapMaybe.switchMapSingle(new InterfaceC23492o() { // from class: JP3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m92340h;
                m92340h = OP3.m92340h(Function1.this, obj);
                return m92340h;
            }
        });
        final C5991c c5991c = new C5991c();
        Observable retry = switchMapSingle.doOnError(new InterfaceC23484g() { // from class: KP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OP3.m92339i(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(in…rorGeneric()\n      })\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f26483g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5992d c5992d = new C5992d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: LP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OP3.m92338j(Function1.this, obj);
            }
        };
        final C5993e c5993e = new C5993e();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MP3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OP3.m92337k(Function1.this, obj);
            }
        });
    }
}
