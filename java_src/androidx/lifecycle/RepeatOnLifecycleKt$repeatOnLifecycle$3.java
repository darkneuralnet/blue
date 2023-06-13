package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m28418f = "RepeatOnLifecycle.kt", m28417i = {}, m28416l = {84}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

    /* renamed from: h */
    public int f54854h;

    /* renamed from: i */
    public /* synthetic */ Object f54855i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC11719f f54856j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC11719f.EnumC11724b f54857k;

    /* renamed from: l */
    public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f54858l;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m28418f = "RepeatOnLifecycle.kt", m28417i = {0, 0}, m28416l = {166}, m28415m = "invokeSuspend", m28414n = {"launchedJob", "observer"}, m28413s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* loaded from: classes.dex */
    public static final class C117051 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f54859h;

        /* renamed from: i */
        public Object f54860i;

        /* renamed from: j */
        public Object f54861j;

        /* renamed from: k */
        public Object f54862k;

        /* renamed from: l */
        public Object f54863l;

        /* renamed from: m */
        public Object f54864m;

        /* renamed from: n */
        public int f54865n;

        /* renamed from: o */
        public final /* synthetic */ AbstractC11719f f54866o;

        /* renamed from: p */
        public final /* synthetic */ AbstractC11719f.EnumC11724b f54867p;

        /* renamed from: q */
        public final /* synthetic */ ZC0 f54868q;

        /* renamed from: r */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f54869r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117051(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11724b enumC11724b, ZC0 zc0, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C117051> continuation) {
            super(2, continuation);
            this.f54866o = abstractC11719f;
            this.f54867p = enumC11724b;
            this.f54868q = zc0;
            this.f54869r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C117051(this.f54866o, this.f54867p, this.f54868q, this.f54869r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C117051) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Continuation intercepted;
            Object coroutine_suspended2;
            InterfaceC52943zh2 interfaceC52943zh2;
            InterfaceC11728i interfaceC11728i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54865n;
            if (i != 0) {
                if (i == 1) {
                    Function2 function2 = (Function2) this.f54864m;
                    ZC0 zc0 = (ZC0) this.f54863l;
                    AbstractC11719f abstractC11719f = (AbstractC11719f) this.f54862k;
                    AbstractC11719f.EnumC11724b enumC11724b = (AbstractC11719f.EnumC11724b) this.f54861j;
                    objectRef2 = (Ref.ObjectRef) this.f54860i;
                    objectRef = (Ref.ObjectRef) this.f54859h;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        interfaceC52943zh2 = (InterfaceC52943zh2) objectRef.element;
                        if (interfaceC52943zh2 != null) {
                        }
                        interfaceC11728i = (InterfaceC11728i) objectRef2.element;
                        if (interfaceC11728i != null) {
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f54866o.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
                    return Unit.INSTANCE;
                }
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                try {
                    AbstractC11719f.EnumC11724b enumC11724b2 = this.f54867p;
                    AbstractC11719f abstractC11719f2 = this.f54866o;
                    final ZC0 zc02 = this.f54868q;
                    final Function2<ZC0, Continuation<? super Unit>, Object> function22 = this.f54869r;
                    this.f54859h = objectRef3;
                    this.f54860i = objectRef4;
                    this.f54861j = enumC11724b2;
                    this.f54862k = abstractC11719f2;
                    this.f54863l = zc02;
                    this.f54864m = function22;
                    this.f54865n = 1;
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this);
                    final C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
                    c37013Xc0.m76766u();
                    AbstractC11719f.EnumC11720a.C11721a c11721a = AbstractC11719f.EnumC11720a.Companion;
                    final AbstractC11719f.EnumC11720a m67015c = c11721a.m67015c(enumC11724b2);
                    final AbstractC11719f.EnumC11720a m67017a = c11721a.m67017a(enumC11724b2);
                    final SX2 m81380b = UX2.m81380b(false, 1, null);
                    ?? r10 = new InterfaceC11728i() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                        @DebugMetadata(m28419c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m28418f = "RepeatOnLifecycle.kt", m28417i = {0, 1}, m28416l = {171, 110}, m28415m = "invokeSuspend", m28414n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$0"})
                        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
                        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
                        /* loaded from: classes.dex */
                        public static final class C11706a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                            /* renamed from: h */
                            public Object f54877h;

                            /* renamed from: i */
                            public Object f54878i;

                            /* renamed from: j */
                            public int f54879j;

                            /* renamed from: k */
                            public final /* synthetic */ SX2 f54880k;

                            /* renamed from: l */
                            public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f54881l;

                            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                            @DebugMetadata(m28419c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", m28418f = "RepeatOnLifecycle.kt", m28417i = {}, m28416l = {111}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                            /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
                            /* loaded from: classes.dex */
                            public static final class C11707a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                                /* renamed from: h */
                                public int f54882h;

                                /* renamed from: i */
                                public /* synthetic */ Object f54883i;

                                /* renamed from: j */
                                public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f54884j;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C11707a(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11707a> continuation) {
                                    super(2, continuation);
                                    this.f54884j = function2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    C11707a c11707a = new C11707a(this.f54884j, continuation);
                                    c11707a.f54883i = obj;
                                    return c11707a;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                                    return ((C11707a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended;
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.f54882h;
                                    if (i != 0) {
                                        if (i == 1) {
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f54884j;
                                        this.f54882h = 1;
                                        if (function2.invoke((ZC0) this.f54883i, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C11706a(SX2 sx2, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C11706a> continuation) {
                                super(2, continuation);
                                this.f54880k = sx2;
                                this.f54881l = function2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C11706a(this.f54880k, this.f54881l, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                                return ((C11706a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended;
                                SX2 sx2;
                                Function2<ZC0, Continuation<? super Unit>, Object> function2;
                                SX2 sx22;
                                Throwable th;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.f54879j;
                                try {
                                    if (i != 0) {
                                        if (i != 1) {
                                            if (i == 2) {
                                                sx22 = (SX2) this.f54877h;
                                                try {
                                                    ResultKt.throwOnFailure(obj);
                                                    Unit unit = Unit.INSTANCE;
                                                    sx22.mo83451b(null);
                                                    return Unit.INSTANCE;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sx22.mo83451b(null);
                                                    throw th;
                                                }
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        function2 = (Function2) this.f54878i;
                                        ResultKt.throwOnFailure(obj);
                                        sx2 = (SX2) this.f54877h;
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        sx2 = this.f54880k;
                                        function2 = this.f54881l;
                                        this.f54877h = sx2;
                                        this.f54878i = function2;
                                        this.f54879j = 1;
                                        if (sx2.mo83452a(null, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    C11707a c11707a = new C11707a(function2, null);
                                    this.f54877h = sx2;
                                    this.f54878i = null;
                                    this.f54879j = 2;
                                    if (C37824aD0.m71786e(c11707a, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    sx22 = sx2;
                                    Unit unit2 = Unit.INSTANCE;
                                    sx22.mo83451b(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    sx22 = sx2;
                                    th = th3;
                                    sx22.mo83451b(null);
                                    throw th;
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r9v5, types: [T, zh2] */
                        @Override // androidx.lifecycle.InterfaceC11728i
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
                            ?? m73800d;
                            Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event == AbstractC11719f.EnumC11720a.this) {
                                Ref.ObjectRef<InterfaceC52943zh2> objectRef5 = objectRef3;
                                m73800d = Z30.m73800d(zc02, null, null, new C11706a(m81380b, function22, null), 3, null);
                                objectRef5.element = m73800d;
                                return;
                            }
                            if (event == m67017a) {
                                InterfaceC52943zh2 interfaceC52943zh22 = objectRef3.element;
                                if (interfaceC52943zh22 != null) {
                                    InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh22, null, 1, null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                                InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = c37013Xc0;
                                Result.Companion companion = Result.Companion;
                                interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                            }
                        }
                    };
                    objectRef4.element = r10;
                    Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC11719f2.mo67008a((InterfaceC11728i) r10);
                    Object m76770q = c37013Xc0.m76770q();
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (m76770q == coroutine_suspended2) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (m76770q == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    interfaceC52943zh2 = (InterfaceC52943zh2) objectRef.element;
                    if (interfaceC52943zh2 != null) {
                        InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                    }
                    interfaceC11728i = (InterfaceC11728i) objectRef2.element;
                    if (interfaceC11728i != null) {
                        this.f54866o.mo67006d(interfaceC11728i);
                    }
                    throw th;
                }
            }
            InterfaceC52943zh2 interfaceC52943zh22 = (InterfaceC52943zh2) objectRef.element;
            if (interfaceC52943zh22 != null) {
                InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh22, null, 1, null);
            }
            InterfaceC11728i interfaceC11728i2 = (InterfaceC11728i) objectRef2.element;
            if (interfaceC11728i2 != null) {
                this.f54866o.mo67006d(interfaceC11728i2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11724b enumC11724b, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f54856j = abstractC11719f;
        this.f54857k = enumC11724b;
        this.f54858l = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f54856j, this.f54857k, this.f54858l, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f54855i = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f54854h;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.f54855i;
            AbstractC46765pG2 mo14156G = T41.m84376c().mo14156G();
            C117051 c117051 = new C117051(this.f54856j, this.f54857k, zc0, this.f54858l, null);
            this.f54854h = 1;
            if (X30.m77504g(mo14156G, c117051, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
