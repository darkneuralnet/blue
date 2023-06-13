package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.configs.Config;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startOperatorAreaUpdateStream$1 extends Lambda implements Function1<Config, Pair<? extends Boolean, ? extends Boolean>> {
    public static final MapPresenterImpl$startOperatorAreaUpdateStream$1 INSTANCE = new MapPresenterImpl$startOperatorAreaUpdateStream$1();

    public MapPresenterImpl$startOperatorAreaUpdateStream$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<Boolean, Boolean> invoke(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return TuplesKt.m28425to(Boolean.valueOf(config.getOperatorConfig().getFeatures().getMap().getEnableManualRefresh()), Boolean.valueOf(config.getOperatorConfig().getFeatures().getZoneMap().getEnable()));
    }
}
