package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;
/* renamed from: pi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47029pi6 {

    /* renamed from: a */
    public static final char[] f103964a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f103965b = new char[64];

    /* renamed from: c */
    public static volatile Handler f103966c;

    /* renamed from: pi6$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C27343a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f103967a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f103967a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103967a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103967a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f103967a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103967a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private C47029pi6() {
    }

    /* renamed from: a */
    public static void m18925a() {
        if (m18909q()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    /* renamed from: b */
    public static void m18924b() {
        if (m18908r()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    /* renamed from: c */
    public static boolean m18923c(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof QU2) {
            return ((QU2) obj).m88478a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: d */
    public static boolean m18922d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static String m18921e(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = f103964a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m18920f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m18919g(int i, int i2, Bitmap.Config config) {
        return i * i2 * m18917i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m18918h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    public static int m18917i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C27343a.f103967a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    /* renamed from: j */
    public static <T> List<T> m18916j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m18915k() {
        if (f103966c == null) {
            synchronized (C47029pi6.class) {
                if (f103966c == null) {
                    f103966c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f103966c;
    }

    /* renamed from: l */
    public static int m18914l(float f) {
        return m18913m(f, 17);
    }

    /* renamed from: m */
    public static int m18913m(float f, int i) {
        return m18912n(Float.floatToIntBits(f), i);
    }

    /* renamed from: n */
    public static int m18912n(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: o */
    public static int m18911o(Object obj, int i) {
        return m18912n(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: p */
    public static int m18910p(boolean z, int i) {
        return m18912n(z ? 1 : 0, i);
    }

    /* renamed from: q */
    public static boolean m18909q() {
        return !m18908r();
    }

    /* renamed from: r */
    public static boolean m18908r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    public static boolean m18907s(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m18906t(int i, int i2) {
        return m18907s(i) && m18907s(i2);
    }

    /* renamed from: u */
    public static void m18905u(Runnable runnable) {
        m18915k().post(runnable);
    }

    /* renamed from: v */
    public static void m18904v(Runnable runnable) {
        m18915k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m18903w(byte[] bArr) {
        String m18921e;
        char[] cArr = f103965b;
        synchronized (cArr) {
            m18921e = m18921e(bArr, cArr);
        }
        return m18921e;
    }
}
