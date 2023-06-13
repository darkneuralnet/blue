package p000;

import android.view.View;
import android.widget.CheckBox;
/* renamed from: pb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46955pb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CheckBox f103829a;

    /* renamed from: b */
    public final CheckBox f103830b;

    public C46955pb2(CheckBox checkBox, CheckBox checkBox2) {
        this.f103829a = checkBox;
        this.f103830b = checkBox2;
    }

    /* renamed from: a */
    public static C46955pb2 m19092a(View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new C46955pb2(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CheckBox getRoot() {
        return this.f103829a;
    }
}
