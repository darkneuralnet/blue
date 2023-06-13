package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LNh0;", "T", "R", "LLh0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "LHh0;", "h", "LGu1;", "collector", "", "p", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "f", "Lkotlin/jvm/functions/Function3;", "transform", "LEu1;", "flow", "<init>", "(Lkotlin/jvm/functions/Function3;LEu1;Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Nh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34718Nh0<T, R> extends AbstractC34250Lh0<T, R> {

    /* renamed from: f */
    public final Function3<InterfaceC33198Gu1<? super R>, T, Continuation<? super Unit>, Object> f24977f;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"T", "R", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m28418f = "Merge.kt", m28417i = {}, m28416l = {27}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Nh0$a */
    /* loaded from: classes8.dex */
    public static final class C5650a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f24978h;

        /* renamed from: i */
        public /* synthetic */ Object f24979i;

        /* renamed from: j */
        public final /* synthetic */ C34718Nh0<T, R> f24980j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33198Gu1<R> f24981k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: Nh0$a$a */
        /* loaded from: classes8.dex */
        public static final class C5651a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ Ref.ObjectRef<InterfaceC52943zh2> f24982b;

            /* renamed from: c */
            public final /* synthetic */ ZC0 f24983c;

            /* renamed from: d */
            public final /* synthetic */ C34718Nh0<T, R> f24984d;

            /* renamed from: e */
            public final /* synthetic */ InterfaceC33198Gu1<R> f24985e;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m28432d2 = {"T", "R", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m28418f = "Merge.kt", m28417i = {}, m28416l = {34}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: Nh0$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C5652a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f24986h;

                /* renamed from: i */
                public final /* synthetic */ C34718Nh0<T, R> f24987i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC33198Gu1<R> f24988j;

                /* renamed from: k */
                public final /* synthetic */ T f24989k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C5652a(C34718Nh0<T, R> c34718Nh0, InterfaceC33198Gu1<? super R> interfaceC33198Gu1, T t, Continuation<? super C5652a> continuation) {
                    super(2, continuation);
                    this.f24987i = c34718Nh0;
                    this.f24988j = interfaceC33198Gu1;
                    this.f24989k = t;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C5652a(this.f24987i, this.f24988j, this.f24989k, continuation);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C5652a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f24986h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.f24987i.f24977f;
                        InterfaceC33198Gu1<R> interfaceC33198Gu1 = this.f24988j;
                        T t = this.f24989k;
                        this.f24986h = 1;
                        if (function3.invoke(interfaceC33198Gu1, t, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return invoke2(zc0, continuation);
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m28418f = "Merge.kt", m28417i = {0, 0}, m28416l = {30}, m28415m = "emit", m28414n = {"this", "value"}, m28413s = {"L$0", "L$1"})
            /* renamed from: Nh0$a$a$b */
            /* loaded from: classes8.dex */
            public static final class C5653b extends ContinuationImpl {

                /* renamed from: h */
                public Object f24990h;

                /* renamed from: i */
                public Object f24991i;

                /* renamed from: j */
                public Object f24992j;

                /* renamed from: k */
                public /* synthetic */ Object f24993k;

                /* renamed from: l */
                public final /* synthetic */ C5651a<T> f24994l;

                /* renamed from: m */
                public int f24995m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C5653b(C5651a<? super T> c5651a, Continuation<? super C5653b> continuation) {
                    super(continuation);
                    this.f24994l = c5651a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f24993k = obj;
                    this.f24995m |= Integer.MIN_VALUE;
                    return this.f24994l.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C5651a(Ref.ObjectRef<InterfaceC52943zh2> objectRef, ZC0 zc0, C34718Nh0<T, R> c34718Nh0, InterfaceC33198Gu1<? super R> interfaceC33198Gu1) {
                this.f24982b = objectRef;
                this.f24983c = zc0;
                this.f24984d = c34718Nh0;
                this.f24985e = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                C5653b c5653b;
                Object coroutine_suspended;
                int i;
                C5651a<T> c5651a;
                InterfaceC52943zh2 m73800d;
                if (continuation instanceof C5653b) {
                    c5653b = (C5653b) continuation;
                    int i2 = c5653b.f24995m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c5653b.f24995m = i2 - Integer.MIN_VALUE;
                        Object obj = c5653b.f24993k;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c5653b.f24995m;
                        if (i == 0) {
                            if (i == 1) {
                                InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) c5653b.f24992j;
                                t = (T) c5653b.f24991i;
                                c5651a = (C5651a) c5653b.f24990h;
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC52943zh2 interfaceC52943zh22 = this.f24982b.element;
                            if (interfaceC52943zh22 != null) {
                                interfaceC52943zh22.mo552f(new ChildCancelledException());
                                c5653b.f24990h = this;
                                c5653b.f24991i = t;
                                c5653b.f24992j = interfaceC52943zh22;
                                c5653b.f24995m = 1;
                                if (interfaceC52943zh22.mo557P(c5653b) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c5651a = this;
                        }
                        Ref.ObjectRef<InterfaceC52943zh2> objectRef = c5651a.f24982b;
                        m73800d = Z30.m73800d(c5651a.f24983c, null, EnumC38417bD0.UNDISPATCHED, new C5652a(c5651a.f24984d, c5651a.f24985e, t, null), 1, null);
                        objectRef.element = (T) m73800d;
                        return Unit.INSTANCE;
                    }
                }
                c5653b = new C5653b(this, continuation);
                Object obj2 = c5653b.f24993k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5653b.f24995m;
                if (i == 0) {
                }
                Ref.ObjectRef<InterfaceC52943zh2> objectRef2 = c5651a.f24982b;
                m73800d = Z30.m73800d(c5651a.f24983c, null, EnumC38417bD0.UNDISPATCHED, new C5652a(c5651a.f24984d, c5651a.f24985e, t, null), 1, null);
                objectRef2.element = (T) m73800d;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5650a(C34718Nh0<T, R> c34718Nh0, InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Continuation<? super C5650a> continuation) {
            super(2, continuation);
            this.f24980j = c34718Nh0;
            this.f24981k = interfaceC33198Gu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C5650a c5650a = new C5650a(this.f24980j, this.f24981k, continuation);
            c5650a.f24979i = obj;
            return c5650a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C5650a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24978h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C34718Nh0<T, R> c34718Nh0 = this.f24980j;
                InterfaceC32730Eu1<S> interfaceC32730Eu1 = c34718Nh0.f21930e;
                C5651a c5651a = new C5651a(objectRef, (ZC0) this.f24979i, c34718Nh0, this.f24981k);
                this.f24978h = 1;
                if (interfaceC32730Eu1.collect(c5651a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    public /* synthetic */ C34718Nh0(Function3 function3, InterfaceC32730Eu1 interfaceC32730Eu1, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, interfaceC32730Eu1, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC43674k30.SUSPEND : enumC43674k30);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: h */
    public AbstractC33314Hh0<R> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return new C34718Nh0(this.f24977f, this.f21930e, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.AbstractC34250Lh0
    /* renamed from: p */
    public Object mo93574p(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C5650a(this, interfaceC33198Gu1, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34718Nh0(Function3<? super InterfaceC33198Gu1<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        super(interfaceC32730Eu1, coroutineContext, i, enumC43674k30);
        this.f24977f = function3;
    }
}
