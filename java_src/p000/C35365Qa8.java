package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Qa8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35365Qa8 implements Iterator<Object> {
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
