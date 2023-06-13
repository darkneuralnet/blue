package co.bird.android.app.feature.scanner;

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
import co.bird.android.app.feature.scanner.RiderBirdScanActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.extra.RiderBirdScanExtra;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onBackPressed", "k0", "LU85;", "B", "LU85;", "n0", "()LU85;", "setBirdScanPresenterImplFactory", "(LU85;)V", "birdScanPresenterImplFactory", "Lh85;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lh85;", "presenter", "LZS;", "D", "LZS;", "ui", "Landroid/os/Handler;", "E", "Landroid/os/Handler;", "handler", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RiderBirdScanActivity extends BaseActivity {

    /* renamed from: B */
    public U85 f62735B;

    /* renamed from: C */
    public InterfaceC41950h85 f62736C;

    /* renamed from: D */
    public InterfaceC10274ZS f62737D;

    /* renamed from: E */
    public final Handler f62738E;

    public RiderBirdScanActivity() {
        super(false, null, null, 7, null);
        this.f62738E = new Handler(Looper.getMainLooper());
    }

    /* renamed from: m0 */
    public static final void m59400m0(RiderBirdScanActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(C39882df4.slide_none, C39882df4.slide_down);
    }

    /* renamed from: k0 */
    public final void m59401k0() {
        InterfaceC10274ZS interfaceC10274ZS = this.f62737D;
        if (interfaceC10274ZS != null) {
            interfaceC10274ZS.mo7480n0();
        }
        this.f62738E.post(new Runnable() { // from class: f85
            @Override // java.lang.Runnable
            public final void run() {
                RiderBirdScanActivity.m59400m0(RiderBirdScanActivity.this);
            }
        });
    }

    /* renamed from: n0 */
    public final U85 m59399n0() {
        U85 u85 = this.f62735B;
        if (u85 != null) {
            return u85;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdScanPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m59401k0();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19953e3 m43311c = C19953e3.m43311c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m43311c, "inflate(layoutInflater)");
        setContentView(m43311c.f77638q);
        mo58977D();
        H22.f12748a.mo24095E2(this);
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
        this.f62737D = new C10715aT(this, frequentFlyerScannerView, birdActionView2, textView3, m43311c.f77643v, c44103km5, mo58955y().m82623f8().getValue().getPricingUiConfig().getEnableScannerTapToSeePricing());
        Parcelable parcelableExtra = getIntent().getParcelableExtra("rider_bird_scan");
        Intrinsics.checkNotNull(parcelableExtra);
        U85 m59399n0 = m59399n0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC10274ZS interfaceC10274ZS = this.f62737D;
        Intrinsics.checkNotNull(interfaceC10274ZS);
        O85 mo80319a = m59399n0.mo80319a(m58963Z, (RiderBirdScanExtra) parcelableExtra, interfaceC10274ZS);
        mo80319a.m92798a();
        this.f62736C = mo80319a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC41950h85 interfaceC41950h85 = this.f62736C;
        if (interfaceC41950h85 != null) {
            interfaceC41950h85.onPause();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC41950h85 interfaceC41950h85 = this.f62736C;
        if (interfaceC41950h85 != null) {
            interfaceC41950h85.onResume();
        }
    }
}
