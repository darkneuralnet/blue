package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
@KeepForSdk
/* renamed from: pX1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46917pX1 {

    /* renamed from: a */
    public static final C46917pX1 f103778a = new C46917pX1();

    private C46917pX1() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static ByteBuffer m19148a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @KeepForSdk
    /* renamed from: g */
    public static C46917pX1 m19142g() {
        return f103778a;
    }

    @KeepForSdk
    /* renamed from: j */
    public static Bitmap m19139j(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] m19136m = m19136m(m19138k(byteBuffer, true).array(), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m19136m, 0, m19136m.length);
        return m19137l(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @KeepForSdk
    /* renamed from: k */
    public static ByteBuffer m19138k(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer allocateDirect;
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        if (z) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocateDirect.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocateDirect.put(i + i4, byteBuffer.get(((i4 % 2) * i2) + i + (i4 / 2)));
        }
        return allocateDirect;
    }

    /* renamed from: l */
    public static Bitmap m19137l(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    /* renamed from: m */
    public static byte[] m19136m(byte[] bArr, int i, int i2) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e);
        }
    }

    /* renamed from: n */
    public static final void m19135n(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i5 = i / (i2 / limit);
        int i6 = 0;
        for (int i7 = 0; i7 < limit; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public byte[] m19147b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    @KeepForSdk
    /* renamed from: c */
    public ByteBuffer m19146c(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        Preconditions.checkNotNull(byteBuffer);
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            allocate = ByteBuffer.allocateDirect(capacity);
        } else {
            allocate = ByteBuffer.allocate(capacity);
        }
        allocate.limit(byteBuffer.limit());
        allocate.put((ByteBuffer) byteBuffer.rewind());
        allocate.position(position);
        byteBuffer.position(position);
        return allocate;
    }

    @KeepForSdk
    /* renamed from: d */
    public Bitmap m19145d(Image image, int i) {
        boolean z;
        if (image.getFormat() == 256) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes != null && planes.length == 1) {
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            return m19137l(decodeByteArray, i, decodeByteArray.getWidth(), decodeByteArray.getHeight());
        }
        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
    }

    @KeepForSdk
    /* renamed from: e */
    public ByteBuffer m19144e(C41304g32 c41304g32, boolean z) throws MlKitException {
        ByteBuffer allocateDirect;
        Bitmap.Config config;
        int m40242g = c41304g32.m40242g();
        if (m40242g != -1) {
            if (m40242g != 17) {
                if (m40242g != 35) {
                    if (m40242g == 842094169) {
                        return m19138k((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e()), z);
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return m19140i((Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j()), c41304g32.m40237l(), c41304g32.m40241h());
            } else if (z) {
                return m19148a((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e()));
            } else {
                return (ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e());
            }
        }
        Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(c41304g32.m40245d());
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i;
        if (z) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < height; i4++) {
            int i5 = 0;
            while (i5 < width) {
                int i6 = iArr[i3];
                int i7 = i6 >> 16;
                int i8 = i6 >> 8;
                int i9 = i6 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i10 = i2 + 1;
                int i11 = i7 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i12 = i8 & KotlinVersion.MAX_COMPONENT_VALUE;
                allocateDirect.put(i2, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, (((((i11 * 66) + (i12 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                if (i4 % 2 == 0 && i3 % 2 == 0) {
                    int i13 = i11 * 112;
                    int i14 = i + 1;
                    allocateDirect.put(i, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, ((((i13 - (i12 * 94)) - (i9 * 18)) + 128) >> 8) + 128));
                    i = i14 + 1;
                    allocateDirect.put(i14, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, (((((i11 * (-38)) - (i12 * 74)) + (i9 * 112)) + 128) >> 8) + 128));
                }
                i3++;
                i5++;
                i2 = i10;
            }
        }
        return allocateDirect;
    }

    @KeepForSdk
    /* renamed from: f */
    public Bitmap m19143f(C41304g32 c41304g32) throws MlKitException {
        int m40242g = c41304g32.m40242g();
        if (m40242g != -1) {
            if (m40242g != 17) {
                if (m40242g != 35) {
                    if (m40242g == 842094169) {
                        return m19139j((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e()), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k());
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return m19141h(m19140i((Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j()), c41304g32.m40237l(), c41304g32.m40241h()), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k());
            }
            return m19141h((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e()), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k());
        }
        return m19137l((Bitmap) Preconditions.checkNotNull(c41304g32.m40245d()), c41304g32.m40238k(), c41304g32.m40237l(), c41304g32.m40241h());
    }

    @KeepForSdk
    /* renamed from: h */
    public Bitmap m19141h(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] m19136m = m19136m(m19147b(byteBuffer), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m19136m, 0, m19136m.length);
        return m19137l(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @KeepForSdk
    /* renamed from: i */
    public ByteBuffer m19140i(Image.Plane[] planeArr, int i, int i2) {
        boolean z;
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        if (buffer2.remaining() == i5 - 2 && buffer2.compareTo(buffer) == 0) {
            z = true;
        } else {
            z = false;
        }
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            m19135n(planeArr[0], i, i2, bArr, 0, 1);
            m19135n(planeArr[1], i, i2, bArr, i3 + 1, 2);
            m19135n(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
