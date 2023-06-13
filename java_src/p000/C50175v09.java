package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: v09  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50175v09 {
    /* renamed from: a */
    public static final int m9387a(int i, Object obj, Object obj2) {
        C44839m09 c44839m09 = (C44839m09) obj;
        C39503d09 c39503d09 = (C39503d09) obj2;
        if (!c44839m09.isEmpty()) {
            Iterator it = c44839m09.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m9386b(Object obj, Object obj2) {
        C44839m09 c44839m09 = (C44839m09) obj;
        C44839m09 c44839m092 = (C44839m09) obj2;
        if (!c44839m092.isEmpty()) {
            if (!c44839m09.m26545h()) {
                c44839m09 = c44839m09.m26548e();
            }
            c44839m09.m26546g(c44839m092);
        }
        return c44839m09;
    }
}
