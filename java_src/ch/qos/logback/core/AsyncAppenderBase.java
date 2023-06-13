package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;
    static final int UNDEFINED = -1;
    BlockingQueue<E> blockingQueue;
    AppenderAttachableImpl<E> aai = new AppenderAttachableImpl<>();
    int queueSize = 256;
    int appenderCount = 0;
    int discardingThreshold = -1;
    boolean neverBlock = false;
    AsyncAppenderBase<E>.Worker worker = new Worker();
    int maxFlushTime = 1000;

    /* loaded from: classes.dex */
    public class Worker extends Thread {
        public Worker() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl<E> appenderAttachableImpl = asyncAppenderBase.aai;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.blockingQueue.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (E e : asyncAppenderBase.blockingQueue) {
                appenderAttachableImpl.appendLoopOnAppenders(e);
                asyncAppenderBase.blockingQueue.remove(e);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    private boolean isQueueBelowDiscardingThreshold() {
        return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
    }

    private void put(E e) {
        if (this.neverBlock) {
            this.blockingQueue.offer(e);
        } else {
            putUninterruptibly(e);
        }
    }

    private void putUninterruptibly(E e) {
        boolean z = false;
        while (true) {
            try {
                this.blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i = this.appenderCount;
        if (i != 0) {
            addWarn("One and only one appender may be attached to AsyncAppender.");
            addWarn("Ignoring additional appender named [" + appender.getName() + "]");
            return;
        }
        this.appenderCount = i + 1;
        addInfo("Attaching appender named [" + appender.getName() + "] to AsyncAppender.");
        this.aai.addAppender(appender);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e) {
        if (isQueueBelowDiscardingThreshold() && isDiscardable(e)) {
            return;
        }
        preprocess(e);
        put(e);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.aai.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.aai.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.aai.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.discardingThreshold;
    }

    public int getMaxFlushTime() {
        return this.maxFlushTime;
    }

    public int getNumberOfElementsInQueue() {
        return this.blockingQueue.size();
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getRemainingCapacity() {
        return this.blockingQueue.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.aai.isAttached(appender);
    }

    public boolean isDiscardable(E e) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.neverBlock;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.aai.iteratorForAppenders();
    }

    public void preprocess(E e) {
    }

    public void setDiscardingThreshold(int i) {
        this.discardingThreshold = i;
    }

    public void setMaxFlushTime(int i) {
        this.maxFlushTime = i;
    }

    public void setNeverBlock(boolean z) {
        this.neverBlock = z;
    }

    public void setQueueSize(int i) {
        this.queueSize = i;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.appenderCount == 0) {
            addError("No attached appenders found.");
        } else if (this.queueSize < 1) {
            addError("Invalid queue size [" + this.queueSize + "]");
        } else {
            this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
            if (this.discardingThreshold == -1) {
                this.discardingThreshold = this.queueSize / 5;
            }
            addInfo("Setting discardingThreshold to " + this.discardingThreshold);
            this.worker.setDaemon(true);
            AsyncAppenderBase<E>.Worker worker = this.worker;
            worker.setName("AsyncAppender-Worker-" + getName());
            super.start();
            this.worker.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.worker.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                try {
                    interruptUtil.maskInterruptFlag();
                    this.worker.join(this.maxFlushTime);
                    if (this.worker.isAlive()) {
                        addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. " + this.blockingQueue.size() + " queued events were possibly discarded.");
                    } else {
                        addInfo("Queue flush finished successfully within timeout.");
                    }
                } catch (InterruptedException e) {
                    int size = this.blockingQueue.size();
                    addError("Failed to join worker thread. " + size + " queued events may be discarded.", e);
                }
            } finally {
                interruptUtil.unmaskInterruptFlag();
            }
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.aai.detachAppender(str);
    }
}
