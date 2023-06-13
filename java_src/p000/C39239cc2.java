package p000;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: cc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39239cc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextInputLayout f60943a;

    /* renamed from: b */
    public final TextInputEditText f60944b;

    /* renamed from: c */
    public final TextInputLayout f60945c;

    public C39239cc2(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2) {
        this.f60943a = textInputLayout;
        this.f60944b = textInputEditText;
        this.f60945c = textInputLayout2;
    }

    /* renamed from: a */
    public static C39239cc2 m61178a(View view) {
        int i = C49981uh4.editText;
        TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
        if (textInputEditText != null) {
            TextInputLayout textInputLayout = (TextInputLayout) view;
            return new C39239cc2(textInputLayout, textInputEditText, textInputLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextInputLayout getRoot() {
        return this.f60943a;
    }
}
