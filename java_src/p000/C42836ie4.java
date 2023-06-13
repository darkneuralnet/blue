package p000;

import android.widget.ProgressBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.widget.QuickStartSelectedBannerView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\u001b\u0010\u0011\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R>\u0010'\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\f0\f \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\f0\f\u0018\u00010\u000b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, m28432d2 = {"Lie4;", "Lhe4;", "LsS;", "", "resId", "", "", "formatArgs", "", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "G1", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "maxLines", "Ji", "promotionText", "holdString", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "af", "", "show", "k", "Lco/bird/android/widget/QuickStartSelectedBannerView;", "b", "Lco/bird/android/widget/QuickStartSelectedBannerView;", "quickStartSelectedBanner", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ProgressBar;", "secondaryProgressBar", "e", "Lio/reactivex/Observable;", "Me", "()Lio/reactivex/Observable;", "ctaClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/QuickStartSelectedBannerView;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ie4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42836ie4 implements InterfaceC42243he4, InterfaceC28321sS {

    /* renamed from: b */
    public final QuickStartSelectedBannerView f87626b;

    /* renamed from: c */
    public final /* synthetic */ C28700tS f87627c;

    /* renamed from: d */
    public final ProgressBar f87628d;

    /* renamed from: e */
    public final Observable<Unit> f87629e;

    public C42836ie4(QuickStartSelectedBannerView quickStartSelectedBanner, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(quickStartSelectedBanner, "quickStartSelectedBanner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f87626b = quickStartSelectedBanner;
        this.f87627c = new C28700tS(quickStartSelectedBanner, activity);
        this.f87628d = (ProgressBar) activity.findViewById(C36585Vg4.secondaryProgressBar);
        this.f87629e = quickStartSelectedBanner.m54463s().share();
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: G1 */
    public Observable<Unit> mo12374G1() {
        return this.f87627c.mo12374G1();
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: Ji */
    public void mo12373Ji(WireRidePrice wireRidePrice, int i) {
        this.f87627c.mo12373Ji(wireRidePrice, i);
    }

    @Override // p000.InterfaceC42243he4
    /* renamed from: Me */
    public Observable<Unit> mo33644Me() {
        return this.f87629e;
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: af */
    public AbstractC23442F<DialogResponse> mo12372af(WireRidePrice ridePrice, String promotionText, String str) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(promotionText, "promotionText");
        return this.f87627c.mo12372af(ridePrice, promotionText, str);
    }

    @Override // p000.InterfaceC28321sS
    public String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return this.f87627c.getString(i, formatArgs);
    }

    @Override // p000.InterfaceC42243he4
    /* renamed from: k */
    public void mo33643k(boolean z) {
        ProgressBar secondaryProgressBar = this.f87628d;
        Intrinsics.checkNotNullExpressionValue(secondaryProgressBar, "secondaryProgressBar");
        C49520tu6.show$default(secondaryProgressBar, z, 0, 2, null);
    }
}
