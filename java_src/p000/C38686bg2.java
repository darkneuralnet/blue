package p000;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: bg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38686bg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f57857a;

    /* renamed from: b */
    public final AppCompatCheckBox f57858b;

    /* renamed from: c */
    public final Button f57859c;

    public C38686bg2(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, Button button) {
        this.f57857a = constraintLayout;
        this.f57858b = appCompatCheckBox;
        this.f57859c = button;
    }

    /* renamed from: a */
    public static C38686bg2 m64182a(View view) {
        int i = C36585Vg4.checkBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C34328Lp6.m96312a(view, i);
        if (appCompatCheckBox != null) {
            i = C36585Vg4.editButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                return new C38686bg2((ConstraintLayout) view, appCompatCheckBox, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f57857a;
    }
}
