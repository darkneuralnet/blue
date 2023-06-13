package p000;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"T", "LGu1;", "Lks4;", "channel", "", "b", "(LGu1;Lks4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "c", "(LGu1;Lks4;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: Xu1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C37176Xu1 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m28418f = "Channels.kt", m28417i = {0, 0, 0, 1, 1, 1}, m28416l = {51, 62}, m28415m = "emitAllImpl$FlowKt__ChannelsKt", m28414n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, m28413s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* renamed from: Xu1$a */
    /* loaded from: classes8.dex */
    public static final class C9545a<T> extends ContinuationImpl {

        /* renamed from: h */
        public Object f44194h;

        /* renamed from: i */
        public Object f44195i;

        /* renamed from: j */
        public boolean f44196j;

        /* renamed from: k */
        public /* synthetic */ Object f44197k;

        /* renamed from: l */
        public int f44198l;

        public C9545a(Continuation<? super C9545a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44197k = obj;
            this.f44198l |= Integer.MIN_VALUE;
            return C37176Xu1.m76118c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> Object m76119b(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, InterfaceC44162ks4<? extends T> interfaceC44162ks4, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m76118c = m76118c(interfaceC33198Gu1, interfaceC44162ks4, true, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m76118c == coroutine_suspended ? m76118c : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m76118c(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, InterfaceC44162ks4<? extends T> interfaceC44162ks4, boolean z, Continuation<? super Unit> continuation) {
        C9545a c9545a;
        Object coroutine_suspended;
        int i;
        Object obj;
        InterfaceC33198Gu1 interfaceC33198Gu12;
        boolean z2;
        try {
            if (continuation instanceof C9545a) {
                c9545a = (C9545a) continuation;
                int i2 = c9545a.f44198l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c9545a.f44198l = i2 - Integer.MIN_VALUE;
                    Object obj2 = c9545a.f44197k;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c9545a.f44198l;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                interfaceC33198Gu1 = (InterfaceC33198Gu1<? super T>) c9545a.f44196j;
                                interfaceC44162ks4 = (InterfaceC44162ks4) c9545a.f44195i;
                                InterfaceC33198Gu1<? super T> interfaceC33198Gu13 = (InterfaceC33198Gu1) c9545a.f44194h;
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1<? super T> interfaceC33198Gu14 = interfaceC33198Gu13;
                                InterfaceC33198Gu1<? super T> interfaceC33198Gu15 = interfaceC33198Gu14;
                                z2 = interfaceC33198Gu1;
                                interfaceC33198Gu1 = interfaceC33198Gu15;
                                try {
                                    c9545a.f44194h = interfaceC33198Gu1;
                                    c9545a.f44195i = interfaceC44162ks4;
                                    c9545a.f44196j = z2;
                                    c9545a.f44198l = 1;
                                    obj = interfaceC44162ks4.mo28253s(c9545a);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    InterfaceC33198Gu1<? super T> interfaceC33198Gu16 = z2;
                                    interfaceC33198Gu12 = interfaceC33198Gu1;
                                    interfaceC33198Gu1 = interfaceC33198Gu16;
                                    if (!C35420Qh0.m88181i(obj)) {
                                        Throwable m88185e = C35420Qh0.m88185e(obj);
                                        if (m88185e == null) {
                                            if (interfaceC33198Gu1 != null) {
                                                C35654Rh0.m86443a(interfaceC44162ks4, null);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        throw m88185e;
                                    }
                                    Object m88183g = C35420Qh0.m88183g(obj);
                                    c9545a.f44194h = interfaceC33198Gu12;
                                    c9545a.f44195i = interfaceC44162ks4;
                                    c9545a.f44196j = (boolean) interfaceC33198Gu1;
                                    c9545a.f44198l = 2;
                                    Object emit = interfaceC33198Gu12.emit(m88183g, c9545a);
                                    interfaceC33198Gu14 = interfaceC33198Gu12;
                                    if (emit == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    InterfaceC33198Gu1<? super T> interfaceC33198Gu152 = interfaceC33198Gu14;
                                    z2 = interfaceC33198Gu1;
                                    interfaceC33198Gu1 = interfaceC33198Gu152;
                                    c9545a.f44194h = interfaceC33198Gu1;
                                    c9545a.f44195i = interfaceC44162ks4;
                                    c9545a.f44196j = z2;
                                    c9545a.f44198l = 1;
                                    obj = interfaceC44162ks4.mo28253s(c9545a);
                                    if (obj == coroutine_suspended) {
                                    }
                                } catch (Throwable th) {
                                    InterfaceC33198Gu1<? super T> interfaceC33198Gu17 = z2;
                                    th = th;
                                    interfaceC33198Gu1 = interfaceC33198Gu17;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        if (interfaceC33198Gu1 != null) {
                                            C35654Rh0.m86443a(interfaceC44162ks4, th);
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC33198Gu1 = (InterfaceC33198Gu1<? super T>) c9545a.f44196j;
                            interfaceC44162ks4 = (InterfaceC44162ks4) c9545a.f44195i;
                            InterfaceC33198Gu1 interfaceC33198Gu18 = (InterfaceC33198Gu1) c9545a.f44194h;
                            ResultKt.throwOnFailure(obj2);
                            obj = ((C35420Qh0) obj2).m88178l();
                            interfaceC33198Gu12 = interfaceC33198Gu18;
                            if (!C35420Qh0.m88181i(obj)) {
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj2);
                        C36708Vu1.m79250u(interfaceC33198Gu1);
                        z2 = z;
                        c9545a.f44194h = interfaceC33198Gu1;
                        c9545a.f44195i = interfaceC44162ks4;
                        c9545a.f44196j = z2;
                        c9545a.f44198l = 1;
                        obj = interfaceC44162ks4.mo28253s(c9545a);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c9545a = new C9545a(continuation);
        Object obj22 = c9545a.f44197k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c9545a.f44198l;
    }
}
