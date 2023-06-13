package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Qp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35498Qp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30995a;

    /* renamed from: b */
    public final ImageView f30996b;

    /* renamed from: c */
    public final TextView f30997c;

    /* renamed from: d */
    public final TextView f30998d;

    public C35498Qp6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f30995a = constraintLayout;
        this.f30996b = imageView;
        this.f30997c = textView;
        this.f30998d = textView2;
    }

    /* renamed from: a */
    public static C35498Qp6 m87895a(View view) {
        int i = C41087fh4.partImage;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C41087fh4.partLabel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C41087fh4.skuLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C35498Qp6((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30995a;
    }
}
