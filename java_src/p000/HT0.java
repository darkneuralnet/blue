package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Deal;
import co.bird.android.widget.DealBannerView;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, m28432d2 = {"LHT0;", "LFT0;", "Lio/reactivex/Observable;", "", "c", "Lco/bird/android/model/Deal;", "deal", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "b", "Lco/bird/android/widget/DealBannerView;", "Lco/bird/android/widget/DealBannerView;", "dealBannerView", "<init>", "(Lco/bird/android/widget/DealBannerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HT0 */
/* loaded from: classes2.dex */
public final class HT0 implements FT0 {

    /* renamed from: a */
    public final DealBannerView f13425a;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HT0$a */
    /* loaded from: classes2.dex */
    public static final class C3150a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Integer>> {
        public C3150a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Integer> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return HT0.this.f13425a.m54583c().firstOrError();
        }
    }

    public HT0(DealBannerView dealBannerView) {
        Intrinsics.checkNotNullParameter(dealBannerView, "dealBannerView");
        this.f13425a = dealBannerView;
    }

    /* renamed from: f */
    public static final InterfaceC23447K m103831f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.FT0
    /* renamed from: a */
    public void mo103836a() {
        this.f13425a.m54584b();
        C49520tu6.m11239l(this.f13425a);
    }

    @Override // p000.FT0
    /* renamed from: b */
    public Observable<Integer> mo103835b() {
        return this.f13425a.m54583c();
    }

    @Override // p000.FT0
    /* renamed from: c */
    public Observable<Integer> mo103834c() {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f13425a, 0L, 1, null);
        final C3150a c3150a = new C3150a();
        Observable<Integer> flatMapSingle = clicksThrottle$default.flatMapSingle(new InterfaceC23492o() { // from class: GT0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103831f;
                m103831f = HT0.m103831f(Function1.this, obj);
                return m103831f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun dealClicked…aining().firstOrError() }");
        return flatMapSingle;
    }

    @Override // p000.FT0
    /* renamed from: d */
    public void mo103833d(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        this.f13425a.m54584b();
        C49520tu6.m11233r(this.f13425a);
        this.f13425a.m54585a(deal);
    }
}
