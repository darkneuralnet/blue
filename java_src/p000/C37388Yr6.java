package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
/* renamed from: Yr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37388Yr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f47497a;

    /* renamed from: b */
    public final ImageView f47498b;

    /* renamed from: c */
    public final ImageView f47499c;

    public C37388Yr6(View view, ImageView imageView, ImageView imageView2) {
        this.f47497a = view;
        this.f47498b = imageView;
        this.f47499c = imageView2;
    }

    /* renamed from: a */
    public static C37388Yr6 m74092a(View view) {
        int i = C52955zi4.primaryIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.secondaryIcon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                return new C37388Yr6(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C37388Yr6 m74091b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_multi_icon, viewGroup);
            return m74092a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f47497a;
    }
}
