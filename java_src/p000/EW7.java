package p000;

import android.util.Log;
/* renamed from: EW7 */
/* loaded from: classes5.dex */
public final class EW7 extends JX7<Double> {
    public EW7(C40993fX7 c40993fX7, String str, Double d, boolean z) {
        super(c40993fX7, str, d, true, null);
    }

    @Override // p000.JX7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Double mo15827a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String m100269c = super.m100269c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(m100269c).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(m100269c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
