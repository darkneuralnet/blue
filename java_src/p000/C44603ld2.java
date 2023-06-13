package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ld2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44603ld2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f96445a;

    /* renamed from: b */
    public final TextView f96446b;

    /* renamed from: c */
    public final EditText f96447c;

    /* renamed from: d */
    public final EditText f96448d;

    /* renamed from: e */
    public final EditText f96449e;

    public C44603ld2(ConstraintLayout constraintLayout, TextView textView, EditText editText, EditText editText2, EditText editText3) {
        this.f96445a = constraintLayout;
        this.f96446b = textView;
        this.f96447c = editText;
        this.f96448d = editText2;
        this.f96449e = editText3;
    }

    /* renamed from: a */
    public static C44603ld2 m27080a(View view) {
        int i = C51166wh4.label;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C51166wh4.localAddress;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                i = C51166wh4.localAddressHint;
                EditText editText2 = (EditText) C34328Lp6.m96312a(view, i);
                if (editText2 != null) {
                    i = C51166wh4.localAddressHttpGhost;
                    EditText editText3 = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText3 != null) {
                        return new C44603ld2((ConstraintLayout) view, textView, editText, editText2, editText3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f96445a;
    }
}
