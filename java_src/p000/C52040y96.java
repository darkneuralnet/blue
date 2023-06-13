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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"Ly96;", "T", "LtP5;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "LEu1;", "c", "LEu1;", "flow", "LZC0;", DateTokenConverter.CONVERTER_KEY, "LZC0;", Action.SCOPE_ATTRIBUTE, "e", "_current", "getValue", "value", "<init>", "(Ljava/lang/Object;LEu1;LZC0;)V", "coroutine_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52040y96<T> implements InterfaceC49220tP5<T> {

    /* renamed from: b */
    public final T f118827b;

    /* renamed from: c */
    public final InterfaceC32730Eu1<T> f118828c;

    /* renamed from: d */
    public final ZC0 f118829d;

    /* renamed from: e */
    public T f118830e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedStateFlow", m28418f = "TransformedStateFlow.kt", m28417i = {0}, m28416l = {27, 27, 29}, m28415m = "collect", m28414n = {"collector"}, m28413s = {"L$0"})
    /* renamed from: y96$a */
    /* loaded from: classes3.dex */
    public static final class C30433a extends ContinuationImpl {

        /* renamed from: h */
        public Object f118831h;

        /* renamed from: i */
        public /* synthetic */ Object f118832i;

        /* renamed from: j */
        public final /* synthetic */ C52040y96<T> f118833j;

        /* renamed from: k */
        public int f118834k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30433a(C52040y96<T> c52040y96, Continuation<? super C30433a> continuation) {
            super(continuation);
            this.f118833j = c52040y96;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f118832i = obj;
            this.f118834k |= Integer.MIN_VALUE;
            return this.f118833j.collect(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedStateFlow$collect$2$1", m28418f = "TransformedStateFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: y96$b */
    /* loaded from: classes3.dex */
    public static final class C30434b extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f118835h;

        /* renamed from: i */
        public /* synthetic */ Object f118836i;

        /* renamed from: j */
        public final /* synthetic */ C52040y96<T> f118837j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30434b(C52040y96<T> c52040y96, Continuation<? super C30434b> continuation) {
            super(2, continuation);
            this.f118837j = c52040y96;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30434b c30434b = new C30434b(this.f118837j, continuation);
            c30434b.f118836i = obj;
            return c30434b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C30434b) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f118835h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f118837j.f118830e = this.f118836i;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedStateFlow$collect$3", m28418f = "TransformedStateFlow.kt", m28417i = {}, m28416l = {29, 29}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: y96$c */
    /* loaded from: classes3.dex */
    public static final class C30435c extends SuspendLambda implements Function2<ZC0, Continuation<?>, Object> {

        /* renamed from: h */
        public int f118838h;

        /* renamed from: i */
        public /* synthetic */ Object f118839i;

        /* renamed from: j */
        public final /* synthetic */ C52040y96<T> f118840j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33198Gu1<T> f118841k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedStateFlow$collect$3$1", m28418f = "TransformedStateFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: y96$c$a */
        /* loaded from: classes3.dex */
        public static final class C30436a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f118842h;

            /* renamed from: i */
            public /* synthetic */ Object f118843i;

            /* renamed from: j */
            public final /* synthetic */ C52040y96<T> f118844j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30436a(C52040y96<T> c52040y96, Continuation<? super C30436a> continuation) {
                super(2, continuation);
                this.f118844j = c52040y96;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C30436a c30436a = new C30436a(this.f118844j, continuation);
                c30436a.f118843i = obj;
                return c30436a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(T t, Continuation<? super Unit> continuation) {
                return ((C30436a) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f118842h == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f118844j.f118830e = this.f118843i;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30435c(C52040y96<T> c52040y96, InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super C30435c> continuation) {
            super(2, continuation);
            this.f118840j = c52040y96;
            this.f118841k = interfaceC33198Gu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30435c c30435c = new C30435c(this.f118840j, this.f118841k, continuation);
            c30435c.f118839i = obj;
            return c30435c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<?> continuation) {
            return ((C30435c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f118838h;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(C36708Vu1.m79255p(this.f118840j.f118828c), new C30436a(this.f118840j, null));
                this.f118838h = 1;
                obj = C36708Vu1.m79272P(m79276L, (ZC0) this.f118839i, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f118841k;
            this.f118838h = 2;
            if (((InterfaceC49220tP5) obj).collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C52040y96(T t, InterfaceC32730Eu1<? extends T> flow, ZC0 zc0) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f118827b = t;
        this.f118828c = flow;
        this.f118829d = zc0;
        this.f118830e = t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[RETURN] */
    @Override // p000.InterfaceC36280Ty5, p000.InterfaceC32730Eu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<?> continuation) {
        C30433a c30433a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C30433a) {
            c30433a = (C30433a) continuation;
            int i2 = c30433a.f118834k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30433a.f118834k = i2 - Integer.MIN_VALUE;
                Object obj = c30433a.f118832i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c30433a.f118834k;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        interfaceC33198Gu1 = (InterfaceC33198Gu1) c30433a.f118831h;
                        ResultKt.throwOnFailure(obj);
                        c30433a.f118831h = null;
                        c30433a.f118834k = 2;
                        if (((InterfaceC49220tP5) obj).collect(interfaceC33198Gu1, c30433a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f118829d != null) {
                        InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(C36708Vu1.m79255p(this.f118828c), new C30434b(this, null));
                        ZC0 zc0 = this.f118829d;
                        c30433a.f118831h = interfaceC33198Gu1;
                        c30433a.f118834k = 1;
                        obj = C36708Vu1.m79272P(m79276L, zc0, c30433a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c30433a.f118831h = null;
                        c30433a.f118834k = 2;
                        if (((InterfaceC49220tP5) obj).collect(interfaceC33198Gu1, c30433a) == coroutine_suspended) {
                        }
                    } else {
                        C30435c c30435c = new C30435c(this, interfaceC33198Gu1, null);
                        c30433a.f118834k = 3;
                        if (C37824aD0.m71786e(c30435c, c30433a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        c30433a = new C30433a(this, continuation);
        Object obj2 = c30433a.f118832i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c30433a.f118834k;
        if (i == 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC49220tP5
    public T getValue() {
        return this.f118830e;
    }
}
