package p000;
/* renamed from: d07  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39501d07 {

    /* renamed from: a */
    public final int f75962a;

    /* renamed from: b */
    public final int f75963b;

    public C39501d07(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 32767 && i >= 0) {
            z = true;
        } else {
            z = false;
        }
        J57.m101167c(z);
        J57.m101167c((i2 >= 32767 || i2 < 0) ? false : z2);
        this.f75962a = i;
        this.f75963b = i2;
    }

    /* renamed from: a */
    public final int m44739a() {
        return this.f75963b;
    }

    /* renamed from: b */
    public final int m44738b() {
        return this.f75962a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39501d07) {
            C39501d07 c39501d07 = (C39501d07) obj;
            if (this.f75962a == c39501d07.f75962a && this.f75963b == c39501d07.f75963b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f75963b | (this.f75962a << 16);
    }

    public final String toString() {
        int i = this.f75962a;
        int i2 = this.f75963b;
        return i + "x" + i2;
    }
}
