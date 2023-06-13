package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: lR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44495lR5 implements InterfaceC38502bM4<InputStream, Bitmap> {

    /* renamed from: a */
    public final C8708Ve f96205a;

    public C44495lR5(C8708Ve c8708Ve) {
        this.f96205a = c8708Ve;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f96205a.m79632a(inputStream, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        return this.f96205a.m79630c(inputStream, c48964sy3);
    }
}
