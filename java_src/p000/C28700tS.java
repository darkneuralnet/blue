package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireRidePrice;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LtS;", "LsS;", "LxE;", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "", "maxLines", "", "Ji", "Lio/reactivex/Observable;", "G1", "", "promotionText", "holdString", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "af", "LuS;", "b", "LuS;", "getBanner", "()LuS;", "banner", "Lco/bird/android/core/mvp/BaseActivity;", "c", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(LuS;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRidePriceBannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRidePriceBannerUi.kt\nco/bird/android/app/feature/banners/ui/BirdRidePriceBannerUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* renamed from: tS */
/* loaded from: classes2.dex */
public final class C28700tS extends AbstractC30071xE implements InterfaceC28321sS {

    /* renamed from: b */
    public final InterfaceC29196uS f110483b;

    /* renamed from: c */
    public final BaseActivity f110484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28700tS(InterfaceC29196uS banner, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f110483b = banner;
        this.f110484c = activity;
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: G1 */
    public Observable<Unit> mo12374G1() {
        return this.f110483b.mo10275G1();
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: Ji */
    public void mo12373Ji(WireRidePrice wireRidePrice, int i) {
        String str;
        if (wireRidePrice != null) {
            str = C47819r24.f106320a.m16579a(this.f110483b.getContext(), wireRidePrice);
        } else {
            str = null;
        }
        this.f110483b.setPriceString(str, i);
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: af */
    public AbstractC23442F<DialogResponse> mo12372af(WireRidePrice ridePrice, String promotionText, String str) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(promotionText, "promotionText");
        String m16579a = C47819r24.f106320a.m16579a(this.f110483b.getContext(), ridePrice);
        return dialog(new C50782w24(m16579a + " " + promotionText, str), false, false);
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public BaseActivity getActivity() {
        return this.f110484c;
    }
}
