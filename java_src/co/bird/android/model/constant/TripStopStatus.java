package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/constant/TripStopStatus;", "", "(Ljava/lang/String;I)V", "isComplete", "", "isCurrent", "UNVISITED", "NEXT", "IN_PROGRESS", "SKIPPED", "WORK_DONE", "COMPLETED", "UNKNOWN", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TripStopStatus {
    UNVISITED,
    NEXT,
    IN_PROGRESS,
    SKIPPED,
    WORK_DONE,
    COMPLETED,
    UNKNOWN;

    public final boolean isComplete() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new TripStopStatus[]{COMPLETED, SKIPPED, WORK_DONE});
        return of.contains(this);
    }

    public final boolean isCurrent() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new TripStopStatus[]{NEXT, IN_PROGRESS, WORK_DONE});
        return of.contains(this);
    }
}
