package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"", C17296a.f69688o, "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", "c", "MAX_POOL_SIZE", DateTokenConverter.CONVERTER_KEY, "IDLE_WORKER_KEEP_ALIVE_NS", "LDm5;", "e", "LDm5;", "schedulerTimeSource", "LkZ5;", "f", "LkZ5;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: EZ5 */
/* loaded from: classes8.dex */
public final class EZ5 {
    @JvmField

    /* renamed from: a */
    public static final long f7700a;
    @JvmField

    /* renamed from: b */
    public static final int f7701b;
    @JvmField

    /* renamed from: c */
    public static final int f7702c;
    @JvmField

    /* renamed from: d */
    public static final long f7703d;
    @JvmField

    /* renamed from: e */
    public static AbstractC32428Dm5 f7704e;
    @JvmField

    /* renamed from: f */
    public static final InterfaceC43974kZ5 f7705f;
    @JvmField

    /* renamed from: g */
    public static final InterfaceC43974kZ5 f7706g;

    static {
        long m28845e;
        int coerceAtLeast;
        int m28846d;
        int m28846d2;
        long m28845e2;
        m28845e = C43965kY5.m28845e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f7700a = m28845e;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(C42779iY5.m33826a(), 2);
        m28846d = C43965kY5.m28846d("kotlinx.coroutines.scheduler.core.pool.size", coerceAtLeast, 1, 0, 8, null);
        f7701b = m28846d;
        m28846d2 = C43965kY5.m28846d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f7702c = m28846d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m28845e2 = C43965kY5.m28845e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f7703d = timeUnit.toNanos(m28845e2);
        f7704e = C47520qY2.f105390a;
        f7705f = new C44567lZ5(0);
        f7706g = new C44567lZ5(1);
    }
}
