package p000;

import android.content.Context;
import com.amazonaws.services.p026s3.AmazonS3Client;
/* renamed from: U43 */
/* loaded from: classes4.dex */
public final class U43 implements InterfaceC48812sj1<AmazonS3Client> {

    /* renamed from: a */
    public final P43 f36805a;

    /* renamed from: b */
    public final Y94<Context> f36806b;

    public U43(P43 p43, Y94<Context> y94) {
        this.f36805a = p43;
        this.f36806b = y94;
    }

    /* renamed from: a */
    public static U43 m82009a(P43 p43, Y94<Context> y94) {
        return new U43(p43, y94);
    }

    /* renamed from: c */
    public static AmazonS3Client m82007c(P43 p43, Context context) {
        return (AmazonS3Client) C51679xZ3.m5002e(p43.m90944f(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AmazonS3Client get() {
        return m82007c(this.f36805a, this.f36806b.get());
    }
}
