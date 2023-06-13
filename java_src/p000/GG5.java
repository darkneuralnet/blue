package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\n  *\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010+\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010/\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001c\u00103\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001c\u00107\u001a\n  *\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001c\u0010;\u001a\n  *\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u001c\u0010=\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u001c\u0010?\u001a\n  *\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u001c\u0010A\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010.R\u001c\u0010C\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010*R\u001c\u0010E\u001a\n  *\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00106R\u001c\u0010G\u001a\n  *\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010.R\u001c\u0010I\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010*R\u001c\u0010J\u001a\n  *\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006O"}, m28432d2 = {"LGG5;", "LFF5;", "LxE;", "", "visible", "", "u3", "Lio/reactivex/Observable;", "la", "E4", "P0", "O", "O0", "H1", "Eh", "Pb", "c1", "V", "A1", "g0", "s0", "w", "H0", "K1", "W", "N", "J0", "r", "enabled", "a0", "e0", "Lco/bird/android/widget/CallToActionLayout;", "kotlin.jvm.PlatformType", "b", "Lco/bird/android/widget/CallToActionLayout;", "root", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "step1Button", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "step1Success", "f", "scanLockQrButton", "g", "scanLockQrSuccess", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "h", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "rekeyProgress", "i", "rekeySuccess", "j", "unlockProgress", "k", "unlockSuccess", "l", "reinsertPinProgress", "m", "reinsertPinSuccess", "n", "scanBirdbutton", "o", "scanBirdProgress", "p", "scanBirdSuccess", "q", "promoteLockTryAgainButton", "retryBirdAssocationButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GG5 */
/* loaded from: classes2.dex */
public final class GG5 extends AbstractC30071xE implements FF5 {

    /* renamed from: b */
    public final CallToActionLayout f11455b;

    /* renamed from: c */
    public final ProgressBar f11456c;

    /* renamed from: d */
    public final Button f11457d;

    /* renamed from: e */
    public final ImageView f11458e;

    /* renamed from: f */
    public final Button f11459f;

    /* renamed from: g */
    public final ImageView f11460g;

    /* renamed from: h */
    public final CircularProgressIndicator f11461h;

    /* renamed from: i */
    public final ImageView f11462i;

    /* renamed from: j */
    public final CircularProgressIndicator f11463j;

    /* renamed from: k */
    public final ImageView f11464k;

    /* renamed from: l */
    public final CircularProgressIndicator f11465l;

    /* renamed from: m */
    public final ImageView f11466m;

    /* renamed from: n */
    public final Button f11467n;

    /* renamed from: o */
    public final CircularProgressIndicator f11468o;

    /* renamed from: p */
    public final ImageView f11469p;

    /* renamed from: q */
    public final Button f11470q;

    /* renamed from: r */
    public final Button f11471r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GG5(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11455b = (CallToActionLayout) activity.findViewById(C36585Vg4.root);
        ProgressBar progressBar = (ProgressBar) activity.findViewById(C36585Vg4.progressBar);
        this.f11456c = progressBar;
        this.f11457d = (Button) activity.findViewById(C36585Vg4.markMountedToBird);
        this.f11458e = (ImageView) activity.findViewById(C36585Vg4.mountToBirdSuccess);
        this.f11459f = (Button) activity.findViewById(C36585Vg4.scanLockQrButton);
        this.f11460g = (ImageView) activity.findViewById(C36585Vg4.scanLockQrSuccess);
        this.f11461h = (CircularProgressIndicator) activity.findViewById(C36585Vg4.rekeyProgress);
        this.f11462i = (ImageView) activity.findViewById(C36585Vg4.rekeySuccess);
        this.f11463j = (CircularProgressIndicator) activity.findViewById(C36585Vg4.unlockProgress);
        this.f11464k = (ImageView) activity.findViewById(C36585Vg4.unlockSuccess);
        this.f11465l = (CircularProgressIndicator) activity.findViewById(C36585Vg4.reinsertPinProgress);
        this.f11466m = (ImageView) activity.findViewById(C36585Vg4.reinsertPinSuccess);
        this.f11467n = (Button) activity.findViewById(C36585Vg4.scanBirdButton);
        this.f11468o = (CircularProgressIndicator) activity.findViewById(C36585Vg4.scanBirdProgress);
        this.f11469p = (ImageView) activity.findViewById(C36585Vg4.scanBirdSuccess);
        this.f11470q = (Button) activity.findViewById(C36585Vg4.promoteLockTryAgainButton);
        this.f11471r = (Button) activity.findViewById(C36585Vg4.retryAssociationButton);
        progressBar.setVisibility(8);
    }

    @Override // p000.FF5
    /* renamed from: A1 */
    public void mo105556A1(boolean z) {
        Button scanBirdbutton = this.f11467n;
        Intrinsics.checkNotNullExpressionValue(scanBirdbutton, "scanBirdbutton");
        C49520tu6.show$default(scanBirdbutton, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: E4 */
    public void mo105555E4(boolean z) {
        ImageView scanLockQrSuccess = this.f11460g;
        Intrinsics.checkNotNullExpressionValue(scanLockQrSuccess, "scanLockQrSuccess");
        C49520tu6.show$default(scanLockQrSuccess, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: Eh */
    public void mo105554Eh(boolean z) {
        CircularProgressIndicator reinsertPinProgress = this.f11465l;
        Intrinsics.checkNotNullExpressionValue(reinsertPinProgress, "reinsertPinProgress");
        C49520tu6.show$default(reinsertPinProgress, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: H0 */
    public void mo105553H0(boolean z) {
        Button retryBirdAssocationButton = this.f11471r;
        Intrinsics.checkNotNullExpressionValue(retryBirdAssocationButton, "retryBirdAssocationButton");
        C49520tu6.show$default(retryBirdAssocationButton, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: H1 */
    public void mo105552H1(boolean z) {
        ImageView unlockSuccess = this.f11464k;
        Intrinsics.checkNotNullExpressionValue(unlockSuccess, "unlockSuccess");
        C49520tu6.show$default(unlockSuccess, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: J0 */
    public Observable<Unit> mo105551J0() {
        Button step1Button = this.f11457d;
        Intrinsics.checkNotNullExpressionValue(step1Button, "step1Button");
        return C44626lf5.clicksThrottle$default(step1Button, 0L, 1, null);
    }

    @Override // p000.FF5
    /* renamed from: K1 */
    public Observable<Unit> mo105550K1() {
        Button retryBirdAssocationButton = this.f11471r;
        Intrinsics.checkNotNullExpressionValue(retryBirdAssocationButton, "retryBirdAssocationButton");
        return C44626lf5.clicksThrottle$default(retryBirdAssocationButton, 0L, 1, null);
    }

    @Override // p000.FF5
    /* renamed from: N */
    public void mo105549N(boolean z) {
        Button step1Button = this.f11457d;
        Intrinsics.checkNotNullExpressionValue(step1Button, "step1Button");
        C49520tu6.show$default(step1Button, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: O */
    public void mo105548O(boolean z) {
        ImageView rekeySuccess = this.f11462i;
        Intrinsics.checkNotNullExpressionValue(rekeySuccess, "rekeySuccess");
        C49520tu6.show$default(rekeySuccess, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: O0 */
    public void mo105547O0(boolean z) {
        CircularProgressIndicator unlockProgress = this.f11463j;
        Intrinsics.checkNotNullExpressionValue(unlockProgress, "unlockProgress");
        C49520tu6.show$default(unlockProgress, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: P0 */
    public void mo105546P0(boolean z) {
        CircularProgressIndicator rekeyProgress = this.f11461h;
        Intrinsics.checkNotNullExpressionValue(rekeyProgress, "rekeyProgress");
        C49520tu6.m11232s(rekeyProgress, z, 4);
    }

    @Override // p000.FF5
    /* renamed from: Pb */
    public void mo105545Pb(boolean z) {
        ImageView reinsertPinSuccess = this.f11466m;
        Intrinsics.checkNotNullExpressionValue(reinsertPinSuccess, "reinsertPinSuccess");
        C49520tu6.show$default(reinsertPinSuccess, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: V */
    public Observable<Unit> mo105544V() {
        Button promoteLockTryAgainButton = this.f11470q;
        Intrinsics.checkNotNullExpressionValue(promoteLockTryAgainButton, "promoteLockTryAgainButton");
        return C44626lf5.clicksThrottle$default(promoteLockTryAgainButton, 0L, 1, null);
    }

    @Override // p000.FF5
    /* renamed from: W */
    public void mo105543W(boolean z) {
        ImageView step1Success = this.f11458e;
        Intrinsics.checkNotNullExpressionValue(step1Success, "step1Success");
        C49520tu6.show$default(step1Success, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: a0 */
    public void mo105542a0(boolean z) {
        this.f11455b.setButtonEnabled(z);
    }

    @Override // p000.FF5
    /* renamed from: c1 */
    public void mo105541c1(boolean z) {
        Button promoteLockTryAgainButton = this.f11470q;
        Intrinsics.checkNotNullExpressionValue(promoteLockTryAgainButton, "promoteLockTryAgainButton");
        C49520tu6.show$default(promoteLockTryAgainButton, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: e0 */
    public Observable<Unit> mo105540e0() {
        return this.f11455b.m54693b();
    }

    @Override // p000.FF5
    /* renamed from: g0 */
    public void mo105539g0(boolean z) {
        CircularProgressIndicator scanBirdProgress = this.f11468o;
        Intrinsics.checkNotNullExpressionValue(scanBirdProgress, "scanBirdProgress");
        C49520tu6.show$default(scanBirdProgress, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: la */
    public Observable<Unit> mo105538la() {
        Button scanLockQrButton = this.f11459f;
        Intrinsics.checkNotNullExpressionValue(scanLockQrButton, "scanLockQrButton");
        return C44626lf5.clicksThrottle$default(scanLockQrButton, 0L, 1, null);
    }

    @Override // p000.FF5
    /* renamed from: r */
    public void mo105537r() {
        Toast.makeText(getActivity(), C45871nl4.smartlock_associate_done_toast, 0).show();
    }

    @Override // p000.FF5
    /* renamed from: s0 */
    public void mo105536s0(boolean z) {
        ImageView scanBirdSuccess = this.f11469p;
        Intrinsics.checkNotNullExpressionValue(scanBirdSuccess, "scanBirdSuccess");
        C49520tu6.show$default(scanBirdSuccess, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: u3 */
    public void mo105535u3(boolean z) {
        Button scanLockQrButton = this.f11459f;
        Intrinsics.checkNotNullExpressionValue(scanLockQrButton, "scanLockQrButton");
        C49520tu6.show$default(scanLockQrButton, z, 0, 2, null);
    }

    @Override // p000.FF5
    /* renamed from: w */
    public Observable<Unit> mo105534w() {
        Button scanBirdbutton = this.f11467n;
        Intrinsics.checkNotNullExpressionValue(scanBirdbutton, "scanBirdbutton");
        return C44626lf5.clicksThrottle$default(scanBirdbutton, 0L, 1, null);
    }
}
