package p000;

import android.content.Context;
import android.content.SharedPreferences;
/* renamed from: XA0 */
/* loaded from: classes6.dex */
public class XA0 {

    /* renamed from: a */
    public final Context f42744a;

    /* renamed from: b */
    public final SharedPreferences f42745b;

    public XA0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f42744a = applicationContext;
        this.f42745b = applicationContext.getSharedPreferences("PayPalOTC", 0);
    }

    /* renamed from: a */
    public boolean m77269a(String str, boolean z) {
        return this.f42745b.getBoolean(str, z);
    }

    /* renamed from: b */
    public Context m77268b() {
        return this.f42744a;
    }

    /* renamed from: c */
    public long m77267c(String str, long j) {
        return this.f42745b.getLong(str, j);
    }

    /* renamed from: d */
    public String m77266d(String str) {
        return this.f42745b.getString(str, null);
    }

    /* renamed from: e */
    public void m77265e(String str, long j) {
        this.f42745b.edit().putLong(str, j).apply();
    }

    /* renamed from: f */
    public void m77264f(String str, String str2) {
        this.f42745b.edit().putString(str, str2).apply();
    }

    /* renamed from: g */
    public void m77263g(String str, boolean z) {
        this.f42745b.edit().putBoolean(str, z).apply();
    }
}
