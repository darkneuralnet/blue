package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24578y;
import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: Yi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37302Yi1<T> implements Comparable<C37302Yi1> {

    /* renamed from: e */
    public static final AtomicLong f46313e = new AtomicLong(0);

    /* renamed from: b */
    public final long f46314b = f46313e.getAndIncrement();

    /* renamed from: c */
    public final InterfaceC37295Yh3<T> f46315c;

    /* renamed from: d */
    public final InterfaceC24578y<T> f46316d;

    /* renamed from: Yi1$a */
    /* loaded from: classes6.dex */
    public class RunnableC9920a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C41047fd4 f46317b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC23437E f46318c;

        /* renamed from: Yi1$a$a */
        /* loaded from: classes6.dex */
        public class C9921a implements InterfaceC23436D<T> {
            public C9921a() {
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C37302Yi1.this.f46316d.onComplete();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C37302Yi1.this.f46316d.mo11914c(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(T t) {
                C37302Yi1.this.f46316d.onNext(t);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                C37302Yi1.this.f46316d.mo11915b(interfaceC23465c);
            }
        }

        public RunnableC9920a(C41047fd4 c41047fd4, AbstractC23437E abstractC23437E) {
            this.f46317b = c41047fd4;
            this.f46318c = abstractC23437E;
        }

        @Override // java.lang.Runnable
        public void run() {
            C37302Yi1.this.f46315c.mo64260y0(this.f46317b).unsubscribeOn(this.f46318c).subscribe(new C9921a());
        }
    }

    public C37302Yi1(InterfaceC37295Yh3<T> interfaceC37295Yh3, InterfaceC24578y<T> interfaceC24578y) {
        this.f46315c = interfaceC37295Yh3;
        this.f46316d = interfaceC24578y;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C37302Yi1 c37302Yi1) {
        int i;
        int compareTo = this.f46315c.compareTo(c37302Yi1.f46315c);
        if (compareTo == 0 && c37302Yi1.f46315c != this.f46315c) {
            if (this.f46314b < c37302Yi1.f46314b) {
                i = -1;
            } else {
                i = 1;
            }
            return i;
        }
        return compareTo;
    }

    /* renamed from: b */
    public void m74435b(C41047fd4 c41047fd4, AbstractC23437E abstractC23437E) {
        if (this.f46316d.mo1769e()) {
            C35098Ox2.m91158r(this.f46315c);
            c41047fd4.release();
            return;
        }
        abstractC23437E.mo32324d(new RunnableC9920a(c41047fd4, abstractC23437E));
    }
}
