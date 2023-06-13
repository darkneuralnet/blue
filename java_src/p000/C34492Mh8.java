package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: Mh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34492Mh8 {
    /* renamed from: a */
    public static final int m95032a(int i, Object obj, Object obj2) {
        C51763xh8 c51763xh8 = (C51763xh8) obj;
        C43463jh8 c43463jh8 = (C43463jh8) obj2;
        if (!c51763xh8.isEmpty()) {
            Iterator it = c51763xh8.entrySet().iterator();
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
    public static final Object m95031b(Object obj, Object obj2) {
        C51763xh8 c51763xh8 = (C51763xh8) obj;
        C51763xh8 c51763xh82 = (C51763xh8) obj2;
        if (!c51763xh82.isEmpty()) {
            if (!c51763xh8.m4870h()) {
                c51763xh8 = c51763xh8.m4873e();
            }
            c51763xh8.m4871g(c51763xh82);
        }
        return c51763xh8;
    }
}
