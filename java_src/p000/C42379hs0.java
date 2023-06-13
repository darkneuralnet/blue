package p000;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"Lhs0;", "LxE;", "Lgs0;", "Lio/reactivex/Observable;", "", "ub", "z8", "zi", "c8", "P8", "", "loading", "k", "show", "x8", "aj", "Yh", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "badRiderButton", "c", "badlyParkedButton", DateTokenConverter.CONVERTER_KEY, "damagedButton", "e", "reportFraudButton", "f", "contactBirdButton", "Landroid/widget/ProgressBar;", "g", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/LinearLayout;", "h", "Landroid/widget/LinearLayout;", "container", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hs0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42379hs0 extends AbstractC30071xE implements InterfaceC41786gs0 {

    /* renamed from: b */
    public final Button f86014b;

    /* renamed from: c */
    public final Button f86015c;

    /* renamed from: d */
    public final Button f86016d;

    /* renamed from: e */
    public final Button f86017e;

    /* renamed from: f */
    public final Button f86018f;

    /* renamed from: g */
    public final ProgressBar f86019g;

    /* renamed from: h */
    public final LinearLayout f86020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42379hs0(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f86014b = (Button) C40788fB0.m41779c(activity, C36585Vg4.unsafeRiderButton);
        this.f86015c = (Button) C40788fB0.m41779c(activity, C36585Vg4.badlyParkedBirdButton);
        this.f86016d = (Button) C40788fB0.m41779c(activity, C36585Vg4.damagedBirdButton);
        this.f86017e = (Button) C40788fB0.m41779c(activity, C36585Vg4.reportFraudButton);
        this.f86018f = (Button) C40788fB0.m41779c(activity, C36585Vg4.contactBirdButton);
        this.f86019g = (ProgressBar) C40788fB0.m41779c(activity, C36585Vg4.progressBar);
        this.f86020h = (LinearLayout) C40788fB0.m41779c(activity, C36585Vg4.container);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: P8 */
    public Observable<Unit> mo35699P8() {
        return C44626lf5.clicksThrottle$default(this.f86018f, 0L, 1, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: Yh */
    public void mo35698Yh(boolean z) {
        C49520tu6.show$default(this.f86017e, z, 0, 2, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: aj */
    public void mo35697aj(boolean z) {
        C49520tu6.show$default(this.f86014b, z, 0, 2, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: c8 */
    public Observable<Unit> mo35696c8() {
        return C44626lf5.clicksThrottle$default(this.f86017e, 0L, 1, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: k */
    public void mo35695k(boolean z) {
        C49520tu6.show$default(this.f86019g, z, 0, 2, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: ub */
    public Observable<Unit> mo35694ub() {
        return C44626lf5.clicksThrottle$default(this.f86014b, 0L, 1, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: x8 */
    public void mo35693x8(boolean z) {
        C49520tu6.show$default(this.f86020h, z, 0, 2, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: z8 */
    public Observable<Unit> mo35692z8() {
        return C44626lf5.clicksThrottle$default(this.f86015c, 0L, 1, null);
    }

    @Override // p000.InterfaceC41786gs0
    /* renamed from: zi */
    public Observable<Unit> mo35691zi() {
        return C44626lf5.clicksThrottle$default(this.f86016d, 0L, 1, null);
    }
}
