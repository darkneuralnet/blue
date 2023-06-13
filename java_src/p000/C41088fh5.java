package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\n\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u001b\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m28432d2 = {"Lfh5;", "T", "LGu1;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "uCont", "f", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lj61;", "exception", "g", "h", "LGu1;", "collector", "i", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "", "j", "I", "collectContextSize", "k", "lastEmissionContext", "l", "Lkotlin/coroutines/Continuation;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LGu1;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: fh5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41088fh5<T> extends ContinuationImpl implements InterfaceC33198Gu1<T> {
    @JvmField

    /* renamed from: h */
    public final InterfaceC33198Gu1<T> f80459h;
    @JvmField

    /* renamed from: i */
    public final CoroutineContext f80460i;
    @JvmField

    /* renamed from: j */
    public final int f80461j;

    /* renamed from: k */
    public CoroutineContext f80462k;

    /* renamed from: l */
    public Continuation<? super Unit> f80463l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$Element;", "<anonymous parameter 1>", C17296a.f69688o, "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: fh5$a */
    /* loaded from: classes8.dex */
    public static final class C20492a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {

        /* renamed from: g */
        public static final C20492a f80464g = new C20492a();

        public C20492a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m41018a(int i, CoroutineContext.Element element) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return m41018a(num.intValue(), element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41088fh5(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, CoroutineContext coroutineContext) {
        super(C48470s83.f108374b, EmptyCoroutineContext.INSTANCE);
        this.f80459h = interfaceC33198Gu1;
        this.f80460i = coroutineContext;
        this.f80461j = ((Number) coroutineContext.fold(0, C20492a.f80464g)).intValue();
    }

    /* renamed from: e */
    public final void m41021e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof C43112j61) {
            m41019g((C43112j61) coroutineContext2, t);
        }
        C42274hh5.m36093a(this, coroutineContext);
    }

    @Override // p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        try {
            Object m41020f = m41020f(continuation, t);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m41020f == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m41020f == coroutine_suspended2) {
                return m41020f;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.f80462k = new C43112j61(th, continuation.getContext());
            throw th;
        }
    }

    /* renamed from: f */
    public final Object m41020f(Continuation<? super Unit> continuation, T t) {
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        C34018Kh2.m98499m(context);
        CoroutineContext coroutineContext = this.f80462k;
        if (coroutineContext != context) {
            m41021e(context, coroutineContext, t);
            this.f80462k = context;
        }
        this.f80463l = continuation;
        Object invoke = C41681gh5.m37894a().invoke(this.f80459h, t, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (!Intrinsics.areEqual(invoke, coroutine_suspended)) {
            this.f80463l = null;
        }
        return invoke;
    }

    /* renamed from: g */
    public final void m41019g(C43112j61 c43112j61, Object obj) {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c43112j61.f92149b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(trimIndent.toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.f80463l;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f80462k;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj);
        if (m116786exceptionOrNullimpl != null) {
            this.f80462k = new C43112j61(m116786exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.f80463l;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
