package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$zoneColorConfig$2 extends Lambda implements Function0<ZoneColorOverrideConfig> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$zoneColorConfig$2(MapPresenterImpl mapPresenterImpl) {
        super(0);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ZoneColorOverrideConfig invoke() {
        C36207Tq4 c36207Tq4;
        c36207Tq4 = this.this$0.reactiveConfig;
        return c36207Tq4.m82623f8().m73665a().getRiderMapConfig().getZoneColorOverride();
    }
}
