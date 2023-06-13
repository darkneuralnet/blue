package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p000.C44090kl2;
/* renamed from: TE0 */
/* loaded from: classes6.dex */
public final class TE0 {

    /* renamed from: a */
    public static final byte[] f35009a = new byte[0];

    /* renamed from: TE0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C7693a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35010a;

        static {
            int[] iArr = new int[EnumC40189eA3.values().length];
            f35010a = iArr;
            try {
                iArr[EnumC40189eA3.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35010a[EnumC40189eA3.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35010a[EnumC40189eA3.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35010a[EnumC40189eA3.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private TE0() {
    }

    /* renamed from: a */
    public static byte[] m84166a(C44090kl2.C25225c c25225c) throws GeneralSecurityException {
        int i = C7693a.f35010a[c25225c.m28500M().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return f35009a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            return ByteBuffer.allocate(5).put((byte) 1).putInt(c25225c.m28501L()).array();
        }
        return ByteBuffer.allocate(5).put((byte) 0).putInt(c25225c.m28501L()).array();
    }
}
