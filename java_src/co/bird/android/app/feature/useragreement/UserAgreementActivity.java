package co.bird.android.app.feature.useragreement;

import android.os.Bundle;
import co.bird.android.app.feature.useragreement.UserAgreementActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AgreementRole;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23461c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/useragreement/UserAgreementActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LOg6;", "B", "LOg6;", "j0", "()LOg6;", "setAgreementPresenterFactory", "(LOg6;)V", "agreementPresenterFactory", "LCg6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LCg6;", "getUserPresenter", "()LCg6;", "setUserPresenter", "(LCg6;)V", "userPresenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserAgreementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementActivity.kt\nco/bird/android/app/feature/useragreement/UserAgreementActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n37#2,2:40\n*S KotlinDebug\n*F\n+ 1 UserAgreementActivity.kt\nco/bird/android/app/feature/useragreement/UserAgreementActivity\n*L\n28#1:40,2\n*E\n"})
/* loaded from: classes2.dex */
public final class UserAgreementActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC34949Og6 f62845B;

    /* renamed from: C */
    public InterfaceC32141Cg6 f62846C;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/app/feature/useragreement/UserAgreementActivity$a", "Lg9;", "Lio/reactivex/c;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.useragreement.UserAgreementActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14350a extends AbstractC20762g9 {

        /* renamed from: f */
        public final /* synthetic */ UserAgreementActivity f62847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14350a(String str, UserAgreementActivity userAgreementActivity, Object[] objArr) {
            super((AgreementRole[]) objArr, false, str, null, false, 26, null);
            this.f62847f = userAgreementActivity;
        }

        /* renamed from: h */
        public static final void m59331h(UserAgreementActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mo58957w().close();
        }

        @Override // p000.AbstractC20762g9
        /* renamed from: a */
        public AbstractC23461c mo39976a() {
            final UserAgreementActivity userAgreementActivity = this.f62847f;
            AbstractC23461c m33076J = AbstractC23461c.m33076J(new Runnable() { // from class: ig6
                @Override // java.lang.Runnable
                public final void run() {
                    UserAgreementActivity.C14350a.m59331h(UserAgreementActivity.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33076J, "fromRunnable { navigator.close() }");
            return m33076J;
        }
    }

    public UserAgreementActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC34949Og6 m59333j0() {
        InterfaceC34949Og6 interfaceC34949Og6 = this.f62845B;
        if (interfaceC34949Og6 != null) {
            return interfaceC34949Og6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreementPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24024x2(this);
        setContentView(C39311cj4.activity_webview);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("agreement_roles");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        String stringExtra = getIntent().getStringExtra("partner_id");
        AgreementRole[] agreementRoleArr = (AgreementRole[]) parcelableArrayListExtra.toArray(new AgreementRole[0]);
        C34013Kg6 mo89934a = m59333j0().mo89934a(m58963Z(), new C35885Sg6(C40788fB0.m41779c(this, 16908290), this), new C14350a(stringExtra, this, Arrays.copyOf(agreementRoleArr, agreementRoleArr.length)), mo58957w(), null);
        mo89934a.m98547q();
        this.f62846C = mo89934a;
    }
}
