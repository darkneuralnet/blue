package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
@Metadata(m28433d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001al\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001as\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"T", "LEu1;", "Lkotlin/Function2;", "LGu1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "e", "(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", DateTokenConverter.CONVERTER_KEY, "(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;", "b", "c", "(LGu1;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: bv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C38835bv1 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m28418f = "Emitters.kt", m28417i = {0}, m28416l = {216}, m28415m = "invokeSafely$FlowKt__EmittersKt", m28414n = {"cause"}, m28413s = {"L$0"})
    /* renamed from: bv1$a */
    /* loaded from: classes8.dex */
    public static final class C13326a<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f59756h;

        /* renamed from: i */
        public /* synthetic */ Object f59757i;

        /* renamed from: j */
        public int f59758j;

        public C13326a(Continuation<? super C13326a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59757i = obj;
            this.f59758j |= Integer.MIN_VALUE;
            return C38835bv1.m62158c(null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"bv1$b", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bv1$b */
    /* loaded from: classes8.dex */
    public static final class C13327b implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f59759b;

        /* renamed from: c */
        public final /* synthetic */ Function3 f59760c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m28418f = "Emitters.kt", m28417i = {0, 0, 1, 2}, m28416l = {114, 121, 128}, m28415m = "collect", m28414n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, m28413s = {"L$0", "L$1", "L$0", "L$0"})
        /* renamed from: bv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C13328a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f59761h;

            /* renamed from: i */
            public int f59762i;

            /* renamed from: k */
            public Object f59764k;

            /* renamed from: l */
            public Object f59765l;

            public C13328a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f59761h = obj;
                this.f59762i |= Integer.MIN_VALUE;
                return C13327b.this.collect(null, this);
            }
        }

        public C13327b(InterfaceC32730Eu1 interfaceC32730Eu1, Function3 function3) {
            this.f59759b = interfaceC32730Eu1;
            this.f59760c = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // p000.InterfaceC32730Eu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            C13328a c13328a;
            Object coroutine_suspended;
            int i;
            C13327b c13327b;
            U36 u36;
            Function3 function3;
            InterfaceC33198Gu1 interfaceC33198Gu12;
            C41088fh5 c41088fh5;
            Throwable th;
            C41088fh5 c41088fh52;
            Object invoke;
            try {
                if (continuation instanceof C13328a) {
                    c13328a = (C13328a) continuation;
                    int i2 = c13328a.f59762i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c13328a.f59762i = i2 - Integer.MIN_VALUE;
                        Object obj = c13328a.f59761h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c13328a.f59762i;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        c41088fh52 = (C41088fh5) c13328a.f59764k;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            c41088fh52.releaseIntercepted();
                                            return Unit.INSTANCE;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c41088fh52.releaseIntercepted();
                                            throw th;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th3 = (Throwable) c13328a.f59764k;
                                ResultKt.throwOnFailure(obj);
                                throw th3;
                            }
                            InterfaceC33198Gu1 interfaceC33198Gu13 = (InterfaceC33198Gu1) c13328a.f59765l;
                            c13327b = (C13327b) c13328a.f59764k;
                            try {
                                ResultKt.throwOnFailure(obj);
                                interfaceC33198Gu12 = interfaceC33198Gu13;
                            } catch (Throwable th4) {
                                th = th4;
                                u36 = new U36(th);
                                function3 = c13327b.f59760c;
                                c13328a.f59764k = th;
                                c13328a.f59765l = null;
                                c13328a.f59762i = 2;
                                if (C38835bv1.m62158c(u36, function3, th, c13328a) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th;
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            try {
                                InterfaceC32730Eu1 interfaceC32730Eu1 = this.f59759b;
                                c13328a.f59764k = this;
                                c13328a.f59765l = interfaceC33198Gu1;
                                c13328a.f59762i = 1;
                                if (interfaceC32730Eu1.collect(interfaceC33198Gu1, c13328a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c13327b = this;
                                interfaceC33198Gu12 = interfaceC33198Gu1;
                            } catch (Throwable th5) {
                                th = th5;
                                c13327b = this;
                                u36 = new U36(th);
                                function3 = c13327b.f59760c;
                                c13328a.f59764k = th;
                                c13328a.f59765l = null;
                                c13328a.f59762i = 2;
                                if (C38835bv1.m62158c(u36, function3, th, c13328a) != coroutine_suspended) {
                                }
                            }
                        }
                        c41088fh5 = new C41088fh5(interfaceC33198Gu12, c13328a.getContext());
                        Function3 function32 = c13327b.f59760c;
                        c13328a.f59764k = c41088fh5;
                        c13328a.f59765l = null;
                        c13328a.f59762i = 3;
                        InlineMarker.mark(6);
                        invoke = function32.invoke(c41088fh5, null, c13328a);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c41088fh52 = c41088fh5;
                        c41088fh52.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                }
                Function3 function322 = c13327b.f59760c;
                c13328a.f59764k = c41088fh5;
                c13328a.f59765l = null;
                c13328a.f59762i = 3;
                InlineMarker.mark(6);
                invoke = function322.invoke(c41088fh5, null, c13328a);
                InlineMarker.mark(7);
                if (invoke != coroutine_suspended) {
                }
            } catch (Throwable th6) {
                th = th6;
                c41088fh52 = c41088fh5;
                c41088fh52.releaseIntercepted();
                throw th;
            }
            c13328a = new C13328a(continuation);
            Object obj2 = c13328a.f59761h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c13328a.f59762i;
            if (i == 0) {
            }
            c41088fh5 = new C41088fh5(interfaceC33198Gu12, c13328a.getContext());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"bv1$c", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bv1$c */
    /* loaded from: classes8.dex */
    public static final class C13329c implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ Function2 f59766b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC32730Eu1 f59767c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m28418f = "Emitters.kt", m28417i = {0, 0, 0}, m28416l = {116, 120}, m28415m = "collect", m28414n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, m28413s = {"L$0", "L$1", "L$2"})
        /* renamed from: bv1$c$a */
        /* loaded from: classes8.dex */
        public static final class C13330a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f59768h;

            /* renamed from: i */
            public int f59769i;

            /* renamed from: k */
            public Object f59771k;

            /* renamed from: l */
            public Object f59772l;

            /* renamed from: m */
            public Object f59773m;

            public C13330a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f59768h = obj;
                this.f59769i |= Integer.MIN_VALUE;
                return C13329c.this.collect(null, this);
            }
        }

        public C13329c(Function2 function2, InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f59766b = function2;
            this.f59767c = interfaceC32730Eu1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // p000.InterfaceC32730Eu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            C13330a c13330a;
            Object coroutine_suspended;
            int i;
            Throwable th;
            C41088fh5 c41088fh5;
            C13329c c13329c;
            InterfaceC33198Gu1 interfaceC33198Gu12;
            InterfaceC32730Eu1 interfaceC32730Eu1;
            if (continuation instanceof C13330a) {
                c13330a = (C13330a) continuation;
                int i2 = c13330a.f59769i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c13330a.f59769i = i2 - Integer.MIN_VALUE;
                    Object obj = c13330a.f59768h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c13330a.f59769i;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c41088fh5 = (C41088fh5) c13330a.f59773m;
                        interfaceC33198Gu12 = (InterfaceC33198Gu1) c13330a.f59772l;
                        c13329c = (C13329c) c13330a.f59771k;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            c41088fh5.releaseIntercepted();
                            throw th;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C41088fh5 c41088fh52 = new C41088fh5(interfaceC33198Gu1, c13330a.getContext());
                        try {
                            Function2 function2 = this.f59766b;
                            c13330a.f59771k = this;
                            c13330a.f59772l = interfaceC33198Gu1;
                            c13330a.f59773m = c41088fh52;
                            c13330a.f59769i = 1;
                            InlineMarker.mark(6);
                            Object invoke = function2.invoke(c41088fh52, c13330a);
                            InlineMarker.mark(7);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c13329c = this;
                            interfaceC33198Gu12 = interfaceC33198Gu1;
                            c41088fh5 = c41088fh52;
                        } catch (Throwable th3) {
                            th = th3;
                            c41088fh5 = c41088fh52;
                            c41088fh5.releaseIntercepted();
                            throw th;
                        }
                    }
                    c41088fh5.releaseIntercepted();
                    interfaceC32730Eu1 = c13329c.f59767c;
                    c13330a.f59771k = null;
                    c13330a.f59772l = null;
                    c13330a.f59773m = null;
                    c13330a.f59769i = 2;
                    if (interfaceC32730Eu1.collect(interfaceC33198Gu12, c13330a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            c13330a = new C13330a(continuation);
            Object obj2 = c13330a.f59768h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c13330a.f59769i;
            if (i == 0) {
            }
            c41088fh5.releaseIntercepted();
            interfaceC32730Eu1 = c13329c.f59767c;
            c13330a.f59771k = null;
            c13330a.f59772l = null;
            c13330a.f59773m = null;
            c13330a.f59769i = 2;
            if (interfaceC32730Eu1.collect(interfaceC33198Gu12, c13330a) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public static final void m62159b(InterfaceC33198Gu1<?> interfaceC33198Gu1) {
        if (interfaceC33198Gu1 instanceof U36) {
            throw ((U36) interfaceC33198Gu1).f36773b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m62158c(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Function3<? super InterfaceC33198Gu1<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3, Throwable th, Continuation<? super Unit> continuation) {
        C13326a c13326a;
        Object coroutine_suspended;
        int i;
        try {
            if (continuation instanceof C13326a) {
                c13326a = (C13326a) continuation;
                int i2 = c13326a.f59758j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c13326a.f59758j = i2 - Integer.MIN_VALUE;
                    Object obj = c13326a.f59757i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c13326a.f59758j;
                    if (i == 0) {
                        if (i == 1) {
                            th = (Throwable) c13326a.f59756h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        c13326a.f59756h = th;
                        c13326a.f59758j = 1;
                        if (function3.invoke(interfaceC33198Gu1, th, c13326a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i == 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th2, th);
            }
            throw th2;
        }
        c13326a = new C13326a(continuation);
        Object obj2 = c13326a.f59757i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c13326a.f59758j;
    }

    /* renamed from: d */
    public static final <T> InterfaceC32730Eu1<T> m62157d(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function3<? super InterfaceC33198Gu1<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C13327b(interfaceC32730Eu1, function3);
    }

    /* renamed from: e */
    public static final <T> InterfaceC32730Eu1<T> m62156e(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super InterfaceC33198Gu1<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C13329c(function2, interfaceC32730Eu1);
    }
}
