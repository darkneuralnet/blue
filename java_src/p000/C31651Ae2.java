package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ae2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31651Ae2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f895a;

    /* renamed from: b */
    public final ImageView f896b;

    /* renamed from: c */
    public final TextView f897c;

    /* renamed from: d */
    public final TextView f898d;

    /* renamed from: e */
    public final ImageView f899e;

    public C31651Ae2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.f895a = constraintLayout;
        this.f896b = imageView;
        this.f897c = textView;
        this.f898d = textView2;
        this.f899e = imageView2;
    }

    /* renamed from: a */
    public static C31651Ae2 m115420a(View view) {
        int i = C34956Oh4.paymentIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34956Oh4.paymentSubtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34956Oh4.paymentTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34956Oh4.sideIcon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new C31651Ae2((ConstraintLayout) view, imageView, textView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f895a;
    }
}
