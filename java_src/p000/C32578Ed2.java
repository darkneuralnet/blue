package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ed2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32578Ed2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f7888a;

    /* renamed from: b */
    public final TextView f7889b;

    /* renamed from: c */
    public final ImageView f7890c;

    /* renamed from: d */
    public final TextView f7891d;

    public C32578Ed2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f7888a = constraintLayout;
        this.f7889b = textView;
        this.f7890c = imageView;
        this.f7891d = textView2;
    }

    /* renamed from: a */
    public static C32578Ed2 m108637a(View view) {
        int i = C32616Eh4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32616Eh4.capacityArrow;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C32616Eh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C32578Ed2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7888a;
    }
}
