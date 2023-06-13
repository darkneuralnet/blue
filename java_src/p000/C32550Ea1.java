package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C11581c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* renamed from: Ea1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32550Ea1 implements InputFilter {

    /* renamed from: b */
    public final TextView f7711b;

    /* renamed from: c */
    public C11581c.AbstractC11588f f7712c;

    /* renamed from: Ea1$a */
    /* loaded from: classes.dex */
    public static class C1882a extends C11581c.AbstractC11588f {

        /* renamed from: a */
        public final Reference<TextView> f7713a;

        /* renamed from: b */
        public final Reference<C32550Ea1> f7714b;

        public C1882a(TextView textView, C32550Ea1 c32550Ea1) {
            this.f7713a = new WeakReference(textView);
            this.f7714b = new WeakReference(c32550Ea1);
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: b */
        public void mo6703b() {
            CharSequence text;
            CharSequence m67514r;
            super.mo6703b();
            TextView textView = this.f7713a.get();
            if (!m108788c(textView, this.f7714b.get()) || !textView.isAttachedToWindow() || text == (m67514r = C11581c.m67529c().m67514r((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(m67514r);
            int selectionEnd = Selection.getSelectionEnd(m67514r);
            textView.setText(m67514r);
            if (m67514r instanceof Spannable) {
                C32550Ea1.m108789b((Spannable) m67514r, selectionStart, selectionEnd);
            }
        }

        /* renamed from: c */
        public final boolean m108788c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C32550Ea1(TextView textView) {
        this.f7711b = textView;
    }

    /* renamed from: b */
    public static void m108789b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public final C11581c.AbstractC11588f m108790a() {
        if (this.f7712c == null) {
            this.f7712c = new C1882a(this.f7711b, this);
        }
        return this.f7712c;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f7711b.isInEditMode()) {
            return charSequence;
        }
        int m67525g = C11581c.m67529c().m67525g();
        if (m67525g != 0) {
            boolean z = true;
            if (m67525g != 1) {
                if (m67525g != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f7711b.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return C11581c.m67529c().m67513s(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        C11581c.m67529c().m67510v(m108790a());
        return charSequence;
    }
}
