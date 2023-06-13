package co.bird.android.app.feature.magiclink;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/magiclink/LoginActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "LOy2;", "B", "LOy2;", "k0", "()LOy2;", "setPresenterFactory", "(LOy2;)V", "presenterFactory", "Lpy2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lpy2;", "j0", "()Lpy2;", "m0", "(Lpy2;)V", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\nco/bird/android/app/feature/magiclink/LoginActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes2.dex */
public final class LoginActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13771a f61557D = new C13771a(null);

    /* renamed from: E */
    public static final int f61558E = 8;

    /* renamed from: B */
    public InterfaceC35107Oy2 f61559B;

    /* renamed from: C */
    public InterfaceC47185py2 f61560C;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/magiclink/LoginActivity$a;", "", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.magiclink.LoginActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13771a {
        public /* synthetic */ C13771a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13771a() {
        }
    }

    public LoginActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC47185py2 m60570j0() {
        InterfaceC47185py2 interfaceC47185py2 = this.f61560C;
        if (interfaceC47185py2 != null) {
            return interfaceC47185py2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC35107Oy2 m60569k0() {
        InterfaceC35107Oy2 interfaceC35107Oy2 = this.f61559B;
        if (interfaceC35107Oy2 != null) {
            return interfaceC35107Oy2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    /* renamed from: m0 */
    public final void m60568m0(InterfaceC47185py2 interfaceC47185py2) {
        Intrinsics.checkNotNullParameter(interfaceC47185py2, "<set-?>");
        this.f61560C = interfaceC47185py2;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 10009 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE)) != null) {
            m60570j0().mo18370a(stringExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24027v0(this);
        super.onCreate(bundle);
        setContentView(C39311cj4.activity_login);
        m60568m0(m60569k0().mo89214a(m58963Z(), new C37213Xy2(this), mo58957w(), mo58956x()));
        InterfaceC47185py2 m60570j0 = m60570j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60570j0.mo18369b(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m60570j0().mo18369b(intent);
        }
    }
}
