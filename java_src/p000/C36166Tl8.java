package p000;
/* renamed from: Tl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36166Tl8 implements InterfaceC46438oi8 {

    /* renamed from: a */
    public final InterfaceC39926dj8 f36044a;

    /* renamed from: b */
    public final String f36045b;

    /* renamed from: c */
    public final Object[] f36046c;

    /* renamed from: d */
    public final int f36047d;

    public C36166Tl8(InterfaceC39926dj8 interfaceC39926dj8, String str, Object[] objArr) {
        this.f36044a = interfaceC39926dj8;
        this.f36045b = str;
        this.f36046c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f36047d = charAt;
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
                this.f36047d = i | (charAt2 << i3);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m82994a() {
        return this.f36045b;
    }

    /* renamed from: b */
    public final Object[] m82993b() {
        return this.f36046c;
    }

    @Override // p000.InterfaceC46438oi8
    public final InterfaceC39926dj8 zza() {
        return this.f36044a;
    }

    @Override // p000.InterfaceC46438oi8
    public final boolean zzb() {
        return (this.f36047d & 2) == 2;
    }

    @Override // p000.InterfaceC46438oi8
    public final int zzc() {
        return (this.f36047d & 1) == 1 ? 1 : 2;
    }
}
