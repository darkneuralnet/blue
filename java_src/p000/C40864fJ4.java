package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: fJ4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40864fJ4 {

    /* renamed from: a */
    public final AtomicInteger f79860a;

    /* renamed from: b */
    public final Set<AbstractC45006mI4<?>> f79861b;

    /* renamed from: c */
    public final PriorityBlockingQueue<AbstractC45006mI4<?>> f79862c;

    /* renamed from: d */
    public final PriorityBlockingQueue<AbstractC45006mI4<?>> f79863d;

    /* renamed from: e */
    public final Y70 f79864e;

    /* renamed from: f */
    public final InterfaceC49646u73 f79865f;

    /* renamed from: g */
    public final IM4 f79866g;

    /* renamed from: h */
    public final C73[] f79867h;

    /* renamed from: i */
    public C39574d80 f79868i;

    /* renamed from: j */
    public final List<InterfaceC20355b> f79869j;

    /* renamed from: k */
    public final List<InterfaceC20354a> f79870k;

    /* renamed from: fJ4$a */
    /* loaded from: classes.dex */
    public interface InterfaceC20354a {
        /* renamed from: a */
        void m41563a(AbstractC45006mI4<?> abstractC45006mI4, int i);
    }

    @Deprecated
    /* renamed from: fJ4$b */
    /* loaded from: classes.dex */
    public interface InterfaceC20355b<T> {
        /* renamed from: a */
        void m41562a(AbstractC45006mI4<T> abstractC45006mI4);
    }

    public C40864fJ4(Y70 y70, InterfaceC49646u73 interfaceC49646u73, int i, IM4 im4) {
        this.f79860a = new AtomicInteger();
        this.f79861b = new HashSet();
        this.f79862c = new PriorityBlockingQueue<>();
        this.f79863d = new PriorityBlockingQueue<>();
        this.f79869j = new ArrayList();
        this.f79870k = new ArrayList();
        this.f79864e = y70;
        this.f79865f = interfaceC49646u73;
        this.f79867h = new C73[i];
        this.f79866g = im4;
    }

    /* renamed from: a */
    public <T> AbstractC45006mI4<T> m41571a(AbstractC45006mI4<T> abstractC45006mI4) {
        abstractC45006mI4.setRequestQueue(this);
        synchronized (this.f79861b) {
            this.f79861b.add(abstractC45006mI4);
        }
        abstractC45006mI4.setSequence(m41568d());
        abstractC45006mI4.addMarker("add-to-queue");
        m41567e(abstractC45006mI4, 0);
        m41570b(abstractC45006mI4);
        return abstractC45006mI4;
    }

    /* renamed from: b */
    public <T> void m41570b(AbstractC45006mI4<T> abstractC45006mI4) {
        if (!abstractC45006mI4.shouldCache()) {
            m41566f(abstractC45006mI4);
        } else {
            this.f79862c.add(abstractC45006mI4);
        }
    }

    /* renamed from: c */
    public <T> void m41569c(AbstractC45006mI4<T> abstractC45006mI4) {
        synchronized (this.f79861b) {
            this.f79861b.remove(abstractC45006mI4);
        }
        synchronized (this.f79869j) {
            for (InterfaceC20355b interfaceC20355b : this.f79869j) {
                interfaceC20355b.m41562a(abstractC45006mI4);
            }
        }
        m41567e(abstractC45006mI4, 5);
    }

    /* renamed from: d */
    public int m41568d() {
        return this.f79860a.incrementAndGet();
    }

    /* renamed from: e */
    public void m41567e(AbstractC45006mI4<?> abstractC45006mI4, int i) {
        synchronized (this.f79870k) {
            for (InterfaceC20354a interfaceC20354a : this.f79870k) {
                interfaceC20354a.m41563a(abstractC45006mI4, i);
            }
        }
    }

    /* renamed from: f */
    public <T> void m41566f(AbstractC45006mI4<T> abstractC45006mI4) {
        this.f79863d.add(abstractC45006mI4);
    }

    /* renamed from: g */
    public void m41565g() {
        m41564h();
        C39574d80 c39574d80 = new C39574d80(this.f79862c, this.f79863d, this.f79864e, this.f79866g);
        this.f79868i = c39574d80;
        c39574d80.start();
        for (int i = 0; i < this.f79867h.length; i++) {
            C73 c73 = new C73(this.f79863d, this.f79865f, this.f79864e, this.f79866g);
            this.f79867h[i] = c73;
            c73.start();
        }
    }

    /* renamed from: h */
    public void m41564h() {
        C73[] c73Arr;
        C39574d80 c39574d80 = this.f79868i;
        if (c39574d80 != null) {
            c39574d80.m44584d();
        }
        for (C73 c73 : this.f79867h) {
            if (c73 != null) {
                c73.m112877e();
            }
        }
    }

    public C40864fJ4(Y70 y70, InterfaceC49646u73 interfaceC49646u73, int i) {
        this(y70, interfaceC49646u73, i, new C33081Gh1(new Handler(Looper.getMainLooper())));
    }

    public C40864fJ4(Y70 y70, InterfaceC49646u73 interfaceC49646u73) {
        this(y70, interfaceC49646u73, 4);
    }
}
