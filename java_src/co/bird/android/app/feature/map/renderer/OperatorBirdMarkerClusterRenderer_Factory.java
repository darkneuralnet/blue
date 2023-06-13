package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.persistence.BirdMapMarker;
/* loaded from: classes2.dex */
public final class OperatorBirdMarkerClusterRenderer_Factory {
    private final Y94<Context> contextProvider;
    private final Y94<C36207Tq4> reactiveConfigProvider;

    public OperatorBirdMarkerClusterRenderer_Factory(Y94<Context> y94, Y94<C36207Tq4> y942) {
        this.contextProvider = y94;
        this.reactiveConfigProvider = y942;
    }

    public static OperatorBirdMarkerClusterRenderer_Factory create(Y94<Context> y94, Y94<C36207Tq4> y942) {
        return new OperatorBirdMarkerClusterRenderer_Factory(y94, y942);
    }

    public static OperatorBirdMarkerClusterRenderer newInstance(Context context, C36207Tq4 c36207Tq4, C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<BirdMapMarker>> c33116Gl0, BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider) {
        return new OperatorBirdMarkerClusterRenderer(context, c36207Tq4, c39011cD1, c33116Gl0, birdMarkerClusterItemOptionProvider);
    }

    public OperatorBirdMarkerClusterRenderer get(C39011cD1 c39011cD1, C33116Gl0<BirdMarkerClusterItem<BirdMapMarker>> c33116Gl0, BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider) {
        return newInstance(this.contextProvider.get(), this.reactiveConfigProvider.get(), c39011cD1, c33116Gl0, birdMarkerClusterItemOptionProvider);
    }
}
