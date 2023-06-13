package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
/* renamed from: St4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36000St4<E> extends AbstractC40412eZ1<E> {

    /* renamed from: g */
    public static final C36000St4<Comparable> f34399g = new C36000St4<>(VY1.m79781E(), AbstractC53114zy3.m58c());

    /* renamed from: f */
    public final transient VY1<E> f34400f;

    public C36000St4(VY1<E> vy1, Comparator<? super E> comparator) {
        super(comparator);
        this.f34400f = vy1;
    }

    @Override // p000.AbstractC40412eZ1
    /* renamed from: K */
    public AbstractC40412eZ1<E> mo42787K() {
        Comparator reverseOrder = Collections.reverseOrder(this.f78539d);
        if (isEmpty()) {
            return AbstractC40412eZ1.m42784N(reverseOrder);
        }
        return new C36000St4(this.f34400f.mo79762L(), reverseOrder);
    }

    @Override // p000.AbstractC40412eZ1, java.util.NavigableSet
    /* renamed from: L */
    public AbstractC48175re6<E> descendingIterator() {
        return this.f34400f.mo79762L().iterator();
    }

    @Override // p000.AbstractC40412eZ1
    /* renamed from: R */
    public AbstractC40412eZ1<E> mo42781R(E e, boolean z) {
        return m84688c0(0, m84687d0(e, z));
    }

    @Override // p000.AbstractC40412eZ1
    /* renamed from: U */
    public AbstractC40412eZ1<E> mo42778U(E e, boolean z, E e2, boolean z2) {
        return mo42775Y(e, z).mo42781R(e2, z2);
    }

    @Override // p000.AbstractC40412eZ1
    /* renamed from: Y */
    public AbstractC40412eZ1<E> mo42775Y(E e, boolean z) {
        return m84688c0(m84686e0(e, z), size());
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1
    /* renamed from: a */
    public VY1<E> mo10675a() {
        return this.f34400f;
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        return this.f34400f.mo9381b(objArr, i);
    }

    @Override // p000.QY1
    /* renamed from: c */
    public Object[] mo79758c() {
        return this.f34400f.mo79758c();
    }

    /* renamed from: c0 */
    public C36000St4<E> m84688c0(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C36000St4<>(this.f34400f.subList(i, i2), this.f78539d);
        }
        return AbstractC40412eZ1.m42784N(this.f78539d);
    }

    @Override // p000.AbstractC40412eZ1, java.util.NavigableSet
    public E ceiling(E e) {
        int m84686e0 = m84686e0(e, true);
        if (m84686e0 == size()) {
            return null;
        }
        return this.f34400f.get(m84686e0);
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                return m84685f0(obj) >= 0;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC45139mX2) {
            collection = ((InterfaceC45139mX2) collection).mo25465F2();
        }
        if (C50980wN5.m6956b(comparator(), collection) && collection.size() > 1) {
            AbstractC48175re6<E> it = iterator();
            Iterator<?> it2 = collection.iterator();
            if (!it.hasNext()) {
                return false;
            }
            Object next = it2.next();
            E next2 = it.next();
            while (true) {
                try {
                    int m42774Z = m42774Z(next2, next);
                    if (m42774Z < 0) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        next2 = it.next();
                    } else if (m42774Z == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (m42774Z > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    /* renamed from: d0 */
    public int m84687d0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f34400f, EZ3.m108801n(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // p000.QY1
    /* renamed from: e */
    public int mo79757e() {
        return this.f34400f.mo79757e();
    }

    /* renamed from: e0 */
    public int m84686e0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f34400f, EZ3.m108801n(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // p000.AbstractC38616bZ1, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (C50980wN5.m6956b(this.f78539d, set)) {
            Iterator<E> it = set.iterator();
            try {
                AbstractC48175re6<E> it2 = iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    E next2 = it.next();
                    if (next2 == null || m42774Z(next, next2) != 0) {
                        return false;
                    }
                    while (it2.hasNext()) {
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // p000.QY1
    /* renamed from: f */
    public int mo79756f() {
        return this.f34400f.mo79756f();
    }

    /* renamed from: f0 */
    public final int m84685f0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f34400f, obj, m84684g0());
    }

    @Override // p000.AbstractC40412eZ1, java.util.SortedSet
    public E first() {
        if (!isEmpty()) {
            return this.f34400f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // p000.AbstractC40412eZ1, java.util.NavigableSet
    public E floor(E e) {
        int m84687d0 = m84687d0(e, true) - 1;
        if (m84687d0 == -1) {
            return null;
        }
        return this.f34400f.get(m84687d0);
    }

    /* renamed from: g0 */
    public Comparator<Object> m84684g0() {
        return this.f78539d;
    }

    @Override // p000.QY1
    /* renamed from: h */
    public boolean mo9378h() {
        return this.f34400f.mo9378h();
    }

    @Override // p000.AbstractC40412eZ1, java.util.NavigableSet
    public E higher(E e) {
        int m84686e0 = m84686e0(e, false);
        if (m84686e0 == size()) {
            return null;
        }
        return this.f34400f.get(m84686e0);
    }

    @Override // p000.AbstractC40412eZ1, p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return this.f34400f.iterator();
    }

    @Override // p000.AbstractC40412eZ1, java.util.SortedSet
    public E last() {
        if (!isEmpty()) {
            return this.f34400f.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // p000.AbstractC40412eZ1, java.util.NavigableSet
    public E lower(E e) {
        int m84687d0 = m84687d0(e, false) - 1;
        if (m84687d0 == -1) {
            return null;
        }
        return this.f34400f.get(m84687d0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f34400f.size();
    }
}
