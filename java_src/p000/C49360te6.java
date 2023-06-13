package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: te6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49360te6 extends AbstractList<String> implements InterfaceC35251Po2, RandomAccess {

    /* renamed from: b */
    public final InterfaceC35251Po2 f110830b;

    /* renamed from: te6$a */
    /* loaded from: classes6.dex */
    public class C28795a implements ListIterator<String> {

        /* renamed from: b */
        public ListIterator<String> f110831b;

        /* renamed from: c */
        public final /* synthetic */ int f110832c;

        public C28795a(int i) {
            this.f110832c = i;
            this.f110831b = C49360te6.this.f110830b.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f110831b.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f110831b.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f110831b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f110831b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f110831b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f110831b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: te6$b */
    /* loaded from: classes6.dex */
    public class C28796b implements Iterator<String> {

        /* renamed from: b */
        public Iterator<String> f110834b;

        public C28796b() {
            this.f110834b = C49360te6.this.f110830b.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f110834b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f110834b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C49360te6(InterfaceC35251Po2 interfaceC35251Po2) {
        this.f110830b = interfaceC35251Po2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public String get(int i) {
        return (String) this.f110830b.get(i);
    }

    @Override // p000.InterfaceC35251Po2
    public List<?> getUnderlyingElements() {
        return this.f110830b.getUnderlyingElements();
    }

    @Override // p000.InterfaceC35251Po2
    public InterfaceC35251Po2 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C28796b();
    }

    @Override // p000.InterfaceC35251Po2
    /* renamed from: l */
    public Object mo11974l(int i) {
        return this.f110830b.mo11974l(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C28795a(i);
    }

    @Override // p000.InterfaceC35251Po2
    /* renamed from: q1 */
    public void mo11973q1(AbstractC18199g abstractC18199g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f110830b.size();
    }
}
