package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* renamed from: xB8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51468xB8 implements InterfaceC51320ww8 {

    /* renamed from: b */
    public static final Map f117179b = new C28385so();

    /* renamed from: a */
    public final SharedPreferences f117180a;

    /* renamed from: a */
    public static C51468xB8 m5721a(Context context, String str, Runnable runnable) {
        C51468xB8 c51468xB8;
        if (!C41814gu8.m37343b()) {
            synchronized (C51468xB8.class) {
                c51468xB8 = (C51468xB8) f117179b.get(null);
                if (c51468xB8 == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return c51468xB8;
        }
        throw null;
    }

    /* renamed from: b */
    public static synchronized void m5720b() {
        synchronized (C51468xB8.class) {
            Map map = f117179b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C51468xB8) it.next()).f117180a;
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC51320ww8
    public final Object zzb(String str) {
        throw null;
    }
}
