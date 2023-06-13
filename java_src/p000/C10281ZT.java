package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
/* renamed from: ZT */
/* loaded from: classes5.dex */
public final class C10281ZT implements InterfaceC38502bM4<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    public final InterfaceC20044eU f48621a = new C20426fU();

    @Override // p000.InterfaceC38502bM4
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1782a(ImageDecoder.Source source, C48964sy3 c48964sy3) throws IOException {
        return m73072d(C9417XT.m76973a(source), c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: b */
    public /* bridge */ /* synthetic */ VL4<Bitmap> mo1781b(ImageDecoder.Source source, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return m73073c(C9417XT.m76973a(source), i, i2, c48964sy3);
    }

    /* renamed from: c */
    public VL4<Bitmap> m73073c(ImageDecoder.Source source, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C44553lY0(i, i2, c48964sy3));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C20872gU(decodeBitmap, this.f48621a);
    }

    /* renamed from: d */
    public boolean m73072d(ImageDecoder.Source source, C48964sy3 c48964sy3) throws IOException {
        return true;
    }
}
