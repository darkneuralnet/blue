package p000;

import com.bumptech.glide.integration.webp.C17109a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* renamed from: FR5 */
/* loaded from: classes5.dex */
public class FR5 implements InterfaceC38502bM4<InputStream, GA6> {

    /* renamed from: c */
    public static final C43035iy3<Boolean> f9364c = C43035iy3.m31548f("com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a */
    public final InterfaceC38502bM4<ByteBuffer, GA6> f9365a;

    /* renamed from: b */
    public final InterfaceC28820to f9366b;

    public FR5(InterfaceC38502bM4<ByteBuffer, GA6> interfaceC38502bM4, InterfaceC28820to interfaceC28820to) {
        this.f9365a = interfaceC38502bM4;
        this.f9366b = interfaceC28820to;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<GA6> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        byte[] m96419b = C34265Li6.m96419b(inputStream);
        if (m96419b == null) {
            return null;
        }
        return this.f9365a.mo1781b(ByteBuffer.wrap(m96419b), i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        if (((Boolean) c48964sy3.m13300c(f9364c)).booleanValue()) {
            return false;
        }
        return C17109a.m53112e(C17109a.m53115b(inputStream, this.f9366b));
    }
}
