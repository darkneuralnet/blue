package p000;

import java.nio.ByteOrder;
import kotlin.UByte;
/* renamed from: oY8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46340oY8 {

    /* renamed from: a */
    public static final KX8 f102139a;

    static {
        KX8 kx8 = AX8.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    kx8 = EnumC40410eY8.UNSAFE_LITTLE_ENDIAN;
                } else {
                    kx8 = EnumC40410eY8.UNSAFE_BIG_ENDIAN;
                }
            }
        } catch (Throwable unused) {
        }
        f102139a = kx8;
    }

    /* renamed from: a */
    public static int m20900a(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: b */
    public static long m20899b(byte[] bArr, int i) {
        return f102139a.mo42796a(bArr, i);
    }
}
