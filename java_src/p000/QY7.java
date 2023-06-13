package p000;

import java.util.Iterator;
/* renamed from: QY7 */
/* loaded from: classes5.dex */
public abstract class QY7 implements Iterator {

    /* renamed from: b */
    public final Iterator f30515b;

    public QY7(Iterator it) {
        it.getClass();
        this.f30515b = it;
    }

    /* renamed from: a */
    public abstract Object mo15922a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30515b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo15922a(this.f30515b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30515b.remove();
    }
}
