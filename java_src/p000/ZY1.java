package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p000.InterfaceC45139mX2;
/* renamed from: ZY1 */
/* loaded from: classes6.dex */
public abstract class ZY1<E> extends AbstractC38023aZ1<E> implements InterfaceC45139mX2<E> {

    /* renamed from: c */
    public transient VY1<E> f48741c;

    /* renamed from: d */
    public transient AbstractC38616bZ1<InterfaceC45139mX2.InterfaceC26111a<E>> f48742d;

    /* renamed from: ZY1$a */
    /* loaded from: classes6.dex */
    public class C10291a extends AbstractC48175re6<E> {

        /* renamed from: b */
        public int f48743b;

        /* renamed from: c */
        public E f48744c;

        /* renamed from: d */
        public final /* synthetic */ Iterator f48745d;

        public C10291a(ZY1 zy1, Iterator it) {
            this.f48745d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48743b > 0 || this.f48745d.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f48743b <= 0) {
                InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) this.f48745d.next();
                this.f48744c = (E) interfaceC26111a.getElement();
                this.f48743b = interfaceC26111a.getCount();
            }
            this.f48743b--;
            E e = this.f48744c;
            Objects.requireNonNull(e);
            return e;
        }
    }

    /* renamed from: ZY1$b */
    /* loaded from: classes6.dex */
    public final class C10292b extends AbstractC50178v12<InterfaceC45139mX2.InterfaceC26111a<E>> {
        private static final long serialVersionUID = 0;

        public C10292b() {
        }

        @Override // p000.AbstractC50178v12
        /* renamed from: H */
        public InterfaceC45139mX2.InterfaceC26111a<E> get(int i) {
            return ZY1.this.mo72966v(i);
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof InterfaceC45139mX2.InterfaceC26111a)) {
                return false;
            }
            InterfaceC45139mX2.InterfaceC26111a interfaceC26111a = (InterfaceC45139mX2.InterfaceC26111a) obj;
            if (interfaceC26111a.getCount() <= 0 || ZY1.this.mo20918d3(interfaceC26111a.getElement()) != interfaceC26111a.getCount()) {
                return false;
            }
            return true;
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return ZY1.this.mo9378h();
        }

        @Override // p000.AbstractC38616bZ1, java.util.Collection, java.util.Set
        public int hashCode() {
            return ZY1.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ZY1.this.mo25465F2().size();
        }

        @Override // p000.AbstractC38616bZ1, p000.QY1
        public Object writeReplace() {
            return new C10293c(ZY1.this);
        }

        public /* synthetic */ C10292b(ZY1 zy1, C10291a c10291a) {
            this();
        }
    }

    /* renamed from: ZY1$c */
    /* loaded from: classes6.dex */
    public static class C10293c<E> implements Serializable {

        /* renamed from: b */
        public final ZY1<E> f48747b;

        public C10293c(ZY1<E> zy1) {
            this.f48747b = zy1;
        }

        public Object readResolve() {
            return this.f48747b.entrySet();
        }
    }

    @Override // p000.InterfaceC45139mX2
    @Deprecated
    /* renamed from: A2 */
    public final int mo20922A2(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45139mX2
    @Deprecated
    /* renamed from: H0 */
    public final int mo20921H0(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45139mX2
    @Deprecated
    /* renamed from: P0 */
    public final boolean mo25464P0(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45139mX2
    @Deprecated
    /* renamed from: Q1 */
    public final int mo25463Q1(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.QY1
    /* renamed from: a */
    public VY1<E> mo10675a() {
        VY1<E> vy1 = this.f48741c;
        if (vy1 == null) {
            VY1<E> mo10675a = super.mo10675a();
            this.f48741c = mo10675a;
            return mo10675a;
        }
        return vy1;
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        AbstractC48175re6<InterfaceC45139mX2.InterfaceC26111a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC45139mX2.InterfaceC26111a<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return mo20918d3(obj) > 0;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return C46325oX2.m20933e(this, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return C40052dw5.m43491d(entrySet());
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return new C10291a(this, entrySet().iterator());
    }

    /* renamed from: o */
    public final AbstractC38616bZ1<InterfaceC45139mX2.InterfaceC26111a<E>> m72969o() {
        return isEmpty() ? AbstractC38616bZ1.m64368A() : new C10292b(this, null);
    }

    @Override // p000.InterfaceC45139mX2
    /* renamed from: s */
    public abstract AbstractC38616bZ1<E> mo25465F2();

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // p000.InterfaceC45139mX2
    /* renamed from: u */
    public AbstractC38616bZ1<InterfaceC45139mX2.InterfaceC26111a<E>> entrySet() {
        AbstractC38616bZ1<InterfaceC45139mX2.InterfaceC26111a<E>> abstractC38616bZ1 = this.f48742d;
        if (abstractC38616bZ1 == null) {
            AbstractC38616bZ1<InterfaceC45139mX2.InterfaceC26111a<E>> m72969o = m72969o();
            this.f48742d = m72969o;
            return m72969o;
        }
        return abstractC38616bZ1;
    }

    /* renamed from: v */
    public abstract InterfaceC45139mX2.InterfaceC26111a<E> mo72966v(int i);

    @Override // p000.QY1
    public abstract Object writeReplace();
}
