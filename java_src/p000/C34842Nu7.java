package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Nu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34842Nu7 extends AbstractC31782As7 implements RandomAccess, InterfaceC35076Ou7 {

    /* renamed from: d */
    public static final C34842Nu7 f25367d;

    /* renamed from: e */
    public static final InterfaceC35076Ou7 f25368e;

    /* renamed from: c */
    public final List f25369c;

    static {
        C34842Nu7 c34842Nu7 = new C34842Nu7(10);
        f25367d = c34842Nu7;
        c34842Nu7.zzb();
        f25368e = c34842Nu7;
    }

    public C34842Nu7() {
        this(10);
    }

    /* renamed from: c */
    public static String m93196c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC44175kt7) {
            return ((AbstractC44175kt7) obj).m28223I(C46557ou7.f102752b);
        }
        return C46557ou7.m20290h((byte[]) obj);
    }

    @Override // p000.InterfaceC35076Ou7
    /* renamed from: H2 */
    public final void mo4416H2(AbstractC44175kt7 abstractC44175kt7) {
        m114986a();
        this.f25369c.add(abstractC44175kt7);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m114986a();
        this.f25369c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m114986a();
        if (collection instanceof InterfaceC35076Ou7) {
            collection = ((InterfaceC35076Ou7) collection).zzh();
        }
        boolean addAll = this.f25369c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f25369c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC44175kt7) {
            AbstractC44175kt7 abstractC44175kt7 = (AbstractC44175kt7) obj;
            String m28223I = abstractC44175kt7.m28223I(C46557ou7.f102752b);
            if (abstractC44175kt7.mo28208x()) {
                this.f25369c.set(i, m28223I);
            }
            return m28223I;
        }
        byte[] bArr = (byte[]) obj;
        String m20290h = C46557ou7.m20290h(bArr);
        if (C46557ou7.m20288j(bArr)) {
            this.f25369c.set(i, m20290h);
        }
        return m20290h;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m114986a();
        this.f25369c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f25369c);
            return new C34842Nu7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m114986a();
        Object remove = this.f25369c.remove(i);
        ((AbstractList) this).modCount++;
        return m93196c(remove);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m114986a();
        return m93196c(this.f25369c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25369c.size();
    }

    @Override // p000.InterfaceC35076Ou7
    public final InterfaceC35076Ou7 zze() {
        return zzc() ? new C51912xw7(this) : this;
    }

    @Override // p000.InterfaceC35076Ou7
    public final Object zzf(int i) {
        return this.f25369c.get(i);
    }

    @Override // p000.InterfaceC35076Ou7
    public final List zzh() {
        return Collections.unmodifiableList(this.f25369c);
    }

    public C34842Nu7(int i) {
        this.f25369c = new ArrayList(i);
    }

    public C34842Nu7(ArrayList arrayList) {
        this.f25369c = arrayList;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
