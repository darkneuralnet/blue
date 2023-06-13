package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Ds6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32483Ds6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f6454a;

    /* renamed from: b */
    public final ImageView f6455b;

    /* renamed from: c */
    public final TextView f6456c;

    public C32483Ds6(View view, ImageView imageView, TextView textView) {
        this.f6454a = view;
        this.f6455b = imageView;
        this.f6456c = textView;
    }

    /* renamed from: a */
    public static C32483Ds6 m109829a(View view) {
        int i = C52955zi4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.labelText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C32483Ds6(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C32483Ds6 m109828b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_pill_dropdown_button, viewGroup);
            return m109829a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f6454a;
    }
}
