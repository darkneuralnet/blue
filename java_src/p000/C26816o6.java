package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import me.relex.circleindicator.CircleIndicator3;
/* renamed from: o6 */
/* loaded from: classes3.dex */
public final class C26816o6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f101365a;

    /* renamed from: b */
    public final FrameLayout f101366b;

    /* renamed from: c */
    public final Button f101367c;

    /* renamed from: d */
    public final CircleIndicator3 f101368d;

    /* renamed from: e */
    public final ViewPager2 f101369e;

    public C26816o6(ConstraintLayout constraintLayout, FrameLayout frameLayout, Button button, CircleIndicator3 circleIndicator3, ViewPager2 viewPager2) {
        this.f101365a = constraintLayout;
        this.f101366b = frameLayout;
        this.f101367c = button;
        this.f101368d = circleIndicator3;
        this.f101369e = viewPager2;
    }

    /* renamed from: a */
    public static C26816o6 m21799a(View view) {
        int i = C40504ei4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C40504ei4.next;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C40504ei4.pageIndicator;
                CircleIndicator3 circleIndicator3 = (CircleIndicator3) C34328Lp6.m96312a(view, i);
                if (circleIndicator3 != null) {
                    i = C40504ei4.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
                    if (viewPager2 != null) {
                        return new C26816o6((ConstraintLayout) view, frameLayout, button, circleIndicator3, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C26816o6 m21797c(LayoutInflater layoutInflater) {
        return m21796d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26816o6 m21796d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35676Rj4.activity_tutorial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m21799a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101365a;
    }
}
