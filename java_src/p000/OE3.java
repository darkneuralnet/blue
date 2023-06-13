package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* renamed from: OE3 */
/* loaded from: classes5.dex */
public final class OE3 implements InterfaceC38502bM4<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C42519i61 f26256a;

    public OE3(C42519i61 c42519i61) {
        this.f26256a = c42519i61;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        return this.f26256a.m34469e(parcelFileDescriptor, i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(ParcelFileDescriptor parcelFileDescriptor, C48964sy3 c48964sy3) {
        return m92594e(parcelFileDescriptor) && this.f26256a.m34459o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m92594e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
            return true;
        }
        return false;
    }
}
