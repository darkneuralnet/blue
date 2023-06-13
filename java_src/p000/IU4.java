package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LIU4;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LWU4;", C17296a.f69688o, "LWU4;", "ridePassManager", "LEa;", "b", "LEa;", "analyticsManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "LMU4;", DateTokenConverter.CONVERTER_KEY, "LMU4;", "ui", "Le13;", "e", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LWU4;LEa;LTq4;LMU4;Le13;Lcom/uber/autodispose/ScopeProvider;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n766#2:83\n857#2,2:84\n766#2:87\n857#2,2:88\n1747#2,3:90\n1#3:86\n180#4:93\n*S KotlinDebug\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl\n*L\n39#1:83\n39#1:84,2\n40#1:87\n40#1:88,2\n50#1:90,3\n61#1:93\n*E\n"})
/* renamed from: IU4 */
/* loaded from: classes3.dex */
public final class IU4 implements FlightBanner {

    /* renamed from: a */
    public final WU4 f15758a;

    /* renamed from: b */
    public final InterfaceC1880Ea f15759b;

    /* renamed from: c */
    public final C36207Tq4 f15760c;

    /* renamed from: d */
    public final MU4 f15761d;

    /* renamed from: e */
    public final InterfaceC40099e13 f15762e;

    /* renamed from: f */
    public final ScopeProvider f15763f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePassBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl$onBannerShown$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1747#2,3:83\n*S KotlinDebug\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl$onBannerShown$2\n*L\n63#1:83,3\n*E\n"})
    /* renamed from: IU4$a */
    /* loaded from: classes3.dex */
    public static final class C3661a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<RidePassView> f15764g;

        /* renamed from: h */
        public final /* synthetic */ IU4 f15765h;

        /* renamed from: i */
        public final /* synthetic */ RidePassView f15766i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3661a(List<RidePassView> list, IU4 iu4, RidePassView ridePassView) {
            super(1);
            this.f15764g = list;
            this.f15765h = iu4;
            this.f15766i = ridePassView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List<RidePassView> list = this.f15764g;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((RidePassView) it.next()).isIneligible()) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                InterfaceC1880Ea interfaceC1880Ea = this.f15765h.f15759b;
                String userRidePassId = this.f15766i.getUserRidePassId();
                if (userRidePassId == null) {
                    userRidePassId = "";
                }
                interfaceC1880Ea.mo55905y(new UU4(null, null, null, userRidePassId, this.f15766i.getLinkCode(), "banner", "transfer", 7, null));
            } else {
                this.f15765h.f15759b.mo55905y(new C52237yV4(null, null, null, this.f15766i.getLinkCode(), 7, null));
            }
            if (this.f15765h.f15760c.m82623f8().m73665a().getRidePass().getEnabledV2()) {
                InterfaceC40099e13.C19924a.goToRidePassV4$default(this.f15765h.f15762e, null, 1, null);
            } else if (this.f15765h.f15760c.m82623f8().m73665a().getRidePass().getEnabled()) {
                this.f15765h.f15762e.mo36971o2(this.f15766i.getLinkCode());
            }
        }
    }

    public IU4(WU4 ridePassManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, MU4 ui, InterfaceC40099e13 navigator, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f15758a = ridePassManager;
        this.f15759b = analyticsManager;
        this.f15760c = reactiveConfig;
        this.f15761d = ui;
        this.f15762e = navigator;
        this.f15763f = scopeProvider;
    }

    /* renamed from: b */
    public static final void m102044b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Object first;
        List<RidePassView> value = this.f15758a.mo55503E0().getValue();
        ArrayList<RidePassView> arrayList = new ArrayList();
        for (Object obj : value) {
            if (((RidePassView) obj).isIneligible()) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        ArrayList arrayList2 = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : value) {
            if (((RidePassView) obj2).isAvailable()) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2 = arrayList3;
        }
        if (arrayList == null) {
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList);
            RidePassView ridePassView = (RidePassView) first;
            this.f15761d.mo93854b(arrayList, this.f15760c.m82623f8().m73665a().getRidePass().getEnabledV2());
            if (!arrayList.isEmpty()) {
                for (RidePassView ridePassView2 : arrayList) {
                    if (ridePassView2.isIneligible()) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                InterfaceC1880Ea interfaceC1880Ea = this.f15759b;
                String userRidePassId = ridePassView.getUserRidePassId();
                if (userRidePassId == null) {
                    userRidePassId = "";
                }
                interfaceC1880Ea.mo55905y(new VU4(null, null, null, userRidePassId, ridePassView.getLinkCode(), "banner", 7, null));
            } else {
                this.f15759b.mo55905y(new C52830zV4(null, null, null, ridePassView.getLinkCode(), 7, null));
            }
            Object m33094as = this.f15761d.mo93855a().m33094as(AutoDispose.m45239a(this.f15763f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C3661a c3661a = new C3661a(arrayList, this, ridePassView);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HU4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj3) {
                    IU4.m102044b(Function1.this, obj3);
                }
            });
        }
    }
}
