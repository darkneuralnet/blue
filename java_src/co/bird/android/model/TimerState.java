package co.bird.android.model;

import co.bird.android.model.TimerState;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/TimerState;", "", "delta", "", "(Ljava/lang/String;IJ)V", "timer", "Lio/reactivex/Observable;", "currentValueSeconds", "", "STOPPED", "INCREASING", "DECREASING", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TimerState {
    STOPPED(0),
    INCREASING(1),
    DECREASING(-1);
    
    private final long delta;

    TimerState(long j) {
        this.delta = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long timer$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Long) tmp0.invoke(obj);
    }

    public final Observable<Long> timer(int i) {
        if (this.delta == 0) {
            Observable<Long> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "{\n      Observable.never()\n    }");
            return never;
        }
        Observable<Long> interval = Observable.interval(0L, 1L, TimeUnit.SECONDS);
        final TimerState$timer$1 timerState$timer$1 = new TimerState$timer$1(this, i);
        Observable map = interval.map(new InterfaceC23492o() { // from class: Q46
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Long timer$lambda$0;
                timer$lambda$0 = TimerState.timer$lambda$0(Function1.this, obj);
                return timer$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun timer(currentValueSe…tValueSeconds }\n    }\n  }");
        return map;
    }
}
