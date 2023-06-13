package p000;

import android.app.DownloadManager;
import android.os.Handler;
/* renamed from: TI2 */
/* loaded from: classes4.dex */
public final class TI2 implements InterfaceC48812sj1<InterfaceC48624sP2> {

    /* renamed from: a */
    public final VH2 f35212a;

    /* renamed from: b */
    public final Y94<UI4> f35213b;

    /* renamed from: c */
    public final Y94<Handler> f35214c;

    /* renamed from: d */
    public final Y94<DownloadManager> f35215d;

    /* renamed from: e */
    public final Y94<InterfaceC37758a61> f35216e;

    public TI2(VH2 vh2, Y94<UI4> y94, Y94<Handler> y942, Y94<DownloadManager> y943, Y94<InterfaceC37758a61> y944) {
        this.f35212a = vh2;
        this.f35213b = y94;
        this.f35214c = y942;
        this.f35215d = y943;
        this.f35216e = y944;
    }

    /* renamed from: a */
    public static TI2 m83911a(VH2 vh2, Y94<UI4> y94, Y94<Handler> y942, Y94<DownloadManager> y943, Y94<InterfaceC37758a61> y944) {
        return new TI2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC48624sP2 m83909c(VH2 vh2, UI4 ui4, Handler handler, DownloadManager downloadManager, InterfaceC37758a61 interfaceC37758a61) {
        return (InterfaceC48624sP2) C51679xZ3.m5002e(vh2.m80075Y(ui4, handler, downloadManager, interfaceC37758a61));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48624sP2 get() {
        return m83909c(this.f35212a, this.f35213b.get(), this.f35214c.get(), this.f35215d.get(), this.f35216e.get());
    }
}
