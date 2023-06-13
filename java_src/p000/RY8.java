package p000;

import java.util.ListIterator;
/* renamed from: RY8 */
/* loaded from: classes6.dex */
public final class RY8 implements ListIterator<String> {

    /* renamed from: b */
    public ListIterator<String> f32205b;

    /* renamed from: c */
    public final /* synthetic */ int f32206c;

    /* renamed from: d */
    public final /* synthetic */ C38623bZ8 f32207d;

    public RY8(C38623bZ8 c38623bZ8, int i) {
        InterfaceC41488gM8 interfaceC41488gM8;
        this.f32207d = c38623bZ8;
        this.f32206c = i;
        interfaceC41488gM8 = c38623bZ8.f57700b;
        this.f32205b = interfaceC41488gM8.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f32205b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32205b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f32205b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32205b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f32205b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32205b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
