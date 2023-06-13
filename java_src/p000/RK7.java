package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: RK7 */
/* loaded from: classes5.dex */
public final class RK7 extends AbstractC51942xz7 {

    /* renamed from: d */
    public final transient AbstractC50746vy7 f31904d;

    /* renamed from: e */
    public final transient Object[] f31905e;

    /* renamed from: f */
    public final transient int f31906f;

    public RK7(AbstractC50746vy7 abstractC50746vy7, Object[] objArr, int i, int i2) {
        this.f31904d = abstractC50746vy7;
        this.f31905e = objArr;
        this.f31906f = i2;
    }

    @Override // p000.AbstractC45944ns7
    /* renamed from: a */
    public final int mo22261a(Object[] objArr, int i) {
        return m4272h().mo22261a(objArr, 0);
    }

    @Override // p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f31904d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC51942xz7, p000.AbstractC45944ns7
    /* renamed from: e */
    public final ZM7 mo4273e() {
        return m4272h().listIterator(0);
    }

    @Override // p000.AbstractC51942xz7, p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m4272h().listIterator(0);
    }

    @Override // p000.AbstractC51942xz7
    /* renamed from: j */
    public final AbstractC38851bw7 mo4271j() {
        return new CK7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31906f;
    }
}
