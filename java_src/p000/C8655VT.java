package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: VT */
/* loaded from: classes5.dex */
public class C8655VT implements InterfaceC40298eM4<Bitmap> {

    /* renamed from: b */
    public static final C43035iy3<Integer> f39117b = C43035iy3.m31548f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C43035iy3<Bitmap.CompressFormat> f39118c = C43035iy3.m31549e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    public final InterfaceC28820to f39119a;

    public C8655VT(InterfaceC28820to interfaceC28820to) {
        this.f39119a = interfaceC28820to;
    }

    @Override // p000.InterfaceC40298eM4
    /* renamed from: a */
    public EnumC41024fb1 mo7266a(C48964sy3 c48964sy3) {
        return EnumC41024fb1.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0021, B:12:0x004b, B:29:0x006c, B:31:0x0072, B:35:0x00be, B:36:0x00c1, B:26:0x0067), top: B:45:0x0021 }] */
    @Override // p000.InterfaceC45175mb1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo7265b(VL4<Bitmap> vl4, File file, C48964sy3 c48964sy3) {
        boolean z;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = vl4.get();
        Bitmap.CompressFormat m79868d = m79868d(bitmap, c48964sy3);
        NC1.m94203d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), m79868d);
        try {
            long m11168b = C49546tx2.m11168b();
            int intValue = ((Integer) c48964sy3.m13300c(f39117b)).intValue();
            C44860m30 c44860m30 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (this.f39119a != null) {
                    c44860m30 = new C44860m30(fileOutputStream, this.f39119a);
                } else {
                    c44860m30 = fileOutputStream;
                }
                bitmap.compress(m79868d, intValue, c44860m30);
                c44860m30.close();
                try {
                    c44860m30.close();
                } catch (IOException unused) {
                }
                z = true;
            } catch (IOException e2) {
                e = e2;
                c44860m30 = fileOutputStream;
                if (Log.isLoggable("BitmapEncoder", 3)) {
                    Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                }
                if (c44860m30 != null) {
                    try {
                        c44860m30.close();
                    } catch (IOException unused2) {
                    }
                }
                z = false;
                if (Log.isLoggable("BitmapEncoder", 2)) {
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                c44860m30 = fileOutputStream;
                if (c44860m30 != null) {
                    try {
                        c44860m30.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + m79868d + " of size " + C47029pi6.m18918h(bitmap) + " in " + C49546tx2.m11169a(m11168b) + ", options format: " + c48964sy3.m13300c(f39118c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } finally {
            NC1.m94202e();
        }
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat m79868d(Bitmap bitmap, C48964sy3 c48964sy3) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c48964sy3.m13300c(f39118c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Deprecated
    public C8655VT() {
        this.f39119a = null;
    }
}
