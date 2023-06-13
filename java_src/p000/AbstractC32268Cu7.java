package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: Cu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32268Cu7 extends AbstractC48306rr7 implements List, RandomAccess {

    /* renamed from: c */
    public static final AbstractC37867aH7 f4881c = new C37398Ys7(C48385rz7.f108099f, 0);

    /* renamed from: j */
    public static AbstractC32268Cu7 m111361j(Object[] objArr, int i) {
        if (i == 0) {
            return C48385rz7.f108099f;
        }
        return new C48385rz7(objArr, i);
    }

    /* renamed from: o */
    public static AbstractC32268Cu7 m111360o(Object obj) {
        Object[] objArr = {obj};
        C32538Dy7.m109561a(objArr, 1);
        return m111361j(objArr, 1);
    }

    /* renamed from: s */
    public static AbstractC32268Cu7 m111359s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        C32538Dy7.m109561a(objArr, 9);
        return m111361j(objArr, 9);
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: a */
    public int mo14906a(Object[] objArr, int i) {
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

    @Override // p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: e */
    public final AbstractC42026hG7 mo15154e() {
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
                        if (C35184Pg7.m89932a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C35184Pg7.m89932a(it.next(), it2.next())) {
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
    public AbstractC32268Cu7 subList(int i, int i2) {
        C49421tk7.m11816c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C48385rz7.f108099f;
        }
        return new C34599Mt7(this, i, i3);
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

    @Override // p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
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
    public final AbstractC37867aH7 listIterator(int i) {
        C49421tk7.m11817b(i, size(), "index");
        if (isEmpty()) {
            return f4881c;
        }
        return new C37398Ys7(this, i);
    }
}
