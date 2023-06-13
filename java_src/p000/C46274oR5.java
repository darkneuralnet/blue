package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: oR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46274oR5 implements InterfaceC38502bM4<InputStream, Bitmap> {

    /* renamed from: a */
    public final FA6 f101997a;

    /* renamed from: b */
    public final InterfaceC28820to f101998b;

    public C46274oR5(FA6 fa6, InterfaceC28820to interfaceC28820to) {
        this.f101997a = fa6;
        this.f101998b = interfaceC28820to;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f101997a.m107471d(inputStream, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        return this.f101997a.m107463l(inputStream, c48964sy3);
    }
}
