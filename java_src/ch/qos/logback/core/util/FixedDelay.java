package ch.qos.logback.core.util;
/* loaded from: classes.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FixedDelay(int i) {
        this(r0, r0);
        long j = i;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j;
    }

    public FixedDelay(long j, long j2) {
        this.nextDelay = j;
        this.subsequentDelay = j2;
    }
}
