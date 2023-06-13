package p000;

import kotlin.UByte;
/* renamed from: gm2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41728gm2 {

    /* renamed from: a */
    public int f84214a;

    /* renamed from: b */
    public int f84215b;

    /* renamed from: c */
    public int f84216c;

    /* renamed from: d */
    public short[][][] f84217d;

    /* renamed from: e */
    public short[][][] f84218e;

    /* renamed from: f */
    public short[][] f84219f;

    /* renamed from: g */
    public short[] f84220g;

    public C41728gm2(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & UByte.MAX_VALUE;
        this.f84214a = i;
        int i2 = b2 & UByte.MAX_VALUE;
        this.f84215b = i2;
        this.f84216c = i2 - i;
        this.f84217d = sArr;
        this.f84218e = sArr2;
        this.f84219f = sArr3;
        this.f84220g = sArr4;
    }

    /* renamed from: a */
    public short[][][] m37497a() {
        return this.f84217d;
    }

    /* renamed from: b */
    public short[][][] m37496b() {
        return this.f84218e;
    }

    /* renamed from: c */
    public short[] m37495c() {
        return this.f84220g;
    }

    /* renamed from: d */
    public short[][] m37494d() {
        return this.f84219f;
    }

    /* renamed from: e */
    public int m37493e() {
        return this.f84216c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C41728gm2)) {
            return false;
        }
        C41728gm2 c41728gm2 = (C41728gm2) obj;
        return this.f84214a == c41728gm2.m37492f() && this.f84215b == c41728gm2.m37491g() && this.f84216c == c41728gm2.m37493e() && C39351cn4.m60869k(this.f84217d, c41728gm2.m37497a()) && C39351cn4.m60869k(this.f84218e, c41728gm2.m37496b()) && C39351cn4.m60870j(this.f84219f, c41728gm2.m37494d()) && C39351cn4.m60871i(this.f84220g, c41728gm2.m37495c());
    }

    /* renamed from: f */
    public int m37492f() {
        return this.f84214a;
    }

    /* renamed from: g */
    public int m37491g() {
        return this.f84215b;
    }

    public int hashCode() {
        return (((((((((((this.f84214a * 37) + this.f84215b) * 37) + this.f84216c) * 37) + C0210Ao.m115238q(this.f84217d)) * 37) + C0210Ao.m115238q(this.f84218e)) * 37) + C0210Ao.m115239p(this.f84219f)) * 37) + C0210Ao.m115240o(this.f84220g);
    }
}
