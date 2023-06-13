package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Striped;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    /* loaded from: classes6.dex */
    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.array[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }

        private CompactStriped(int i, YU5<L> yu5) {
            super(i);
            int i2 = 0;
            EZ3.m108810e(i <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = yu5.get();
                i2++;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final YU5<L> supplier;

        public LargeLazyStriped(int i, YU5<L> yu5) {
            super(i);
            int i2;
            int i3 = this.mask;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.size = i2;
            this.supplier = yu5;
            this.locks = new C50950wK2().m6992m().m6996i();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                EZ3.m108803l(i, size());
            }
            L l = this.locks.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            return (L) KV2.m98828a(this.locks.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* loaded from: classes6.dex */
    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    /* loaded from: classes6.dex */
    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i) {
            super(i, false);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        public PowerOfTwoStriped(int i) {
            super();
            boolean z;
            int ceilToPowerOfTwo;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            EZ3.m108810e(z, "Stripes must be positive");
            if (i > 1073741824) {
                ceilToPowerOfTwo = -1;
            } else {
                ceilToPowerOfTwo = Striped.ceilToPowerOfTwo(i) - 1;
            }
            this.mask = ceilToPowerOfTwo;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    /* loaded from: classes6.dex */
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final YU5<L> supplier;

        /* loaded from: classes6.dex */
        public static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            public ArrayReference(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.index = i;
            }
        }

        public SmallLazyStriped(int i, YU5<L> yu5) {
            super(i);
            int i2;
            this.queue = new ReferenceQueue<>();
            int i3 = this.mask;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.size = i2;
            this.locks = new AtomicReferenceArray<>(i2);
            this.supplier = yu5;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> poll = this.queue.poll();
                if (poll != null) {
                    ArrayReference arrayReference = (ArrayReference) poll;
                    JS5.m100428a(this.locks, arrayReference.index, arrayReference, null);
                } else {
                    return;
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            L l;
            L l2;
            if (this.size != Integer.MAX_VALUE) {
                EZ3.m108803l(i, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i);
            if (arrayReference == null) {
                l = null;
            } else {
                l = arrayReference.get();
            }
            if (l != null) {
                return l;
            }
            L l3 = this.supplier.get();
            ArrayReference arrayReference2 = new ArrayReference(l3, i, this.queue);
            while (!JS5.m100428a(this.locks, i, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(i);
                if (arrayReference == null) {
                    l2 = null;
                    continue;
                } else {
                    l2 = arrayReference.get();
                    continue;
                }
                if (l2 != null) {
                    return l2;
                }
            }
            drainQueue();
            return l3;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i) {
        return 1 << C52589z52.m1837c(i, RoundingMode.CEILING);
    }

    public static <L> Striped<L> custom(int i, YU5<L> yu5) {
        return new CompactStriped(i, yu5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i) {
        return new Semaphore(i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$semaphore$1(int i) {
        return new PaddedSemaphore(i);
    }

    private static <L> Striped<L> lazy(int i, YU5<L> yu5) {
        if (i < 1024) {
            return new SmallLazyStriped(i, yu5);
        }
        return new LargeLazyStriped(i, yu5);
    }

    public static Striped<Lock> lazyWeakLock(int i) {
        return lazy(i, new YU5() { // from class: IS5
            @Override // p000.YU5
            public final Object get() {
                Lock lambda$lazyWeakLock$0;
                lambda$lazyWeakLock$0 = Striped.lambda$lazyWeakLock$0();
                return lambda$lazyWeakLock$0;
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return lazy(i, new YU5() { // from class: com.google.common.util.concurrent.f
            @Override // p000.YU5
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return lazy(i, new YU5() { // from class: GS5
            @Override // p000.YU5
            public final Object get() {
                Semaphore lambda$lazyWeakSemaphore$2;
                lambda$lazyWeakSemaphore$2 = Striped.lambda$lazyWeakSemaphore$2(i2);
                return lambda$lazyWeakSemaphore$2;
            }
        });
    }

    public static Striped<Lock> lock(int i) {
        return custom(i, new YU5() { // from class: com.google.common.util.concurrent.g
            @Override // p000.YU5
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
        return custom(i, new YU5() { // from class: HS5
            @Override // p000.YU5
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i, final int i2) {
        return custom(i, new YU5() { // from class: FS5
            @Override // p000.YU5
            public final Object get() {
                Semaphore lambda$semaphore$1;
                lambda$semaphore$1 = Striped.lambda$semaphore$1(i2);
                return lambda$semaphore$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList m93254h = C34819Ns2.m93254h(iterable);
        if (m93254h.isEmpty()) {
            return VY1.m79781E();
        }
        int[] iArr = new int[m93254h.size()];
        for (int i = 0; i < m93254h.size(); i++) {
            iArr[i] = indexFor(m93254h.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        m93254h.set(0, getAt(i2));
        for (int i3 = 1; i3 < m93254h.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                m93254h.set(i3, m93254h.get(i3 - 1));
            } else {
                m93254h.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(m93254h);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i);

    public abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }
}
