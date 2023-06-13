package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, m28432d2 = {"LSC0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B", "", "parallelism", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "A", "T", "Lkotlin/coroutines/Continuation;", "continuation", "interceptContinuation", "releaseInterceptedContinuation", "", "toString", "<init>", "()V", "b", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: SC0 */
/* loaded from: classes8.dex */
public abstract class SC0 extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b */
    public static final C7352a f33309b = new C7352a(null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"LSC0$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "LSC0;", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    @ExperimentalStdlibApi
    /* renamed from: SC0$a */
    /* loaded from: classes8.dex */
    public static final class C7352a extends AbstractCoroutineContextKey<ContinuationInterceptor, SC0> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "LSC0;", C17296a.f69688o, "(Lkotlin/coroutines/CoroutineContext$Element;)LSC0;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: SC0$a$a */
        /* loaded from: classes8.dex */
        public static final class C7353a extends Lambda implements Function1<CoroutineContext.Element, SC0> {

            /* renamed from: g */
            public static final C7353a f33310g = new C7353a();

            public C7353a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final SC0 invoke(CoroutineContext.Element element) {
                if (element instanceof SC0) {
                    return (SC0) element;
                }
                return null;
            }
        }

        public /* synthetic */ C7352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7352a() {
            super(ContinuationInterceptor.Key, C7353a.f33310g);
        }
    }

    public SC0() {
        super(ContinuationInterceptor.Key);
    }

    /* renamed from: A */
    public void mo23366A(CoroutineContext coroutineContext, Runnable runnable) {
        mo14150y(coroutineContext, runnable);
    }

    /* renamed from: B */
    public boolean mo14157B(CoroutineContext coroutineContext) {
        return true;
    }

    /* renamed from: C */
    public SC0 m85853C(int i) {
        C39407cr2.m44969a(i);
        return new RunnableC38796br2(this, i);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new L41(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((L41) continuation).m97873n();
    }

    public String toString() {
        return C39783dV0.m44216a(this) + '@' + C39783dV0.m44215b(this);
    }

    /* renamed from: y */
    public abstract void mo14150y(CoroutineContext coroutineContext, Runnable runnable);
}
