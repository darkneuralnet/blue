package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.MapGeocacheConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startRiderAreaUpdateStream$1 extends Lambda implements Function1<Config, Boolean> {
    public static final MapPresenterImpl$startRiderAreaUpdateStream$1 INSTANCE = new MapPresenterImpl$startRiderAreaUpdateStream$1();

    public MapPresenterImpl$startRiderAreaUpdateStream$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        MapGeocacheConfig clientZoneGeocacheConfig = config.getRiderMapConfig().getClientZoneGeocacheConfig();
        return Boolean.valueOf(clientZoneGeocacheConfig != null ? Intrinsics.areEqual(clientZoneGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
    }
}
