package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireBounty;
import co.bird.android.model.wire.WireBountyFlightSheetDetails;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.api.request.DesignatedBountyRequest;
import co.bird.api.request.IdsRequest;
import co.bird.api.request.OperatorMapRequest;
import co.bird.api.request.SurplusIdRequest;
import co.bird.api.response.OperatorMapResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.Y00;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0013H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u001b\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m28432d2 = {"LY00;", "LT00;", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "", "bypassFilterBountyIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "a1", "bountyId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "X", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/BountyMapMarker;", "v0", "surplusId", "", "Z", "bountyIds", "o1", "b1", "I1", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LtW5;", "b", "LtW5;", "surplusClient", "Ly00;", "c", "Ly00;", "bountyClient", "LK00;", DateTokenConverter.CONVERTER_KEY, "LK00;", "bountyFlightSheetDetailsDao", "LM00;", "e", "LM00;", "bountyMapMarkerDao", "<init>", "(LTk3;LtW5;Ly00;LK00;LM00;)V", "bounty_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl\n*L\n49#1:104\n49#1:105,3\n*E\n"})
/* renamed from: Y00 */
/* loaded from: classes4.dex */
public final class Y00 implements T00 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f44413a;

    /* renamed from: b */
    public final InterfaceC49283tW5 f44414b;

    /* renamed from: c */
    public final InterfaceC51944y00 f44415c;

    /* renamed from: d */
    public final K00 f44416d;

    /* renamed from: e */
    public final M00 f44417e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBountyFlightSheetDetails;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBountyFlightSheetDetails;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y00$a */
    /* loaded from: classes4.dex */
    public static final class C9589a extends Lambda implements Function1<WireBountyFlightSheetDetails, InterfaceC23447K<? extends BountyFlightSheetDetails>> {

        /* renamed from: h */
        public final /* synthetic */ String f44419h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9589a(String str) {
            super(1);
            this.f44419h = str;
        }

        /* renamed from: c */
        public static final InterfaceC23447K m75869c(Y00 this$0, String bountyId) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bountyId, "$bountyId");
            return this$0.f44416d.mo97951a(bountyId);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends BountyFlightSheetDetails> invoke(WireBountyFlightSheetDetails it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo97949c = Y00.this.f44416d.mo97949c(C52537z00.m2124a(it, this.f44419h));
            final Y00 y00 = Y00.this;
            final String str = this.f44419h;
            return mo97949c.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: X00
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m75869c;
                    m75869c = Y00.C9589a.m75869c(Y00.this, str);
                    return m75869c;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapResponse;", "operatorMapResponse", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl$fetchBounties$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:108\n1620#2,3:109\n37#3,2:112\n*S KotlinDebug\n*F\n+ 1 BountyRepositoryImpl.kt\nco/bird/android/repository/BountyRepositoryImpl$fetchBounties$2\n*L\n53#1:104\n53#1:105,3\n54#1:108\n54#1:109,3\n54#1:112,2\n*E\n"})
    /* renamed from: Y00$b */
    /* loaded from: classes4.dex */
    public static final class C9590b extends Lambda implements Function1<OperatorMapResponse, InterfaceC23496h> {
        public C9590b() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m75866c(Y00 this$0, BountyMapMarker[] markers) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(markers, "$markers");
            this$0.f44417e.mo94500g((BountyMapMarker[]) Arrays.copyOf(markers, markers.length));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(OperatorMapResponse operatorMapResponse) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(operatorMapResponse, "operatorMapResponse");
            List<WireBounty> bounties = operatorMapResponse.getBounties();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bounties, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBounty wireBounty : bounties) {
                arrayList.add(wireBounty.getId());
            }
            List<WireBounty> bounties2 = operatorMapResponse.getBounties();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(bounties2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireBounty wireBounty2 : bounties2) {
                arrayList2.add(C52537z00.m2123b(wireBounty2));
            }
            final BountyMapMarker[] bountyMapMarkerArr = (BountyMapMarker[]) arrayList2.toArray(new BountyMapMarker[0]);
            final Y00 y00 = Y00.this;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: Z00
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m75866c;
                    m75866c = Y00.C9590b.m75866c(Y00.this, bountyMapMarkerArr);
                    return m75866c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable { bountyMap…ntyMapMarkers(*markers) }");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{Y00.this.f44417e.mo94502e(arrayList), m33078H});
            return AbstractC23461c.m33037r(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "response", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Y00$c */
    /* loaded from: classes4.dex */
    public static final class C9591c extends Lambda implements Function1<HM4<Unit>, InterfaceC23447K<? extends Boolean>> {

        /* renamed from: g */
        public static final C9591c f44421g = new C9591c();

        public C9591c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Boolean> invoke(HM4<Unit> response) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103944a() == null || (m33158H = AbstractC23442F.m33158H(Boolean.TRUE)) == null) {
                return AbstractC23442F.m33158H(Boolean.FALSE);
            }
            return m33158H;
        }
    }

    public Y00(InterfaceC36152Tk3 operatorClient, InterfaceC49283tW5 surplusClient, InterfaceC51944y00 bountyClient, K00 bountyFlightSheetDetailsDao, M00 bountyMapMarkerDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(surplusClient, "surplusClient");
        Intrinsics.checkNotNullParameter(bountyClient, "bountyClient");
        Intrinsics.checkNotNullParameter(bountyFlightSheetDetailsDao, "bountyFlightSheetDetailsDao");
        Intrinsics.checkNotNullParameter(bountyMapMarkerDao, "bountyMapMarkerDao");
        this.f44413a = operatorClient;
        this.f44414b = surplusClient;
        this.f44415c = bountyClient;
        this.f44416d = bountyFlightSheetDetailsDao;
        this.f44417e = bountyMapMarkerDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23447K m75880M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final InterfaceC23496h m75879N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final InterfaceC23447K m75878O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.T00
    /* renamed from: I1 */
    public AbstractC23461c mo75884I1(String bountyId) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        return this.f44415c.m4251b(new DesignatedBountyRequest(bountyId));
    }

    @Override // p000.T00
    /* renamed from: X */
    public AbstractC23442F<BountyFlightSheetDetails> mo75877X(String bountyId) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        AbstractC23442F<WireBountyFlightSheetDetails> m83042B = this.f44413a.m83042B(bountyId);
        final C9589a c9589a = new C9589a(bountyId);
        AbstractC23442F m33165A = m83042B.m33165A(new InterfaceC23492o() { // from class: V00
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75880M1;
                m75880M1 = Y00.m75880M1(Function1.this, obj);
                return m75880M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun bounty(boun…\n          })\n      }\n  }");
        return m33165A;
    }

    @Override // p000.T00
    /* renamed from: Z */
    public AbstractC23442F<Boolean> mo75876Z(String surplusId) {
        Intrinsics.checkNotNullParameter(surplusId, "surplusId");
        AbstractC23442F<HM4<Unit>> m12164a = this.f44414b.m12164a(new SurplusIdRequest(surplusId));
        final C9591c c9591c = C9591c.f44421g;
        AbstractC23442F m33165A = m12164a.m33165A(new InterfaceC23492o() { // from class: W00
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75878O1;
                m75878O1 = Y00.m75878O1(Function1.this, obj);
                return m75878O1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "surplusClient.recheck(Su…ingle.just(false)\n      }");
        return m33165A;
    }

    @Override // p000.T00
    /* renamed from: a1 */
    public AbstractC23461c mo75875a1(Location location, double d, OperatorMapFilterBundle filters, List<String> list, List<Geolocation> viewport) {
        List emptyList;
        List<String> list2;
        int collectionSizeOrDefault;
        List<String> emptyList2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f44413a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        OperatorMapKind operatorMapKind = OperatorMapKind.LOCATION_BOUNTY;
        WireOperatorMapFilterBundle m17958i = C47311qB0.m17958i(filters);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        if (list == null) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList2;
        } else {
            list2 = list;
        }
        List<Geolocation> list3 = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list3) {
            arrayList.add(C47311qB0.m17960g(geolocation));
        }
        AbstractC23442F<OperatorMapResponse> m83017z = interfaceC36152Tk3.m83017z(new OperatorMapRequest(latitude, longitude, d, operatorMapKind, m17958i, emptyList, list2, arrayList));
        final C9590b c9590b = new C9590b();
        AbstractC23461c m33164B = m83017z.m33164B(new InterfaceC23492o() { // from class: U00
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m75879N1;
                m75879N1 = Y00.m75879N1(Function1.this, obj);
                return m75879N1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchBounti… }\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.T00
    /* renamed from: b1 */
    public AbstractC23461c mo75874b1(List<String> bountyIds) {
        Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
        return this.f44415c.m4252a(new IdsRequest(bountyIds));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        AbstractC23461c m33049i = this.f44416d.mo97950b().m33049i(this.f44417e.mo94505b());
        Intrinsics.checkNotNullExpressionValue(m33049i, "bountyFlightSheetDetails…untyMapMarkerDao.clear())");
        return m33049i;
    }

    @Override // p000.T00
    /* renamed from: o1 */
    public AbstractC23461c mo75873o1(List<String> bountyIds) {
        Intrinsics.checkNotNullParameter(bountyIds, "bountyIds");
        return this.f44415c.m4250c(new IdsRequest(bountyIds));
    }

    @Override // p000.T00
    /* renamed from: v0 */
    public Observable<List<BountyMapMarker>> mo75872v0() {
        return this.f44417e.mo94506a();
    }
}
