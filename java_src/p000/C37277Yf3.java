package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import co.bird.android.app.feature.longterm.LongTermSetupProductPointView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionLayout;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"LYf3;", "LxE;", "", "point", "", "Pl", "Lio/reactivex/Observable;", "Ql", "Lco/bird/android/widget/CallToActionLayout;", "b", "Lco/bird/android/widget/CallToActionLayout;", "callToActionLayout", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "productPoints", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/view/View;", "rootView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yf3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37277Yf3 extends AbstractC30071xE {

    /* renamed from: b */
    public final CallToActionLayout f46225b;

    /* renamed from: c */
    public final LinearLayout f46226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37277Yf3(BaseActivity activity, View rootView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f46225b = (CallToActionLayout) C49520tu6.m11243h(rootView, C36585Vg4.callToActionLayout);
        this.f46226c = (LinearLayout) C49520tu6.m11243h(rootView, C36585Vg4.productPoints);
    }

    /* renamed from: Pl */
    public final void m74596Pl(String point) {
        Intrinsics.checkNotNullParameter(point, "point");
        LongTermSetupProductPointView longTermSetupProductPointView = new LongTermSetupProductPointView((Context) getActivity(), true);
        longTermSetupProductPointView.setText(point);
        this.f46226c.addView(longTermSetupProductPointView);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m74595Ql() {
        return this.f46225b.m54693b();
    }
}
