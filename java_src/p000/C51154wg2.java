package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: wg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51154wg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f116338a;

    /* renamed from: b */
    public final TextView f116339b;

    /* renamed from: c */
    public final ImageView f116340c;

    /* renamed from: d */
    public final TextView f116341d;

    public C51154wg2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f116338a = constraintLayout;
        this.f116339b = textView;
        this.f116340c = imageView;
        this.f116341d = textView2;
    }

    /* renamed from: a */
    public static C51154wg2 m6504a(View view) {
        int i = C44655li4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44655li4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C44655li4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C51154wg2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f116338a;
    }
}
