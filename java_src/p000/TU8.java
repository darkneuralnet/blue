package p000;

import java.nio.charset.Charset;
/* renamed from: TU8 */
/* loaded from: classes6.dex */
public abstract class TU8 implements LW8 {
    @Override // p000.LW8
    /* renamed from: a */
    public AW8 mo83544a(CharSequence charSequence, Charset charset) {
        throw null;
    }

    @Override // p000.LW8
    /* renamed from: b */
    public final AW8 mo83543b(byte[] bArr) {
        return mo79836c(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public AW8 mo79836c(byte[] bArr, int i, int i2) {
        C52142yK8.m3657h(0, i2, bArr.length);
        WW8 mo83542d = mo83542d(i2);
        mo83542d.mo19172a(bArr, 0, i2);
        return mo83542d.zzd();
    }

    /* renamed from: d */
    public WW8 mo83542d(int i) {
        return zze();
    }
}
