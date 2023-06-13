package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: gt6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41802gt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f84411a;

    public C41802gt6(View view) {
        this.f84411a = view;
    }

    /* renamed from: a */
    public static C41802gt6 m37362a(View view) {
        if (view != null) {
            return new C41802gt6(view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: b */
    public static C41802gt6 m37361b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_repair_damage, viewGroup);
            return m37362a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f84411a;
    }
}
