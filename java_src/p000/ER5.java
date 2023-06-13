package p000;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* renamed from: ER5 */
/* loaded from: classes8.dex */
public class ER5 {

    /* renamed from: a */
    public static final long f7467a = Runtime.getRuntime().maxMemory();

    /* renamed from: a */
    public static int m109017a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static int m109016b(int i) throws IOException {
        if (i >= 31) {
            if (i < 128) {
                return 2;
            }
            byte[] bArr = new byte[5];
            int i2 = 4;
            bArr[4] = (byte) (i & 127);
            do {
                i >>= 7;
                i2--;
                bArr[i2] = (byte) ((i & 127) | 128);
            } while (i > 127);
            return 1 + (5 - i2);
        }
        return 1;
    }

    /* renamed from: c */
    public static int m109015c(InputStream inputStream) {
        if (inputStream instanceof AbstractC39999dr2) {
            return ((AbstractC39999dr2) inputStream).m43634a();
        }
        if (inputStream instanceof C3828J) {
            return ((C3828J) inputStream).m101408f();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j = f7467a;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
