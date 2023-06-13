package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: iX8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42773iX8 extends AbstractC39081cK8 implements RandomAccess, InterfaceC48702sX8 {

    /* renamed from: d */
    public static final C42773iX8 f87457d;
    @Deprecated

    /* renamed from: e */
    public static final InterfaceC48702sX8 f87458e;

    /* renamed from: c */
    public final List f87459c;

    static {
        C42773iX8 c42773iX8 = new C42773iX8(false);
        f87457d = c42773iX8;
        f87458e = c42773iX8;
    }

    public C42773iX8() {
        this(10);
    }

    /* renamed from: c */
    public static String m33829c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC40913fO8) {
            return ((AbstractC40913fO8) obj).m41428w(XV8.f43342b);
        }
        return XV8.m76916d((byte[]) obj);
    }

    @Override // p000.InterfaceC48702sX8
    /* renamed from: I0 */
    public final void mo14059I0(AbstractC40913fO8 abstractC40913fO8) {
        m61580a();
        this.f87459c.add(abstractC40913fO8);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m61580a();
        this.f87459c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m61580a();
        if (collection instanceof InterfaceC48702sX8) {
            collection = ((InterfaceC48702sX8) collection).zzh();
        }
        boolean addAll = this.f87459c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f87459c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC40913fO8) {
            AbstractC40913fO8 abstractC40913fO8 = (AbstractC40913fO8) obj;
            String m41428w = abstractC40913fO8.m41428w(XV8.f43342b);
            if (abstractC40913fO8.mo41432o()) {
                this.f87459c.set(i, m41428w);
            }
            return m41428w;
        }
        byte[] bArr = (byte[]) obj;
        String m76916d = XV8.m76916d(bArr);
        if (Z89.m73652d(bArr)) {
            this.f87459c.set(i, m76916d);
        }
        return m76916d;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m61580a();
        this.f87459c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.NV8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ NV8 mo21037d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f87459c);
            return new C42773iX8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m61580a();
        Object remove = this.f87459c.remove(i);
        ((AbstractList) this).modCount++;
        return m33829c(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m61580a();
        return m33829c(this.f87459c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f87459c.size();
    }

    @Override // p000.InterfaceC48702sX8
    public final InterfaceC48702sX8 zze() {
        return zzc() ? new B79(this) : this;
    }

    @Override // p000.InterfaceC48702sX8
    public final Object zzf(int i) {
        return this.f87459c.get(i);
    }

    @Override // p000.InterfaceC48702sX8
    public final List zzh() {
        return Collections.unmodifiableList(this.f87459c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42773iX8(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f87459c = arrayList;
    }

    public C42773iX8(ArrayList arrayList) {
        super(true);
        this.f87459c = arrayList;
    }

    public C42773iX8(boolean z) {
        super(false);
        this.f87459c = Collections.emptyList();
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
