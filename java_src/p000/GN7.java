package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: GN7 */
/* loaded from: classes5.dex */
public final class GN7 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b */
    public final List f11845b;

    /* renamed from: c */
    public final InterfaceC42388hs9 f11846c;

    public GN7(List list, InterfaceC42388hs9 interfaceC42388hs9) {
        list.getClass();
        this.f11845b = list;
        interfaceC42388hs9.getClass();
        this.f11846c = interfaceC42388hs9;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f11845b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f11846c.zza(this.f11845b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f11845b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C48019rN7(this, this.f11845b.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f11846c.zza(this.f11845b.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11845b.size();
    }
}
