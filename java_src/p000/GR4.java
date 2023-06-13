package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.analytics.RideHistoryOpened;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.RideSummary;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.YR4;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 ¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LGR4;", "LzR4;", "", C17296a.f69688o, "m", "", "birdId", "h", "LEa;", "LEa;", "analyticsManager", "LYR4;", "b", "LYR4;", "rideManager", "Lom3;", "c", "Lom3;", "operatorManager", "Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireBird;", "operatorBird", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "e", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LRR4;", "f", "LRR4;", "ui", "Le13;", "g", "Le13;", "navigator", "", "I", "offset", "", "i", "Z", "hasMore", "<init>", "(LEa;LYR4;Lom3;Lco/bird/android/model/wire/WireBird;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LRR4;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,105:1\n180#2:106\n180#2:107\n*S KotlinDebug\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl\n*L\n69#1:106\n99#1:107\n*E\n"})
/* renamed from: GR4 */
/* loaded from: classes2.dex */
public final class GR4 implements InterfaceC52794zR4 {

    /* renamed from: a */
    public final InterfaceC1880Ea f11920a;

    /* renamed from: b */
    public final YR4 f11921b;

    /* renamed from: c */
    public final InterfaceC46473om3 f11922c;

    /* renamed from: d */
    public final WireBird f11923d;

    /* renamed from: e */
    public final LifecycleScopeProvider<EnumC7097RE> f11924e;

    /* renamed from: f */
    public final RR4 f11925f;

    /* renamed from: g */
    public final InterfaceC40099e13 f11926g;

    /* renamed from: h */
    public int f11927h;

    /* renamed from: i */
    public boolean f11928i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/OperatorRideHistoryItem;", "rideHistoryItems", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1\n*L\n81#1:106\n81#1:107,3\n*E\n"})
    /* renamed from: GR4$a */
    /* loaded from: classes2.dex */
    public static final class C2850a extends Lambda implements Function1<List<? extends OperatorRideHistoryItem>, InterfaceC23434B<? extends OperatorRideHistoryItem>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/RideSummary;", "summary", "Lco/bird/android/model/OperatorRideHistoryItem;", C17296a.f69688o, "(Lco/bird/api/response/RideSummary;)Lco/bird/android/model/OperatorRideHistoryItem;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n288#2,2:106\n*S KotlinDebug\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1$1\n*L\n94#1:106,2\n*E\n"})
        /* renamed from: GR4$a$a */
        /* loaded from: classes2.dex */
        public static final class C2851a extends Lambda implements Function1<RideSummary, OperatorRideHistoryItem> {

            /* renamed from: g */
            public final /* synthetic */ List<OperatorRideHistoryItem> f11930g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2851a(List<OperatorRideHistoryItem> list) {
                super(1);
                this.f11930g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OperatorRideHistoryItem invoke(RideSummary summary) {
                Object obj;
                Intrinsics.checkNotNullParameter(summary, "summary");
                List<OperatorRideHistoryItem> rideHistoryItems = this.f11930g;
                Intrinsics.checkNotNullExpressionValue(rideHistoryItems, "rideHistoryItems");
                Iterator<T> it = rideHistoryItems.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((OperatorRideHistoryItem) obj).getRideId(), summary.getRide().getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (OperatorRideHistoryItem) obj;
            }
        }

        public C2850a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends OperatorRideHistoryItem> invoke(List<OperatorRideHistoryItem> rideHistoryItems) {
            int collectionSizeOrDefault;
            List<RideSummary> mutableList;
            Intrinsics.checkNotNullParameter(rideHistoryItems, "rideHistoryItems");
            List<OperatorRideHistoryItem> list = rideHistoryItems;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorRideHistoryItem operatorRideHistoryItem : list) {
                String rideId = operatorRideHistoryItem.getRideId();
                if (rideId == null) {
                    rideId = "";
                }
                arrayList.add(new RideSummary(new WireRide(rideId, 0.0d, null, null, null, 0, null, null, null, operatorRideHistoryItem.getCompletedAt(), null, operatorRideHistoryItem.getCanceledAt(), false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67106302, null), null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            GR4.this.f11925f.mo85474N1(mutableList);
            return C37279Yf5.m74575T(GR4.this.f11925f.mo85473Vj(), new C2851a(rideHistoryItems));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GR4$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2852b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2852b f11931b = new C2852b();

        public C2852b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/OperatorRideHistoryItem;", "kotlin.jvm.PlatformType", "rideHistory", "", C17296a.f69688o, "(Lco/bird/android/model/OperatorRideHistoryItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GR4$c */
    /* loaded from: classes2.dex */
    public static final class C2853c extends Lambda implements Function1<OperatorRideHistoryItem, Unit> {
        public C2853c() {
            super(1);
        }

        /* renamed from: a */
        public final void m105092a(OperatorRideHistoryItem operatorRideHistoryItem) {
            InterfaceC40099e13 interfaceC40099e13 = GR4.this.f11926g;
            String rideId = operatorRideHistoryItem.getRideId();
            if (rideId == null) {
                rideId = "";
            }
            WireBird wireBird = GR4.this.f11923d;
            interfaceC40099e13.mo36947s2(rideId, wireBird != null ? wireBird.getLocation() : null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorRideHistoryItem operatorRideHistoryItem) {
            m105092a(operatorRideHistoryItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GR4$d */
    /* loaded from: classes2.dex */
    public static final class C2854d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2854d f11933g = new C2854d();

        public C2854d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/api/response/RideSummary;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GR4$e */
    /* loaded from: classes2.dex */
    public static final class C2855e extends Lambda implements Function1<CollectionResponse<RideSummary>, InterfaceC23434B<? extends RideSummary>> {
        public C2855e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends RideSummary> invoke(CollectionResponse<RideSummary> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            GR4.this.f11928i = it.hasMore();
            GR4.this.f11925f.mo85474N1(it.getItems());
            return GR4.this.f11925f.mo85473Vj();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/RideSummary;", "summary", "", C17296a.f69688o, "(Lco/bird/api/response/RideSummary;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GR4$f */
    /* loaded from: classes2.dex */
    public static final class C2856f extends Lambda implements Function1<RideSummary, Unit> {
        public C2856f() {
            super(1);
        }

        /* renamed from: a */
        public final void m105090a(RideSummary summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            InterfaceC40099e13.C19924a.goToRideDetail$default(GR4.this.f11926g, summary.getRide().getId(), false, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideSummary rideSummary) {
            m105090a(rideSummary);
            return Unit.INSTANCE;
        }
    }

    public GR4(InterfaceC1880Ea analyticsManager, YR4 rideManager, InterfaceC46473om3 operatorManager, WireBird wireBird, LifecycleScopeProvider<EnumC7097RE> scopeProvider, RR4 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f11920a = analyticsManager;
        this.f11921b = rideManager;
        this.f11922c = operatorManager;
        this.f11923d = wireBird;
        this.f11924e = scopeProvider;
        this.f11925f = ui;
        this.f11926g = navigator;
        this.f11928i = true;
    }

    /* renamed from: i */
    public static final InterfaceC23434B m105101i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m105100j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m105099k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m105098l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23434B m105096n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m105095o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC52794zR4
    /* renamed from: a */
    public void mo1345a() {
        WireBird wireBird = this.f11923d;
        if (wireBird != null) {
            m105102h(wireBird.getId());
        } else {
            m105097m();
        }
    }

    /* renamed from: h */
    public final void m105102h(String str) {
        Observable observeOn = C28237sD.progress$default(this.f11922c.mo8126W(str), this.f11925f, 0, 2, (Object) null).m33043l(this.f11922c.mo8130U(str)).observeOn(C23454a.m33087a());
        final C2850a c2850a = new C2850a();
        Observable flatMap = observeOn.flatMap(new InterfaceC23492o() { // from class: CR4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m105101i;
                m105101i = GR4.m105101i(Function1.this, obj);
                return m105101i;
            }
        });
        final C2852b c2852b = C2852b.f11931b;
        Observable retry = flatMap.doOnError(new InterfaceC23484g() { // from class: DR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GR4.m105100j(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun configureOpe…  }) { Timber.e(it) }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f11924e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2853c c2853c = new C2853c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ER4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GR4.m105099k(Function1.this, obj);
            }
        };
        final C2854d c2854d = C2854d.f11933g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: FR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GR4.m105098l(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public final void m105097m() {
        this.f11920a.mo55956N(new RideHistoryOpened());
        Observable progress$default = C28237sD.progress$default(YR4.C9775a.getRideSummary$default(this.f11921b, this.f11927h, 0, 2, null), this.f11925f, 0, 2, (Object) null);
        final C2855e c2855e = new C2855e();
        Observable flatMap = progress$default.flatMap(new InterfaceC23492o() { // from class: AR4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m105096n;
                m105096n = GR4.m105096n(Function1.this, obj);
                return m105096n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun configureRid…mary.ride.id)\n      }\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(this.f11924e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2856f c2856f = new C2856f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: BR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GR4.m105095o(Function1.this, obj);
            }
        });
    }
}
