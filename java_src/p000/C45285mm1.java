package p000;
/* renamed from: mm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45285mm1 {

    /* renamed from: a */
    public final int f98724a;

    /* renamed from: b */
    public final int[] f98725b;

    /* renamed from: c */
    public final C40900fN4[] f98726c;

    public C45285mm1(int i, int[] iArr, int i2, int i3, int i4) {
        this.f98724a = i;
        this.f98725b = iArr;
        float f = i4;
        this.f98726c = new C40900fN4[]{new C40900fN4(i2, f), new C40900fN4(i3, f)};
    }

    /* renamed from: a */
    public C40900fN4[] m25035a() {
        return this.f98726c;
    }

    /* renamed from: b */
    public int[] m25034b() {
        return this.f98725b;
    }

    /* renamed from: c */
    public int m25033c() {
        return this.f98724a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C45285mm1) || this.f98724a != ((C45285mm1) obj).f98724a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f98724a;
    }
}
