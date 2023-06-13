package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 %2\u00020\u0001:\u0001\u001bJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0013\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0014H&JE\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0014H'R\u0014\u0010\u001d\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m28432d2 = {"Lzh2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "F", "", "start", "cause", "", "f", "LLi0;", "child", "LJi0;", "Q", "P", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lo51;", "n", "onCancelling", "invokeImmediately", "D", "b", "()Z", "isActive", "c", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/sequences/Sequence;", "children", "a0", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: zh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC52943zh2 extends CoroutineContext.Element {

    /* renamed from: a0 */
    public static final C31479b f122077a0 = C31479b.f122078b;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: zh2$a */
    /* loaded from: classes8.dex */
    public static final class C31478a {
        /* renamed from: a */
        public static /* synthetic */ void m550a(InterfaceC52943zh2 interfaceC52943zh2, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC52943zh2.mo552f(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m549b(InterfaceC52943zh2 interfaceC52943zh2, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(interfaceC52943zh2, r, function2);
        }

        /* renamed from: c */
        public static <E extends CoroutineContext.Element> E m548c(InterfaceC52943zh2 interfaceC52943zh2, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(interfaceC52943zh2, key);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC46067o51 m547d(InterfaceC52943zh2 interfaceC52943zh2, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return interfaceC52943zh2.mo559D(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static CoroutineContext m546e(InterfaceC52943zh2 interfaceC52943zh2, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(interfaceC52943zh2, key);
        }

        /* renamed from: f */
        public static CoroutineContext m545f(InterfaceC52943zh2 interfaceC52943zh2, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(interfaceC52943zh2, coroutineContext);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lzh2$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lzh2;", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: zh2$b */
    /* loaded from: classes8.dex */
    public static final class C31479b implements CoroutineContext.Key<InterfaceC52943zh2> {

        /* renamed from: b */
        public static final /* synthetic */ C31479b f122078b = new C31479b();

        private C31479b() {
        }
    }

    /* renamed from: D */
    InterfaceC46067o51 mo559D(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    /* renamed from: F */
    CancellationException mo558F();

    /* renamed from: P */
    Object mo557P(Continuation<? super Unit> continuation);

    /* renamed from: Q */
    InterfaceC33791Ji0 mo556Q(InterfaceC34259Li0 interfaceC34259Li0);

    /* renamed from: b */
    boolean mo555b();

    /* renamed from: c */
    boolean mo554c();

    /* renamed from: d */
    Sequence<InterfaceC52943zh2> mo553d();

    /* renamed from: f */
    void mo552f(CancellationException cancellationException);

    boolean isCancelled();

    /* renamed from: n */
    InterfaceC46067o51 mo551n(Function1<? super Throwable, Unit> function1);

    boolean start();
}
