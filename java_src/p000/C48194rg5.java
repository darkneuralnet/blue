package p000;
/* renamed from: rg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48194rg5 extends C36610Vj2 implements YH6 {
    public C48194rg5() {
        this(128);
    }

    /* renamed from: s */
    public static int m15577s(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // p000.C36610Vj2, p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        return mo15580b(bArr, i, mo15578e());
    }

    @Override // p000.YH6
    /* renamed from: b */
    public int mo15580b(byte[] bArr, int i, int i2) {
        int m15576t = m15576t(bArr, i, i2);
        m79522q();
        return m15576t;
    }

    @Override // p000.C36610Vj2, p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHAKE" + this.f39607e;
    }

    @Override // p000.C36610Vj2, p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return this.f39607e / 4;
    }

    /* renamed from: t */
    public int m15576t(byte[] bArr, int i, int i2) {
        if (!this.f39608f) {
            m79527l(15, 4);
        }
        m79521r(bArr, i, i2 * 8);
        return i2;
    }

    public C48194rg5(int i) {
        super(m15577s(i));
    }
}
