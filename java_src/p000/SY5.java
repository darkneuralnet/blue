package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"", "", "", "key", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTargetLineChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChartKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n2333#2,14:120\n*S KotlinDebug\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChartKt\n*L\n116#1:120,14\n*E\n"})
/* renamed from: SY5 */
/* loaded from: classes3.dex */
public final class SY5 {
    /* renamed from: a */
    public static final String m85293a(Map<Float, String> map, float f) {
        Object obj;
        Iterator<T> it = map.keySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                float abs = Math.abs(f - ((Number) next).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) next2).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        Intrinsics.checkNotNull(obj);
        return map.get(Float.valueOf(((Number) obj).floatValue()));
    }
}
