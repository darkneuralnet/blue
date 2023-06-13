package p000;
/* renamed from: rR7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48055rR7 extends HL7 {

    /* renamed from: f */
    public static final HL7 f107084f = new C48055rR7(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f107085d;

    /* renamed from: e */
    public final transient int f107086e;

    public C48055rR7(Object[] objArr, int i) {
        this.f107085d = objArr;
        this.f107086e = i;
    }

    @Override // p000.HL7, p000.BJ7
    /* renamed from: a */
    public final int mo15942a(Object[] objArr, int i) {
        System.arraycopy(this.f107085d, 0, objArr, 0, this.f107086e);
        return this.f107086e;
    }

    @Override // p000.BJ7
    /* renamed from: b */
    public final int mo12495b() {
        return this.f107086e;
    }

    @Override // p000.BJ7
    /* renamed from: c */
    public final int mo12494c() {
        return 0;
    }

    @Override // p000.BJ7
    /* renamed from: f */
    public final Object[] mo12493f() {
        return this.f107085d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C50566vg7.m8263a(i, this.f107086e, "index");
        Object obj = this.f107085d[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107086e;
    }
}
