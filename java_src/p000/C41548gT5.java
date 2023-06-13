package p000;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"LgT5;", "T", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "LGu1;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function2;", "action", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: gT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41548gT5<T> implements InterfaceC33198Gu1<T> {

    /* renamed from: b */
    public final InterfaceC33198Gu1<T> f82269b;

    /* renamed from: c */
    public final Function2<InterfaceC33198Gu1<? super T>, Continuation<? super Unit>, Object> f82270c;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m28418f = "Share.kt", m28417i = {0, 0}, m28416l = {419, 423}, m28415m = "onSubscription", m28414n = {"this", "safeCollector"}, m28413s = {"L$0", "L$1"})
    /* renamed from: gT5$a */
    /* loaded from: classes8.dex */
    public static final class C20871a extends ContinuationImpl {

        /* renamed from: h */
        public Object f82271h;

        /* renamed from: i */
        public Object f82272i;

        /* renamed from: j */
        public /* synthetic */ Object f82273j;

        /* renamed from: k */
        public final /* synthetic */ C41548gT5<T> f82274k;

        /* renamed from: l */
        public int f82275l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20871a(C41548gT5<T> c41548gT5, Continuation<? super C20871a> continuation) {
            super(continuation);
            this.f82274k = c41548gT5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f82273j = obj;
            this.f82275l |= Integer.MIN_VALUE;
            return this.f82274k.m39364c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fh5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m39364c(Continuation<? super Unit> continuation) {
        C20871a c20871a;
        Object coroutine_suspended;
        ?? r2;
        C41088fh5 c41088fh5;
        C41548gT5<T> c41548gT5;
        try {
            if (continuation instanceof C20871a) {
                c20871a = (C20871a) continuation;
                int i = c20871a.f82275l;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20871a.f82275l = i - Integer.MIN_VALUE;
                    Object obj = c20871a.f82273j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = c20871a.f82275l;
                    if (r2 == 0) {
                        if (r2 != 1) {
                            if (r2 == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c41088fh5 = (C41088fh5) c20871a.f82272i;
                        c41548gT5 = (C41548gT5) c20871a.f82271h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        c41088fh5 = new C41088fh5(this.f82269b, c20871a.getContext());
                        Function2<InterfaceC33198Gu1<? super T>, Continuation<? super Unit>, Object> function2 = this.f82270c;
                        c20871a.f82271h = this;
                        c20871a.f82272i = c41088fh5;
                        c20871a.f82275l = 1;
                        if (function2.invoke(c41088fh5, c20871a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c41548gT5 = this;
                    }
                    c41088fh5.releaseIntercepted();
                    InterfaceC33198Gu1<T> interfaceC33198Gu1 = c41548gT5.f82269b;
                    r2 = interfaceC33198Gu1 instanceof C41548gT5;
                    if (r2 == 0) {
                        c20871a.f82271h = null;
                        c20871a.f82272i = null;
                        c20871a.f82275l = 2;
                        if (((C41548gT5) interfaceC33198Gu1).m39364c(c20871a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 == 0) {
            }
            c41088fh5.releaseIntercepted();
            InterfaceC33198Gu1<T> interfaceC33198Gu12 = c41548gT5.f82269b;
            r2 = interfaceC33198Gu12 instanceof C41548gT5;
            if (r2 == 0) {
            }
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        c20871a = new C20871a(this, continuation);
        Object obj2 = c20871a.f82273j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = c20871a.f82275l;
    }

    @Override // p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return this.f82269b.emit(t, continuation);
    }
}
