package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b#\u0010$JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"LBY0;", "Laq5;", "LOX2;", "scrollPriority", "Lkotlin/Function2;", "LWp5;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "b", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "j", "()Lkotlin/jvm/functions/Function1;", "onDelta", "LWp5;", "scrollScope", "LRX2;", "LRX2;", "scrollMutex", "LEX2;", "", DateTokenConverter.CONVERTER_KEY, "LEX2;", "isScrollingState", "e", "()Z", "isScrollInProgress", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BY0 */
/* loaded from: classes.dex */
public final class BY0 implements InterfaceC38196aq5 {

    /* renamed from: a */
    public final Function1<Float, Float> f2490a;

    /* renamed from: b */
    public final InterfaceC36901Wp5 f2491b;

    /* renamed from: c */
    public final RX2 f2492c;

    /* renamed from: d */
    public final EX2<Boolean> f2493d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m28418f = "ScrollableState.kt", m28417i = {}, m28416l = {175}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: BY0$a */
    /* loaded from: classes.dex */
    public static final class C0636a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f2494h;

        /* renamed from: j */
        public final /* synthetic */ OX2 f2496j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> f2497k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m28418f = "ScrollableState.kt", m28417i = {}, m28416l = {178}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: BY0$a$a */
        /* loaded from: classes.dex */
        public static final class C0637a extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f2498h;

            /* renamed from: i */
            public /* synthetic */ Object f2499i;

            /* renamed from: j */
            public final /* synthetic */ BY0 f2500j;

            /* renamed from: k */
            public final /* synthetic */ Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> f2501k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0637a(BY0 by0, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0637a> continuation) {
                super(2, continuation);
                this.f2500j = by0;
                this.f2501k = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0637a c0637a = new C0637a(this.f2500j, this.f2501k, continuation);
                c0637a.f2499i = obj;
                return c0637a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
                return ((C0637a) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f2498h;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC36901Wp5 interfaceC36901Wp5 = (InterfaceC36901Wp5) this.f2499i;
                        this.f2500j.f2493d.setValue(Boxing.boxBoolean(true));
                        Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> function2 = this.f2501k;
                        this.f2498h = 1;
                        if (function2.invoke(interfaceC36901Wp5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.f2500j.f2493d.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.f2500j.f2493d.setValue(Boxing.boxBoolean(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0636a(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0636a> continuation) {
            super(2, continuation);
            this.f2496j = ox2;
            this.f2497k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0636a(this.f2496j, this.f2497k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C0636a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2494h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RX2 rx2 = BY0.this.f2492c;
                InterfaceC36901Wp5 interfaceC36901Wp5 = BY0.this.f2491b;
                OX2 ox2 = this.f2496j;
                C0637a c0637a = new C0637a(BY0.this, this.f2497k, null);
                this.f2494h = 1;
                if (rx2.m86635d(interfaceC36901Wp5, ox2, c0637a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"BY0$b", "LWp5;", "", "pixels", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: BY0$b */
    /* loaded from: classes.dex */
    public static final class C0638b implements InterfaceC36901Wp5 {
        public C0638b() {
        }

        @Override // p000.InterfaceC36901Wp5
        /* renamed from: a */
        public float mo43646a(float f) {
            return BY0.this.m113882j().invoke(Float.valueOf(f)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BY0(Function1<? super Float, Float> onDelta) {
        EX2<Boolean> m97025e;
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f2490a = onDelta;
        this.f2491b = new C0638b();
        this.f2492c = new RX2();
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f2493d = m97025e;
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: b */
    public float mo11048b(float f) {
        return this.f2490a.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: c */
    public Object mo11047c(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C0636a(ox2, function2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: e */
    public boolean mo11046e() {
        return this.f2493d.getValue().booleanValue();
    }

    /* renamed from: j */
    public final Function1<Float, Float> m113882j() {
        return this.f2490a;
    }
}
