package p000;
/* renamed from: h67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41932h67 extends X57 {

    /* renamed from: f */
    public static final X57 f84709f = new C41932h67(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f84710d;

    /* renamed from: e */
    public final transient int f84711e;

    public C41932h67(Object[] objArr, int i) {
        this.f84710d = objArr;
        this.f84711e = i;
    }

    @Override // p000.X57, p000.T57
    /* renamed from: a */
    public final int mo36846a(Object[] objArr, int i) {
        System.arraycopy(this.f84710d, 0, objArr, 0, this.f84711e);
        return this.f84711e;
    }

    @Override // p000.T57
    /* renamed from: b */
    public final int mo36845b() {
        return this.f84711e;
    }

    @Override // p000.T57
    /* renamed from: c */
    public final int mo36844c() {
        return 0;
    }

    @Override // p000.T57
    /* renamed from: f */
    public final Object[] mo36843f() {
        return this.f84710d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        J57.m101169a(i, this.f84711e, "index");
        Object obj = this.f84710d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84711e;
    }
}
