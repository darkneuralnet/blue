package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u00101\u001a\u00020.\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bB\u0010CJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00028\u0000H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00106\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001d\u00104\u0012\u0004\b5\u0010\u000fR\u0014\u00107\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u0010'\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010<\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, m28432d2 = {"LL41;", "T", "LO41;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "l", "()Z", "", "h", "()V", "n", "LXc0;", "i", "()LXc0;", "LWc0;", "continuation", "", "o", "(LWc0;)Ljava/lang/Throwable;", "cause", "m", "(Ljava/lang/Throwable;)Z", "", "g", "()Ljava/lang/Object;", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "resumeWith", "(Ljava/lang/Object;)V", "takenState", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "value", "j", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "LSC0;", "e", "LSC0;", "dispatcher", "f", "Lkotlin/coroutines/Continuation;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "b", "()Lkotlin/coroutines/Continuation;", "delegate", "k", "reusableCancellableContinuation", "<init>", "(LSC0;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: L41 */
/* loaded from: classes8.dex */
public final class L41<T> extends O41<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20669i = AtomicReferenceFieldUpdater.newUpdater(L41.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @JvmField

    /* renamed from: e */
    public final SC0 f20670e;
    @JvmField

    /* renamed from: f */
    public final Continuation<T> f20671f;
    @JvmField

    /* renamed from: g */
    public Object f20672g;
    @JvmField

    /* renamed from: h */
    public final Object f20673h;

    /* JADX WARN: Multi-variable type inference failed */
    public L41(SC0 sc0, Continuation<? super T> continuation) {
        super(-1);
        this.f20670e = sc0;
        this.f20671f = continuation;
        this.f20672g = M41.m95849a();
        this.f20673h = C50794w36.m7522b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // p000.O41
    /* renamed from: a */
    public void mo76785a(Object obj, Throwable th) {
        if (obj instanceof C48309rs0) {
            ((C48309rs0) obj).f107804b.invoke(th);
        }
    }

    @Override // p000.O41
    /* renamed from: b */
    public Continuation<T> mo76784b() {
        return this;
    }

    @Override // p000.O41
    /* renamed from: g */
    public Object mo76780g() {
        Object obj = this.f20672g;
        this.f20672g = M41.m95849a();
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f20671f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f20671f.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final void m97879h() {
        do {
        } while (this._reusableCancellableContinuation == M41.f22599b);
    }

    /* renamed from: i */
    public final C37013Xc0<T> m97878i() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = M41.f22599b;
                return null;
            } else if (obj instanceof C37013Xc0) {
                if (C22859i1.m35391a(f20669i, this, obj, M41.f22599b)) {
                    return (C37013Xc0) obj;
                }
            } else if (obj != M41.f22599b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: j */
    public final void m97877j(CoroutineContext coroutineContext, T t) {
        this.f20672g = t;
        this.f25606d = 1;
        this.f20670e.mo23366A(coroutineContext, this);
    }

    /* renamed from: k */
    public final C37013Xc0<?> m97876k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C37013Xc0) {
            return (C37013Xc0) obj;
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m97875l() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: m */
    public final boolean m97874m(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C49885uX5 c49885uX5 = M41.f22599b;
            if (Intrinsics.areEqual(obj, c49885uX5)) {
                if (C22859i1.m35391a(f20669i, this, c49885uX5, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C22859i1.m35391a(f20669i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: n */
    public final void m97873n() {
        m97879h();
        C37013Xc0<?> m97876k = m97876k();
        if (m97876k != null) {
            m97876k.m76774m();
        }
    }

    /* renamed from: o */
    public final Throwable m97872o(InterfaceC36779Wc0<?> interfaceC36779Wc0) {
        C49885uX5 c49885uX5;
        do {
            Object obj = this._reusableCancellableContinuation;
            c49885uX5 = M41.f22599b;
            if (obj != c49885uX5) {
                if (obj instanceof Throwable) {
                    if (C22859i1.m35391a(f20669i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C22859i1.m35391a(f20669i, this, c49885uX5, interfaceC36779Wc0));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f20671f.getContext();
        Object m11547d = C49494ts0.m11547d(obj, null, 1, null);
        if (this.f20670e.mo14157B(context)) {
            this.f20672g = m11547d;
            this.f25606d = 0;
            this.f20670e.mo14150y(context, this);
            return;
        }
        AbstractC34008Kg1 m5888b = C51387x36.f117057a.m5888b();
        if (m5888b.m98567a0()) {
            this.f20672g = m11547d;
            this.f25606d = 0;
            m5888b.m98570T(this);
            return;
        }
        m5888b.m98569W(true);
        try {
            CoroutineContext context2 = getContext();
            Object m7521c = C50794w36.m7521c(context2, this.f20673h);
            this.f20671f.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            C50794w36.m7523a(context2, m7521c);
            do {
            } while (m5888b.m98565f0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f20670e + ", " + C39783dV0.m44214c(this.f20671f) + ']';
    }
}
