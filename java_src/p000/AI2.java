package p000;

import android.app.DownloadManager;
import android.content.Context;
/* renamed from: AI2 */
/* loaded from: classes4.dex */
public final class AI2 implements InterfaceC48812sj1<DownloadManager> {

    /* renamed from: a */
    public final VH2 f365a;

    /* renamed from: b */
    public final Y94<Context> f366b;

    public AI2(VH2 vh2, Y94<Context> y94) {
        this.f365a = vh2;
        this.f366b = y94;
    }

    /* renamed from: a */
    public static AI2 m115931a(VH2 vh2, Y94<Context> y94) {
        return new AI2(vh2, y94);
    }

    /* renamed from: c */
    public static DownloadManager m115929c(VH2 vh2, Context context) {
        return (DownloadManager) C51679xZ3.m5002e(vh2.m80110F(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DownloadManager get() {
        return m115929c(this.f365a, this.f366b.get());
    }
}
