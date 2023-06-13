package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"LR46;", "", "", "currentValue", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lio/reactivex/Observable;", "", "c", "b", "J", "delta", "<init>", "(Ljava/lang/String;IJ)V", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: R46 */
/* loaded from: classes4.dex */
public enum R46 {
    STOPPED(0),
    INCREASING(1),
    DECREASING(-1);
    

    /* renamed from: b */
    public final long f31480b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Ljava/lang/Long;)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: R46$a */
    /* loaded from: classes4.dex */
    public static final class C7062a extends Lambda implements Function1<Long, Long> {

        /* renamed from: h */
        public final /* synthetic */ int f31482h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7062a(int i) {
            super(1);
            this.f31482h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            long longValue = (it.longValue() * R46.this.f31480b) + this.f31482h;
            if (longValue < 0) {
                longValue = 0;
            }
            return Long.valueOf(longValue);
        }
    }

    R46(long j) {
        this.f31480b = j;
    }

    /* renamed from: d */
    public static final Long m87334d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Long) tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final Observable<Long> m87335c(int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        if (this.f31480b == 0) {
            Observable<Long> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "{\n      Observable.never()\n    }");
            return never;
        }
        Observable<Long> interval = Observable.interval(0L, 1L, timeUnit);
        final C7062a c7062a = new C7062a(i);
        Observable<Long> distinctUntilChanged = interval.map(new InterfaceC23492o() { // from class: P46
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Long m87334d;
                m87334d = R46.m87334d(Function1.this, obj);
                return m87334d;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "fun timer(currentValue: …tUntilChanged()\n    }\n  }");
        return distinctUntilChanged;
    }
}
