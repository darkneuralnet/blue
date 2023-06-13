package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aq\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u000327\u0010\u000b\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u001at\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\u000b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ac\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\" \u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087T¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m28432d2 = {"T", "R", "LEu1;", "", "concurrency", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "transform", C17296a.f69688o, "(LEu1;ILkotlin/jvm/functions/Function2;)LEu1;", "c", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function3;", "LGu1;", "", "Lkotlin/ExtensionFunctionType;", "f", "(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;", "e", "(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: ev1 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C40631ev1 {

    /* renamed from: a */
    public static final int f79115a = C42779iY5.m33825b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: ev1$a */
    /* loaded from: classes8.dex */
    public static final class C20139a implements InterfaceC32730Eu1<InterfaceC32730Eu1<? extends R>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f79116b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f79117c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: ev1$a$a */
        /* loaded from: classes8.dex */
        public static final class C20140a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f79118b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f79119c;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m28418f = "Merge.kt", m28417i = {}, m28416l = {223, 223}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: ev1$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C20141a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f79120h;

                /* renamed from: i */
                public int f79121i;

                /* renamed from: j */
                public Object f79122j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20141a(Continuation continuation) {
                    super(continuation);
                    C20140a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f79120h = obj;
                    this.f79121i |= Integer.MIN_VALUE;
                    return C20140a.this.emit(null, this);
                }
            }

            public C20140a(InterfaceC33198Gu1 interfaceC33198Gu1, Function2 function2) {
                this.f79118b = interfaceC33198Gu1;
                this.f79119c = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20141a c20141a;
                Object obj2;
                Object coroutine_suspended;
                int i;
                InterfaceC33198Gu1 interfaceC33198Gu1;
                if (continuation instanceof C20141a) {
                    c20141a = (C20141a) continuation;
                    int i2 = c20141a.f79121i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c20141a.f79121i = i2 - Integer.MIN_VALUE;
                        obj2 = c20141a.f79120h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c20141a.f79121i;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC33198Gu1 = (InterfaceC33198Gu1) c20141a.f79122j;
                            ResultKt.throwOnFailure(obj2);
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu12 = this.f79118b;
                            Function2 function2 = this.f79119c;
                            c20141a.f79122j = interfaceC33198Gu12;
                            c20141a.f79121i = 1;
                            Object invoke = function2.invoke(obj, c20141a);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj2 = invoke;
                            interfaceC33198Gu1 = interfaceC33198Gu12;
                        }
                        c20141a.f79122j = null;
                        c20141a.f79121i = 2;
                        if (interfaceC33198Gu1.emit(obj2, c20141a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c20141a = new C20141a(continuation);
                obj2 = c20141a.f79120h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20141a.f79121i;
                if (i == 0) {
                }
                c20141a.f79122j = null;
                c20141a.f79121i = 2;
                if (interfaceC33198Gu1.emit(obj2, c20141a) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }

        public C20139a(InterfaceC32730Eu1 interfaceC32730Eu1, Function2 function2) {
            this.f79116b = interfaceC32730Eu1;
            this.f79117c = function2;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f79116b.collect(new C20140a(interfaceC33198Gu1, this.f79117c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"ev1$b", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: ev1$b */
    /* loaded from: classes8.dex */
    public static final class C20142b implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f79124b;

        public C20142b(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f79124b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f79124b.collect(new C20143c(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "LEu1;", "value", "", "c", "(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: ev1$c */
    /* loaded from: classes8.dex */
    public static final class C20143c<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC33198Gu1<T> f79125b;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m28418f = "Merge.kt", m28417i = {}, m28416l = {80}, m28415m = "emit", m28414n = {}, m28413s = {})
        /* renamed from: ev1$c$a */
        /* loaded from: classes8.dex */
        public static final class C20144a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f79126h;

            /* renamed from: i */
            public final /* synthetic */ C20143c<T> f79127i;

            /* renamed from: j */
            public int f79128j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20144a(C20143c<? super T> c20143c, Continuation<? super C20144a> continuation) {
                super(continuation);
                this.f79127i = c20143c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f79126h = obj;
                this.f79128j |= Integer.MIN_VALUE;
                return this.f79127i.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C20143c(InterfaceC33198Gu1<? super T> interfaceC33198Gu1) {
            this.f79125b = interfaceC33198Gu1;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // p000.InterfaceC33198Gu1
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super Unit> continuation) {
            C20144a c20144a;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C20144a) {
                c20144a = (C20144a) continuation;
                int i2 = c20144a.f79128j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c20144a.f79128j = i2 - Integer.MIN_VALUE;
                    Object obj = c20144a.f79126h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c20144a.f79128j;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f79125b;
                        c20144a.f79128j = 1;
                        if (C36708Vu1.m79252s(interfaceC33198Gu1, interfaceC32730Eu1, c20144a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c20144a = new C20144a(this, continuation);
            Object obj2 = c20144a.f79126h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c20144a.f79128j;
            if (i == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m28418f = "Merge.kt", m28417i = {}, m28416l = {214, 214}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ev1$d */
    /* loaded from: classes8.dex */
    public static final class C20145d extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79129h;

        /* renamed from: i */
        public /* synthetic */ Object f79130i;

        /* renamed from: j */
        public /* synthetic */ Object f79131j;

        /* renamed from: k */
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> f79132k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20145d(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C20145d> continuation) {
            super(3, continuation);
            this.f79132k = function2;
        }

        public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, T t, Continuation<? super Unit> continuation) {
            C20145d c20145d = new C20145d(this.f79132k, continuation);
            c20145d.f79130i = interfaceC33198Gu1;
            c20145d.f79131j = t;
            return c20145d.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC33198Gu1 interfaceC33198Gu1;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79129h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f79130i;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f79130i;
                Object obj2 = this.f79131j;
                Function2<T, Continuation<? super R>, Object> function2 = this.f79132k;
                this.f79130i = interfaceC33198Gu1;
                this.f79129h = 1;
                obj = function2.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f79130i = null;
            this.f79129h = 2;
            if (interfaceC33198Gu1.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke((InterfaceC33198Gu1) obj, (InterfaceC33198Gu1) obj2, continuation);
        }
    }

    /* renamed from: a */
    public static final <T, R> InterfaceC32730Eu1<R> m42391a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, int i, Function2<? super T, ? super Continuation<? super InterfaceC32730Eu1<? extends R>>, ? extends Object> function2) {
        return C36708Vu1.m79284D(new C20139a(interfaceC32730Eu1, function2), i);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC32730Eu1 m42390b(InterfaceC32730Eu1 interfaceC32730Eu1, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f79115a;
        }
        return C36708Vu1.m79287A(interfaceC32730Eu1, i, function2);
    }

    /* renamed from: c */
    public static final <T> InterfaceC32730Eu1<T> m42389c(InterfaceC32730Eu1<? extends InterfaceC32730Eu1<? extends T>> interfaceC32730Eu1) {
        return new C20142b(interfaceC32730Eu1);
    }

    /* renamed from: d */
    public static final <T> InterfaceC32730Eu1<T> m42388d(InterfaceC32730Eu1<? extends InterfaceC32730Eu1<? extends T>> interfaceC32730Eu1, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 1) {
                return C36708Vu1.m79285C(interfaceC32730Eu1);
            }
            return new C34016Kh0(interfaceC32730Eu1, i, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    /* renamed from: e */
    public static final <T, R> InterfaceC32730Eu1<R> m42387e(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, @BuilderInference Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return C36708Vu1.m79271Q(interfaceC32730Eu1, new C20145d(function2, null));
    }

    /* renamed from: f */
    public static final <T, R> InterfaceC32730Eu1<R> m42386f(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, @BuilderInference Function3<? super InterfaceC33198Gu1<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C34718Nh0(function3, interfaceC32730Eu1, null, 0, null, 28, null);
    }
}
