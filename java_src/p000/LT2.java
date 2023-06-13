package p000;

import java.nio.ByteBuffer;
/* renamed from: LT2 */
/* loaded from: classes.dex */
public final class LT2 extends C48708sY5 {
    /* renamed from: f */
    public LT2 m96913f(int i, ByteBuffer byteBuffer) {
        m96912g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m96912g(int i, ByteBuffer byteBuffer) {
        m14037c(i, byteBuffer);
    }

    /* renamed from: h */
    public int m96911h(int i) {
        int m14038b = m14038b(16);
        if (m14038b != 0) {
            return this.f108961b.getInt(m14036d(m14038b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m96910i() {
        int m14038b = m14038b(16);
        if (m14038b != 0) {
            return m14035e(m14038b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m96909j() {
        int m14038b = m14038b(6);
        return (m14038b == 0 || this.f108961b.get(m14038b + this.f108960a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m96908k() {
        int m14038b = m14038b(14);
        if (m14038b != 0) {
            return this.f108961b.getShort(m14038b + this.f108960a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m96907l() {
        int m14038b = m14038b(4);
        if (m14038b != 0) {
            return this.f108961b.getInt(m14038b + this.f108960a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m96906m() {
        int m14038b = m14038b(8);
        if (m14038b != 0) {
            return this.f108961b.getShort(m14038b + this.f108960a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m96905n() {
        int m14038b = m14038b(12);
        if (m14038b != 0) {
            return this.f108961b.getShort(m14038b + this.f108960a);
        }
        return (short) 0;
    }
}
