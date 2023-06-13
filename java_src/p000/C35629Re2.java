package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Re2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35629Re2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f32394a;

    /* renamed from: b */
    public final ImageView f32395b;

    /* renamed from: c */
    public final TextView f32396c;

    public C35629Re2(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f32394a = linearLayout;
        this.f32395b = imageView;
        this.f32396c = textView;
    }

    /* renamed from: a */
    public static C35629Re2 m86505a(View view) {
        int i = C35658Rh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C35658Rh4.quickLink;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C35629Re2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f32394a;
    }
}
