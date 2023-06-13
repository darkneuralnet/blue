package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Nv9 */
/* loaded from: classes5.dex */
public final class Nv9 extends Pv9 implements Iterable {

    /* renamed from: b */
    public final List f25381b = new ArrayList();

    /* renamed from: b */
    public final void m93189b(Pv9 pv9) {
        this.f25381b.add(pv9);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Nv9) && ((Nv9) obj).f25381b.equals(this.f25381b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f25381b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f25381b.iterator();
    }
}
