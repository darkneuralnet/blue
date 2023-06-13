package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: Ns2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34819Ns2 {

    /* renamed from: Ns2$a */
    /* loaded from: classes6.dex */
    public static class C5729a<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final E f25319b;

        /* renamed from: c */
        public final E[] f25320c;

        public C5729a(E e, E[] eArr) {
            this.f25319b = e;
            this.f25320c = (E[]) ((Object[]) EZ3.m108801n(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            EZ3.m108803l(i, size());
            if (i == 0) {
                return this.f25319b;
            }
            return this.f25320c[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C52589z52.m1836d(this.f25320c.length, 1);
        }
    }

    private C34819Ns2() {
    }

    /* renamed from: a */
    public static <E> List<E> m93261a(E e, E[] eArr) {
        return new C5729a(e, eArr);
    }

    /* renamed from: b */
    public static boolean m93260b(List<?> list, Object obj) {
        if (obj == EZ3.m108801n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!C37025Xd3.m76748a(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return C52933zg2.m592f(list.iterator(), list2.iterator());
    }

    /* renamed from: c */
    public static int m93259c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m93258d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C37025Xd3.m76748a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m93258d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m93257e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m93256f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C37025Xd3.m76748a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static int m93256f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static <E> ArrayList<E> m93255g() {
        return new ArrayList<>();
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m93254h(Iterable<? extends E> iterable) {
        EZ3.m108801n(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return m93253i(iterable.iterator());
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m93253i(Iterator<? extends E> it) {
        ArrayList<E> m93255g = m93255g();
        C52933zg2.m597a(m93255g, it);
        return m93255g;
    }

    /* renamed from: j */
    public static <E> ArrayList<E> m93252j(int i) {
        C39948dm0.m43733b(i, "initialArraySize");
        return new ArrayList<>(i);
    }
}
