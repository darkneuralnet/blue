package p000;

import java.util.Iterator;
/* renamed from: i67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42525i67 implements Iterator {

    /* renamed from: b */
    public final Iterator f86759b;

    public AbstractC42525i67(Iterator it) {
        it.getClass();
        this.f86759b = it;
    }

    /* renamed from: a */
    public abstract Object mo34440a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f86759b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo34440a(this.f86759b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
