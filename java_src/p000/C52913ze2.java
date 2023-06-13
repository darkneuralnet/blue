package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: ze2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52913ze2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ImageView f121683a;

    public C52913ze2(ImageView imageView) {
        this.f121683a = imageView;
    }

    /* renamed from: a */
    public static C52913ze2 m941a(View view) {
        if (view != null) {
            return new C52913ze2((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C52913ze2 m939c(LayoutInflater layoutInflater) {
        return m938d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C52913ze2 m938d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.item_payment_brand, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m941a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f121683a;
    }
}
