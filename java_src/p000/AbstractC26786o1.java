package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC27450q1;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070$8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006("}, m28432d2 = {"Lo1;", "Lq1;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "()Lq1;", "", "size", "", "i", "(I)[Lq1;", "g", "slot", "", "j", "(Lq1;)V", "<set-?>", "b", "[Lq1;", "l", "()[Lq1;", "getSlots$annotations", "()V", "slots", "c", "I", "k", "()I", "nCollectors", DateTokenConverter.CONVERTER_KEY, "nextIndex", "LrT5;", "e", "LrT5;", "_subscriptionCount", "LtP5;", "()LtP5;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: o1 */
/* loaded from: classes8.dex */
public abstract class AbstractC26786o1<S extends AbstractC27450q1<?>> {

    /* renamed from: b */
    public S[] f101216b;

    /* renamed from: c */
    public int f101217c;

    /* renamed from: d */
    public int f101218d;

    /* renamed from: e */
    public C48071rT5 f101219e;

    /* renamed from: e */
    public static final /* synthetic */ int m21991e(AbstractC26786o1 abstractC26786o1) {
        return abstractC26786o1.f101217c;
    }

    /* renamed from: f */
    public static final /* synthetic */ AbstractC27450q1[] m21990f(AbstractC26786o1 abstractC26786o1) {
        return abstractC26786o1.f101216b;
    }

    /* renamed from: d */
    public final InterfaceC49220tP5<Integer> m21992d() {
        C48071rT5 c48071rT5;
        synchronized (this) {
            c48071rT5 = this.f101219e;
            if (c48071rT5 == null) {
                c48071rT5 = new C48071rT5(this.f101217c);
                this.f101219e = c48071rT5;
            }
        }
        return c48071rT5;
    }

    /* renamed from: g */
    public final S m21989g() {
        S s;
        C48071rT5 c48071rT5;
        synchronized (this) {
            S[] sArr = this.f101216b;
            if (sArr == null) {
                sArr = mo10354i(2);
                this.f101216b = sArr;
            } else if (this.f101217c >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f101216b = (S[]) ((AbstractC27450q1[]) copyOf);
                sArr = (S[]) ((AbstractC27450q1[]) copyOf);
            }
            int i = this.f101218d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo10355h();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo6872a(this));
            this.f101218d = i;
            this.f101217c++;
            c48071rT5 = this.f101219e;
        }
        if (c48071rT5 != null) {
            c48071rT5.m15924Y(1);
        }
        return s;
    }

    /* renamed from: h */
    public abstract S mo10355h();

    /* renamed from: i */
    public abstract S[] mo10354i(int i);

    /* renamed from: j */
    public final void m21988j(S s) {
        C48071rT5 c48071rT5;
        int i;
        Continuation<Unit>[] mo6871b;
        synchronized (this) {
            int i2 = this.f101217c - 1;
            this.f101217c = i2;
            c48071rT5 = this.f101219e;
            if (i2 == 0) {
                this.f101218d = 0;
            }
            mo6871b = s.mo6871b(this);
        }
        for (Continuation<Unit> continuation : mo6871b) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
        if (c48071rT5 != null) {
            c48071rT5.m15924Y(-1);
        }
    }

    /* renamed from: k */
    public final int m21987k() {
        return this.f101217c;
    }

    /* renamed from: l */
    public final S[] m21986l() {
        return this.f101216b;
    }
}
