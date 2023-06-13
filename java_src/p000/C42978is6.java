package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: is6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42978is6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f91419a;

    /* renamed from: b */
    public final ShapeableImageView f91420b;

    /* renamed from: c */
    public final TextView f91421c;

    /* renamed from: d */
    public final TextView f91422d;

    public C42978is6(View view, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.f91419a = view;
        this.f91420b = shapeableImageView;
        this.f91421c = textView;
        this.f91422d = textView2;
    }

    /* renamed from: a */
    public static C42978is6 m31712a(View view) {
        int i = C52955zi4.image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
        if (shapeableImageView != null) {
            i = C52955zi4.name;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.serviceCenter;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C42978is6(view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C42978is6 m31711b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_operator_info_card, viewGroup);
            return m31712a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f91419a;
    }
}
