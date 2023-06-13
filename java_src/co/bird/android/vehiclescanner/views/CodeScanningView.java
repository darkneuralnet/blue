package co.bird.android.vehiclescanner.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,B!\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b(\u0010/J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00120\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u00060"}, m28432d2 = {"Lco/bird/android/vehiclescanner/views/CodeScanningView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "LbN4;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "handleResult", "p3", "g", "h", "", "aspectTolerance", "setAspectTolerance", "B6", "", "enable", "e", "Lio/reactivex/Observable;", "", "T", "f", "v0", "G", "b", "Z", "isScanningEnabled", "()Z", "setScanningEnabled", "(Z)V", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "scanSubject", "LZp6;", DateTokenConverter.CONVERTER_KEY, "LZp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCodeScanningView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeScanningView.kt\nco/bird/android/vehiclescanner/views/CodeScanningView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes4.dex */
public final class CodeScanningView extends ConstraintLayout implements ZXingScannerView.ResultHandler {

    /* renamed from: b */
    public boolean f67129b;

    /* renamed from: c */
    public final C24558d<String> f67130c;

    /* renamed from: d */
    public final C37604Zp6 f67131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeScanningView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67129b = true;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f67130c = m31902e;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37604Zp6 m72407b = C37604Zp6.m72407b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m72407b, "inflate(context.layoutInflater, this)");
        this.f67131d = m72407b;
    }

    /* renamed from: B6 */
    public final void m54783B6() {
        this.f67131d.f49375k.toggleFlash();
    }

    /* renamed from: G */
    public final Observable<Unit> m54782G() {
        AppCompatImageButton appCompatImageButton = this.f67131d.f49366b;
        Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "binding.bluetooth");
        return C44626lf5.clicksThrottle$default(appCompatImageButton, 0L, 1, null);
    }

    /* renamed from: T */
    public final Observable<String> m54781T() {
        Observable<String> hide = this.f67130c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSubject.hide()");
        return hide;
    }

    /* renamed from: e */
    public final void m54780e(boolean z) {
        ImageView imageView = this.f67131d.f49374j;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewFinder");
        C49520tu6.show$default(imageView, !z, 0, 2, null);
        AppCompatImageButton appCompatImageButton = this.f67131d.f49370f;
        Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "binding.flash");
        C49520tu6.show$default(appCompatImageButton, !z, 0, 2, null);
    }

    /* renamed from: f */
    public final Observable<Unit> m54779f() {
        AppCompatImageButton appCompatImageButton = this.f67131d.f49370f;
        Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "binding.flash");
        return C44626lf5.clicksThrottle$default(appCompatImageButton, 0L, 1, null);
    }

    /* renamed from: g */
    public final void m54778g() {
        setAspectTolerance(0.2f);
        this.f67131d.f49375k.startCamera();
        m54776p3();
    }

    /* renamed from: h */
    public final void m54777h() {
        this.f67131d.f49375k.stopCameraPreview();
        this.f67131d.f49375k.stopCamera();
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 c38511bN4) {
        String m64617f;
        if (this.f67129b) {
            if (c38511bN4 != null && (m64617f = c38511bN4.m64617f()) != null) {
                this.f67130c.onNext(m64617f);
                return;
            }
            return;
        }
        m54776p3();
    }

    /* renamed from: p3 */
    public final void m54776p3() {
        this.f67131d.f49375k.resumeCameraPreview(this);
    }

    public final void setAspectTolerance(float f) {
        this.f67131d.f49375k.setAspectTolerance(f);
    }

    public final void setScanningEnabled(boolean z) {
        this.f67129b = z;
    }

    /* renamed from: v0 */
    public final Observable<Unit> m54775v0() {
        AppCompatImageButton appCompatImageButton = this.f67131d.f49368d;
        Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "binding.code");
        return C44626lf5.clicksThrottle$default(appCompatImageButton, 0L, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeScanningView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67129b = true;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f67130c = m31902e;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37604Zp6 m72407b = C37604Zp6.m72407b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m72407b, "inflate(context.layoutInflater, this)");
        this.f67131d = m72407b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeScanningView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67129b = true;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f67130c = m31902e;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37604Zp6 m72407b = C37604Zp6.m72407b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m72407b, "inflate(context.layoutInflater, this)");
        this.f67131d = m72407b;
    }
}
