package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: IT */
/* loaded from: classes8.dex */
public final class C3535IT {

    /* renamed from: d */
    public InputStream f15502d;

    /* renamed from: e */
    public boolean f15503e;

    /* renamed from: f */
    public long f15504f;

    /* renamed from: g */
    public int f15505g;

    /* renamed from: h */
    public int f15506h;

    /* renamed from: a */
    public final byte[] f15499a = new byte[4160];

    /* renamed from: b */
    public final int[] f15500b = new int[1040];

    /* renamed from: c */
    public final C52 f15501c = new C52();

    /* renamed from: i */
    public int f15507i = 0;

    /* renamed from: a */
    public static void m102400a(C3535IT c3535it, boolean z) {
        if (!c3535it.f15503e) {
            return;
        }
        int i = ((c3535it.f15506h << 2) + ((c3535it.f15505g + 7) >> 3)) - 8;
        int i2 = c3535it.f15507i;
        if (i <= i2) {
            if (z && i != i2) {
                throw new P20("Unused bytes after end");
            }
            return;
        }
        throw new P20("Read after end");
    }

    /* renamed from: b */
    public static void m102399b(C3535IT c3535it) throws IOException {
        InputStream inputStream = c3535it.f15502d;
        c3535it.f15502d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: c */
    public static void m102398c(C3535IT c3535it, byte[] bArr, int i, int i2) {
        if ((c3535it.f15505g & 7) == 0) {
            while (true) {
                int i3 = c3535it.f15505g;
                if (i3 == 64 || i2 == 0) {
                    break;
                }
                bArr[i] = (byte) (c3535it.f15504f >>> i3);
                c3535it.f15505g = i3 + 8;
                i2--;
                i++;
            }
            if (i2 == 0) {
                return;
            }
            int min = Math.min(m102395f(c3535it), i2 >> 2);
            if (min > 0) {
                int i4 = min << 2;
                System.arraycopy(c3535it.f15499a, c3535it.f15506h << 2, bArr, i, i4);
                i += i4;
                i2 -= i4;
                c3535it.f15506h += min;
            }
            if (i2 == 0) {
                return;
            }
            if (m102395f(c3535it) > 0) {
                m102397d(c3535it);
                while (i2 != 0) {
                    long j = c3535it.f15504f;
                    int i5 = c3535it.f15505g;
                    bArr[i] = (byte) (j >>> i5);
                    c3535it.f15505g = i5 + 8;
                    i2--;
                    i++;
                }
                m102400a(c3535it, false);
                return;
            }
            while (i2 > 0) {
                try {
                    int read = c3535it.f15502d.read(bArr, i, i2);
                    if (read != -1) {
                        i += read;
                        i2 -= read;
                    } else {
                        throw new P20("Unexpected end of input");
                    }
                } catch (IOException e) {
                    throw new P20("Failed to read input", e);
                }
            }
            return;
        }
        throw new P20("Unaligned copyBytes");
    }

    /* renamed from: d */
    public static void m102397d(C3535IT c3535it) {
        int i = c3535it.f15505g;
        if (i >= 32) {
            int[] iArr = c3535it.f15500b;
            int i2 = c3535it.f15506h;
            c3535it.f15506h = i2 + 1;
            c3535it.f15504f = (iArr[i2] << 32) | (c3535it.f15504f >>> 32);
            c3535it.f15505g = i - 32;
        }
    }

    /* renamed from: e */
    public static void m102396e(C3535IT c3535it, InputStream inputStream) {
        if (c3535it.f15502d == null) {
            C52.m112900b(c3535it.f15501c, c3535it.f15499a, c3535it.f15500b);
            c3535it.f15502d = inputStream;
            c3535it.f15504f = 0L;
            c3535it.f15505g = 64;
            c3535it.f15506h = 1024;
            c3535it.f15503e = false;
            m102393h(c3535it);
            return;
        }
        throw new IllegalStateException("Bit reader already has associated input stream");
    }

    /* renamed from: f */
    public static int m102395f(C3535IT c3535it) {
        int i;
        if (c3535it.f15503e) {
            i = (c3535it.f15507i + 3) >> 2;
        } else {
            i = 1024;
        }
        return i - c3535it.f15506h;
    }

    /* renamed from: g */
    public static void m102394g(C3535IT c3535it) {
        int i = (64 - c3535it.f15505g) & 7;
        if (i != 0 && m102392i(c3535it, i) != 0) {
            throw new P20("Corrupted padding bits");
        }
    }

    /* renamed from: h */
    public static void m102393h(C3535IT c3535it) {
        m102391j(c3535it);
        m102400a(c3535it, false);
        m102397d(c3535it);
        m102397d(c3535it);
    }

    /* renamed from: i */
    public static int m102392i(C3535IT c3535it, int i) {
        m102397d(c3535it);
        long j = c3535it.f15504f;
        int i2 = c3535it.f15505g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        c3535it.f15505g = i2 + i;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4.f15503e = true;
        r4.f15507i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m102391j(C3535IT c3535it) {
        int i = c3535it.f15506h;
        if (i <= 1015) {
            return;
        }
        if (c3535it.f15503e) {
            if (m102395f(c3535it) >= -2) {
                return;
            }
            throw new P20("No more input");
        }
        int i2 = i << 2;
        int i3 = 4096 - i2;
        byte[] bArr = c3535it.f15499a;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        c3535it.f15506h = 0;
        while (true) {
            if (i3 >= 4096) {
                break;
            }
            try {
                int read = c3535it.f15502d.read(c3535it.f15499a, i3, 4096 - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } catch (IOException e) {
                throw new P20("Failed to read input", e);
            }
        }
        C52.m112901a(c3535it.f15501c, i3 >> 2);
    }

    /* renamed from: k */
    public static void m102390k(C3535IT c3535it) {
        if (c3535it.f15505g == 64) {
            m102393h(c3535it);
        }
    }
}
