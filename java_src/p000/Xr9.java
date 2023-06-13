package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: Xr9 */
/* loaded from: classes6.dex */
public final class Xr9 extends AbstractList<String> implements RandomAccess, InterfaceC44127ko9 {

    /* renamed from: b */
    public final InterfaceC44127ko9 f44075b;

    public Xr9(InterfaceC44127ko9 interfaceC44127ko9) {
        this.f44075b = interfaceC44127ko9;
    }

    @Override // p000.InterfaceC44127ko9
    /* renamed from: P2 */
    public final void mo28435P2(AbstractC45836nh9 abstractC45836nh9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C41162fo9) this.f44075b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Vr9(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new Tr9(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44075b.size();
    }

    @Override // p000.InterfaceC44127ko9
    public final InterfaceC44127ko9 zze() {
        return this;
    }

    @Override // p000.InterfaceC44127ko9
    public final Object zzf(int i) {
        return this.f44075b.zzf(i);
    }

    @Override // p000.InterfaceC44127ko9
    public final List<?> zzh() {
        return this.f44075b.zzh();
    }
}
