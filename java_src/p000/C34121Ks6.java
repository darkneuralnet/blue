package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ks6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34121Ks6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f20309a;

    /* renamed from: b */
    public final ImageView f20310b;

    /* renamed from: c */
    public final ImageView f20311c;

    /* renamed from: d */
    public final TextView f20312d;

    public C34121Ks6(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f20309a = constraintLayout;
        this.f20310b = imageView;
        this.f20311c = imageView2;
        this.f20312d = textView;
    }

    /* renamed from: a */
    public static C34121Ks6 m98206a(View view) {
        int i = C34722Nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34722Nh4.promotionIcon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C34722Nh4.titleText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C34121Ks6((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f20309a;
    }
}
