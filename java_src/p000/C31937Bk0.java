package p000;

import p000.InterfaceC41706gk0;
/* renamed from: Bk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31937Bk0 implements InterfaceC49405tj1<String[][]> {

    /* renamed from: a */
    public final Z94<Integer> f2794a;

    /* renamed from: b */
    public final Z94<Integer> f2795b;

    /* renamed from: c */
    public final Z94<Boolean> f2796c;

    public C31937Bk0(Z94<Integer> z94, Z94<Integer> z942, Z94<Boolean> z943) {
        this.f2794a = z94;
        this.f2795b = z942;
        this.f2796c = z943;
    }

    /* renamed from: a */
    public static C31937Bk0 m113566a(Z94<Integer> z94, Z94<Integer> z942, Z94<Boolean> z943) {
        return new C31937Bk0(z94, z942, z943);
    }

    /* renamed from: c */
    public static String[][] m113564c(int i, int i2, boolean z) {
        return (String[][]) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37840u(i, i2, z));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public String[][] get() {
        return m113564c(this.f2794a.get().intValue(), this.f2795b.get().intValue(), this.f2796c.get().booleanValue());
    }
}
