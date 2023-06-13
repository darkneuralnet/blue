package p000;

import android.view.View;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.SingleBannerFlightView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lls1;", "Lks1;", "LxE;", "Landroid/view/View;", "view", "", "zg", "rl", "", "id", "newView", "Pl", "Lco/bird/android/widget/SingleBannerFlightView;", "b", "Lco/bird/android/widget/SingleBannerFlightView;", "flightView", "kotlin.jvm.PlatformType", "c", "Landroid/view/View;", "bannerPlaceholder", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/SingleBannerFlightView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ls1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44752ls1 extends AbstractC30071xE implements InterfaceC44159ks1 {

    /* renamed from: b */
    public final SingleBannerFlightView f96840b;

    /* renamed from: c */
    public final View f96841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44752ls1(BaseActivity activity, SingleBannerFlightView flightView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(flightView, "flightView");
        this.f96840b = flightView;
        this.f96841c = flightView.findViewById(C52955zi4.bannerPlaceholder);
    }

    /* renamed from: Pl */
    public final void m26729Pl(int i, View view) {
        View findViewById = this.f96840b.findViewById(i);
        if (findViewById == null) {
            return;
        }
        int indexOfChild = this.f96840b.indexOfChild(findViewById);
        view.setLayoutParams(findViewById.getLayoutParams());
        view.setId(findViewById.getId());
        this.f96840b.addView(view, indexOfChild);
        this.f96840b.removeView(findViewById);
    }

    @Override // p000.InterfaceC44159ks1
    /* renamed from: rl */
    public void mo26728rl() {
        int i = C52955zi4.bannerPlaceholder;
        View bannerPlaceholder = this.f96841c;
        Intrinsics.checkNotNullExpressionValue(bannerPlaceholder, "bannerPlaceholder");
        m26729Pl(i, bannerPlaceholder);
    }

    @Override // p000.InterfaceC44159ks1
    /* renamed from: zg */
    public void mo26727zg(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m26729Pl(C52955zi4.bannerPlaceholder, view);
        C49520tu6.m11233r(view);
    }
}
