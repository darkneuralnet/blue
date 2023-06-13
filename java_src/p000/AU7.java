package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: AU7 */
/* loaded from: classes6.dex */
public final class AU7 {
    /* renamed from: a */
    public static AbstractC45836nh9 m115725a(int i) {
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(i).rewind();
        return AbstractC45836nh9.m23293w(order);
    }

    /* renamed from: b */
    public static String m115724b(byte[] bArr) {
        return W09.m78935d().mo78936c().m78934e(bArr, 0, bArr.length);
    }
}
