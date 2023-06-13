package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import me.relex.circleindicator.CircleIndicator3;
/* renamed from: Zx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37671Zx1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f49509a;

    /* renamed from: b */
    public final ConstraintLayout f49510b;

    /* renamed from: c */
    public final Button f49511c;

    /* renamed from: d */
    public final Button f49512d;

    /* renamed from: e */
    public final CircleIndicator3 f49513e;

    /* renamed from: f */
    public final TextView f49514f;

    /* renamed from: g */
    public final Button f49515g;

    /* renamed from: h */
    public final ViewPager2 f49516h;

    public C37671Zx1(LinearLayout linearLayout, ConstraintLayout constraintLayout, Button button, Button button2, CircleIndicator3 circleIndicator3, TextView textView, Button button3, ViewPager2 viewPager2) {
        this.f49509a = linearLayout;
        this.f49510b = constraintLayout;
        this.f49511c = button;
        this.f49512d = button2;
        this.f49513e = circleIndicator3;
        this.f49514f = textView;
        this.f49515g = button3;
        this.f49516h = viewPager2;
    }

    /* renamed from: a */
    public static C37671Zx1 m72285a(View view) {
        int i = C43459jh4.buttonContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            i = C43459jh4.help;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C43459jh4.next;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C43459jh4.pageIndicator;
                    CircleIndicator3 circleIndicator3 = (CircleIndicator3) C34328Lp6.m96312a(view, i);
                    if (circleIndicator3 != null) {
                        i = C43459jh4.scrollDownAgree;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C43459jh4.skip;
                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                            if (button3 != null) {
                                i = C43459jh4.viewPager;
                                ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
                                if (viewPager2 != null) {
                                    return new C37671Zx1((LinearLayout) view, constraintLayout, button, button2, circleIndicator3, textView, button3, viewPager2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C37671Zx1 m72283c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36837Wi4.fragment_configurable_tutorial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72285a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f49509a;
    }
}
