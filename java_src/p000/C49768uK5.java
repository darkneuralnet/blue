package p000;

import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.dm7.barcodescanner.core.BarcodeScannerView;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LuK5;", "LtK5;", "LxE;", "", "fe", "i", "Lme/dm7/barcodescanner/core/BarcodeScannerView;", "b", "Lme/dm7/barcodescanner/core/BarcodeScannerView;", "scannerView", "", "c", "Z", "flashOn", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/core/BarcodeScannerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uK5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49768uK5 extends AbstractC30071xE implements InterfaceC49175tK5 {

    /* renamed from: b */
    public final BarcodeScannerView f112211b;

    /* renamed from: c */
    public boolean f112212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49768uK5(BaseActivity activity, BarcodeScannerView scannerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scannerView, "scannerView");
        this.f112211b = scannerView;
    }

    @Override // p000.InterfaceC49175tK5
    /* renamed from: fe */
    public void mo10452fe() {
        error(C45871nl4.smartlock_scan_qr_error);
    }

    @Override // p000.InterfaceC49175tK5
    /* renamed from: i */
    public void mo10451i() {
        boolean z;
        try {
            if (!this.f112212c) {
                z = true;
            } else {
                z = false;
            }
            this.f112212c = z;
            this.f112211b.setFlash(z);
        } catch (Exception e) {
            this.f112212c = true ^ this.f112212c;
            C41318g46.m40159e(e);
        }
    }
}
