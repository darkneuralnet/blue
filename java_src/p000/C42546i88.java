package p000;
/* renamed from: i88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42546i88 {

    /* renamed from: a */
    public final String f86804a;

    /* renamed from: b */
    public int f86805b = 0;

    public C42546i88(String str) {
        this.f86804a = str;
    }

    /* renamed from: a */
    public final boolean m34400a() {
        return this.f86805b < this.f86804a.length();
    }

    /* renamed from: b */
    public final int m34399b() {
        String str = this.f86804a;
        int i = this.f86805b;
        this.f86805b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.f86804a;
            int i4 = this.f86805b;
            this.f86805b = i4 + 1;
            char charAt2 = str2.charAt(i4);
            if (charAt2 < 55296) {
                return i2 | (charAt2 << i3);
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
        }
    }
}
