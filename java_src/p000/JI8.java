package p000;

import java.util.Iterator;
/* renamed from: JI8 */
/* loaded from: classes5.dex */
public final class JI8 extends NH8 {

    /* renamed from: i */
    public static final Object[] f17332i;

    /* renamed from: j */
    public static final JI8 f17333j;

    /* renamed from: d */
    public final transient Object[] f17334d;

    /* renamed from: e */
    public final transient int f17335e;

    /* renamed from: f */
    public final transient Object[] f17336f;

    /* renamed from: g */
    public final transient int f17337g;

    /* renamed from: h */
    public final transient int f17338h;

    static {
        Object[] objArr = new Object[0];
        f17332i = objArr;
        f17333j = new JI8(objArr, 0, objArr, 0, 0);
    }

    public JI8(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f17334d = objArr;
        this.f17335e = i;
        this.f17336f = objArr2;
        this.f17337g = i2;
        this.f17338h = i3;
    }

    @Override // p000.ZF8
    /* renamed from: a */
    public final int mo5562a(Object[] objArr, int i) {
        System.arraycopy(this.f17334d, 0, objArr, 0, this.f17338h);
        return this.f17338h;
    }

    @Override // p000.ZF8
    /* renamed from: b */
    public final int mo5561b() {
        return this.f17338h;
    }

    @Override // p000.ZF8
    /* renamed from: c */
    public final int mo5560c() {
        return 0;
    }

    @Override // p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f17336f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m19694a = C46762pF8.m19694a(obj.hashCode());
        while (true) {
            int i = m19694a & this.f17337g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m19694a = i + 1;
        }
    }

    @Override // p000.NH8, p000.ZF8
    /* renamed from: e */
    public final AbstractC42054hJ8 mo73473e() {
        return m94084j().listIterator(0);
    }

    @Override // p000.ZF8
    /* renamed from: f */
    public final Object[] mo5559f() {
        return this.f17334d;
    }

    @Override // p000.NH8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17335e;
    }

    @Override // p000.NH8, p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return m94084j().listIterator(0);
    }

    @Override // p000.NH8
    /* renamed from: o */
    public final CH8 mo94083o() {
        return CH8.m112390j(this.f17334d, this.f17338h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17338h;
    }

    @Override // p000.NH8
    /* renamed from: u */
    public final boolean mo94081u() {
        return true;
    }
}
