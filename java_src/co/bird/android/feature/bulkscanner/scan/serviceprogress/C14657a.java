package co.bird.android.feature.bulkscanner.scan.serviceprogress;

import co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity;
/* renamed from: co.bird.android.feature.bulkscanner.scan.serviceprogress.a */
/* loaded from: classes3.dex */
public final class C14657a implements InterfaceC48812sj1<InterfaceC42324hm5> {

    /* renamed from: a */
    public final BulkServiceProgressScannerActivity.C14655b f63531a;

    /* renamed from: b */
    public final Y94<C48042rQ3> f63532b;

    /* renamed from: c */
    public final Y94<C42944ip2> f63533c;

    public C14657a(BulkServiceProgressScannerActivity.C14655b c14655b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        this.f63531a = c14655b;
        this.f63532b = y94;
        this.f63533c = y942;
    }

    /* renamed from: a */
    public static C14657a m58558a(BulkServiceProgressScannerActivity.C14655b c14655b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        return new C14657a(c14655b, y94, y942);
    }

    /* renamed from: b */
    public static InterfaceC42324hm5 m58557b(BulkServiceProgressScannerActivity.C14655b c14655b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        return (InterfaceC42324hm5) C51679xZ3.m5002e(c14655b.m58562a(y94, y942));
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC42324hm5 get() {
        return m58557b(this.f63531a, this.f63532b, this.f63533c);
    }
}
