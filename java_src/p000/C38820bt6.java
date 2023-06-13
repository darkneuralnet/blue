package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: bt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38820bt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f59720a;

    /* renamed from: b */
    public final ImageView f59721b;

    /* renamed from: c */
    public final ImageView f59722c;

    public C38820bt6(View view, ImageView imageView, ImageView imageView2) {
        this.f59720a = view;
        this.f59721b = imageView;
        this.f59722c = imageView2;
    }

    /* renamed from: a */
    public static C38820bt6 m62197a(View view) {
        int i = C52955zi4.imageView;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.xButton;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                return new C38820bt6(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C38820bt6 m62196b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_removable_image, viewGroup);
            return m62197a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f59720a;
    }
}
