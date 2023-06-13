package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: Mo2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34549Mo2<T> implements X94<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f23612b = null;

    /* renamed from: a */
    public volatile Set<X94<T>> f23611a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C34549Mo2(Collection<X94<T>> collection) {
        this.f23611a.addAll(collection);
    }

    /* renamed from: b */
    public static C34549Mo2<?> m94782b(Collection<X94<?>> collection) {
        return new C34549Mo2<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m94783a(X94<T> x94) {
        if (this.f23612b == null) {
            this.f23611a.add(x94);
        } else {
            this.f23612b.add(x94.get());
        }
    }

    @Override // p000.X94
    /* renamed from: c */
    public Set<T> get() {
        if (this.f23612b == null) {
            synchronized (this) {
                if (this.f23612b == null) {
                    this.f23612b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m94780d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f23612b);
    }

    /* renamed from: d */
    public final synchronized void m94780d() {
        for (X94<T> x94 : this.f23611a) {
            this.f23612b.add(x94.get());
        }
        this.f23611a = null;
    }
}
