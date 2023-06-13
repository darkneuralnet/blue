package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m28432d2 = {"T", "LO41;", "", "mode", "", C17296a.f69688o, "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", DateTokenConverter.CONVERTER_KEY, "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: P41 */
/* loaded from: classes8.dex */
public final class P41 {
    /* renamed from: a */
    public static final <T> void m91025a(O41<? super T> o41, int i) {
        boolean z;
        Continuation<? super T> mo76784b = o41.mo76784b();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (mo76784b instanceof L41) && m91024b(i) == m91024b(o41.f25606d)) {
            SC0 sc0 = ((L41) mo76784b).f20670e;
            CoroutineContext context = mo76784b.getContext();
            if (sc0.mo14157B(context)) {
                sc0.mo14150y(context, o41);
                return;
            } else {
                m91021e(o41);
                return;
            }
        }
        m91022d(o41, mo76784b, z);
    }

    /* renamed from: b */
    public static final boolean m91024b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m91023c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m91022d(O41<? super T> o41, Continuation<? super T> continuation, boolean z) {
        Object mo76781e;
        C32582Ed6<?> c32582Ed6;
        boolean m108635g1;
        Object mo76780g = o41.mo76780g();
        Throwable mo76782d = o41.mo76782d(mo76780g);
        if (mo76782d != null) {
            Result.Companion companion = Result.Companion;
            mo76781e = ResultKt.createFailure(mo76782d);
        } else {
            Result.Companion companion2 = Result.Companion;
            mo76781e = o41.mo76781e(mo76780g);
        }
        Object m116783constructorimpl = Result.m116783constructorimpl(mo76781e);
        if (z) {
            L41 l41 = (L41) continuation;
            Continuation<T> continuation2 = l41.f20671f;
            Object obj = l41.f20673h;
            CoroutineContext context = continuation2.getContext();
            Object m7521c = C50794w36.m7521c(context, obj);
            if (m7521c != C50794w36.f115218a) {
                c32582Ed6 = RC0.m87208g(continuation2, context, m7521c);
            } else {
                c32582Ed6 = null;
            }
            try {
                l41.f20671f.resumeWith(m116783constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (c32582Ed6 != null) {
                    if (!m108635g1) {
                        return;
                    }
                }
                return;
            } finally {
                if (c32582Ed6 == null || c32582Ed6.m108635g1()) {
                    C50794w36.m7523a(context, m7521c);
                }
            }
        }
        continuation.resumeWith(m116783constructorimpl);
    }

    /* renamed from: e */
    public static final void m91021e(O41<?> o41) {
        AbstractC34008Kg1 m5888b = C51387x36.f117057a.m5888b();
        if (m5888b.m98567a0()) {
            m5888b.m98570T(o41);
            return;
        }
        m5888b.m98569W(true);
        try {
            m91022d(o41, o41.mo76784b(), true);
            do {
            } while (m5888b.m98565f0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
