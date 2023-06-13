package p000;

import android.view.View;
import co.bird.android.widget.EditTextBox;
/* renamed from: Jb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33730Jb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final EditTextBox f17889a;

    public C33730Jb2(EditTextBox editTextBox) {
        this.f17889a = editTextBox;
    }

    /* renamed from: a */
    public static C33730Jb2 m100132a(View view) {
        if (view != null) {
            return new C33730Jb2((EditTextBox) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public EditTextBox getRoot() {
        return this.f17889a;
    }
}
