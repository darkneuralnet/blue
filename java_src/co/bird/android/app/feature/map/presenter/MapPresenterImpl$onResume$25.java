package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class MapPresenterImpl$onResume$25 extends FunctionReferenceImpl implements Function1<Float, Unit> {
    public MapPresenterImpl$onResume$25(Object obj) {
        super(1, obj, MapUi.class, "updateLocationRotate", "updateLocationRotate(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        ((MapUi) this.receiver).updateLocationRotate(f);
    }
}
