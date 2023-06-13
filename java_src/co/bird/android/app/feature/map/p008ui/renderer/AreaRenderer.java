package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.p008ui.MapModelRenderer;
import co.bird.android.model.persistence.Area;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016R \u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;", "Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "Lco/bird/android/model/persistence/Area;", "delegateRenderer", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "render", "models", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.AreaRenderer */
/* loaded from: classes2.dex */
public final class AreaRenderer implements MapModelRenderer<Area> {
    private final Function1<List<Area>, Unit> delegateRenderer;

    /* JADX WARN: Multi-variable type inference failed */
    public AreaRenderer(Function1<? super List<Area>, Unit> delegateRenderer) {
        Intrinsics.checkNotNullParameter(delegateRenderer, "delegateRenderer");
        this.delegateRenderer = delegateRenderer;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapModelRenderer
    public void render(List<? extends Area> models) {
        Intrinsics.checkNotNullParameter(models, "models");
        this.delegateRenderer.invoke(models);
    }
}
