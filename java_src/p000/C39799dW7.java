package p000;

import android.util.Log;
/* renamed from: dW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39799dW7 extends JX7<Long> {
    public C39799dW7(C40993fX7 c40993fX7, String str, Long l, boolean z) {
        super(c40993fX7, str, l, true, null);
    }

    @Override // p000.JX7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Long mo15827a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String m100269c = super.m100269c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(m100269c).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(m100269c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
