package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* renamed from: uj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49997uj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f112797a;

    /* renamed from: b */
    public final ImageView f112798b;

    public C49997uj0(FrameLayout frameLayout, ImageView imageView) {
        this.f112797a = frameLayout;
        this.f112798b = imageView;
    }

    /* renamed from: a */
    public static C49997uj0 m9841a(View view) {
        int i = C33093Gi4.binaryData;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            return new C49997uj0((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49997uj0 m9839c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_transaction_item_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m9841a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f112797a;
    }
}
