package p000;

import android.location.Location;
import android.widget.ProgressBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.QuickStartUnselectedBannerView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lwe4;", "Lve4;", "LxE;", "Lio/reactivex/Observable;", "", "t4", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "currentLocation", "W7", "", "show", "k", "Lco/bird/android/widget/QuickStartUnselectedBannerView;", "b", "Lco/bird/android/widget/QuickStartUnselectedBannerView;", "quickStartUnselectedBanner", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/ProgressBar;", "secondaryProgressBar", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/QuickStartUnselectedBannerView;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: we4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51136we4 extends AbstractC30071xE implements InterfaceC50543ve4 {

    /* renamed from: b */
    public final QuickStartUnselectedBannerView f116299b;

    /* renamed from: c */
    public final ProgressBar f116300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51136we4(QuickStartUnselectedBannerView quickStartUnselectedBanner, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(quickStartUnselectedBanner, "quickStartUnselectedBanner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f116299b = quickStartUnselectedBanner;
        this.f116300c = (ProgressBar) activity.findViewById(C36585Vg4.secondaryProgressBar);
    }

    @Override // p000.InterfaceC50543ve4
    /* renamed from: W7 */
    public void mo6561W7(WireBird wireBird, Location currentLocation) {
        Intrinsics.checkNotNullParameter(currentLocation, "currentLocation");
        this.f116299b.setBird(wireBird, currentLocation);
    }

    @Override // p000.InterfaceC50543ve4
    /* renamed from: k */
    public void mo6560k(boolean z) {
        ProgressBar secondaryProgressBar = this.f116300c;
        Intrinsics.checkNotNullExpressionValue(secondaryProgressBar, "secondaryProgressBar");
        C49520tu6.show$default(secondaryProgressBar, z, 0, 2, null);
    }

    @Override // p000.InterfaceC50543ve4
    /* renamed from: t4 */
    public Observable<Unit> mo6559t4() {
        Observable<Unit> m54461r = this.f116299b.m54461r();
        Intrinsics.checkNotNullExpressionValue(m54461r, "quickStartUnselectedBanner.quickStartClicks()");
        return m54461r;
    }
}
