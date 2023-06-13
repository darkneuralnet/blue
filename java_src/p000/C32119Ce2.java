package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* renamed from: Ce2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32119Ce2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f4425a;

    /* renamed from: b */
    public final ImageView f4426b;

    public C32119Ce2(FrameLayout frameLayout, ImageView imageView) {
        this.f4425a = frameLayout;
        this.f4426b = imageView;
    }

    /* renamed from: a */
    public static C32119Ce2 m111960a(View view) {
        int i = C36360Uh4.place;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            return new C32119Ce2((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f4425a;
    }
}
