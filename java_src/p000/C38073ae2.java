package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
/* renamed from: ae2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38073ae2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f50856a;

    /* renamed from: b */
    public final TextView f50857b;

    /* renamed from: c */
    public final SwitchMaterial f50858c;

    public C38073ae2(ConstraintLayout constraintLayout, TextView textView, SwitchMaterial switchMaterial) {
        this.f50856a = constraintLayout;
        this.f50857b = textView;
        this.f50858c = switchMaterial;
    }

    /* renamed from: a */
    public static C38073ae2 m70984a(View view) {
        int i = C36585Vg4.setting;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.settingSwitch;
            SwitchMaterial switchMaterial = (SwitchMaterial) C34328Lp6.m96312a(view, i);
            if (switchMaterial != null) {
                return new C38073ae2((ConstraintLayout) view, textView, switchMaterial);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f50856a;
    }
}
