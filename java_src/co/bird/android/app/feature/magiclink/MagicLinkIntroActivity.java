package co.bird.android.app.feature.magiclink;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lco/bird/android/app/feature/magiclink/MagicLinkIntroActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "LcF2;", "B", "LcF2;", "k0", "()LcF2;", "m0", "(LcF2;)V", "presenter", "LHF2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LHF2;", "j0", "()LHF2;", "setMagicLinkPresenterImplFactory", "(LHF2;)V", "magicLinkPresenterImplFactory", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MagicLinkIntroActivity extends BaseActivity {

    /* renamed from: D */
    public static final C13772a f61561D = new C13772a(null);

    /* renamed from: E */
    public static final int f61562E = 8;

    /* renamed from: B */
    public InterfaceC39030cF2 f61563B;

    /* renamed from: C */
    public HF2 f61564C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/magiclink/MagicLinkIntroActivity$a;", "", "", "GOOGLE_SIGN_IN_REQUEST_CODE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.magiclink.MagicLinkIntroActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13772a {
        public /* synthetic */ C13772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13772a() {
        }
    }

    public MagicLinkIntroActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final HF2 m60567j0() {
        HF2 hf2 = this.f61564C;
        if (hf2 != null) {
            return hf2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("magicLinkPresenterImplFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC39030cF2 m60566k0() {
        InterfaceC39030cF2 interfaceC39030cF2 = this.f61563B;
        if (interfaceC39030cF2 != null) {
            return interfaceC39030cF2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: m0 */
    public final void m60565m0(InterfaceC39030cF2 interfaceC39030cF2) {
        Intrinsics.checkNotNullParameter(interfaceC39030cF2, "<set-?>");
        this.f61563B = interfaceC39030cF2;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        m60566k0().onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!m60566k0().onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C24695j4 m31201c = C24695j4.m31201c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m31201c, "inflate(layoutInflater)");
        setContentView(m31201c.getRoot());
        H22.f12748a.mo24055g2(this);
        setSupportActionBar(m31201c.f92082t);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70245B(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(true);
        }
        CF2 mo102671a = m60567j0().mo102671a(m58963Z(), new NF2(this, m31201c), mo58957w(), mo58956x());
        mo102671a.m112585G();
        m60565m0(mo102671a);
    }
}
