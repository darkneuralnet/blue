package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.integration.webp.C17109a;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC38944c61;
import p000.C42519i61;
/* renamed from: FA6 */
/* loaded from: classes5.dex */
public final class FA6 {

    /* renamed from: e */
    public static final C43035iy3<Boolean> f8981e = C43035iy3.m31548f("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder", Boolean.FALSE);

    /* renamed from: f */
    public static final C42519i61.InterfaceC23126b f8982f = new C2200a();

    /* renamed from: g */
    public static final Queue<BitmapFactory.Options> f8983g = C47029pi6.m18920f(0);

    /* renamed from: a */
    public final InterfaceC20044eU f8984a;

    /* renamed from: b */
    public final DisplayMetrics f8985b;

    /* renamed from: c */
    public final InterfaceC28820to f8986c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f8987d;

    /* renamed from: FA6$a */
    /* loaded from: classes5.dex */
    public static class C2200a implements C42519i61.InterfaceC23126b {
        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: a */
        public void mo23750a() {
        }

        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: b */
        public void mo23749b(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap) throws IOException {
        }
    }

    public FA6(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to) {
        this.f8987d = list;
        this.f8985b = (DisplayMetrics) C52865zZ3.m1111d(displayMetrics);
        this.f8984a = (InterfaceC20044eU) C52865zZ3.m1111d(interfaceC20044eU);
        this.f8986c = (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to);
    }

    /* renamed from: a */
    public static int m107474a(double d) {
        int m107456s = m107456s(1.0E9d * d);
        return m107456s((d / (m107456s / 1.0E9f)) * m107456s);
    }

    /* renamed from: c */
    public static void m107472c(ImageHeaderParser.ImageType imageType, InputStream inputStream, C42519i61.InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU, AbstractC38944c61 abstractC38944c61, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float mo61934b;
        int min;
        int floor;
        int floor2;
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        if (i != 90 && i != 270) {
            mo61934b = abstractC38944c61.mo61934b(i2, i3, i4, i5);
        } else {
            mo61934b = abstractC38944c61.mo61934b(i3, i2, i4, i5);
        }
        if (mo61934b > 0.0f) {
            AbstractC38944c61.EnumC13399g mo61935a = abstractC38944c61.mo61935a(i2, i3, i4, i5);
            if (mo61935a != null) {
                float f = i2;
                float f2 = i3;
                int m107456s = i2 / m107456s(mo61934b * f);
                int m107456s2 = i3 / m107456s(mo61934b * f2);
                AbstractC38944c61.EnumC13399g enumC13399g = AbstractC38944c61.EnumC13399g.MEMORY;
                if (mo61935a == enumC13399g) {
                    min = Math.max(m107456s, m107456s2);
                } else {
                    min = Math.min(m107456s, m107456s2);
                }
                int max = Math.max(1, Integer.highestOneBit(min));
                if (mo61935a == enumC13399g && max < 1.0f / mo61934b) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (imageType == ImageHeaderParser.ImageType.JPEG) {
                    float min2 = Math.min(max, 8);
                    floor = (int) Math.ceil(f / min2);
                    floor2 = (int) Math.ceil(f2 / min2);
                    int i6 = max / 8;
                    if (i6 > 0) {
                        floor /= i6;
                        floor2 /= i6;
                    }
                } else if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                    if (imageType != ImageHeaderParser.ImageType.WEBP && imageType != ImageHeaderParser.ImageType.WEBP_A) {
                        if (i2 % max == 0 && i3 % max == 0) {
                            floor = i2 / max;
                            floor2 = i3 / max;
                        } else {
                            int[] m107465j = m107465j(inputStream, options, interfaceC23126b, interfaceC20044eU);
                            floor = m107465j[0];
                            floor2 = m107465j[1];
                        }
                    } else {
                        float f3 = max;
                        floor = Math.round(f / f3);
                        floor2 = Math.round(f2 / f3);
                    }
                } else {
                    float f4 = max;
                    floor = (int) Math.floor(f / f4);
                    floor2 = (int) Math.floor(f2 / f4);
                }
                double mo61934b2 = abstractC38944c61.mo61934b(floor, floor2, i4, i5);
                options.inTargetDensity = m107474a(mo61934b2);
                options.inDensity = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                if (m107461n(options)) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    Log.v("WebpDownsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + mo61934b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo61934b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        throw new IllegalArgumentException("Cannot scale with factor: " + mo61934b + " from: " + abstractC38944c61 + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
    }

    /* renamed from: g */
    public static Bitmap m107468g(InputStream inputStream, BitmapFactory.Options options, C42519i61.InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            interfaceC23126b.mo23750a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C49076t96.m12986f().lock();
        try {
            try {
                Bitmap decodeStream = WebpBitmapFactory.decodeStream(inputStream, null, options);
                C49076t96.m12986f().unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return decodeStream;
            } catch (IllegalArgumentException e) {
                IOException m107459p = m107459p(e, i, i2, str, options);
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", m107459p);
                }
                if (options.inBitmap != null) {
                    try {
                        inputStream.reset();
                        interfaceC20044eU.mo16193c(options.inBitmap);
                        options.inBitmap = null;
                        Bitmap m107468g = m107468g(inputStream, options, interfaceC23126b, interfaceC20044eU);
                        C49076t96.m12986f().unlock();
                        return m107468g;
                    } catch (IOException unused) {
                        throw m107459p;
                    }
                }
                throw m107459p;
            }
        } catch (Throwable th) {
            C49076t96.m12986f().unlock();
            throw th;
        }
    }

    @TargetApi(19)
    /* renamed from: h */
    public static String m107467h(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: i */
    public static synchronized BitmapFactory.Options m107466i() {
        BitmapFactory.Options poll;
        synchronized (FA6.class) {
            Queue<BitmapFactory.Options> queue = f8983g;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m107457r(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    public static int[] m107465j(InputStream inputStream, BitmapFactory.Options options, C42519i61.InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU) throws IOException {
        options.inJustDecodeBounds = true;
        m107468g(inputStream, options, interfaceC23126b, interfaceC20044eU);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: k */
    public static String m107464k(BitmapFactory.Options options) {
        return m107467h(options.inBitmap);
    }

    /* renamed from: n */
    public static boolean m107461n(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: o */
    public static void m107460o(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("WebpDownsampler", "Decoded " + m107467h(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m107464k(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C49546tx2.m11169a(j));
    }

    /* renamed from: p */
    public static IOException m107459p(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m107464k(options), illegalArgumentException);
    }

    /* renamed from: q */
    public static void m107458q(BitmapFactory.Options options) {
        m107457r(options);
        Queue<BitmapFactory.Options> queue = f8983g;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: r */
    public static void m107457r(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: s */
    public static int m107456s(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: t */
    public static void m107455t(BitmapFactory.Options options, InterfaceC20044eU interfaceC20044eU, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                return;
            }
        }
        options.inBitmap = interfaceC20044eU.mo16191e(i, i2, options.inPreferredConfig);
    }

    /* renamed from: b */
    public final void m107473b(InputStream inputStream, EnumC45712nV0 enumC45712nV0, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) throws IOException {
        boolean z3;
        Bitmap.Config config;
        if (enumC45712nV0 != EnumC45712nV0.PREFER_ARGB_8888) {
            try {
                z3 = C17116a.m53102f(this.f8987d, inputStream, this.f8986c).hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC45712nV0, e);
                }
                z3 = false;
            }
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ALPHA_8) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* renamed from: d */
    public VL4<Bitmap> m107471d(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return m107470e(inputStream, i, i2, c48964sy3, f8982f);
    }

    /* renamed from: e */
    public VL4<Bitmap> m107470e(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3, C42519i61.InterfaceC23126b interfaceC23126b) throws IOException {
        boolean z;
        C52865zZ3.m1114a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f8986c.mo11761c(65536, byte[].class);
        BitmapFactory.Options m107466i = m107466i();
        m107466i.inTempStorage = bArr;
        EnumC45712nV0 enumC45712nV0 = (EnumC45712nV0) c48964sy3.m13300c(C42519i61.f86738f);
        AbstractC38944c61 abstractC38944c61 = (AbstractC38944c61) c48964sy3.m13300c(C42519i61.f86740h);
        boolean booleanValue = ((Boolean) c48964sy3.m13300c(C42519i61.f86741i)).booleanValue();
        C43035iy3<Boolean> c43035iy3 = C42519i61.f86742j;
        if (c48964sy3.m13300c(c43035iy3) != null && ((Boolean) c48964sy3.m13300c(c43035iy3)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return C20872gU.m39360f(m107469f(inputStream, m107466i, abstractC38944c61, enumC45712nV0, z, i, i2, booleanValue, interfaceC23126b), this.f8984a);
        } finally {
            m107458q(m107466i);
            this.f8986c.mo11759e(bArr, byte[].class);
        }
    }

    /* renamed from: f */
    public final Bitmap m107469f(InputStream inputStream, BitmapFactory.Options options, AbstractC38944c61 abstractC38944c61, EnumC45712nV0 enumC45712nV0, boolean z, int i, int i2, boolean z2, C42519i61.InterfaceC23126b interfaceC23126b) throws IOException {
        boolean z3;
        int i3;
        int i4;
        int i5;
        float f;
        int round;
        int round2;
        long m11168b = C49546tx2.m11168b();
        int[] m107465j = m107465j(inputStream, options, interfaceC23126b, this.f8984a);
        int i6 = m107465j[0];
        int i7 = m107465j[1];
        String str = options.outMimeType;
        if (i6 != -1 && i7 != -1) {
            z3 = z;
        } else {
            z3 = false;
        }
        int m53106b = C17116a.m53106b(this.f8987d, inputStream, this.f8986c);
        int m12985g = C49076t96.m12985g(m53106b);
        boolean m12982j = C49076t96.m12982j(m53106b);
        if (i == Integer.MIN_VALUE) {
            i3 = i6;
        } else {
            i3 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            i4 = i7;
        } else {
            i4 = i2;
        }
        ImageHeaderParser.ImageType m53102f = C17116a.m53102f(this.f8987d, inputStream, this.f8986c);
        m107472c(m53102f, inputStream, interfaceC23126b, this.f8984a, abstractC38944c61, m12985g, i6, i7, i3, i4, options);
        m107473b(inputStream, enumC45712nV0, z3, m12982j, options, i3, i4);
        int i8 = options.inSampleSize;
        if (m107454u(m53102f)) {
            if (z2) {
                round = i3;
                round2 = i4;
            } else {
                if (m107461n(options)) {
                    f = options.inTargetDensity / options.inDensity;
                } else {
                    f = 1.0f;
                }
                int i9 = options.inSampleSize;
                float f2 = i9;
                round = Math.round(((int) Math.ceil(i6 / f2)) * f);
                round2 = Math.round(((int) Math.ceil(i7 / f2)) * f);
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    Log.v("WebpDownsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i6 + "x" + i7 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                }
            }
            if (round > 0 && round2 > 0) {
                m107455t(options, this.f8984a, round, round2);
            }
        }
        Bitmap m107468g = m107468g(inputStream, options, interfaceC23126b, this.f8984a);
        interfaceC23126b.mo23749b(this.f8984a, m107468g);
        if (Log.isLoggable("WebpDownsampler", 2)) {
            i5 = m53106b;
            m107460o(i6, i7, str, options, m107468g, i, i2, m11168b);
        } else {
            i5 = m53106b;
        }
        if (m107468g != null) {
            m107468g.setDensity(this.f8985b.densityDpi);
            Bitmap m12981k = C49076t96.m12981k(this.f8984a, m107468g, i5);
            if (!m107468g.equals(m12981k)) {
                this.f8984a.mo16193c(m107468g);
                return m12981k;
            }
            return m12981k;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m107463l(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f8981e)).booleanValue() || C17109a.f69131a) {
            return false;
        }
        C17109a.EnumC17114e m53115b = C17109a.m53115b(inputStream, this.f8986c);
        if (!C17109a.m53110g(m53115b) || m53115b == C17109a.EnumC17114e.WEBP_SIMPLE) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m107462m(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f8981e)).booleanValue() || C17109a.f69131a) {
            return false;
        }
        C17109a.EnumC17114e m53114c = C17109a.m53114c(byteBuffer);
        if (!C17109a.m53110g(m53114c) || m53114c == C17109a.EnumC17114e.WEBP_SIMPLE) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m107454u(ImageHeaderParser.ImageType imageType) throws IOException {
        return true;
    }
}
