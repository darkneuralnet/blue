package co.bird.android.app.feature.map.p008ui;

import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "marker", "Lco/bird/android/model/wire/WireLocation;", "invoke", "(LfM2;)Lco/bird/android/model/wire/WireLocation;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n1#2:539\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$showTeleportMarker$1 */
/* loaded from: classes2.dex */
public final class MapUiImpl$showTeleportMarker$1 extends Lambda implements Function1<C40889fM2, WireLocation> {
    final /* synthetic */ MapUiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl$showTeleportMarker$1(MapUiImpl mapUiImpl) {
        super(1);
        this.this$0 = mapUiImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final WireLocation invoke(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        WireLocation wireLocation = new WireLocation(marker.m41532b().f71430b, marker.m41532b().f71431c, null, null, null, null, false, null, null, 508, null);
        if (Intrinsics.areEqual(marker, this.this$0.teleportMarker)) {
            return wireLocation;
        }
        return null;
    }
}
