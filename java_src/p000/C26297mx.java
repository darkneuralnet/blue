package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.VM3;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Lmx;", "", "", "c", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "paymentLauncher", "b", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", DateTokenConverter.CONVERTER_KEY, "Le13;", C17296a.f69688o, "Le13;", "navigator", "LVM3;", "LVM3;", "paymentManagerV3", "", "Ljava/lang/String;", "clientKey", "publishableKey", "Lco/bird/android/model/constant/PaymentMethod;", "e", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "g", "LTq4;", "reactiveConfig", "Llh6;", "h", "Llh6;", "userManager", "Lox;", "i", "Lox;", "ui", "<init>", "(Le13;LVM3;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentMethod;Lcom/uber/autodispose/ScopeProvider;LTq4;Llh6;Lox;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBankRedirectLaunchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankRedirectLaunchPresenter.kt\nco/bird/android/feature/payment/bankredirect/BankRedirectLaunchPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,75:1\n199#2:76\n*S KotlinDebug\n*F\n+ 1 BankRedirectLaunchPresenter.kt\nco/bird/android/feature/payment/bankredirect/BankRedirectLaunchPresenter\n*L\n66#1:76\n*E\n"})
/* renamed from: mx */
/* loaded from: classes3.dex */
public final class C26297mx {

    /* renamed from: a */
    public final InterfaceC40099e13 f99094a;

    /* renamed from: b */
    public final VM3 f99095b;

    /* renamed from: c */
    public final String f99096c;

    /* renamed from: d */
    public final String f99097d;

    /* renamed from: e */
    public final PaymentMethod f99098e;

    /* renamed from: f */
    public final ScopeProvider f99099f;

    /* renamed from: g */
    public final C36207Tq4 f99100g;

    /* renamed from: h */
    public final InterfaceC44647lh6 f99101h;

    /* renamed from: i */
    public final C27107ox f99102i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26298a implements PaymentLauncher.PaymentResultCallback, FunctionAdapter {
        public C26298a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PaymentLauncher.PaymentResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C26297mx.this, C26297mx.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback
        public final void onPaymentResult(PaymentResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C26297mx.this.m24682d(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mx$b */
    /* loaded from: classes3.dex */
    public static final class C26299b extends Lambda implements Function1<Unit, Unit> {
        public C26299b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.closeDownWithResult$default(C26297mx.this.f99094a, 0, null, 2, null);
        }
    }

    public C26297mx(InterfaceC40099e13 navigator, VM3 paymentManagerV3, String clientKey, String publishableKey, PaymentMethod paymentMethod, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, C27107ox ui) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f99094a = navigator;
        this.f99095b = paymentManagerV3;
        this.f99096c = clientKey;
        this.f99097d = publishableKey;
        this.f99098e = paymentMethod;
        this.f99099f = scopeProvider;
        this.f99100g = reactiveConfig;
        this.f99101h = userManager;
        this.f99102i = ui;
    }

    /* renamed from: e */
    public static final void m24681e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public final void m24684b(PaymentLauncher paymentLauncher) {
        paymentLauncher.confirm(ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, VM3.C8609a.createBankRedirectPaymentMethodCreateParams$default(this.f99095b, this.f99098e, null, 2, null), this.f99096c, null, null, null, null, null, null, 252, null));
    }

    /* renamed from: c */
    public final void m24683c() {
        m24684b(PaymentLauncher.Companion.create(this.f99102i.m20247Sl(), this.f99097d, this.f99100g.m82623f8().m73665a().getPaymentConfig().getConnectedAccountId(), new C26298a()));
    }

    /* renamed from: d */
    public final void m24682d(PaymentResult paymentResult) {
        if (paymentResult instanceof PaymentResult.Completed) {
            InterfaceC40099e13.C19924a.closeDownWithResult$default(this.f99094a, -1, null, 2, null);
        } else if (paymentResult instanceof PaymentResult.Canceled) {
            InterfaceC40099e13.C19924a.closeDownWithResult$default(this.f99094a, 0, null, 2, null);
        } else if (paymentResult instanceof PaymentResult.Failed) {
            Throwable throwable = ((PaymentResult.Failed) paymentResult).getThrowable();
            C41318g46.m40159e(throwable);
            AbstractC23442F<Unit> m33152N = this.f99102i.m20249Ql(throwable).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "ui.errorDialog(this)\n   …dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f99099f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C26299b c26299b = new C26299b();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: lx
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C26297mx.m24681e(Function1.this, obj);
                }
            });
        }
    }
}
