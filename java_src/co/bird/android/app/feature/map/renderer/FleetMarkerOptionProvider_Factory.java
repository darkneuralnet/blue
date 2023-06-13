package co.bird.android.app.feature.map.renderer;

import android.content.Context;
/* loaded from: classes2.dex */
public final class FleetMarkerOptionProvider_Factory implements InterfaceC48812sj1<FleetMarkerOptionProvider> {
    private final Y94<Context> contextProvider;

    public FleetMarkerOptionProvider_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static FleetMarkerOptionProvider_Factory create(Y94<Context> y94) {
        return new FleetMarkerOptionProvider_Factory(y94);
    }

    public static FleetMarkerOptionProvider newInstance(Context context) {
        return new FleetMarkerOptionProvider(context);
    }

    @Override // p000.Y94
    public FleetMarkerOptionProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
