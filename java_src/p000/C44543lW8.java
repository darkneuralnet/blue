package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: lW8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44543lW8 extends AbstractC45127mV8 {

    /* renamed from: d */
    public final transient QU8 f96285d;

    /* renamed from: e */
    public final transient Object[] f96286e;

    /* renamed from: f */
    public final transient int f96287f;

    public C44543lW8(QU8 qu8, Object[] objArr, int i, int i2) {
        this.f96285d = qu8;
        this.f96286e = objArr;
        this.f96287f = i2;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: a */
    public final int mo5039a(Object[] objArr, int i) {
        return m25482j().mo5039a(objArr, 0);
    }

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f96285d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8
    /* renamed from: e */
    public final HX8 mo5038e() {
        return m25482j().listIterator(0);
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return m25482j().listIterator(0);
    }

    @Override // p000.AbstractC45127mV8
    /* renamed from: o */
    public final AbstractC50453vU8 mo25481o() {
        return new C38596bW8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f96287f;
    }
}
