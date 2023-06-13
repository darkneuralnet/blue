package p000;

import java.util.Iterator;
/* renamed from: SS8 */
/* loaded from: classes6.dex */
public final class SS8<E> extends RQ8<E> {

    /* renamed from: i */
    public static final Object[] f33758i;

    /* renamed from: j */
    public static final SS8<Object> f33759j;

    /* renamed from: d */
    public final transient Object[] f33760d;

    /* renamed from: e */
    public final transient int f33761e;

    /* renamed from: f */
    public final transient Object[] f33762f;

    /* renamed from: g */
    public final transient int f33763g;

    /* renamed from: h */
    public final transient int f33764h;

    static {
        Object[] objArr = new Object[0];
        f33758i = objArr;
        f33759j = new SS8<>(objArr, 0, objArr, 0, 0);
    }

    public SS8(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f33760d = objArr;
        this.f33761e = i;
        this.f33762f = objArr2;
        this.f33763g = i2;
        this.f33764h = i3;
    }

    @Override // p000.XO8
    /* renamed from: a */
    public final int mo21022a(Object[] objArr, int i) {
        System.arraycopy(this.f33760d, 0, objArr, 0, this.f33764h);
        return this.f33764h;
    }

    @Override // p000.XO8
    /* renamed from: b */
    public final int mo77028b() {
        return this.f33764h;
    }

    @Override // p000.XO8
    /* renamed from: c */
    public final int mo77027c() {
        return 0;
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f33762f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m17542a = C47436qO8.m17542a(obj.hashCode());
        while (true) {
            int i = m17542a & this.f33763g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m17542a = i + 1;
        }
    }

    @Override // p000.RQ8, p000.XO8
    /* renamed from: f */
    public final AbstractC38578bU8<E> mo21021f() {
        return mo25571e().listIterator(0);
    }

    @Override // p000.RQ8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33761e;
    }

    @Override // p000.RQ8, p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return mo25571e().listIterator(0);
    }

    @Override // p000.XO8
    /* renamed from: j */
    public final Object[] mo77026j() {
        return this.f33760d;
    }

    @Override // p000.RQ8
    /* renamed from: s */
    public final ZP8<E> mo21020s() {
        return ZP8.m73200w(this.f33760d, this.f33764h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33764h;
    }

    @Override // p000.RQ8
    /* renamed from: x */
    public final boolean mo21019x() {
        return true;
    }
}
