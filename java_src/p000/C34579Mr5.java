package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.widget.SelectedBirdRidePriceBannerView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\u001b\u0010\u0011\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0096\u0001R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LMr5;", "LLr5;", "LsS;", "", "resId", "", "", "formatArgs", "", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "G1", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "maxLines", "Ji", "promotionText", "holdString", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "af", "Lco/bird/android/widget/SelectedBirdRidePriceBannerView;", "b", "Lco/bird/android/widget/SelectedBirdRidePriceBannerView;", "selectedBirdRidePriceBanner", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/SelectedBirdRidePriceBannerView;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mr5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34579Mr5 implements InterfaceC34345Lr5, InterfaceC28321sS {

    /* renamed from: b */
    public final SelectedBirdRidePriceBannerView f23681b;

    /* renamed from: c */
    public final /* synthetic */ C28700tS f23682c;

    public C34579Mr5(SelectedBirdRidePriceBannerView selectedBirdRidePriceBanner, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(selectedBirdRidePriceBanner, "selectedBirdRidePriceBanner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23681b = selectedBirdRidePriceBanner;
        this.f23682c = new C28700tS(selectedBirdRidePriceBanner, activity);
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: G1 */
    public Observable<Unit> mo12374G1() {
        return this.f23682c.mo12374G1();
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: Ji */
    public void mo12373Ji(WireRidePrice wireRidePrice, int i) {
        this.f23682c.mo12373Ji(wireRidePrice, i);
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: af */
    public AbstractC23442F<DialogResponse> mo12372af(WireRidePrice ridePrice, String promotionText, String str) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(promotionText, "promotionText");
        return this.f23682c.mo12372af(ridePrice, promotionText, str);
    }

    @Override // p000.InterfaceC28321sS
    public String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return this.f23682c.getString(i, formatArgs);
    }
}
