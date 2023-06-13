package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.p008ui.renderer.AreaRenderer;
import co.bird.android.model.persistence.Area;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;", "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;", "Lco/bird/android/model/persistence/Area;", "", "previousAreasCount", "", "render", "", "items", "addItems", "setItems", "item", "removeItem", "clearItems", "Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;", "areaRenderer", "Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;", "Li66;", "traceProvider", "Li66;", "", "areas", "Ljava/util/List;", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;Li66;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AreaModelManager implements MapModelManager<Area> {
    private final AreaRenderer areaRenderer;
    private final List<Area> areas;
    private final InterfaceC42524i66 traceProvider;

    public AreaModelManager(AreaRenderer areaRenderer, InterfaceC42524i66 traceProvider) {
        Intrinsics.checkNotNullParameter(areaRenderer, "areaRenderer");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        this.areaRenderer = areaRenderer;
        this.traceProvider = traceProvider;
        this.areas = new ArrayList();
    }

    private final void render(int i) {
        InterfaceC38356b66 mo34441a = this.traceProvider.mo34441a("areas_rendering");
        mo34441a.mo64961b("previous_areas_drawn", String.valueOf(i));
        mo34441a.mo64961b("new_areas_drawn", String.valueOf(this.areas.size()));
        mo34441a.start();
        this.areaRenderer.render(this.areas);
        mo34441a.stop();
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void addItems(List<? extends Area> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = this.areas.size();
        this.areas.addAll(items);
        render(size);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void clearItems() {
        int size = this.areas.size();
        this.areas.clear();
        render(size);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void setItems(List<? extends Area> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = this.areas.size();
        this.areas.clear();
        this.areas.addAll(items);
        render(size);
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void removeItem(Area item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int size = this.areas.size();
        this.areas.remove(item);
        render(size);
    }
}
