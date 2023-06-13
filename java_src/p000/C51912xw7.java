package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: xw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51912xw7 extends AbstractList implements RandomAccess, InterfaceC35076Ou7 {

    /* renamed from: b */
    public final InterfaceC35076Ou7 f118390b;

    public C51912xw7(InterfaceC35076Ou7 interfaceC35076Ou7) {
        this.f118390b = interfaceC35076Ou7;
    }

    @Override // p000.InterfaceC35076Ou7
    /* renamed from: H2 */
    public final void mo4416H2(AbstractC44175kt7 abstractC44175kt7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C34842Nu7) this.f118390b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C51319ww7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C50726vw7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f118390b.size();
    }

    @Override // p000.InterfaceC35076Ou7
    public final InterfaceC35076Ou7 zze() {
        return this;
    }

    @Override // p000.InterfaceC35076Ou7
    public final Object zzf(int i) {
        return this.f118390b.zzf(i);
    }

    @Override // p000.InterfaceC35076Ou7
    public final List zzh() {
        return this.f118390b.zzh();
    }
}
