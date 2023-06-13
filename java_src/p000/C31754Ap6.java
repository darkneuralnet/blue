package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Ap6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31754Ap6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f1190a;

    /* renamed from: b */
    public final TextView f1191b;

    /* renamed from: c */
    public final ImageView f1192c;

    /* renamed from: d */
    public final TextView f1193d;

    public C31754Ap6(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f1190a = linearLayout;
        this.f1191b = textView;
        this.f1192c = imageView;
        this.f1193d = textView2;
    }

    /* renamed from: a */
    public static C31754Ap6 m115130a(View view) {
        int i = C36585Vg4.alertBody;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.alertImage;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.alertTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C31754Ap6((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f1190a;
    }
}
