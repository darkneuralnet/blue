package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
/* renamed from: td2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49346td2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f110796a;

    /* renamed from: b */
    public final ImageView f110797b;

    public C49346td2(LinearLayout linearLayout, ImageView imageView) {
        this.f110796a = linearLayout;
        this.f110797b = imageView;
    }

    /* renamed from: a */
    public static C49346td2 m12005a(View view) {
        int i = C32148Ch4.imageView;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            return new C49346td2((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49346td2 m12003c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47037pj4.item_nest_details_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12005a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f110796a;
    }
}
