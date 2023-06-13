package co.bird.android.model.persistence;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LCX3;", "invoke", "()LCX3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Area.kt\nco/bird/android/model/persistence/Area$jtsRegion$2\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,267:1\n45#2,2:268\n35#2:270\n47#2,3:271\n*S KotlinDebug\n*F\n+ 1 Area.kt\nco/bird/android/model/persistence/Area$jtsRegion$2\n*L\n190#1:268,2\n190#1:270\n190#1:271,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Area$jtsRegion$2 extends Lambda implements Function0<CX3> {
    final /* synthetic */ Area this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Area$jtsRegion$2(Area area) {
        super(0);
        this.this$0 = area;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CX3 invoke() {
        CX3 cx3;
        WB1 wb1;
        try {
            wb1 = C32866Fj2.m106642d().get(this.this$0.getRegion());
        } catch (Exception e) {
            e.printStackTrace();
            cx3 = null;
        }
        if (wb1 != null) {
            cx3 = (CX3) wb1;
            if (cx3 == null) {
                CX3 m64833v = new C38409bC1().m64833v();
                Intrinsics.checkNotNullExpressionValue(m64833v, "GeometryFactory().createPolygon()");
                return m64833v;
            }
            return cx3;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.locationtech.jts.geom.Polygon");
    }
}
