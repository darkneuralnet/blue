package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000.C46325oX2;
import p000.InterfaceC45139mX2;
/* renamed from: Y0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9586Y0<E> extends AbstractCollection<E> implements InterfaceC45139mX2<E> {

    /* renamed from: b */
    public transient Set<E> f44409b;

    /* renamed from: c */
    public transient Set<InterfaceC45139mX2.InterfaceC26111a<E>> f44410c;

    /* renamed from: Y0$a */
    /* loaded from: classes6.dex */
    public class C9587a extends C46325oX2.AbstractC26998b<E> {
        public C9587a() {
        }

        @Override // p000.C46325oX2.AbstractC26998b
        /* renamed from: a */
        public InterfaceC45139mX2<E> mo20924a() {
            return AbstractC9586Y0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC9586Y0.this.mo20917e();
        }
    }

    /* renamed from: Y0$b */
    /* loaded from: classes6.dex */
    public class C9588b extends C46325oX2.AbstractC26999c<E> {
        public C9588b() {
        }

        @Override // p000.C46325oX2.AbstractC26999c
        /* renamed from: a */
        public InterfaceC45139mX2<E> mo20923a() {
            return AbstractC9586Y0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> iterator() {
            return AbstractC9586Y0.this.mo20916f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC9586Y0.this.mo20913c();
        }
    }

    /* renamed from: A2 */
    public int mo20922A2(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45139mX2
    /* renamed from: F2 */
    public Set<E> mo25465F2() {
        Set<E> set = this.f44409b;
        if (set == null) {
            Set<E> mo20920a = mo20920a();
            this.f44409b = mo20920a;
            return mo20920a;
        }
        return set;
    }

    /* renamed from: H0 */
    public int mo20921H0(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: P0 */
    public boolean mo25464P0(E e, int i, int i2) {
        return C46325oX2.m20925m(this, e, i, i2);
    }

    /* renamed from: Q1 */
    public int mo25463Q1(E e, int i) {
        return C46325oX2.m20926l(this, e, i);
    }

    /* renamed from: a */
    public Set<E> mo20920a() {
        return new C9587a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        mo20921H0(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return C46325oX2.m20935c(this, collection);
    }

    /* renamed from: b */
    public Set<InterfaceC45139mX2.InterfaceC26111a<E>> mo20919b() {
        return new C9588b();
    }

    /* renamed from: c */
    public abstract int mo20913c();

    @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
    public boolean contains(Object obj) {
        return mo20918d3(obj) > 0;
    }

    /* renamed from: e */
    public abstract Iterator<E> mo20917e();

    public Set<InterfaceC45139mX2.InterfaceC26111a<E>> entrySet() {
        Set<InterfaceC45139mX2.InterfaceC26111a<E>> set = this.f44410c;
        if (set == null) {
            Set<InterfaceC45139mX2.InterfaceC26111a<E>> mo20919b = mo20919b();
            this.f44410c = mo20919b;
            return mo20919b;
        }
        return set;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return C46325oX2.m20933e(this, obj);
    }

    /* renamed from: f */
    public abstract Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> mo20916f();

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
    public final boolean remove(Object obj) {
        return mo20922A2(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return C46325oX2.m20928j(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return C46325oX2.m20927k(this, collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
