package p000;

import java.io.Serializable;
/* renamed from: oW8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46322oW8 extends AW8 implements Serializable {

    /* renamed from: c */
    public final long f102111c;

    public C46322oW8(long j) {
        this.f102111c = j;
    }

    @Override // p000.AW8
    /* renamed from: a */
    public final int mo20945a() {
        return (int) this.f102111c;
    }

    @Override // p000.AW8
    /* renamed from: b */
    public final int mo20944b() {
        return 64;
    }

    @Override // p000.AW8
    /* renamed from: c */
    public final long mo20943c() {
        return this.f102111c;
    }

    @Override // p000.AW8
    /* renamed from: d */
    public final boolean mo20942d(AW8 aw8) {
        if (this.f102111c == aw8.mo20943c()) {
            return true;
        }
        return false;
    }

    @Override // p000.AW8
    /* renamed from: e */
    public final byte[] mo20941e() {
        long j = this.f102111c;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }
}
