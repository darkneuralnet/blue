package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.EditTextBox;
/* renamed from: Ma2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34423Ma2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f23255a;

    /* renamed from: b */
    public final EditTextBox f23256b;

    public C34423Ma2(ConstraintLayout constraintLayout, EditTextBox editTextBox) {
        this.f23255a = constraintLayout;
        this.f23256b = editTextBox;
    }

    /* renamed from: a */
    public static C34423Ma2 m95160a(View view) {
        int i = C42866ih4.editText;
        EditTextBox editTextBox = (EditTextBox) C34328Lp6.m96312a(view, i);
        if (editTextBox != null) {
            return new C34423Ma2((ConstraintLayout) view, editTextBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f23255a;
    }
}
