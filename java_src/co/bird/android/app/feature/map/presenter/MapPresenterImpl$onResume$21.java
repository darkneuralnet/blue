package co.bird.android.app.feature.map.presenter;

import android.hardware.SensorEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "event", "Landroid/hardware/SensorEvent;", "invoke", "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$21 extends Lambda implements Function1<SensorEvent, Float> {
    public static final MapPresenterImpl$onResume$21 INSTANCE = new MapPresenterImpl$onResume$21();

    public MapPresenterImpl$onResume$21() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return Float.valueOf(event.values[0]);
    }
}
