package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.persistence.Area;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$areaModelManager$1 */
/* loaded from: classes2.dex */
public /* synthetic */ class MapUiImpl$areaModelManager$1 extends FunctionReferenceImpl implements Function1<List<? extends Area>, Unit> {
    public MapUiImpl$areaModelManager$1(Object obj) {
        super(1, obj, MapAreasUiImpl.class, "setAreas", "setAreas(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Area> list) {
        invoke2((List<Area>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Area> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MapAreasUiImpl) this.receiver).setAreas(p0);
    }
}
