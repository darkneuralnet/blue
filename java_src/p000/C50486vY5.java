package p000;

import java.lang.reflect.Array;
import kotlin.UByte;
/* renamed from: vY5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50486vY5 implements LA1 {

    /* renamed from: a */
    public byte[] f114264a;

    /* renamed from: b */
    public long[][] f114265b;

    @Override // p000.LA1
    /* renamed from: a */
    public void mo8449a(byte[] bArr) {
        if (this.f114265b == null) {
            this.f114265b = (long[][]) Array.newInstance(Long.TYPE, 256, 2);
        } else if (MA1.m95644a(this.f114264a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f114264a = bArr2;
        MA1.m95640e(bArr, bArr2);
        MA1.m95642c(this.f114264a, this.f114265b[1]);
        long[] jArr = this.f114265b[1];
        MA1.m95634k(jArr, jArr);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.f114265b;
            MA1.m95638g(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.f114265b;
            MA1.m95626s(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }

    @Override // p000.LA1
    /* renamed from: b */
    public void mo8448b(byte[] bArr) {
        long[] jArr = this.f114265b[bArr[15] & UByte.MAX_VALUE];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f114265b[bArr[i] & UByte.MAX_VALUE];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        DD3.m110675i(j, bArr, 0);
        DD3.m110675i(j2, bArr, 8);
    }
}
