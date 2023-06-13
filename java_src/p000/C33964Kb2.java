package p000;

import android.view.View;
import android.widget.CheckBox;
/* renamed from: Kb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33964Kb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CheckBox f19889a;

    public C33964Kb2(CheckBox checkBox) {
        this.f19889a = checkBox;
    }

    /* renamed from: a */
    public static C33964Kb2 m98713a(View view) {
        if (view != null) {
            return new C33964Kb2((CheckBox) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CheckBox getRoot() {
        return this.f19889a;
    }
}
