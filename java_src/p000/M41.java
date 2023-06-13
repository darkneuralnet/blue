package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\"\u001a\u0010\u0015\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u0012\u0004\b\u0016\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "LL41;", "", DateTokenConverter.CONVERTER_KEY, "LuX5;", C17296a.f69688o, "LuX5;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: M41 */
/* loaded from: classes8.dex */
public final class M41 {

    /* renamed from: a */
    public static final C49885uX5 f22598a = new C49885uX5("UNDEFINED");
    @JvmField

    /* renamed from: b */
    public static final C49885uX5 f22599b = new C49885uX5("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ C49885uX5 m95849a() {
        return f22598a;
    }

    /* renamed from: b */
    public static final <T> void m95848b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, Unit> function1) {
        boolean z;
        C32582Ed6<?> c32582Ed6;
        if (continuation instanceof L41) {
            L41 l41 = (L41) continuation;
            Object m11548c = C49494ts0.m11548c(obj, function1);
            if (l41.f20670e.mo14157B(l41.getContext())) {
                l41.f20672g = m11548c;
                l41.f25606d = 1;
                l41.f20670e.mo14150y(l41.getContext(), l41);
                return;
            }
            AbstractC34008Kg1 m5888b = C51387x36.f117057a.m5888b();
            if (m5888b.m98567a0()) {
                l41.f20672g = m11548c;
                l41.f25606d = 1;
                m5888b.m98570T(l41);
                return;
            }
            m5888b.m98569W(true);
            try {
                InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) l41.getContext().get(InterfaceC52943zh2.f122077a0);
                if (interfaceC52943zh2 != null && !interfaceC52943zh2.mo555b()) {
                    CancellationException mo558F = interfaceC52943zh2.mo558F();
                    l41.mo76785a(m11548c, mo558F);
                    Result.Companion companion = Result.Companion;
                    l41.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(mo558F)));
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Continuation<T> continuation2 = l41.f20671f;
                    Object obj2 = l41.f20673h;
                    CoroutineContext context = continuation2.getContext();
                    Object m7521c = C50794w36.m7521c(context, obj2);
                    if (m7521c != C50794w36.f115218a) {
                        c32582Ed6 = RC0.m87208g(continuation2, context, m7521c);
                    } else {
                        c32582Ed6 = null;
                    }
                    l41.f20671f.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (c32582Ed6 == null || c32582Ed6.m108635g1()) {
                        C50794w36.m7523a(context, m7521c);
                    }
                }
                do {
                } while (m5888b.m98565f0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m95847c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m95848b(continuation, obj, function1);
    }

    /* renamed from: d */
    public static final boolean m95846d(L41<? super Unit> l41) {
        Unit unit = Unit.INSTANCE;
        AbstractC34008Kg1 m5888b = C51387x36.f117057a.m5888b();
        if (m5888b.m98566b0()) {
            return false;
        }
        if (m5888b.m98567a0()) {
            l41.f20672g = unit;
            l41.f25606d = 1;
            m5888b.m98570T(l41);
            return true;
        }
        m5888b.m98569W(true);
        try {
            l41.run();
            do {
            } while (m5888b.m98565f0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
