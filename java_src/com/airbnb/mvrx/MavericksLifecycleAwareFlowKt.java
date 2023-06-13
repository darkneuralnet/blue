package com.airbnb.mvrx;

import androidx.lifecycle.AbstractC11719f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.InterfaceC44162ks4;
import p000.InterfaceC52463ys5;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\t"}, m28432d2 = {"T", "LEu1;", "LLifecycleOwner;", "owner", "b", "Landroidx/lifecycle/f;", "LFh0;", "", "c", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MavericksLifecycleAwareFlowKt {

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "LGu1;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {30}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a */
    /* loaded from: classes2.dex */
    public static final class C16863a extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f68509h;

        /* renamed from: i */
        public /* synthetic */ Object f68510i;

        /* renamed from: j */
        public final /* synthetic */ LifecycleOwner f68511j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC32730Eu1<T> f68512k;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {0, 0, 0, 0, 0, 0}, m28416l = {101}, m28415m = "invokeSuspend", m28414n = {"startedChannel", "flowChannel", "transform", "started", "flowValue", "isClosed"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
        /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a */
        /* loaded from: classes2.dex */
        public static final class C16864a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f68513h;

            /* renamed from: i */
            public Object f68514i;

            /* renamed from: j */
            public Object f68515j;

            /* renamed from: k */
            public Object f68516k;

            /* renamed from: l */
            public Object f68517l;

            /* renamed from: m */
            public int f68518m;

            /* renamed from: n */
            public /* synthetic */ Object f68519n;

            /* renamed from: o */
            public final /* synthetic */ LifecycleOwner f68520o;

            /* renamed from: p */
            public final /* synthetic */ InterfaceC32730Eu1<T> f68521p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC33198Gu1<T> f68522q;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"T", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$2", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {50}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C16865a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68523h;

                /* renamed from: i */
                public /* synthetic */ boolean f68524i;

                /* renamed from: j */
                public final /* synthetic */ Ref.ObjectRef<Boolean> f68525j;

                /* renamed from: k */
                public final /* synthetic */ Ref.ObjectRef<T> f68526k;

                /* renamed from: l */
                public final /* synthetic */ Function3<Boolean, T, Continuation<? super Unit>, Object> f68527l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16865a(Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<T> objectRef2, Function3<? super Boolean, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C16865a> continuation) {
                    super(2, continuation);
                    this.f68525j = objectRef;
                    this.f68526k = objectRef2;
                    this.f68527l = function3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C16865a c16865a = new C16865a(this.f68525j, this.f68526k, this.f68527l, continuation);
                    c16865a.f68524i = ((Boolean) obj).booleanValue();
                    return c16865a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68523h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        boolean z = this.f68524i;
                        this.f68525j.element = Boxing.boxBoolean(z);
                        if (this.f68526k.element != null) {
                            Function3<Boolean, T, Continuation<? super Unit>, Object> function3 = this.f68527l;
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            Object obj2 = this.f68526k.element;
                            this.f68523h = 1;
                            if (function3.invoke(boxBoolean, obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C16865a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$4", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {56}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$b */
            /* loaded from: classes2.dex */
            public static final class C16866b extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68528h;

                /* renamed from: i */
                public /* synthetic */ Object f68529i;

                /* renamed from: j */
                public final /* synthetic */ Ref.ObjectRef<T> f68530j;

                /* renamed from: k */
                public final /* synthetic */ Ref.ObjectRef<Boolean> f68531k;

                /* renamed from: l */
                public final /* synthetic */ Function3<Boolean, T, Continuation<? super Unit>, Object> f68532l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16866b(Ref.ObjectRef<T> objectRef, Ref.ObjectRef<Boolean> objectRef2, Function3<? super Boolean, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C16866b> continuation) {
                    super(2, continuation);
                    this.f68530j = objectRef;
                    this.f68531k = objectRef2;
                    this.f68532l = function3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C16866b c16866b = new C16866b(this.f68530j, this.f68531k, this.f68532l, continuation);
                    c16866b.f68529i = obj;
                    return c16866b;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(T t, Continuation<? super Unit> continuation) {
                    return ((C16866b) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68528h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        ?? r6 = this.f68529i;
                        this.f68530j.element = r6;
                        Boolean bool = this.f68531k.element;
                        if (bool != null) {
                            Function3<Boolean, T, Continuation<? super Unit>, Object> function3 = this.f68532l;
                            Intrinsics.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
                            this.f68528h = 1;
                            if (function3.invoke(bool, r6, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "Ln74;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {32}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$c */
            /* loaded from: classes2.dex */
            public static final class C16867c extends SuspendLambda implements Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68533h;

                /* renamed from: i */
                public /* synthetic */ Object f68534i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC32730Eu1<T> f68535j;

                @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
                /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$c$a */
                /* loaded from: classes2.dex */
                public static final class C16868a<T> implements InterfaceC33198Gu1 {

                    /* renamed from: b */
                    public final /* synthetic */ InterfaceC45497n74<T> f68536b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C16868a(InterfaceC45497n74<? super T> interfaceC45497n74) {
                        this.f68536b = interfaceC45497n74;
                    }

                    @Override // p000.InterfaceC33198Gu1
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        Object coroutine_suspended;
                        Object mo2351M = this.f68536b.mo2351M(t, continuation);
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return mo2351M == coroutine_suspended ? mo2351M : Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16867c(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super C16867c> continuation) {
                    super(2, continuation);
                    this.f68535j = interfaceC32730Eu1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C16867c c16867c = new C16867c(this.f68535j, continuation);
                    c16867c.f68534i = obj;
                    return c16867c;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
                    return ((C16867c) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68533h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f68535j;
                        C16868a c16868a = new C16868a((InterfaceC45497n74) this.f68534i);
                        this.f68533h = 1;
                        if (interfaceC32730Eu1.collect(c16868a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "LQh0;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$1", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {94}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$d */
            /* loaded from: classes2.dex */
            public static final class C16869d extends SuspendLambda implements Function2<C35420Qh0<? extends Boolean>, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68537h;

                /* renamed from: i */
                public /* synthetic */ Object f68538i;

                /* renamed from: j */
                public final /* synthetic */ Function2 f68539j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC44162ks4 f68540k;

                /* renamed from: l */
                public final /* synthetic */ Ref.BooleanRef f68541l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16869d(Function2 function2, Continuation continuation, InterfaceC44162ks4 interfaceC44162ks4, Ref.BooleanRef booleanRef) {
                    super(2, continuation);
                    this.f68539j = function2;
                    this.f68540k = interfaceC44162ks4;
                    this.f68541l = booleanRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C16869d c16869d = new C16869d(this.f68539j, continuation, this.f68540k, this.f68541l);
                    c16869d.f68538i = obj;
                    return c16869d;
                }

                /* renamed from: e */
                public final Object m53522e(Object obj, Continuation<? super Unit> continuation) {
                    return ((C16869d) create(C35420Qh0.m88188b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(C35420Qh0<? extends Boolean> c35420Qh0, Continuation<? super Unit> continuation) {
                    return m53522e(c35420Qh0.m88178l(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68537h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Object m88184f = C35420Qh0.m88184f(((C35420Qh0) this.f68538i).m88178l());
                        if (m88184f == null) {
                            InterfaceC44162ks4.C25541a.m28252a(this.f68540k, null, 1, null);
                            this.f68541l.element = true;
                        } else {
                            Function2 function2 = this.f68539j;
                            this.f68537h = 1;
                            if (function2.invoke(m88184f, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "LQh0;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$2", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {94}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$e */
            /* loaded from: classes2.dex */
            public static final class C16870e extends SuspendLambda implements Function2<C35420Qh0<? extends T>, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68542h;

                /* renamed from: i */
                public /* synthetic */ Object f68543i;

                /* renamed from: j */
                public final /* synthetic */ Function2 f68544j;

                /* renamed from: k */
                public final /* synthetic */ Ref.BooleanRef f68545k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16870e(Function2 function2, Continuation continuation, Ref.BooleanRef booleanRef) {
                    super(2, continuation);
                    this.f68544j = function2;
                    this.f68545k = booleanRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C16870e c16870e = new C16870e(this.f68544j, continuation, this.f68545k);
                    c16870e.f68543i = obj;
                    return c16870e;
                }

                /* renamed from: e */
                public final Object m53521e(Object obj, Continuation<? super Unit> continuation) {
                    return ((C16870e) create(C35420Qh0.m88188b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
                    return m53521e(((C35420Qh0) obj).m88178l(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68542h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Object m88184f = C35420Qh0.m88184f(((C35420Qh0) this.f68543i).m88178l());
                        if (m88184f == null) {
                            this.f68545k.element = true;
                        } else {
                            Function2 function2 = this.f68544j;
                            this.f68542h = 1;
                            if (function2.invoke(m88184f, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "", "started", "value", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1", m28418f = "MavericksLifecycleAwareFlow.kt", m28417i = {}, m28416l = {36}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$a$a$f */
            /* loaded from: classes2.dex */
            public static final class C16871f extends SuspendLambda implements Function3<Boolean, T, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f68546h;

                /* renamed from: i */
                public /* synthetic */ boolean f68547i;

                /* renamed from: j */
                public /* synthetic */ Object f68548j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC33198Gu1<T> f68549k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16871f(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super C16871f> continuation) {
                    super(3, continuation);
                    this.f68549k = interfaceC33198Gu1;
                }

                /* renamed from: e */
                public final Object m53520e(boolean z, T t, Continuation<? super Unit> continuation) {
                    C16871f c16871f = new C16871f(this.f68549k, continuation);
                    c16871f.f68547i = z;
                    c16871f.f68548j = t;
                    return c16871f.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj, Continuation<? super Unit> continuation) {
                    return m53520e(bool.booleanValue(), obj, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f68546h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        boolean z = this.f68547i;
                        Object obj2 = this.f68548j;
                        if (z) {
                            InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f68549k;
                            this.f68546h = 1;
                            if (interfaceC33198Gu1.emit(obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C16864a(LifecycleOwner lifecycleOwner, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super C16864a> continuation) {
                super(2, continuation);
                this.f68520o = lifecycleOwner;
                this.f68521p = interfaceC32730Eu1;
                this.f68522q = interfaceC33198Gu1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C16864a c16864a = new C16864a(this.f68520o, this.f68521p, this.f68522q, continuation);
                c16864a.f68519n = obj;
                return c16864a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C16864a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                Ref.BooleanRef booleanRef;
                C16864a c16864a;
                InterfaceC32846Fh0 interfaceC32846Fh0;
                Object obj2;
                InterfaceC44162ks4 interfaceC44162ks4;
                Ref.ObjectRef objectRef;
                Function3 function3;
                Ref.ObjectRef objectRef2;
                Object coroutine_suspended2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f68518m;
                if (i != 0) {
                    if (i == 1) {
                        objectRef = (Ref.ObjectRef) this.f68516k;
                        objectRef2 = (Ref.ObjectRef) this.f68515j;
                        function3 = (Function3) this.f68514i;
                        interfaceC44162ks4 = (InterfaceC44162ks4) this.f68513h;
                        ResultKt.throwOnFailure(obj);
                        c16864a = this;
                        interfaceC32846Fh0 = (InterfaceC32846Fh0) this.f68519n;
                        booleanRef = (Ref.BooleanRef) this.f68517l;
                        obj2 = coroutine_suspended;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc0 = (ZC0) this.f68519n;
                    AbstractC11719f lifecycle = this.f68520o.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "owner.lifecycle");
                    InterfaceC32846Fh0 m53524c = MavericksLifecycleAwareFlowKt.m53524c(lifecycle);
                    InterfaceC44162ks4 m31068e = C43125j74.m31068e(zc0, null, 0, new C16867c(this.f68521p, null), 3, null);
                    C16871f c16871f = new C16871f(this.f68522q, null);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    booleanRef = new Ref.BooleanRef();
                    c16864a = this;
                    interfaceC32846Fh0 = m53524c;
                    obj2 = coroutine_suspended;
                    interfaceC44162ks4 = m31068e;
                    objectRef = objectRef4;
                    function3 = c16871f;
                    objectRef2 = objectRef3;
                }
                while (!booleanRef.element) {
                    c16864a.f68519n = interfaceC32846Fh0;
                    c16864a.f68513h = interfaceC44162ks4;
                    c16864a.f68514i = function3;
                    c16864a.f68515j = objectRef2;
                    c16864a.f68516k = objectRef;
                    c16864a.f68517l = booleanRef;
                    c16864a.f68518m = 1;
                    C41781gr5 c41781gr5 = new C41781gr5(c16864a);
                    try {
                        c41781gr5.mo37384k(interfaceC32846Fh0.mo28255j(), new C16869d(new C16865a(objectRef2, objectRef, function3, null), null, interfaceC44162ks4, booleanRef));
                        c41781gr5.mo37384k(interfaceC44162ks4.mo28255j(), new C16870e(new C16866b(objectRef, objectRef2, function3, null), null, booleanRef));
                    } catch (Throwable th) {
                        c41781gr5.m37387W(th);
                    }
                    Object m37388V = c41781gr5.m37388V();
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m37388V == coroutine_suspended2) {
                        DebugProbesKt.probeCoroutineSuspended(c16864a);
                        continue;
                    }
                    if (m37388V == obj2) {
                        return obj2;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16863a(LifecycleOwner lifecycleOwner, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super C16863a> continuation) {
            super(2, continuation);
            this.f68511j = lifecycleOwner;
            this.f68512k = interfaceC32730Eu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C16863a c16863a = new C16863a(this.f68511j, this.f68512k, continuation);
            c16863a.f68510i = obj;
            return c16863a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C16863a) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f68509h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C16864a c16864a = new C16864a(this.f68511j, this.f68512k, (InterfaceC33198Gu1) this.f68510i, null);
                this.f68509h = 1;
                if (C37824aD0.m71786e(c16864a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$b */
    /* loaded from: classes2.dex */
    public static final class C16872b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC11719f f68550g;

        /* renamed from: h */
        public final /* synthetic */ MavericksLifecycleAwareFlowKt$startedChannel$observer$1 f68551h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16872b(AbstractC11719f abstractC11719f, MavericksLifecycleAwareFlowKt$startedChannel$observer$1 mavericksLifecycleAwareFlowKt$startedChannel$observer$1) {
            super(1);
            this.f68550g = abstractC11719f;
            this.f68551h = mavericksLifecycleAwareFlowKt$startedChannel$observer$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f68550g.mo67006d(this.f68551h);
        }
    }

    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m53525b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        return C36708Vu1.m79283E(new C16863a(owner, interfaceC32730Eu1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1, Fq2] */
    /* renamed from: c */
    public static final InterfaceC32846Fh0<Boolean> m53524c(AbstractC11719f abstractC11719f) {
        final InterfaceC32846Fh0<Boolean> m89918b = C35186Ph0.m89918b(-1, null, null, 6, null);
        ?? r1 = new VX0() { // from class: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1
            @Override // p000.VX0
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC52463ys5.C30763a.m2348a(m89918b, null, 1, null);
            }

            @Override // p000.VX0
            public void onStart(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                m89918b.mo2349h(Boolean.TRUE);
            }

            @Override // p000.VX0
            public void onStop(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                m89918b.mo2349h(Boolean.FALSE);
            }
        };
        abstractC11719f.mo67008a(r1);
        m89918b.mo2350e(new C16872b(abstractC11719f, r1));
        return m89918b;
    }
}
