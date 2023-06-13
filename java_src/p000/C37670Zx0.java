package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010,\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010*j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`+¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0014J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010%\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0014\u0010)\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006/"}, m28432d2 = {"LZx0;", "E", "Lj0;", "element", "", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "X", "Lrr5;", "select", "Y", "", "wasClosed", "", "T", "Ljs4;", "receive", "N", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "d0", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "f", "Ljava/lang/Object;", "value", "P", "()Z", "isBufferAlwaysEmpty", "Q", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "isEmpty", "", "g", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Zx0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37670Zx0<E> extends AbstractC24679j0<E> {

    /* renamed from: e */
    public final ReentrantLock f49507e;

    /* renamed from: f */
    public Object f49508f;

    public C37670Zx0(Function1<? super E, Unit> function1) {
        super(function1);
        this.f49507e = new ReentrantLock();
        this.f49508f = C25076k0.f93730a;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: N */
    public boolean mo23137N(AbstractC43569js4<? super E> abstractC43569js4) {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            return super.mo23137N(abstractC43569js4);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: P */
    public final boolean mo11167P() {
        return false;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: Q */
    public final boolean mo11166Q() {
        boolean z;
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            if (this.f49508f == C25076k0.f93730a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: T */
    public void mo23135T(boolean z) {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            UndeliveredElementException m72286d0 = m72286d0(C25076k0.f93730a);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.mo23135T(z);
            if (m72286d0 == null) {
                return;
            }
            throw m72286d0;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: X */
    public Object mo23134X() {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            Object obj = this.f49508f;
            C49885uX5 c49885uX5 = C25076k0.f93730a;
            if (obj == c49885uX5) {
                Object m29469k = m29469k();
                if (m29469k == null) {
                    m29469k = C25076k0.f93733d;
                }
                return m29469k;
            }
            this.f49508f = c49885uX5;
            Unit unit = Unit.INSTANCE;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: Y */
    public Object mo23133Y(InterfaceC48304rr5<?> interfaceC48304rr5) {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            Object obj = this.f49508f;
            C49885uX5 c49885uX5 = C25076k0.f93730a;
            if (obj == c49885uX5) {
                Object m29469k = m29469k();
                if (m29469k == null) {
                    m29469k = C25076k0.f93733d;
                }
                return m29469k;
            } else if (!interfaceC48304rr5.mo15172l()) {
                return C48896sr5.m13571d();
            } else {
                Object obj2 = this.f49508f;
                this.f49508f = c49885uX5;
                Unit unit = Unit.INSTANCE;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d0 */
    public final UndeliveredElementException m72286d0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f49508f;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != C25076k0.f93730a && (function1 = this.f93766b) != null) {
            undeliveredElementException = C47016ph3.m18972d(function1, obj2, null, 2, null);
        }
        this.f49508f = obj;
        return undeliveredElementException;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: g */
    public String mo23128g() {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f49508f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0, p000.InterfaceC44162ks4
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            return m31294S();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: t */
    public final boolean mo11165t() {
        return false;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: u */
    public final boolean mo11164u() {
        return false;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: w */
    public Object mo23127w(E e) {
        InterfaceC44755ls4<E> mo29475B;
        ReentrantLock reentrantLock = this.f49507e;
        reentrantLock.lock();
        try {
            C32180Cl0<?> m29469k = m29469k();
            if (m29469k != null) {
                return m29469k;
            }
            if (this.f49508f == C25076k0.f93730a) {
                do {
                    mo29475B = mo29475B();
                    if (mo29475B != null) {
                        if (mo29475B instanceof C32180Cl0) {
                            return mo29475B;
                        }
                        Intrinsics.checkNotNull(mo29475B);
                    }
                } while (mo29475B.mo26719g(e, null) == null);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                mo29475B.mo26720f(e);
                return mo29475B.mo26721a();
            }
            UndeliveredElementException m72286d0 = m72286d0(e);
            if (m72286d0 == null) {
                return C25076k0.f93731b;
            }
            throw m72286d0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
