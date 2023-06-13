package co.bird.android.app.feature.map.p008ui.renderer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "interval", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$timer$1 */
/* loaded from: classes2.dex */
public final class MapPolygonableRenderer$3$timer$1 extends Lambda implements Function1<Long, Boolean> {
    public static final MapPolygonableRenderer$3$timer$1 INSTANCE = new MapPolygonableRenderer$3$timer$1();

    public MapPolygonableRenderer$3$timer$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        return Boolean.valueOf(interval.longValue() % 2 == 0);
    }
}
