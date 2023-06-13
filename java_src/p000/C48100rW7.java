package p000;

import android.util.Log;
/* renamed from: rW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48100rW7 extends JX7<Boolean> {
    public C48100rW7(C40993fX7 c40993fX7, String str, Boolean bool, boolean z) {
        super(c40993fX7, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.JX7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Boolean mo15827a(Object obj) {
        if (C41532gR7.f82200c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C41532gR7.f82201d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String m100269c = super.m100269c();
        String str = (String) obj;
        StringBuilder sb = new StringBuilder(String.valueOf(m100269c).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(m100269c);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
