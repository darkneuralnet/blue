package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.widget.ReservationBannerView;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\u001b\u0010\u0011\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, m28432d2 = {"LsK4;", "LqK4;", "LsS;", "", "resId", "", "", "formatArgs", "", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "G1", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "maxLines", "Ji", "promotionText", "holdString", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "af", "", "show", "k", "Lco/bird/android/widget/ReservationBannerView;", "b", "Lco/bird/android/widget/ReservationBannerView;", "reservationBannerView", "Lco/bird/android/widget/ReservationBannerView$a;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "De", "()Lio/reactivex/Observable;", "bannerCtaClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/ReservationBannerView;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sK4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48581sK4 implements InterfaceC47396qK4, InterfaceC28321sS {

    /* renamed from: b */
    public final ReservationBannerView f108600b;

    /* renamed from: c */
    public final /* synthetic */ C28700tS f108601c;

    /* renamed from: d */
    public final Observable<ReservationBannerView.EnumC16574a> f108602d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/widget/ReservationBannerView$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/widget/ReservationBannerView$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sK4$a */
    /* loaded from: classes2.dex */
    public static final class C28262a extends Lambda implements Function1<Unit, ReservationBannerView.EnumC16574a> {
        public C28262a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ReservationBannerView.EnumC16574a invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C48581sK4.this.f108600b.m54404u();
        }
    }

    public C48581sK4(ReservationBannerView reservationBannerView, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(reservationBannerView, "reservationBannerView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f108600b = reservationBannerView;
        this.f108601c = new C28700tS(reservationBannerView, activity);
        Observable<Unit> m54406s = reservationBannerView.m54406s();
        final C28262a c28262a = new C28262a();
        Observable<ReservationBannerView.EnumC16574a> share = m54406s.map(new InterfaceC23492o() { // from class: rK4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ReservationBannerView.EnumC16574a m14389b;
                m14389b = C48581sK4.m14389b(Function1.this, obj);
                return m14389b;
            }
        }).share();
        Intrinsics.checkNotNullExpressionValue(share, "reservationBannerView.ct…ew.currentState }.share()");
        this.f108602d = share;
    }

    /* renamed from: b */
    public static final ReservationBannerView.EnumC16574a m14389b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ReservationBannerView.EnumC16574a) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47396qK4
    /* renamed from: De */
    public Observable<ReservationBannerView.EnumC16574a> mo14391De() {
        return this.f108602d;
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: G1 */
    public Observable<Unit> mo12374G1() {
        return this.f108601c.mo12374G1();
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: Ji */
    public void mo12373Ji(WireRidePrice wireRidePrice, int i) {
        this.f108601c.mo12373Ji(wireRidePrice, i);
    }

    @Override // p000.InterfaceC28321sS
    /* renamed from: af */
    public AbstractC23442F<DialogResponse> mo12372af(WireRidePrice ridePrice, String promotionText, String str) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(promotionText, "promotionText");
        return this.f108601c.mo12372af(ridePrice, promotionText, str);
    }

    @Override // p000.InterfaceC28321sS
    public String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return this.f108601c.getString(i, formatArgs);
    }

    @Override // p000.InterfaceC47396qK4
    /* renamed from: k */
    public void mo14388k(boolean z) {
        this.f108600b.m54403v(z);
    }
}
