package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: MT2 */
/* loaded from: classes.dex */
public final class MT2 extends C48708sY5 {
    /* renamed from: h */
    public static MT2 m95289h(ByteBuffer byteBuffer) {
        return m95288i(byteBuffer, new MT2());
    }

    /* renamed from: i */
    public static MT2 m95288i(ByteBuffer byteBuffer, MT2 mt2) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return mt2.m95291f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public MT2 m95291f(int i, ByteBuffer byteBuffer) {
        m95290g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m95290g(int i, ByteBuffer byteBuffer) {
        m14037c(i, byteBuffer);
    }

    /* renamed from: j */
    public LT2 m95287j(LT2 lt2, int i) {
        int m14038b = m14038b(6);
        if (m14038b != 0) {
            return lt2.m96913f(m14039a(m14036d(m14038b) + (i * 4)), this.f108961b);
        }
        return null;
    }

    /* renamed from: k */
    public int m95286k() {
        int m14038b = m14038b(6);
        if (m14038b != 0) {
            return m14035e(m14038b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m95285l() {
        int m14038b = m14038b(4);
        if (m14038b != 0) {
            return this.f108961b.getInt(m14038b + this.f108960a);
        }
        return 0;
    }
}
