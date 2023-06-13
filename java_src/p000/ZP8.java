package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: ZP8 */
/* loaded from: classes6.dex */
public abstract class ZP8<E> extends XO8<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final AbstractC45711nU8<Object> f48516c = new C48038rP8(FR8.f9374f, 0);

    /* renamed from: A */
    public static <E> ZP8<E> m73206A(E e) {
        Object[] objArr = {e};
        C50426vR8.m8640b(objArr, 1);
        return m73200w(objArr, 1);
    }

    /* renamed from: u */
    public static <E> C42701iP8<E> m73202u() {
        return new C42701iP8<>(4);
    }

    /* renamed from: v */
    public static <E> ZP8<E> m73201v(Object[] objArr) {
        return m73200w(objArr, objArr.length);
    }

    /* renamed from: w */
    public static <E> ZP8<E> m73200w(Object[] objArr, int i) {
        if (i == 0) {
            return (ZP8<E>) FR8.f9374f;
        }
        return new FR8(objArr, i);
    }

    /* renamed from: x */
    public static <E> ZP8<E> m73199x(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m73198y((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (ZP8<E>) FR8.f9374f;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m73206A(next);
        }
        C42701iP8 c42701iP8 = new C42701iP8(4);
        c42701iP8.m34006d(next);
        c42701iP8.m34005e(it);
        return c42701iP8.m34004f();
    }

    /* renamed from: y */
    public static <E> ZP8<E> m73198y(Collection<? extends E> collection) {
        if (collection instanceof XO8) {
            ZP8<E> mo25571e = ((XO8) collection).mo25571e();
            if (mo25571e.mo6791h()) {
                Object[] array = mo25571e.toArray();
                return m73200w(array, array.length);
            }
            return mo25571e;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C50426vR8.m8640b(array2, length);
        return m73200w(array2, length);
    }

    /* renamed from: z */
    public static <E> ZP8<E> m73197z() {
        return (ZP8<E>) FR8.f9374f;
    }

    @Override // java.util.List
    /* renamed from: C */
    public final AbstractC45711nU8<E> listIterator(int i) {
        C52142yK8.m3663b(i, size(), "index");
        if (isEmpty()) {
            return (AbstractC45711nU8<E>) f48516c;
        }
        return new C48038rP8(this, i);
    }

    @Override // p000.XO8
    /* renamed from: a */
    public int mo21022a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.XO8
    @Deprecated
    /* renamed from: e */
    public final ZP8<E> mo25571e() {
        return this;
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
                        if (C48576sJ8.m14396a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C48576sJ8.m14396a(it.next(), it2.next())) {
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

    @Override // p000.XO8
    /* renamed from: f */
    public final AbstractC38578bU8<E> mo21021f() {
        return listIterator(0);
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

    public int indexOf(Object obj) {
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

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public ZP8<E> mo73204o() {
        return size() <= 1 ? this : new DP8(this);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public ZP8<E> subList(int i, int i2) {
        C52142yK8.m3657h(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (ZP8<E>) FR8.f9374f;
        }
        return new OP8(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
