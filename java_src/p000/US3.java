package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import co.bird.android.app.feature.ridertutorial.widget.CircleIndicatorView;
import co.bird.android.widget.viewpager.parallax.ParallaxViewPager;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: US3 */
/* loaded from: classes2.dex */
public final class US3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f37441a;

    /* renamed from: b */
    public final Button f37442b;

    /* renamed from: c */
    public final LinearLayout f37443c;

    /* renamed from: d */
    public final RelativeLayout f37444d;

    /* renamed from: e */
    public final CircleIndicatorView f37445e;

    /* renamed from: f */
    public final LinearProgressIndicator f37446f;

    /* renamed from: g */
    public final Button f37447g;

    /* renamed from: h */
    public final ParallaxViewPager f37448h;

    public US3(RelativeLayout relativeLayout, Button button, LinearLayout linearLayout, RelativeLayout relativeLayout2, CircleIndicatorView circleIndicatorView, LinearProgressIndicator linearProgressIndicator, Button button2, ParallaxViewPager parallaxViewPager) {
        this.f37441a = relativeLayout;
        this.f37442b = button;
        this.f37443c = linearLayout;
        this.f37444d = relativeLayout2;
        this.f37445e = circleIndicatorView;
        this.f37446f = linearProgressIndicator;
        this.f37447g = button2;
        this.f37448h = parallaxViewPager;
    }

    /* renamed from: a */
    public static US3 m81489a(View view) {
        int i = C36585Vg4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.buttonContainer;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C36585Vg4.pageIndicator;
                CircleIndicatorView circleIndicatorView = (CircleIndicatorView) C34328Lp6.m96312a(view, i);
                if (circleIndicatorView != null) {
                    i = C36585Vg4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C36585Vg4.secondaryButton;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            i = C36585Vg4.viewPager;
                            ParallaxViewPager parallaxViewPager = (ParallaxViewPager) C34328Lp6.m96312a(view, i);
                            if (parallaxViewPager != null) {
                                return new US3(relativeLayout, button, linearLayout, relativeLayout, circleIndicatorView, linearProgressIndicator, button2, parallaxViewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static US3 m81487c(LayoutInflater layoutInflater) {
        return m81486d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static US3 m81486d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.physical_lock_tutorial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m81489a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f37441a;
    }
}
