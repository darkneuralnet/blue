package p000;

import java.util.Map;
/* renamed from: av7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38248av7 {
    /* renamed from: a */
    public static final int m65250a(int i, Object obj, Object obj2) {
        C37650Zu7 c37650Zu7 = (C37650Zu7) obj;
        C37416Yu7 c37416Yu7 = (C37416Yu7) obj2;
        int i2 = 0;
        if (!c37650Zu7.isEmpty()) {
            for (Map.Entry entry : c37650Zu7.entrySet()) {
                i2 += c37416Yu7.m74017a(i, entry.getKey(), entry.getValue());
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final boolean m65249b(Object obj) {
        return !((C37650Zu7) obj).m72310h();
    }

    /* renamed from: c */
    public static final Object m65248c(Object obj, Object obj2) {
        C37650Zu7 c37650Zu7 = (C37650Zu7) obj;
        C37650Zu7 c37650Zu72 = (C37650Zu7) obj2;
        if (!c37650Zu72.isEmpty()) {
            if (!c37650Zu7.m72310h()) {
                c37650Zu7 = c37650Zu7.m72313e();
            }
            c37650Zu7.m72311g(c37650Zu72);
        }
        return c37650Zu7;
    }
}
