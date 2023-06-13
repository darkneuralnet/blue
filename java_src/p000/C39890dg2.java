package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: dg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39890dg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f77025a;

    /* renamed from: b */
    public final TextView f77026b;

    public C39890dg2(RelativeLayout relativeLayout, TextView textView) {
        this.f77025a = relativeLayout;
        this.f77026b = textView;
    }

    /* renamed from: a */
    public static C39890dg2 m43905a(View view) {
        int i = C50583vi4.roleTitle;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C39890dg2((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C39890dg2 m43903c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42896ik4.item_user_role, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43905a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f77025a;
    }
}
