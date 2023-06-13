package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: fB6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40794fB6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f79648a;

    /* renamed from: b */
    public final TextView f79649b;

    public C40794fB6(RelativeLayout relativeLayout, TextView textView) {
        this.f79648a = relativeLayout;
        this.f79649b = textView;
    }

    /* renamed from: a */
    public static C40794fB6 m41753a(View view) {
        int i = C36585Vg4.codeText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C40794fB6((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C40794fB6 m41751c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.widget_redo_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m41753a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f79648a;
    }
}
