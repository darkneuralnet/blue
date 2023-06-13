package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* renamed from: WL4 */
/* loaded from: classes5.dex */
public class WL4 implements InterfaceC38502bM4<Uri, Bitmap> {

    /* renamed from: a */
    public final C39706dM4 f40784a;

    /* renamed from: b */
    public final InterfaceC20044eU f40785b;

    public WL4(C39706dM4 c39706dM4, InterfaceC20044eU interfaceC20044eU) {
        this.f40784a = c39706dM4;
        this.f40785b = interfaceC20044eU;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        VL4<Drawable> mo1781b = this.f40784a.mo1781b(uri, i, i2, c48964sy3);
        if (mo1781b == null) {
            return null;
        }
        return W61.m78831a(this.f40785b, mo1781b.get(), i, i2);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(Uri uri, C48964sy3 c48964sy3) {
        return "android.resource".equals(uri.getScheme());
    }
}
