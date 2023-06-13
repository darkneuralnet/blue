package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
/* renamed from: ST */
/* loaded from: classes5.dex */
public class C7458ST implements InterfaceC40298eM4<BitmapDrawable> {

    /* renamed from: a */
    public final InterfaceC20044eU f33765a;

    /* renamed from: b */
    public final InterfaceC40298eM4<Bitmap> f33766b;

    public C7458ST(InterfaceC20044eU interfaceC20044eU, InterfaceC40298eM4<Bitmap> interfaceC40298eM4) {
        this.f33765a = interfaceC20044eU;
        this.f33766b = interfaceC40298eM4;
    }

    @Override // p000.InterfaceC40298eM4
    /* renamed from: a */
    public EnumC41024fb1 mo7266a(C48964sy3 c48964sy3) {
        return this.f33766b.mo7266a(c48964sy3);
    }

    @Override // p000.InterfaceC45175mb1
    /* renamed from: c */
    public boolean mo7265b(VL4<BitmapDrawable> vl4, File file, C48964sy3 c48964sy3) {
        return this.f33766b.mo7265b(new C20872gU(vl4.get().getBitmap(), this.f33765a), file, c48964sy3);
    }
}
