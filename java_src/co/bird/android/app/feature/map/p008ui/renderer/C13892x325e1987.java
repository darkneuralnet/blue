package co.bird.android.app.feature.map.p008ui.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "idx", "LWB1;", "hole", "Lkotlin/Pair;", "invoke", "(ILWB1;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,518:1\n179#2,2:519\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2\n*L\n401#1:519,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2 */
/* loaded from: classes2.dex */
public final class C13892x325e1987 extends Lambda implements Function2<Integer, WB1, Pair<? extends WB1, ? extends WB1>> {
    final /* synthetic */ List<WB1> $holes;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2$1 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138931 extends FunctionReferenceImpl implements Function1<Integer, WB1> {
        public C138931(Object obj) {
            super(1, obj, List.class, "get", "get(I)Ljava/lang/Object;", 0);
        }

        public final WB1 invoke(int i) {
            return (WB1) ((List) this.receiver).get(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ WB1 invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13892x325e1987(List<? extends WB1> list) {
        super(2);
        this.$holes = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Pair<? extends WB1, ? extends WB1> invoke(Integer num, WB1 wb1) {
        return invoke(num.intValue(), wb1);
    }

    public final Pair<WB1, WB1> invoke(int i, WB1 hole) {
        IntRange until;
        Sequence asSequence;
        Sequence map;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(hole, "hole");
        until = RangesKt___RangesKt.until(i, this.$holes.size());
        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
        map = SequencesKt___SequencesKt.map(asSequence, new C138931(this.$holes));
        Iterator it = map.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            WB1 wb1 = (WB1) obj;
            if (hole.m78764H0(wb1) || hole.m78748q(wb1) || hole.m78769A0(wb1) || hole.m78754l(wb1) || hole.m78761J0(wb1)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        WB1 wb12 = (WB1) obj;
        if (wb12 == null) {
            return null;
        }
        return TuplesKt.m28425to(hole, wb12);
    }
}
