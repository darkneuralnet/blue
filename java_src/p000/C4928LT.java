package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* renamed from: LT */
/* loaded from: classes5.dex */
public class C4928LT implements InterfaceC49192tM4<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f21464a;

    /* renamed from: b */
    public final int f21465b;

    public C4928LT() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p000.InterfaceC49192tM4
    /* renamed from: a */
    public VL4<byte[]> mo9029a(VL4<Bitmap> vl4, C48964sy3 c48964sy3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vl4.get().compress(this.f21464a, this.f21465b, byteArrayOutputStream);
        vl4.mo5712b();
        return new U70(byteArrayOutputStream.toByteArray());
    }

    public C4928LT(Bitmap.CompressFormat compressFormat, int i) {
        this.f21464a = compressFormat;
        this.f21465b = i;
    }
}
