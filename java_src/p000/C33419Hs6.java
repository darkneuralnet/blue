package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Hs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33419Hs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f14115a;

    /* renamed from: b */
    public final ImageView f14116b;

    /* renamed from: c */
    public final TextView f14117c;

    public C33419Hs6(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.f14115a = frameLayout;
        this.f14116b = imageView;
        this.f14117c = textView;
    }

    /* renamed from: a */
    public static C33419Hs6 m103256a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.price;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C33419Hs6((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C33419Hs6 m103254c(LayoutInflater layoutInflater) {
        return m103253d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C33419Hs6 m103253d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_price_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103256a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f14115a;
    }
}
