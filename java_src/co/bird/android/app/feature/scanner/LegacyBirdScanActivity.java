package co.bird.android.app.feature.scanner;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.app.feature.scanner.LegacyBirdScanActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.extra.ScanBarcodeExtra;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import co.bird.android.widget.QrCodeZXingScannerView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "k0", "onBackPressed", "LVS;", "B", "LVS;", "n0", "()LVS;", "setBirdScanPresenterFactory", "(LVS;)V", "birdScanPresenterFactory", "LxS;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LxS;", "presenter", "Landroid/os/Handler;", "D", "Landroid/os/Handler;", "handler", "LZS;", "E", "LZS;", "ui", "F", "Z", "enablePeripheralKeyboardSupport", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyBirdScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyBirdScanActivity.kt\nco/bird/android/app/feature/scanner/LegacyBirdScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes2.dex */
public final class LegacyBirdScanActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC8652VS f62730B;

    /* renamed from: C */
    public InterfaceC30175xS f62731C;

    /* renamed from: D */
    public final Handler f62732D;

    /* renamed from: E */
    public InterfaceC10274ZS f62733E;

    /* renamed from: F */
    public boolean f62734F;

    public LegacyBirdScanActivity() {
        super(false, null, null, 7, null);
        this.f62732D = new Handler(Looper.getMainLooper());
    }

    /* renamed from: m0 */
    public static final void m59406m0(LegacyBirdScanActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(C39882df4.slide_none, C39882df4.slide_down);
    }

    /* renamed from: o0 */
    public static final Drawable m59404o0(LegacyBirdScanActivity legacyBirdScanActivity) {
        return NA0.m94299e(legacyBirdScanActivity, C52342yg4.ic_code_scooter);
    }

    /* renamed from: p0 */
    public static final Drawable m59403p0(LegacyBirdScanActivity legacyBirdScanActivity) {
        return NA0.m94299e(legacyBirdScanActivity, C52342yg4.ic_qr_scooter);
    }

    /* renamed from: k0 */
    public final void m59407k0() {
        InterfaceC10274ZS interfaceC10274ZS = this.f62733E;
        if (interfaceC10274ZS == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC10274ZS = null;
        }
        interfaceC10274ZS.mo7480n0();
        this.f62732D.post(new Runnable() { // from class: Wo2
            @Override // java.lang.Runnable
            public final void run() {
                LegacyBirdScanActivity.m59406m0(LegacyBirdScanActivity.this);
            }
        });
    }

    /* renamed from: n0 */
    public final InterfaceC8652VS m59405n0() {
        InterfaceC8652VS interfaceC8652VS = this.f62730B;
        if (interfaceC8652VS != null) {
            return interfaceC8652VS;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdScanPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m59407k0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        InterfaceC42324hm5 c42944ip2;
        boolean z3;
        InterfaceC10274ZS interfaceC10274ZS;
        super.onCreate(bundle);
        C12284b4 m65043c = C12284b4.m65043c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m65043c, "inflate(layoutInflater)");
        setContentView(m65043c.f56861o);
        mo58977D();
        H22.f12748a.mo24031t1(this);
        if (getResources().getConfiguration().keyboard != 1 && mo58955y().m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport()) {
            z = true;
        } else {
            z = false;
        }
        this.f62734F = z;
        if (z) {
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
            z2 = true;
            c42944ip2 = new C48042rQ3(this, qrCodeZXingScannerView, imageView, imageView2, appCompatEditText, imageView3, m65043c.f56858l, null, null, null, m59404o0(this), 896, null);
        } else {
            z2 = true;
            QrCodeZXingScannerView qrCodeZXingScannerView2 = m65043c.f56862p;
            Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView2, "binding.scannerView");
            ImageView imageView4 = m65043c.f56855i;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.flashButton");
            ImageView imageView5 = m65043c.f56867u;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.viewFinder");
            AppCompatEditText appCompatEditText2 = m65043c.f56852f;
            Intrinsics.checkNotNullExpressionValue(appCompatEditText2, "binding.codeEditor");
            ImageView imageView6 = m65043c.f56851e;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.codeButton");
            c42944ip2 = new C42944ip2(this, qrCodeZXingScannerView2, imageView4, imageView5, appCompatEditText2, imageView6, m65043c.f56857k, m65043c.f56863q, m65043c.f56848b, m59404o0(this), m59403p0(this));
        }
        FrequentFlyerScannerView frequentFlyerScannerView = m65043c.f56856j;
        Intrinsics.checkNotNullExpressionValue(frequentFlyerScannerView, "binding.frequentFlyerStatus");
        BirdActionView birdActionView = m65043c.f56848b;
        Intrinsics.checkNotNullExpressionValue(birdActionView, "binding.birdStatus");
        TextView textView = m65043c.f56859m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.pricing");
        this.f62733E = new C10715aT(this, frequentFlyerScannerView, birdActionView, textView, null, c42944ip2, mo58955y().m82623f8().getValue().getPricingUiConfig().getEnableScannerTapToSeePricing());
        Parcelable parcelableExtra = getIntent().getParcelableExtra("scan_barcode");
        Intrinsics.checkNotNull(parcelableExtra);
        ScanBarcodeExtra scanBarcodeExtra = (ScanBarcodeExtra) parcelableExtra;
        if (getCallingActivity() != null) {
            z3 = z2;
        } else {
            z3 = false;
        }
        InterfaceC8652VS m59405n0 = m59405n0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC10274ZS interfaceC10274ZS2 = this.f62733E;
        C7427SS c7427ss = null;
        if (interfaceC10274ZS2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ui");
            interfaceC10274ZS = null;
        } else {
            interfaceC10274ZS = interfaceC10274ZS2;
        }
        C7427SS mo78433a = m59405n0.mo78433a(m58963Z, scanBarcodeExtra, interfaceC10274ZS, mo58957w(), z3, false);
        this.f62731C = mo78433a;
        if (mo78433a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        } else {
            c7427ss = mo78433a;
        }
        c7427ss.mo5252a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (this.f62734F) {
            getMenuInflater().inflate(C33111Gk4.menu_qr_code, menu);
            MenuItem findItem = menu.findItem(C52955zi4.qrCode);
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                drawable = P61.m90834r(icon);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                P61.m90838n(drawable, -1);
            }
            findItem.setIcon(drawable);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        InterfaceC30175xS interfaceC30175xS = null;
        if (itemId == 16908332) {
            InterfaceC30175xS interfaceC30175xS2 = this.f62731C;
            if (interfaceC30175xS2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                interfaceC30175xS = interfaceC30175xS2;
            }
            interfaceC30175xS.onBackPressed();
        } else if (itemId == C38115ai4.qrCode) {
            InterfaceC30175xS interfaceC30175xS3 = this.f62731C;
            if (interfaceC30175xS3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                interfaceC30175xS = interfaceC30175xS3;
            }
            interfaceC30175xS.mo5251q();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC30175xS interfaceC30175xS = this.f62731C;
        if (interfaceC30175xS == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC30175xS = null;
        }
        interfaceC30175xS.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC30175xS interfaceC30175xS = this.f62731C;
        if (interfaceC30175xS == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC30175xS = null;
        }
        interfaceC30175xS.onResume();
    }
}
