package co.bird.android.feature.servicecenter;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.BarcodeScannerActivity;
import co.bird.android.widget.QrCodeFinderView;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.dm7.barcodescanner.core.IViewFinder;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006,"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "onPause", "Lry;", "B", "Lry;", "k0", "()Lry;", "setPresenterFactory", "(Lry;)V", "presenterFactory", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scannerView", "LYx;", "D", "LYx;", "presenter", "Landroid/os/Handler;", "E", "Landroid/os/Handler;", "handler", "F", "Z", "enablePeripheralKeyboardSupport", "<init>", "()V", "G", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBarcodeScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerActivity.kt\nco/bird/android/feature/servicecenter/BarcodeScannerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes3.dex */
public final class BarcodeScannerActivity extends BaseActivity {

    /* renamed from: G */
    public static final C15553b f65237G = new C15553b(null);

    /* renamed from: B */
    public InterfaceC28072ry f65238B;

    /* renamed from: C */
    public ZXingScannerView f65239C;

    /* renamed from: D */
    public InterfaceC10084Yx f65240D;

    /* renamed from: E */
    public final Handler f65241E;

    /* renamed from: F */
    public boolean f65242F;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a;", "", "Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.servicecenter.BarcodeScannerActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15551a {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a$a;", "", "LlG2;", "mainComponent", C17296a.f69688o, "Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Builder
        /* renamed from: co.bird.android.feature.servicecenter.BarcodeScannerActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15552a {
            /* renamed from: a */
            InterfaceC15552a mo56931a(InterfaceC44393lG2 interfaceC44393lG2);

            InterfaceC15551a build();
        }

        /* renamed from: a */
        void mo56935a(BarcodeScannerActivity barcodeScannerActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.BarcodeScannerActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15553b {
        public /* synthetic */ C15553b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15553b() {
        }
    }

    public BarcodeScannerActivity() {
        super(false, null, null, 7, null);
        this.f65241E = new Handler(Looper.getMainLooper());
    }

    /* renamed from: m0 */
    public static final void m56940m0(BarcodeScannerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(C39882df4.slide_none, C39882df4.slide_down);
    }

    /* renamed from: k0 */
    public final InterfaceC28072ry m56941k0() {
        InterfaceC28072ry interfaceC28072ry = this.f65238B;
        if (interfaceC28072ry != null) {
            return interfaceC28072ry;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f65241E.post(new Runnable() { // from class: Vx
            @Override // java.lang.Runnable
            public final void run() {
                BarcodeScannerActivity.m56940m0(BarcodeScannerActivity.this);
            }
        });
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8919W2 m78905c = C8919W2.m78905c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m78905c, "inflate(layoutInflater)");
        setContentView(m78905c.f40300k);
        mo58977D();
        InterfaceC15551a.InterfaceC15552a m56936a = C15557a.m56936a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56936a.mo56931a(c46172oG2.m21419a(application)).build().mo56935a(this);
        this.f65239C = new ZXingScannerView(this) { // from class: co.bird.android.feature.servicecenter.BarcodeScannerActivity$onCreate$1
            {
                super(this);
            }

            @Override // me.dm7.barcodescanner.core.BarcodeScannerView
            public IViewFinder createViewFinderView(Context context) {
                return new QrCodeFinderView(context);
            }
        };
        boolean z = true;
        this.f65242F = (getResources().getConfiguration().keyboard == 1 || !mo58955y().m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport()) ? false : false;
        InterfaceC28072ry m56941k0 = m56941k0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        ZXingScannerView zXingScannerView = this.f65239C;
        if (zXingScannerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerView");
            zXingScannerView = null;
        }
        C26758ny mo13308a = m56941k0.mo13308a(m58963Z, new C29707vy(this, m78905c, zXingScannerView), mo58957w(), mo58956x(), this.f65242F);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo13308a.m22067w(intent);
        this.f65240D = mo13308a;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getString(getIntent().getIntExtra("activity_title", C45871nl4.service_center_scan_location)));
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (this.f65242F) {
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
        InterfaceC10084Yx interfaceC10084Yx = null;
        if (itemId == 16908332) {
            InterfaceC10084Yx interfaceC10084Yx2 = this.f65240D;
            if (interfaceC10084Yx2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                interfaceC10084Yx = interfaceC10084Yx2;
            }
            interfaceC10084Yx.onBackPressed();
        } else if (itemId == C38115ai4.qrCode) {
            InterfaceC10084Yx interfaceC10084Yx3 = this.f65240D;
            if (interfaceC10084Yx3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            } else {
                interfaceC10084Yx = interfaceC10084Yx3;
            }
            interfaceC10084Yx.mo22073q();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC10084Yx interfaceC10084Yx = this.f65240D;
        if (interfaceC10084Yx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC10084Yx = null;
        }
        interfaceC10084Yx.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC10084Yx interfaceC10084Yx = this.f65240D;
        if (interfaceC10084Yx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC10084Yx = null;
        }
        interfaceC10084Yx.onResume();
    }
}
