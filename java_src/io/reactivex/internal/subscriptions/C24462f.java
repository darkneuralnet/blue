package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.subscriptions.f */
/* loaded from: classes8.dex */
public class C24462f extends AtomicInteger implements InterfaceC46292oT5 {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: b */
    public InterfaceC46292oT5 f91053b;

    /* renamed from: c */
    public long f91054c;

    /* renamed from: d */
    public final AtomicReference<InterfaceC46292oT5> f91055d = new AtomicReference<>();

    /* renamed from: e */
    public final AtomicLong f91056e = new AtomicLong();

    /* renamed from: f */
    public final AtomicLong f91057f = new AtomicLong();

    /* renamed from: g */
    public final boolean f91058g;

    /* renamed from: h */
    public volatile boolean f91059h;

    /* renamed from: i */
    public boolean f91060i;

    public C24462f(boolean z) {
        this.f91058g = z;
    }

    /* renamed from: b */
    final void m32299b() {
        if (getAndIncrement() != 0) {
            return;
        }
        m32298c();
    }

    /* renamed from: c */
    final void m32298c() {
        int i = 1;
        long j = 0;
        InterfaceC46292oT5 interfaceC46292oT5 = null;
        do {
            InterfaceC46292oT5 interfaceC46292oT52 = this.f91055d.get();
            if (interfaceC46292oT52 != null) {
                interfaceC46292oT52 = this.f91055d.getAndSet(null);
            }
            long j2 = this.f91056e.get();
            if (j2 != 0) {
                j2 = this.f91056e.getAndSet(0L);
            }
            long j3 = this.f91057f.get();
            if (j3 != 0) {
                j3 = this.f91057f.getAndSet(0L);
            }
            InterfaceC46292oT5 interfaceC46292oT53 = this.f91053b;
            if (this.f91059h) {
                if (interfaceC46292oT53 != null) {
                    interfaceC46292oT53.cancel();
                    this.f91053b = null;
                }
                if (interfaceC46292oT52 != null) {
                    interfaceC46292oT52.cancel();
                }
            } else {
                long j4 = this.f91054c;
                if (j4 != LongCompanionObject.MAX_VALUE) {
                    j4 = C24468d.m32272c(j4, j2);
                    if (j4 != LongCompanionObject.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            EnumC24463g.m32291d(j4);
                            j4 = 0;
                        }
                    }
                    this.f91054c = j4;
                }
                if (interfaceC46292oT52 != null) {
                    if (interfaceC46292oT53 != null && this.f91058g) {
                        interfaceC46292oT53.cancel();
                    }
                    this.f91053b = interfaceC46292oT52;
                    if (j4 != 0) {
                        j = C24468d.m32272c(j, j4);
                        interfaceC46292oT5 = interfaceC46292oT52;
                    }
                } else if (interfaceC46292oT53 != null && j2 != 0) {
                    j = C24468d.m32272c(j, j2);
                    interfaceC46292oT5 = interfaceC46292oT53;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            interfaceC46292oT5.mo21023o(j);
        }
    }

    public void cancel() {
        if (!this.f91059h) {
            this.f91059h = true;
            m32299b();
        }
    }

    /* renamed from: d */
    public final boolean m32297d() {
        return this.f91059h;
    }

    /* renamed from: e */
    public final void m32296e(long j) {
        if (this.f91060i) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.f91054c;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    EnumC24463g.m32291d(j3);
                    j3 = 0;
                }
                this.f91054c = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            m32298c();
            return;
        }
        C24468d.m32274a(this.f91057f, j);
        m32299b();
    }

    /* renamed from: f */
    public final void m32295f(InterfaceC46292oT5 interfaceC46292oT5) {
        if (this.f91059h) {
            interfaceC46292oT5.cancel();
            return;
        }
        C23544b.m32923e(interfaceC46292oT5, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC46292oT5 interfaceC46292oT52 = this.f91053b;
            if (interfaceC46292oT52 != null && this.f91058g) {
                interfaceC46292oT52.cancel();
            }
            this.f91053b = interfaceC46292oT5;
            long j = this.f91054c;
            if (decrementAndGet() != 0) {
                m32298c();
            }
            if (j != 0) {
                interfaceC46292oT5.mo21023o(j);
                return;
            }
            return;
        }
        InterfaceC46292oT5 andSet = this.f91055d.getAndSet(interfaceC46292oT5);
        if (andSet != null && this.f91058g) {
            andSet.cancel();
        }
        m32299b();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public final void mo21023o(long j) {
        if (!EnumC24463g.m32287h(j) || this.f91060i) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.f91054c;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                long m32272c = C24468d.m32272c(j2, j);
                this.f91054c = m32272c;
                if (m32272c == LongCompanionObject.MAX_VALUE) {
                    this.f91060i = true;
                }
            }
            InterfaceC46292oT5 interfaceC46292oT5 = this.f91053b;
            if (decrementAndGet() != 0) {
                m32298c();
            }
            if (interfaceC46292oT5 != null) {
                interfaceC46292oT5.mo21023o(j);
                return;
            }
            return;
        }
        C24468d.m32274a(this.f91056e, j);
        m32299b();
    }
}
