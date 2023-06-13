package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: d67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39561d67 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b */
    public final List f76125b;

    /* renamed from: c */
    public final F57 f76126c;

    public C39561d67(List list, F57 f57) {
        list.getClass();
        this.f76125b = list;
        f57.getClass();
        this.f76126c = f57;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f76126c.mo7449a(this.f76125b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f76125b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C38950c67(this, ((X57) this.f76125b).listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76125b.size();
    }
}
