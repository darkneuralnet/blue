package co.bird.android.app.feature.map.renderer;

import android.content.Context;
/* loaded from: classes2.dex */
public final class BountyMarkerWithTimerOptionProvider_Factory implements InterfaceC48812sj1<BountyMarkerWithTimerOptionProvider> {
    private final Y94<Context> contextProvider;

    public BountyMarkerWithTimerOptionProvider_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static BountyMarkerWithTimerOptionProvider_Factory create(Y94<Context> y94) {
        return new BountyMarkerWithTimerOptionProvider_Factory(y94);
    }

    public static BountyMarkerWithTimerOptionProvider newInstance(Context context) {
        return new BountyMarkerWithTimerOptionProvider(context);
    }

    @Override // p000.Y94
    public BountyMarkerWithTimerOptionProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
