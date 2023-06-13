package p000;
/* renamed from: xN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51575xN7<E> extends AbstractC42089hN7<E> {

    /* renamed from: f */
    public static final AbstractC42089hN7<Object> f117539f = new C51575xN7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f117540d;

    /* renamed from: e */
    public final transient int f117541e;

    public C51575xN7(Object[] objArr, int i) {
        this.f117540d = objArr;
        this.f117541e = i;
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: b */
    public final Object[] mo5318b() {
        return this.f117540d;
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: c */
    public final int mo5317c() {
        return 0;
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: e */
    public final int mo5316e() {
        return this.f117541e;
    }

    @Override // java.util.List
    public final E get(int i) {
        C46222oL7.m21304a(i, this.f117541e, "index");
        return (E) this.f117540d[i];
    }

    @Override // p000.AbstractC43266jM7
    /* renamed from: h */
    public final boolean mo5315h() {
        return false;
    }

    @Override // p000.AbstractC42089hN7, p000.AbstractC43266jM7
    /* renamed from: j */
    public final int mo5314j(Object[] objArr, int i) {
        System.arraycopy(this.f117540d, 0, objArr, 0, this.f117541e);
        return this.f117541e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f117541e;
    }
}
