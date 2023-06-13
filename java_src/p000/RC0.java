package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0080\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"LZC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "addedContext", "e", "", "c", "originalContext", "appendContext", "isNewCoroutine", C17296a.f69688o, "Lkotlin/coroutines/Continuation;", "", "oldValue", "LEd6;", "g", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: RC0 */
/* loaded from: classes8.dex */
public final class RC0 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RC0$a */
    /* loaded from: classes8.dex */
    public static final class C7081a extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: g */
        public static final C7081a f31634g = new C7081a();

        public C7081a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (element instanceof NB0) {
                return coroutineContext.plus(((NB0) element).m94257p());
            }
            return coroutineContext.plus(element);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RC0$b */
    /* loaded from: classes8.dex */
    public static final class C7082b extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<CoroutineContext> f31635g;

        /* renamed from: h */
        public final /* synthetic */ boolean f31636h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7082b(Ref.ObjectRef<CoroutineContext> objectRef, boolean z) {
            super(2);
            this.f31635g = objectRef;
            this.f31636h = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (element instanceof NB0) {
                CoroutineContext.Element element2 = this.f31635g.element.get(element.getKey());
                if (element2 == null) {
                    NB0 nb0 = (NB0) element;
                    if (this.f31636h) {
                        nb0 = nb0.m94257p();
                    }
                    return coroutineContext.plus(nb0);
                }
                Ref.ObjectRef<CoroutineContext> objectRef = this.f31635g;
                objectRef.element = objectRef.element.minusKey(element.getKey());
                return coroutineContext.plus(((NB0) element).m94258i(element2));
            }
            return coroutineContext.plus(element);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/coroutines/CoroutineContext$Element;", "it", C17296a.f69688o, "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: RC0$c */
    /* loaded from: classes8.dex */
    public static final class C7083c extends Lambda implements Function2<Boolean, CoroutineContext.Element, Boolean> {

        /* renamed from: g */
        public static final C7083c f31637g = new C7083c();

        public C7083c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m87207a(boolean z, CoroutineContext.Element element) {
            return Boolean.valueOf(z || (element instanceof NB0));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
            return m87207a(bool.booleanValue(), element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    public static final CoroutineContext m87214a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean m87212c = m87212c(coroutineContext);
        boolean m87212c2 = m87212c(coroutineContext2);
        if (!m87212c && !m87212c2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new C7082b(objectRef, z));
        if (m87212c2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, C7081a.f31634g);
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    /* renamed from: b */
    public static final String m87213b(CoroutineContext coroutineContext) {
        return null;
    }

    /* renamed from: c */
    public static final boolean m87212c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, C7083c.f31637g)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m87211d(ZC0 zc0, CoroutineContext coroutineContext) {
        CoroutineContext m87214a = m87214a(zc0.mo18342K(), coroutineContext, true);
        if (m87214a != T41.m84378a() && m87214a.get(ContinuationInterceptor.Key) == null) {
            return m87214a.plus(T41.m84378a());
        }
        return m87214a;
    }

    /* renamed from: e */
    public static final CoroutineContext m87210e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!m87212c(coroutineContext2)) {
            return coroutineContext.plus(coroutineContext2);
        }
        return m87214a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: f */
    public static final C32582Ed6<?> m87209f(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof N41) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof C32582Ed6) {
                return (C32582Ed6) coroutineStackFrame;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C32582Ed6<?> m87208g(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        boolean z;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(C33050Gd6.f12186b) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C32582Ed6<?> m87209f = m87209f((CoroutineStackFrame) continuation);
        if (m87209f != null) {
            m87209f.m108634h1(coroutineContext, obj);
        }
        return m87209f;
    }
}
