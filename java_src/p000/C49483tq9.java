package p000;
/* renamed from: tq9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49483tq9 implements Fp9 {

    /* renamed from: a */
    public final Np9 f111116a;

    /* renamed from: b */
    public final String f111117b;

    /* renamed from: c */
    public final Object[] f111118c;

    /* renamed from: d */
    public final int f111119d;

    public C49483tq9(Np9 np9, String str, Object[] objArr) {
        this.f111116a = np9;
        this.f111117b = str;
        this.f111118c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f111119d = charAt;
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
                this.f111119d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m11638a() {
        return this.f111117b;
    }

    /* renamed from: b */
    public final Object[] m11637b() {
        return this.f111118c;
    }

    @Override // p000.Fp9
    public final Np9 zza() {
        return this.f111116a;
    }

    @Override // p000.Fp9
    public final boolean zzb() {
        return (this.f111119d & 2) == 2;
    }

    @Override // p000.Fp9
    public final int zzc() {
        return (this.f111119d & 1) == 1 ? 1 : 2;
    }
}
