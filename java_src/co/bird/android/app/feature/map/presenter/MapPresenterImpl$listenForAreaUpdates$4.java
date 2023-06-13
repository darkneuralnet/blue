package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$listenForAreaUpdates$4 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$listenForAreaUpdates$4(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        MapUi mapUi;
        MapUi mapUi2;
        MapUi mapUi3;
        mapUi = this.this$0.f61617ui;
        mapUi2 = this.this$0.f61617ui;
        Float m59035e = mapUi2.getZoomLevelObservable().m73665a().m59035e();
        float floatValue = m59035e != null ? m59035e.floatValue() : 0.0f;
        mapUi3 = this.this$0.f61617ui;
        mapUi.updateAreasUi(floatValue, mapUi3.latLngViewport());
    }
}
