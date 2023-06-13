package co.bird.android.feature.bulkscanner.scan.regular;

import co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity;
/* renamed from: co.bird.android.feature.bulkscanner.scan.regular.b */
/* loaded from: classes3.dex */
public final class C14650b implements InterfaceC48812sj1<InterfaceC42324hm5> {

    /* renamed from: a */
    public final DefaultBulkScannerActivity.C14643b f63521a;

    /* renamed from: b */
    public final Y94<C48042rQ3> f63522b;

    /* renamed from: c */
    public final Y94<C42944ip2> f63523c;

    public C14650b(DefaultBulkScannerActivity.C14643b c14643b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        this.f63521a = c14643b;
        this.f63522b = y94;
        this.f63523c = y942;
    }

    /* renamed from: a */
    public static C14650b m58570a(DefaultBulkScannerActivity.C14643b c14643b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        return new C14650b(c14643b, y94, y942);
    }

    /* renamed from: b */
    public static InterfaceC42324hm5 m58569b(DefaultBulkScannerActivity.C14643b c14643b, Y94<C48042rQ3> y94, Y94<C42944ip2> y942) {
        return (InterfaceC42324hm5) C51679xZ3.m5002e(c14643b.m58584a(y94, y942));
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC42324hm5 get() {
        return m58569b(this.f63521a, this.f63522b, this.f63523c);
    }
}
