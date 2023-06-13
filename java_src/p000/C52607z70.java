package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: z70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52607z70 implements InterfaceC38502bM4<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final FA6 f120829a;

    public C52607z70(FA6 fa6) {
        this.f120829a = fa6;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f120829a.m107471d(E70.m109376g(byteBuffer), i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        return this.f120829a.m107462m(byteBuffer, c48964sy3);
    }
}
