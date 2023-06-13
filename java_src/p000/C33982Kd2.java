package p000;

import android.view.View;
import android.widget.CheckBox;
/* renamed from: Kd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33982Kd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CheckBox f19948a;

    /* renamed from: b */
    public final CheckBox f19949b;

    public C33982Kd2(CheckBox checkBox, CheckBox checkBox2) {
        this.f19948a = checkBox;
        this.f19949b = checkBox2;
    }

    /* renamed from: a */
    public static C33982Kd2 m98639a(View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new C33982Kd2(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CheckBox getRoot() {
        return this.f19948a;
    }
}
