package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionLayout;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010.\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'¨\u00063"}, m28432d2 = {"LTK5;", "LxE;", "", "enabled", "", "Ql", "Lio/reactivex/Observable;", "Pl", "Rl", "visible", "Vl", "Wl", "", "serialNumber", "Sl", "w", "Tl", "Ul", PaymentMethodOptionsParams.Blik.PARAM_CODE, "m", "Lco/bird/android/widget/CallToActionLayout;", "b", "Lco/bird/android/widget/CallToActionLayout;", "ctaLayout", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "scanLockButton", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "scanLockSuccess", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "lockSerial", "g", "scanBirdButton", "h", "scanBirdSuccess", "i", "birdCode", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TK5 */
/* loaded from: classes2.dex */
public final class TK5 extends AbstractC30071xE {

    /* renamed from: b */
    public final CallToActionLayout f35326b;

    /* renamed from: c */
    public final ProgressBar f35327c;

    /* renamed from: d */
    public final Button f35328d;

    /* renamed from: e */
    public final ImageView f35329e;

    /* renamed from: f */
    public final TextView f35330f;

    /* renamed from: g */
    public final Button f35331g;

    /* renamed from: h */
    public final ImageView f35332h;

    /* renamed from: i */
    public final TextView f35333i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TK5(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f35326b = (CallToActionLayout) C40788fB0.m41779c(activity, C36585Vg4.root);
        ProgressBar progressBar = (ProgressBar) activity.findViewById(C36585Vg4.progressBar);
        this.f35327c = progressBar;
        this.f35328d = (Button) C40788fB0.m41779c(activity, C36585Vg4.scanLockQrButton);
        this.f35329e = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.scanLockQrSuccess);
        this.f35330f = (TextView) C40788fB0.m41779c(activity, C36585Vg4.lockSerial);
        this.f35331g = (Button) C40788fB0.m41779c(activity, C36585Vg4.scanBirdQrButton);
        this.f35332h = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.scanBirdQrSuccess);
        this.f35333i = (TextView) C40788fB0.m41779c(activity, C36585Vg4.birdCode);
        progressBar.setVisibility(8);
    }

    /* renamed from: Pl */
    public final Observable<Unit> m83781Pl() {
        return this.f35326b.m54693b();
    }

    /* renamed from: Ql */
    public final void m83780Ql(boolean z) {
        this.f35326b.setButtonEnabled(z);
    }

    /* renamed from: Rl */
    public final Observable<Unit> m83779Rl() {
        return C44626lf5.clicksThrottle$default(this.f35328d, 0L, 1, null);
    }

    /* renamed from: Sl */
    public final void m83778Sl(String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.f35330f.setText(serialNumber);
    }

    /* renamed from: Tl */
    public final void m83777Tl(boolean z) {
        C49520tu6.show$default(this.f35331g, z, 0, 2, null);
    }

    /* renamed from: Ul */
    public final void m83776Ul(boolean z) {
        C49520tu6.show$default(this.f35332h, z, 0, 2, null);
    }

    /* renamed from: Vl */
    public final void m83775Vl(boolean z) {
        C49520tu6.show$default(this.f35328d, z, 0, 2, null);
    }

    /* renamed from: Wl */
    public final void m83774Wl(boolean z) {
        C49520tu6.show$default(this.f35329e, z, 0, 2, null);
    }

    /* renamed from: m */
    public final void m83773m(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f35333i.setText(code);
    }

    /* renamed from: w */
    public final Observable<Unit> m83772w() {
        return C44626lf5.clicksThrottle$default(this.f35331g, 0L, 1, null);
    }
}
