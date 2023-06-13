package p000;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
/* renamed from: qN8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47427qN8 {

    /* renamed from: b */
    public static final Map f105225b = new C28385so();

    /* renamed from: a */
    public final SharedPreferences f105226a;

    /* renamed from: a */
    public static synchronized void m17581a() {
        synchronized (C47427qN8.class) {
            Map map = f105225b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C47427qN8) it.next()).f105226a;
                throw null;
            }
        }
    }
}
