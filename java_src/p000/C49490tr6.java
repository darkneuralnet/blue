package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: tr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49490tr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f111154a;

    /* renamed from: b */
    public final ImageView f111155b;

    /* renamed from: c */
    public final TextView f111156c;

    /* renamed from: d */
    public final ImageView f111157d;

    public C49490tr6(View view, ImageView imageView, TextView textView, ImageView imageView2) {
        this.f111154a = view;
        this.f111155b = imageView;
        this.f111156c = textView;
        this.f111157d = imageView2;
    }

    /* renamed from: a */
    public static C49490tr6 m11589a(View view) {
        int i = C52955zi4.info;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.range;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.thunder;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    return new C49490tr6(view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C49490tr6 m11588b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_info_window_range, viewGroup);
            return m11589a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f111154a;
    }
}
