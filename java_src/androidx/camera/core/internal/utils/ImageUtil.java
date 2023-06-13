package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC11183i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class ImageUtil {

    /* loaded from: classes.dex */
    public static final class CodecFailedException extends Exception {

        /* renamed from: b */
        public final EnumC11229a f52696b;

        /* renamed from: androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$a */
        /* loaded from: classes.dex */
        public enum EnumC11229a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str, EnumC11229a enumC11229a) {
            super(str);
            this.f52696b = enumC11229a;
        }

        /* renamed from: a */
        public EnumC11229a m69211a() {
            return this.f52696b;
        }
    }

    private ImageUtil() {
    }

    /* renamed from: a */
    public static Rect m69229a(Size size, Rational rational) {
        int i;
        if (!m69222h(rational)) {
            C33928Jx2.m99522l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f2 / denominator) * numerator);
            int i3 = (width - round2) / 2;
            width = round2;
            i = 0;
            i2 = i3;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    /* renamed from: b */
    public static Rect m69228b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i2 - i);
        float[] m69214p = m69214p(size);
        matrix.mapPoints(m69214p);
        matrix.postTranslate(-m69217m(m69214p[0], m69214p[2], m69214p[4], m69214p[6]), -m69217m(m69214p[1], m69214p[3], m69214p[5], m69214p[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: c */
    public static Bitmap m69227c(InterfaceC11183i.InterfaceC11184a[] interfaceC11184aArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (interfaceC11184aArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Expect a single plane");
        if (interfaceC11184aArr[0].mo69477b() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        HZ3.m103736b(z2, "Expect pixelStride=4");
        if (interfaceC11184aArr[0].mo69478a() != i * 4) {
            z3 = false;
        }
        HZ3.m103736b(z3, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        interfaceC11184aArr[0].mo69476e().rewind();
        ImageProcessingUtil.m69647i(createBitmap, interfaceC11184aArr[0].mo69476e(), interfaceC11184aArr[0].mo69478a());
        return createBitmap;
    }

    /* renamed from: d */
    public static ByteBuffer m69226d(Bitmap bitmap) {
        boolean z;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.m69648h(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    /* renamed from: e */
    public static byte[] m69225e(byte[] bArr, Rect rect, int i) throws CodecFailedException {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.EnumC11229a.ENCODE_FAILED);
            }
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.EnumC11229a.DECODE_FAILED);
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.EnumC11229a.DECODE_FAILED);
        } catch (IllegalArgumentException e) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e, CodecFailedException.EnumC11229a.DECODE_FAILED);
        }
    }

    /* renamed from: f */
    public static Rational m69224f(int i, Rational rational) {
        if (i != 90 && i != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        return m69223g(rational);
    }

    /* renamed from: g */
    public static Rational m69223g(Rational rational) {
        if (rational == null) {
            return rational;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: h */
    public static boolean m69222h(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    /* renamed from: i */
    public static boolean m69221i(Size size, Rational rational) {
        if (rational != null && rational.floatValue() > 0.0f && m69220j(size, rational) && !rational.isNaN()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m69220j(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        if (height == Math.round((width / numerator) * denominator) && width == Math.round((height / denominator) * numerator)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static byte[] m69219k(InterfaceC11183i interfaceC11183i) {
        if (interfaceC11183i.getFormat() == 256) {
            ByteBuffer mo69476e = interfaceC11183i.mo69480A0()[0].mo69476e();
            byte[] bArr = new byte[mo69476e.capacity()];
            mo69476e.rewind();
            mo69476e.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC11183i.getFormat());
    }

    /* renamed from: l */
    public static byte[] m69218l(InterfaceC11183i interfaceC11183i, Rect rect, int i) throws CodecFailedException {
        if (interfaceC11183i.getFormat() == 256) {
            return m69225e(m69219k(interfaceC11183i), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC11183i.getFormat());
    }

    /* renamed from: m */
    public static float m69217m(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    /* renamed from: n */
    public static boolean m69216n(int i, int i2, int i3, int i4) {
        return (i == i3 && i2 == i4) ? false : true;
    }

    /* renamed from: o */
    public static boolean m69215o(InterfaceC11183i interfaceC11183i) {
        return m69216n(interfaceC11183i.getWidth(), interfaceC11183i.getHeight(), interfaceC11183i.getCropRect().width(), interfaceC11183i.getCropRect().height());
    }

    /* renamed from: p */
    public static float[] m69214p(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    /* renamed from: q */
    public static byte[] m69213q(InterfaceC11183i interfaceC11183i, Rect rect, int i, int i2) throws CodecFailedException {
        if (interfaceC11183i.getFormat() == 35) {
            YuvImage yuvImage = new YuvImage(m69212r(interfaceC11183i), 17, interfaceC11183i.getWidth(), interfaceC11183i.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C38705bi1 c38705bi1 = new C38705bi1(byteArrayOutputStream, C36825Wh1.m78002b(interfaceC11183i, i2));
            if (rect == null) {
                rect = new Rect(0, 0, interfaceC11183i.getWidth(), interfaceC11183i.getHeight());
            }
            if (yuvImage.compressToJpeg(rect, i, c38705bi1)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.EnumC11229a.ENCODE_FAILED);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC11183i.getFormat());
    }

    /* renamed from: r */
    public static byte[] m69212r(InterfaceC11183i interfaceC11183i) {
        InterfaceC11183i.InterfaceC11184a interfaceC11184a = interfaceC11183i.mo69480A0()[0];
        InterfaceC11183i.InterfaceC11184a interfaceC11184a2 = interfaceC11183i.mo69480A0()[1];
        InterfaceC11183i.InterfaceC11184a interfaceC11184a3 = interfaceC11183i.mo69480A0()[2];
        ByteBuffer mo69476e = interfaceC11184a.mo69476e();
        ByteBuffer mo69476e2 = interfaceC11184a2.mo69476e();
        ByteBuffer mo69476e3 = interfaceC11184a3.mo69476e();
        mo69476e.rewind();
        mo69476e2.rewind();
        mo69476e3.rewind();
        int remaining = mo69476e.remaining();
        byte[] bArr = new byte[((interfaceC11183i.getWidth() * interfaceC11183i.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < interfaceC11183i.getHeight(); i2++) {
            mo69476e.get(bArr, i, interfaceC11183i.getWidth());
            i += interfaceC11183i.getWidth();
            mo69476e.position(Math.min(remaining, (mo69476e.position() - interfaceC11183i.getWidth()) + interfaceC11184a.mo69478a()));
        }
        int height = interfaceC11183i.getHeight() / 2;
        int width = interfaceC11183i.getWidth() / 2;
        int mo69478a = interfaceC11184a3.mo69478a();
        int mo69478a2 = interfaceC11184a2.mo69478a();
        int mo69477b = interfaceC11184a3.mo69477b();
        int mo69477b2 = interfaceC11184a2.mo69477b();
        byte[] bArr2 = new byte[mo69478a];
        byte[] bArr3 = new byte[mo69478a2];
        for (int i3 = 0; i3 < height; i3++) {
            mo69476e3.get(bArr2, 0, Math.min(mo69478a, mo69476e3.remaining()));
            mo69476e2.get(bArr3, 0, Math.min(mo69478a2, mo69476e2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += mo69477b;
                i5 += mo69477b2;
            }
        }
        return bArr;
    }
}
