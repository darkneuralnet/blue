package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: zg3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52934zg3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f122058a;

    /* renamed from: b */
    public final TextView f122059b;

    /* renamed from: c */
    public final TextView f122060c;

    /* renamed from: d */
    public final ImageView f122061d;

    /* renamed from: e */
    public final Button f122062e;

    /* renamed from: f */
    public final Button f122063f;

    /* renamed from: g */
    public final Group f122064g;

    /* renamed from: h */
    public final TextView f122065h;

    /* renamed from: i */
    public final TextView f122066i;

    public C52934zg3(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, Button button, Button button2, Group group, TextView textView3, TextView textView4) {
        this.f122058a = constraintLayout;
        this.f122059b = textView;
        this.f122060c = textView2;
        this.f122061d = imageView;
        this.f122062e = button;
        this.f122063f = button2;
        this.f122064g = group;
        this.f122065h = textView3;
        this.f122066i = textView4;
    }

    /* renamed from: a */
    public static C52934zg3 m570a(View view) {
        int i = C36585Vg4.deliveryTime;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.deliveryTimeSubtitle;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.headerImage;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C36585Vg4.negativeButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C36585Vg4.positiveButton;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            i = C36585Vg4.priceGroup;
                            Group group = (Group) C34328Lp6.m96312a(view, i);
                            if (group != null) {
                                i = C36585Vg4.priceSubtitle;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    i = C36585Vg4.priceTitle;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        return new C52934zg3((ConstraintLayout) view, textView, textView2, imageView, button, button2, group, textView3, textView4);
                                    }
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
    public static C52934zg3 m568c(LayoutInflater layoutInflater) {
        return m567d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C52934zg3 m567d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.on_demand_viability_test, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m570a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f122058a;
    }
}
