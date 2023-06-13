package p000;

import java.util.Iterator;
/* renamed from: XM7 */
/* loaded from: classes5.dex */
public abstract class XM7 implements Iterator {

    /* renamed from: b */
    public final Iterator f43084b;

    public XM7(Iterator it) {
        it.getClass();
        this.f43084b = it;
    }

    /* renamed from: a */
    public abstract Object mo44519a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43084b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo44519a(this.f43084b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43084b.remove();
    }
}
