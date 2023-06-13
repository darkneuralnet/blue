package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: cv9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39454cv9 extends Ao9 {

    /* renamed from: d */
    public final transient AbstractC47062pl9 f75876d;

    /* renamed from: e */
    public final transient Object[] f75877e;

    /* renamed from: f */
    public final transient int f75878f;

    public C39454cv9(AbstractC47062pl9 abstractC47062pl9, Object[] objArr, int i, int i2) {
        this.f75876d = abstractC47062pl9;
        this.f75877e = objArr;
        this.f75878f = i2;
    }

    @Override // p000.TT8
    /* renamed from: a */
    public final int mo24687a(Object[] objArr, int i) {
        return m115141h().mo24687a(objArr, 0);
    }

    @Override // p000.TT8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f75876d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.Ao9, p000.TT8
    /* renamed from: e */
    public final AbstractC49974ug7 mo24686e() {
        return m115141h().listIterator(0);
    }

    @Override // p000.Ao9, p000.TT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m115141h().listIterator(0);
    }

    @Override // p000.Ao9
    /* renamed from: j */
    public final Ed9 mo44813j() {
        return new Gt9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f75878f;
    }
}
