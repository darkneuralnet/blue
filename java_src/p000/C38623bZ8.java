package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: bZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38623bZ8 extends AbstractList<String> implements InterfaceC41488gM8, RandomAccess {

    /* renamed from: b */
    public final InterfaceC41488gM8 f57700b;

    public C38623bZ8(InterfaceC41488gM8 interfaceC41488gM8) {
        this.f57700b = interfaceC41488gM8;
    }

    @Override // p000.InterfaceC41488gM8
    /* renamed from: X2 */
    public final void mo6977X2(AbstractC53119zy8 abstractC53119zy8) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC41488gM8
    /* renamed from: g */
    public final Object mo6975g(int i) {
        return this.f57700b.mo6975g(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f57700b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C38892c09(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new RY8(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57700b.size();
    }

    @Override // p000.InterfaceC41488gM8
    public final List<?> zzd() {
        return this.f57700b.zzd();
    }

    @Override // p000.InterfaceC41488gM8
    public final InterfaceC41488gM8 zze() {
        return this;
    }
}
