package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: jd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43417jd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f93033a;

    /* renamed from: b */
    public final TextView f93034b;

    /* renamed from: c */
    public final TextView f93035c;

    public C43417jd2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f93033a = constraintLayout;
        this.f93034b = textView;
        this.f93035c = textView2;
    }

    /* renamed from: a */
    public static C43417jd2 m30191a(View view) {
        int i = C34956Oh4.lineItemAmount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34956Oh4.lineItemLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C43417jd2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C43417jd2 m30189c(LayoutInflater layoutInflater) {
        return m30188d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C43417jd2 m30188d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.item_line_item_confirm_purchase, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m30191a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f93033a;
    }
}
