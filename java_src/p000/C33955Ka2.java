package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
/* renamed from: Ka2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33955Ka2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RadioButton f19880a;

    public C33955Ka2(RadioButton radioButton) {
        this.f19880a = radioButton;
    }

    /* renamed from: a */
    public static C33955Ka2 m98727a(View view) {
        if (view != null) {
            return new C33955Ka2((RadioButton) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C33955Ka2 m98725c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36603Vi4.item_action_taken_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m98727a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RadioButton getRoot() {
        return this.f19880a;
    }
}
