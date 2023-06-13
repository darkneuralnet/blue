package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
/* renamed from: Ep7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32691Ep7 extends AbstractC48818sj7 {

    /* renamed from: m */
    public final Object f8173m;

    /* renamed from: n */
    public String f8174n;

    /* renamed from: o */
    public Object f8175o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC46527or7 f8176p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32691Ep7(C41200fs7 c41200fs7, String str, Object obj, InterfaceC46527or7 interfaceC46527or7) {
        super(c41200fs7, str, obj, null);
        this.f8176p = interfaceC46527or7;
        this.f8173m = new Object();
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: c */
    public final Object mo13760c(SharedPreferences sharedPreferences) {
        try {
            return mo13753j(sharedPreferences.getString(this.f109165b, ""));
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f109165b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // p000.AbstractC48818sj7
    /* renamed from: j */
    public final Object mo13753j(String str) {
        Object obj;
        try {
            synchronized (this.f8173m) {
                if (!str.equals(this.f8174n)) {
                    Object zzb = this.f8176p.zzb(Base64.decode(str, 3));
                    this.f8174n = str;
                    this.f8175o = zzb;
                }
                obj = this.f8175o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f109165b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
