package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: cf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39269cf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f61019a;

    /* renamed from: b */
    public final ImageView f61020b;

    /* renamed from: c */
    public final ImageView f61021c;

    /* renamed from: d */
    public final TextView f61022d;

    public C39269cf2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f61019a = constraintLayout;
        this.f61020b = imageView;
        this.f61021c = imageView2;
        this.f61022d = textView;
    }

    /* renamed from: a */
    public static C39269cf2 m61083a(View view) {
        int i = C35658Rh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C35658Rh4.icon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C35658Rh4.nonRepair;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C39269cf2((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f61019a;
    }
}
