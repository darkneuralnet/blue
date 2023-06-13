package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ff2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41065ff2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f80408a;

    /* renamed from: b */
    public final ImageView f80409b;

    /* renamed from: c */
    public final ImageView f80410c;

    /* renamed from: d */
    public final TextView f80411d;

    /* renamed from: e */
    public final TextView f80412e;

    public C41065ff2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f80408a = constraintLayout;
        this.f80409b = imageView;
        this.f80410c = imageView2;
        this.f80411d = textView;
        this.f80412e = textView2;
    }

    /* renamed from: a */
    public static C41065ff2 m41064a(View view) {
        int i = C35658Rh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C35658Rh4.icon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C35658Rh4.issue;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C35658Rh4.nonRepair;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C41065ff2((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f80408a;
    }
}
