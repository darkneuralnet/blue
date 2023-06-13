package co.bird.android.feature.bulkscanner.scan.serviceprogress;

import co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity;
import com.uber.autodispose.ScopeProvider;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
/* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.b */
/* loaded from: classes3.dex */
public final class C14658b implements InterfaceC48812sj1<InterfaceC40613et3> {

    /* renamed from: a */
    public final BulkServiceProgressScannerActivity.C14655b f63534a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f63535b;

    /* renamed from: c */
    public final Y94<InterfaceC42324hm5> f63536c;

    /* renamed from: d */
    public final Y94<ZXingScannerView> f63537d;

    /* renamed from: e */
    public final Y94<InterfaceC42985it3> f63538e;

    public C14658b(BulkServiceProgressScannerActivity.C14655b c14655b, Y94<ScopeProvider> y94, Y94<InterfaceC42324hm5> y942, Y94<ZXingScannerView> y943, Y94<InterfaceC42985it3> y944) {
        this.f63534a = c14655b;
        this.f63535b = y94;
        this.f63536c = y942;
        this.f63537d = y943;
        this.f63538e = y944;
    }

    /* renamed from: a */
    public static C14658b m58555a(BulkServiceProgressScannerActivity.C14655b c14655b, Y94<ScopeProvider> y94, Y94<InterfaceC42324hm5> y942, Y94<ZXingScannerView> y943, Y94<InterfaceC42985it3> y944) {
        return new C14658b(c14655b, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC40613et3 m58553c(BulkServiceProgressScannerActivity.C14655b c14655b, ScopeProvider scopeProvider, InterfaceC42324hm5 interfaceC42324hm5, ZXingScannerView zXingScannerView, InterfaceC42985it3 interfaceC42985it3) {
        return (InterfaceC40613et3) C51679xZ3.m5002e(c14655b.m58561b(scopeProvider, interfaceC42324hm5, zXingScannerView, interfaceC42985it3));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40613et3 get() {
        return m58553c(this.f63534a, this.f63535b.get(), this.f63536c.get(), this.f63537d.get(), this.f63538e.get());
    }
}
