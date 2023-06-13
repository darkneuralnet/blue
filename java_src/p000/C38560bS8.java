package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: bS8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38560bS8<K, V> extends RQ8<Map.Entry<K, V>> {

    /* renamed from: d */
    public final transient AbstractC50417vQ8<K, V> f57512d;

    /* renamed from: e */
    public final transient Object[] f57513e;

    /* renamed from: f */
    public final transient int f57514f;

    public C38560bS8(AbstractC50417vQ8<K, V> abstractC50417vQ8, Object[] objArr, int i, int i2) {
        this.f57512d = abstractC50417vQ8;
        this.f57513e = objArr;
        this.f57514f = i2;
    }

    @Override // p000.XO8
    /* renamed from: a */
    public final int mo21022a(Object[] objArr, int i) {
        return mo25571e().mo21022a(objArr, 0);
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f57512d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.RQ8, p000.XO8
    /* renamed from: f */
    public final AbstractC38578bU8<Map.Entry<K, V>> mo21021f() {
        return mo25571e().listIterator(0);
    }

    @Override // p000.RQ8, p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return mo25571e().listIterator(0);
    }

    @Override // p000.RQ8
    /* renamed from: s */
    public final ZP8<Map.Entry<K, V>> mo21020s() {
        return new QR8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f57514f;
    }
}
