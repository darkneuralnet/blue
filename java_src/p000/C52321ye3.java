package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.offer.WireCouponDeal;
import co.bird.android.model.offer.WireCouponOffer;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u000e\u0010&R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\n0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\u0018\u0010&R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00068"}, m28432d2 = {"Lye3;", "Lue3;", "Lio/reactivex/c;", "c", "", "id", "b", "Landroid/location/Location;", "userLocation", "Lio/reactivex/F;", "", "Lco/bird/android/model/offer/WireCouponOffer;", "i", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "Lpe3;", "Lpe3;", "api", "Ldr4;", "Ldr4;", "locationManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LV74;", "e", "LV74;", "promoManager", "LAG;", "f", "LAG;", "_offers", "Lio/reactivex/Observable;", "g", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "offers", "Lco/bird/android/model/offer/WireCouponDeal;", "h", "_deals", "deals", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/a;", "couponRefreshRequiredSubject", "LRh6;", "userStream", "LO01;", "destinationManager", "<init>", "(LRh6;LO01;LEa;Lpe3;Ldr4;LTq4;LV74;)V", "co.bird.android.manager.offer"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ye3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52321ye3 implements InterfaceC49950ue3 {

    /* renamed from: a */
    public final InterfaceC1880Ea f119887a;

    /* renamed from: b */
    public final InterfaceC46986pe3 f119888b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f119889c;

    /* renamed from: d */
    public final C36207Tq4 f119890d;

    /* renamed from: e */
    public final V74 f119891e;

    /* renamed from: f */
    public final C0058AG<List<WireCouponOffer>> f119892f;

    /* renamed from: g */
    public final Observable<List<WireCouponOffer>> f119893g;

    /* renamed from: h */
    public final C0058AG<List<WireCouponDeal>> f119894h;

    /* renamed from: i */
    public final Observable<List<WireCouponDeal>> f119895i;

    /* renamed from: j */
    public final C24552a<Unit> f119896j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponDeal;", "kotlin.jvm.PlatformType", "deal", "", C17296a.f69688o, "(Lco/bird/android/model/offer/WireCouponDeal;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOfferManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferManagerImpl.kt\nco/bird/android/manager/offer/OfferManagerImpl$acceptOffer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n766#2:170\n857#2,2:171\n*S KotlinDebug\n*F\n+ 1 OfferManagerImpl.kt\nco/bird/android/manager/offer/OfferManagerImpl$acceptOffer$1\n*L\n142#1:170\n142#1:171,2\n*E\n"})
    /* renamed from: ye3$a */
    /* loaded from: classes4.dex */
    public static final class C30642a extends Lambda implements Function1<WireCouponDeal, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f119898h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30642a(String str) {
            super(1);
            this.f119898h = str;
        }

        /* renamed from: a */
        public final void m3130a(WireCouponDeal wireCouponDeal) {
            List listOf;
            List plus;
            C0058AG c0058ag = C52321ye3.this.f119894h;
            Object value = C52321ye3.this.f119894h.getValue();
            Intrinsics.checkNotNull(value);
            listOf = CollectionsKt__CollectionsJVMKt.listOf(wireCouponDeal);
            plus = CollectionsKt___CollectionsKt.plus((Collection) value, (Iterable) listOf);
            c0058ag.accept(plus);
            C0058AG c0058ag2 = C52321ye3.this.f119892f;
            Object value2 = C52321ye3.this.f119892f.getValue();
            Intrinsics.checkNotNull(value2);
            String str = this.f119898h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) value2) {
                if (Intrinsics.areEqual(((WireCouponOffer) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            c0058ag2.accept(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCouponDeal wireCouponDeal) {
            m3130a(wireCouponDeal);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/offer/WireCouponOffer;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ye3$b */
    /* loaded from: classes4.dex */
    public static final class C30643b extends Lambda implements Function1<CollectionResponse<WireCouponOffer>, List<? extends WireCouponOffer>> {

        /* renamed from: g */
        public static final C30643b f119899g = new C30643b();

        public C30643b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireCouponOffer> invoke(CollectionResponse<WireCouponOffer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getItems();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ye3$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C30644c extends FunctionReferenceImpl implements Function1<List<? extends WireCouponOffer>, Unit> {
        public C30644c(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCouponOffer> list) {
            invoke2((List<WireCouponOffer>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCouponOffer> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    public C52321ye3(InterfaceC35660Rh6 userStream, O01 destinationManager, InterfaceC1880Ea analyticsManager, InterfaceC46986pe3 api, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, V74 promoManager) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(destinationManager, "destinationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        this.f119887a = analyticsManager;
        this.f119888b = api;
        this.f119889c = locationManager;
        this.f119890d = reactiveConfig;
        this.f119891e = promoManager;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C0058AG<List<WireCouponOffer>> m115950h = C0058AG.m115950h(emptyList);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(emptyList())");
        this.f119892f = m115950h;
        this.f119893g = m115950h;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        C0058AG<List<WireCouponDeal>> m115950h2 = C0058AG.m115950h(emptyList2);
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault(emptyList())");
        this.f119894h = m115950h2;
        this.f119895i = m115950h2;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f119896j = m31922e;
    }

    /* renamed from: h */
    public static final void m3134h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final List m3132j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m3131k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC49950ue3
    /* renamed from: a */
    public Observable<List<WireCouponOffer>> mo3141a() {
        return this.f119893g;
    }

    @Override // p000.InterfaceC49950ue3
    /* renamed from: b */
    public AbstractC23461c mo3140b(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC23442F<WireCouponDeal> m19017b = this.f119888b.m19017b(new C1327D1(id));
        final C30642a c30642a = new C30642a(id);
        AbstractC23461c m33159G = m19017b.m33101w(new InterfaceC23484g() { // from class: xe3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52321ye3.m3134h(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun acceptOffer…   }\n    .ignoreElement()");
        return m33159G;
    }

    @Override // p000.InterfaceC49950ue3
    /* renamed from: c */
    public AbstractC23461c mo3139c() {
        AbstractC23442F<List<WireCouponOffer>> m3133i = m3133i(this.f119889c.mo43616p().getValue());
        final C30644c c30644c = new C30644c(this.f119892f);
        AbstractC23461c m33159G = m3133i.m33101w(new InterfaceC23484g() { // from class: ve3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52321ye3.m3131k(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "loadOffersNearby(locatio…t)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.InterfaceC49950ue3
    /* renamed from: d */
    public Observable<List<WireCouponDeal>> mo3138d() {
        return this.f119895i;
    }

    /* renamed from: i */
    public final AbstractC23442F<List<WireCouponOffer>> m3133i(Location location) {
        AbstractC23442F<CollectionResponse<WireCouponOffer>> m33146T = this.f119888b.m19018a(location.getLatitude(), location.getLongitude(), this.f119890d.m82623f8().m73665a().getOfferConfig().getNearbyOfferQueryRadius()).m33146T(3L);
        final C30643b c30643b = C30643b.f119899g;
        AbstractC23442F m33157I = m33146T.m33157I(new InterfaceC23492o() { // from class: we3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m3132j;
                m3132j = C52321ye3.m3132j(Function1.this, obj);
                return m3132j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "api.offersNearby(\n      …retry(3).map { it.items }");
        return m33157I;
    }
}
