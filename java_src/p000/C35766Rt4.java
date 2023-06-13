package p000;
/* renamed from: Rt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35766Rt4<E> extends AbstractC38616bZ1<E> {

    /* renamed from: i */
    public static final Object[] f32797i;

    /* renamed from: j */
    public static final C35766Rt4<Object> f32798j;

    /* renamed from: d */
    public final transient Object[] f32799d;

    /* renamed from: e */
    public final transient int f32800e;

    /* renamed from: f */
    public final transient Object[] f32801f;

    /* renamed from: g */
    public final transient int f32802g;

    /* renamed from: h */
    public final transient int f32803h;

    static {
        Object[] objArr = new Object[0];
        f32797i = objArr;
        f32798j = new C35766Rt4<>(objArr, 0, objArr, 0, 0);
    }

    public C35766Rt4(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f32799d = objArr;
        this.f32800e = i;
        this.f32801f = objArr2;
        this.f32802g = i2;
        this.f32803h = i3;
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        System.arraycopy(this.f32799d, 0, objArr, i, this.f32803h);
        return i + this.f32803h;
    }

    @Override // p000.QY1
    /* renamed from: c */
    public Object[] mo79758c() {
        return this.f32799d;
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f32801f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m7051c = C50922wH1.m7051c(obj);
        while (true) {
            int i = m7051c & this.f32802g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m7051c = i + 1;
        }
    }

    @Override // p000.QY1
    /* renamed from: e */
    public int mo79757e() {
        return this.f32803h;
    }

    @Override // p000.QY1
    /* renamed from: f */
    public int mo79756f() {
        return 0;
    }

    @Override // p000.QY1
    /* renamed from: h */
    public boolean mo9378h() {
        return false;
    }

    @Override // p000.AbstractC38616bZ1, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f32800e;
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return mo10675a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f32803h;
    }

    @Override // p000.AbstractC38616bZ1
    /* renamed from: y */
    public VY1<E> mo9379y() {
        return VY1.m79772s(this.f32799d, this.f32803h);
    }

    @Override // p000.AbstractC38616bZ1
    /* renamed from: z */
    public boolean mo64357z() {
        return true;
    }
}
