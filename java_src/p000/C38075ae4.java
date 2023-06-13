package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.analytics.GooglePayAuthSheetPresented;
import co.bird.android.model.analytics.GooglePayButtonClicked;
import co.bird.android.model.analytics.ScreenType;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.request.BraintreeTokenResponse;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.Currency;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Bi\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020@\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020F¢\u0006\u0004\bW\u0010XJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0012\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010N\u001a\u0010\u0012\f\u0012\n K*\u0004\u0018\u00010\u001a0\u001a0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001a0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010V\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, m28432d2 = {"Lae4;", "LMN3;", "LCx0;", "LE10;", "LF10;", "LZg3;", "", "O", "J", "M", "", "requestCode", "resultCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "F", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "i", "Lex0;", "p0", "k", "l", "Ljava/lang/Exception;", "error", "onError", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", C17296a.f69688o, "LTq4;", "b", "LTq4;", "reactiveConfig", "LEa;", "c", "LEa;", "analyticsManager", "Lo21;", DateTokenConverter.CONVERTER_KEY, "Lo21;", "deviceCheckManager", "Llh6;", "e", "Llh6;", "userManager", "LRh6;", "f", "LRh6;", "userStream", "LAM3;", "g", "LAM3;", "paymentManagerV2", "LiD1;", "h", "LiD1;", "googlePayManager", "Lw10;", "Lw10;", "brainTreeManager", "Ldr4;", "j", "Ldr4;", "locationManager", "Le13;", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lce4;", "m", "Lce4;", "ui", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "n", "Lio/reactivex/subjects/d;", "paymentMethodSelectedSubject", "", "o", "Ljava/util/Set;", "bankRedirectMethods", "Lco/bird/android/model/wire/configs/Config;", "E", "()Lco/bird/android/model/wire/configs/Config;", "config", "<init>", "(LTq4;LEa;Lo21;Llh6;LRh6;LAM3;LiD1;Lw10;Ldr4;Le13;Lcom/uber/autodispose/ScopeProvider;Lce4;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentPresenter.kt\nco/bird/android/feature/payment/quickpayment/QuickPaymentPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,293:1\n180#2:294\n237#2:295\n180#2:296\n180#2:297\n161#2:298\n180#2:299\n180#2:300\n180#2:301\n237#2:302\n*S KotlinDebug\n*F\n+ 1 QuickPaymentPresenter.kt\nco/bird/android/feature/payment/quickpayment/QuickPaymentPresenter\n*L\n93#1:294\n117#1:295\n141#1:296\n162#1:297\n189#1:298\n213#1:299\n225#1:300\n233#1:301\n252#1:302\n*E\n"})
/* renamed from: ae4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38075ae4 implements MN3, InterfaceC32288Cx0, E10, F10, InterfaceC37520Zg3 {

    /* renamed from: b */
    public final C36207Tq4 f50861b;

    /* renamed from: c */
    public final InterfaceC1880Ea f50862c;

    /* renamed from: d */
    public final InterfaceC46037o21 f50863d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f50864e;

    /* renamed from: f */
    public final InterfaceC35660Rh6 f50865f;

    /* renamed from: g */
    public final AM3 f50866g;

    /* renamed from: h */
    public final InterfaceC42586iD1 f50867h;

    /* renamed from: i */
    public final InterfaceC50768w10 f50868i;

    /* renamed from: j */
    public final InterfaceC40001dr4 f50869j;

    /* renamed from: k */
    public final InterfaceC40099e13 f50870k;

    /* renamed from: l */
    public final ScopeProvider f50871l;

    /* renamed from: m */
    public final InterfaceC39261ce4 f50872m;

    /* renamed from: n */
    public final C24558d<PaymentMethod> f50873n;

    /* renamed from: o */
    public final Set<PaymentMethod> f50874o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$a */
    /* loaded from: classes3.dex */
    public static final class C10783a extends Lambda implements Function1<Throwable, Unit> {
        public C10783a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C38075ae4.this.f50872m.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$b */
    /* loaded from: classes3.dex */
    public static final class C10784b extends Lambda implements Function1<Throwable, Unit> {
        public C10784b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C38075ae4.this.f50872m.error(C45871nl4.error_generic_body);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "locationOff", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$c */
    /* loaded from: classes3.dex */
    public static final class C10785c extends Lambda implements Function1<Boolean, Unit> {
        public C10785c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (!bool.booleanValue()) {
                C38075ae4.this.f50872m.mo41081Ak(C38075ae4.this.m70976E());
            } else {
                C38075ae4.this.f50872m.mo41080B0(C38075ae4.this.f50869j.mo43621k());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$d */
    /* loaded from: classes3.dex */
    public static final class C10786d extends Lambda implements Function1<PaymentMethod, Boolean> {

        /* renamed from: g */
        public static final C10786d f50878g = new C10786d();

        public C10786d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentMethod it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == PaymentMethod.PAYPAL) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/User;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$e */
    /* loaded from: classes3.dex */
    public static final class C10787e extends Lambda implements Function1<Pair<? extends Object, ? extends User>, Unit> {
        public C10787e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Object, ? extends User> pair) {
            invoke2((Pair<? extends Object, User>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Object, User> pair) {
            S74.C7343a.showProgress$default(C38075ae4.this.f50872m, true, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$f */
    /* loaded from: classes3.dex */
    public static final class C10788f extends Lambda implements Function1<Pair<? extends Object, ? extends User>, InterfaceC23447K<? extends HM4<BraintreeTokenResponse>>> {
        public C10788f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BraintreeTokenResponse>> invoke(Pair<? extends Object, User> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C38075ae4.this.f50868i.mo2106d(pair.component2().getId(), PaymentProvider.BRAINTREE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$g */
    /* loaded from: classes3.dex */
    public static final class C10789g extends Lambda implements Function1<HM4<BraintreeTokenResponse>, Unit> {
        public C10789g() {
            super(1);
        }

        /* renamed from: a */
        public final void m70921a(HM4<BraintreeTokenResponse> hm4) {
            if (hm4.m103939f()) {
                BraintreeTokenResponse m103944a = hm4.m103944a();
                if (m103944a != null) {
                    C38075ae4 c38075ae4 = C38075ae4.this;
                    G10 mo41082A5 = c38075ae4.f50872m.mo41082A5(m103944a.getToken(), c38075ae4);
                    PayPalRequest payPalRequest = new PayPalRequest();
                    if (mo41082A5 != null) {
                        C40881fL3.m41541t(mo41082A5, payPalRequest);
                        return;
                    }
                    c38075ae4.f50872m.error(C45871nl4.error_generic_body);
                    S74.C7343a.showProgress$default(c38075ae4.f50872m, false, 0, 2, null);
                    return;
                }
                return;
            }
            C38075ae4.this.f50872m.error(C45871nl4.error_generic_body);
            S74.C7343a.showProgress$default(C38075ae4.this.f50872m, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BraintreeTokenResponse> hm4) {
            m70921a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$h */
    /* loaded from: classes3.dex */
    public static final class C10790h extends Lambda implements Function1<Throwable, Unit> {
        public C10790h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C38075ae4.this.f50872m.error(C45871nl4.error_generic_body);
            S74.C7343a.showProgress$default(C38075ae4.this.f50872m, false, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$i */
    /* loaded from: classes3.dex */
    public static final class C10791i extends Lambda implements Function1<Unit, Unit> {
        public C10791i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38075ae4.this.f50870k.mo37140K3(C45871nl4.payment_activity_title, 10048, 0L, C38075ae4.this.m70976E().getRideConfig().getCurrency(), PaymentAddSource.QUICK_PAYMENT_SCREEN);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10792j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C10792j f50884b = new C10792j();

        public C10792j() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$k */
    /* loaded from: classes3.dex */
    public static final class C10793k extends Lambda implements Function1<Unit, Unit> {
        public C10793k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38075ae4.this.f50872m.mo41079Bb(C38075ae4.this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10794l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C10794l f50886b = new C10794l();

        public C10794l() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$m */
    /* loaded from: classes3.dex */
    public static final class C10795m extends Lambda implements Function1<PaymentMethod, Boolean> {
        public C10795m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C38075ae4.this.f50874o.contains(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$n */
    /* loaded from: classes3.dex */
    public static final class C10796n extends Lambda implements Function1<PaymentMethod, Boolean> {

        /* renamed from: g */
        public static final C10796n f50888g = new C10796n();

        public C10796n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentMethod it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == PaymentMethod.CARD) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$o */
    /* loaded from: classes3.dex */
    public static final class C10797o extends Lambda implements Function1<PaymentMethod, Unit> {
        public C10797o() {
            super(1);
        }

        /* renamed from: a */
        public final void m70918a(PaymentMethod it) {
            InterfaceC40099e13 interfaceC40099e13 = C38075ae4.this.f50870k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InterfaceC40099e13.C19924a.goToAddBalance$default(interfaceC40099e13, it, 10063, null, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
            m70918a(paymentMethod);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10798p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C10798p f50890b = new C10798p();

        public C10798p() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethod;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$q */
    /* loaded from: classes3.dex */
    public static final class C10799q extends Lambda implements Function1<PaymentMethod, Boolean> {

        /* renamed from: g */
        public static final C10799q f50891g = new C10799q();

        public C10799q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentMethod it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == PaymentMethod.GOOGLE_PAY) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/Balance;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$r */
    /* loaded from: classes3.dex */
    public static final class C10800r extends Lambda implements Function1<Optional<Balance>, Balance> {

        /* renamed from: g */
        public static final C10800r f50892g = new C10800r();

        public C10800r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Balance invoke(Optional<Balance> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Balance m59035e = it.m59035e();
            if (m59035e == null) {
                return new Balance(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Balance;", "Lco/bird/android/model/User;", "it", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ae4$s */
    /* loaded from: classes3.dex */
    public static final class C10801s extends Lambda implements Function1<Triple<? extends Object, ? extends Balance, ? extends User>, Unit> {
        public C10801s() {
            super(1);
        }

        /* renamed from: a */
        public final void m70915a(Triple<? extends Object, Balance, User> triple) {
            S74.C7343a.showProgress$default(C38075ae4.this.f50872m, true, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Object, ? extends Balance, ? extends User> triple) {
            m70915a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ae4$t */
    /* loaded from: classes3.dex */
    public static final class C10802t extends Lambda implements Function1<Throwable, Unit> {
        public C10802t() {
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
            C38075ae4.this.f50872m.error(C45871nl4.error_generic_body);
            S74.C7343a.showProgress$default(C38075ae4.this.f50872m, false, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Balance;", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuickPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickPaymentPresenter.kt\nco/bird/android/feature/payment/quickpayment/QuickPaymentPresenter$setupClickListeners$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
    /* renamed from: ae4$u */
    /* loaded from: classes3.dex */
    public static final class C10803u extends Lambda implements Function1<Triple<? extends Object, ? extends Balance, ? extends User>, Unit> {
        public C10803u() {
            super(1);
        }

        /* renamed from: a */
        public final void m70914a(Triple<? extends Object, Balance, User> triple) {
            long j;
            Balance component2 = triple.component2();
            User user = triple.component3();
            C38075ae4.this.f50862c.mo55956N(new GooglePayButtonClicked(ScreenType.PAYMENT));
            Currency m25591o = C45097mS5.m25591o(C38075ae4.this.m70976E().getRideConfig().getCurrency());
            Integer autoPayRefillAmount = component2.getAutoPayRefillAmount();
            if (autoPayRefillAmount != null) {
                Long valueOf = Long.valueOf(autoPayRefillAmount.intValue());
                valueOf.longValue();
                if (!Intrinsics.areEqual(component2.getAutoPayActive(), Boolean.TRUE)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    j = valueOf.longValue();
                    InterfaceC39261ce4 interfaceC39261ce4 = C38075ae4.this.f50872m;
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    interfaceC39261ce4.mo41074Zk(user, 10045, m25591o, Long.valueOf(j));
                    C38075ae4.this.f50862c.mo55956N(new GooglePayAuthSheetPresented(m25591o, Long.valueOf(j)));
                }
            }
            j = 0;
            InterfaceC39261ce4 interfaceC39261ce42 = C38075ae4.this.f50872m;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            interfaceC39261ce42.mo41074Zk(user, 10045, m25591o, Long.valueOf(j));
            C38075ae4.this.f50862c.mo55956N(new GooglePayAuthSheetPresented(m25591o, Long.valueOf(j)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Object, ? extends Balance, ? extends User> triple) {
            m70914a(triple);
            return Unit.INSTANCE;
        }
    }

    public C38075ae4(C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC46037o21 deviceCheckManager, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream, AM3 paymentManagerV2, InterfaceC42586iD1 googlePayManager, InterfaceC50768w10 brainTreeManager, InterfaceC40001dr4 locationManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC39261ce4 ui) {
        Set<PaymentMethod> of;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(deviceCheckManager, "deviceCheckManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f50861b = reactiveConfig;
        this.f50862c = analyticsManager;
        this.f50863d = deviceCheckManager;
        this.f50864e = userManager;
        this.f50865f = userStream;
        this.f50866g = paymentManagerV2;
        this.f50867h = googlePayManager;
        this.f50868i = brainTreeManager;
        this.f50869j = locationManager;
        this.f50870k = navigator;
        this.f50871l = scopeProvider;
        this.f50872m = ui;
        C24558d<PaymentMethod> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<PaymentMethod>()");
        this.f50873n = m31902e;
        of = SetsKt__SetsKt.setOf((Object[]) new PaymentMethod[]{PaymentMethod.BANCONTACT, PaymentMethod.GIROPAY, PaymentMethod.IDEAL, PaymentMethod.SOFORT});
        this.f50874o = of;
    }

    /* renamed from: G */
    public static final void m70974G(C38075ae4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S74.C7343a.showProgress$default(this$0.f50872m, false, 0, 2, null);
    }

    /* renamed from: H */
    public static final void m70973H(C38075ae4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f50870k.mo37050b1(-1);
    }

    /* renamed from: I */
    public static final void m70972I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m70970K(C38075ae4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f50870k.mo37050b1(-1);
    }

    /* renamed from: L */
    public static final void m70969L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m70967N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m70965P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m70964Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m70963R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final boolean m70962S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T */
    public static final void m70961T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m70960U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m70959V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m70958W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m70957X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m70956Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m70955Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m70954a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final boolean m70952b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: c0 */
    public static final void m70950c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final boolean m70948d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: e0 */
    public static final void m70946e0(C38075ae4 this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S74.C7343a.showProgress$default(this$0.f50872m, true, 0, 2, null);
    }

    /* renamed from: f0 */
    public static final void m70944f0(C38075ae4 this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f50870k.mo37166G1(10042, true, PaymentAddSource.QUICK_PAYMENT_SCREEN);
    }

    /* renamed from: g0 */
    public static final void m70942g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final boolean m70940h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final Balance m70939i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Balance) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final Config m70976E() {
        return this.f50861b.m82623f8().m73665a();
    }

    /* renamed from: F */
    public final void m70975F(int i, int i2, Intent intent) {
        if (i2 == 0) {
            S74.C7343a.showProgress$default(this.f50872m, false, 0, 2, null);
            return;
        }
        S74.C7343a.showProgress$default(this.f50872m, true, 0, 2, null);
        if (i != 10042) {
            if (i != 10045) {
                if (i != 10048) {
                    if (i != 10063) {
                        S74.C7343a.showProgress$default(this.f50872m, false, 0, 2, null);
                        return;
                    }
                } else {
                    this.f50870k.mo37050b1(-1);
                    return;
                }
            } else {
                AbstractC23461c m33030y = this.f50867h.mo16240d(i2, intent, true, PaymentAddSource.QUICK_PAYMENT_SCREEN).m33030y(new InterfaceC23478a() { // from class: Pd4
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C38075ae4.m70974G(C38075ae4.this);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33030y, "googlePayManager.handleG… ui.showProgress(false) }");
                Object m33041n = m33030y.m33041n(AutoDispose.m45239a(this.f50871l));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Qd4
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C38075ae4.m70973H(C38075ae4.this);
                    }
                };
                final C10783a c10783a = new C10783a();
                ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Rd4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C38075ae4.m70972I(Function1.this, obj);
                    }
                });
                return;
            }
        }
        this.f50870k.mo37050b1(-1);
    }

    /* renamed from: J */
    public final void m70971J() {
        this.f50862c.mo55905y(new C49218tP3(null, null, null, m70976E().getPaymentConfig().getEnablePaypal(), null, 23, null));
        m70966O();
    }

    /* renamed from: M */
    public final void m70968M() {
        this.f50872m.mo41071y(m70976E().getGooglePayAvailable());
        this.f50872m.mo41075S(m70976E().getPaymentConfig().getEnablePaypal());
        this.f50872m.mo41077Kd(!m70976E().getPaymentConfig().getTestPaymentMethods().isEmpty());
        Observable<Boolean> observeOn = this.f50869j.mo43609w().startWith((Observable<Boolean>) Boolean.valueOf(!this.f50869j.mo43621k())).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "locationManager\n      .i…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10785c c10785c = new C10785c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Od4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70967N(Function1.this, obj);
            }
        });
    }

    /* renamed from: O */
    public final void m70966O() {
        Observable<Unit> mo41072x4 = this.f50872m.mo41072x4();
        C24558d<PaymentMethod> c24558d = this.f50873n;
        final C10796n c10796n = C10796n.f50888g;
        Observable doOnNext = Observable.merge(mo41072x4, c24558d.filter(new InterfaceC23494q() { // from class: Sd4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m70948d0;
                m70948d0 = C38075ae4.m70948d0(Function1.this, obj);
                return m70948d0;
            }
        })).observeOn(C23454a.m33087a()).doOnNext(new InterfaceC23484g() { // from class: Ed4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70946e0(C38075ae4.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "merge(\n      ui.addCredi…{ ui.showProgress(true) }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Fd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70944f0(C38075ae4.this, obj);
            }
        };
        final C10798p c10798p = C10798p.f50890b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Gd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70942g0(Function1.this, obj);
            }
        });
        Observable<Unit> mo41078J = this.f50872m.mo41078J();
        C24558d<PaymentMethod> c24558d2 = this.f50873n;
        final C10799q c10799q = C10799q.f50891g;
        Observable merge = Observable.merge(mo41078J, c24558d2.filter(new InterfaceC23494q() { // from class: Hd4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m70940h0;
                m70940h0 = C38075ae4.m70940h0(Function1.this, obj);
                return m70940h0;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.googlePa…Method.GOOGLE_PAY }\n    )");
        Z84<Optional<Balance>> mo26977K = this.f50864e.mo26977K();
        final C10800r c10800r = C10800r.f50892g;
        InterfaceC23434B map = mo26977K.map(new InterfaceC23492o() { // from class: Id4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Balance m70939i0;
                m70939i0 = C38075ae4.m70939i0(Function1.this, obj);
                return m70939i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "userManager.balance.map …t.orNull() ?: Balance() }");
        Observable observeOn = C24527f.m31949b(merge, map, this.f50865f.mo76579f()).observeOn(C23454a.m33087a());
        final C10801s c10801s = new C10801s();
        Observable doOnNext2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: Jd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70965P(Function1.this, obj);
            }
        });
        final C10802t c10802t = new C10802t();
        Observable retry = doOnNext2.doOnError(new InterfaceC23484g() { // from class: Kd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70964Q(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun setupClickLi…IRECT_REFILL)\n      }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10803u c10803u = new C10803u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Md4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70963R(Function1.this, obj);
            }
        });
        Observable<Unit> mo41083A = this.f50872m.mo41083A();
        C24558d<PaymentMethod> c24558d3 = this.f50873n;
        final C10786d c10786d = C10786d.f50878g;
        Observable merge2 = Observable.merge(mo41083A, c24558d3.filter(new InterfaceC23494q() { // from class: Nd4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m70962S;
                m70962S = C38075ae4.m70962S(Function1.this, obj);
                return m70962S;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge2, "merge(\n      ui.paypalCl…mentMethod.PAYPAL }\n    )");
        Observable observeOn2 = C24527f.m31950a(merge2, this.f50865f.mo76579f()).observeOn(C23454a.m33087a());
        final C10787e c10787e = new C10787e();
        AbstractC24490k flowable = observeOn2.doOnNext(new InterfaceC23484g() { // from class: Td4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70961T(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c()).toFlowable(EnumC23460b.DROP);
        final C10788f c10788f = new C10788f();
        AbstractC24490k m32111s0 = flowable.m32146g0(new InterfaceC23492o() { // from class: Ud4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m70960U;
                m70960U = C38075ae4.m70960U(Function1.this, obj);
                return m70960U;
            }
        }, false, 1).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "private fun setupClickLi…IRECT_REFILL)\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10789g c10789g = new C10789g();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Vd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70959V(Function1.this, obj);
            }
        };
        final C10790h c10790h = new C10790h();
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Wd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70958W(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f50872m.mo41076P3().m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10791i c10791i = new C10791i();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Xd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70957X(Function1.this, obj);
            }
        };
        final C10792j c10792j = C10792j.f50884b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Yd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70956Y(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f50872m.mo41073j9().m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10793k c10793k = new C10793k();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: Zd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70955Z(Function1.this, obj);
            }
        };
        final C10794l c10794l = C10794l.f50886b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: Bd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70954a0(Function1.this, obj);
            }
        });
        C24558d<PaymentMethod> c24558d4 = this.f50873n;
        final C10795m c10795m = new C10795m();
        Observable<PaymentMethod> observeOn3 = c24558d4.filter(new InterfaceC23494q() { // from class: Cd4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m70952b0;
                m70952b0 = C38075ae4.m70952b0(Function1.this, obj);
                return m70952b0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "private fun setupClickLi…IRECT_REFILL)\n      }\n  }");
        Object m33094as5 = observeOn3.m33094as(AutoDispose.m45239a(this.f50871l));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10797o c10797o = new C10797o();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Dd4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38075ae4.m70950c0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC37520Zg3
    /* renamed from: a */
    public void mo15688a(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f50873n.onNext(paymentMethod);
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            User mo76584a = this.f50865f.mo76584a();
            InterfaceC23465c interfaceC23465c = null;
            if (mo76584a != null) {
                AM3 am3 = this.f50866g;
                String id = mo76584a.getId();
                PayPalAccountNonce payPalAccountNonce = (PayPalAccountNonce) paymentMethodNonce;
                String m53365i = payPalAccountNonce.m53365i();
                Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
                String m53327c = payPalAccountNonce.m53327c();
                Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
                AbstractC23461c m33070P = C28237sD.progress$default(am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.QUICK_PAYMENT_SCREEN), this.f50872m, 0, 2, (Object) null).m33070P(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33070P, "paymentManagerV2.createB…dSchedulers.mainThread())");
                Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f50871l));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Ad4
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C38075ae4.m70970K(C38075ae4.this);
                    }
                };
                final C10784b c10784b = new C10784b();
                interfaceC23465c = ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Ld4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C38075ae4.m70969L(Function1.this, obj);
                    }
                });
            }
            if (interfaceC23465c == null) {
                C41318g46.m40160d("User was null when creating Braintree payment nonce.", new Object[0]);
                this.f50872m.errorGeneric();
                return;
            }
            return;
        }
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
        this.f50872m.errorGeneric();
    }

    @Override // p000.InterfaceC32288Cx0
    /* renamed from: k */
    public void mo10872k(C40650ex0 c40650ex0) {
    }

    @Override // p000.E10
    /* renamed from: l */
    public void mo59671l(int i) {
        S74.C7343a.showProgress$default(this.f50872m, false, 0, 2, null);
    }

    @Override // p000.F10
    public void onError(Exception exc) {
        C41318g46.m40158f(exc, "Error with Paypal", new Object[0]);
        if (exc instanceof ErrorWithResponse) {
            this.f50872m.error(((ErrorWithResponse) exc).m53411c());
        } else {
            this.f50872m.errorGeneric();
        }
    }
}
