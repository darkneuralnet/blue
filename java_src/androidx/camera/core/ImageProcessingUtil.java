package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC11183i;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* renamed from: a */
    public static int f52428a;

    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    /* loaded from: classes.dex */
    public enum EnumC11147a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    private ImageProcessingUtil() {
    }

    /* renamed from: c */
    public static boolean m69653c(InterfaceC11183i interfaceC11183i) {
        if (!m69645k(interfaceC11183i)) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        } else if (m69652d(interfaceC11183i) == EnumC11147a.ERROR_CONVERSION) {
            C33928Jx2.m99531c("ImageProcessingUtil", "One pixel shift for YUV failure");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public static EnumC11147a m69652d(InterfaceC11183i interfaceC11183i) {
        int width = interfaceC11183i.getWidth();
        int height = interfaceC11183i.getHeight();
        int mo69478a = interfaceC11183i.mo69480A0()[0].mo69478a();
        int mo69478a2 = interfaceC11183i.mo69480A0()[1].mo69478a();
        int mo69478a3 = interfaceC11183i.mo69480A0()[2].mo69478a();
        int mo69477b = interfaceC11183i.mo69480A0()[0].mo69477b();
        int mo69477b2 = interfaceC11183i.mo69480A0()[1].mo69477b();
        if (nativeShiftPixel(interfaceC11183i.mo69480A0()[0].mo69476e(), mo69478a, interfaceC11183i.mo69480A0()[1].mo69476e(), mo69478a2, interfaceC11183i.mo69480A0()[2].mo69476e(), mo69478a3, mo69477b, mo69477b2, width, height, mo69477b, mo69477b2, mo69477b2) != 0) {
            return EnumC11147a.ERROR_CONVERSION;
        }
        return EnumC11147a.SUCCESS;
    }

    /* renamed from: e */
    public static InterfaceC11183i m69651e(KX1 kx1, byte[] bArr) {
        boolean z;
        if (kx1.mo69136b() == 256) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103737a(z);
        HZ3.m103731g(bArr);
        Surface mo69137a = kx1.mo69137a();
        HZ3.m103731g(mo69137a);
        if (nativeWriteJpegToSurface(bArr, mo69137a) != 0) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        InterfaceC11183i mo69131g = kx1.mo69131g();
        if (mo69131g == null) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return mo69131g;
    }

    /* renamed from: f */
    public static InterfaceC11183i m69650f(final InterfaceC11183i interfaceC11183i, KX1 kx1, ByteBuffer byteBuffer, int i, boolean z) {
        if (!m69645k(interfaceC11183i)) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!m69646j(i)) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        } else if (m69649g(interfaceC11183i, kx1.mo69137a(), byteBuffer, i, z) == EnumC11147a.ERROR_CONVERSION) {
            C33928Jx2.m99531c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        } else {
            if (Log.isLoggable("MH", 3)) {
                C33928Jx2.m99533a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f52428a)));
                f52428a++;
            }
            final InterfaceC11183i mo69131g = kx1.mo69131g();
            if (mo69131g == null) {
                C33928Jx2.m99531c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
                return null;
            }
            C43165jB5 c43165jB5 = new C43165jB5(mo69131g);
            c43165jB5.m69639a(new AbstractC11152d.InterfaceC11153a() { // from class: FX1
                @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
                /* renamed from: f */
                public final void mo43878f(InterfaceC11183i interfaceC11183i2) {
                    ImageProcessingUtil.m69644l(InterfaceC11183i.this, interfaceC11183i, interfaceC11183i2);
                }
            });
            return c43165jB5;
        }
    }

    /* renamed from: g */
    public static EnumC11147a m69649g(InterfaceC11183i interfaceC11183i, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int width = interfaceC11183i.getWidth();
        int height = interfaceC11183i.getHeight();
        int mo69478a = interfaceC11183i.mo69480A0()[0].mo69478a();
        int mo69478a2 = interfaceC11183i.mo69480A0()[1].mo69478a();
        int mo69478a3 = interfaceC11183i.mo69480A0()[2].mo69478a();
        int mo69477b = interfaceC11183i.mo69480A0()[0].mo69477b();
        int mo69477b2 = interfaceC11183i.mo69480A0()[1].mo69477b();
        if (z) {
            i2 = mo69477b;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = mo69477b2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = mo69477b2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(interfaceC11183i.mo69480A0()[0].mo69476e(), mo69478a, interfaceC11183i.mo69480A0()[1].mo69476e(), mo69478a2, interfaceC11183i.mo69480A0()[2].mo69476e(), mo69478a3, mo69477b, mo69477b2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            return EnumC11147a.ERROR_CONVERSION;
        }
        return EnumC11147a.SUCCESS;
    }

    /* renamed from: h */
    public static void m69648h(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* renamed from: i */
    public static void m69647i(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* renamed from: j */
    public static boolean m69646j(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    /* renamed from: k */
    public static boolean m69645k(InterfaceC11183i interfaceC11183i) {
        if (interfaceC11183i.getFormat() == 35 && interfaceC11183i.mo69480A0().length == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ void m69644l(InterfaceC11183i interfaceC11183i, InterfaceC11183i interfaceC11183i2, InterfaceC11183i interfaceC11183i3) {
        if (interfaceC11183i == null || interfaceC11183i2 == null) {
            return;
        }
        interfaceC11183i2.close();
    }

    /* renamed from: m */
    public static /* synthetic */ void m69643m(InterfaceC11183i interfaceC11183i, InterfaceC11183i interfaceC11183i2, InterfaceC11183i interfaceC11183i3) {
        if (interfaceC11183i == null || interfaceC11183i2 == null) {
            return;
        }
        interfaceC11183i2.close();
    }

    /* renamed from: n */
    public static InterfaceC11183i m69642n(final InterfaceC11183i interfaceC11183i, KX1 kx1, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        EnumC11147a enumC11147a;
        if (!m69645k(interfaceC11183i)) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!m69646j(i)) {
            C33928Jx2.m99531c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            EnumC11147a enumC11147a2 = EnumC11147a.ERROR_CONVERSION;
            if (i > 0) {
                enumC11147a = m69641o(interfaceC11183i, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i);
            } else {
                enumC11147a = enumC11147a2;
            }
            if (enumC11147a == enumC11147a2) {
                C33928Jx2.m99531c("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            final InterfaceC11183i mo69131g = kx1.mo69131g();
            if (mo69131g == null) {
                C33928Jx2.m99531c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                return null;
            }
            C43165jB5 c43165jB5 = new C43165jB5(mo69131g);
            c43165jB5.m69639a(new AbstractC11152d.InterfaceC11153a() { // from class: GX1
                @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
                /* renamed from: f */
                public final void mo43878f(InterfaceC11183i interfaceC11183i2) {
                    ImageProcessingUtil.m69643m(InterfaceC11183i.this, interfaceC11183i, interfaceC11183i2);
                }
            });
            return c43165jB5;
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    /* renamed from: o */
    public static EnumC11147a m69641o(InterfaceC11183i interfaceC11183i, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int width = interfaceC11183i.getWidth();
        int height = interfaceC11183i.getHeight();
        int mo69478a = interfaceC11183i.mo69480A0()[0].mo69478a();
        int mo69478a2 = interfaceC11183i.mo69480A0()[1].mo69478a();
        int mo69478a3 = interfaceC11183i.mo69480A0()[2].mo69478a();
        int mo69477b = interfaceC11183i.mo69480A0()[1].mo69477b();
        Image m110264b = DY1.m110264b(imageWriter);
        if (m110264b == null) {
            return EnumC11147a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(interfaceC11183i.mo69480A0()[0].mo69476e(), mo69478a, interfaceC11183i.mo69480A0()[1].mo69476e(), mo69478a2, interfaceC11183i.mo69480A0()[2].mo69476e(), mo69478a3, mo69477b, m110264b.getPlanes()[0].getBuffer(), m110264b.getPlanes()[0].getRowStride(), m110264b.getPlanes()[0].getPixelStride(), m110264b.getPlanes()[1].getBuffer(), m110264b.getPlanes()[1].getRowStride(), m110264b.getPlanes()[1].getPixelStride(), m110264b.getPlanes()[2].getBuffer(), m110264b.getPlanes()[2].getRowStride(), m110264b.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
            return EnumC11147a.ERROR_CONVERSION;
        }
        DY1.m110262d(imageWriter, m110264b);
        return EnumC11147a.SUCCESS;
    }
}
