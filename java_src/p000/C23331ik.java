package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
/* renamed from: ik */
/* loaded from: classes4.dex */
public final class C23331ik implements InterfaceC48812sj1<GoogleSignInClient> {

    /* renamed from: a */
    public final C22711hj f87800a;

    /* renamed from: b */
    public final Y94<Context> f87801b;

    public C23331ik(C22711hj c22711hj, Y94<Context> y94) {
        this.f87800a = c22711hj;
        this.f87801b = y94;
    }

    /* renamed from: a */
    public static C23331ik m33530a(C22711hj c22711hj, Y94<Context> y94) {
        return new C23331ik(c22711hj, y94);
    }

    /* renamed from: c */
    public static GoogleSignInClient m33528c(C22711hj c22711hj, Context context) {
        return (GoogleSignInClient) C51679xZ3.m5002e(c22711hj.m36004b0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public GoogleSignInClient get() {
        return m33528c(this.f87800a, this.f87801b.get());
    }
}
