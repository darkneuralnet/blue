package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lbr5;", "", "LTq5;", "c", "segment", "", "b", "Ljava/util/concurrent/atomic/AtomicReference;", C17296a.f69688o, "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "LTq5;", "LOCK", DateTokenConverter.CONVERTER_KEY, "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: br5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38799br5 {

    /* renamed from: a */
    public static final C38799br5 f59635a = new C38799br5();

    /* renamed from: b */
    public static final int f59636b = 65536;

    /* renamed from: c */
    public static final C36208Tq5 f59637c = new C36208Tq5(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    public static final int f59638d;

    /* renamed from: e */
    public static final AtomicReference<C36208Tq5>[] f59639e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f59638d = highestOneBit;
        AtomicReference<C36208Tq5>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f59639e = atomicReferenceArr;
    }

    private C38799br5() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m62277b(C36208Tq5 segment) {
        boolean z;
        AtomicReference<C36208Tq5> m62278a;
        C36208Tq5 c36208Tq5;
        int i;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f36331f == null && segment.f36332g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (segment.f36329d || (c36208Tq5 = (m62278a = f59635a.m62278a()).get()) == f59637c) {
                return;
            }
            if (c36208Tq5 != null) {
                i = c36208Tq5.f36328c;
            } else {
                i = 0;
            }
            if (i >= f59636b) {
                return;
            }
            segment.f36331f = c36208Tq5;
            segment.f36327b = 0;
            segment.f36328c = i + 8192;
            if (!C42482i24.m35337a(m62278a, c36208Tq5, segment)) {
                segment.f36331f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @JvmStatic
    /* renamed from: c */
    public static final C36208Tq5 m62276c() {
        AtomicReference<C36208Tq5> m62278a = f59635a.m62278a();
        C36208Tq5 c36208Tq5 = f59637c;
        C36208Tq5 andSet = m62278a.getAndSet(c36208Tq5);
        if (andSet == c36208Tq5) {
            return new C36208Tq5();
        }
        if (andSet == null) {
            m62278a.set(null);
            return new C36208Tq5();
        }
        m62278a.set(andSet.f36331f);
        andSet.f36331f = null;
        andSet.f36328c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<C36208Tq5> m62278a() {
        return f59639e[(int) (Thread.currentThread().getId() & (f59638d - 1))];
    }
}
