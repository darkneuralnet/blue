package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Sm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35935Sm2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f34247a;

    /* renamed from: b */
    public final ImageView f34248b;

    /* renamed from: c */
    public final TextView f34249c;

    /* renamed from: d */
    public final ImageView f34250d;

    /* renamed from: e */
    public final View f34251e;

    public C35935Sm2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, View view) {
        this.f34247a = constraintLayout;
        this.f34248b = imageView;
        this.f34249c = textView;
        this.f34250d = imageView2;
        this.f34251e = view;
    }

    /* renamed from: a */
    public static C35935Sm2 m84853a(View view) {
        View m96312a;
        int i = C34488Mh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34488Mh4.headerText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34488Mh4.qrCode;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.scanAnotherPartContainer))) != null) {
                    return new C35935Sm2((ConstraintLayout) view, imageView, textView, imageView2, m96312a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f34247a;
    }
}
