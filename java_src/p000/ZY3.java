package p000;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.InterfaceC32648El0;
/* renamed from: ZY3 */
/* loaded from: classes6.dex */
public class ZY3<T extends InterfaceC32648El0> implements InterfaceC2175F9<T> {

    /* renamed from: a */
    public final InterfaceC2175F9<T> f48750a;

    /* renamed from: b */
    public final C50303vE2<Integer, Set<? extends InterfaceC32414Dl0<T>>> f48751b = new C50303vE2<>(5);

    /* renamed from: c */
    public final ReadWriteLock f48752c = new ReentrantReadWriteLock();

    /* renamed from: ZY3$a */
    /* loaded from: classes6.dex */
    public class RunnableC10294a implements Runnable {

        /* renamed from: b */
        public final int f48753b;

        public RunnableC10294a(int i) {
            this.f48753b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            ZY3.this.m72956i(this.f48753b);
        }
    }

    public ZY3(InterfaceC2175F9<T> interfaceC2175F9) {
        this.f48750a = interfaceC2175F9;
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: b */
    public Collection<T> mo72963b() {
        return this.f48750a.mo72963b();
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: c */
    public void mo72962c(T t) {
        this.f48750a.mo72962c(t);
        m72957h();
    }

    @Override // p000.InterfaceC2175F9
    public void clearItems() {
        this.f48750a.clearItems();
        m72957h();
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: d */
    public void mo72961d(Collection<T> collection) {
        this.f48750a.mo72961d(collection);
        m72957h();
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: e */
    public void mo72960e(T t) {
        this.f48750a.mo72960e(t);
        m72957h();
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: f */
    public Set<? extends InterfaceC32414Dl0<T>> mo72959f(double d) {
        int i = (int) d;
        Set<? extends InterfaceC32414Dl0<T>> m72956i = m72956i(i);
        int i2 = i + 1;
        if (this.f48751b.m8993d(Integer.valueOf(i2)) == null) {
            new Thread(new RunnableC10294a(i2)).start();
        }
        int i3 = i - 1;
        if (this.f48751b.m8993d(Integer.valueOf(i3)) == null) {
            new Thread(new RunnableC10294a(i3)).start();
        }
        return m72956i;
    }

    @Override // p000.InterfaceC2175F9
    /* renamed from: g */
    public void mo72958g(T t) {
        this.f48750a.mo72958g(t);
        m72957h();
    }

    /* renamed from: h */
    public final void m72957h() {
        this.f48751b.m8994c();
    }

    /* renamed from: i */
    public final Set<? extends InterfaceC32414Dl0<T>> m72956i(int i) {
        this.f48752c.readLock().lock();
        Set<? extends InterfaceC32414Dl0<T>> m8993d = this.f48751b.m8993d(Integer.valueOf(i));
        this.f48752c.readLock().unlock();
        if (m8993d == null) {
            this.f48752c.writeLock().lock();
            m8993d = this.f48751b.m8993d(Integer.valueOf(i));
            if (m8993d == null) {
                m8993d = this.f48750a.mo72959f(i);
                this.f48751b.m8992e(Integer.valueOf(i), m8993d);
            }
            this.f48752c.writeLock().unlock();
        }
        return m8993d;
    }
}
