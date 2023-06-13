package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* renamed from: XY7 */
/* loaded from: classes5.dex */
public final class XY7 implements MT7 {

    /* renamed from: b */
    public static final Map<String, XY7> f43393b = new C28385so();

    /* renamed from: a */
    public final SharedPreferences f43394a;

    /* renamed from: a */
    public static XY7 m76857a(Context context, String str) {
        XY7 xy7;
        if (!C50425vR7.m8642a()) {
            synchronized (XY7.class) {
                xy7 = f43393b.get(null);
                if (xy7 == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return xy7;
        }
        throw null;
    }

    /* renamed from: b */
    public static synchronized void m76856b() {
        synchronized (XY7.class) {
            Map<String, XY7> map = f43393b;
            Iterator<XY7> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f43394a;
                throw null;
            }
        }
    }

    @Override // p000.MT7
    public final Object zzb(String str) {
        throw null;
    }
}
