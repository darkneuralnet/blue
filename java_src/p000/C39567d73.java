package p000;

import android.content.Context;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferUtility;
import com.amazonaws.services.p026s3.AmazonS3Client;
/* renamed from: d73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39567d73 implements InterfaceC48812sj1<TransferUtility> {

    /* renamed from: a */
    public final P43 f76142a;

    /* renamed from: b */
    public final Y94<AmazonS3Client> f76143b;

    /* renamed from: c */
    public final Y94<Context> f76144c;

    public C39567d73(P43 p43, Y94<AmazonS3Client> y94, Y94<Context> y942) {
        this.f76142a = p43;
        this.f76143b = y94;
        this.f76144c = y942;
    }

    /* renamed from: a */
    public static C39567d73 m44594a(P43 p43, Y94<AmazonS3Client> y94, Y94<Context> y942) {
        return new C39567d73(p43, y94, y942);
    }

    /* renamed from: c */
    public static TransferUtility m44592c(P43 p43, AmazonS3Client amazonS3Client, Context context) {
        return (TransferUtility) C51679xZ3.m5002e(p43.m90906r1(amazonS3Client, context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public TransferUtility get() {
        return m44592c(this.f76142a, this.f76143b.get(), this.f76144c.get());
    }
}
