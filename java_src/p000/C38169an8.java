package p000;
/* renamed from: an8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38169an8 implements InterfaceC36841Wi8 {

    /* renamed from: a */
    public final InterfaceC34042Kj8 f51281a;

    /* renamed from: b */
    public final String f51282b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* renamed from: c */
    public final Object[] f51283c;

    /* renamed from: d */
    public final int f51284d;

    public C38169an8(InterfaceC34042Kj8 interfaceC34042Kj8, String str, Object[] objArr) {
        this.f51281a = interfaceC34042Kj8;
        this.f51283c = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.f51284d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f51284d = (charAt2 << i2) | i;
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m70720a() {
        return this.f51282b;
    }

    /* renamed from: b */
    public final Object[] m70719b() {
        return this.f51283c;
    }

    @Override // p000.InterfaceC36841Wi8
    public final InterfaceC34042Kj8 zza() {
        return this.f51281a;
    }

    @Override // p000.InterfaceC36841Wi8
    public final boolean zzb() {
        return (this.f51284d & 2) == 2;
    }

    @Override // p000.InterfaceC36841Wi8
    public final int zzc() {
        return (this.f51284d & 1) == 1 ? 1 : 2;
    }
}
