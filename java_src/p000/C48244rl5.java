package p000;

import com.polidea.rxandroidble2.exceptions.BleScanException;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C48244rl5;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Lrl5;", "Lio/reactivex/functions/o;", "Lio/reactivex/Observable;", "", "attempts", "b", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rl5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48244rl5 implements InterfaceC23492o<Observable<? extends Throwable>, Observable<?>> {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRxBleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/ScanThrottleRetry$apply$1\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,287:1\n9#2,4:288\n*S KotlinDebug\n*F\n+ 1 BaseRxBleManagerImpl.kt\nco/bird/android/manager/bluetooth/ScanThrottleRetry$apply$1\n*L\n278#1:288,4\n*E\n"})
    /* renamed from: rl5$a */
    /* loaded from: classes4.dex */
    public static final class C27989a extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Object>> {

        /* renamed from: g */
        public static final C27989a f107571g = new C27989a();

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: rl5$a$a */
        /* loaded from: classes4.dex */
        public static final class C27990a extends Lambda implements Function1<Long, InterfaceC23434B<? extends Long>> {

            /* renamed from: g */
            public static final C27990a f107572g = new C27990a();

            public C27990a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends Long> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.just(it);
            }
        }

        public C27989a() {
            super(1);
        }

        /* renamed from: b */
        public static final InterfaceC23434B m15455b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Object> invoke(Throwable throwable) {
            Date m45865c;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            BleScanException bleScanException = throwable instanceof BleScanException ? throwable : null;
            if (bleScanException != null && (m45865c = bleScanException.m45865c()) != null) {
                AbstractC23437E m31934a = C24542a.m31934a();
                Intrinsics.checkNotNullExpressionValue(m31934a, "computation()");
                long time = m45865c.getTime();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Observable<Long> timer = Observable.timer(Math.max(time - m31934a.m33168c(timeUnit), 0L), timeUnit, m31934a);
                final C27990a c27990a = C27990a.f107572g;
                InterfaceC23434B flatMap = timer.flatMap(new InterfaceC23492o() { // from class: ql5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m15455b;
                        m15455b = C48244rl5.C27989a.m15455b(Function1.this, obj);
                        return m15455b;
                    }
                });
                if (flatMap != null) {
                    return flatMap;
                }
            }
            return Observable.error(throwable);
        }
    }

    /* renamed from: c */
    public static final InterfaceC23434B m15457c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // io.reactivex.functions.InterfaceC23492o
    /* renamed from: b */
    public Observable<?> apply(Observable<? extends Throwable> attempts) {
        Intrinsics.checkNotNullParameter(attempts, "attempts");
        final C27989a c27989a = C27989a.f107571g;
        Observable flatMap = attempts.flatMap(new InterfaceC23492o() { // from class: pl5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m15457c;
                m15457c = C48244rl5.m15457c(Function1.this, obj);
                return m15457c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "attempts\n      .flatMap …r<Any>(throwable)\n      }");
        return flatMap;
    }
}
