package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: y70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52014y70 implements InterfaceC38502bM4<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C10281ZT f118782a = new C10281ZT();

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f118782a.m73073c(createSource, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        return true;
    }
}
