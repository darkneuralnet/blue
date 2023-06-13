package co.bird.android.app.feature.map.modelmanager;

import co.bird.android.app.feature.map.p008ui.renderer.BirdMarkerRenderer;
import co.bird.android.model.persistence.BirdMapMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;", "Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "render", "Li66;", "traceProvider", "Li66;", "Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;", "birdMarkerRenderer", "<init>", "(Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;Li66;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdMarkerModelManager extends AbstractModelManager<BirdMapMarker> {
    private final InterfaceC42524i66 traceProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdMarkerModelManager(BirdMarkerRenderer birdMarkerRenderer, InterfaceC42524i66 traceProvider) {
        super(birdMarkerRenderer);
        Intrinsics.checkNotNullParameter(birdMarkerRenderer, "birdMarkerRenderer");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        this.traceProvider = traceProvider;
    }

    @Override // co.bird.android.app.feature.map.modelmanager.AbstractModelManager
    public int render() {
        InterfaceC38356b66 mo34441a = this.traceProvider.mo34441a("bird_markers_rendering");
        mo34441a.mo64961b("count", String.valueOf(getItems().size()));
        mo34441a.mo64961b("filter_count", "0");
        mo34441a.start();
        int render = super.render();
        mo34441a.mo64961b("drawn_count", String.valueOf(render));
        mo34441a.stop();
        return render;
    }
}
