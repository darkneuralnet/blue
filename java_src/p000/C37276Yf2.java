package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Yf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37276Yf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f46221a;

    /* renamed from: b */
    public final TextView f46222b;

    /* renamed from: c */
    public final ImageView f46223c;

    /* renamed from: d */
    public final TextView f46224d;

    public C37276Yf2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f46221a = constraintLayout;
        this.f46222b = textView;
        this.f46223c = imageView;
        this.f46224d = textView2;
    }

    /* renamed from: a */
    public static C37276Yf2 m74598a(View view) {
        int i = C40504ei4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C40504ei4.image;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C40504ei4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C37276Yf2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f46221a;
    }
}
