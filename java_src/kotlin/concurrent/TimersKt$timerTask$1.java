package kotlin.concurrent;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m28432d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
/* loaded from: classes8.dex */
public final class TimersKt$timerTask$1 extends TimerTask {
    final /* synthetic */ Function1<TimerTask, Unit> $action;

    /* JADX WARN: Multi-variable type inference failed */
    public TimersKt$timerTask$1(Function1<? super TimerTask, Unit> function1) {
        this.$action = function1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.$action.invoke(this);
    }
}
