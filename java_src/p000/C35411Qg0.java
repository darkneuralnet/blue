package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* renamed from: Qg0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35411Qg0 extends AbstractC22665hU {

    /* renamed from: b */
    public static final byte[] f30742b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC38133ak2.f51105a);

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        messageDigest.update(f30742b);
    }

    @Override // p000.AbstractC22665hU
    /* renamed from: c */
    public Bitmap mo36359c(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2) {
        return C49076t96.m12990b(interfaceC20044eU, bitmap, i, i2);
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        return obj instanceof C35411Qg0;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return -599754482;
    }
}
