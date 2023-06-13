package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* renamed from: zt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53067zt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f122439a;

    /* renamed from: b */
    public final LinearLayout f122440b;

    public C53067zt6(View view, LinearLayout linearLayout) {
        this.f122439a = view;
        this.f122440b = linearLayout;
    }

    /* renamed from: a */
    public static C53067zt6 m156a(View view) {
        int i = C45831nh4.container;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            return new C53067zt6(view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C53067zt6 m155b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C38125aj4.view_scoreboard, viewGroup);
            return m156a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f122439a;
    }
}
