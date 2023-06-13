package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"", "T", "LEu1;", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: hv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42410hv1 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: hv1$a */
    /* loaded from: classes8.dex */
    public static final class C22838a implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f86172b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: hv1$a$a */
        /* loaded from: classes8.dex */
        public static final class C22839a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f86173b;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m28418f = "Transform.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: hv1$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C22840a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f86174h;

                /* renamed from: i */
                public int f86175i;

                public C22840a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f86174h = obj;
                    this.f86175i |= Integer.MIN_VALUE;
                    return C22839a.this.emit(null, this);
                }
            }

            public C22839a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f86173b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                C22840a c22840a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C22840a) {
                    c22840a = (C22840a) continuation;
                    int i2 = c22840a.f86175i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c22840a.f86175i = i2 - Integer.MIN_VALUE;
                        Object obj = c22840a.f86174h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c22840a.f86175i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f86173b;
                            if (t != null) {
                                c22840a.f86175i = 1;
                                if (interfaceC33198Gu1.emit(t, c22840a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c22840a = new C22840a(continuation);
                Object obj2 = c22840a.f86174h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c22840a.f86175i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C22838a(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f86172b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f86172b.collect(new C22839a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: hv1$b */
    /* loaded from: classes8.dex */
    public static final class C22841b implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f86177b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f86178c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: hv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C22842a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f86179b;

            /* renamed from: c */
            public final /* synthetic */ Function2 f86180c;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m28418f = "Transform.kt", m28417i = {0, 0}, m28416l = {223, 224}, m28415m = "emit", m28414n = {"value", "$this$onEach_u24lambda_u2d7"}, m28413s = {"L$0", "L$1"})
            /* renamed from: hv1$b$a$a */
            /* loaded from: classes8.dex */
            public static final class C22843a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f86181h;

                /* renamed from: i */
                public int f86182i;

                /* renamed from: k */
                public Object f86184k;

                /* renamed from: l */
                public Object f86185l;

                public C22843a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f86181h = obj;
                    this.f86182i |= Integer.MIN_VALUE;
                    return C22842a.this.emit(null, this);
                }
            }

            public C22842a(InterfaceC33198Gu1 interfaceC33198Gu1, Function2 function2) {
                this.f86179b = interfaceC33198Gu1;
                this.f86180c = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                C22843a c22843a;
                Object coroutine_suspended;
                int i;
                Object obj;
                InterfaceC33198Gu1 interfaceC33198Gu1;
                if (continuation instanceof C22843a) {
                    c22843a = (C22843a) continuation;
                    int i2 = c22843a.f86182i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c22843a.f86182i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c22843a.f86181h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c22843a.f86182i;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC33198Gu1 = (InterfaceC33198Gu1) c22843a.f86185l;
                            obj = c22843a.f86184k;
                            ResultKt.throwOnFailure(obj2);
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu12 = this.f86179b;
                            Function2 function2 = this.f86180c;
                            c22843a.f86184k = t;
                            c22843a.f86185l = interfaceC33198Gu12;
                            c22843a.f86182i = 1;
                            InlineMarker.mark(6);
                            Object invoke = function2.invoke(t, c22843a);
                            InlineMarker.mark(7);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = t;
                            interfaceC33198Gu1 = interfaceC33198Gu12;
                        }
                        c22843a.f86184k = null;
                        c22843a.f86185l = null;
                        c22843a.f86182i = 2;
                        if (interfaceC33198Gu1.emit(obj, c22843a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c22843a = new C22843a(continuation);
                Object obj22 = c22843a.f86181h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c22843a.f86182i;
                if (i == 0) {
                }
                c22843a.f86184k = null;
                c22843a.f86185l = null;
                c22843a.f86182i = 2;
                if (interfaceC33198Gu1.emit(obj, c22843a) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }

        public C22841b(InterfaceC32730Eu1 interfaceC32730Eu1, Function2 function2) {
            this.f86177b = interfaceC32730Eu1;
            this.f86178c = function2;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f86177b.collect(new C22842a(interfaceC33198Gu1, this.f86178c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m35496a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1) {
        return new C22838a(interfaceC32730Eu1);
    }

    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m35495b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C22841b(interfaceC32730Eu1, function2);
    }
}
