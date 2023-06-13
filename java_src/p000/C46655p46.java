package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;
/* renamed from: p46  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46655p46 {

    /* renamed from: a */
    public static final Object f103101a = new Object();

    /* renamed from: b */
    public static char[] f103102b = new char[24];

    private C46655p46() {
    }

    /* renamed from: a */
    public static int m19996a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m19995b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m19993d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m19994c(long j, PrintWriter printWriter) {
        m19993d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m19993d(long j, PrintWriter printWriter, int i) {
        synchronized (f103101a) {
            printWriter.print(new String(f103102b, 0, m19992e(j, i)));
        }
    }

    /* renamed from: e */
    public static int m19992e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        if (f103102b.length < i) {
            f103102b = new char[i];
        }
        char[] cArr = f103102b;
        int i12 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i12 == 0) {
            int i13 = i - 1;
            while (i13 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i12 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = CoreConstants.DASH_CHAR;
        }
        int i14 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / DateTimeConstants.SECONDS_PER_DAY;
            floor -= DateTimeConstants.SECONDS_PER_DAY * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i4 = floor - (i15 * 60);
            i5 = i15;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int m19996a = m19996a(i2, 1, false, 0);
            if (m19996a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int m19996a2 = m19996a + m19996a(i3, 1, z5, 2);
            if (m19996a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int m19996a3 = m19996a2 + m19996a(i5, 1, z6, 2);
            if (m19996a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int m19996a4 = m19996a3 + m19996a(i4, 1, z7, 2);
            if (m19996a4 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int m19996a5 = m19996a4 + m19996a(i14, 2, true, i11) + 1; m19996a5 < i; m19996a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i16 = i6 + 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int m19991f = m19991f(cArr, i2, 'd', i16, false, 0);
        if (m19991f != i16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int m19991f2 = m19991f(cArr, i3, 'h', m19991f, z2, i7);
        if (m19991f2 != i16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int m19991f3 = m19991f(cArr, i5, 'm', m19991f2, z3, i8);
        if (m19991f3 != i16) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int m19991f4 = m19991f(cArr, i4, 's', m19991f3, z4, i9);
        if (z && m19991f4 != i16) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        int m19991f5 = m19991f(cArr, i14, 'm', m19991f4, true, i10);
        cArr[m19991f5] = 's';
        return m19991f5 + 1;
    }

    /* renamed from: f */
    public static int m19991f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((z && i3 >= 3) || i > 99) {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            } else {
                i4 = i2;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c;
            return i7 + 1;
        }
        return i2;
    }
}
