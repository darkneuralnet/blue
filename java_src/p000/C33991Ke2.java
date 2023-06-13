package p000;

import android.view.View;
import android.widget.EditText;
/* renamed from: Ke2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33991Ke2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final EditText f19959a;

    /* renamed from: b */
    public final EditText f19960b;

    public C33991Ke2(EditText editText, EditText editText2) {
        this.f19959a = editText;
        this.f19960b = editText2;
    }

    /* renamed from: a */
    public static C33991Ke2 m98630a(View view) {
        if (view != null) {
            EditText editText = (EditText) view;
            return new C33991Ke2(editText, editText);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public EditText getRoot() {
        return this.f19959a;
    }
}
