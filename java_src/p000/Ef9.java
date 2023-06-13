package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: Ef9 */
/* loaded from: classes5.dex */
public final class Ef9 {
    /* renamed from: a */
    public static final int m108586a(int i, Object obj, Object obj2) {
        C51151wf9 c51151wf9 = (C51151wf9) obj;
        C46409of9 c46409of9 = (C46409of9) obj2;
        if (!c51151wf9.isEmpty()) {
            Iterator it = c51151wf9.entrySet().iterator();
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
    public static final Object m108585b(Object obj, Object obj2) {
        C51151wf9 c51151wf9 = (C51151wf9) obj;
        C51151wf9 c51151wf92 = (C51151wf9) obj2;
        if (!c51151wf92.isEmpty()) {
            if (!c51151wf9.m6530h()) {
                c51151wf9 = c51151wf9.m6533e();
            }
            c51151wf9.m6531g(c51151wf92);
        }
        return c51151wf9;
    }
}
