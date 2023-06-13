package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
/* renamed from: C78 */
/* loaded from: classes5.dex */
public final class C78 implements InterfaceC40114e28 {

    /* renamed from: a */
    public final H28 f3470a;

    /* renamed from: b */
    public final String f3471b;

    /* renamed from: c */
    public final S78 f3472c;

    public C78(H28 h28, String str, Object[] objArr) {
        this.f3470a = h28;
        this.f3471b = str;
        this.f3472c = new S78(h28.getClass(), str, objArr);
    }

    @Override // p000.InterfaceC40114e28
    /* renamed from: a */
    public final int mo19060a() {
        int i;
        i = this.f3472c.f33207d;
        return (i & 1) == 1 ? AbstractC17497c.C17502e.f70411i : AbstractC17497c.C17502e.f70412j;
    }

    @Override // p000.InterfaceC40114e28
    /* renamed from: b */
    public final boolean mo19059b() {
        int i;
        i = this.f3472c.f33207d;
        return (i & 2) == 2;
    }

    @Override // p000.InterfaceC40114e28
    /* renamed from: c */
    public final H28 mo19058c() {
        return this.f3470a;
    }

    /* renamed from: d */
    public final int m112764d() {
        int i;
        i = this.f3472c.f33208e;
        return i;
    }

    /* renamed from: e */
    public final S78 m112763e() {
        return this.f3472c;
    }

    /* renamed from: f */
    public final int m112762f() {
        int i;
        i = this.f3472c.f33211h;
        return i;
    }

    /* renamed from: g */
    public final int m112761g() {
        int i;
        i = this.f3472c.f33212i;
        return i;
    }

    /* renamed from: h */
    public final int m112760h() {
        int i;
        i = this.f3472c.f33213j;
        return i;
    }

    /* renamed from: i */
    public final int m112759i() {
        int i;
        i = this.f3472c.f33216m;
        return i;
    }

    /* renamed from: j */
    public final int[] m112758j() {
        int[] iArr;
        iArr = this.f3472c.f33217n;
        return iArr;
    }

    /* renamed from: k */
    public final int m112757k() {
        int i;
        i = this.f3472c.f33215l;
        return i;
    }

    /* renamed from: l */
    public final int m112756l() {
        int i;
        i = this.f3472c.f33214k;
        return i;
    }
}
