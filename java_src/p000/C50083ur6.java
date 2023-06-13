package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
/* renamed from: ur6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50083ur6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f113099a;

    /* renamed from: b */
    public final CheckBox f113100b;

    public C50083ur6(View view, CheckBox checkBox) {
        this.f113099a = view;
        this.f113100b = checkBox;
    }

    /* renamed from: a */
    public static C50083ur6 m9649a(View view) {
        int i = C36585Vg4.type;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            return new C50083ur6(view, checkBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C50083ur6 m9648b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_inspection_area, viewGroup);
            return m9649a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f113099a;
    }
}
