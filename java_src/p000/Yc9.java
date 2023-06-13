package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Yc9 */
/* loaded from: classes5.dex */
public final class Yc9 extends S39 implements RandomAccess, Id9 {

    /* renamed from: d */
    public static final Yc9 f46079d;

    /* renamed from: e */
    public static final Id9 f46080e;

    /* renamed from: c */
    public final List f46081c;

    static {
        Yc9 yc9 = new Yc9(10);
        f46079d = yc9;
        yc9.zzb();
        f46080e = yc9;
    }

    public Yc9() {
        this(10);
    }

    /* renamed from: c */
    public static String m74806c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof T69) {
            return ((T69) obj).m84301x(C44007kc9.f94654b);
        }
        return C44007kc9.m28732h((byte[]) obj);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m86050a();
        this.f46081c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m86050a();
        if (collection instanceof Id9) {
            collection = ((Id9) collection).zzh();
        }
        boolean addAll = this.f46081c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f46081c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof T69) {
            T69 t69 = (T69) obj;
            String m84301x = t69.m84301x(C44007kc9.f94654b);
            if (t69.mo7397o()) {
                this.f46081c.set(i, m84301x);
            }
            return m84301x;
        }
        byte[] bArr = (byte[]) obj;
        String m28732h = C44007kc9.m28732h(bArr);
        if (C44007kc9.m28730j(bArr)) {
            this.f46081c.set(i, m28732h);
        }
        return m28732h;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m86050a();
        this.f46081c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46081c);
            return new Yc9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m86050a();
        Object remove = this.f46081c.remove(i);
        ((AbstractList) this).modCount++;
        return m74806c(remove);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m86050a();
        return m74806c(this.f46081c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46081c.size();
    }

    @Override // p000.Id9
    public final Id9 zze() {
        return zzc() ? new Sl9(this) : this;
    }

    @Override // p000.Id9
    public final Object zzf(int i) {
        return this.f46081c.get(i);
    }

    @Override // p000.Id9
    public final List zzh() {
        return Collections.unmodifiableList(this.f46081c);
    }

    public Yc9(int i) {
        this.f46081c = new ArrayList(i);
    }

    public Yc9(ArrayList arrayList) {
        this.f46081c = arrayList;
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
