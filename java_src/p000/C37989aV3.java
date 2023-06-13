package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: aV3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37989aV3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f50571a;

    /* renamed from: b */
    public final TextView f50572b;

    /* renamed from: c */
    public final TextView f50573c;

    /* renamed from: d */
    public final TextView f50574d;

    public C37989aV3(View view, TextView textView, TextView textView2, TextView textView3) {
        this.f50571a = view;
        this.f50572b = textView;
        this.f50573c = textView2;
        this.f50574d = textView3;
    }

    /* renamed from: a */
    public static C37989aV3 m71278a(View view) {
        int i = C52955zi4.planChargeAmount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.planIncentiveAmount;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C52955zi4.planSelectedText;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C37989aV3(view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C37989aV3 m71277b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.plan_layout_tab_item, viewGroup);
            return m71278a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f50571a;
    }
}
