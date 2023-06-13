package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Na2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34657Na2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24808a;

    /* renamed from: b */
    public final TextView f24809b;

    /* renamed from: c */
    public final TextView f24810c;

    /* renamed from: d */
    public final ImageView f24811d;

    /* renamed from: e */
    public final ImageView f24812e;

    public C34657Na2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.f24808a = constraintLayout;
        this.f24809b = textView;
        this.f24810c = textView2;
        this.f24811d = imageView;
        this.f24812e = imageView2;
    }

    /* renamed from: a */
    public static C34657Na2 m93745a(View view) {
        int i = C44645lh4.address_line_one_tv;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44645lh4.address_line_two_tv;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C44645lh4.carrot_icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C44645lh4.pin_icon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new C34657Na2((ConstraintLayout) view, textView, textView2, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24808a;
    }
}
