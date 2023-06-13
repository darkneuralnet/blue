package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.C40052dw5;
import p000.InterfaceC45139mX2;
/* renamed from: oX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46325oX2 {

    /* renamed from: oX2$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC26997a<E> implements InterfaceC45139mX2.InterfaceC26111a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC45139mX2.InterfaceC26111a)) {
                return false;
            }
            InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) obj;
            if (getCount() != interfaceC26111a.getCount() || !C37025Xd3.m76748a(getElement(), interfaceC26111a.getElement())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            E element = getElement();
            if (element == null) {
                hashCode = 0;
            } else {
                hashCode = element.hashCode();
            }
            return hashCode ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count != 1) {
                StringBuilder sb = new StringBuilder(valueOf.length() + 14);
                sb.append(valueOf);
                sb.append(" x ");
                sb.append(count);
                return sb.toString();
            }
            return valueOf;
        }
    }

    /* renamed from: oX2$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC26998b<E> extends C40052dw5.AbstractC19913d<E> {
        /* renamed from: a */
        public abstract InterfaceC45139mX2<E> mo20924a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo20924a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo20924a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo20924a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo20924a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return mo20924a().mo20922A2(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo20924a().entrySet().size();
        }
    }

    /* renamed from: oX2$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC26999c<E> extends C40052dw5.AbstractC19913d<InterfaceC45139mX2.InterfaceC26111a<E>> {
        /* renamed from: a */
        public abstract InterfaceC45139mX2<E> mo20923a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo20923a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof InterfaceC45139mX2.InterfaceC26111a)) {
                return false;
            }
            InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) obj;
            if (interfaceC26111a.getCount() <= 0 || mo20923a().mo20918d3(interfaceC26111a.getElement()) != interfaceC26111a.getCount()) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof InterfaceC45139mX2.InterfaceC26111a) {
                InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) obj;
                E e = (E) interfaceC26111a.getElement();
                int count = interfaceC26111a.getCount();
                if (count != 0) {
                    return mo20923a().mo25464P0(e, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: oX2$d */
    /* loaded from: classes6.dex */
    public static final class C27000d<E> extends AbstractC27004g<E> {

        /* renamed from: d */
        public final InterfaceC45139mX2<E> f102115d;

        /* renamed from: e */
        public final IZ3<? super E> f102116e;

        /* renamed from: oX2$d$a */
        /* loaded from: classes6.dex */
        public class C27001a implements IZ3<InterfaceC45139mX2.InterfaceC26111a<E>> {
            public C27001a() {
            }

            @Override // p000.IZ3
            /* renamed from: a */
            public boolean apply(InterfaceC45139mX2.InterfaceC26111a<E> interfaceC26111a) {
                return C27000d.this.f102116e.apply(interfaceC26111a.getElement());
            }
        }

        public C27000d(InterfaceC45139mX2<E> interfaceC45139mX2, IZ3<? super E> iz3) {
            super(null);
            this.f102115d = (InterfaceC45139mX2) EZ3.m108801n(interfaceC45139mX2);
            this.f102116e = (IZ3) EZ3.m108801n(iz3);
        }

        @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        /* renamed from: A2 */
        public int mo20922A2(Object obj, int i) {
            C39948dm0.m43733b(i, "occurrences");
            if (i == 0) {
                return mo20918d3(obj);
            }
            if (contains(obj)) {
                return this.f102115d.mo20922A2(obj, i);
            }
            return 0;
        }

        @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        /* renamed from: H0 */
        public int mo20921H0(E e, int i) {
            EZ3.m108804k(this.f102116e.apply(e), "Element %s does not match predicate %s", e, this.f102116e);
            return this.f102115d.mo20921H0(e, i);
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: a */
        public Set<E> mo20920a() {
            return C40052dw5.m43493b(this.f102115d.mo25465F2(), this.f102116e);
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: b */
        public Set<InterfaceC45139mX2.InterfaceC26111a<E>> mo20919b() {
            return C40052dw5.m43493b(this.f102115d.entrySet(), new C27001a());
        }

        @Override // p000.InterfaceC45139mX2
        /* renamed from: d3 */
        public int mo20918d3(Object obj) {
            int mo20918d3 = this.f102115d.mo20918d3(obj);
            if (mo20918d3 <= 0 || !this.f102116e.apply(obj)) {
                return 0;
            }
            return mo20918d3;
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: e */
        public Iterator<E> mo20917e() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: f */
        public Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> mo20916f() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.C46325oX2.AbstractC27004g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.InterfaceC45139mX2
        /* renamed from: h */
        public AbstractC48175re6<E> iterator() {
            return C52933zg2.m588j(this.f102115d.iterator(), this.f102116e);
        }
    }

    /* renamed from: oX2$e */
    /* loaded from: classes6.dex */
    public static class C27002e<E> extends AbstractC26997a<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final E f102118b;

        /* renamed from: c */
        public final int f102119c;

        public C27002e(E e, int i) {
            this.f102118b = e;
            this.f102119c = i;
            C39948dm0.m43733b(i, "count");
        }

        @Override // p000.InterfaceC45139mX2.InterfaceC26111a
        public final int getCount() {
            return this.f102119c;
        }

        @Override // p000.InterfaceC45139mX2.InterfaceC26111a
        public final E getElement() {
            return this.f102118b;
        }
    }

    /* renamed from: oX2$f */
    /* loaded from: classes6.dex */
    public static final class C27003f<E> implements Iterator<E> {

        /* renamed from: b */
        public final InterfaceC45139mX2<E> f102120b;

        /* renamed from: c */
        public final Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> f102121c;

        /* renamed from: d */
        public InterfaceC45139mX2.InterfaceC26111a<E> f102122d;

        /* renamed from: e */
        public int f102123e;

        /* renamed from: f */
        public int f102124f;

        /* renamed from: g */
        public boolean f102125g;

        public C27003f(InterfaceC45139mX2<E> interfaceC45139mX2, Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> it) {
            this.f102120b = interfaceC45139mX2;
            this.f102121c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f102123e > 0 || this.f102121c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                if (this.f102123e == 0) {
                    InterfaceC45139mX2.InterfaceC26111a<E> next = this.f102121c.next();
                    this.f102122d = next;
                    int count = next.getCount();
                    this.f102123e = count;
                    this.f102124f = count;
                }
                this.f102123e--;
                this.f102125g = true;
                InterfaceC45139mX2.InterfaceC26111a<E> interfaceC26111a = this.f102122d;
                Objects.requireNonNull(interfaceC26111a);
                return interfaceC26111a.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C39948dm0.m43731d(this.f102125g);
            if (this.f102124f == 1) {
                this.f102121c.remove();
            } else {
                InterfaceC45139mX2<E> interfaceC45139mX2 = this.f102120b;
                InterfaceC45139mX2.InterfaceC26111a<E> interfaceC26111a = this.f102122d;
                Objects.requireNonNull(interfaceC26111a);
                interfaceC45139mX2.remove(interfaceC26111a.getElement());
            }
            this.f102124f--;
            this.f102125g = false;
        }
    }

    /* renamed from: oX2$g */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC27004g<E> extends AbstractC9586Y0<E> {
        private AbstractC27004g() {
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: c */
        public int mo20913c() {
            return mo25465F2().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo25465F2().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.InterfaceC45139mX2
        public Iterator<E> iterator() {
            return C46325oX2.m20930h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
        public int size() {
            return C46325oX2.m20929i(this);
        }

        public /* synthetic */ AbstractC27004g(C45732nX2 c45732nX2) {
            this();
        }
    }

    private C46325oX2() {
    }

    /* renamed from: a */
    public static <E> boolean m20937a(InterfaceC45139mX2<E> interfaceC45139mX2, AbstractC5143M0<? extends E> abstractC5143M0) {
        if (abstractC5143M0.isEmpty()) {
            return false;
        }
        abstractC5143M0.m96021h(interfaceC45139mX2);
        return true;
    }

    /* renamed from: b */
    public static <E> boolean m20936b(InterfaceC45139mX2<E> interfaceC45139mX2, InterfaceC45139mX2<? extends E> interfaceC45139mX22) {
        if (interfaceC45139mX22 instanceof AbstractC5143M0) {
            return m20937a(interfaceC45139mX2, (AbstractC5143M0) interfaceC45139mX22);
        }
        if (interfaceC45139mX22.isEmpty()) {
            return false;
        }
        for (InterfaceC45139mX2.InterfaceC26111a<? extends E> interfaceC26111a : interfaceC45139mX22.entrySet()) {
            interfaceC45139mX2.mo20921H0(interfaceC26111a.getElement(), interfaceC26111a.getCount());
        }
        return true;
    }

    /* renamed from: c */
    public static <E> boolean m20935c(InterfaceC45139mX2<E> interfaceC45139mX2, Collection<? extends E> collection) {
        EZ3.m108801n(interfaceC45139mX2);
        EZ3.m108801n(collection);
        if (collection instanceof InterfaceC45139mX2) {
            return m20936b(interfaceC45139mX2, m20934d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C52933zg2.m597a(interfaceC45139mX2, collection.iterator());
    }

    /* renamed from: d */
    public static <T> InterfaceC45139mX2<T> m20934d(Iterable<T> iterable) {
        return (InterfaceC45139mX2) iterable;
    }

    /* renamed from: e */
    public static boolean m20933e(InterfaceC45139mX2<?> interfaceC45139mX2, Object obj) {
        if (obj == interfaceC45139mX2) {
            return true;
        }
        if (obj instanceof InterfaceC45139mX2) {
            InterfaceC45139mX2 interfaceC45139mX22 = (InterfaceC45139mX2) obj;
            if (interfaceC45139mX2.size() == interfaceC45139mX22.size() && interfaceC45139mX2.entrySet().size() == interfaceC45139mX22.entrySet().size()) {
                for (InterfaceC45139mX2.InterfaceC26111a interfaceC26111a : interfaceC45139mX22.entrySet()) {
                    if (interfaceC45139mX2.mo20918d3(interfaceC26111a.getElement()) != interfaceC26111a.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static <E> InterfaceC45139mX2<E> m20932f(InterfaceC45139mX2<E> interfaceC45139mX2, IZ3<? super E> iz3) {
        if (interfaceC45139mX2 instanceof C27000d) {
            C27000d c27000d = (C27000d) interfaceC45139mX2;
            return new C27000d(c27000d.f102115d, JZ3.m100201b(c27000d.f102116e, iz3));
        }
        return new C27000d(interfaceC45139mX2, iz3);
    }

    /* renamed from: g */
    public static <E> InterfaceC45139mX2.InterfaceC26111a<E> m20931g(E e, int i) {
        return new C27002e(e, i);
    }

    /* renamed from: h */
    public static <E> Iterator<E> m20930h(InterfaceC45139mX2<E> interfaceC45139mX2) {
        return new C27003f(interfaceC45139mX2, interfaceC45139mX2.entrySet().iterator());
    }

    /* renamed from: i */
    public static int m20929i(InterfaceC45139mX2<?> interfaceC45139mX2) {
        long j = 0;
        for (InterfaceC45139mX2.InterfaceC26111a<?> interfaceC26111a : interfaceC45139mX2.entrySet()) {
            j += interfaceC26111a.getCount();
        }
        return C41344g72.m39991b(j);
    }

    /* renamed from: j */
    public static boolean m20928j(InterfaceC45139mX2<?> interfaceC45139mX2, Collection<?> collection) {
        if (collection instanceof InterfaceC45139mX2) {
            collection = ((InterfaceC45139mX2) collection).mo25465F2();
        }
        return interfaceC45139mX2.mo25465F2().removeAll(collection);
    }

    /* renamed from: k */
    public static boolean m20927k(InterfaceC45139mX2<?> interfaceC45139mX2, Collection<?> collection) {
        EZ3.m108801n(collection);
        if (collection instanceof InterfaceC45139mX2) {
            collection = ((InterfaceC45139mX2) collection).mo25465F2();
        }
        return interfaceC45139mX2.mo25465F2().retainAll(collection);
    }

    /* renamed from: l */
    public static <E> int m20926l(InterfaceC45139mX2<E> interfaceC45139mX2, E e, int i) {
        C39948dm0.m43733b(i, "count");
        int mo20918d3 = interfaceC45139mX2.mo20918d3(e);
        int i2 = i - mo20918d3;
        if (i2 > 0) {
            interfaceC45139mX2.mo20921H0(e, i2);
        } else if (i2 < 0) {
            interfaceC45139mX2.mo20922A2(e, -i2);
        }
        return mo20918d3;
    }

    /* renamed from: m */
    public static <E> boolean m20925m(InterfaceC45139mX2<E> interfaceC45139mX2, E e, int i, int i2) {
        C39948dm0.m43733b(i, "oldCount");
        C39948dm0.m43733b(i2, "newCount");
        if (interfaceC45139mX2.mo20918d3(e) == i) {
            interfaceC45139mX2.mo25463Q1(e, i2);
            return true;
        }
        return false;
    }
}
