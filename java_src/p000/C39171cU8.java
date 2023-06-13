package p000;
/* renamed from: cU8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39171cU8 implements PP8 {

    /* renamed from: a */
    public final InterfaceC44489lQ8 f60715a;

    /* renamed from: b */
    public final String f60716b;

    /* renamed from: c */
    public final Object[] f60717c;

    /* renamed from: d */
    public final int f60718d;

    public C39171cU8(InterfaceC44489lQ8 interfaceC44489lQ8, String str, Object[] objArr) {
        this.f60715a = interfaceC44489lQ8;
        this.f60716b = str;
        this.f60717c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f60718d = charAt;
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
                this.f60718d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m61280a() {
        return this.f60716b;
    }

    /* renamed from: b */
    public final Object[] m61279b() {
        return this.f60717c;
    }

    @Override // p000.PP8
    public final int zza() {
        return (this.f60718d & 1) == 1 ? C46888pT8.f103738a : C46888pT8.f103739b;
    }

    @Override // p000.PP8
    public final boolean zzb() {
        return (this.f60718d & 2) == 2;
    }

    @Override // p000.PP8
    public final InterfaceC44489lQ8 zzc() {
        return this.f60715a;
    }
}
