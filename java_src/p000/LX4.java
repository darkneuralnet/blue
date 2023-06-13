package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.wire.WireRidePassView;
import co.bird.api.request.RidePassBuyRequest;
import co.bird.api.request.UserSubscriptionCancelRecurringRequest;
import co.bird.api.request.WireRidePassTransferRequest;
import co.bird.api.response.WireRidePassTransferResponse;
import co.bird.api.response.WireRidePassUiV2Response;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.GX4;
import p000.LX4;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000eH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LLX4;", "LGX4;", "Lio/reactivex/c;", "L0", "", "linkCode", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/RidePassView;", "P0", "y0", "ridePassView", DateTokenConverter.CONVERTER_KEY, "userSubscriptionId", "C0", "Lio/reactivex/Observable;", "", "t1", "O", "O0", "clear", "LPU4;", C17296a.f69688o, "LPU4;", "ridePassClient", "LqT5;", "b", "LqT5;", "subscriptionClient", "LCX4;", "c", "LCX4;", "ridePassViewDao", "Lgl;", "Lgl;", "preference", "LTq4;", "e", "LTq4;", "reactiveConfig", "<init>", "(LPU4;LqT5;LCX4;Lgl;LTq4;)V", "co.bird.android.repository.ride-pass-view"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LX4 */
/* loaded from: classes4.dex */
public final class LX4 implements GX4 {

    /* renamed from: a */
    public final PU4 f21641a;

    /* renamed from: b */
    public final InterfaceC47478qT5 f21642b;

    /* renamed from: c */
    public final CX4 f21643c;

    /* renamed from: d */
    public final C22454gl f21644d;

    /* renamed from: e */
    public final C36207Tq4 f21645e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireRidePassUiV2Response;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/WireRidePassUiV2Response;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassViewRepositoryImpl.kt\nco/bird/android/repository/ridepassview/RidePassViewRepositoryImpl$fetchRidePassViewV2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:108\n1620#2,3:109\n1549#2:112\n1620#2,3:113\n*S KotlinDebug\n*F\n+ 1 RidePassViewRepositoryImpl.kt\nco/bird/android/repository/ridepassview/RidePassViewRepositoryImpl$fetchRidePassViewV2$1\n*L\n45#1:104\n45#1:105,3\n46#1:108\n46#1:109,3\n47#1:112\n47#1:113,3\n*E\n"})
    /* renamed from: LX4$a */
    /* loaded from: classes4.dex */
    public static final class C5022a extends Lambda implements Function1<WireRidePassUiV2Response, InterfaceC23496h> {
        public C5022a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m96662c(LX4 this$0, List ridePassList) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(ridePassList, "$ridePassList");
            return this$0.f21643c.mo110277d(ridePassList);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(WireRidePassUiV2Response response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List plus;
            int collectionSizeOrDefault3;
            final List plus2;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireRidePassView> active = response.getActive();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(active, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireRidePassView wireRidePassView : active) {
                arrayList.add(AX4.m115662a(wireRidePassView, RidePassViewStatus.ACTIVE));
            }
            List<WireRidePassView> available = response.getAvailable();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(available, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireRidePassView wireRidePassView2 : available) {
                arrayList2.add(AX4.m115662a(wireRidePassView2, RidePassViewStatus.AVAILABLE));
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
            List list = plus;
            List<WireRidePassView> ineligible = response.getIneligible();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(ineligible, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (WireRidePassView wireRidePassView3 : ineligible) {
                arrayList3.add(AX4.m115662a(wireRidePassView3, RidePassViewStatus.INELIGIBLE));
            }
            plus2 = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList3);
            AbstractC23461c mo96672O0 = LX4.this.mo96672O0();
            final LX4 lx4 = LX4.this;
            return mo96672O0.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: KX4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m96662c;
                    m96662c = LX4.C5022a.m96662c(LX4.this, plus2);
                    return m96662c;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireRidePassTransferResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireRidePassTransferResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LX4$b */
    /* loaded from: classes4.dex */
    public static final class C5023b extends Lambda implements Function1<WireRidePassTransferResponse, InterfaceC23496h> {
        public C5023b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireRidePassTransferResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return LX4.this.mo96677L0();
        }
    }

    public LX4(PU4 ridePassClient, InterfaceC47478qT5 subscriptionClient, CX4 ridePassViewDao, C22454gl preference, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(ridePassClient, "ridePassClient");
        Intrinsics.checkNotNullParameter(subscriptionClient, "subscriptionClient");
        Intrinsics.checkNotNullParameter(ridePassViewDao, "ridePassViewDao");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f21641a = ridePassClient;
        this.f21642b = subscriptionClient;
        this.f21643c = ridePassViewDao;
        this.f21644d = preference;
        this.f21645e = reactiveConfig;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m96675M1(LX4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.mo96677L0();
    }

    /* renamed from: P1 */
    public static final InterfaceC23496h m96669P1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Q1 */
    public static final InterfaceC23496h m96668Q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.GX4
    /* renamed from: C0 */
    public AbstractC23461c mo96680C0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33159G = this.f21642b.m17494a(new UserSubscriptionCancelRecurringRequest(userSubscriptionId)).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "subscriptionClient.cance…re\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.GX4
    /* renamed from: L0 */
    public AbstractC23461c mo96677L0() {
        AbstractC23442F<WireRidePassUiV2Response> m90189c = this.f21641a.m90189c();
        final C5022a c5022a = new C5022a();
        AbstractC23461c m33164B = m90189c.m33164B(new InterfaceC23492o() { // from class: IX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m96669P1;
                m96669P1 = LX4.m96669P1(Function1.this, obj);
                return m96669P1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchRidePa…}\n          )\n      }\n  }");
        return m33164B;
    }

    /* renamed from: N1 */
    public <T> Observable<T> m96674N1(Observable<T> observable) {
        return GX4.C2884a.m105027a(this, observable);
    }

    @Override // p000.GX4
    /* renamed from: O */
    public Observable<RidePassView> mo96673O(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        return m96674N1(this.f21643c.mo110276e(linkCode));
    }

    @Override // p000.GX4
    /* renamed from: O0 */
    public AbstractC23461c mo96672O0() {
        return this.f21643c.mo110279b();
    }

    /* renamed from: O1 */
    public <T> AbstractC23442F<T> m96671O1(AbstractC23442F<T> abstractC23442F) {
        return GX4.C2884a.m105026b(this, abstractC23442F);
    }

    @Override // p000.GX4
    /* renamed from: P0 */
    public AbstractC23442F<RidePassView> mo96670P0(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        AbstractC23442F<RidePassView> firstOrError = this.f21643c.mo110276e(linkCode).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "ridePassViewDao.streamRi…de)\n      .firstOrError()");
        return m96671O1(firstOrError);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f21643c.mo110280a();
    }

    @Override // p000.GX4
    /* renamed from: d */
    public AbstractC23461c mo96667d(RidePassView ridePassView) {
        Intrinsics.checkNotNullParameter(ridePassView, "ridePassView");
        PU4 pu4 = this.f21641a;
        String userRidePassId = ridePassView.getUserRidePassId();
        if (userRidePassId == null) {
            userRidePassId = "";
        }
        AbstractC23442F<WireRidePassTransferResponse> m90190b = pu4.m90190b(new WireRidePassTransferRequest(userRidePassId));
        final C5023b c5023b = new C5023b();
        AbstractC23461c m33164B = m90190b.m33164B(new InterfaceC23492o() { // from class: JX4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m96668Q1;
                m96668Q1 = LX4.m96668Q1(Function1.this, obj);
                return m96668Q1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun transferRid…tchRidePassViewV2() }\n  }");
        return m33164B;
    }

    @Override // p000.GX4
    /* renamed from: t1 */
    public Observable<List<RidePassView>> mo96666t1() {
        return m96674N1(this.f21643c.mo110278c());
    }

    @Override // p000.GX4
    /* renamed from: y0 */
    public AbstractC23461c mo96665y0(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        AbstractC23461c m33049i = this.f21641a.m90191a(new RidePassBuyRequest(linkCode)).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: HX4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m96675M1;
                m96675M1 = LX4.m96675M1(LX4.this);
                return m96675M1;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "ridePassClient.buyRidePa… fetchRidePassViewV2() })");
        return m33049i;
    }
}
