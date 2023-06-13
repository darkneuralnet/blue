package p000;

import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: bn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38761bn7 extends AbstractC44688ll7 {

    /* renamed from: f */
    public static final AbstractC44688ll7 f58184f = new C38761bn7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f58185d;

    /* renamed from: e */
    public final transient int f58186e;

    public C38761bn7(Object[] objArr, int i) {
        this.f58185d = objArr;
        this.f58186e = i;
    }

    @Override // p000.AbstractC44688ll7, p000.AbstractC33087Gh7
    /* renamed from: a */
    public final int mo26865a(Object[] objArr, int i) {
        System.arraycopy(this.f58185d, 0, objArr, 0, this.f58186e);
        return this.f58186e;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: b */
    public final int mo17168b() {
        return this.f58186e;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: c */
    public final int mo17167c() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Uo9.m80802a(i, this.f58186e, "index");
        Object obj = this.f58185d[i];
        obj.getClass();
        return obj;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: h */
    public final boolean mo17166h() {
        return false;
    }

    @Override // p000.AbstractC33087Gh7
    /* renamed from: j */
    public final Object[] mo17165j() {
        return this.f58185d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f58186e;
    }
}
