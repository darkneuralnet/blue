package p000;

import android.widget.ImageView;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LdT2;", "LcT2;", "LxE;", "Lio/reactivex/Observable;", "", "h0", "i", "n1", "a1", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "resultHandler", "Z1", "Ln4;", "b", "Ln4;", "binding", "", "c", "Z", "flashOn", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ln4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39767dT2 extends AbstractC30071xE implements InterfaceC39156cT2 {

    /* renamed from: b */
    public final C26356n4 f76707b;

    /* renamed from: c */
    public boolean f76708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39767dT2(BaseActivity activity, C26356n4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f76707b = binding;
    }

    @Override // p000.InterfaceC39156cT2
    /* renamed from: Z1 */
    public void mo44233Z1(ZXingScannerView.ResultHandler resultHandler) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.f76707b.f99291k.setResultHandler(resultHandler);
    }

    @Override // p000.InterfaceC39156cT2
    /* renamed from: a1 */
    public void mo44232a1() {
        this.f76707b.f99291k.stopCamera();
    }

    @Override // p000.InterfaceC39156cT2
    /* renamed from: h0 */
    public Observable<Unit> mo44231h0() {
        ImageView imageView = this.f76707b.f99285e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.flashButton");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC39156cT2
    /* renamed from: i */
    public void mo44230i() {
        boolean z;
        try {
            if (!this.f76708c) {
                z = true;
            } else {
                z = false;
            }
            this.f76708c = z;
            this.f76707b.f99291k.setFlash(z);
            if (this.f76708c) {
                this.f76707b.f99285e.setBackgroundResource(C33309Hg4.frame_rectangle_border_rounded_button_enabled);
                this.f76707b.f99285e.setColorFilter(NA0.m94301c(getActivity(), C32364Df4.white));
            } else {
                this.f76707b.f99285e.setBackgroundResource(C33309Hg4.frame_rectangle_border_rounded_button);
                this.f76707b.f99285e.setColorFilter(NA0.m94301c(getActivity(), C32364Df4.black));
            }
        } catch (Exception e) {
            this.f76708c = true ^ this.f76708c;
            C41318g46.m40159e(e);
        }
    }

    @Override // p000.InterfaceC39156cT2
    /* renamed from: n1 */
    public void mo44229n1() {
        this.f76707b.f99291k.startCamera();
    }
}
