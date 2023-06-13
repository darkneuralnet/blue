package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import androidx.camera.core.InterfaceC11183i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p000.C34170Ky1;
/* renamed from: nU */
/* loaded from: classes4.dex */
public class C26526nU {
    /* renamed from: a */
    public static boolean m23624a(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        boolean z = true;
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        z = (buffer2.remaining() == ((i3 * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0) ? false : false;
        buffer2.position(position);
        buffer.limit(limit);
        return z;
    }

    /* renamed from: b */
    public static Bitmap m23623b(InterfaceC11183i interfaceC11183i, int i) {
        return m23622c(m23619f(interfaceC11183i.mo69479k3().getPlanes(), interfaceC11183i.getWidth(), interfaceC11183i.getHeight()), new C34170Ky1.C4651a().m98034d(interfaceC11183i.getWidth()).m98036b(interfaceC11183i.getHeight()).m98035c(interfaceC11183i.mo40428i1().mo3253c()).m98037a(), i);
    }

    /* renamed from: c */
    public static Bitmap m23622c(ByteBuffer byteBuffer, C34170Ky1 c34170Ky1, int i) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, c34170Ky1.m98038c(), c34170Ky1.m98040a(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, c34170Ky1.m98038c(), c34170Ky1.m98040a()), i, byteArrayOutputStream);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            return m23621d(decodeByteArray, c34170Ky1.m98039b(), false, false);
        } catch (Exception e) {
            Log.e("VisionProcessorBase", "Error: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static Bitmap m23621d(Bitmap bitmap, int i, boolean z, boolean z2) {
        float f;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
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
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: e */
    public static void m23620e(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
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

    /* renamed from: f */
    public static ByteBuffer m23619f(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[((i3 / 4) * 2) + i3];
        if (m23624a(planeArr, i, i2)) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer.get(bArr, i3 + 1, ((i3 * 2) / 4) - 1);
        } else {
            m23620e(planeArr[0], i, i2, bArr, 0, 1);
            m23620e(planeArr[1], i, i2, bArr, i3 + 1, 2);
            m23620e(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
