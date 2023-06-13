package p000;

import java.util.Objects;
/* renamed from: Pt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35298Pt4<E> extends VY1<E> {

    /* renamed from: f */
    public static final VY1<Object> f29352f = new C35298Pt4(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f29353d;

    /* renamed from: e */
    public final transient int f29354e;

    public C35298Pt4(Object[] objArr, int i) {
        this.f29353d = objArr;
        this.f29354e = i;
    }

    @Override // p000.VY1, p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        System.arraycopy(this.f29353d, 0, objArr, i, this.f29354e);
        return i + this.f29354e;
    }

    @Override // p000.QY1
    /* renamed from: c */
    public Object[] mo79758c() {
        return this.f29353d;
    }

    @Override // p000.QY1
    /* renamed from: e */
    public int mo79757e() {
        return this.f29354e;
    }

    @Override // p000.QY1
    /* renamed from: f */
    public int mo79756f() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i) {
        EZ3.m108803l(i, this.f29354e);
        E e = (E) this.f29353d[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // p000.QY1
    /* renamed from: h */
    public boolean mo9378h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29354e;
    }
}
