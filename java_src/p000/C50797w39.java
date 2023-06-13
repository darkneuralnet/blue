package p000;
/* renamed from: w39  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50797w39 implements O09 {

    /* renamed from: a */
    public final InterfaceC47814r19 f115226a;

    /* renamed from: b */
    public final String f115227b;

    /* renamed from: c */
    public final Object[] f115228c;

    /* renamed from: d */
    public final int f115229d;

    public C50797w39(InterfaceC47814r19 interfaceC47814r19, String str, Object[] objArr) {
        this.f115226a = interfaceC47814r19;
        this.f115227b = str;
        this.f115228c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f115229d = charAt;
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
                this.f115229d = i | (charAt2 << i3);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m7516a() {
        return this.f115227b;
    }

    /* renamed from: b */
    public final Object[] m7515b() {
        return this.f115228c;
    }

    @Override // p000.O09
    public final InterfaceC47814r19 zza() {
        return this.f115226a;
    }

    @Override // p000.O09
    public final boolean zzb() {
        return (this.f115229d & 2) == 2;
    }

    @Override // p000.O09
    public final int zzc() {
        return (this.f115229d & 1) == 1 ? 1 : 2;
    }
}
