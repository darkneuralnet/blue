package p000;
/* renamed from: wi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51181wi9 implements Tf9 {

    /* renamed from: a */
    public final InterfaceC47012pg9 f116387a;

    /* renamed from: b */
    public final String f116388b;

    /* renamed from: c */
    public final Object[] f116389c;

    /* renamed from: d */
    public final int f116390d;

    public C51181wi9(InterfaceC47012pg9 interfaceC47012pg9, String str, Object[] objArr) {
        this.f116387a = interfaceC47012pg9;
        this.f116388b = str;
        this.f116389c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f116390d = charAt;
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
                this.f116390d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m6450a() {
        return this.f116388b;
    }

    /* renamed from: b */
    public final Object[] m6449b() {
        return this.f116389c;
    }

    @Override // p000.Tf9
    public final InterfaceC47012pg9 zza() {
        return this.f116387a;
    }

    @Override // p000.Tf9
    public final boolean zzb() {
        return (this.f116390d & 2) == 2;
    }

    @Override // p000.Tf9
    public final int zzc() {
        return (this.f116390d & 1) == 1 ? 1 : 2;
    }
}
