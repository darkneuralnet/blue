package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.p008ui.MapModelRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;", "T", "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;", "renderer", "Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "(Lco/bird/android/app/feature/map/ui/MapModelRenderer;)V", "filters", "", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "getFilters", "()Ljava/util/List;", "items", "getItems", "getRenderer", "()Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "addItems", "", "", "clearItems", "removeItem", "item", "(Ljava/lang/Object;)V", "render", "", "setItems", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAbstractModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractModelManager.kt\nco/bird/android/app/feature/map/modelmanager/AbstractModelManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1789#2,3:39\n*S KotlinDebug\n*F\n+ 1 AbstractModelManager.kt\nco/bird/android/app/feature/map/modelmanager/AbstractModelManager\n*L\n33#1:39,3\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractModelManager<T> implements MapModelManager<T> {
    private final List<Filter<T>> filters;
    private final List<T> items;
    private final MapModelRenderer<T> renderer;

    public AbstractModelManager(MapModelRenderer<T> renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.renderer = renderer;
        this.items = new ArrayList();
        this.filters = new ArrayList();
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void addItems(List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.addAll(items);
        render();
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void clearItems() {
        this.items.clear();
        render();
    }

    public final List<Filter<T>> getFilters() {
        return this.filters;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final MapModelRenderer<T> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void removeItem(T t) {
        this.items.remove(t);
        render();
    }

    public int render() {
        List<T> list = this.items;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<T of co.bird.android.app.feature.map.modelmanager.AbstractModelManager>");
        Iterator<T> it = this.filters.iterator();
        while (it.hasNext()) {
            list = ((Filter) it.next()).apply(list);
        }
        this.renderer.render(list);
        return list.size();
    }

    @Override // co.bird.android.app.feature.map.modelmanager.MapModelManager
    public void setItems(List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        addItems(items);
    }
}
