package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: vU8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50453vU8 extends AbstractC37976aT8 implements List, RandomAccess {

    /* renamed from: c */
    public static final RX8 f114165c = new YT8(SV8.f33822f, 0);

    /* renamed from: j */
    public static AbstractC50453vU8 m8607j(Object[] objArr) {
        return m8606o(objArr, objArr.length);
    }

    /* renamed from: o */
    public static AbstractC50453vU8 m8606o(Object[] objArr, int i) {
        if (i == 0) {
            return SV8.f33822f;
        }
        return new SV8(objArr, i);
    }

    /* renamed from: s */
    public static AbstractC50453vU8 m8605s() {
        return SV8.f33822f;
    }

    /* renamed from: u */
    public static AbstractC50453vU8 m8604u(Object obj) {
        Object[] objArr = {"/m/0jbk"};
        for (int i = 0; i <= 0; i++) {
            IV8.m101967a(objArr[i], i);
        }
        return m8606o(objArr, 1);
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: a */
    public int mo5039a(Object[] objArr, int i) {
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

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: e */
    public final HX8 mo5038e() {
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
                        if (AP8.m115814a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!AP8.m115814a(it.next(), it2.next())) {
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
    public AbstractC50453vU8 subList(int i, int i2) {
        DQ8.m110466e(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return SV8.f33822f;
        }
        return new C43932kU8(this, i, i3);
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

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    /* renamed from: v */
    public final RX8 listIterator(int i) {
        DQ8.m110469b(i, size(), "index");
        if (isEmpty()) {
            return f114165c;
        }
        return new YT8(this, i);
    }
}
