package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* renamed from: Zg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37518Zg1 extends InputStream {

    /* renamed from: d */
    public static final Queue<C37518Zg1> f48937d = C47029pi6.m18920f(0);

    /* renamed from: b */
    public InputStream f48938b;

    /* renamed from: c */
    public IOException f48939c;

    /* renamed from: b */
    public static C37518Zg1 m72779b(InputStream inputStream) {
        C37518Zg1 poll;
        Queue<C37518Zg1> queue = f48937d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C37518Zg1();
        }
        poll.m72778c(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException m72780a() {
        return this.f48939c;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f48938b.available();
    }

    /* renamed from: c */
    public void m72778c(InputStream inputStream) {
        this.f48938b = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f48938b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f48938b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f48938b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f48938b.read();
        } catch (IOException e) {
            this.f48939c = e;
            throw e;
        }
    }

    public void release() {
        this.f48939c = null;
        this.f48938b = null;
        Queue<C37518Zg1> queue = f48937d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f48938b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f48938b.skip(j);
        } catch (IOException e) {
            this.f48939c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f48938b.read(bArr);
        } catch (IOException e) {
            this.f48939c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f48938b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f48939c = e;
            throw e;
        }
    }
}
