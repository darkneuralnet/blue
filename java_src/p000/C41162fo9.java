package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: fo9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41162fo9 extends AbstractC44037kf9<String> implements RandomAccess, InterfaceC44127ko9 {

    /* renamed from: d */
    public static final C41162fo9 f80745d;

    /* renamed from: e */
    public static final InterfaceC44127ko9 f80746e;

    /* renamed from: c */
    public final List<Object> f80747c;

    static {
        C41162fo9 c41162fo9 = new C41162fo9(10);
        f80745d = c41162fo9;
        c41162fo9.zzb();
        f80746e = c41162fo9;
    }

    public C41162fo9() {
        this(10);
    }

    /* renamed from: c */
    public static String m40795c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC45836nh9) {
            return ((AbstractC45836nh9) obj).m23302C(Fn9.f10238a);
        }
        return Fn9.m106447h((byte[]) obj);
    }

    @Override // p000.InterfaceC44127ko9
    /* renamed from: P2 */
    public final void mo28435P2(AbstractC45836nh9 abstractC45836nh9) {
        m28655a();
        this.f80747c.add(abstractC45836nh9);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m28655a();
        this.f80747c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m28655a();
        if (collection instanceof InterfaceC44127ko9) {
            collection = ((InterfaceC44127ko9) collection).zzh();
        }
        boolean addAll = this.f80747c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f80747c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC45836nh9) {
            AbstractC45836nh9 abstractC45836nh9 = (AbstractC45836nh9) obj;
            String m23302C = abstractC45836nh9.m23302C(Fn9.f10238a);
            if (abstractC45836nh9.mo23296s()) {
                this.f80747c.set(i, m23302C);
            }
            return m23302C;
        }
        byte[] bArr = (byte[]) obj;
        String m106447h = Fn9.m106447h(bArr);
        if (Fn9.m106445j(bArr)) {
            this.f80747c.set(i, m106447h);
        }
        return m106447h;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m28655a();
        this.f80747c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.An9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ An9 mo16911d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f80747c);
            return new C41162fo9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m28655a();
        Object remove = this.f80747c.remove(i);
        ((AbstractList) this).modCount++;
        return m40795c(remove);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m28655a();
        return m40795c(this.f80747c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80747c.size();
    }

    @Override // p000.InterfaceC44127ko9
    public final InterfaceC44127ko9 zze() {
        if (zzc()) {
            return new Xr9(this);
        }
        return this;
    }

    @Override // p000.InterfaceC44127ko9
    public final Object zzf(int i) {
        return this.f80747c.get(i);
    }

    @Override // p000.InterfaceC44127ko9
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f80747c);
    }

    public C41162fo9(int i) {
        this.f80747c = new ArrayList(i);
    }

    public C41162fo9(ArrayList<Object> arrayList) {
        this.f80747c = arrayList;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
