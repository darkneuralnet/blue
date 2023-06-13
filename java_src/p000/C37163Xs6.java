package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: Xs6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37163Xs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f44118a;

    /* renamed from: b */
    public final Barrier f44119b;

    /* renamed from: c */
    public final TextView f44120c;

    /* renamed from: d */
    public final View f44121d;

    /* renamed from: e */
    public final TextView f44122e;

    /* renamed from: f */
    public final Group f44123f;

    /* renamed from: g */
    public final TextView f44124g;

    public C37163Xs6(ConstraintLayout constraintLayout, Barrier barrier, TextView textView, View view, TextView textView2, Group group, TextView textView3) {
        this.f44118a = constraintLayout;
        this.f44119b = barrier;
        this.f44120c = textView;
        this.f44121d = view;
        this.f44122e = textView2;
        this.f44123f = group;
        this.f44124g = textView3;
    }

    /* renamed from: a */
    public static C37163Xs6 m76179a(View view) {
        View m96312a;
        int i = C52955zi4.barrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C52955zi4.callToAction;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.divider))) != null) {
                i = C52955zi4.priceString;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.priceStringGroup;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C52955zi4.title;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            return new C37163Xs6((ConstraintLayout) view, barrier, textView, m96312a, textView2, group, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C37163Xs6 m76177c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_quick_start_selected_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m76179a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f44118a;
    }
}
