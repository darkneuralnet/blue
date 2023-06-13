package co.bird.android.app.feature.map.presenter;

import android.hardware.SensorManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "degree", "invoke", "(Ljava/lang/Float;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$23 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$23(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float degree) {
        InterfaceC40001dr4 interfaceC40001dr4;
        SensorManager sensorManager;
        Intrinsics.checkNotNullParameter(degree, "degree");
        interfaceC40001dr4 = this.this$0.locationManager;
        float floatValue = degree.floatValue();
        sensorManager = this.this$0.sensorManager;
        return Float.valueOf(floatValue - MapPresenterKt.getGeoField(sensorManager, interfaceC40001dr4.mo43616p().m73665a()).getDeclination());
    }
}
