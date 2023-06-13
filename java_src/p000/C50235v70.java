package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: v70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50235v70 implements InterfaceC38502bM4<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C8708Ve f113544a;

    public C50235v70(C8708Ve c8708Ve) {
        this.f113544a = c8708Ve;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f113544a.m79631b(byteBuffer, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        return this.f113544a.m79629d(byteBuffer, c48964sy3);
    }
}
