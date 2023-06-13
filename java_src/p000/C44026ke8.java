package p000;

import android.content.ContentResolver;
import java.util.Iterator;
import java.util.Map;
/* renamed from: ke8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44026ke8 {

    /* renamed from: b */
    public static final Map f94708b = new C28385so();

    /* renamed from: c */
    public static final String[] f94709c = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f94710a;

    /* renamed from: a */
    public static synchronized void m28703a() {
        synchronized (C44026ke8.class) {
            Map map = f94708b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                ContentResolver contentResolver = ((C44026ke8) it.next()).f94710a;
                throw null;
            }
        }
    }
}
