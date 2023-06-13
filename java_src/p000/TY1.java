package p000;

import android.graphics.Matrix;
import p000.C36825Wh1;
/* renamed from: TY1 */
/* loaded from: classes.dex */
public abstract class TY1 implements InterfaceC51066wX1 {
    /* renamed from: d */
    public static InterfaceC51066wX1 m83423d(C51672xY5 c51672xY5, long j, int i, Matrix matrix) {
        return new C2497Ft(c51672xY5, j, i, matrix);
    }

    @Override // p000.InterfaceC51066wX1
    /* renamed from: a */
    public void mo3255a(C36825Wh1.C9150b c9150b) {
        c9150b.m77987m(mo3253c());
    }

    @Override // p000.InterfaceC51066wX1
    /* renamed from: b */
    public abstract C51672xY5 mo3254b();

    @Override // p000.InterfaceC51066wX1
    /* renamed from: c */
    public abstract int mo3253c();

    /* renamed from: e */
    public abstract Matrix mo83422e();

    @Override // p000.InterfaceC51066wX1
    public abstract long getTimestamp();
}
