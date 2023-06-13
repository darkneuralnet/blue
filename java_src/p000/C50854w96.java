package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC43640jz5;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lw96;", "T", "LTy5;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEu1;", "b", "LEu1;", "flow", "LZC0;", "c", "LZC0;", Action.SCOPE_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "_current", "initial", "<init>", "(Ljava/lang/Object;LEu1;LZC0;)V", "coroutine_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50854w96<T> implements InterfaceC36280Ty5<T> {

    /* renamed from: b */
    public final InterfaceC32730Eu1<T> f115412b;

    /* renamed from: c */
    public final ZC0 f115413c;

    /* renamed from: d */
    public T f115414d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedShareFlow", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {36, 38}, m28415m = "collect", m28414n = {}, m28413s = {})
    /* renamed from: w96$a */
    /* loaded from: classes3.dex */
    public static final class C29787a extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f115415h;

        /* renamed from: i */
        public final /* synthetic */ C50854w96<T> f115416i;

        /* renamed from: j */
        public int f115417j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29787a(C50854w96<T> c50854w96, Continuation<? super C29787a> continuation) {
            super(continuation);
            this.f115416i = c50854w96;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115415h = obj;
            this.f115417j |= Integer.MIN_VALUE;
            return this.f115416i.collect(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedShareFlow$collect$2$1", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w96$b */
    /* loaded from: classes3.dex */
    public static final class C29788b extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115418h;

        /* renamed from: i */
        public /* synthetic */ Object f115419i;

        /* renamed from: j */
        public final /* synthetic */ C50854w96<T> f115420j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29788b(C50854w96<T> c50854w96, Continuation<? super C29788b> continuation) {
            super(2, continuation);
            this.f115420j = c50854w96;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29788b c29788b = new C29788b(this.f115420j, continuation);
            c29788b.f115419i = obj;
            return c29788b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C29788b) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115418h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f115420j.f115414d = this.f115419i;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedShareFlow$collect$3", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {48}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w96$c */
    /* loaded from: classes3.dex */
    public static final class C29789c extends SuspendLambda implements Function2<ZC0, Continuation<?>, Object> {

        /* renamed from: h */
        public int f115421h;

        /* renamed from: i */
        public /* synthetic */ Object f115422i;

        /* renamed from: j */
        public final /* synthetic */ C50854w96<T> f115423j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33198Gu1<T> f115424k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedShareFlow$collect$3$1", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: w96$c$a */
        /* loaded from: classes3.dex */
        public static final class C29790a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f115425h;

            /* renamed from: i */
            public /* synthetic */ Object f115426i;

            /* renamed from: j */
            public final /* synthetic */ C50854w96<T> f115427j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29790a(C50854w96<T> c50854w96, Continuation<? super C29790a> continuation) {
                super(2, continuation);
                this.f115427j = c50854w96;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C29790a c29790a = new C29790a(this.f115427j, continuation);
                c29790a.f115426i = obj;
                return c29790a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(T t, Continuation<? super Unit> continuation) {
                return ((C29790a) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f115425h == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f115427j.f115414d = this.f115426i;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29789c(C50854w96<T> c50854w96, InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super C29789c> continuation) {
            super(2, continuation);
            this.f115423j = c50854w96;
            this.f115424k = interfaceC33198Gu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29789c c29789c = new C29789c(this.f115423j, this.f115424k, continuation);
            c29789c.f115422i = obj;
            return c29789c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<?> continuation) {
            return ((C29789c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f115421h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC36280Ty5 m79274N = C36708Vu1.m79274N(C36708Vu1.m79276L(this.f115423j.f115412b, new C29790a(this.f115423j, null)), (ZC0) this.f115422i, InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 1, null), 1);
                InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f115424k;
                this.f115421h = 1;
                if (m79274N.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C50854w96(T t, InterfaceC32730Eu1<? extends T> flow, ZC0 zc0) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f115412b = flow;
        this.f115413c = zc0;
        this.f115414d = t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // p000.InterfaceC36280Ty5, p000.InterfaceC32730Eu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<?> continuation) {
        C29787a c29787a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C29787a) {
            c29787a = (C29787a) continuation;
            int i2 = c29787a.f115417j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29787a.f115417j = i2 - Integer.MIN_VALUE;
                Object obj = c29787a.f115415h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29787a.f115417j;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = this.f115413c;
                if (zc0 != null) {
                    InterfaceC36280Ty5 m79274N = C36708Vu1.m79274N(C36708Vu1.m79276L(this.f115412b, new C29788b(this, null)), zc0, InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 1, null), 1);
                    c29787a.f115417j = 1;
                    if (m79274N.collect(interfaceC33198Gu1, c29787a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw new KotlinNothingValueException();
                }
                C29789c c29789c = new C29789c(this, interfaceC33198Gu1, null);
                c29787a.f115417j = 2;
                if (C37824aD0.m71786e(c29789c, c29787a) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
        }
        c29787a = new C29787a(this, continuation);
        Object obj2 = c29787a.f115415h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29787a.f115417j;
        if (i == 0) {
        }
    }
}
