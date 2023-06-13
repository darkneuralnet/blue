package p000;

import java.util.Iterator;
/* renamed from: ZU7 */
/* loaded from: classes5.dex */
public abstract class ZU7 implements Iterator {

    /* renamed from: b */
    public final Iterator f48684b;

    public ZU7(Iterator it) {
        it.getClass();
        this.f48684b = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo15989a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48684b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo15989a(this.f48684b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f48684b.remove();
    }
}
