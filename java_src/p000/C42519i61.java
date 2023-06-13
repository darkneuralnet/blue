package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p000.AbstractC38944c61;
import p000.JX1;
/* renamed from: i61  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42519i61 {

    /* renamed from: f */
    public static final C43035iy3<EnumC45712nV0> f86738f = C43035iy3.m31548f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC45712nV0.f100041d);

    /* renamed from: g */
    public static final C43035iy3<UZ3> f86739g = C43035iy3.m31549e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated

    /* renamed from: h */
    public static final C43035iy3<AbstractC38944c61> f86740h = AbstractC38944c61.f60120h;

    /* renamed from: i */
    public static final C43035iy3<Boolean> f86741i;

    /* renamed from: j */
    public static final C43035iy3<Boolean> f86742j;

    /* renamed from: k */
    public static final Set<String> f86743k;

    /* renamed from: l */
    public static final InterfaceC23126b f86744l;

    /* renamed from: m */
    public static final Set<ImageHeaderParser.ImageType> f86745m;

    /* renamed from: n */
    public static final Queue<BitmapFactory.Options> f86746n;

    /* renamed from: a */
    public final InterfaceC20044eU f86747a;

    /* renamed from: b */
    public final DisplayMetrics f86748b;

    /* renamed from: c */
    public final InterfaceC28820to f86749c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f86750d;

    /* renamed from: e */
    public final C47959rH1 f86751e = C47959rH1.m16133b();

    /* renamed from: i61$a */
    /* loaded from: classes5.dex */
    public class C23125a implements InterfaceC23126b {
        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: a */
        public void mo23750a() {
        }

        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: b */
        public void mo23749b(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap) {
        }
    }

    /* renamed from: i61$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC23126b {
        /* renamed from: a */
        void mo23750a();

        /* renamed from: b */
        void mo23749b(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f86741i = C43035iy3.m31548f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f86742j = C43035iy3.m31548f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f86743k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f86744l = new C23125a();
        f86745m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f86746n = C47029pi6.m18920f(0);
    }

    public C42519i61(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to) {
        this.f86750d = list;
        this.f86748b = (DisplayMetrics) C52865zZ3.m1111d(displayMetrics);
        this.f86747a = (InterfaceC20044eU) C52865zZ3.m1111d(interfaceC20044eU);
        this.f86749c = (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to);
    }

    /* renamed from: a */
    public static int m34473a(double d) {
        int m34462l = m34462l(d);
        int m34450x = m34450x(m34462l * d);
        return m34450x((d / (m34450x / m34462l)) * m34450x);
    }

    /* renamed from: c */
    public static void m34471c(ImageHeaderParser.ImageType imageType, JX1 jx1, InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU, AbstractC38944c61 abstractC38944c61, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int min;
        int floor;
        int floor2;
        if (i2 > 0 && i3 > 0) {
            if (m34456r(i)) {
                i7 = i2;
                i6 = i3;
            } else {
                i6 = i2;
                i7 = i3;
            }
            float mo61934b = abstractC38944c61.mo61934b(i6, i7, i4, i5);
            if (mo61934b > 0.0f) {
                AbstractC38944c61.EnumC13399g mo61935a = abstractC38944c61.mo61935a(i6, i7, i4, i5);
                if (mo61935a != null) {
                    float f = i6;
                    float f2 = i7;
                    int m34450x = i6 / m34450x(mo61934b * f);
                    int m34450x2 = i7 / m34450x(mo61934b * f2);
                    AbstractC38944c61.EnumC13399g enumC13399g = AbstractC38944c61.EnumC13399g.MEMORY;
                    if (mo61935a == enumC13399g) {
                        min = Math.max(m34450x, m34450x2);
                    } else {
                        min = Math.min(m34450x, m34450x2);
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
                        int i8 = max / 8;
                        if (i8 > 0) {
                            floor /= i8;
                            floor2 /= i8;
                        }
                    } else if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                        if (imageType.isWebp()) {
                            float f3 = max;
                            floor = Math.round(f / f3);
                            floor2 = Math.round(f2 / f3);
                        } else if (i6 % max == 0 && i7 % max == 0) {
                            floor = i6 / max;
                            floor2 = i7 / max;
                        } else {
                            int[] m34461m = m34461m(jx1, options, interfaceC23126b, interfaceC20044eU);
                            floor = m34461m[0];
                            floor2 = m34461m[1];
                        }
                    } else {
                        float f4 = max;
                        floor = (int) Math.floor(f / f4);
                        floor2 = (int) Math.floor(f2 / f4);
                    }
                    double mo61934b2 = abstractC38944c61.mo61934b(floor, floor2, i4, i5);
                    options.inTargetDensity = m34473a(mo61934b2);
                    options.inDensity = m34462l(mo61934b2);
                    if (m34455s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + mo61934b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo61934b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + mo61934b + " from: " + abstractC38944c61 + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]");
        }
    }

    /* renamed from: i */
    public static Bitmap m34465i(JX1 jx1, BitmapFactory.Options options, InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU) throws IOException {
        if (!options.inJustDecodeBounds) {
            interfaceC23126b.mo23750a();
            jx1.mo100306a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C49076t96.m12986f().lock();
        try {
            try {
                Bitmap mo100304c = jx1.mo100304c(options);
                C49076t96.m12986f().unlock();
                return mo100304c;
            } catch (IllegalArgumentException e) {
                IOException m34453u = m34453u(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", m34453u);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        interfaceC20044eU.mo16193c(bitmap);
                        options.inBitmap = null;
                        Bitmap m34465i = m34465i(jx1, options, interfaceC23126b, interfaceC20044eU);
                        C49076t96.m12986f().unlock();
                        return m34465i;
                    } catch (IOException unused) {
                        throw m34453u;
                    }
                }
                throw m34453u;
            }
        } catch (Throwable th) {
            C49076t96.m12986f().unlock();
            throw th;
        }
    }

    @TargetApi(19)
    /* renamed from: j */
    public static String m34464j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m34463k() {
        BitmapFactory.Options poll;
        synchronized (C42519i61.class) {
            Queue<BitmapFactory.Options> queue = f86746n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m34451w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    public static int m34462l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m34461m(JX1 jx1, BitmapFactory.Options options, InterfaceC23126b interfaceC23126b, InterfaceC20044eU interfaceC20044eU) throws IOException {
        options.inJustDecodeBounds = true;
        m34465i(jx1, options, interfaceC23126b, interfaceC20044eU);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m34460n(BitmapFactory.Options options) {
        return m34464j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m34456r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    public static boolean m34455s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: t */
    public static void m34454t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m34464j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m34460n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C49546tx2.m11169a(j));
    }

    /* renamed from: u */
    public static IOException m34453u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m34460n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m34452v(BitmapFactory.Options options) {
        m34451w(options);
        Queue<BitmapFactory.Options> queue = f86746n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m34451w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    public static int m34450x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    public static void m34449y(BitmapFactory.Options options, InterfaceC20044eU interfaceC20044eU, int i, int i2) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            }
            config = options.outConfig;
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC20044eU.mo16191e(i, i2, config);
    }

    /* renamed from: b */
    public final void m34472b(JX1 jx1, EnumC45712nV0 enumC45712nV0, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (this.f86751e.m16126i(i, i2, options, z, z2)) {
            return;
        }
        if (enumC45712nV0 != EnumC45712nV0.PREFER_ARGB_8888) {
            try {
                z3 = jx1.mo100303d().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC45712nV0, e);
                }
                z3 = false;
            }
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* renamed from: d */
    public final VL4<Bitmap> m34470d(JX1 jx1, int i, int i2, C48964sy3 c48964sy3, InterfaceC23126b interfaceC23126b) throws IOException {
        boolean z;
        byte[] bArr = (byte[]) this.f86749c.mo11761c(65536, byte[].class);
        BitmapFactory.Options m34463k = m34463k();
        m34463k.inTempStorage = bArr;
        EnumC45712nV0 enumC45712nV0 = (EnumC45712nV0) c48964sy3.m13300c(f86738f);
        UZ3 uz3 = (UZ3) c48964sy3.m13300c(f86739g);
        AbstractC38944c61 abstractC38944c61 = (AbstractC38944c61) c48964sy3.m13300c(AbstractC38944c61.f60120h);
        boolean booleanValue = ((Boolean) c48964sy3.m13300c(f86741i)).booleanValue();
        C43035iy3<Boolean> c43035iy3 = f86742j;
        if (c48964sy3.m13300c(c43035iy3) != null && ((Boolean) c48964sy3.m13300c(c43035iy3)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return C20872gU.m39360f(m34466h(jx1, m34463k, abstractC38944c61, enumC45712nV0, uz3, z, i, i2, booleanValue, interfaceC23126b), this.f86747a);
        } finally {
            m34452v(m34463k);
            this.f86749c.put(bArr);
        }
    }

    /* renamed from: e */
    public VL4<Bitmap> m34469e(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return m34470d(new JX1.C4135c(parcelFileDescriptor, this.f86750d, this.f86749c), i, i2, c48964sy3, f86744l);
    }

    /* renamed from: f */
    public VL4<Bitmap> m34468f(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3, InterfaceC23126b interfaceC23126b) throws IOException {
        return m34470d(new JX1.C4134b(inputStream, this.f86750d, this.f86749c), i, i2, c48964sy3, interfaceC23126b);
    }

    /* renamed from: g */
    public VL4<Bitmap> m34467g(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return m34470d(new JX1.C4133a(byteBuffer, this.f86750d, this.f86749c), i, i2, c48964sy3, f86744l);
    }

    /* renamed from: h */
    public final Bitmap m34466h(JX1 jx1, BitmapFactory.Options options, AbstractC38944c61 abstractC38944c61, EnumC45712nV0 enumC45712nV0, UZ3 uz3, boolean z, int i, int i2, boolean z2, InterfaceC23126b interfaceC23126b) throws IOException {
        int i3;
        int i4;
        int i5;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int round;
        int round2;
        long m11168b = C49546tx2.m11168b();
        int[] m34461m = m34461m(jx1, options, interfaceC23126b, this.f86747a);
        boolean z3 = false;
        int i6 = m34461m[0];
        int i7 = m34461m[1];
        String str2 = options.outMimeType;
        boolean z4 = (i6 == -1 || i7 == -1) ? false : z;
        int mo100305b = jx1.mo100305b();
        int m12985g = C49076t96.m12985g(mo100305b);
        boolean m12982j = C49076t96.m12982j(mo100305b);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = m34456r(m12985g) ? i7 : i6;
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            i5 = m34456r(m12985g) ? i6 : i7;
        } else {
            i5 = i3;
        }
        ImageHeaderParser.ImageType mo100303d = jx1.mo100303d();
        m34471c(mo100303d, jx1, interfaceC23126b, this.f86747a, abstractC38944c61, m12985g, i6, i7, i4, i5, options);
        m34472b(jx1, enumC45712nV0, z4, m12982j, options, i4, i5);
        int i8 = Build.VERSION.SDK_INT;
        int i9 = options.inSampleSize;
        if (m34448z(mo100303d)) {
            if (i6 < 0 || i7 < 0 || !z2) {
                float f = m34455s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i10 = options.inSampleSize;
                float f2 = i10;
                round = Math.round(((int) Math.ceil(i6 / f2)) * f);
                round2 = Math.round(((int) Math.ceil(i7 / f2)) * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + round + "x" + round2 + "] for source [" + i6 + "x" + i7 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                }
            } else {
                str = "Downsampler";
                round = i4;
                round2 = i5;
            }
            if (round > 0 && round2 > 0) {
                m34449y(options, this.f86747a, round, round2);
            }
        } else {
            str = "Downsampler";
        }
        if (uz3 != null) {
            if (i8 >= 28) {
                if (uz3 == UZ3.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z3 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i8 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap m34465i = m34465i(jx1, options, interfaceC23126b, this.f86747a);
        interfaceC23126b.mo23749b(this.f86747a, m34465i);
        if (Log.isLoggable(str, 2)) {
            m34454t(i6, i7, str2, options, m34465i, i, i2, m11168b);
        }
        if (m34465i != null) {
            m34465i.setDensity(this.f86748b.densityDpi);
            Bitmap m12981k = C49076t96.m12981k(this.f86747a, m34465i, mo100305b);
            if (m34465i.equals(m12981k)) {
                return m12981k;
            }
            this.f86747a.mo16193c(m34465i);
            return m12981k;
        }
        return null;
    }

    /* renamed from: o */
    public boolean m34459o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m53097b();
    }

    /* renamed from: p */
    public boolean m34458p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m34457q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m34448z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
