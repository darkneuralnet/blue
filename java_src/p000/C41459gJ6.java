package p000;

import co.bird.android.model.persistence.ZoneData;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.ZoneRegion;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireZoneData;
import co.bird.android.model.wire.WireZoneFlightSheetDetails;
import co.bird.android.model.wire.WireZoneRegion;
import co.bird.api.request.ZoneDataRequest;
import co.bird.api.request.ZoneRegionRequest;
import co.bird.api.response.ZoneDataResponse;
import co.bird.api.response.ZoneRegionResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C41459gJ6;
import p000.WI6;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00020\nH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LgJ6;", "LWI6;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lio/reactivex/c;", "Y0", "T1", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/ZonePolygonable;", "I", "Lco/bird/android/model/persistence/ZoneMarker;", "i", "", "zoneId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "f0", "S0", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "k1", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LCI6;", "b", "LCI6;", "zoneDao", "LMI6;", "c", "LMI6;", "zoneFlightSheetDao", "<init>", "(LTk3;LCI6;LMI6;)V", "zone_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n237#2:130\n1549#3:131\n1620#3,3:132\n*S KotlinDebug\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl\n*L\n39#1:130\n46#1:131\n46#1:132,3\n*E\n"})
/* renamed from: gJ6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41459gJ6 implements WI6 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f81981a;

    /* renamed from: b */
    public final CI6 f81982b;

    /* renamed from: c */
    public final MI6 f81983c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ZoneDataResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/api/response/ZoneDataResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl$fetchZoneData$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n1549#2:134\n1620#2,3:135\n37#3,2:138\n*S KotlinDebug\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl$fetchZoneData$2\n*L\n51#1:130\n51#1:131,3\n59#1:134\n59#1:135,3\n62#1:138,2\n*E\n"})
    /* renamed from: gJ6$a */
    /* loaded from: classes4.dex */
    public static final class C20823a extends Lambda implements Function1<ZoneDataResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ List<Geolocation> f81985h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20823a(List<Geolocation> list) {
            super(1);
            this.f81985h = list;
        }

        /* renamed from: d */
        public static final Unit m39618d(C41459gJ6 this$0, List zoneData) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(zoneData, "$zoneData");
            CI6 ci6 = this$0.f81982b;
            ZoneData[] zoneDataArr = (ZoneData[]) zoneData.toArray(new ZoneData[0]);
            ci6.mo109214m((ZoneData[]) Arrays.copyOf(zoneDataArr, zoneDataArr.length));
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final Unit m39617e(C41459gJ6 this$0, List zoneIds, List viewport) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(zoneIds, "$zoneIds");
            Intrinsics.checkNotNullParameter(viewport, "$viewport");
            this$0.f81982b.mo109217j(zoneIds, viewport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(ZoneDataResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireZoneData> zones = response.getZones();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zones, 10);
            final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireZoneData wireZoneData : zones) {
                arrayList.add(wireZoneData.getZoneId());
            }
            C41459gJ6 c41459gJ6 = C41459gJ6.this;
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[4];
            abstractC23461cArr[0] = CI6.trimAnnotationsAndOverlays$default(c41459gJ6.f81982b, arrayList, null, 2, null);
            List<WireZoneData> zones2 = response.getZones();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(zones2, 10);
            final ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireZoneData wireZoneData2 : zones2) {
                arrayList2.add(AI6.m115927a(wireZoneData2));
            }
            final C41459gJ6 c41459gJ62 = C41459gJ6.this;
            AbstractC23461c m33063X = AbstractC23461c.m33078H(new Callable() { // from class: eJ6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39618d;
                    m39618d = C41459gJ6.C20823a.m39618d(C41459gJ6.this, arrayList2);
                    return m39618d;
                }
            }).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "fromCallable {\n         …scribeOn(Schedulers.io())");
            abstractC23461cArr[1] = m33063X;
            final C41459gJ6 c41459gJ63 = C41459gJ6.this;
            final List<Geolocation> list = this.f81985h;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: fJ6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39617e;
                    m39617e = C41459gJ6.C20823a.m39617e(C41459gJ6.this, arrayList, list);
                    return m39617e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable { zoneDao.t…port(zoneIds, viewport) }");
            abstractC23461cArr[2] = m33078H;
            abstractC23461cArr[3] = C41459gJ6.this.m39631T1();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
            Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n         …hZoneRegions()\n        ))");
            return c41459gJ6.m39635Q1(m33037r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneFlightSheetDetails;", "zoneFlightSheetDetails", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gJ6$b */
    /* loaded from: classes4.dex */
    public static final class C20824b extends Lambda implements Function1<WireZoneFlightSheetDetails, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f81987h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20824b(String str) {
            super(1);
            this.f81987h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireZoneFlightSheetDetails zoneFlightSheetDetails) {
            Intrinsics.checkNotNullParameter(zoneFlightSheetDetails, "zoneFlightSheetDetails");
            return C41459gJ6.this.f81983c.mo94071a(JI6.m100721a(zoneFlightSheetDetails, this.f81987h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "zoneIdsMissingRegions", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gJ6$c */
    /* loaded from: classes4.dex */
    public static final class C20825c extends Lambda implements Function1<List<? extends String>, Unit> {

        /* renamed from: g */
        public static final C20825c f81988g = new C20825c();

        public C20825c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> list) {
            if (list.isEmpty()) {
                throw new C52620z83();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gJ6$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20826d extends AdaptedFunctionReference implements Function1<List<? extends String>, ZoneRegionRequest> {

        /* renamed from: b */
        public static final C20826d f81989b = new C20826d();

        public C20826d() {
            super(1, ZoneRegionRequest.class, "<init>", "<init>(Ljava/util/List;Lco/bird/android/model/constant/PolygonEncodingFormat;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ZoneRegionRequest invoke(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new ZoneRegionRequest(p0, null, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gJ6$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20827e extends FunctionReferenceImpl implements Function1<ZoneRegionRequest, AbstractC23442F<ZoneRegionResponse>> {
        public C20827e(Object obj) {
            super(1, obj, InterfaceC36152Tk3.class, "getOperatorZoneRegions", "getOperatorZoneRegions(Lco/bird/api/request/ZoneRegionRequest;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<ZoneRegionResponse> invoke(ZoneRegionRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC36152Tk3) this.receiver).m83028o(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ZoneRegionResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/ZoneRegionResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nZoneRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl$fetchZoneRegions$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n37#3,2:134\n*S KotlinDebug\n*F\n+ 1 ZoneRepositoryImpl.kt\nco/bird/android/repository/zone/ZoneRepositoryImpl$fetchZoneRegions$4\n*L\n85#1:130\n85#1:131,3\n87#1:134,2\n*E\n"})
    /* renamed from: gJ6$f */
    /* loaded from: classes4.dex */
    public static final class C20828f extends Lambda implements Function1<ZoneRegionResponse, InterfaceC23496h> {
        public C20828f() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m39611c(C41459gJ6 this$0, List zoneRegions) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(zoneRegions, "$zoneRegions");
            CI6 ci6 = this$0.f81982b;
            ZoneRegion[] zoneRegionArr = (ZoneRegion[]) zoneRegions.toArray(new ZoneRegion[0]);
            ci6.mo109213n((ZoneRegion[]) Arrays.copyOf(zoneRegionArr, zoneRegionArr.length));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(ZoneRegionResponse response) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireZoneRegion> zoneRegions = response.getZoneRegions();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zoneRegions, 10);
            final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireZoneRegion wireZoneRegion : zoneRegions) {
                arrayList.add(AI6.m115926b(wireZoneRegion));
            }
            final C41459gJ6 c41459gJ6 = C41459gJ6.this;
            AbstractC23461c m33063X = AbstractC23461c.m33078H(new Callable() { // from class: hJ6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39611c;
                    m39611c = C41459gJ6.C20828f.m39611c(C41459gJ6.this, arrayList);
                    return m39611c;
                }
            }).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "fromCallable { zoneDao.u…scribeOn(Schedulers.io())");
            return c41459gJ6.m39635Q1(m33063X);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "e", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gJ6$g */
    /* loaded from: classes4.dex */
    public static final class C20829g extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public static final C20829g f81991g = new C20829g();

        public C20829g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof C52620z83) {
                return AbstractC23461c.m33039p();
            }
            throw e;
        }
    }

    public C41459gJ6(InterfaceC36152Tk3 operatorClient, CI6 zoneDao, MI6 zoneFlightSheetDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(zoneDao, "zoneDao");
        Intrinsics.checkNotNullParameter(zoneFlightSheetDao, "zoneFlightSheetDao");
        this.f81981a = operatorClient;
        this.f81982b = zoneDao;
        this.f81983c = zoneFlightSheetDao;
        DateTime minusHours = DateTime.now().minusHours(24);
        Intrinsics.checkNotNullExpressionValue(minusHours, "now().minusHours(24)");
        AbstractC23461c m33063X = zoneDao.mo109218i(minusHours).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "zoneDao.trimRegions(Date…scribeOn(Schedulers.io())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33063X.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: R1 */
    public static final InterfaceC23496h m39634R1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: S1 */
    public static final InterfaceC23496h m39632S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final void m39630U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final ZoneRegionRequest m39629V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ZoneRegionRequest) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final InterfaceC23447K m39628W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final InterfaceC23496h m39627X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final InterfaceC23496h m39625Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.WI6
    /* renamed from: I */
    public Observable<List<ZonePolygonable>> mo39643I() {
        return this.f81982b.mo109208s();
    }

    /* renamed from: Q1 */
    public AbstractC23461c m39635Q1(AbstractC23461c abstractC23461c) {
        return WI6.C8980a.m78599a(this, abstractC23461c);
    }

    @Override // p000.WI6
    /* renamed from: S0 */
    public AbstractC23461c mo39633S0(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        AbstractC23442F<WireZoneFlightSheetDetails> m83038e = this.f81981a.m83038e(zoneId);
        final C20824b c20824b = new C20824b(zoneId);
        AbstractC23461c m33164B = m83038e.m33164B(new InterfaceC23492o() { // from class: XI6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39632S1;
                m39632S1 = C41459gJ6.m39632S1(Function1.this, obj);
                return m39632S1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchZoneFl…      .clearOnError()\n  }");
        return m39635Q1(m33164B);
    }

    /* renamed from: T1 */
    public AbstractC23461c m39631T1() {
        AbstractC23442F<List<String>> mo109210q = this.f81982b.mo109210q();
        final C20825c c20825c = C20825c.f81988g;
        AbstractC23442F<List<String>> m33101w = mo109210q.m33101w(new InterfaceC23484g() { // from class: ZI6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41459gJ6.m39630U1(Function1.this, obj);
            }
        });
        final C20826d c20826d = C20826d.f81989b;
        AbstractC23442F<R> m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: aJ6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ZoneRegionRequest m39629V1;
                m39629V1 = C41459gJ6.m39629V1(Function1.this, obj);
                return m39629V1;
            }
        });
        final C20827e c20827e = new C20827e(this.f81981a);
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: bJ6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m39628W1;
                m39628W1 = C41459gJ6.m39628W1(Function1.this, obj);
                return m39628W1;
            }
        });
        final C20828f c20828f = new C20828f();
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: cJ6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39627X1;
                m39627X1 = C41459gJ6.m39627X1(Function1.this, obj);
                return m39627X1;
            }
        });
        final C20829g c20829g = C20829g.f81991g;
        AbstractC23461c m33067S = m33164B.m33067S(new InterfaceC23492o() { // from class: dJ6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39625Y1;
                m39625Y1 = C41459gJ6.m39625Y1(Function1.this, obj);
                return m39625Y1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33067S, "override fun fetchZoneRe…lete() else throw e }\n  }");
        return m33067S;
    }

    @Override // p000.WI6
    /* renamed from: Y0 */
    public AbstractC23461c mo39626Y0(List<Geolocation> viewport, OperatorMapFilterBundle filters) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(filters, "filters");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f81981a;
        List<Geolocation> list = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list) {
            arrayList.add(UB1.m81888d(geolocation));
        }
        AbstractC23442F<ZoneDataResponse> m83029n = interfaceC36152Tk3.m83029n(new ZoneDataRequest(arrayList, C47311qB0.m17958i(filters)));
        final C20823a c20823a = new C20823a(viewport);
        AbstractC23461c m33164B = m83029n.m33164B(new InterfaceC23492o() { // from class: YI6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39634R1;
                m39634R1 = C41459gJ6.m39634R1(Function1.this, obj);
                return m39634R1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchZoneDa…learOnError()\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f81982b.mo109226a(), this.f81982b.mo109225b()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n      zon…clearZoneRegions()\n    ))");
        return m33037r;
    }

    @Override // p000.WI6
    /* renamed from: f0 */
    public AbstractC23442F<ZoneOverlayAnalytics> mo39624f0(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return this.f81982b.mo109224c(zoneId);
    }

    @Override // p000.WI6
    /* renamed from: i */
    public Observable<List<ZoneMarker>> mo39623i() {
        return this.f81982b.mo109209r();
    }

    @Override // p000.WI6
    /* renamed from: k1 */
    public Observable<ZoneFlightSheetDetails> mo39622k1(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return this.f81983c.mo94070b(zoneId);
    }
}
