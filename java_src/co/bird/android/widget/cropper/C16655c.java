package co.bird.android.widget.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import co.bird.android.widget.cropper.CropImageView;
import com.stripe.android.core.networking.FileUploadRequest;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* renamed from: co.bird.android.widget.cropper.c */
/* loaded from: classes4.dex */
public final class C16655c {

    /* renamed from: a */
    public static final Rect f67984a = new Rect();

    /* renamed from: b */
    public static final RectF f67985b = new RectF();

    /* renamed from: c */
    public static final RectF f67986c = new RectF();

    /* renamed from: d */
    public static final float[] f67987d = new float[6];

    /* renamed from: e */
    public static final float[] f67988e = new float[6];

    /* renamed from: f */
    public static Pair<String, WeakReference<Bitmap>> f67989f;

    /* renamed from: g */
    public static int f67990g;

    /* renamed from: co.bird.android.widget.cropper.c$a */
    /* loaded from: classes4.dex */
    public static final class C16656a {

        /* renamed from: a */
        public final Bitmap f67991a;

        /* renamed from: b */
        public final int f67992b;

        public C16656a(Bitmap bitmap, int i) {
            this.f67991a = bitmap;
            this.f67992b = i;
        }
    }

    /* renamed from: co.bird.android.widget.cropper.c$b */
    /* loaded from: classes4.dex */
    public static final class C16657b {

        /* renamed from: a */
        public final Bitmap f67993a;

        /* renamed from: b */
        public final int f67994b;

        public C16657b(Bitmap bitmap, int i) {
            this.f67993a = bitmap;
            this.f67994b = i;
        }
    }

    /* renamed from: A */
    public static C16657b m54121A(Bitmap bitmap, C37059Xh1 c37059Xh1) {
        int i;
        int m76651i = c37059Xh1.m76651i("Orientation", 1);
        if (m76651i != 3) {
            if (m76651i != 6) {
                if (m76651i != 8) {
                    i = 0;
                } else {
                    i = 270;
                }
            } else {
                i = 90;
            }
        } else {
            i = 180;
        }
        return new C16657b(bitmap, i);
    }

    /* renamed from: B */
    public static C16657b m54120B(Bitmap bitmap, Context context, Uri uri) {
        C37059Xh1 c37059Xh1 = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                C37059Xh1 c37059Xh12 = new C37059Xh1(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                c37059Xh1 = c37059Xh12;
            }
        } catch (Exception unused2) {
        }
        if (c37059Xh1 != null) {
            return m54121A(bitmap, c37059Xh1);
        }
        return new C16657b(bitmap, 0);
    }

    /* renamed from: C */
    public static void m54119C(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) throws FileNotFoundException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            m54115c(outputStream);
        }
    }

    /* renamed from: D */
    public static Uri m54118D(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        try {
            if (uri == null) {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } else if (new File(uri.getPath()).exists()) {
                z = false;
            }
            if (z) {
                m54119C(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception e) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
            return null;
        }
    }

    /* renamed from: a */
    public static int m54117a(int i, int i2) {
        if (f67990g == 0) {
            f67990g = m54103o();
        }
        int i3 = 1;
        if (f67990g > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f67990g;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public static int m54116b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: c */
    public static void m54115c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static C16656a m54114d(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        int i8 = 1;
        do {
            try {
                return m54113e(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                i8 *= 2;
                if (i8 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + FileUploadRequest.LINE_BREAK + e.getMessage(), e);
                }
            }
        } while (i8 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + FileUploadRequest.LINE_BREAK + e.getMessage(), e);
    }

    /* renamed from: e */
    public static C16656a m54113e(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) {
        int width;
        int height;
        int i9;
        Bitmap bitmap;
        Rect m54099s = m54099s(fArr, i2, i3, z, i4, i5);
        if (i6 > 0) {
            width = i6;
        } else {
            width = m54099s.width();
        }
        if (i7 > 0) {
            height = i7;
        } else {
            height = m54099s.height();
        }
        Bitmap bitmap2 = null;
        try {
            C16656a m54105m = m54105m(context, uri, m54099s, width, height, i8);
            bitmap2 = m54105m.f67991a;
            i9 = m54105m.f67992b;
        } catch (Exception unused) {
            i9 = 1;
        }
        int i10 = i9;
        if (bitmap2 != null) {
            try {
                Bitmap m54092z = m54092z(bitmap2, i, z2, z3);
                try {
                    if (i % 90 != 0) {
                        m54092z = m54109i(m54092z, fArr, m54099s, i, z, i4, i5);
                    }
                    return new C16656a(m54092z, i10);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    throw e;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
            }
        } else {
            return m54112f(context, uri, fArr, i, z, i4, i5, i8, m54099s, width, height, z2, z3);
        }
    }

    /* renamed from: f */
    public static C16656a m54112f(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int m54116b = m54116b(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = m54116b;
            Bitmap m54108j = m54108j(context.getContentResolver(), uri, options);
            if (m54108j != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = fArr2[i7] / options.inSampleSize;
                    }
                    bitmap = m54110h(m54108j, fArr2, i, z, i2, i3, 1.0f, z2, z3);
                    if (bitmap != m54108j) {
                        m54108j.recycle();
                    }
                } catch (Throwable th) {
                    m54108j.recycle();
                    throw th;
                }
            }
            return new C16656a(bitmap, m54116b);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + FileUploadRequest.LINE_BREAK + e.getMessage(), e);
        } catch (OutOfMemoryError e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    /* renamed from: g */
    public static C16656a m54111g(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new C16656a(m54110h(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e;
                }
            }
        } while (i4 > 8);
        throw e;
    }

    /* renamed from: h */
    public static Bitmap m54110h(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2;
        float f3 = f;
        Rect m54099s = m54099s(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        if (z2) {
            f2 = -f3;
        } else {
            f2 = f3;
        }
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f2, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, m54099s.left, m54099s.top, m54099s.width(), m54099s.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        if (i % 90 != 0) {
            return m54109i(createBitmap, fArr, m54099s, i, z, i2, i3);
        }
        return createBitmap;
    }

    /* renamed from: i */
    public static Bitmap m54109i(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i % 90 != 0) {
            double radians = Math.toRadians(i);
            if (i >= 90 && (i <= 180 || i >= 270)) {
                i4 = rect.right;
            } else {
                i4 = rect.left;
            }
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 < fArr.length) {
                    float f = fArr[i9];
                    if (f >= i4 - 1 && f <= i4 + 1) {
                        int i10 = i9 + 1;
                        i8 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i10]));
                        i6 = (int) Math.abs(Math.cos(radians) * (fArr[i10] - rect.top));
                        i7 = (int) Math.abs((fArr[i10] - rect.top) / Math.sin(radians));
                        i5 = (int) Math.abs((rect.bottom - fArr[i10]) / Math.cos(radians));
                        break;
                    }
                    i9 += 2;
                } else {
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    break;
                }
            }
            rect.set(i8, i6, i7 + i8, i5 + i6);
            if (z) {
                m54104n(rect, i2, i3);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    /* renamed from: j */
    public static Bitmap m54108j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, f67984a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    m54115c(inputStream);
                    if (options.inSampleSize > 512) {
                        throw new RuntimeException("Failed to decode image: " + uri);
                    }
                }
            } finally {
                m54115c(inputStream);
            }
        } while (options.inSampleSize > 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    /* renamed from: k */
    public static BitmapFactory.Options m54107k(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f67984a, options);
                options.inJustDecodeBounds = false;
                m54115c(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                m54115c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: l */
    public static C16656a m54106l(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options m54107k = m54107k(contentResolver, uri);
            m54107k.inSampleSize = Math.max(m54116b(m54107k.outWidth, m54107k.outHeight, i, i2), m54117a(m54107k.outWidth, m54107k.outHeight));
            return new C16656a(m54108j(contentResolver, uri, m54107k), m54107k.inSampleSize);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + FileUploadRequest.LINE_BREAK + e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C16656a m54105m(Context context, Uri uri, Rect rect, int i, int i2, int i3) {
        BitmapRegionDecoder bitmapRegionDecoder;
        int i4;
        InputStream inputStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3 * m54116b(rect.width(), rect.height(), i, i2);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                bitmapRegionDecoder = BitmapRegionDecoder.newInstance(openInputStream, false);
                do {
                    try {
                        try {
                            C16656a c16656a = new C16656a(bitmapRegionDecoder.decodeRegion(rect, options), options.inSampleSize);
                            m54115c(openInputStream);
                            bitmapRegionDecoder.recycle();
                            return c16656a;
                        } catch (OutOfMemoryError unused) {
                            i4 = options.inSampleSize * 2;
                            options.inSampleSize = i4;
                            if (i4 > 512) {
                                m54115c(openInputStream);
                                if (bitmapRegionDecoder != null) {
                                }
                                return new C16656a(null, 1);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        inputStream = openInputStream;
                        try {
                            throw new RuntimeException("Failed to load sampled bitmap: " + uri + FileUploadRequest.LINE_BREAK + e.getMessage(), e);
                        } catch (Throwable th) {
                            th = th;
                            m54115c(inputStream);
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = openInputStream;
                        m54115c(inputStream);
                        if (bitmapRegionDecoder != null) {
                        }
                        throw th;
                    }
                } while (i4 > 512);
                m54115c(openInputStream);
                if (bitmapRegionDecoder != null) {
                    bitmapRegionDecoder.recycle();
                }
                return new C16656a(null, 1);
            } catch (Exception e2) {
                e = e2;
                bitmapRegionDecoder = null;
            } catch (Throwable th3) {
                th = th3;
                bitmapRegionDecoder = null;
            }
        } catch (Exception e3) {
            e = e3;
            bitmapRegionDecoder = null;
        } catch (Throwable th4) {
            th = th4;
            bitmapRegionDecoder = null;
        }
    }

    /* renamed from: n */
    public static void m54104n(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: o */
    public static int m54103o() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            int i = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i, iArr);
            int[] iArr2 = new int[1];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr[0]; i3++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i3], 12332, iArr2);
                int i4 = iArr2[0];
                if (i2 < i4) {
                    i2 = i4;
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i2, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* renamed from: p */
    public static float m54102p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: q */
    public static float m54101q(float[] fArr) {
        return (m54096v(fArr) + m54097u(fArr)) / 2.0f;
    }

    /* renamed from: r */
    public static float m54100r(float[] fArr) {
        return (m54102p(fArr) + m54095w(fArr)) / 2.0f;
    }

    /* renamed from: s */
    public static Rect m54099s(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, m54097u(fArr))), Math.round(Math.max(0.0f, m54095w(fArr))), Math.round(Math.min(i, m54096v(fArr))), Math.round(Math.min(i2, m54102p(fArr))));
        if (z) {
            m54104n(rect, i3, i4);
        }
        return rect;
    }

    /* renamed from: t */
    public static float m54098t(float[] fArr) {
        return m54102p(fArr) - m54095w(fArr);
    }

    /* renamed from: u */
    public static float m54097u(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: v */
    public static float m54096v(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: w */
    public static float m54095w(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: x */
    public static float m54094x(float[] fArr) {
        return m54096v(fArr) - m54097u(fArr);
    }

    /* renamed from: y */
    public static Bitmap m54093y(Bitmap bitmap, int i, int i2, CropImageView.EnumC16647h enumC16647h) {
        Bitmap createScaledBitmap;
        if (i > 0 && i2 > 0) {
            try {
                CropImageView.EnumC16647h enumC16647h2 = CropImageView.EnumC16647h.RESIZE_FIT;
                if (enumC16647h == enumC16647h2 || enumC16647h == CropImageView.EnumC16647h.RESIZE_INSIDE || enumC16647h == CropImageView.EnumC16647h.RESIZE_EXACT) {
                    if (enumC16647h == CropImageView.EnumC16647h.RESIZE_EXACT) {
                        createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i, height / i2);
                        if (max <= 1.0f && enumC16647h != enumC16647h2) {
                            createScaledBitmap = null;
                        }
                        createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                    }
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != bitmap) {
                            bitmap.recycle();
                        }
                        return createScaledBitmap;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    /* renamed from: z */
    public static Bitmap m54092z(Bitmap bitmap, int i, boolean z, boolean z2) {
        float f;
        if (i <= 0 && !z && !z2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        float f2 = -1.0f;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (!z2) {
            f2 = 1.0f;
        }
        matrix.postScale(f, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
