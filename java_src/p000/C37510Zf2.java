package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Zf2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37510Zf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f48916a;

    /* renamed from: b */
    public final AppCompatCheckBox f48917b;

    /* renamed from: c */
    public final SwitchCompat f48918c;

    public C37510Zf2(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, SwitchCompat switchCompat) {
        this.f48916a = constraintLayout;
        this.f48917b = appCompatCheckBox;
        this.f48918c = switchCompat;
    }

    /* renamed from: a */
    public static C37510Zf2 m72795a(View view) {
        int i = C36585Vg4.checkBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C34328Lp6.m96312a(view, i);
        if (appCompatCheckBox != null) {
            i = C36585Vg4.valueSwitch;
            SwitchCompat switchCompat = (SwitchCompat) C34328Lp6.m96312a(view, i);
            if (switchCompat != null) {
                return new C37510Zf2((ConstraintLayout) view, appCompatCheckBox, switchCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f48916a;
    }
}
