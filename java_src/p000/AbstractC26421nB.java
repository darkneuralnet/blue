package p000;

import java.util.Queue;
import p000.InterfaceC38016aY3;
/* renamed from: nB */
/* loaded from: classes5.dex */
public abstract class AbstractC26421nB<T extends InterfaceC38016aY3> {

    /* renamed from: a */
    public final Queue<T> f99561a = C47029pi6.m18920f(20);

    /* renamed from: a */
    public abstract T mo1679a();

    /* renamed from: b */
    public T m24227b() {
        T poll = this.f99561a.poll();
        if (poll == null) {
            return mo1679a();
        }
        return poll;
    }

    /* renamed from: c */
    public void m24226c(T t) {
        if (this.f99561a.size() < 20) {
            this.f99561a.offer(t);
        }
    }
}
