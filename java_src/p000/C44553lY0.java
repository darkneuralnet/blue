package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
/* renamed from: lY0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44553lY0 implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final C47959rH1 f96301a = C47959rH1.m16133b();

    /* renamed from: b */
    public final int f96302b;

    /* renamed from: c */
    public final int f96303c;

    /* renamed from: d */
    public final EnumC45712nV0 f96304d;

    /* renamed from: e */
    public final AbstractC38944c61 f96305e;

    /* renamed from: f */
    public final boolean f96306f;

    /* renamed from: g */
    public final UZ3 f96307g;

    /* renamed from: lY0$a */
    /* loaded from: classes5.dex */
    public class C25717a implements ImageDecoder.OnPartialImageListener {
        public C25717a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C44553lY0(int i, int i2, C48964sy3 c48964sy3) {
        boolean z;
        this.f96302b = i;
        this.f96303c = i2;
        this.f96304d = (EnumC45712nV0) c48964sy3.m13300c(C42519i61.f86738f);
        this.f96305e = (AbstractC38944c61) c48964sy3.m13300c(AbstractC38944c61.f60120h);
        C43035iy3<Boolean> c43035iy3 = C42519i61.f86742j;
        if (c48964sy3.m13300c(c43035iy3) != null && ((Boolean) c48964sy3.m13300c(c43035iy3)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f96306f = z;
        this.f96307g = (UZ3) c48964sy3.m13300c(C42519i61.f86739g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z = false;
        if (this.f96301a.m16130e(this.f96302b, this.f96303c, this.f96306f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f96304d == EnumC45712nV0.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C25717a());
        size = imageInfo.getSize();
        int i = this.f96302b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f96303c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float mo61934b = this.f96305e.mo61934b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * mo61934b);
        int round2 = Math.round(size.getHeight() * mo61934b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + mo61934b);
        }
        imageDecoder.setTargetSize(round, round2);
        UZ3 uz3 = this.f96307g;
        if (uz3 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (uz3 == UZ3.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    named2 = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named2 = ColorSpace.Named.SRGB;
                }
                colorSpace2 = ColorSpace.get(named2);
                imageDecoder.setTargetColorSpace(colorSpace2);
            } else if (i3 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
