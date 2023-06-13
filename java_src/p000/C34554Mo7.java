package p000;

import android.content.SharedPreferences;
import android.util.Log;
/* renamed from: Mo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34554Mo7 extends AbstractC48818sj7<String> {
    public C34554Mo7(C41200fs7 c41200fs7, String str, String str2) {
        super(c41200fs7, str, str2, null);
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: j */
    public final /* synthetic */ String mo13753j(String str) {
        return str;
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: r */
    public final String mo13760c(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f109165b, null);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f109165b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }
}
