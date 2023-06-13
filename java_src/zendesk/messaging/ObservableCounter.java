package zendesk.messaging;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes8.dex */
class ObservableCounter {
    private final AtomicInteger counter = new AtomicInteger();
    private final OnCountCompletedListener onCountCompletedListener;

    /* loaded from: classes8.dex */
    public interface OnCountCompletedListener {
    }

    public ObservableCounter(OnCountCompletedListener onCountCompletedListener) {
        this.onCountCompletedListener = onCountCompletedListener;
    }

    public void increment(int i) {
        this.counter.addAndGet(i);
    }
}
