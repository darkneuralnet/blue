package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: V08 */
/* loaded from: classes5.dex */
public final class V08 implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
