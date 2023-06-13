package co.bird.android.app.feature.autopay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import co.bird.android.app.feature.autopay.AutoPayV2Activity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Balance;
import co.bird.android.model.constant.AutoPayPaymentType;
import co.bird.android.model.wire.configs.RideConfig;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0002R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/AutoPayV2Activity;", "Lco/bird/android/core/mvp/BaseActivity;", "LMN3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "i", "k0", "Lms;", "B", "Lms;", "n0", "()Lms;", "setFactory", "(Lms;)V", "factory", "Ldz1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ldz1;", "o0", "()Ldz1;", "setFreeRideDelegateFactory", "(Ldz1;)V", "freeRideDelegateFactory", "Lvr;", "D", "Lvr;", "p0", "()Lvr;", "setPaymentIntentDelegateFactory", "(Lvr;)V", "paymentIntentDelegateFactory", "Lyr;", "E", "Lyr;", "presenter", "Lbz1;", "F", "Lbz1;", "freeRideDelegate", "Lmr;", "G", "Lmr;", "paymentIntentDelegate", "LT2;", "H", "LT2;", "binding", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoPayV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Activity.kt\nco/bird/android/app/feature/autopay/AutoPayV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,86:1\n44#2:87\n180#3:88\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Activity.kt\nco/bird/android/app/feature/autopay/AutoPayV2Activity\n*L\n49#1:87\n79#1:88\n*E\n"})
/* loaded from: classes2.dex */
public final class AutoPayV2Activity extends BaseActivity implements MN3 {

    /* renamed from: B */
    public InterfaceC26274ms f61275B;

    /* renamed from: C */
    public InterfaceC40078dz1 f61276C;

    /* renamed from: D */
    public InterfaceC29667vr f61277D;

    /* renamed from: E */
    public InterfaceC30759yr f61278E;

    /* renamed from: F */
    public InterfaceC38875bz1 f61279F;

    /* renamed from: G */
    public InterfaceC26272mr f61280G;

    /* renamed from: H */
    public C7642T2 f61281H;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.autopay.AutoPayV2Activity$a */
    /* loaded from: classes2.dex */
    public static final class C13673a extends Lambda implements Function1<Unit, Unit> {
        public C13673a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            AutoPayV2Activity.this.mo58957w().close();
        }
    }

    public AutoPayV2Activity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: m0 */
    public static final void m60824m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        InterfaceC30759yr interfaceC30759yr = this.f61278E;
        if (interfaceC30759yr != null) {
            interfaceC30759yr.mo2390a(paymentMethodNonce);
        }
    }

    /* renamed from: k0 */
    public final void m60825k0() {
        C7642T2 c7642t2 = this.f61281H;
        C7642T2 c7642t22 = null;
        if (c7642t2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7642t2 = null;
        }
        c7642t2.f34685l.setNavigationIcon(C48193rg4.ic_close);
        C7642T2 c7642t23 = this.f61281H;
        if (c7642t23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c7642t23 = null;
        }
        Toolbar toolbar = c7642t23.f34685l;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        Object m33094as = C42847if5.m33615a(toolbar).m33094as(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13673a c13673a = new C13673a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kr
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AutoPayV2Activity.m60824m0(Function1.this, obj);
            }
        });
        C7642T2 c7642t24 = this.f61281H;
        if (c7642t24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c7642t22 = c7642t24;
        }
        c7642t22.f34685l.setTitle(getString(C45871nl4.autopay_v2_title));
    }

    /* renamed from: n0 */
    public final InterfaceC26274ms m60823n0() {
        InterfaceC26274ms interfaceC26274ms = this.f61275B;
        if (interfaceC26274ms != null) {
            return interfaceC26274ms;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    /* renamed from: o0 */
    public final InterfaceC40078dz1 m60822o0() {
        InterfaceC40078dz1 interfaceC40078dz1 = this.f61276C;
        if (interfaceC40078dz1 != null) {
            return interfaceC40078dz1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("freeRideDelegateFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC30759yr interfaceC30759yr = this.f61278E;
        if (interfaceC30759yr != null) {
            interfaceC30759yr.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24069a0(this);
        C7642T2 m84413c = C7642T2.m84413c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m84413c, "inflate(layoutInflater)");
        this.f61281H = m84413c;
        C7642T2 c7642t2 = null;
        if (m84413c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m84413c = null;
        }
        setContentView(m84413c.getRoot());
        m60825k0();
        C7642T2 c7642t22 = this.f61281H;
        if (c7642t22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c7642t2 = c7642t22;
        }
        List<AutoPayPaymentType> preloadDefaultOptions = mo58955y().m82623f8().getValue().getPaymentConfig().getPreloadDefaultOptions();
        if (preloadDefaultOptions == null) {
            preloadDefaultOptions = AutoPayPaymentType.Companion.getDEFAULT_OPTIONS();
        }
        C28840ts c28840ts = new C28840ts(this, c7642t2, preloadDefaultOptions);
        this.f61279F = m60822o0().mo42319a(c28840ts, this);
        this.f61280G = m60821p0().mo6237a(this, mo58957w(), c28840ts);
        InterfaceC26274ms m60823n0 = m60823n0();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC40099e13 mo58957w = mo58957w();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ride_config");
        Intrinsics.checkNotNull(parcelableExtra);
        RideConfig rideConfig = (RideConfig) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("balance");
        Intrinsics.checkNotNull(parcelableExtra2);
        boolean booleanExtra = getIntent().getBooleanExtra("has_default_card", false);
        InterfaceC38875bz1 interfaceC38875bz1 = this.f61279F;
        Intrinsics.checkNotNull(interfaceC38875bz1);
        C25506ks mo22271a = m60823n0.mo22271a(this, m45197b, c28840ts, mo58957w, rideConfig, (Balance) parcelableExtra2, booleanExtra, interfaceC38875bz1, this.f61280G);
        mo22271a.m28364C0();
        this.f61278E = mo22271a;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC30759yr interfaceC30759yr = this.f61278E;
        if (interfaceC30759yr != null) {
            interfaceC30759yr.onResume();
        }
    }

    /* renamed from: p0 */
    public final InterfaceC29667vr m60821p0() {
        InterfaceC29667vr interfaceC29667vr = this.f61277D;
        if (interfaceC29667vr != null) {
            return interfaceC29667vr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentIntentDelegateFactory");
        return null;
    }
}
