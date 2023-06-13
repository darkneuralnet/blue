package p000;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lu0;", "T", "LEu1;", "", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: u0 */
/* loaded from: classes8.dex */
public abstract class AbstractC28977u0<T> implements InterfaceC32730Eu1<T> {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.AbstractFlow", m28418f = "Flow.kt", m28417i = {0}, m28416l = {230}, m28415m = "collect", m28414n = {"safeCollector"}, m28413s = {"L$0"})
    /* renamed from: u0$a */
    /* loaded from: classes8.dex */
    public static final class C28978a extends ContinuationImpl {

        /* renamed from: h */
        public Object f111454h;

        /* renamed from: i */
        public /* synthetic */ Object f111455i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC28977u0<T> f111456j;

        /* renamed from: k */
        public int f111457k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28978a(AbstractC28977u0<T> abstractC28977u0, Continuation<? super C28978a> continuation) {
            super(continuation);
            this.f111456j = abstractC28977u0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111455i = obj;
            this.f111457k |= Integer.MIN_VALUE;
            return this.f111456j.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // p000.InterfaceC32730Eu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        C28978a c28978a;
        Object coroutine_suspended;
        int i;
        Throwable th;
        C41088fh5 c41088fh5;
        if (continuation instanceof C28978a) {
            c28978a = (C28978a) continuation;
            int i2 = c28978a.f111457k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28978a.f111457k = i2 - Integer.MIN_VALUE;
                Object obj = c28978a.f111455i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c28978a.f111457k;
                if (i == 0) {
                    if (i == 1) {
                        c41088fh5 = (C41088fh5) c28978a.f111454h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            c41088fh5.releaseIntercepted();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC33198Gu1<? super T> c41088fh52 = new C41088fh5<>(interfaceC33198Gu1, c28978a.getContext());
                    try {
                        c28978a.f111454h = c41088fh52;
                        c28978a.f111457k = 1;
                        if (mo11112e(c41088fh52, c28978a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c41088fh5 = c41088fh52;
                    } catch (Throwable th3) {
                        th = th3;
                        c41088fh5 = c41088fh52;
                        c41088fh5.releaseIntercepted();
                        throw th;
                    }
                }
                c41088fh5.releaseIntercepted();
                return Unit.INSTANCE;
            }
        }
        c28978a = new C28978a(this, continuation);
        Object obj2 = c28978a.f111455i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c28978a.f111457k;
        if (i == 0) {
        }
        c41088fh5.releaseIntercepted();
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public abstract Object mo11112e(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation);
}
