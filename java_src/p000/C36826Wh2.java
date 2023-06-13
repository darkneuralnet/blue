package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import java.io.IOException;
import java.util.Objects;
/* renamed from: Wh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36826Wh2 implements InterfaceC37529Zh3<MD3<byte[]>, MD3<Bitmap>> {
    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<Bitmap> apply(MD3<byte[]> md3) throws ImageCaptureException {
        Rect mo80667b = md3.mo80667b();
        Bitmap m77980b = m77980b(md3.mo80666c(), mo80667b);
        C36357Uh1 mo80665d = md3.mo80665d();
        Objects.requireNonNull(mo80665d);
        return MD3.m95565j(m77980b, mo80665d, new Rect(0, 0, m77980b.getWidth(), m77980b.getHeight()), md3.mo80663f(), C46705p96.m19857r(md3.mo80662g(), mo80667b), md3.mo80668a());
    }

    /* renamed from: b */
    public final Bitmap m77980b(byte[] bArr, Rect rect) throws ImageCaptureException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
        }
    }
}
