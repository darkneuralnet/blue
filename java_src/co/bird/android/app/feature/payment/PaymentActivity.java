package co.bird.android.app.feature.payment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, m28432d2 = {"Lco/bird/android/app/feature/payment/PaymentActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "LMN3;", "LCx0;", "LE10;", "LF10;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "i", "Lex0;", "configuration", "k", "l", "Ljava/lang/Exception;", "error", "onError", "LqP3;", "B", "LqP3;", "k0", "()LqP3;", "setPresenterFactory", "(LqP3;)V", "presenterFactory", "Ldz1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ldz1;", "j0", "()Ldz1;", "setFreeRideDelegateFactory", "(Ldz1;)V", "freeRideDelegateFactory", "LAO3;", "D", "LAO3;", "presenter", "Lbz1;", "E", "Lbz1;", "freeRideDelegate", "<init>", "()V", "F", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PaymentActivity extends BaseActivity implements MN3, InterfaceC32288Cx0, E10, F10 {

    /* renamed from: F */
    public static final C14000a f61948F = new C14000a(null);

    /* renamed from: G */
    public static final int f61949G = 8;

    /* renamed from: B */
    public InterfaceC47440qP3 f61950B;

    /* renamed from: C */
    public InterfaceC40078dz1 f61951C;

    /* renamed from: D */
    public AO3 f61952D;

    /* renamed from: E */
    public InterfaceC38875bz1 f61953E;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/payment/PaymentActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "startedForResult", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.payment.PaymentActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14000a {
        public /* synthetic */ C14000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60197a(Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, PaymentActivity.class);
            intent.putExtra("started_for_result", z);
            return intent;
        }

        private C14000a() {
        }
    }

    public PaymentActivity() {
        super(false, null, null, 7, null);
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        AO3 ao3 = this.f61952D;
        if (ao3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            ao3 = null;
        }
        ao3.mo21171a(paymentMethodNonce);
    }

    /* renamed from: j0 */
    public final InterfaceC40078dz1 m60199j0() {
        InterfaceC40078dz1 interfaceC40078dz1 = this.f61951C;
        if (interfaceC40078dz1 != null) {
            return interfaceC40078dz1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("freeRideDelegateFactory");
        return null;
    }

    @Override // p000.InterfaceC32288Cx0
    /* renamed from: k */
    public void mo10872k(C40650ex0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    /* renamed from: k0 */
    public final InterfaceC47440qP3 m60198k0() {
        InterfaceC47440qP3 interfaceC47440qP3 = this.f61950B;
        if (interfaceC47440qP3 != null) {
            return interfaceC47440qP3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // p000.E10
    /* renamed from: l */
    public void mo59671l(int i) {
        AO3 ao3 = this.f61952D;
        if (ao3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            ao3 = null;
        }
        ao3.mo21167c(i);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AO3 ao3 = this.f61952D;
        if (ao3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            ao3 = null;
        }
        ao3.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC38875bz1 interfaceC38875bz1;
        super.onCreate(bundle);
        H22.f12748a.mo24100A2(this);
        setContentView(C39311cj4.activity_payment);
        DP3 dp3 = new DP3(this);
        this.f61953E = m60199j0().mo42319a(dp3, this);
        InterfaceC47440qP3 m60198k0 = m60198k0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC38875bz1 interfaceC38875bz12 = this.f61953E;
        AO3 ao3 = null;
        if (interfaceC38875bz12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("freeRideDelegate");
            interfaceC38875bz1 = null;
        } else {
            interfaceC38875bz1 = interfaceC38875bz12;
        }
        C46254oP3 mo15994a = m60198k0.mo15994a(m58963Z, dp3, interfaceC38875bz1, mo58957w(), this);
        this.f61952D = mo15994a;
        if (mo15994a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo15994a = null;
        }
        dp3.m110522Ql(mo15994a);
        AO3 ao32 = this.f61952D;
        if (ao32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            ao3 = ao32;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        ao3.mo21169b(intent);
    }

    @Override // p000.F10
    public void onError(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AO3 ao3 = this.f61952D;
        if (ao3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            ao3 = null;
        }
        ao3.mo21165d(error);
    }
}
