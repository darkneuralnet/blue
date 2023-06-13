package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: hN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42089hN7<E> extends AbstractC43266jM7<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final AbstractC38523bO7<Object> f85135c = new AM7(C51575xN7.f117539f, 0);

    /* renamed from: s */
    public static <E> AbstractC42089hN7<E> m36480s() {
        return (AbstractC42089hN7<E>) C51575xN7.f117539f;
    }

    /* renamed from: u */
    public static <E> AbstractC42089hN7<E> m36479u(Collection<? extends E> collection) {
        if (collection instanceof AbstractC43266jM7) {
            AbstractC42089hN7<E> mo30753f = ((AbstractC43266jM7) collection).mo30753f();
            if (mo30753f.mo5315h()) {
                Object[] array = mo30753f.toArray();
                return m36478v(array, array.length);
            }
            return mo30753f;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return m36478v(array2, length);
    }

    /* renamed from: v */
    public static <E> AbstractC42089hN7<E> m36478v(Object[] objArr, int i) {
        if (i == 0) {
            return (AbstractC42089hN7<E>) C51575xN7.f117539f;
        }
        return new C51575xN7(objArr, i);
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: a */
    public final MN7<E> mo30754a() {
        return listIterator(0);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (YK7.m75241a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!YK7.m75241a(it.next(), it2.next())) {
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

    @Override // p000.AbstractC43266jM7
    /* renamed from: f */
    public final AbstractC42089hN7<E> mo30753f() {
        return this;
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
    public final int indexOf(@NullableDecl Object obj) {
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

    @Override // p000.AbstractC43266jM7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: j */
    public int mo5314j(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
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

    @Override // java.util.List
    /* renamed from: o */
    public AbstractC42089hN7<E> subList(int i, int i2) {
        C46222oL7.m21302c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (AbstractC42089hN7<E>) C51575xN7.f117539f;
        }
        return new PM7(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w */
    public final AbstractC38523bO7<E> listIterator(int i) {
        C46222oL7.m21303b(i, size(), "index");
        if (isEmpty()) {
            return (AbstractC38523bO7<E>) f85135c;
        }
        return new AM7(this, i);
    }
}
