package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: bw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC38851bw7 extends AbstractC45944ns7 implements List, RandomAccess {

    /* renamed from: c */
    public static final AbstractC47426qN7 f59810c = new C33672Iu7(C40876fK7.f79892f, 0);

    /* renamed from: j */
    public static AbstractC38851bw7 m62113j(Object[] objArr) {
        return m62112o(objArr, objArr.length);
    }

    /* renamed from: o */
    public static AbstractC38851bw7 m62112o(Object[] objArr, int i) {
        if (i == 0) {
            return C40876fK7.f79892f;
        }
        return new C40876fK7(objArr, i);
    }

    /* renamed from: s */
    public static AbstractC38851bw7 m62111s() {
        return C40876fK7.f79892f;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: a */
    public int mo22261a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: e */
    public final ZM7 mo4273e() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (QX7.m88418a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!QX7.m88418a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* renamed from: h */
    public AbstractC38851bw7 subList(int i, int i2) {
        C41211ft8.m40587c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C40876fK7.f79892f;
        }
        return new C53088zv7(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public final AbstractC47426qN7 listIterator(int i) {
        C41211ft8.m40588b(i, size(), "index");
        if (isEmpty()) {
            return f59810c;
        }
        return new C33672Iu7(this, i);
    }
}
