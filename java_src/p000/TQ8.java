package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: TQ8 */
/* loaded from: classes5.dex */
public final class TQ8 {

    /* renamed from: b */
    public static volatile TQ8 f35439b;

    /* renamed from: c */
    public static final TQ8 f35440c = new TQ8(true);

    /* renamed from: a */
    public final Map f35441a;

    public TQ8() {
        this.f35441a = new HashMap();
    }

    /* renamed from: a */
    public static TQ8 m83663a() {
        TQ8 tq8 = f35439b;
        if (tq8 != null) {
            return tq8;
        }
        synchronized (TQ8.class) {
            TQ8 tq82 = f35439b;
            if (tq82 != null) {
                return tq82;
            }
            TQ8 m3474b = AbstractC52214yS8.m3474b(TQ8.class);
            f35439b = m3474b;
            return m3474b;
        }
    }

    /* renamed from: b */
    public final C47481qT8 m83662b(InterfaceC47814r19 interfaceC47814r19, int i) {
        return (C47481qT8) this.f35441a.get(new IQ8(interfaceC47814r19, i));
    }

    public TQ8(boolean z) {
        this.f35441a = Collections.emptyMap();
    }
}
