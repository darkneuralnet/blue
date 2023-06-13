package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C11581c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* renamed from: Ja1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33720Ja1 implements TextWatcher {

    /* renamed from: b */
    public final EditText f17850b;

    /* renamed from: c */
    public final boolean f17851c;

    /* renamed from: d */
    public C11581c.AbstractC11588f f17852d;

    /* renamed from: e */
    public int f17853e = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f17854f = 0;

    /* renamed from: g */
    public boolean f17855g = true;

    /* renamed from: Ja1$a */
    /* loaded from: classes.dex */
    public static class C4163a extends C11581c.AbstractC11588f {

        /* renamed from: a */
        public final Reference<EditText> f17856a;

        public C4163a(EditText editText) {
            this.f17856a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: b */
        public void mo6703b() {
            super.mo6703b();
            C33720Ja1.m100187c(this.f17856a.get(), 1);
        }
    }

    public C33720Ja1(EditText editText, boolean z) {
        this.f17850b = editText;
        this.f17851c = z;
    }

    /* renamed from: c */
    public static void m100187c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C11581c.m67529c().m67514r(editableText);
            C32550Ea1.m108789b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public final C11581c.AbstractC11588f m100189a() {
        if (this.f17852d == null) {
            this.f17852d = new C4163a(this.f17850b);
        }
        return this.f17852d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public boolean m100188b() {
        return this.f17855g;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void m100186d(boolean z) {
        if (this.f17855g != z) {
            if (this.f17852d != null) {
                C11581c.m67529c().m67509w(this.f17852d);
            }
            this.f17855g = z;
            if (z) {
                m100187c(this.f17850b, C11581c.m67529c().m67525g());
            }
        }
    }

    /* renamed from: e */
    public final boolean m100185e() {
        return (this.f17855g && (this.f17851c || C11581c.m67521k())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f17850b.isInEditMode() && !m100185e() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int m67525g = C11581c.m67529c().m67525g();
            if (m67525g != 0) {
                if (m67525g != 1) {
                    if (m67525g != 3) {
                        return;
                    }
                } else {
                    C11581c.m67529c().m67511u((Spannable) charSequence, i, i + i3, this.f17853e, this.f17854f);
                    return;
                }
            }
            C11581c.m67529c().m67510v(m100189a());
        }
    }
}
