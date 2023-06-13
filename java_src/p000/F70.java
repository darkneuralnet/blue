package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.C17109a;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: F70 */
/* loaded from: classes5.dex */
public class F70 implements InterfaceC38502bM4<ByteBuffer, GA6> {

    /* renamed from: d */
    public static final C43035iy3<Boolean> f8760d = C43035iy3.m31548f("com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a */
    public final Context f8761a;

    /* renamed from: b */
    public final InterfaceC20044eU f8762b;

    /* renamed from: c */
    public final C48506sC1 f8763c;

    public F70(Context context, InterfaceC28820to interfaceC28820to, InterfaceC20044eU interfaceC20044eU) {
        this.f8761a = context.getApplicationContext();
        this.f8762b = interfaceC20044eU;
        this.f8763c = new C48506sC1(interfaceC20044eU, interfaceC28820to);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<GA6> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        EA6 ea6 = new EA6(this.f8763c, create, byteBuffer, C34265Li6.m96420a(create.getWidth(), create.getHeight(), i, i2), (JA6) c48964sy3.m13300c(LA6.f20844s));
        ea6.mo12429f();
        Bitmap mo12430e = ea6.mo12430e();
        if (mo12430e == null) {
            return null;
        }
        return new IA6(new GA6(this.f8761a, ea6, this.f8762b, C42245he6.m36117c(), i, i2, mo12430e));
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f8760d)).booleanValue()) {
            return false;
        }
        return C17109a.m53112e(C17109a.m53114c(byteBuffer));
    }
}
