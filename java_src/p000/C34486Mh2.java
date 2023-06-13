package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.sequences.Sequence;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u001a\n\u0010\u000f\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0007*\u00020\n\u001a\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0013\u001a\u001c\u0010\u0015\u001a\u00020\u0007*\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lzh2;", "parent", "Lms0;", C17296a.f69688o, "Lo51;", "handle", "j", "", "g", "(Lzh2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", DateTokenConverter.CONVERTER_KEY, "k", "l", "", "message", "", "c", "h", "", "n", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "m", "(Lkotlin/coroutines/CoroutineContext;)Lzh2;", "job", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/JobKt")
/* renamed from: Mh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C34486Mh2 {
    /* renamed from: a */
    public static final InterfaceC45344ms0 m95046a(InterfaceC52943zh2 interfaceC52943zh2) {
        return new C31912Bh2(interfaceC52943zh2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC45344ms0 m95045b(InterfaceC52943zh2 interfaceC52943zh2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC52943zh2 = null;
        }
        return C34018Kh2.m98511a(interfaceC52943zh2);
    }

    /* renamed from: c */
    public static final void m95044c(InterfaceC52943zh2 interfaceC52943zh2, String str, Throwable th) {
        interfaceC52943zh2.mo552f(C42270hh1.m36097a(str, th));
    }

    /* renamed from: d */
    public static final void m95043d(CoroutineContext coroutineContext, CancellationException cancellationException) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null) {
            interfaceC52943zh2.mo552f(cancellationException);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m95042e(InterfaceC52943zh2 interfaceC52943zh2, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        C34018Kh2.m98509c(interfaceC52943zh2, str, th);
    }

    /* renamed from: f */
    public static /* synthetic */ void m95041f(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C34018Kh2.m98508d(coroutineContext, cancellationException);
    }

    /* renamed from: g */
    public static final Object m95040g(InterfaceC52943zh2 interfaceC52943zh2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        Object mo557P = interfaceC52943zh2.mo557P(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (mo557P == coroutine_suspended) {
            return mo557P;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final void m95039h(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence<InterfaceC52943zh2> mo553d;
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null && (mo553d = interfaceC52943zh2.mo553d()) != null) {
            for (InterfaceC52943zh2 interfaceC52943zh22 : mo553d) {
                interfaceC52943zh22.mo552f(cancellationException);
            }
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m95038i(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C34018Kh2.m98504h(coroutineContext, cancellationException);
    }

    /* renamed from: j */
    public static final InterfaceC46067o51 m95037j(InterfaceC52943zh2 interfaceC52943zh2, InterfaceC46067o51 interfaceC46067o51) {
        return interfaceC52943zh2.mo551n(new C49031t51(interfaceC46067o51));
    }

    /* renamed from: k */
    public static final void m95036k(InterfaceC52943zh2 interfaceC52943zh2) {
        if (!interfaceC52943zh2.mo555b()) {
            throw interfaceC52943zh2.mo558F();
        }
    }

    /* renamed from: l */
    public static final void m95035l(CoroutineContext coroutineContext) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null) {
            C34018Kh2.m98500l(interfaceC52943zh2);
        }
    }

    /* renamed from: m */
    public static final InterfaceC52943zh2 m95034m(CoroutineContext coroutineContext) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        if (interfaceC52943zh2 != null) {
            return interfaceC52943zh2;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* renamed from: n */
    public static final boolean m95033n(CoroutineContext coroutineContext) {
        InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) coroutineContext.get(InterfaceC52943zh2.f122077a0);
        return interfaceC52943zh2 != null && interfaceC52943zh2.mo555b();
    }
}
