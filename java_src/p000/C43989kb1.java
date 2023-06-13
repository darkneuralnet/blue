package p000;

import java.util.Arrays;
/* renamed from: kb1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43989kb1 {

    /* renamed from: a */
    public final C35142Pc1 f94606a;

    /* renamed from: b */
    public final byte[] f94607b;

    public C43989kb1(C35142Pc1 c35142Pc1, byte[] bArr) {
        if (c35142Pc1 != null) {
            if (bArr != null) {
                this.f94606a = c35142Pc1;
                this.f94607b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    /* renamed from: a */
    public byte[] m28811a() {
        return this.f94607b;
    }

    /* renamed from: b */
    public C35142Pc1 m28810b() {
        return this.f94606a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43989kb1)) {
            return false;
        }
        C43989kb1 c43989kb1 = (C43989kb1) obj;
        if (!this.f94606a.equals(c43989kb1.f94606a)) {
            return false;
        }
        return Arrays.equals(this.f94607b, c43989kb1.f94607b);
    }

    public int hashCode() {
        return ((this.f94606a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f94607b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f94606a + ", bytes=[...]}";
    }
}
