package p000;
/* renamed from: lV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44533lV7 {

    /* renamed from: a */
    public final int f96268a;

    /* renamed from: b */
    public final int f96269b;

    public C44533lV7(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 32767 && i >= 0) {
            z = true;
        } else {
            z = false;
        }
        DQ8.m110467d(z);
        DQ8.m110467d((i2 >= 32767 || i2 < 0) ? false : z2);
        this.f96268a = i;
        this.f96269b = i2;
    }

    /* renamed from: a */
    public final int m27200a() {
        return this.f96269b;
    }

    /* renamed from: b */
    public final int m27199b() {
        return this.f96268a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C44533lV7) {
            C44533lV7 c44533lV7 = (C44533lV7) obj;
            if (this.f96268a == c44533lV7.f96268a && this.f96269b == c44533lV7.f96269b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f96269b | (this.f96268a << 16);
    }

    public final String toString() {
        int i = this.f96268a;
        int i2 = this.f96269b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
