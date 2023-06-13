package p000;
/* renamed from: LE */
/* loaded from: classes8.dex */
public class C4761LE implements KA1 {

    /* renamed from: a */
    public long[] f20940a;

    @Override // p000.KA1
    /* renamed from: a */
    public void mo97515a(byte[] bArr) {
        this.f20940a = MA1.m95641d(bArr);
    }

    @Override // p000.KA1
    /* renamed from: b */
    public void mo97514b(long j, byte[] bArr) {
        long[] m95633l = MA1.m95633l();
        if (j <= 0) {
            MA1.m95643b(m95633l, bArr);
        }
        long[] jArr = new long[2];
        MA1.m95639f(this.f20940a, jArr);
        do {
            if ((1 & j) != 0) {
                MA1.m95635j(m95633l, jArr);
            }
            MA1.m95632m(jArr, jArr);
            j >>>= 1;
        } while (j > 0);
        MA1.m95643b(m95633l, bArr);
    }
}
