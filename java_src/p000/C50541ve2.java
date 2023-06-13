package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: ve2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50541ve2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f114426a;

    /* renamed from: b */
    public final ImageView f114427b;

    /* renamed from: c */
    public final TextView f114428c;

    public C50541ve2(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f114426a = linearLayout;
        this.f114427b = imageView;
        this.f114428c = textView;
    }

    /* renamed from: a */
    public static C50541ve2 m8323a(View view) {
        int i = C34488Mh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34488Mh4.quickLink;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C50541ve2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f114426a;
    }
}
