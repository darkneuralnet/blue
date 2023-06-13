package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: fW8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40985fW8 implements Iterator<Object> {
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
