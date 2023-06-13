package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderItem;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.model.ParkingNest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001e\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0003\u0012\u0004\u0012\u00020 0\u001e0\u001d¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R.\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0013*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;", "Lco/bird/android/model/ParkingNest;", "", "items", "", "addItems", "setItems", "item", "removeItem", "clearItems", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "addFilter", "removeFilter", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "parkingNestRenderer", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "LAG;", "kotlin.jvm.PlatformType", "parkingNests", "LAG;", "", "parkingNestFilters", "Ljava/util/List;", "Lg46$b;", "getLogger", "()Lg46$b;", "logger", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "", "viewportChangesObservable", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;Lio/reactivex/Observable;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingNestModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,101:1\n180#2:102\n*S KotlinDebug\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager\n*L\n63#1:102\n*E\n"})
/* loaded from: classes2.dex */
public final class ParkingNestModelManager implements MapModelManager<ParkingNest> {
    public static final Companion Companion = new Companion(null);
    private static final long THROTTLE_MS = 250;
    private final List<Filter<ParkingNest>> parkingNestFilters;
    private final ParkingNestRenderer parkingNestRenderer;
    private final C0058AG<List<ParkingNest>> parkingNests;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager$1 */
    /* loaded from: classes2.dex */
    public static final class C138061 extends Lambda implements Function1<Pair<? extends List<? extends LatLng>, ? extends Float>, Boolean> {
        public static final C138061 INSTANCE = new C138061();

        public C138061() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<LatLng>, Float> pair) {
            Set set;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            set = CollectionsKt___CollectionsKt.toSet(pair.component1());
            return Boolean.valueOf(set.size() == 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends LatLng>, ? extends Float> pair) {
            return invoke2((Pair<? extends List<LatLng>, Float>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012R\u0010\u0004\u001aN\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\b \u0003*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u00050\u00050\u0005H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/ParkingNest;", "Lcom/google/android/gms/maps/model/LatLng;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingNestModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1855#2,2:102\n766#2:104\n857#2,2:105\n1789#2,3:107\n1549#2:110\n1620#2,3:111\n*S KotlinDebug\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2\n*L\n47#1:102,2\n51#1:104\n51#1:105,2\n55#1:107,3\n56#1:110\n56#1:111,3\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager$2 */
    /* loaded from: classes2.dex */
    public static final class C138072 extends Lambda implements Function1<Pair<? extends List<? extends ParkingNest>, ? extends Pair<? extends List<? extends LatLng>, ? extends Float>>, List<? extends ParkingNestRenderItem>> {
        public C138072() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends ParkingNestRenderItem> invoke(Pair<? extends List<? extends ParkingNest>, ? extends Pair<? extends List<? extends LatLng>, ? extends Float>> pair) {
            return invoke2((Pair<? extends List<ParkingNest>, ? extends Pair<? extends List<LatLng>, Float>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<ParkingNestRenderItem> invoke2(Pair<? extends List<ParkingNest>, ? extends Pair<? extends List<LatLng>, Float>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ParkingNest> parkingNests = pair.component1();
            Pair<? extends List<LatLng>, Float> component2 = pair.component2();
            float floatValue = component2.component2().floatValue();
            LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
            for (LatLng latLng : component2.component1()) {
                c17620a.m50666b(latLng);
            }
            LatLngBounds m50667a = c17620a.m50667a();
            Intrinsics.checkNotNullExpressionValue(m50667a, "Builder()\n          .app…     }\n          .build()");
            Intrinsics.checkNotNullExpressionValue(parkingNests, "parkingNests");
            List arrayList = new ArrayList();
            for (Object obj : parkingNests) {
                if (m50667a.m50669u(GoogleMap_Kt.toLatLng(((ParkingNest) obj).getLocation()))) {
                    arrayList.add(obj);
                }
            }
            for (Filter filter : ParkingNestModelManager.this.parkingNestFilters) {
                arrayList = filter.apply(arrayList);
            }
            List<ParkingNest> list = arrayList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (ParkingNest parkingNest : list) {
                arrayList2.add(new ParkingNestRenderItem(parkingNest, floatValue >= 17.0f));
            }
            return arrayList2;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager$3 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138083 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public static final C138083 INSTANCE = new C138083();

        public C138083() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager$4 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138094 extends FunctionReferenceImpl implements Function1<List<? extends ParkingNestRenderItem>, Unit> {
        public C138094(Object obj) {
            super(1, obj, ParkingNestRenderer.class, "render", "render(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ParkingNestRenderItem> list) {
            invoke2((List<ParkingNestRenderItem>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ParkingNestRenderItem> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ParkingNestRenderer) this.receiver).render(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$Companion;", "", "()V", "THROTTLE_MS", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ParkingNestModelManager(ParkingNestRenderer parkingNestRenderer, Observable<Pair<List<LatLng>, Float>> viewportChangesObservable) {
        Intrinsics.checkNotNullParameter(parkingNestRenderer, "parkingNestRenderer");
        Intrinsics.checkNotNullParameter(viewportChangesObservable, "viewportChangesObservable");
        this.parkingNestRenderer = parkingNestRenderer;
        C0058AG<List<ParkingNest>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<ParkingNest>>()");
        this.parkingNests = m115951g;
        this.parkingNestFilters = new ArrayList();
        C24523e c24523e = C24523e.f91168a;
        final C138061 c138061 = C138061.INSTANCE;
        Observable<Pair<List<LatLng>, Float>> filter = viewportChangesObservable.filter(new InterfaceC23494q() { // from class: hG3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = ParkingNestModelManager._init_$lambda$0(Function1.this, obj);
                return _init_$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "viewportChangesObservabl…wport.toSet().size == 4 }");
        Observable observeOn = c24523e.m31956a(m115951g, filter).distinctUntilChanged().throttleLatest(250L, TimeUnit.MILLISECONDS, true).observeOn(C24542a.m31934a());
        final C138072 c138072 = new C138072();
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: iG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List _init_$lambda$1;
                _init_$lambda$1 = ParkingNestModelManager._init_$lambda$1(Function1.this, obj);
                return _init_$lambda$1;
            }
        });
        final C138083 c138083 = C138083.INSTANCE;
        Observable observeOn2 = map.doOnError(new InterfaceC23484g() { // from class: jG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ParkingNestModelManager._init_$lambda$2(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138094 c138094 = new C138094(parkingNestRenderer);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kG3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ParkingNestModelManager._init_$lambda$3(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final C41318g46.AbstractC20723b getLogger() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("parking-model-manager");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"parking-model-manager\")");
        return m40153k;
    }

    public final void addFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (MapModelManagerKt.alreadyContains(this.parkingNestFilters, filter)) {
            return;
        }
        C41318g46.AbstractC20723b logger = getLogger();
        String id = filter.getId();
        logger.mo7221o("Adding parking-filter: " + id, new Object[0]);
        this.parkingNestFilters.add(filter);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void addItems(List<? extends ParkingNest> items) {
        int i;
        List<ParkingNest> plus;
        Intrinsics.checkNotNullParameter(items, "items");
        int size = items.size();
        List<ParkingNest> value = this.parkingNests.getValue();
        if (value != null) {
            i = value.size();
        } else {
            i = 0;
        }
        C41318g46.m40163a("adding " + size + " parking nest items to existing count of " + i, new Object[0]);
        C0058AG<List<ParkingNest>> c0058ag = this.parkingNests;
        List<ParkingNest> value2 = c0058ag.getValue();
        if (value2 == null) {
            value2 = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) value2, (Iterable) items);
        c0058ag.accept(plus);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void clearItems() {
        List<ParkingNest> emptyList;
        C41318g46.m40163a("clearing parking nest items now", new Object[0]);
        C0058AG<List<ParkingNest>> c0058ag = this.parkingNests;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        c0058ag.accept(emptyList);
    }

    public final void removeFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (!MapModelManagerKt.alreadyContains(this.parkingNestFilters, filter)) {
            return;
        }
        C41318g46.AbstractC20723b logger = getLogger();
        String id = filter.getId();
        logger.mo7221o("Removing parking-filter: " + id + " from filters", new Object[0]);
        this.parkingNestFilters.remove(filter);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void setItems(List<? extends ParkingNest> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = items.size();
        C41318g46.m40163a("setting parking nest items to list of " + size + " size", new Object[0]);
        this.parkingNests.accept(items);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void removeItem(ParkingNest item) {
        List<ParkingNest> minus;
        Intrinsics.checkNotNullParameter(item, "item");
        List<ParkingNest> value = this.parkingNests.getValue();
        int size = value != null ? value.size() : 0;
        C41318g46.m40163a("removing single parking nest item now, new size is " + size, new Object[0]);
        C0058AG<List<ParkingNest>> c0058ag = this.parkingNests;
        List<ParkingNest> value2 = c0058ag.getValue();
        if (value2 == null) {
            value2 = CollectionsKt__CollectionsKt.emptyList();
        }
        minus = CollectionsKt___CollectionsKt.minus(value2, item);
        c0058ag.accept(minus);
    }
}
