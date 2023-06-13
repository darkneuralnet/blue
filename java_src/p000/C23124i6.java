package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
/* renamed from: i6 */
/* loaded from: classes2.dex */
public final class C23124i6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f86727a;

    /* renamed from: b */
    public final Guideline f86728b;

    /* renamed from: c */
    public final Guideline f86729c;

    /* renamed from: d */
    public final View f86730d;

    /* renamed from: e */
    public final ImageView f86731e;

    /* renamed from: f */
    public final ConstraintLayout f86732f;

    /* renamed from: g */
    public final Guideline f86733g;

    /* renamed from: h */
    public final View f86734h;

    /* renamed from: i */
    public final Guideline f86735i;

    /* renamed from: j */
    public final ImageView f86736j;

    public C23124i6(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, View view, ImageView imageView, ConstraintLayout constraintLayout2, Guideline guideline3, View view2, Guideline guideline4, ImageView imageView2) {
        this.f86727a = constraintLayout;
        this.f86728b = guideline;
        this.f86729c = guideline2;
        this.f86730d = view;
        this.f86731e = imageView;
        this.f86732f = constraintLayout2;
        this.f86733g = guideline3;
        this.f86734h = view2;
        this.f86735i = guideline4;
        this.f86736j = imageView2;
    }

    /* renamed from: a */
    public static C23124i6 m34477a(View view) {
        View m96312a;
        View m96312a2;
        int i = C36585Vg4.bottomGutter;
        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
        if (guideline != null) {
            i = C36585Vg4.endGutter;
            Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
            if (guideline2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.endScrim))) != null) {
                i = C36585Vg4.flashButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C36585Vg4.startGutter;
                    Guideline guideline3 = (Guideline) C34328Lp6.m96312a(view, i);
                    if (guideline3 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.startScrim))) != null) {
                        i = C36585Vg4.topGutter;
                        Guideline guideline4 = (Guideline) C34328Lp6.m96312a(view, i);
                        if (guideline4 != null) {
                            i = C36585Vg4.viewFinder;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                return new C23124i6(constraintLayout, guideline, guideline2, m96312a, imageView, constraintLayout, guideline3, m96312a2, guideline4, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C23124i6 m34475c(LayoutInflater layoutInflater) {
        return m34474d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C23124i6 m34474d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_smartlock_qr_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m34477a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f86727a;
    }
}
