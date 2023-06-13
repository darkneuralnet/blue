package p000;

import java.util.Iterator;
/* renamed from: IT7 */
/* loaded from: classes5.dex */
public abstract class IT7 implements Iterator {

    /* renamed from: b */
    public final Iterator f15739b;

    public IT7(Iterator it) {
        it.getClass();
        this.f15739b = it;
    }

    /* renamed from: a */
    public abstract Object mo88533a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15739b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo88533a(this.f15739b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15739b.remove();
    }
}
