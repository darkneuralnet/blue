package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, m28432d2 = {"LKg1;", "LSC0;", "", "c0", "", "f0", "h0", "LO41;", "task", "", "T", "unconfined", "W", "G", "shutdown", "S", "c", "J", "useCount", DateTokenConverter.CONVERTER_KEY, "Z", "shared", "Lvo;", "e", "Lvo;", "unconfinedQueue", "V", "()J", "nextTime", "a0", "()Z", "isUnconfinedLoopActive", "b0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Kg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC34008Kg1 extends SC0 {

    /* renamed from: c */
    public long f20013c;

    /* renamed from: d */
    public boolean f20014d;

    /* renamed from: e */
    public C29642vo<O41<?>> f20015e;

    /* renamed from: L */
    public static /* synthetic */ void m98572L(AbstractC34008Kg1 abstractC34008Kg1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC34008Kg1.m98573G(z);
    }

    /* renamed from: X */
    public static /* synthetic */ void m98568X(AbstractC34008Kg1 abstractC34008Kg1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC34008Kg1.m98569W(z);
    }

    /* renamed from: G */
    public final void m98573G(boolean z) {
        long m98571S = this.f20013c - m98571S(z);
        this.f20013c = m98571S;
        if (m98571S <= 0 && this.f20014d) {
            shutdown();
        }
    }

    /* renamed from: S */
    public final long m98571S(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: T */
    public final void m98570T(O41<?> o41) {
        C29642vo<O41<?>> c29642vo = this.f20015e;
        if (c29642vo == null) {
            c29642vo = new C29642vo<>();
            this.f20015e = c29642vo;
        }
        c29642vo.m8024a(o41);
    }

    /* renamed from: V */
    public long mo96507V() {
        C29642vo<O41<?>> c29642vo = this.f20015e;
        if (c29642vo == null || c29642vo.m8022c()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: W */
    public final void m98569W(boolean z) {
        this.f20013c += m98571S(z);
        if (!z) {
            this.f20014d = true;
        }
    }

    /* renamed from: a0 */
    public final boolean m98567a0() {
        return this.f20013c >= m98571S(true);
    }

    /* renamed from: b0 */
    public final boolean m98566b0() {
        C29642vo<O41<?>> c29642vo = this.f20015e;
        if (c29642vo != null) {
            return c29642vo.m8022c();
        }
        return true;
    }

    /* renamed from: c0 */
    public long mo96505c0() {
        if (m98565f0()) {
            return 0L;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: f0 */
    public final boolean m98565f0() {
        O41<?> m8021d;
        C29642vo<O41<?>> c29642vo = this.f20015e;
        if (c29642vo == null || (m8021d = c29642vo.m8021d()) == null) {
            return false;
        }
        m8021d.run();
        return true;
    }

    /* renamed from: h0 */
    public boolean m98564h0() {
        return false;
    }

    public void shutdown() {
    }
}
