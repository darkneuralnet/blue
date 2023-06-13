package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: yb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52290yb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f119796a;

    /* renamed from: b */
    public final TextView f119797b;

    /* renamed from: c */
    public final ImageView f119798c;

    /* renamed from: d */
    public final ImageView f119799d;

    public C52290yb2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2) {
        this.f119796a = constraintLayout;
        this.f119797b = textView;
        this.f119798c = imageView;
        this.f119799d = imageView2;
    }

    /* renamed from: a */
    public static C52290yb2 m3206a(View view) {
        int i = C42866ih4.code;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42866ih4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C42866ih4.remove;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    return new C52290yb2((ConstraintLayout) view, textView, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f119796a;
    }
}
