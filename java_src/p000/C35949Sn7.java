package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: Sn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35949Sn7 extends AbstractC48818sj7<Boolean> {
    public C35949Sn7(C41200fs7 c41200fs7, String str, Boolean bool) {
        super(c41200fs7, str, bool, null);
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: j */
    public final /* synthetic */ Boolean mo13753j(String str) {
        if (Fx9.f10595c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (Fx9.f10596d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f109165b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: r */
    public final Boolean mo13760c(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f109165b, false));
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f109165b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e);
            return null;
        }
    }
}
