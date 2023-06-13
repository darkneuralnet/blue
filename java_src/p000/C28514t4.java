package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: t4 */
/* loaded from: classes3.dex */
public final class C28514t4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109790a;

    /* renamed from: b */
    public final Button f109791b;

    /* renamed from: c */
    public final FrameLayout f109792c;

    /* renamed from: d */
    public final TextView f109793d;

    /* renamed from: e */
    public final FrameLayout f109794e;

    /* renamed from: f */
    public final TextView f109795f;

    /* renamed from: g */
    public final TextView f109796g;

    /* renamed from: h */
    public final TextView f109797h;

    public C28514t4(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, TextView textView2, TextView textView3, TextView textView4) {
        this.f109790a = constraintLayout;
        this.f109791b = button;
        this.f109792c = frameLayout;
        this.f109793d = textView;
        this.f109794e = frameLayout2;
        this.f109795f = textView2;
        this.f109796g = textView3;
        this.f109797h = textView4;
    }

    /* renamed from: a */
    public static C28514t4 m13160a(View view) {
        int i = C32850Fh4.action;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C32850Fh4.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C32850Fh4.fullDescription;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C32850Fh4.pin;
                    FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout2 != null) {
                        i = C32850Fh4.shortDescription;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C32850Fh4.time;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C32850Fh4.title;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    return new C28514t4((ConstraintLayout) view, button, frameLayout, textView, frameLayout2, textView2, textView3, textView4);
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
    public static C28514t4 m13158c(LayoutInflater layoutInflater) {
        return m13157d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28514t4 m13157d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.activity_notification_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13160a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109790a;
    }
}
