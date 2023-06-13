package p000;

import java.util.Iterator;
/* renamed from: dX8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39809dX8 extends AbstractC45127mV8 {

    /* renamed from: i */
    public static final Object[] f76750i;

    /* renamed from: j */
    public static final C39809dX8 f76751j;

    /* renamed from: d */
    public final transient Object[] f76752d;

    /* renamed from: e */
    public final transient int f76753e;

    /* renamed from: f */
    public final transient Object[] f76754f;

    /* renamed from: g */
    public final transient int f76755g;

    /* renamed from: h */
    public final transient int f76756h;

    static {
        Object[] objArr = new Object[0];
        f76750i = objArr;
        f76751j = new C39809dX8(objArr, 0, objArr, 0, 0);
    }

    public C39809dX8(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f76752d = objArr;
        this.f76753e = i;
        this.f76754f = objArr2;
        this.f76755g = i2;
        this.f76756h = i3;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: a */
    public final int mo5039a(Object[] objArr, int i) {
        System.arraycopy(this.f76752d, 0, objArr, 0, this.f76756h);
        return this.f76756h;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: b */
    public final int mo28915b() {
        return this.f76756h;
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: c */
    public final int mo28914c() {
        return 0;
    }

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f76754f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m12307a = C49250tS8.m12307a(obj.hashCode());
        while (true) {
            int i = m12307a & this.f76755g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m12307a = i + 1;
        }
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8
    /* renamed from: e */
    public final HX8 mo5038e() {
        return m25482j().listIterator(0);
    }

    @Override // p000.AbstractC37976aT8
    /* renamed from: f */
    public final Object[] mo28913f() {
        return this.f76752d;
    }

    @Override // p000.AbstractC45127mV8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f76753e;
    }

    @Override // p000.AbstractC45127mV8, p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return m25482j().listIterator(0);
    }

    @Override // p000.AbstractC45127mV8
    /* renamed from: o */
    public final AbstractC50453vU8 mo25481o() {
        return AbstractC50453vU8.m8606o(this.f76752d, this.f76756h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f76756h;
    }

    @Override // p000.AbstractC45127mV8
    /* renamed from: v */
    public final boolean mo25478v() {
        return true;
    }
}
