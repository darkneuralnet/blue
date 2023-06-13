package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.R62;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¨\u0006\u0006"}, m28432d2 = {"T", "LLX2;", "LR62$a;", "", "itemIndex", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
/* renamed from: S62 */
/* loaded from: classes.dex */
public final class S62 {
    /* renamed from: b */
    public static final <T> int m86010b(LX2<R62.C7065a<T>> lx2, int i) {
        int m96690u = lx2.m96690u() - 1;
        int i2 = 0;
        while (i2 < m96690u) {
            int i3 = ((m96690u - i2) / 2) + i2;
            int m87320b = lx2.m96691s()[i3].m87320b();
            if (m87320b == i) {
                return i3;
            }
            if (m87320b < i) {
                i2 = i3 + 1;
                if (i < lx2.m96691s()[i2].m87320b()) {
                    return i3;
                }
            } else {
                m96690u = i3 - 1;
            }
        }
        return i2;
    }
}
