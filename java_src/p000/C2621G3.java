package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: G3 */
/* loaded from: classes2.dex */
public final class C2621G3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f10830a;

    /* renamed from: b */
    public final Button f10831b;

    /* renamed from: c */
    public final TextView f10832c;

    /* renamed from: d */
    public final ImageView f10833d;

    /* renamed from: e */
    public final ScrollView f10834e;

    /* renamed from: f */
    public final Button f10835f;

    public C2621G3(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView, ScrollView scrollView, Button button2) {
        this.f10830a = constraintLayout;
        this.f10831b = button;
        this.f10832c = textView;
        this.f10833d = imageView;
        this.f10834e = scrollView;
        this.f10835f = button2;
    }

    /* renamed from: a */
    public static C2621G3 m105895a(View view) {
        int i = C36585Vg4.copyButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.pricingMessage;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.riders;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C36585Vg4.scrollView2;
                    ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                    if (scrollView != null) {
                        i = C36585Vg4.sendButton;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            return new C2621G3((ConstraintLayout) view, button, textView, imageView, scrollView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2621G3 m105893c(LayoutInflater layoutInflater) {
        return m105892d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C2621G3 m105892d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_free_ride, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m105895a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f10830a;
    }
}
