package co.bird.android.app.feature.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.app.feature.scanner.BirdScanActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.extra.ScanBarcodeExtra;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0002R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"Lco/bird/android/app/feature/scanner/BirdScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "k0", "LVS;", "B", "LVS;", "n0", "()LVS;", "setBirdScanPresenterImplFactory", "(LVS;)V", "birdScanPresenterImplFactory", "LxS;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LxS;", "presenter", "LZS;", "D", "LZS;", "ui", "Landroid/os/Handler;", "E", "Landroid/os/Handler;", "handler", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdScanActivity.kt\nco/bird/android/app/feature/scanner/BirdScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes2.dex */
public final class BirdScanActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC8652VS f62726B;

    /* renamed from: C */
    public InterfaceC30175xS f62727C;

    /* renamed from: D */
    public InterfaceC10274ZS f62728D;

    /* renamed from: E */
    public final Handler f62729E;

    public BirdScanActivity() {
        super(false, null, null, 7, null);
        this.f62729E = new Handler(Looper.getMainLooper());
    }

    /* renamed from: m0 */
    public static final void m59410m0(BirdScanActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(C39882df4.slide_none, C39882df4.slide_down);
    }

    /* renamed from: k0 */
    public final void m59411k0() {
        InterfaceC10274ZS interfaceC10274ZS = this.f62728D;
        if (interfaceC10274ZS != null) {
            interfaceC10274ZS.mo7480n0();
        }
        this.f62729E.post(new Runnable() { // from class: vS
            @Override // java.lang.Runnable
            public final void run() {
                BirdScanActivity.m59410m0(BirdScanActivity.this);
            }
        });
    }

    /* renamed from: n0 */
    public final InterfaceC8652VS m59409n0() {
        InterfaceC8652VS interfaceC8652VS = this.f62726B;
        if (interfaceC8652VS != null) {
            return interfaceC8652VS;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdScanPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC30175xS interfaceC30175xS = this.f62727C;
        if (interfaceC30175xS != null) {
            interfaceC30175xS.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m59411k0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        C19953e3 m43311c = C19953e3.m43311c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m43311c, "inflate(layoutInflater)");
        setContentView(m43311c.f77638q);
        mo58977D();
        H22.f12748a.mo24087K1(this);
        RideConfig rideConfig = mo58955y().m82623f8().getValue().getRideConfig();
        C36207Tq4 mo58955y = mo58955y();
        ActionBar supportActionBar = getSupportActionBar();
        ImageView imageView = m43311c.f77630i;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flashButton");
        View view = m43311c.f77645x;
        Intrinsics.checkNotNullExpressionValue(view, "binding.viewFinder");
        AppCompatEditText appCompatEditText = m43311c.f77627f;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.codeEditor");
        ImageView imageView2 = m43311c.f77626e;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.codeButton");
        TextView textView = m43311c.f77634m;
        ImageView imageView3 = m43311c.f77641t;
        BirdActionView birdActionView = m43311c.f77623b;
        TextView textView2 = m43311c.f77635n;
        String string = getString(C45871nl4.scan_bird_v2_info_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.scan_bird_v2_info_text)");
        String string2 = getString(C45871nl4.scan_bird_v2_enter_code_instructions, Integer.valueOf(rideConfig.getMinBirdCodeLength()), Integer.valueOf(rideConfig.getMaxBirdCodeLength()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.scan_…Config.maxBirdCodeLength)");
        ConstraintLayout constraintLayout = m43311c.f77628g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.container");
        FrameLayout frameLayout = m43311c.f77638q;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        C44103km5 c44103km5 = new C44103km5(this, mo58955y, supportActionBar, imageView, view, appCompatEditText, imageView2, textView, imageView3, birdActionView, textView2, string, string2, constraintLayout, frameLayout);
        FrequentFlyerScannerView frequentFlyerScannerView = m43311c.f77631j;
        Intrinsics.checkNotNullExpressionValue(frequentFlyerScannerView, "binding.frequentFlyerStatus");
        BirdActionView birdActionView2 = m43311c.f77623b;
        Intrinsics.checkNotNullExpressionValue(birdActionView2, "binding.birdStatus");
        TextView textView3 = m43311c.f77635n;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.pricing");
        this.f62728D = new C10715aT(this, frequentFlyerScannerView, birdActionView2, textView3, m43311c.f77643v, c44103km5, mo58955y().m82623f8().getValue().getPricingUiConfig().getEnableScannerTapToSeePricing());
        Parcelable parcelableExtra = getIntent().getParcelableExtra("scan_barcode");
        Intrinsics.checkNotNull(parcelableExtra);
        ScanBarcodeExtra scanBarcodeExtra = (ScanBarcodeExtra) parcelableExtra;
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (getCallingActivity() != null) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC8652VS m59409n0 = m59409n0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC10274ZS interfaceC10274ZS = this.f62728D;
        Intrinsics.checkNotNull(interfaceC10274ZS);
        C7427SS mo78433a = m59409n0.mo78433a(m58963Z, scanBarcodeExtra, interfaceC10274ZS, mo58957w(), z, true);
        mo78433a.mo5252a();
        if (wireBird != null) {
            mo78433a.m85453N(wireBird);
        }
        this.f62727C = mo78433a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC30175xS interfaceC30175xS = this.f62727C;
        if (interfaceC30175xS != null) {
            interfaceC30175xS.onPause();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC30175xS interfaceC30175xS = this.f62727C;
        if (interfaceC30175xS != null) {
            interfaceC30175xS.onResume();
        }
    }
}
