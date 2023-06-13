package p000;

import android.text.InputFilter;
import android.text.Spanned;
/* renamed from: bO2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38518bO2 implements InputFilter {

    /* renamed from: b */
    public int f57369b;

    public C38518bO2(int i) {
        this.f57369b = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f57369b) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
