package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Bt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32024Bt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f3014a;

    /* renamed from: b */
    public final TextView f3015b;

    /* renamed from: c */
    public final ImageView f3016c;

    /* renamed from: d */
    public final TextView f3017d;

    public C32024Bt6(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f3014a = constraintLayout;
        this.f3015b = textView;
        this.f3016c = imageView;
        this.f3017d = textView2;
    }

    /* renamed from: a */
    public static C32024Bt6 m113398a(View view) {
        int i = C38115ai4.heading;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C38115ai4.locationIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C38115ai4.subheading;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C32024Bt6((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f3014a;
    }
}
