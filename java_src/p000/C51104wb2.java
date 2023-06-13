package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: wb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51104wb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f116238a;

    /* renamed from: b */
    public final TextView f116239b;

    /* renamed from: c */
    public final ImageView f116240c;

    /* renamed from: d */
    public final TextView f116241d;

    public C51104wb2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f116238a = constraintLayout;
        this.f116239b = textView;
        this.f116240c = imageView;
        this.f116241d = textView2;
    }

    /* renamed from: a */
    public static C51104wb2 m6617a(View view) {
        int i = C42866ih4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42866ih4.mainImage;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C42866ih4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C51104wb2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f116238a;
    }
}
