package p000;

import java.math.RoundingMode;
import kotlin.time.DurationKt;
import okhttp3.internal.http2.Http2Connection;
/* renamed from: z52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52589z52 {

    /* renamed from: a */
    public static final byte[] f120753a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    public static final int[] f120754b = {1, 10, 100, 1000, 10000, 100000, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: c */
    public static final int[] f120755c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d */
    public static final int[] f120756d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    public static int[] f120757e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: z52$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120758a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f120758a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120758a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120758a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120758a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120758a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120758a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f120758a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f120758a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C52589z52() {
    }

    /* renamed from: a */
    public static boolean m1839a(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    /* renamed from: b */
    public static int m1838b(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static int m1837c(int i, RoundingMode roundingMode) {
        ZM2.m73240a("x", i);
        switch (C30905a.f120758a[roundingMode.ordinal()]) {
            case 1:
                ZM2.m73239b(m1839a(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m1838b((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: d */
    public static int m1836d(int i, int i2) {
        return C41344g72.m39991b(i + i2);
    }
}
