package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28432d2 = {"Lus5;", "Lts5;", "", C17296a.f69688o, "()Z", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "()V", "f", "LWc0;", "cont", "g", "(LWc0;)Z", "i", "h", "", "I", "permits", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: us5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50092us5 implements InterfaceC49499ts5 {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f113115c = AtomicReferenceFieldUpdater.newUpdater(C50092us5.class, Object.class, "head");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f113116d = AtomicLongFieldUpdater.newUpdater(C50092us5.class, "deqIdx");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f113117e = AtomicReferenceFieldUpdater.newUpdater(C50092us5.class, Object.class, "tail");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f113118f = AtomicLongFieldUpdater.newUpdater(C50092us5.class, "enqIdx");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f113119g = AtomicIntegerFieldUpdater.newUpdater(C50092us5.class, "_availablePermits");
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    public final int f113120a;

    /* renamed from: b */
    public final Function1<Throwable, Unit> f113121b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: us5$a */
    /* loaded from: classes8.dex */
    public static final class C29320a extends Lambda implements Function1<Throwable, Unit> {
        public C29320a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C50092us5.this.release();
        }
    }

    public C50092us5(int i, int i2) {
        boolean z;
        this.f113120a = i;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i2 < 0 || i2 > i) ? false : z2) {
                C51277ws5 c51277ws5 = new C51277ws5(0L, null, 2);
                this.head = c51277ws5;
                this.tail = c51277ws5;
                this._availablePermits = i - i2;
                this.f113121b = new C29320a();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    @Override // p000.InterfaceC49499ts5
    /* renamed from: a */
    public boolean mo9630a() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!f113119g.compareAndSet(this, i, i - 1));
        return true;
    }

    @Override // p000.InterfaceC49499ts5
    /* renamed from: b */
    public int mo9629b() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // p000.InterfaceC49499ts5
    /* renamed from: c */
    public Object mo9628c(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (f113119g.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object m9625f = m9625f(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m9625f == coroutine_suspended) {
            return m9625f;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public final Object m9625f(Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 m72854b = C37481Zc0.m72854b(intercepted);
        while (true) {
            if (!m9624g(m72854b)) {
                if (f113119g.getAndDecrement(this) > 0) {
                    m72854b.mo76767t(Unit.INSTANCE, this.f113121b);
                    break;
                }
            } else {
                break;
            }
        }
        Object m76770q = m72854b.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
        continue;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9624g(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        int i;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        Object m72403a;
        int i2;
        C49885uX5 c49885uX53;
        C49885uX5 c49885uX54;
        boolean z;
        AbstractC36442Uq5 abstractC36442Uq5 = (C51277ws5) this.tail;
        long andIncrement = f113118f.getAndIncrement(this);
        i = C50684vs5.f114834f;
        long j = andIncrement / i;
        do {
            AbstractC36442Uq5 abstractC36442Uq52 = abstractC36442Uq5;
            while (true) {
                if (abstractC36442Uq52.m80765m() >= j && !abstractC36442Uq52.mo80767g()) {
                    m72403a = C37612Zq5.m72403a(abstractC36442Uq52);
                    break;
                }
                Object m113381e = abstractC36442Uq52.m113381e();
                c49885uX5 = C31793Au0.f1323a;
                if (m113381e == c49885uX5) {
                    c49885uX52 = C31793Au0.f1323a;
                    m72403a = C37612Zq5.m72403a(c49885uX52);
                    break;
                }
                AbstractC36442Uq5 abstractC36442Uq53 = (AbstractC36442Uq5) ((AbstractC32027Bu0) m113381e);
                if (abstractC36442Uq53 == null) {
                    abstractC36442Uq53 = C50684vs5.m7879j(abstractC36442Uq52.m80765m() + 1, (C51277ws5) abstractC36442Uq52);
                    if (abstractC36442Uq52.m113376k(abstractC36442Uq53)) {
                        if (abstractC36442Uq52.mo80767g()) {
                            abstractC36442Uq52.m113377j();
                        }
                    }
                }
                abstractC36442Uq52 = abstractC36442Uq53;
            }
            if (!C37612Zq5.m72401c(m72403a)) {
                AbstractC36442Uq5 m72402b = C37612Zq5.m72402b(m72403a);
                while (true) {
                    AbstractC36442Uq5 abstractC36442Uq54 = (AbstractC36442Uq5) this.tail;
                    if (abstractC36442Uq54.m80765m() >= m72402b.m80765m()) {
                        break;
                    } else if (!m72402b.m80763p()) {
                        z = false;
                        continue;
                        break;
                    } else if (C22859i1.m35391a(f113117e, this, abstractC36442Uq54, m72402b)) {
                        if (abstractC36442Uq54.m80766l()) {
                            abstractC36442Uq54.m113377j();
                        }
                    } else if (m72402b.m80766l()) {
                        m72402b.m113377j();
                    }
                }
            } else {
                break;
            }
        } while (!z);
        C51277ws5 c51277ws5 = (C51277ws5) C37612Zq5.m72402b(m72403a);
        i2 = C50684vs5.f114834f;
        int i3 = (int) (andIncrement % i2);
        if (JS5.m100428a(c51277ws5.f116700e, i3, null, interfaceC36779Wc0)) {
            interfaceC36779Wc0.mo76794H(new C35375Qc0(c51277ws5, i3));
            return true;
        }
        c49885uX53 = C50684vs5.f114830b;
        c49885uX54 = C50684vs5.f114831c;
        if (!JS5.m100428a(c51277ws5.f116700e, i3, c49885uX53, c49885uX54)) {
            return false;
        }
        interfaceC36779Wc0.mo76767t(Unit.INSTANCE, this.f113121b);
        return true;
    }

    /* renamed from: h */
    public final boolean m9623h(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        Object mo76786X = interfaceC36779Wc0.mo76786X(Unit.INSTANCE, null, this.f113121b);
        if (mo76786X == null) {
            return false;
        }
        interfaceC36779Wc0.mo76800B(mo76786X);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0070, code lost:
        continue;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9622i() {
        int i;
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        Object m72403a;
        int i2;
        int i3;
        C49885uX5 c49885uX53;
        C49885uX5 c49885uX54;
        int i4;
        C49885uX5 c49885uX55;
        C49885uX5 c49885uX56;
        C49885uX5 c49885uX57;
        boolean z;
        AbstractC36442Uq5 abstractC36442Uq5 = (C51277ws5) this.head;
        long andIncrement = f113116d.getAndIncrement(this);
        i = C50684vs5.f114834f;
        long j = andIncrement / i;
        do {
            AbstractC36442Uq5 abstractC36442Uq52 = abstractC36442Uq5;
            while (true) {
                if (abstractC36442Uq52.m80765m() >= j && !abstractC36442Uq52.mo80767g()) {
                    m72403a = C37612Zq5.m72403a(abstractC36442Uq52);
                    break;
                }
                Object m113381e = abstractC36442Uq52.m113381e();
                c49885uX5 = C31793Au0.f1323a;
                if (m113381e == c49885uX5) {
                    c49885uX52 = C31793Au0.f1323a;
                    m72403a = C37612Zq5.m72403a(c49885uX52);
                    break;
                }
                AbstractC36442Uq5 abstractC36442Uq53 = (AbstractC36442Uq5) ((AbstractC32027Bu0) m113381e);
                if (abstractC36442Uq53 == null) {
                    abstractC36442Uq53 = C50684vs5.m7879j(abstractC36442Uq52.m80765m() + 1, (C51277ws5) abstractC36442Uq52);
                    if (abstractC36442Uq52.m113376k(abstractC36442Uq53)) {
                        if (abstractC36442Uq52.mo80767g()) {
                            abstractC36442Uq52.m113377j();
                        }
                    }
                }
                abstractC36442Uq52 = abstractC36442Uq53;
            }
            if (C37612Zq5.m72401c(m72403a)) {
                break;
            }
            AbstractC36442Uq5 m72402b = C37612Zq5.m72402b(m72403a);
            while (true) {
                AbstractC36442Uq5 abstractC36442Uq54 = (AbstractC36442Uq5) this.head;
                if (abstractC36442Uq54.m80765m() >= m72402b.m80765m()) {
                    break;
                } else if (!m72402b.m80763p()) {
                    z = false;
                    continue;
                    break;
                } else if (C22859i1.m35391a(f113115c, this, abstractC36442Uq54, m72402b)) {
                    if (abstractC36442Uq54.m80766l()) {
                        abstractC36442Uq54.m113377j();
                    }
                } else if (m72402b.m80766l()) {
                    m72402b.m113377j();
                }
            }
        } while (!z);
        C51277ws5 c51277ws5 = (C51277ws5) C37612Zq5.m72402b(m72403a);
        c51277ws5.m113384b();
        if (c51277ws5.m80765m() > j) {
            return false;
        }
        i3 = C50684vs5.f114834f;
        int i5 = (int) (andIncrement % i3);
        c49885uX53 = C50684vs5.f114830b;
        Object andSet = c51277ws5.f116700e.getAndSet(i5, c49885uX53);
        if (andSet == null) {
            i4 = C50684vs5.f114829a;
            for (i2 = 0; i2 < i4; i2++) {
                Object obj = c51277ws5.f116700e.get(i5);
                c49885uX57 = C50684vs5.f114831c;
                if (obj == c49885uX57) {
                    return true;
                }
            }
            c49885uX55 = C50684vs5.f114830b;
            c49885uX56 = C50684vs5.f114832d;
            return !JS5.m100428a(c51277ws5.f116700e, i5, c49885uX55, c49885uX56);
        }
        c49885uX54 = C50684vs5.f114833e;
        if (andSet == c49885uX54) {
            return false;
        }
        return m9623h((InterfaceC36779Wc0) andSet);
    }

    @Override // p000.InterfaceC49499ts5
    public void release() {
        boolean z;
        while (true) {
            int i = this._availablePermits;
            if (i < this.f113120a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (f113119g.compareAndSet(this, i, i + 1) && (i >= 0 || m9622i())) {
                    return;
                }
            } else {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f113120a).toString());
            }
        }
    }
}
