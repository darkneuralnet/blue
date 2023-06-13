package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterItem;
/* loaded from: classes2.dex */
public final class BountyMarkerClusterRenderer_Factory {
    private final Y94<Context> contextProvider;
    private final Y94<FleetMarkerOptionProvider> markerOptionProvider;
    private final Y94<BountyMarkerWithTimerOptionProvider> timerMarkerOptionProvider;

    public BountyMarkerClusterRenderer_Factory(Y94<Context> y94, Y94<FleetMarkerOptionProvider> y942, Y94<BountyMarkerWithTimerOptionProvider> y943) {
        this.contextProvider = y94;
        this.markerOptionProvider = y942;
        this.timerMarkerOptionProvider = y943;
    }

    public static BountyMarkerClusterRenderer_Factory create(Y94<Context> y94, Y94<FleetMarkerOptionProvider> y942, Y94<BountyMarkerWithTimerOptionProvider> y943) {
        return new BountyMarkerClusterRenderer_Factory(y94, y942, y943);
    }

    public static BountyMarkerClusterRenderer newInstance(C33116Gl0<BountyMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1, Context context, FleetMarkerOptionProvider fleetMarkerOptionProvider, BountyMarkerWithTimerOptionProvider bountyMarkerWithTimerOptionProvider) {
        return new BountyMarkerClusterRenderer(c33116Gl0, c39011cD1, context, fleetMarkerOptionProvider, bountyMarkerWithTimerOptionProvider);
    }

    public BountyMarkerClusterRenderer get(C33116Gl0<BountyMarkerClusterItem> c33116Gl0, C39011cD1 c39011cD1) {
        return newInstance(c33116Gl0, c39011cD1, this.contextProvider.get(), this.markerOptionProvider.get(), this.timerMarkerOptionProvider.get());
    }
}
