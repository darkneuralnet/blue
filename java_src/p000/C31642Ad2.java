package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ad2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31642Ad2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f878a;

    /* renamed from: b */
    public final TextView f879b;

    /* renamed from: c */
    public final ImageView f880c;

    /* renamed from: d */
    public final TextView f881d;

    public C31642Ad2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f878a = constraintLayout;
        this.f879b = textView;
        this.f880c = imageView;
        this.f881d = textView2;
    }

    /* renamed from: a */
    public static C31642Ad2 m115430a(View view) {
        int i = C32616Eh4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32616Eh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C32616Eh4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C31642Ad2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f878a;
    }
}
