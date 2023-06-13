package p000;

import com.google.protobuf.AbstractC18504e;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: se6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48767se6 extends AbstractList<String> implements InterfaceC35017Oo2, RandomAccess {

    /* renamed from: b */
    public final InterfaceC35017Oo2 f109067b;

    /* renamed from: se6$a */
    /* loaded from: classes6.dex */
    public class C28364a implements ListIterator<String> {

        /* renamed from: b */
        public ListIterator<String> f109068b;

        /* renamed from: c */
        public final /* synthetic */ int f109069c;

        public C28364a(int i) {
            this.f109069c = i;
            this.f109068b = C48767se6.this.f109067b.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f109068b.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f109068b.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f109068b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f109068b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f109068b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f109068b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: se6$b */
    /* loaded from: classes6.dex */
    public class C28365b implements Iterator<String> {

        /* renamed from: b */
        public Iterator<String> f109071b;

        public C28365b() {
            this.f109071b = C48767se6.this.f109067b.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f109071b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f109071b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C48767se6(InterfaceC35017Oo2 interfaceC35017Oo2) {
        this.f109067b = interfaceC35017Oo2;
    }

    @Override // p000.InterfaceC35017Oo2
    /* renamed from: P */
    public void mo13910P(AbstractC18504e abstractC18504e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public String get(int i) {
        return (String) this.f109067b.get(i);
    }

    @Override // p000.InterfaceC35017Oo2
    public List<?> getUnderlyingElements() {
        return this.f109067b.getUnderlyingElements();
    }

    @Override // p000.InterfaceC35017Oo2
    public InterfaceC35017Oo2 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C28365b();
    }

    @Override // p000.InterfaceC35017Oo2
    /* renamed from: l */
    public Object mo13907l(int i) {
        return this.f109067b.mo13907l(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C28364a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f109067b.size();
    }
}
