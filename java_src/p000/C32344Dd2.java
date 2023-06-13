package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Dd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32344Dd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f6103a;

    /* renamed from: b */
    public final TextView f6104b;

    /* renamed from: c */
    public final ImageView f6105c;

    /* renamed from: d */
    public final TextView f6106d;

    public C32344Dd2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f6103a = constraintLayout;
        this.f6104b = textView;
        this.f6105c = imageView;
        this.f6106d = textView2;
    }

    /* renamed from: a */
    public static C32344Dd2 m110078a(View view) {
        int i = C32616Eh4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32616Eh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C32616Eh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C32344Dd2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f6103a;
    }
}
