package co.bird.android.feature.bulkscanner.scan.regular;

import co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity;
import com.uber.autodispose.ScopeProvider;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: co.bird.android.feature.bulkscanner.scan.regular.c */
/* loaded from: classes3.dex */
public final class C14651c implements InterfaceC48812sj1<InterfaceC40613et3> {

    /* renamed from: a */
    public final DefaultBulkScannerActivity.C14643b f63524a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f63525b;

    /* renamed from: c */
    public final Y94<InterfaceC42324hm5> f63526c;

    /* renamed from: d */
    public final Y94<ZXingScannerView> f63527d;

    /* renamed from: e */
    public final Y94<InterfaceC42985it3> f63528e;

    public C14651c(DefaultBulkScannerActivity.C14643b c14643b, Y94<ScopeProvider> y94, Y94<InterfaceC42324hm5> y942, Y94<ZXingScannerView> y943, Y94<InterfaceC42985it3> y944) {
        this.f63524a = c14643b;
        this.f63525b = y94;
        this.f63526c = y942;
        this.f63527d = y943;
        this.f63528e = y944;
    }

    /* renamed from: a */
    public static C14651c m58567a(DefaultBulkScannerActivity.C14643b c14643b, Y94<ScopeProvider> y94, Y94<InterfaceC42324hm5> y942, Y94<ZXingScannerView> y943, Y94<InterfaceC42985it3> y944) {
        return new C14651c(c14643b, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC40613et3 m58565c(DefaultBulkScannerActivity.C14643b c14643b, ScopeProvider scopeProvider, InterfaceC42324hm5 interfaceC42324hm5, ZXingScannerView zXingScannerView, InterfaceC42985it3 interfaceC42985it3) {
        return (InterfaceC40613et3) C51679xZ3.m5002e(c14643b.m58583b(scopeProvider, interfaceC42324hm5, zXingScannerView, interfaceC42985it3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40613et3 get() {
        return m58565c(this.f63524a, this.f63525b.get(), this.f63526c.get(), this.f63527d.get(), this.f63528e.get());
    }
}
