package co.bird.android.app.feature.wakebirds;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.QrCodeZXingScannerView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onBackPressed", "Lit3;", "B", "Lit3;", "j0", "()Lit3;", "setOperatorScannerPresenterDelegateImplFactory", "(Lit3;)V", "operatorScannerPresenterDelegateImplFactory", "LIx6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LIx6;", "k0", "()LIx6;", "setWakeVehiclesPresenterImplFactory", "(LIx6;)V", "wakeVehiclesPresenterImplFactory", "Lwx6;", "D", "Lwx6;", "presenter", "LLx6;", "E", "LLx6;", "ui", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WakeVehiclesActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC42985it3 f62850B;

    /* renamed from: C */
    public InterfaceC33698Ix6 f62851C;

    /* renamed from: D */
    public InterfaceC51328wx6 f62852D;

    /* renamed from: E */
    public InterfaceC34400Lx6 f62853E;

    public WakeVehiclesActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC42985it3 m59326j0() {
        InterfaceC42985it3 interfaceC42985it3 = this.f62850B;
        if (interfaceC42985it3 != null) {
            return interfaceC42985it3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorScannerPresenterDelegateImplFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC33698Ix6 m59325k0() {
        InterfaceC33698Ix6 interfaceC33698Ix6 = this.f62851C;
        if (interfaceC33698Ix6 != null) {
            return interfaceC33698Ix6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wakeVehiclesPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC34400Lx6 interfaceC34400Lx6 = this.f62853E;
        if (interfaceC34400Lx6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC34400Lx6 = null;
        }
        interfaceC34400Lx6.mo7480n0();
        mo58957w().mo37030e3();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C12284b4 c12284b4;
        super.onCreate(bundle);
        H22.f12748a.mo24094G(this);
        C12284b4 m65043c = C12284b4.m65043c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m65043c, "inflate(layoutInflater)");
        setContentView(m65043c.f56861o);
        mo58977D();
        QrCodeZXingScannerView qrCodeZXingScannerView = m65043c.f56862p;
        Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView, "binding.scannerView");
        ImageView imageView = m65043c.f56855i;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flashButton");
        ImageView imageView2 = m65043c.f56867u;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.viewFinder");
        AppCompatEditText appCompatEditText = m65043c.f56852f;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.codeEditor");
        ImageView imageView3 = m65043c.f56851e;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.codeButton");
        this.f62853E = new C34634Mx6(this, new C42944ip2(this, qrCodeZXingScannerView, imageView, imageView2, appCompatEditText, imageView3, null, null, null, NA0.m94299e(this, C52342yg4.ic_code_scooter), NA0.m94299e(this, C52342yg4.ic_qr_scooter), 448, null));
        InterfaceC42985it3 m59326j0 = m59326j0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC34400Lx6 interfaceC34400Lx6 = this.f62853E;
        C33464Hx6 c33464Hx6 = null;
        if (interfaceC34400Lx6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            c12284b4 = m65043c;
            interfaceC34400Lx6 = null;
        } else {
            c12284b4 = m65043c;
        }
        QrCodeZXingScannerView qrCodeZXingScannerView2 = c12284b4.f56862p;
        Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView2, "binding.scannerView");
        C42392ht3 mo29782a = m59326j0.mo29782a(m58963Z, interfaceC34400Lx6, qrCodeZXingScannerView2);
        InterfaceC33698Ix6 m59325k0 = m59325k0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z2 = m58963Z();
        InterfaceC34400Lx6 interfaceC34400Lx62 = this.f62853E;
        if (interfaceC34400Lx62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC34400Lx62 = null;
        }
        C33464Hx6 mo99513a = m59325k0.mo99513a(m58963Z2, interfaceC34400Lx62, mo29782a);
        this.f62852D = mo99513a;
        if (mo99513a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            c33464Hx6 = mo99513a;
        }
        c33464Hx6.mo35633a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC51328wx6 interfaceC51328wx6 = this.f62852D;
        if (interfaceC51328wx6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC51328wx6 = null;
        }
        interfaceC51328wx6.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC51328wx6 interfaceC51328wx6 = this.f62852D;
        if (interfaceC51328wx6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC51328wx6 = null;
        }
        interfaceC51328wx6.onResume();
    }
}
