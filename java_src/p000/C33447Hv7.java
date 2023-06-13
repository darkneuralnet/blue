package p000;
/* renamed from: Hv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33447Hv7 implements InterfaceC39452cv7 {

    /* renamed from: a */
    public final InterfaceC41230fv7 f14184a;

    /* renamed from: b */
    public final String f14185b;

    /* renamed from: c */
    public final Object[] f14186c;

    /* renamed from: d */
    public final int f14187d;

    public C33447Hv7(InterfaceC41230fv7 interfaceC41230fv7, String str, Object[] objArr) {
        this.f14184a = interfaceC41230fv7;
        this.f14185b = str;
        this.f14186c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14187d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f14187d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m103224a() {
        return this.f14185b;
    }

    /* renamed from: b */
    public final Object[] m103223b() {
        return this.f14186c;
    }

    @Override // p000.InterfaceC39452cv7
    public final InterfaceC41230fv7 zza() {
        return this.f14184a;
    }

    @Override // p000.InterfaceC39452cv7
    public final boolean zzb() {
        return (this.f14187d & 2) == 2;
    }

    @Override // p000.InterfaceC39452cv7
    public final int zzc() {
        return (this.f14187d & 1) == 1 ? 1 : 2;
    }
}
