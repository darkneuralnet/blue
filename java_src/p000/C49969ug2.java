package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ug2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49969ug2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f112748a;

    /* renamed from: b */
    public final TextView f112749b;

    /* renamed from: c */
    public final TextView f112750c;

    /* renamed from: d */
    public final ImageView f112751d;

    /* renamed from: e */
    public final TextView f112752e;

    public C49969ug2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.f112748a = constraintLayout;
        this.f112749b = textView;
        this.f112750c = textView2;
        this.f112751d = imageView;
        this.f112752e = textView3;
    }

    /* renamed from: a */
    public static C49969ug2 m9887a(View view) {
        int i = C44655li4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44655li4.details;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C44655li4.icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C44655li4.title;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C49969ug2((ConstraintLayout) view, textView, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f112748a;
    }
}
