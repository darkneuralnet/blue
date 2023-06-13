package co.bird.android.app.feature.physicallock.smartlock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockQrScanActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.QrCodeFinderView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import me.dm7.barcodescanner.core.IViewFinder;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockQrScanActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LbN4;", "rawResult", "handleResult", "onPause", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "B", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scannerView", "LtK5;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LtK5;", "ui", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockQrScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockQrScanActivity.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockQrScanActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n180#2:83\n*S KotlinDebug\n*F\n+ 1 SmartlockQrScanActivity.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockQrScanActivity\n*L\n47#1:83\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockQrScanActivity extends BaseActivity implements ZXingScannerView.ResultHandler {

    /* renamed from: D */
    public static final C14169a f62243D = new C14169a(null);

    /* renamed from: E */
    public static final int f62244E = 8;

    /* renamed from: B */
    public ZXingScannerView f62245B;

    /* renamed from: C */
    public InterfaceC49175tK5 f62246C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockQrScanActivity$a;", "", "", "SERIAL_NUMBER_RESULT_CODE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockQrScanActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14169a {
        public /* synthetic */ C14169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14169a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockQrScanActivity$b */
    /* loaded from: classes2.dex */
    public static final class C14170b extends Lambda implements Function1<Unit, Unit> {
        public C14170b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC49175tK5 interfaceC49175tK5 = SmartlockQrScanActivity.this.f62246C;
            if (interfaceC49175tK5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ui");
                interfaceC49175tK5 = null;
            }
            interfaceC49175tK5.mo10451i();
        }
    }

    public SmartlockQrScanActivity() {
        super(false, null, null, 7, null);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 rawResult) {
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        if (rawResult.m64617f() != null) {
            boolean z = false;
            C41318g46.m40163a("got a lock QR scan result " + rawResult, new Object[0]);
            String m64617f = rawResult.m64617f();
            if ((m64617f == null || m64617f.length() == 0) ? true : true) {
                InterfaceC49175tK5 interfaceC49175tK5 = this.f62246C;
                ZXingScannerView zXingScannerView = null;
                if (interfaceC49175tK5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ui");
                    interfaceC49175tK5 = null;
                }
                interfaceC49175tK5.mo10452fe();
                ZXingScannerView zXingScannerView2 = this.f62245B;
                if (zXingScannerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scannerView");
                    zXingScannerView2 = null;
                }
                zXingScannerView2.setResultHandler(this);
                ZXingScannerView zXingScannerView3 = this.f62245B;
                if (zXingScannerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scannerView");
                } else {
                    zXingScannerView = zXingScannerView3;
                }
                zXingScannerView.startCamera();
                return;
            }
            InterfaceC40099e13 mo58957w = mo58957w();
            Intent putExtra = new Intent().putExtra("smartlock_serial_number", m64617f);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras…IAL_NUMBER, serialNumber)");
            mo58957w.mo37029e4(17, putExtra);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23124i6 m34475c = C23124i6.m34475c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m34475c, "inflate(layoutInflater)");
        setContentView(C39311cj4.activity_smartlock_qr_scan);
        ZXingScannerView zXingScannerView = new ZXingScannerView(this) { // from class: co.bird.android.app.feature.physicallock.smartlock.SmartlockQrScanActivity$onCreate$1
            {
                super(this);
            }

            @Override // me.dm7.barcodescanner.core.BarcodeScannerView
            public IViewFinder createViewFinderView(Context context) {
                return new QrCodeFinderView(context);
            }
        };
        this.f62245B = zXingScannerView;
        m34475c.f86732f.addView(zXingScannerView, 0, new RelativeLayout.LayoutParams(-1, -1));
        ZXingScannerView zXingScannerView2 = this.f62245B;
        if (zXingScannerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView2 = null;
        }
        this.f62246C = new C49768uK5(this, zXingScannerView2);
        ImageView imageView = m34475c.f86731e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flashButton");
        Object m33094as = C44626lf5.clicksThrottle$default(imageView, 0L, 1, null).m33094as(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14170b c14170b = new C14170b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sK5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockQrScanActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ZXingScannerView zXingScannerView = this.f62245B;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        zXingScannerView.stopCamera();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ZXingScannerView zXingScannerView = this.f62245B;
        ZXingScannerView zXingScannerView2 = null;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        zXingScannerView.startCamera();
        ZXingScannerView zXingScannerView3 = this.f62245B;
        if (zXingScannerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
        } else {
            zXingScannerView2 = zXingScannerView3;
        }
        zXingScannerView2.setResultHandler(this);
    }
}
