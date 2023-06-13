package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: JL6 */
/* loaded from: classes6.dex */
public final class JL6 {

    /* renamed from: a */
    public final ConcurrentHashMap<HL6, List<Throwable>> f17394a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f17395b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m100658a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f17395b.poll();
            if (poll == null) {
                break;
            }
            this.f17394a.remove(poll);
        }
        List<Throwable> list = this.f17394a.get(new HL6(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f17394a.putIfAbsent(new HL6(th, this.f17395b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
