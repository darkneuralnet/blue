package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;
/* loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* renamed from: cb */
    CyclicBuffer<E> f61065cb;
    int maxSize = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            this.f61065cb.add(e);
        }
    }

    public E get(int i) {
        if (isStarted()) {
            return this.f61065cb.get(i);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f61065cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.f61065cb.clear();
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f61065cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f61065cb = null;
        super.stop();
    }
}
