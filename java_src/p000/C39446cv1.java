package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u00020\u0014*\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"T", "LEu1;", "Lkotlin/Function3;", "LGu1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", C17296a.f69688o, "(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;", "collector", "b", "(LEu1;LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", LegacyRepairType.OTHER_KEY, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: cv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C39446cv1 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"cv1$a", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: cv1$a */
    /* loaded from: classes8.dex */
    public static final class C19639a implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f75833b;

        /* renamed from: c */
        public final /* synthetic */ Function3 f75834c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m28418f = "Errors.kt", m28417i = {0, 0}, m28416l = {113, 114}, m28415m = "collect", m28414n = {"this", "$this$catch_u24lambda_u2d0"}, m28413s = {"L$0", "L$1"})
        /* renamed from: cv1$a$a */
        /* loaded from: classes8.dex */
        public static final class C19640a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f75835h;

            /* renamed from: i */
            public int f75836i;

            /* renamed from: k */
            public Object f75838k;

            /* renamed from: l */
            public Object f75839l;

            public C19640a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f75835h = obj;
                this.f75836i |= Integer.MIN_VALUE;
                return C19639a.this.collect(null, this);
            }
        }

        public C19639a(InterfaceC32730Eu1 interfaceC32730Eu1, Function3 function3) {
            this.f75833b = interfaceC32730Eu1;
            this.f75834c = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        @Override // p000.InterfaceC32730Eu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            C19640a c19640a;
            Object coroutine_suspended;
            int i;
            C19639a c19639a;
            InterfaceC33198Gu1 interfaceC33198Gu12;
            Throwable th;
            if (continuation instanceof C19640a) {
                c19640a = (C19640a) continuation;
                int i2 = c19640a.f75836i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c19640a.f75836i = i2 - Integer.MIN_VALUE;
                    Object obj = c19640a.f75835h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c19640a.f75836i;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c19639a = (C19639a) c19640a.f75838k;
                        ResultKt.throwOnFailure(obj);
                        interfaceC33198Gu12 = (InterfaceC33198Gu1) c19640a.f75839l;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC32730Eu1 interfaceC32730Eu1 = this.f75833b;
                        c19640a.f75838k = this;
                        c19640a.f75839l = interfaceC33198Gu1;
                        c19640a.f75836i = 1;
                        obj = C36708Vu1.m79264g(interfaceC32730Eu1, interfaceC33198Gu1, c19640a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c19639a = this;
                        interfaceC33198Gu12 = interfaceC33198Gu1;
                    }
                    th = (Throwable) obj;
                    if (th != null) {
                        Function3 function3 = c19639a.f75834c;
                        c19640a.f75838k = null;
                        c19640a.f75839l = null;
                        c19640a.f75836i = 2;
                        InlineMarker.mark(6);
                        Object invoke = function3.invoke(interfaceC33198Gu12, th, c19640a);
                        InlineMarker.mark(7);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c19640a = new C19640a(continuation);
            Object obj2 = c19640a.f75835h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c19640a.f75836i;
            if (i == 0) {
            }
            th = (Throwable) obj2;
            if (th != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m28418f = "Errors.kt", m28417i = {0}, m28416l = {156}, m28415m = "catchImpl", m28414n = {"fromDownstream"}, m28413s = {"L$0"})
    /* renamed from: cv1$b */
    /* loaded from: classes8.dex */
    public static final class C19641b<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f75840h;

        /* renamed from: i */
        public /* synthetic */ Object f75841i;

        /* renamed from: j */
        public int f75842j;

        public C19641b(Continuation<? super C19641b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75841i = obj;
            this.f75842j |= Integer.MIN_VALUE;
            return C36708Vu1.m79264g(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: cv1$c */
    /* loaded from: classes8.dex */
    public static final class C19642c<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC33198Gu1<T> f75843b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f75844c;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m28418f = "Errors.kt", m28417i = {0}, m28416l = {158}, m28415m = "emit", m28414n = {"this"}, m28413s = {"L$0"})
        /* renamed from: cv1$c$a */
        /* loaded from: classes8.dex */
        public static final class C19643a extends ContinuationImpl {

            /* renamed from: h */
            public Object f75845h;

            /* renamed from: i */
            public /* synthetic */ Object f75846i;

            /* renamed from: j */
            public final /* synthetic */ C19642c<T> f75847j;

            /* renamed from: k */
            public int f75848k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19643a(C19642c<? super T> c19642c, Continuation<? super C19643a> continuation) {
                super(continuation);
                this.f75847j = c19642c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f75846i = obj;
                this.f75848k |= Integer.MIN_VALUE;
                return this.f75847j.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C19642c(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Ref.ObjectRef<Throwable> objectRef) {
            this.f75843b = interfaceC33198Gu1;
            this.f75844c = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C19643a c19643a;
            Object coroutine_suspended;
            int i;
            C19642c<T> c19642c;
            if (continuation instanceof C19643a) {
                c19643a = (C19643a) continuation;
                int i2 = c19643a.f75848k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c19643a.f75848k = i2 - Integer.MIN_VALUE;
                    Object obj = c19643a.f75846i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c19643a.f75848k;
                    if (i == 0) {
                        if (i == 1) {
                            c19642c = (C19642c) c19643a.f75845h;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Throwable t2) {
                                t2 = th;
                                c19642c.f75844c.element = t2;
                                throw ((Throwable) t2);
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        try {
                            InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f75843b;
                            c19643a.f75845h = this;
                            c19643a.f75848k = 1;
                            if (interfaceC33198Gu1.emit(t, c19643a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable t22) {
                            t22 = th;
                            c19642c = this;
                            c19642c.f75844c.element = t22;
                            throw ((Throwable) t22);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c19643a = new C19643a(this, continuation);
            Object obj2 = c19643a.f75846i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c19643a.f75848k;
            if (i == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m44823a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function3<? super InterfaceC33198Gu1<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C19639a(interfaceC32730Eu1, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m44822b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Throwable> continuation) {
        C19641b c19641b;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        Throwable th;
        if (continuation instanceof C19641b) {
            c19641b = (C19641b) continuation;
            int i2 = c19641b.f75842j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c19641b.f75842j = i2 - Integer.MIN_VALUE;
                Object obj = c19641b.f75841i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c19641b.f75842j;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = (Ref.ObjectRef) c19641b.f75840h;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        InterfaceC33198Gu1<? super Object> c19642c = new C19642c<>(interfaceC33198Gu1, objectRef2);
                        c19641b.f75840h = objectRef2;
                        c19641b.f75842j = 1;
                        if (interfaceC32730Eu1.collect(c19642c, c19641b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = objectRef2;
                    }
                }
                th = (Throwable) objectRef.element;
                if (m44820d(th, th) && !m44821c(th, c19641b.getContext())) {
                    if (th == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th);
                        throw th;
                    }
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th);
                    throw th;
                }
                throw th;
            }
        }
        c19641b = new C19641b(continuation);
        Object obj2 = c19641b.f75841i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c19641b.f75842j;
        if (i == 0) {
        }
        th = (Throwable) objectRef.element;
        if (m44820d(th, th)) {
        }
        throw th;
    }

    /* renamed from: c */
    public static final boolean m44821c(Throwable th, CoroutineContext coroutineContext) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null && interfaceC52943zh2.isCancelled()) {
            return m44820d(th, interfaceC52943zh2.mo558F());
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m44820d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }
}
