package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: RC1 */
/* loaded from: classes6.dex */
public class RC1 {

    /* renamed from: b */
    public static volatile RC1 f31638b;

    /* renamed from: a */
    public final Set<AbstractC49476tq2> f31639a = new HashSet();

    /* renamed from: a */
    public static RC1 m87206a() {
        RC1 rc1 = f31638b;
        if (rc1 == null) {
            synchronized (RC1.class) {
                rc1 = f31638b;
                if (rc1 == null) {
                    rc1 = new RC1();
                    f31638b = rc1;
                }
            }
        }
        return rc1;
    }

    /* renamed from: b */
    public Set<AbstractC49476tq2> m87205b() {
        Set<AbstractC49476tq2> unmodifiableSet;
        synchronized (this.f31639a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f31639a);
        }
        return unmodifiableSet;
    }
}
