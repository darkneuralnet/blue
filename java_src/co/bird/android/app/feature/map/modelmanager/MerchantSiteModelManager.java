package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.modelmanager.MerchantSiteModelManager;
import co.bird.android.app.feature.map.p008ui.renderer.MerchantRenderItem;
import co.bird.android.app.feature.map.p008ui.renderer.MerchantRenderItemKt;
import co.bird.android.app.feature.map.p008ui.renderer.MerchantSiteRenderer;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireMerchantSite;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0012*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;", "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;", "Lco/bird/android/model/wire/WireMerchantSite;", "", "items", "", "addItems", "setItems", "item", "removeItem", "clearItems", "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;", "merchantSiteRenderer", "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;", "LTq4;", "reactiveConfig", "LTq4;", "LAG;", "kotlin.jvm.PlatformType", "merchantSites", "LAG;", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "zoomLevelObservable", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;LTq4;Lio/reactivex/Observable;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantSiteModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,73:1\n180#2:74\n*S KotlinDebug\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager\n*L\n38#1:74\n*E\n"})
/* loaded from: classes2.dex */
public final class MerchantSiteModelManager implements MapModelManager<WireMerchantSite> {
    public static final Companion Companion = new Companion(null);
    private static final long THROTTLE_MS = 250;
    private final MerchantSiteRenderer merchantSiteRenderer;
    private final C0058AG<List<WireMerchantSite>> merchantSites;
    private final C36207Tq4 reactiveConfig;

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012Z\u0010\u0002\u001aV\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0006**\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMerchantSiteModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1855#2,2:74\n*S KotlinDebug\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1\n*L\n42#1:74,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.modelmanager.MerchantSiteModelManager$1 */
    /* loaded from: classes2.dex */
    public static final class C138051 extends Lambda implements Function1<Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<Float>>, Unit> {
        public C138051() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireMerchantSite>, ? extends Optional<Float>> pair) {
            invoke2((Pair<? extends List<WireMerchantSite>, Optional<Float>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireMerchantSite>, Optional<Float>> pair) {
            List<WireMerchantSite> merchantSites = pair.component1();
            Optional<Float> component2 = pair.component2();
            if (component2.m59037c()) {
                ArrayList arrayList = new ArrayList();
                Intrinsics.checkNotNullExpressionValue(merchantSites, "merchantSites");
                MerchantSiteModelManager merchantSiteModelManager = MerchantSiteModelManager.this;
                for (WireMerchantSite wireMerchantSite : merchantSites) {
                    String markerId = MerchantRenderItemKt.markerId(wireMerchantSite, component2.m59038b());
                    Double merchantPinSize = merchantSiteModelManager.reactiveConfig.m82623f8().m73665a().getBirdPayConfig().getMerchantPinSize();
                    arrayList.add(new MerchantRenderItem(markerId, wireMerchantSite, merchantPinSize != null ? merchantPinSize.doubleValue() : 1.0d, MerchantRenderItemKt.pinVisibility(component2.m59038b())));
                }
                MerchantSiteModelManager.this.merchantSiteRenderer.render(arrayList);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;", "", "()V", "THROTTLE_MS", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MerchantSiteModelManager(MerchantSiteRenderer merchantSiteRenderer, C36207Tq4 reactiveConfig, Observable<Optional<Float>> zoomLevelObservable) {
        Intrinsics.checkNotNullParameter(merchantSiteRenderer, "merchantSiteRenderer");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(zoomLevelObservable, "zoomLevelObservable");
        this.merchantSiteRenderer = merchantSiteRenderer;
        this.reactiveConfig = reactiveConfig;
        C0058AG<List<WireMerchantSite>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<WireMerchantSite>>()");
        this.merchantSites = m115951g;
        Observable observeOn = C24523e.f91168a.m31956a(m115951g, zoomLevelObservable).distinctUntilChanged().throttleLatest(250L, TimeUnit.MILLISECONDS, true).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138051 c138051 = new C138051();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: fT2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MerchantSiteModelManager._init_$lambda$0(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void addItems(List<? extends WireMerchantSite> items) {
        List<WireMerchantSite> plus;
        Intrinsics.checkNotNullParameter(items, "items");
        C0058AG<List<WireMerchantSite>> c0058ag = this.merchantSites;
        List<WireMerchantSite> value = c0058ag.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) value, (Iterable) items);
        c0058ag.accept(plus);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void clearItems() {
        List<WireMerchantSite> emptyList;
        C0058AG<List<WireMerchantSite>> c0058ag = this.merchantSites;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        c0058ag.accept(emptyList);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void setItems(List<? extends WireMerchantSite> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.merchantSites.accept(items);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void removeItem(WireMerchantSite item) {
        List<WireMerchantSite> minus;
        Intrinsics.checkNotNullParameter(item, "item");
        C0058AG<List<WireMerchantSite>> c0058ag = this.merchantSites;
        List<WireMerchantSite> value = c0058ag.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        minus = CollectionsKt___CollectionsKt.minus(value, item);
        c0058ag.accept(minus);
    }
}
