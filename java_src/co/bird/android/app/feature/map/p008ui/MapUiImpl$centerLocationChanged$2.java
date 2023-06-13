package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$centerLocationChanged$2 */
/* loaded from: classes2.dex */
public final class MapUiImpl$centerLocationChanged$2 extends Lambda implements Function1<LatLng, Boolean> {
    public static final MapUiImpl$centerLocationChanged$2 INSTANCE = new MapUiImpl$centerLocationChanged$2();

    public MapUiImpl$centerLocationChanged$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LatLng it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C39339cm2.m60887b(it));
    }
}
