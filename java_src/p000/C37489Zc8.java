package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Zc8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37489Zc8 extends AbstractC40966fU7 implements RandomAccess, InterfaceC42830id8 {

    /* renamed from: d */
    public static final C37489Zc8 f48838d;
    @Deprecated

    /* renamed from: e */
    public static final InterfaceC42830id8 f48839e;

    /* renamed from: c */
    public final List f48840c;

    static {
        C37489Zc8 c37489Zc8 = new C37489Zc8(false);
        f48838d = c37489Zc8;
        f48839e = c37489Zc8;
    }

    public C37489Zc8() {
        this(10);
    }

    /* renamed from: c */
    public static String m72848c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC41604gZ7) {
            return ((AbstractC41604gZ7) obj).m39164E(C32791Fa8.f9737b);
        }
        return C32791Fa8.m106925d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m41291a();
        this.f48840c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m41291a();
        if (collection instanceof InterfaceC42830id8) {
            collection = ((InterfaceC42830id8) collection).zzh();
        }
        boolean addAll = this.f48840c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f48840c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC41604gZ7) {
            AbstractC41604gZ7 abstractC41604gZ7 = (AbstractC41604gZ7) obj;
            String m39164E = abstractC41604gZ7.m39164E(C32791Fa8.f9737b);
            if (abstractC41604gZ7.mo15335x()) {
                this.f48840c.set(i, m39164E);
            }
            return m39164E;
        }
        byte[] bArr = (byte[]) obj;
        String m106925d = C32791Fa8.m106925d(bArr);
        if (C43623jx8.m29596g(bArr)) {
            this.f48840c.set(i, m106925d);
        }
        return m106925d;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m41291a();
        this.f48840c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f48840c);
            return new C37489Zc8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m41291a();
        Object remove = this.f48840c.remove(i);
        ((AbstractList) this).modCount++;
        return m72848c(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m41291a();
        return m72848c(this.f48840c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48840c.size();
    }

    @Override // p000.InterfaceC42830id8
    public final InterfaceC42830id8 zze() {
        return zzc() ? new C33673Iu8(this) : this;
    }

    @Override // p000.InterfaceC42830id8
    public final Object zzf(int i) {
        return this.f48840c.get(i);
    }

    @Override // p000.InterfaceC42830id8
    public final List zzh() {
        return Collections.unmodifiableList(this.f48840c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37489Zc8(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f48840c = arrayList;
    }

    public C37489Zc8(ArrayList arrayList) {
        super(true);
        this.f48840c = arrayList;
    }

    public C37489Zc8(boolean z) {
        super(false);
        this.f48840c = Collections.emptyList();
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
