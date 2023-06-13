package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.p008ui.renderer.BirdRenderer;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0014\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR/\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/BirdModelManager;", "Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;", "Lco/bird/android/model/wire/WireBird;", "", "render", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "", "addBirdFilter", "removeBirdFilter", "Li66;", "traceProvider", "Li66;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "onBirdFilterDirty", "Lkotlin/jvm/functions/Function1;", "Lg46$b;", "getLogger", "()Lg46$b;", "logger", "Lco/bird/android/app/feature/map/ui/renderer/BirdRenderer;", "birdRenderer", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/BirdRenderer;Li66;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdModelManager extends AbstractModelManager<WireBird> {
    private final Function1<String, Unit> onBirdFilterDirty;
    private final InterfaceC42524i66 traceProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdModelManager(BirdRenderer birdRenderer, InterfaceC42524i66 traceProvider) {
        super(birdRenderer);
        Intrinsics.checkNotNullParameter(birdRenderer, "birdRenderer");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        this.traceProvider = traceProvider;
        this.onBirdFilterDirty = new BirdModelManager$onBirdFilterDirty$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C41318g46.AbstractC20723b getLogger() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("bird-model-manager");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"bird-model-manager\")");
        return m40153k;
    }

    public final void addBirdFilter(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (MapModelManagerKt.alreadyContains(getFilters(), filter)) {
            C41318g46.AbstractC20723b logger = getLogger();
            String id = filter.getId();
            logger.mo7221o("Not adding bird-filter: " + id + " as it is a duplicate.", new Object[0]);
            return;
        }
        C41318g46.AbstractC20723b logger2 = getLogger();
        String id2 = filter.getId();
        logger2.mo7221o("Adding bird-filter: " + id2, new Object[0]);
        filter.setSetDirty(this.onBirdFilterDirty);
        getFilters().add(filter);
        render();
    }

    public final void removeBirdFilter(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (!MapModelManagerKt.alreadyContains(getFilters(), filter)) {
            C41318g46.AbstractC20723b logger = getLogger();
            String id = filter.getId();
            logger.mo7221o("Can not remove bird-filter " + id + " as it is not found in current filters", new Object[0]);
            return;
        }
        C41318g46.AbstractC20723b logger2 = getLogger();
        String id2 = filter.getId();
        logger2.mo7221o("Removing bird-filter: " + id2 + " from filters", new Object[0]);
        getFilters().remove(filter);
        filter.setSetDirty(null);
        render();
    }

    @Override // co.bird.android.app.feature.map.modelmanager.AbstractModelManager
    public int render() {
        InterfaceC38356b66 mo34441a = this.traceProvider.mo34441a("birds_rendering");
        mo34441a.mo64961b("count", String.valueOf(getItems().size()));
        mo34441a.mo64961b("filter_count", String.valueOf(getFilters().size()));
        mo34441a.start();
        int render = super.render();
        mo34441a.mo64961b("drawn_count", String.valueOf(render));
        mo34441a.stop();
        return render;
    }
}
