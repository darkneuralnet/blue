package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: w70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50828w70 implements InterfaceC38502bM4<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C42519i61 f115382a;

    public C50828w70(C42519i61 c42519i61) {
        this.f115382a = c42519i61;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f115382a.m34467g(byteBuffer, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) {
        return this.f115382a.m34457q(byteBuffer);
    }
}
