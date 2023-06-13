package p000;

import java.security.MessageDigest;
import java.util.Arrays;
/* renamed from: GY8 */
/* loaded from: classes6.dex */
public final class GY8 extends HU8 {

    /* renamed from: b */
    public final MessageDigest f12075b;

    /* renamed from: c */
    public final int f12076c;

    /* renamed from: d */
    public boolean f12077d;

    public /* synthetic */ GY8(MessageDigest messageDigest, int i, C51675xY8 c51675xY8) {
        this.f12075b = messageDigest;
        this.f12076c = i;
    }

    @Override // p000.HU8
    /* renamed from: b */
    public final void mo103824b(byte[] bArr, int i, int i2) {
        m105007c();
        this.f12075b.update(bArr, 0, i2);
    }

    /* renamed from: c */
    public final void m105007c() {
        C52142yK8.m3655j(!this.f12077d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // p000.WW8
    public final AW8 zzd() {
        m105007c();
        this.f12077d = true;
        if (this.f12076c == this.f12075b.getDigestLength()) {
            return AW8.m115679g(this.f12075b.digest());
        }
        return AW8.m115679g(Arrays.copyOf(this.f12075b.digest(), this.f12076c));
    }
}
