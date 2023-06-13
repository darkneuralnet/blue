package p000;
/* renamed from: hc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42226hc7 implements InterfaceC35373Qb7 {

    /* renamed from: a */
    public final InterfaceC36075Tb7 f85607a;

    /* renamed from: b */
    public final String f85608b;

    /* renamed from: c */
    public final Object[] f85609c;

    /* renamed from: d */
    public final int f85610d;

    public C42226hc7(InterfaceC36075Tb7 interfaceC36075Tb7, String str, Object[] objArr) {
        this.f85607a = interfaceC36075Tb7;
        this.f85608b = str;
        this.f85609c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f85610d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.f85610d = i | (charAt2 << i3);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m36158a() {
        return this.f85608b;
    }

    /* renamed from: b */
    public final Object[] m36157b() {
        return this.f85609c;
    }

    @Override // p000.InterfaceC35373Qb7
    /* renamed from: y */
    public final InterfaceC36075Tb7 mo6590y() {
        return this.f85607a;
    }

    @Override // p000.InterfaceC35373Qb7
    public final boolean zbb() {
        return (this.f85610d & 2) == 2;
    }

    @Override // p000.InterfaceC35373Qb7
    public final int zbc() {
        return (this.f85610d & 1) == 1 ? 1 : 2;
    }
}
