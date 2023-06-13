package p000;

import java.util.ArrayDeque;
import p000.InterfaceC45179mb5;
/* renamed from: wo */
/* loaded from: classes.dex */
public class C29962wo<T> implements InterfaceC45179mb5<T> {

    /* renamed from: a */
    public final int f116540a;

    /* renamed from: b */
    public final ArrayDeque<T> f116541b;

    /* renamed from: c */
    public final Object f116542c;

    /* renamed from: d */
    public final InterfaceC45179mb5.InterfaceC26138a<T> f116543d;

    public C29962wo(int i) {
        this(i, null);
    }

    @Override // p000.InterfaceC45179mb5
    /* renamed from: a */
    public T mo6312a() {
        T removeLast;
        synchronized (this.f116542c) {
            removeLast = this.f116541b.removeLast();
        }
        return removeLast;
    }

    /* renamed from: b */
    public void m6311b(T t) {
        T t2;
        synchronized (this.f116542c) {
            if (this.f116541b.size() >= this.f116540a) {
                t2 = mo6312a();
            } else {
                t2 = null;
            }
            this.f116541b.addFirst(t);
        }
        InterfaceC45179mb5.InterfaceC26138a<T> interfaceC26138a = this.f116543d;
        if (interfaceC26138a != null && t2 != null) {
            interfaceC26138a.mo8906a(t2);
        }
    }

    @Override // p000.InterfaceC45179mb5
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f116542c) {
            isEmpty = this.f116541b.isEmpty();
        }
        return isEmpty;
    }

    public C29962wo(int i, InterfaceC45179mb5.InterfaceC26138a<T> interfaceC26138a) {
        this.f116542c = new Object();
        this.f116540a = i;
        this.f116541b = new ArrayDeque<>(i);
        this.f116543d = interfaceC26138a;
    }
}
