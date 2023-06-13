package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
/* renamed from: pc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46965pc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f103848a;

    /* renamed from: b */
    public final TextView f103849b;

    /* renamed from: c */
    public final EditText f103850c;

    /* renamed from: d */
    public final SwitchMaterial f103851d;

    public C46965pc2(ConstraintLayout constraintLayout, TextView textView, EditText editText, SwitchMaterial switchMaterial) {
        this.f103848a = constraintLayout;
        this.f103849b = textView;
        this.f103850c = editText;
        this.f103851d = switchMaterial;
    }

    /* renamed from: a */
    public static C46965pc2 m19066a(View view) {
        int i = C51166wh4.host;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C51166wh4.port;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                i = C51166wh4.switch2;
                SwitchMaterial switchMaterial = (SwitchMaterial) C34328Lp6.m96312a(view, i);
                if (switchMaterial != null) {
                    return new C46965pc2((ConstraintLayout) view, textView, editText, switchMaterial);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f103848a;
    }
}
