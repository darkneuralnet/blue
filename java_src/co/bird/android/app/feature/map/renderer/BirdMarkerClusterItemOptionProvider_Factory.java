package co.bird.android.app.feature.map.renderer;

import android.content.Context;
/* loaded from: classes2.dex */
public final class BirdMarkerClusterItemOptionProvider_Factory implements InterfaceC48812sj1<BirdMarkerClusterItemOptionProvider> {
    private final Y94<Context> contextProvider;

    public BirdMarkerClusterItemOptionProvider_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static BirdMarkerClusterItemOptionProvider_Factory create(Y94<Context> y94) {
        return new BirdMarkerClusterItemOptionProvider_Factory(y94);
    }

    public static BirdMarkerClusterItemOptionProvider newInstance(Context context) {
        return new BirdMarkerClusterItemOptionProvider(context);
    }

    @Override // p000.Y94
    public BirdMarkerClusterItemOptionProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
