package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: Gp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33158Gp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f12512a;

    /* renamed from: b */
    public final TextView f12513b;

    public C33158Gp6(View view, TextView textView) {
        this.f12512a = view;
        this.f12513b = textView;
    }

    /* renamed from: a */
    public static C33158Gp6 m104691a(View view) {
        int i = C52955zi4.text;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C33158Gp6(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33158Gp6 m104690b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_banner, viewGroup);
            return m104691a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f12512a;
    }
}
