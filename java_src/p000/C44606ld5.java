package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.functions.C23506a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0012\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\bH\u0002\u001aX\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001aH\u0010\u0013\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28432d2 = {"", "T", "Lkotlin/Function1;", "", "Lio/reactivex/functions/g;", DateTokenConverter.CONVERTER_KEY, "", "h", "Lkotlin/Function0;", "Lio/reactivex/functions/a;", "f", "Lcom/uber/autodispose/ObservableSubscribeProxy;", "onError", "onComplete", "onNext", "Lio/reactivex/disposables/c;", "j", "Lcom/uber/autodispose/SingleSubscribeProxy;", "onSuccess", "k", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "onNextStub", "b", "onErrorStub", "c", "Lkotlin/jvm/functions/Function0;", "onCompleteStub", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ld5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44606ld5 {

    /* renamed from: a */
    public static final Function1<Object, Unit> f96455a = C25748c.f96460g;

    /* renamed from: b */
    public static final Function1<Throwable, Unit> f96456b = C25747b.f96459g;

    /* renamed from: c */
    public static final Function0<Unit> f96457c = C25746a.f96458g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ld5$a */
    /* loaded from: classes3.dex */
    public static final class C25746a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C25746a f96458g = new C25746a();

        public C25746a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ld5$b */
    /* loaded from: classes3.dex */
    public static final class C25747b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C25747b f96459g = new C25747b();

        public C25747b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ld5$c */
    /* loaded from: classes3.dex */
    public static final class C25748c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public static final C25748c f96460g = new C25748c();

        public C25748c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public static final <T> InterfaceC23484g<T> m27074d(final Function1<? super T, Unit> function1) {
        if (function1 == f96455a) {
            InterfaceC23484g<T> m32967g = C23506a.m32967g();
            Intrinsics.checkNotNullExpressionValue(m32967g, "emptyConsumer()");
            return m32967g;
        }
        return new InterfaceC23484g() { // from class: id5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44606ld5.m27073e(Function1.this, obj);
            }
        };
    }

    /* renamed from: e */
    public static final void m27073e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final InterfaceC23478a m27072f(final Function0<Unit> function0) {
        if (function0 == f96457c) {
            InterfaceC23478a EMPTY_ACTION = C23506a.f88247c;
            Intrinsics.checkNotNullExpressionValue(EMPTY_ACTION, "EMPTY_ACTION");
            return EMPTY_ACTION;
        }
        return new InterfaceC23478a() { // from class: jd5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C44606ld5.m27071g(Function0.this);
            }
        };
    }

    /* renamed from: g */
    public static final void m27071g(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* renamed from: h */
    public static final InterfaceC23484g<Throwable> m27070h(final Function1<? super Throwable, Unit> function1) {
        if (function1 == f96456b) {
            InterfaceC23484g<Throwable> ON_ERROR_MISSING = C23506a.f88250f;
            Intrinsics.checkNotNullExpressionValue(ON_ERROR_MISSING, "ON_ERROR_MISSING");
            return ON_ERROR_MISSING;
        }
        return new InterfaceC23484g() { // from class: kd5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44606ld5.m27069i(Function1.this, (Throwable) obj);
            }
        };
    }

    /* renamed from: i */
    public static final void m27069i(Function1 tmp0, Throwable th) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(th);
    }

    /* renamed from: j */
    public static final <T> InterfaceC23465c m27068j(ObservableSubscribeProxy<T> observableSubscribeProxy, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete, Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(observableSubscribeProxy, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        InterfaceC23465c subscribe = observableSubscribeProxy.subscribe(m27074d(onNext), m27070h(onError), m27072f(onComplete));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    /* renamed from: k */
    public static final <T> InterfaceC23465c m27067k(SingleSubscribeProxy<T> singleSubscribeProxy, Function1<? super Throwable, Unit> onError, Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(singleSubscribeProxy, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        InterfaceC23465c subscribe = singleSubscribeProxy.subscribe(m27074d(onSuccess), m27070h(onError));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return subscribe;
    }

    public static /* synthetic */ InterfaceC23465c subscribeBy$default(ObservableSubscribeProxy observableSubscribeProxy, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f96456b;
        }
        if ((i & 2) != 0) {
            function0 = f96457c;
        }
        if ((i & 4) != 0) {
            function12 = f96455a;
        }
        return m27068j(observableSubscribeProxy, function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC23465c subscribeBy$default(SingleSubscribeProxy singleSubscribeProxy, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f96456b;
        }
        if ((i & 2) != 0) {
            function12 = f96455a;
        }
        return m27067k(singleSubscribeProxy, function1, function12);
    }
}
