package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Ljava/lang/Long;)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TimerState$timer$1 extends Lambda implements Function1<Long, Long> {
    final /* synthetic */ int $currentValueSeconds;
    final /* synthetic */ TimerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerState$timer$1(TimerState timerState, int i) {
        super(1);
        this.this$0 = timerState;
        this.$currentValueSeconds = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Long it) {
        long j;
        Intrinsics.checkNotNullParameter(it, "it");
        long longValue = it.longValue();
        j = this.this$0.delta;
        return Long.valueOf((longValue * j) + this.$currentValueSeconds);
    }
}
