package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC32027Bu0;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\r\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u001b\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f¨\u0006\u001e"}, m28432d2 = {"LBu0;", "N", "", "value", "", "k", "(LBu0;)Z", "", "b", "()V", "j", DateTokenConverter.CONVERTER_KEY, "()LBu0;", "next", "i", "()Z", "isTail", "f", "prev", "g", "removed", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "leftmostAliveNode", "h", "rightmostAliveNode", "<init>", "(LBu0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Bu0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC32027Bu0<N extends AbstractC32027Bu0<N>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3019a = AtomicReferenceFieldUpdater.newUpdater(AbstractC32027Bu0.class, Object.class, "_next");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3020b = AtomicReferenceFieldUpdater.newUpdater(AbstractC32027Bu0.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public AbstractC32027Bu0(N n) {
        this._prev = n;
    }

    /* renamed from: b */
    public final void m113384b() {
        f3020b.lazySet(this, null);
    }

    /* renamed from: c */
    public final N m113383c() {
        N m113380f = m113380f();
        while (m113380f != null && m113380f.mo80767g()) {
            m113380f = (N) m113380f._prev;
        }
        return m113380f;
    }

    /* renamed from: d */
    public final N m113382d() {
        C49885uX5 c49885uX5;
        Object m113381e = m113381e();
        c49885uX5 = C31793Au0.f1323a;
        if (m113381e == c49885uX5) {
            return null;
        }
        return (N) m113381e;
    }

    /* renamed from: e */
    public final Object m113381e() {
        return this._next;
    }

    /* renamed from: f */
    public final N m113380f() {
        return (N) this._prev;
    }

    /* renamed from: g */
    public abstract boolean mo80767g();

    /* renamed from: h */
    public final N m113379h() {
        N m113382d = m113382d();
        Intrinsics.checkNotNull(m113382d);
        while (m113382d.mo80767g()) {
            m113382d = (N) m113382d.m113382d();
            Intrinsics.checkNotNull(m113382d);
        }
        return m113382d;
    }

    /* renamed from: i */
    public final boolean m113378i() {
        return m113382d() == null;
    }

    /* renamed from: j */
    public final void m113377j() {
        while (true) {
            N m113383c = m113383c();
            N m113379h = m113379h();
            m113379h._prev = m113383c;
            if (m113383c != null) {
                m113383c._next = m113379h;
            }
            if (!m113379h.mo80767g() && (m113383c == null || !m113383c.mo80767g())) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final boolean m113376k(N n) {
        return C22859i1.m35391a(f3019a, this, null, n);
    }
}
