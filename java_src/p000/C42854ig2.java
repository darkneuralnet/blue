package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ig2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42854ig2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f87722a;

    /* renamed from: b */
    public final TextView f87723b;

    /* renamed from: c */
    public final ImageView f87724c;

    /* renamed from: d */
    public final TextView f87725d;

    public C42854ig2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f87722a = constraintLayout;
        this.f87723b = textView;
        this.f87724c = imageView;
        this.f87725d = textView2;
    }

    /* renamed from: a */
    public static C42854ig2 m33602a(View view) {
        int i = C42876ii4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42876ii4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C42876ii4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C42854ig2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f87722a;
    }
}
