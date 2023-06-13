package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ic2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33505Ic2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f15934a;

    /* renamed from: b */
    public final TextView f15935b;

    /* renamed from: c */
    public final ImageView f15936c;

    /* renamed from: d */
    public final TextView f15937d;

    public C33505Ic2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f15934a = constraintLayout;
        this.f15935b = textView;
        this.f15936c = imageView;
        this.f15937d = textView2;
    }

    /* renamed from: a */
    public static C33505Ic2 m101889a(View view) {
        int i = C34722Nh4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34722Nh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34722Nh4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33505Ic2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f15934a;
    }
}
