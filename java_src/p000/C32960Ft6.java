package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: Ft6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32960Ft6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f10454a;

    /* renamed from: b */
    public final ImageView f10455b;

    /* renamed from: c */
    public final ImageView f10456c;

    /* renamed from: d */
    public final ImageView f10457d;

    public C32960Ft6(View view, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.f10454a = view;
        this.f10455b = imageView;
        this.f10456c = imageView2;
        this.f10457d = imageView3;
    }

    /* renamed from: a */
    public static C32960Ft6 m106290a(View view) {
        int i = C52955zi4.fastMode;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.medMode;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C52955zi4.slowMode;
                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView3 != null) {
                    return new C32960Ft6(view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C32960Ft6 m106289b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_speed_mode, viewGroup);
            return m106290a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f10454a;
    }
}
