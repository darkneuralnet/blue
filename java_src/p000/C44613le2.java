package p000;

import android.view.View;
import android.widget.CheckBox;
/* renamed from: le2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44613le2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CheckBox f96475a;

    /* renamed from: b */
    public final CheckBox f96476b;

    public C44613le2(CheckBox checkBox, CheckBox checkBox2) {
        this.f96475a = checkBox;
        this.f96476b = checkBox2;
    }

    /* renamed from: a */
    public static C44613le2 m27061a(View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new C44613le2(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CheckBox getRoot() {
        return this.f96475a;
    }
}
