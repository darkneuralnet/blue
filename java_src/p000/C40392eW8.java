package p000;

import java.io.Serializable;
import kotlin.UByte;
/* renamed from: eW8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40392eW8 extends AW8 implements Serializable {

    /* renamed from: c */
    public final byte[] f78508c;

    public C40392eW8(byte[] bArr) {
        bArr.getClass();
        this.f78508c = bArr;
    }

    @Override // p000.AW8
    /* renamed from: a */
    public final int mo20945a() {
        boolean z;
        int length = this.f78508c.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        C52142yK8.m3654k(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.f78508c;
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | (bArr[0] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 8) | ((bArr[2] & UByte.MAX_VALUE) << 16);
    }

    @Override // p000.AW8
    /* renamed from: b */
    public final int mo20944b() {
        return this.f78508c.length * 8;
    }

    @Override // p000.AW8
    /* renamed from: c */
    public final long mo20943c() {
        boolean z;
        int length = this.f78508c.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        C52142yK8.m3654k(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.f78508c[0] & UByte.MAX_VALUE;
        for (int i = 1; i < Math.min(this.f78508c.length, 8); i++) {
            j |= (this.f78508c[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // p000.AW8
    /* renamed from: d */
    public final boolean mo20942d(AW8 aw8) {
        boolean z;
        if (this.f78508c.length != aw8.mo42813f().length) {
            return false;
        }
        boolean z2 = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.f78508c;
            if (i < bArr.length) {
                if (bArr[i] == aw8.mo42813f()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
                i++;
            } else {
                return z2;
            }
        }
    }

    @Override // p000.AW8
    /* renamed from: e */
    public final byte[] mo20941e() {
        return (byte[]) this.f78508c.clone();
    }

    @Override // p000.AW8
    /* renamed from: f */
    public final byte[] mo42813f() {
        return this.f78508c;
    }
}
