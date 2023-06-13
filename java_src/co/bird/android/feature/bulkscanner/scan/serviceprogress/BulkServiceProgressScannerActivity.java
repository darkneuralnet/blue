package co.bird.android.feature.bulkscanner.scan.serviceprogress;

import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bulkscanner.scan.base.BaseBulkScannerActivity;
import co.bird.android.feature.bulkscanner.widgets.BulkScanListSheetView;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.QrCodeZXingScannerView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity;", "Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "", "enablePeripheralKeyboardSupport", "", "j0", "Lm40;", "D", "Lm40;", "m0", "()Lm40;", "setPresenter", "(Lm40;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,126:1\n44#2:127\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity\n*L\n46#1:127\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkServiceProgressScannerActivity extends BaseBulkScannerActivity {

    /* renamed from: D */
    public InterfaceC44870m40 f63529D;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a;", "", "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity;", "activity", "", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C14655b.class})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14652a {

        @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J¶\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH&¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;", "bulkServiceModule", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/ImageView;", "viewFinder", "Landroidx/appcompat/widget/AppCompatEditText;", "codeEditor", "codeButton", "bluetoothButton", "flashButton", "Landroid/widget/TextView;", "peripheralKeyboardScanTextView", "infoText", "scooter", "Lco/bird/android/widget/BirdActionView;", "status", "Landroid/view/View;", "dragView", "Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;", "bulkBirdListSheetView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scanView", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a;", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Factory
        /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14653a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C14654a {
                public static /* synthetic */ InterfaceC14652a create$default(InterfaceC14653a interfaceC14653a, InterfaceC44393lG2 interfaceC44393lG2, C14655b c14655b, BaseActivity baseActivity, ScopeProvider scopeProvider, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, BirdActionView birdActionView, View view, BulkScanListSheetView bulkScanListSheetView, ZXingScannerView zXingScannerView, BulkScanPurpose bulkScanPurpose, int i, Object obj) {
                    if (obj == null) {
                        return interfaceC14653a.mo58543a(interfaceC44393lG2, c14655b, baseActivity, scopeProvider, imageView, appCompatEditText, imageView2, imageView3, imageView4, (i & 512) != 0 ? null : textView, (i & 1024) != 0 ? null : textView2, (i & 2048) != 0 ? null : imageView5, (i & 4096) != 0 ? null : birdActionView, view, bulkScanListSheetView, zXingScannerView, bulkScanPurpose);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
            }

            /* renamed from: a */
            InterfaceC14652a mo58543a(InterfaceC44393lG2 interfaceC44393lG2, C14655b c14655b, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance ImageView imageView, @BindsInstance AppCompatEditText appCompatEditText, @BindsInstance ImageView imageView2, @BindsInstance ImageView imageView3, @BindsInstance ImageView imageView4, @BindsInstance TextView textView, @BindsInstance TextView textView2, @BindsInstance ImageView imageView5, @BindsInstance BirdActionView birdActionView, @BindsInstance View view, @BindsInstance BulkScanListSheetView bulkScanListSheetView, @BindsInstance ZXingScannerView zXingScannerView, @BindsInstance BulkScanPurpose bulkScanPurpose);
        }

        /* renamed from: a */
        void mo58551a(BulkServiceProgressScannerActivity bulkServiceProgressScannerActivity);
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0007R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;", "", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lhm5;", "ui", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scanView", "Lit3;", "factory", "Let3;", "b", "LY94;", "LrQ3;", "peripheralProvider", "Lip2;", "legacyProvider", C17296a.f69688o, "", "Z", "enablePeripheralKeyboardSupport", "<init>", "(Z)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC14656a.class})
    /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14655b {

        /* renamed from: a */
        public final boolean f63530a;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b$a;", "", "Lw40;", "impl", "Lv40;", C17296a.f69688o, "Lk50;", "Lm40;", "b", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14656a {
            @Binds
            /* renamed from: a */
            InterfaceC50205v40 m58560a(C50798w40 c50798w40);

            @Binds
            /* renamed from: b */
            InterfaceC44870m40 m58559b(C43694k50 c43694k50);
        }

        public C14655b(boolean z) {
            this.f63530a = z;
        }

        @Provides
        /* renamed from: a */
        public final InterfaceC42324hm5 m58562a(Y94<C48042rQ3> peripheralProvider, Y94<C42944ip2> legacyProvider) {
            Intrinsics.checkNotNullParameter(peripheralProvider, "peripheralProvider");
            Intrinsics.checkNotNullParameter(legacyProvider, "legacyProvider");
            if (this.f63530a) {
                C48042rQ3 c48042rQ3 = peripheralProvider.get();
                Intrinsics.checkNotNullExpressionValue(c48042rQ3, "peripheralProvider.get()");
                return c48042rQ3;
            }
            C42944ip2 c42944ip2 = legacyProvider.get();
            Intrinsics.checkNotNullExpressionValue(c42944ip2, "legacyProvider.get()");
            return c42944ip2;
        }

        @Provides
        /* renamed from: b */
        public final InterfaceC40613et3 m58561b(ScopeProvider scopeProvider, InterfaceC42324hm5 ui, ZXingScannerView scanView, InterfaceC42985it3 factory) {
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(ui, "ui");
            Intrinsics.checkNotNullParameter(scanView, "scanView");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.mo29782a(scopeProvider, ui, scanView);
        }
    }

    @Override // co.bird.android.feature.bulkscanner.scan.base.BaseBulkScannerActivity
    /* renamed from: j0 */
    public void mo58564j0(BulkScanPurpose purpose, boolean z) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        InterfaceC14652a.InterfaceC14653a m58552a = C14659c.m58552a();
        Intrinsics.checkNotNullExpressionValue(m58552a, "factory()");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C14655b c14655b = new C14655b(z);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        ImageView imageView = m58614k0().f113461A;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewFinder");
        AppCompatEditText appCompatEditText = m58614k0().f113473l;
        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "binding.codeEditor");
        ImageView imageView2 = m58614k0().f113472k;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.codeButton");
        ImageView imageView3 = m58614k0().f113465d;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.bluetoothButton");
        ImageView imageView4 = m58614k0().f113477p;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.flashButton");
        FrameLayout frameLayout = m58614k0().f113466e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.bottom");
        BulkScanListSheetView bulkScanListSheetView = m58614k0().f113469h;
        Intrinsics.checkNotNullExpressionValue(bulkScanListSheetView, "binding.bulkActionView");
        QrCodeZXingScannerView qrCodeZXingScannerView = m58614k0().f113483v;
        Intrinsics.checkNotNullExpressionValue(qrCodeZXingScannerView, "binding.scannerView");
        InterfaceC14652a.InterfaceC14653a.C14654a.create$default(m58552a, m21419a, c14655b, this, m45197b, imageView, appCompatEditText, imageView2, imageView3, imageView4, null, null, null, null, frameLayout, bulkScanListSheetView, qrCodeZXingScannerView, purpose, 7680, null).mo58551a(this);
    }

    @Override // co.bird.android.feature.bulkscanner.scan.base.BaseBulkScannerActivity
    /* renamed from: m0 */
    public InterfaceC44870m40 mo58563m0() {
        InterfaceC44870m40 interfaceC44870m40 = this.f63529D;
        if (interfaceC44870m40 != null) {
            return interfaceC44870m40;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }
}
