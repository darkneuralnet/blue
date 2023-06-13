package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ys6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37397Ys6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f47585a;

    /* renamed from: b */
    public final TextView f47586b;

    /* renamed from: c */
    public final TextView f47587c;

    /* renamed from: d */
    public final ImageView f47588d;

    public C37397Ys6(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.f47585a = constraintLayout;
        this.f47586b = textView;
        this.f47587c = textView2;
        this.f47588d = imageView;
    }

    /* renamed from: a */
    public static C37397Ys6 m74044a(View view) {
        int i = C39291ch4.average;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39291ch4.code;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C39291ch4.star;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    return new C37397Ys6((ConstraintLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f47585a;
    }
}
