package p000;
/* renamed from: rz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48385rz7 extends AbstractC32268Cu7 {

    /* renamed from: f */
    public static final AbstractC32268Cu7 f108099f = new C48385rz7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f108100d;

    /* renamed from: e */
    public final transient int f108101e;

    public C48385rz7(Object[] objArr, int i) {
        this.f108100d = objArr;
        this.f108101e = i;
    }

    @Override // p000.AbstractC32268Cu7, p000.AbstractC48306rr7
    /* renamed from: a */
    public final int mo14906a(Object[] objArr, int i) {
        System.arraycopy(this.f108100d, 0, objArr, 0, this.f108101e);
        return this.f108101e;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: b */
    public final int mo14905b() {
        return this.f108101e;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: c */
    public final int mo14904c() {
        return 0;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: f */
    public final Object[] mo14903f() {
        return this.f108100d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C49421tk7.m11818a(i, this.f108101e, "index");
        Object obj = this.f108100d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108101e;
    }
}
