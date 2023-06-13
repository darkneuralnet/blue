package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: wL8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50965wL8 extends AbstractC41834gw8<String> implements InterfaceC41488gM8, RandomAccess {

    /* renamed from: d */
    public static final C50965wL8 f115858d;

    /* renamed from: e */
    public static final InterfaceC41488gM8 f115859e;

    /* renamed from: c */
    public final List<Object> f115860c;

    static {
        C50965wL8 c50965wL8 = new C50965wL8();
        f115858d = c50965wL8;
        c50965wL8.zzb();
        f115859e = c50965wL8;
    }

    public C50965wL8() {
        this(10);
    }

    /* renamed from: b */
    public static String m6976b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC53119zy8) {
            return ((AbstractC53119zy8) obj).m31z();
        }
        return C52124yI8.m3686i((byte[]) obj);
    }

    @Override // p000.InterfaceC41488gM8
    /* renamed from: X2 */
    public final void mo6977X2(AbstractC53119zy8 abstractC53119zy8) {
        m37302a();
        this.f115860c.add(abstractC53119zy8);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m37302a();
        this.f115860c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m37302a();
        this.f115860c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p000.InterfaceC41488gM8
    /* renamed from: g */
    public final Object mo6975g(int i) {
        return this.f115860c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f115860c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC53119zy8) {
            AbstractC53119zy8 abstractC53119zy8 = (AbstractC53119zy8) obj;
            String m31z = abstractC53119zy8.m31z();
            if (abstractC53119zy8.zzc()) {
                this.f115860c.set(i, m31z);
            }
            return m31z;
        }
        byte[] bArr = (byte[]) obj;
        String m3686i = C52124yI8.m3686i(bArr);
        if (C52124yI8.m3687h(bArr)) {
            this.f115860c.set(i, m3686i);
        }
        return m3686i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m37302a();
        return m6976b(this.f115860c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f115860c.size();
    }

    @Override // p000.AbstractC41834gw8, p000.RJ8
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    @Override // p000.InterfaceC41488gM8
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.f115860c);
    }

    @Override // p000.InterfaceC41488gM8
    public final InterfaceC41488gM8 zze() {
        if (zza()) {
            return new C38623bZ8(this);
        }
        return this;
    }

    public C50965wL8(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m37302a();
        if (collection instanceof InterfaceC41488gM8) {
            collection = ((InterfaceC41488gM8) collection).zzd();
        }
        boolean addAll = this.f115860c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m37302a();
        Object remove = this.f115860c.remove(i);
        ((AbstractList) this).modCount++;
        return m6976b(remove);
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f115860c);
            return new C50965wL8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C50965wL8(ArrayList<Object> arrayList) {
        this.f115860c = arrayList;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
