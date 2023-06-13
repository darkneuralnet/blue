package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.C17109a;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* renamed from: Ve */
/* loaded from: classes5.dex */
public class C8708Ve {

    /* renamed from: d */
    public static final C43035iy3<Boolean> f39364d = C43035iy3.m31548f("com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap", Boolean.FALSE);

    /* renamed from: a */
    public final InterfaceC28820to f39365a;

    /* renamed from: b */
    public final InterfaceC20044eU f39366b;

    /* renamed from: c */
    public final C48506sC1 f39367c;

    public C8708Ve(InterfaceC28820to interfaceC28820to, InterfaceC20044eU interfaceC20044eU) {
        this.f39365a = interfaceC28820to;
        this.f39366b = interfaceC20044eU;
        this.f39367c = new C48506sC1(interfaceC20044eU, interfaceC28820to);
    }

    /* renamed from: a */
    public VL4<Bitmap> m79632a(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        byte[] m96419b = C34265Li6.m96419b(inputStream);
        if (m96419b == null) {
            return null;
        }
        return m79631b(ByteBuffer.wrap(m96419b), i, i2, c48964sy3);
    }

    /* renamed from: b */
    public VL4<Bitmap> m79631b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        EA6 ea6 = new EA6(this.f39367c, create, byteBuffer, C34265Li6.m96420a(create.getWidth(), create.getHeight(), i, i2));
        try {
            ea6.mo12429f();
            return C20872gU.m39360f(ea6.mo12430e(), this.f39366b);
        } finally {
            ea6.clear();
        }
    }

    /* renamed from: c */
    public boolean m79630c(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f39364d)).booleanValue()) {
            return false;
        }
        return C17109a.m53112e(C17109a.m53115b(inputStream, this.f39365a));
    }

    /* renamed from: d */
    public boolean m79629d(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f39364d)).booleanValue()) {
            return false;
        }
        return C17109a.m53112e(C17109a.m53114c(byteBuffer));
    }
}
