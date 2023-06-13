package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, m28432d2 = {"LFP5;", "", "LHP5;", "value", "", "c", "previous", "current", "applied", "e", "h", "()LHP5;", "firstStateRecord", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FP5 */
/* loaded from: classes.dex */
public interface FP5 {
    /* renamed from: c */
    void mo13273c(HP5 hp5);

    /* renamed from: e */
    default HP5 mo107179e(HP5 previous, HP5 current, HP5 applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        return null;
    }

    /* renamed from: h */
    HP5 mo13271h();
}
