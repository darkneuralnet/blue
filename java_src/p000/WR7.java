package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: WR7 */
/* loaded from: classes5.dex */
public final class WR7 extends FM7 {

    /* renamed from: d */
    public final transient AbstractC46231oM7 f41022d;

    /* renamed from: e */
    public final transient Object[] f41023e;

    /* renamed from: f */
    public final transient int f41024f;

    public WR7(AbstractC46231oM7 abstractC46231oM7, Object[] objArr, int i, int i2) {
        this.f41022d = abstractC46231oM7;
        this.f41023e = objArr;
        this.f41024f = i2;
    }

    @Override // p000.BJ7
    /* renamed from: a */
    public final int mo15942a(Object[] objArr, int i) {
        return m107274h().mo15942a(objArr, 0);
    }

    @Override // p000.BJ7, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41022d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.FM7, p000.BJ7
    /* renamed from: e */
    public final ST7 mo27266e() {
        return m107274h().listIterator(0);
    }

    @Override // p000.FM7, p000.BJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return m107274h().listIterator(0);
    }

    @Override // p000.FM7
    /* renamed from: j */
    public final HL7 mo78437j() {
        return new GR7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41024f;
    }
}
