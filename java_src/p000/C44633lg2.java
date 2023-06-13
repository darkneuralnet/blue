package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: lg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44633lg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f96538a;

    /* renamed from: b */
    public final TextView f96539b;

    /* renamed from: c */
    public final ImageView f96540c;

    /* renamed from: d */
    public final TextView f96541d;

    public C44633lg2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f96538a = constraintLayout;
        this.f96539b = textView;
        this.f96540c = imageView;
        this.f96541d = textView2;
    }

    /* renamed from: a */
    public static C44633lg2 m27009a(View view) {
        int i = C42876ii4.caption;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42876ii4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C42876ii4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C44633lg2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f96538a;
    }
}
