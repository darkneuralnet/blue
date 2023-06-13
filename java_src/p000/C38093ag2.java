package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ag2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38093ag2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f50920a;

    /* renamed from: b */
    public final AppCompatCheckBox f50921b;

    /* renamed from: c */
    public final AppCompatSpinner f50922c;

    public C38093ag2(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, AppCompatSpinner appCompatSpinner) {
        this.f50920a = constraintLayout;
        this.f50921b = appCompatCheckBox;
        this.f50922c = appCompatSpinner;
    }

    /* renamed from: a */
    public static C38093ag2 m70896a(View view) {
        int i = C36585Vg4.checkBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C34328Lp6.m96312a(view, i);
        if (appCompatCheckBox != null) {
            i = C36585Vg4.spinner;
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C34328Lp6.m96312a(view, i);
            if (appCompatSpinner != null) {
                return new C38093ag2((ConstraintLayout) view, appCompatCheckBox, appCompatSpinner);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f50920a;
    }
}
