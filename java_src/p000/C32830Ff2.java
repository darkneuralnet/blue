package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ff2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32830Ff2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f9927a;

    /* renamed from: b */
    public final ImageView f9928b;

    /* renamed from: c */
    public final TextView f9929c;

    public C32830Ff2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f9927a = constraintLayout;
        this.f9928b = imageView;
        this.f9929c = textView;
    }

    /* renamed from: a */
    public static C32830Ff2 m106764a(View view) {
        int i = C32850Fh4.dots;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C32850Fh4.filter;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C32830Ff2((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f9927a;
    }
}
