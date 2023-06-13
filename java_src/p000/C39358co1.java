package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* renamed from: co1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39358co1 extends AbstractC22665hU {

    /* renamed from: b */
    public static final byte[] f68241b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC38133ak2.f51105a);

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        messageDigest.update(f68241b);
    }

    @Override // p000.AbstractC22665hU
    /* renamed from: c */
    public Bitmap mo36359c(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2) {
        return C49076t96.m12987e(interfaceC20044eU, bitmap, i, i2);
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        return obj instanceof C39358co1;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return 1572326941;
    }
}
