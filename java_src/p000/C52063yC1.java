package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.security.MessageDigest;
/* renamed from: yC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52063yC1 implements InterfaceC47891r96<C49692uC1> {

    /* renamed from: b */
    public final InterfaceC47891r96<Bitmap> f118954b;

    public C52063yC1(InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        this.f118954b = (InterfaceC47891r96) C52865zZ3.m1111d(interfaceC47891r96);
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        this.f118954b.mo3854a(messageDigest);
    }

    @Override // p000.InterfaceC47891r96
    /* renamed from: b */
    public VL4<C49692uC1> mo3853b(Context context, VL4<C49692uC1> vl4, int i, int i2) {
        C49692uC1 c49692uC1 = vl4.get();
        VL4<Bitmap> c20872gU = new C20872gU(c49692uC1.m10657e(), ComponentCallbacks2C17096a.m53155c(context).m53152f());
        VL4<Bitmap> mo3853b = this.f118954b.mo3853b(context, c20872gU, i, i2);
        if (!c20872gU.equals(mo3853b)) {
            c20872gU.mo5712b();
        }
        c49692uC1.m10649m(this.f118954b, mo3853b.get());
        return vl4;
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (obj instanceof C52063yC1) {
            return this.f118954b.equals(((C52063yC1) obj).f118954b);
        }
        return false;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return this.f118954b.hashCode();
    }
}
