package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: ll7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44688ll7 extends AbstractC33087Gh7 implements List, RandomAccess {

    /* renamed from: c */
    public static final AbstractC35256Po7 f96665c = new C49411tj7(C38761bn7.f58184f, 0);

    /* renamed from: s */
    public static AbstractC44688ll7 m26862s(Object[] objArr, int i) {
        if (i == 0) {
            return C38761bn7.f58184f;
        }
        return new C38761bn7(objArr, i);
    }

    /* renamed from: u */
    public static AbstractC44688ll7 m26861u(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m26860v((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C38761bn7.f58184f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m26858x(next);
        }
        C31692Ai7 c31692Ai7 = new C31692Ai7(4);
        c31692Ai7.m115373c(next);
        c31692Ai7.m115372d(it);
        c31692Ai7.f24966c = true;
        return m26862s(c31692Ai7.f24964a, c31692Ai7.f24965b);
    }

    /* renamed from: v */
    public static AbstractC44688ll7 m26860v(Collection collection) {
        if (collection instanceof AbstractC33087Gh7) {
            AbstractC44688ll7 mo26864e = ((AbstractC33087Gh7) collection).mo26864e();
            if (mo26864e.mo17166h()) {
                Object[] array = mo26864e.toArray();
                return m26862s(array, array.length);
            }
            return mo26864e;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C42326hm7.m35876a(array2, length);
        return m26862s(array2, length);
    }

    /* renamed from: w */
    public static AbstractC44688ll7 m26859w() {
        return C38761bn7.f58184f;
    }

    /* renamed from: x */
    public static AbstractC44688ll7 m26858x(Object obj) {
        Object[] objArr = {obj};
        C42326hm7.m35876a(objArr, 1);
        return m26862s(objArr, 1);
    }

    /* renamed from: y */
    public static AbstractC44688ll7 m26857y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C42326hm7.m35876a(objArr, 2);
        return m26862s(objArr, 2);
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: a */
    public int mo26865a(Object[] objArr, int i) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p000.AbstractC33087Gh7
    @Deprecated
    /* renamed from: e */
    public final AbstractC44688ll7 mo26864e() {
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
                        if (Ll9.m96372a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!Ll9.m96372a(it.next(), it2.next())) {
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

    @Override // p000.AbstractC33087Gh7
    /* renamed from: f */
    public final AbstractC36183Tn7 mo26863f() {
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

    @Override // p000.AbstractC33087Gh7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    /* renamed from: o */
    public AbstractC44688ll7 subList(int i, int i2) {
        Uo9.m80800c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C38761bn7.f58184f;
        }
        return new C47643qk7(this, i, i3);
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
    /* renamed from: z */
    public final AbstractC35256Po7 listIterator(int i) {
        Uo9.m80801b(i, size(), "index");
        if (isEmpty()) {
            return f96665c;
        }
        return new C49411tj7(this, i);
    }
}
