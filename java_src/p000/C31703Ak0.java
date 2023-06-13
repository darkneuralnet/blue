package p000;

import p000.InterfaceC41706gk0;
/* renamed from: Ak0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31703Ak0 implements InterfaceC49405tj1<String[][]> {

    /* renamed from: a */
    public final Z94<Integer> f1001a;

    /* renamed from: b */
    public final Z94<Integer> f1002b;

    public C31703Ak0(Z94<Integer> z94, Z94<Integer> z942) {
        this.f1001a = z94;
        this.f1002b = z942;
    }

    /* renamed from: a */
    public static C31703Ak0 m115332a(Z94<Integer> z94, Z94<Integer> z942) {
        return new C31703Ak0(z94, z942);
    }

    /* renamed from: c */
    public static String[][] m115330c(int i, int i2) {
        return (String[][]) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37841t(i, i2));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public String[][] get() {
        return m115330c(this.f1001a.get().intValue(), this.f1002b.get().intValue());
    }
}
