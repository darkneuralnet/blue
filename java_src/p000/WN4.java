package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.WN4;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B7\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0017"}, m28432d2 = {"LWN4;", "Lio/reactivex/functions/o;", "Lio/reactivex/Observable;", "", "attempts", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/functions/q;", "b", "Lio/reactivex/functions/q;", "predicate", "", "c", "I", "maxAttempts", "delaySeconds", "Lio/reactivex/E;", "e", "Lio/reactivex/E;", "scheduler", "f", "retryCount", "<init>", "(Lio/reactivex/functions/q;IILio/reactivex/E;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WN4 */
/* loaded from: classes3.dex */
public final class WN4 implements InterfaceC23492o<Observable<? extends Throwable>, Observable<?>> {

    /* renamed from: b */
    public final InterfaceC23494q<? super Throwable> f40918b;

    /* renamed from: c */
    public final int f40919c;

    /* renamed from: d */
    public final int f40920d;

    /* renamed from: e */
    public final AbstractC23437E f40921e;

    /* renamed from: f */
    public int f40922f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WN4$a */
    /* loaded from: classes3.dex */
    public static final class C9012a extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Object>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WN4$a$a */
        /* loaded from: classes3.dex */
        public static final class C9013a extends Lambda implements Function1<Long, InterfaceC23434B<? extends Object>> {

            /* renamed from: g */
            public final /* synthetic */ WN4 f40924g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f40925h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9013a(WN4 wn4, Throwable th) {
                super(1);
                this.f40924g = wn4;
                this.f40925h = th;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends Object> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC23494q interfaceC23494q = this.f40924g.f40918b;
                Throwable throwable = this.f40925h;
                Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
                if (interfaceC23494q.test(throwable)) {
                    Observable just = Observable.just(it);
                    Intrinsics.checkNotNullExpressionValue(just, "{\n                Observ….just(it)\n              }");
                    return just;
                }
                Observable error = Observable.error(this.f40925h);
                Intrinsics.checkNotNullExpressionValue(error, "{\n                Observ…hrowable)\n              }");
                return error;
            }
        }

        public C9012a() {
            super(1);
        }

        /* renamed from: b */
        public static final InterfaceC23434B m78509b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
            if (r0.f40922f < r4.f40923g.f40919c) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23434B<? extends Object> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (WN4.this.f40918b.test(throwable)) {
                if (WN4.this.f40919c >= 0) {
                    WN4 wn4 = WN4.this;
                    wn4.f40922f++;
                }
                Observable<Long> timer = Observable.timer(WN4.this.f40920d, TimeUnit.SECONDS, WN4.this.f40921e);
                final C9013a c9013a = new C9013a(WN4.this, throwable);
                return timer.flatMap(new InterfaceC23492o() { // from class: VN4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m78509b;
                        m78509b = WN4.C9012a.m78509b(Function1.this, obj);
                        return m78509b;
                    }
                });
            }
            return Observable.error(throwable);
        }
    }

    public WN4() {
        this(null, 0, 0, null, 15, null);
    }

    /* renamed from: c */
    public static final boolean m78513c(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* renamed from: e */
    public static final InterfaceC23434B m78511e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // io.reactivex.functions.InterfaceC23492o
    /* renamed from: d */
    public Observable<?> apply(Observable<? extends Throwable> attempts) {
        Intrinsics.checkNotNullParameter(attempts, "attempts");
        final C9012a c9012a = new C9012a();
        Observable flatMap = attempts.flatMap(new InterfaceC23492o() { // from class: UN4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m78511e;
                m78511e = WN4.m78511e(Function1.this, obj);
                return m78511e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun apply(attem…le)\n        }\n      }\n  }");
        return flatMap;
    }

    public WN4(InterfaceC23494q<? super Throwable> predicate, int i, int i2, AbstractC23437E scheduler) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f40918b = predicate;
        this.f40919c = i;
        this.f40920d = i2;
        this.f40921e = scheduler;
        this.f40922f = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WN4(InterfaceC23494q interfaceC23494q, int i, int i2, AbstractC23437E abstractC23437E, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC23494q, i, i2, abstractC23437E);
        interfaceC23494q = (i3 & 1) != 0 ? new InterfaceC23494q() { // from class: TN4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m78513c;
                m78513c = WN4.m78513c((Throwable) obj);
                return m78513c;
            }
        } : interfaceC23494q;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? 1 : i2;
        if ((i3 & 8) != 0) {
            abstractC23437E = C24542a.m31934a();
            Intrinsics.checkNotNullExpressionValue(abstractC23437E, "computation()");
        }
    }
}
