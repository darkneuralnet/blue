package p000;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: U59 */
/* loaded from: classes6.dex */
public abstract class U59<OutputT> extends AbstractC43683k39<OutputT> {

    /* renamed from: k */
    public static final AbstractC50817w59 f36851k;

    /* renamed from: l */
    public static final Logger f36852l = Logger.getLogger(U59.class.getName());

    /* renamed from: i */
    public volatile Set<Throwable> f36853i = null;

    /* renamed from: j */
    public volatile int f36854j;

    static {
        AbstractC50817w59 m59;
        Throwable th;
        try {
            m59 = new E59(AtomicReferenceFieldUpdater.newUpdater(U59.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(U59.class, "j"));
            th = null;
        } catch (Throwable th2) {
            m59 = new M59(null);
            th = th2;
        }
        f36851k = m59;
        if (th != null) {
            f36852l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public U59(int i) {
        this.f36854j = i;
    }

    /* renamed from: D */
    public static /* synthetic */ int m81977D(U59 u59) {
        int i = u59.f36854j - 1;
        u59.f36854j = i;
        return i;
    }

    /* renamed from: E */
    public final int m81976E() {
        return f36851k.mo7447a(this);
    }

    /* renamed from: H */
    public final Set<Throwable> m81973H() {
        Set<Throwable> set = this.f36853i;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            mo81971J(newSetFromMap);
            f36851k.mo7446b(this, null, newSetFromMap);
            Set<Throwable> set2 = this.f36853i;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* renamed from: I */
    public final void m81972I() {
        this.f36853i = null;
    }

    /* renamed from: J */
    public abstract void mo81971J(Set<Throwable> set);
}
