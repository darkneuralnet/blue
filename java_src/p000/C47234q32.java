package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: q32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47234q32 implements InterfaceC38502bM4<InputStream, Bitmap> {

    /* renamed from: a */
    public final C10281ZT f104603a = new C10281ZT();

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(E70.m109381b(inputStream));
        return this.f104603a.m73073c(createSource, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        return true;
    }
}
