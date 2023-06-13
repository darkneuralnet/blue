package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.LongCompanionObject;
@SinceKotlin(version = "1.3")
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@ExperimentalTime
/* loaded from: classes8.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m118274overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m118189toStringimpl(j)) + CoreConstants.DOT);
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m118275plusAssignLRDsOJo(long j) {
        long j2;
        long m118186toLongimpl = Duration.m118186toLongimpl(j, getUnit());
        if (m118186toLongimpl != Long.MIN_VALUE && m118186toLongimpl != LongCompanionObject.MAX_VALUE) {
            long j3 = this.reading;
            j2 = j3 + m118186toLongimpl;
            if ((m118186toLongimpl ^ j3) >= 0 && (j3 ^ j2) < 0) {
                m118274overflowLRDsOJo(j);
            }
        } else {
            double m118183toDoubleimpl = this.reading + Duration.m118183toDoubleimpl(j, getUnit());
            if (m118183toDoubleimpl > 9.223372036854776E18d || m118183toDoubleimpl < -9.223372036854776E18d) {
                m118274overflowLRDsOJo(j);
            }
            j2 = (long) m118183toDoubleimpl;
        }
        this.reading = j2;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }
}
