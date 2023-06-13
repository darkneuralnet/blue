package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: Ng8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34717Ng8 {

    /* renamed from: a */
    public final ConcurrentHashMap<C52346yg8, List<Throwable>> f24972a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f24973b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m93581a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f24973b.poll();
        while (poll != null) {
            this.f24972a.remove(poll);
            poll = this.f24973b.poll();
        }
        List<Throwable> list = this.f24972a.get(new C52346yg8(th, null));
        if (!z) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f24972a.putIfAbsent(new C52346yg8(th, this.f24973b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
